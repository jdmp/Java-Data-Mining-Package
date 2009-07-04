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

import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import org.jdmp.gui.module.ModuleGUIObject;
import org.ujmp.gui.actions.ExitAction;

public class ModuleActions extends ArrayList<JComponent> {

	private static final long serialVersionUID = 4780484608838892213L;

	public ModuleActions(JComponent c, ModuleGUIObject i) {
		this.add(new JMenuItem(new ScriptAction(c, i, "New Module", "Creates a new Module",
				"m=module")));
		this.add(new JSeparator());
		this.add(new JMenuItem(new ExitAction(c, i)));
	}
}
