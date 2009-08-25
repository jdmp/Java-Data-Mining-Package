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

package org.jdmp.gui.module;

import javax.swing.JComponent;
import javax.swing.JMenuBar;

import org.jdmp.gui.util.JDMPExamplesMenu;
import org.jdmp.gui.util.JDMPFileMenu;
import org.jdmp.gui.util.JDMPToolsMenu;

public class ModuleMenuBar extends JMenuBar {
	private static final long serialVersionUID = 4019937863391146452L;

	public ModuleMenuBar(JComponent component, ModuleGUIObject o) {
		add(new JDMPFileMenu(component, o));
		add(new ModuleMenu(component, o, null));
		add(new JDMPToolsMenu(component));
		add(new JDMPExamplesMenu(component));
		add(new ScriptExamplesMenu(component, o, null));
	}

}