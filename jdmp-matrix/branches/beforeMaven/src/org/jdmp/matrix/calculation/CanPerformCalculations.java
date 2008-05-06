package org.jdmp.matrix.calculation;

import org.jdmp.matrix.Matrix;
import org.jdmp.matrix.MatrixException;
import org.jdmp.matrix.calculation.Calculation.Calc;
import org.jdmp.matrix.calculation.Calculation.Ret;
import org.jdmp.matrix.calculation.basic.BasicCalculations;
import org.jdmp.matrix.calculation.entrywise.EntrywiseCalculations;
import org.jdmp.matrix.calculation.general.GeneralCalculations;

/**
 * <p>
 * This interface declares many methods for performing calculations on a matrix.
 * Generally, there are three types of calculations:
 * <ul>
 * <li>Standard calculations such as <code>sum</code> or <code>plus</code>.</li>
 * <li>Advanced calculations.</li>
 * <li>Own implementations of calculations.</li>
 * </ul>
 * </p>
 * 
 * </p>
 * Standard calculations are very easy to use, since these calculations can be
 * directly used by calling the methods explicitely. E.g. for calculating the
 * mean of a matrix, the method <code>mean</code> can be used. More advanced
 * calculations are available by using the <code>calc</code> methods. The
 * calculation to call can be either given by a String (containing the name of
 * the calculation) or the corresponding enum from {@link Calculcation.Calc}.
 * </p>
 * 
 * <p>
 * Own calculations can be implemented by implementing the interface
 * {@link Calculation} and using the the method <code>calc<code>.
 * </p>
 * 
 * 
 * 
 * @see Calculation.Calc for available calculations
 * @author Holger Arndt
 *
 */
public interface CanPerformCalculations extends BasicCalculations, EntrywiseCalculations, GeneralCalculations {

	public Matrix calcNew(Calculation calculation) throws MatrixException;

	public Matrix calc(Calculation calculation, Ret returnType) throws MatrixException;

	public Matrix calcNew(String calculation, Matrix... matrices) throws MatrixException;

	public Matrix calcNew(String calculation, int dimension, Matrix... matrices) throws MatrixException;

	public Matrix calc(String calculation, Ret returnType, Matrix... matrices) throws MatrixException;

	public Matrix calc(String calculation, Ret returnType, int dimension, Matrix... matrices) throws MatrixException;

	public Matrix calcNew(Calc calculation, Matrix... matrices) throws MatrixException;

	public Matrix calcNew(Calc calculation, int dimension, Matrix... matrices) throws MatrixException;

	public Matrix calc(Calc calculation, Ret returnType, Matrix... matrices) throws MatrixException;

	public Matrix calc(Calc calculation, Ret returnType, int dimension, Matrix... matrices) throws MatrixException;

}