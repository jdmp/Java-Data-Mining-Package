package org.jdmp.gui.matrix.actions;

import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import org.jdmp.core.matrix.MatrixGUIObject;
import org.jdmp.matrix.calculation.Calculation.Ret;
import org.jdmp.matrix.exceptions.MatrixException;
import org.jdmp.matrix.interfaces.HasMatrixList;

public class StandardizeAction extends MatrixAction {
	private static final long serialVersionUID = -1119142691820061993L;

	public StandardizeAction(JComponent c, MatrixGUIObject m, HasMatrixList v) {
		super(c, m, v);
		putValue(Action.NAME, "Standardize");
		putValue(Action.SHORT_DESCRIPTION, "Rescales all entries to mean 0 and standard deviation 1");
		putValue(Action.MNEMONIC_KEY, KeyEvent.VK_N);
		putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, 0));
	}

	@Override
	public Object call() throws MatrixException {
		getMatrixObject().getMatrix().standardize(Ret.ORIG, getDimension(), true);
		return null;
	}

}
