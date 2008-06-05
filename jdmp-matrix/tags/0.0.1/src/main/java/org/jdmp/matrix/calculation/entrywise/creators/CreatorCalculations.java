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

package org.jdmp.matrix.calculation.entrywise.creators;

import org.jdmp.matrix.Matrix;
import org.jdmp.matrix.exceptions.MatrixException;

public interface CreatorCalculations {

	/**
	 * Returns a matrix with equal size, where all entries are set to zero.
	 * 
	 * @return Matrix with zeros.
	 */
	public Matrix zeros() throws MatrixException;

	/**
	 * Returns a matrix with equal size, where all entries are set to 1.0.
	 * 
	 * @return Matrix with ones.
	 */
	public Matrix ones() throws MatrixException;

	/**
	 * Returns a matrix with equal size, where all entries are set to uniform
	 * random values between 0.0 and 1.0.
	 * 
	 * @return Matrix with uniformly distributed values.
	 */
	public Matrix rand() throws MatrixException;

	/**
	 * Returns a matrix with equal size, where all entries are set to random
	 * values which are normally distributed with 0.0 mean and 1.0 standard
	 * deviation.
	 * 
	 * @return Matrix with normally distributed values.
	 */
	public Matrix randn() throws MatrixException;

	/**
	 * Returns a matrix with equal size, where all entries are set to a desired
	 * value.
	 * 
	 * @param value
	 *            fill with this value
	 * @return Matrix with ones.
	 */
	public Matrix fill(double value) throws MatrixException;

	/**
	 * Returns a matrix with ones at the diagonal.
	 * 
	 * @return Eye matrix with ones at the diagonal
	 */
	public Matrix eye() throws MatrixException;

}