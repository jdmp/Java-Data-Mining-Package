package org.jdmp.core.dataset;

import java.io.File;
import java.io.IOException;

import javax.swing.event.EventListenerList;

import org.jdmp.core.matrix.wrappers.DataSetInputMatrixWrapper;
import org.jdmp.core.sample.DefaultSample;
import org.jdmp.core.variable.Variable;
import org.jdmp.matrix.Matrix;
import org.jdmp.matrix.Matrix.Format;
import org.jdmp.matrix.calculation.Calculation.Ret;
import org.jdmp.matrix.collections.DefaultMatrixList;
import org.jdmp.matrix.collections.MatrixList;
import org.jdmp.matrix.exceptions.MatrixException;
import org.jdmp.matrix.io.ExportMatrix;

public class BasicDataSet extends AbstractDataSet {
	private static final long serialVersionUID = -2887879051530049677L;

	private transient EventListenerList listenerList = null;

	public final EventListenerList getListenerList() {
		if (listenerList == null) {
			listenerList = new EventListenerList();
		}
		return listenerList;
	}

	private String label = "";

	private String description = "";

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public String getLabel() {
		return label;
	}

	public final void setLabel(String label) {
		this.label = label;
	}

	protected Matrix inputMatrix = null;

	protected MatrixList matrixList = null;

	public BasicDataSet(Variable v) {
		this(v.getLabel());
		for (Matrix m : v.getMatrixList()) {
			DefaultSample s = new DefaultSample(m);
			addSample(s);
		}
	}

	public BasicDataSet(String label) {
		super(label);
	}

	public BasicDataSet() {
		super();
	}

	public DefaultSample getSample(int pos) {
		return (DefaultSample) super.getSample(pos);
	}

	public final void standardize(int dimension) throws MatrixException {
		getInputMatrix().standardize(Ret.ORIG, dimension, true);
	}

	public final void center(int dimension) throws MatrixException {
		getInputMatrix().center(Ret.ORIG, dimension, true);
	}

	public final Matrix getInputMatrix() {
		if (inputMatrix == null) {
			inputMatrix = new DataSetInputMatrixWrapper(this);
		}
		return inputMatrix;
	}

	public MatrixList getMatrixList() {
		if (matrixList == null) {
			matrixList = new DefaultMatrixList();
			matrixList.add(getInputMatrix());
		}
		return matrixList;
	}

	public final String toCSV() throws MatrixException, IOException {
		return ExportMatrix.toString(Format.CSV, this.getInputMatrix());
	}

	public final void exportToCSV(File file) throws MatrixException, IOException {
		ExportMatrix.toFile(Format.CSV, file, this.getInputMatrix());
	}

}
