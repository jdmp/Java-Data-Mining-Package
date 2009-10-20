/*
 * Copyright (C) 2008-2009 by Holger Arndt
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

import org.jdmp.core.module.HasModuleList;
import org.jdmp.core.module.Module;
import org.jdmp.core.module.ModuleFactory;
import org.ujmp.core.interfaces.GUIObject;
import org.ujmp.gui.actions.ObjectAction;

public class NewEmptyModuleAction extends ObjectAction {
	private static final long serialVersionUID = -7138267828869404341L;

	public NewEmptyModuleAction(JComponent c, GUIObject o) {
		super(c, o);
		putValue(Action.NAME, "Empty Module");
		putValue(Action.SHORT_DESCRIPTION, "Create a new Module");
		putValue(Action.MNEMONIC_KEY, KeyEvent.VK_M);
		putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_M,
				KeyEvent.ALT_DOWN_MASK));
	}

	
	public Object call() {
		Module m = ModuleFactory.emptyModule();
		if (getCoreObject() instanceof HasModuleList) {
			try {
				((HasModuleList) getCoreObject()).getModules().add(m);
			} catch (Exception e) {
				m.showGUI();
			}
		} else {
			m.showGUI();
		}
		return m;
	}
}
