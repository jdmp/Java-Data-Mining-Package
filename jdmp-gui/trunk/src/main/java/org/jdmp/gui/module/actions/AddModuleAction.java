/*
 * Copyright (C) 2008-2009 Holger Arndt, A. Naegele and M. Bundschus
 *
 * This file is part of the Java Data Mining Package (JDMP).
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership and licensing.
 *
 * JDMP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * JDMP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with JDMP; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.jdmp.gui.module.actions;

import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import org.jdmp.core.module.DefaultModule;
import org.jdmp.core.module.HasModuleList;
import org.jdmp.core.module.Module;

public class AddModuleAction extends ModuleListAction {
	private static final long serialVersionUID = -7138267828869404341L;

	private Module module = null;

	public AddModuleAction(JComponent c, HasModuleList i, Module m) {
		this(c, i);
		module = m;
	}

	public AddModuleAction(JComponent c, HasModuleList i) {
		super(c, i);
		putValue(Action.NAME, "Add Module");
		putValue(Action.SHORT_DESCRIPTION, "Add a new Module");
		putValue(Action.MNEMONIC_KEY, KeyEvent.VK_M);
		putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_M, 0));
	}

	@Override
	public Object call() {
		if (module == null) {
			module = new DefaultModule();
		}
		getIModules().getModules().add(module);
		return module;
	}

}
