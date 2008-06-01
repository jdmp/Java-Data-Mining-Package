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

package org.jdmp.matrix.calculation;

import java.io.Serializable;

import org.jdmp.matrix.Matrix;
import org.jdmp.matrix.MatrixException;

/**
 * Interface for all matrix-calculations. 
 *
 * 
 * 
 * @author Andreas Naegele
 * @version $Revision$
 */
public interface Calculation extends Serializable {

	public static final int ALL = Matrix.ALL;

	public static final int NONE = Matrix.NONE;

	public static final int ROW = Matrix.ROW;

	public static final int COLUMN = Matrix.COLUMN;

	public enum Ret {
		NEW, LINK, ORIG
	};

	public enum Calc {
		CLONE, ZEROS, ONES, EYE, FILL, ROUND, CEIL, FLOOR, RAND, RANDN, ABS, LOG, MAX, MIN, MINUS, PLUS, SUM, TRANSPOSE, TIMES, MTIMES, DIVIDE, POWER, SIGN, SQRT, SIN, COS, TAN, SINH, COSH, TANH
	};

	public Matrix calc(Ret returnType) throws MatrixException;

	public Matrix calcNew() throws MatrixException;

	public Matrix calcLink() throws MatrixException;

	public Matrix calcOrig() throws MatrixException;

}
