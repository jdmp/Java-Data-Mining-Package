package org.jdmp.core.dataset;

import java.util.Collection;
import java.util.List;

import org.jdmp.core.CoreObject;
import org.jdmp.core.sample.HasSampleList;
import org.jdmp.core.sample.Sample;
import org.jdmp.core.variable.HasVariableMap;
import org.jdmp.core.variable.Variable;
import org.jdmp.core.variable.VariableListener;
import org.ujmp.core.Matrix;
import org.ujmp.core.interfaces.HasMatrixList;

public interface DataSet extends CoreObject, HasVariableMap, HasSampleList, HasMatrixList {

	public void setVariable(int index, Variable v);

	public void addVariableListener(VariableListener l);

	public void removeVariableListener(VariableListener l);

	public Matrix getMatrixFromVariable(int variableIndex);

	public Matrix getMatrixFromVariable(int variableIndex, int matrixIndex);

	public void addMatrixForVariable(int variableIndex, Matrix matrix);

	public void setMatrixForVariable(int variableIndex, int matrixIndex, Matrix matrix);

	public void addDataSetListener(DataSetListener l);

	public void removeDataSetListener(DataSetListener l);

	public void clear();

	public List<DataSet> splitByCount(boolean shuffle, int... count);

	public List<DataSet> splitForCV(int numberOfCVSets, int idOfCVSet, long randomSeed);

	public void addAllSamples(Collection<Sample> samples);

	public List<DataSet> splitByPercent(boolean shuffle, double... percent);

	public void removeAllSamples();
}
