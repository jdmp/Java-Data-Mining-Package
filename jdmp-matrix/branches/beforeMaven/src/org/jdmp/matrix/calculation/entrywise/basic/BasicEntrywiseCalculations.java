package org.jdmp.matrix.calculation.entrywise.basic;

import org.jdmp.matrix.Matrix;
import org.jdmp.matrix.MatrixException;
import org.jdmp.matrix.calculation.Calculation.Ret;

public interface BasicEntrywiseCalculations {

	/**
	 * Calculates the absolute values of all entries in a Matrix. Positive
	 * values stay the same, negative values change sign.
	 * 
	 * @param returnType
	 *            Select whether a new or a linked Matrix is returned, or if the
	 *            operation is performed on the original Matrix
	 * @return A new Matrix with absolute values.
	 */
	public Matrix abs(Ret returnType) throws MatrixException;

	/**
	 * Calculates the logarithm with basis 2 of all entries in the Matrix.
	 * 
	 * @param returnType
	 *            Select whether a new or a linked Matrix is returned, or if the
	 *            operation is performed on the original Matrix
	 * @return Matrix with logarithm values.
	 */
	public Matrix log2(Ret returnType) throws MatrixException;

	/**
	 * Calculates the logarithm with basis 10 of all entries in the Matrix.
	 * 
	 * @param returnType
	 *            Select whether a new or a linked Matrix is returned, or if the
	 *            operation is performed on the original Matrix
	 * @return Matrix with logarithm values.
	 */
	public Matrix log10(Ret returnType) throws MatrixException;

	/**
	 * Calculates the natural logarithm of all entries in the Matrix.
	 * 
	 * @param returnType
	 *            Select whether a new or a linked Matrix is returned, or if the
	 *            operation is performed on the original Matrix
	 * @return Matrix with logarithm values.
	 */
	public Matrix log(Ret returnType) throws MatrixException;

	/**
	 * Calculates the sign of the entries in a Matrix. For values greater than
	 * zero, 1.0 is returned. Negative values will give -1.0 as return value.
	 * 0.0 is returned for entries equal to zero.
	 * 
	 * @param returnType
	 *            Select whether a new or a linked Matrix is returned, or if the
	 *            operation is performed on the original Matrix
	 * @return Matrix with signum values
	 */
	public Matrix sign(Ret returnType) throws MatrixException;

	/**
	 * Calculates the square root of all the entries in a Matrix.
	 * 
	 * @param returnType
	 *            Select whether a new or a linked Matrix is returned, or if the
	 *            operation is performed on the original Matrix
	 * @return Matrix containing the square roots of all entries
	 */
	public Matrix sqrt(Ret returnType) throws MatrixException;

	/**
	 * Calculates this matrix to the power of the given matrix (entrywise).
	 * 
	 * @param returnType
	 *            Select whether a new or a linked Matrix is returned, or if the
	 *            operation is performed on the original Matrix
	 * @param matrix
	 *            the second matrix
	 * @return matrix with all entries to the power of the second matrix's
	 *         entry.
	 */
	public Matrix power(Ret returnType, Matrix power) throws MatrixException;

	/**
	 * Calculates this matrix to the power of the given value (entrywise).
	 * 
	 * @param returnType
	 *            Select whether a new or a linked Matrix is returned, or if the
	 *            operation is performed on the original Matrix
	 * @param value
	 *            power factor
	 * @return Matrix with all entries to the power of factor.
	 */
	public Matrix power(Ret returnType, double power) throws MatrixException;

}