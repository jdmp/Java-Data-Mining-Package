package org.jdmp.core.sample;

import org.jdmp.core.util.ObservableMap;
import org.jdmp.core.variable.Variable;
import org.jdmp.core.variable.VariableFactory;
import org.ujmp.core.Matrix;

public class DefaultSample extends AbstractSample {
	private static final long serialVersionUID = -3649758882404748630L;

	private final ObservableMap<Variable> variableMap = new ObservableMap<Variable>();

	private String label = "";

	private String description = "";

	public ObservableMap<Variable> getVariableList() {
		return variableMap;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public String getLabel() {
		return label;
	}

	public final void setLabel(String label) {
		this.label = label;
	}

	public DefaultSample(Matrix m) {
		this(m.getLabel());
		setMatrix(INPUT, m);
	}

	public DefaultSample(String label) {
		super(label);
	}

	public DefaultSample() {
		super();
	}

	public DefaultSample clone() {
		DefaultSample s = new DefaultSample();
		Matrix input = getMatrix(INPUT);
		if (input != null) {
			s.setMatrix(INPUT, input);
		}
		Matrix target = getMatrix(TARGET);
		if (target != null) {
			s.setMatrix(TARGET, target);
		}
		return s;
	}

	public void setMatrix(Object variableKey, Matrix matrix) {
		Variable v = getVariableList().get(variableKey);
		if (v == null) {
			v = VariableFactory.labeledVariable(variableKey.toString());
			getVariableList().put(variableKey, v);
		}
		v.addMatrix(matrix);
	}

	@Override
	public void clear() {
		variableMap.clear();
	}

}
