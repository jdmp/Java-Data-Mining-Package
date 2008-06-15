package org.jdmp.core.sample;

import org.jdmp.core.CoreObject;
import org.jdmp.core.algorithm.regression.Regressor;
import org.jdmp.core.variable.HasVariableMap;
import org.jdmp.matrix.Matrix;

public interface Sample extends CoreObject, HasVariableMap {

	public static final Object INPUT = Regressor.INPUT;

	public static final Object WEIGHT = Regressor.WEIGHT;

	public Sample clone();

	public Matrix getMatrix(Object variableKey);

	public void setMatrix(Object variableKey, Matrix matrix);

}
