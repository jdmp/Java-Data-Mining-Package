package org.jdmp.matrix.calculation.basic;

import org.jdmp.matrix.Matrix;
import org.jdmp.matrix.MatrixException;
import org.jdmp.matrix.MatrixFactory;
import org.jdmp.matrix.calculation.DoubleCalculation;
import org.jdmp.matrix.util.MathUtil;

public class Plus extends DoubleCalculation {
	private static final long serialVersionUID = -2670849261944345597L;

	private boolean ignoreNaN = false;

	public Plus(boolean ignoreNaN, Matrix m1, Matrix m2) {
		super(m1, m2);
		this.ignoreNaN = ignoreNaN;
	}

	public Plus(boolean ignoreNaN, Matrix m1, double v2) throws MatrixException {
		super(m1, MatrixFactory.fill(v2, m1.getSize()));
		this.ignoreNaN = ignoreNaN;
	}

	@Override
	public double getDouble(long... coordinates) throws MatrixException {
		return ignoreNaN ? MathUtil.ignoreNaN(getSources()[0].getDouble(coordinates))
				+ MathUtil.ignoreNaN(getSources()[1].getDouble(coordinates)) : getSources()[0].getDouble(coordinates)
				+ getSources()[1].getDouble(coordinates);
	}

	public static Matrix calc(boolean ignoreNaN, Matrix m1, Matrix m2) throws MatrixException {
		Matrix ret = MatrixFactory.zeros(m1.getSize());
		if (ignoreNaN) {
			for (long[] c : m2.availableCoordinates()) {
				ret.setDouble(MathUtil.ignoreNaN(m1.getDouble(c)) + MathUtil.ignoreNaN(m2.getDouble(c)), c);
			}
		} else {
			for (long[] c : m2.availableCoordinates()) {
				ret.setDouble(m1.getDouble(c) + m2.getDouble(c), c);
			}
		}
		return ret;
	}

	public static Matrix calc(boolean ignoreNaN, Matrix m1, double v2) throws MatrixException {
		Matrix ret = MatrixFactory.zeros(m1.getSize());
		v2 = ignoreNaN ? MathUtil.ignoreNaN(v2) : v2;
		if (ignoreNaN) {
			for (long[] c : m1.allCoordinates()) {
				ret.setDouble(MathUtil.ignoreNaN(m1.getDouble(c)) + v2, c);
			}
		} else {
			for (long[] c : m1.allCoordinates()) {
				ret.setDouble(m1.getDouble(c) + v2, c);
			}
		}
		return ret;
	}
}