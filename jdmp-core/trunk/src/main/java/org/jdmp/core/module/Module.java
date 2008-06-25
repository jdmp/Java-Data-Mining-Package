package org.jdmp.core.module;

import org.jdmp.core.CoreObject;
import org.jdmp.core.algorithm.HasAlgorithms;
import org.jdmp.core.dataset.HasDataSets;
import org.jdmp.core.variable.HasVariableList;

public interface Module extends CoreObject, HasModuleList, HasAlgorithms, HasVariableList, HasDataSets {

	public void clear();

}
