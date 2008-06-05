/*
 * Copyright (C) 2008 Holger Arndt, Andreas Naegele and Markus Bundschus
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

package org.jdmp.matrix.calculation.general.statistical;

import org.jdmp.matrix.Matrix;
import org.jdmp.matrix.calculation.AbstractDoubleCalculation;
import org.jdmp.matrix.exceptions.MatrixException;
import org.jdmp.matrix.util.MathUtil;

public class Sum extends AbstractDoubleCalculation {
	private static final long serialVersionUID = 1070433312716157660L;

	boolean ignoreNaN = false;

	public Sum(int dimension, boolean ignoreNaN, Matrix matrix) {
		super(dimension, matrix);
		this.ignoreNaN = ignoreNaN;
	}

	public double getDouble(long... coordinates) throws MatrixException {
		double sum = 0;

		if (ignoreNaN) {

			switch (getDimension()) {
			case ROW:
				for (long r = getSource().getSize()[ROW] - 1; r != -1; r--) {
					sum += MathUtil.ignoreNaN(getSource().getDouble(r, coordinates[COLUMN]));
				}
				return sum;
			case COLUMN:
				for (long c = getSource().getSize()[COLUMN] - 1; c != -1; c--) {
					sum += MathUtil.ignoreNaN(getSource().getDouble(coordinates[ROW], c));
				}
				return sum;
			case ALL:
				for (long r = getSource().getSize()[ROW] - 1; r != -1; r--) {
					for (long c = getSource().getSize()[COLUMN] - 1; c != -1; c--) {
						sum += MathUtil.ignoreNaN(getSource().getDouble(r, c));
					}
				}
				return sum;
			default:
				return 0.0;
			}
		} else {
			switch (getDimension()) {
			case ROW:
				for (long r = getSource().getSize()[ROW] - 1; r != -1; r--) {
					sum += getSource().getDouble(r, coordinates[COLUMN]);
				}
				return sum;
			case COLUMN:
				for (long c = getSource().getSize()[COLUMN] - 1; c != -1; c--) {
					sum += getSource().getDouble(coordinates[ROW], c);
				}
				return sum;
			case ALL:
				for (long r = getSource().getSize()[ROW] - 1; r != -1; r--) {
					for (long c = getSource().getSize()[COLUMN] - 1; c != -1; c--) {
						sum += getSource().getDouble(r, c);
					}
				}
				return sum;
			default:
				return 0.0;
			}
		}

	}

	public long[] getSize() {
		switch (getDimension()) {
		case ROW:
			return new long[] { 1, getSource().getSize()[COLUMN] };
		case COLUMN:
			return new long[] { getSource().getSize()[ROW], 1 };
		case ALL:
			return new long[] { 1, 1 };
		}
		return null;
	}

}