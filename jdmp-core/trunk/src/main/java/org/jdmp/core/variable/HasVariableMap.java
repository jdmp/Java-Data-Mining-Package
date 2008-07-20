package org.jdmp.core.variable;

import org.jdmp.core.util.ObservableMap;
import org.ujmp.core.Matrix;

public interface HasVariableMap extends HasVariables {

	public ObservableMap<Variable> getVariableList();

	public Matrix getMatrix(Object variableKey);

	public void setMatrix(Object variableKey, Matrix matrix);

}
