/*
 * Copyright (C) 2008-2009 Holger Arndt, A. Naegele and M. Bundschus
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

package org.jdmp.core.algorithm;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jdmp.core.AbstractCoreObject;
import org.jdmp.core.util.DefaultObservableMap;
import org.jdmp.core.variable.Variable;
import org.jdmp.core.variable.VariableFactory;
import org.ujmp.core.Matrix;
import org.ujmp.core.MatrixFactory;
import org.ujmp.core.interfaces.GUIObject;
import org.ujmp.core.util.MathUtil;

public abstract class AbstractAlgorithm extends AbstractCoreObject implements Algorithm {

	protected static transient Logger logger = Logger.getLogger(Algorithm.class.getName());

	private transient GUIObject guiObject = null;

	private final DefaultObservableMap<Variable> variableMap = new DefaultObservableMap<Variable>();

	private final DefaultObservableMap<Algorithm> algorithmList = new DefaultObservableMap<Algorithm>();

	private final Map<Object, String> edgeLabels = new HashMap<Object, String>();

	private final Map<Object, EdgeDirection> edgeDirections = new HashMap<Object, EdgeDirection>();

	private final List<Object> variableKeys = new ArrayList<Object>();

	private String label = "";

	private String description = "";

	public final void setEdgeLabel(Object key, String edgeLabel) {
		edgeLabels.put(key, edgeLabel);
	}

	public final void addVariableKey(Object key) {
		variableKeys.add(key);
	}

	public void setVariables(Variable... variables) {
		for (int i = 0; i < variables.length && i < getVariableKeys().size(); i++) {
			variableMap.put(variableKeys.get(i), variables[i]);
		}
	}

	public final List<Object> getVariableKeys() {
		return variableKeys;
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

	public AbstractAlgorithm() {
		super();
		setLabel(getClass().getSimpleName());
	}

	public final void setEdgeDirection(Object key, EdgeDirection direction) {
		edgeDirections.put(key, direction);
	}

	public void setVariable(Object index, Variable variable) {
		variableMap.put(index, variable);
	}

	public final void setAlgorithm(Object index, Algorithm a) {
		algorithmList.put(index, a);
	}

	public void clear() {
		algorithmList.clear();
		variableMap.clear();
	}

	public final Map<Object, Object> calculate() throws Exception {
		Map<Object, Object> input = new HashMap<Object, Object>();

		for (Object v : getInputKeys()) {
			input.put(v, getMatrixFromVariable(v));
		}

		Map<Object, Object> output = calculateObjects(input);

		for (Object v : getOutputKeys()) {
			setMatrix(v, MathUtil.getMatrix(output.get(v)));
		}

		return output;
	}

	public final List<Object> getInputKeys() {
		List<Object> inputKeys = new ArrayList<Object>();
		for (Object v : getVariableKeys()) {
			if (EdgeDirection.Incoming.equals(getEdgeDirection(v))
					|| EdgeDirection.Bidirectional.equals(getEdgeDirection(v))) {
				inputKeys.add(v);
			}
		}
		return inputKeys;
	}

	public final List<Object> getOutputKeys() {
		List<Object> outputKeys = new ArrayList<Object>();
		for (Object v : getVariableKeys()) {
			if (EdgeDirection.Outgoing.equals(getEdgeDirection(v))
					|| EdgeDirection.Bidirectional.equals(getEdgeDirection(v))) {
				outputKeys.add(v);
			}
		}
		return outputKeys;
	}

	public final Map<Object, Object> calculate(Matrix... input) throws Exception {
		return calculate(Arrays.asList(input));
	}

	public final Map<Object, Object> calculateObjects(Object... input) throws Exception {
		return calculateObjects(Arrays.asList(input));
	}

	public final Map<Object, Object> calculate(double... input) throws Exception {
		List<Matrix> inputA = new LinkedList<Matrix>();
		for (int i = 0; i < input.length; i++) {
			inputA.add(MatrixFactory.linkToValue(input[i]));
		}
		return calculate(inputA);
	}

	public final Map<Object, Object> calculate(List<Matrix> matrices) throws Exception {
		Map<Object, Object> map = new HashMap<Object, Object>();
		List<Object> keys = getInputKeys();
		for (int i = 0; i < matrices.size(); i++) {
			Object key = keys.get(i);
			map.put(key, matrices.get(i));
		}
		return calculateObjects(map);
	}

	public final Map<Object, Object> calculateObjects(List<Object> matrices) throws Exception {
		Map<Object, Object> map = new HashMap<Object, Object>();
		List<Object> keys = getInputKeys();
		for (int i = 0; i < matrices.size(); i++) {
			Object key = keys.get(i);
			map.put(key, matrices.get(i));
		}
		return calculateObjects(map);
	}

	// this is not the best way
	public Map<Object, Object> calculateObjects(Map<Object, Object> objects) throws Exception {
		Map<Object, Object> result = new HashMap<Object, Object>();
		return result;
	}

	public final EdgeDirection getEdgeDirection(Object key) {
		return edgeDirections.get(key);
	}

	public final Matrix getMatrixFromVariable(Object variableIndex) {
		Variable v = variableMap.get(variableIndex);
		if (v == null)
			return null;
		else
			return v.getMatrix();
	}

	public Matrix getMatrix(Object variableKey) {
		Variable v = getVariables().get(variableKey);
		if (v != null) {
			return v.getMatrix();
		} else {
			return null;
		}
	}

	public void setMatrix(Object variableKey, Matrix matrix) {
		Variable v = getVariables().get(variableKey);
		if (v == null) {
			v = VariableFactory.labeledVariable(variableKey.toString());
			getVariables().put(variableKey, v);
		}
		v.addMatrix(matrix);
	}

	public final DefaultObservableMap<Variable> getVariables() {
		return variableMap;
	}

	public final DefaultObservableMap<Algorithm> getAlgorithms() {
		return algorithmList;
	}

	public final String getEdgeLabel(Object key) {
		return edgeLabels.get(key);
	}

	public final GUIObject getGUIObject() {
		if (guiObject == null) {
			try {
				Class<?> c = Class.forName("org.jdmp.gui.algorithm.AlgorithmGUIObject");
				Constructor<?> con = c.getConstructor(new Class<?>[] { Algorithm.class });
				guiObject = (GUIObject) con.newInstance(new Object[] { this });
			} catch (Exception e) {
				logger.log(Level.WARNING, "cannot create sample gui object", e);
			}
		}
		return guiObject;
	}

	@Override
	public final String toString() {
		if (getLabel() == null) {
			return getClass().getSimpleName();
		} else {
			return getClass().getSimpleName() + " [" + getLabel() + "]";
		}
	}

	public void notifyGUIObject() {
		guiObject.fireValueChanged();
	}

}
