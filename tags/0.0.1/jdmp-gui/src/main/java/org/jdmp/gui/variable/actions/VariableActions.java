package org.jdmp.gui.variable.actions;

import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

import org.jdmp.core.variable.Variable;
import org.jdmp.gui.actions.ExitAction;
import org.jdmp.gui.actions.ObjectActions;

public class VariableActions extends ObjectActions {
	private static final long serialVersionUID = 8087631357836093790L;

	public VariableActions(JComponent c, Variable v) {
		super(c, v);
		this.add(new JMenuItem(new LoadWKNAction(c, v)));
		this.add(new JMenuItem(new FillUniformAction(c, v)));
		this.add(new JMenuItem(new FillGaussianAction(c, v)));
		this.add(new JMenuItem(new FillWithValueAction(c, v)));
		this.add(new JMenuItem(new DivideAction(c, v)));

		this.add(new JSeparator());
		this.add(new JMenuItem(new ExitAction(c, v)));
	}

}
