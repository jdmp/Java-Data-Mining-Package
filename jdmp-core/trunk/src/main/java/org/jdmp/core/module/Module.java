package org.jdmp.core.module;

import org.jdmp.core.CoreObject;
import org.jdmp.core.algorithm.HasAlgorithms;
import org.jdmp.core.dataset.HasDataSets;
import org.jdmp.core.util.interfaces.HasAlgorithmsAndVariables;
import org.jdmp.core.variable.HasVariables;

public interface Module extends CoreObject, HasAlgorithmsAndVariables, HasModules, HasAlgorithms,
		HasVariables, HasDataSets {

	public void addModuleListener(ModuleListener l);

	public void removeModuleListener(ModuleListener l);

	public void clear();
}
