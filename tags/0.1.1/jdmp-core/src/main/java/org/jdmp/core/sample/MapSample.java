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

package org.jdmp.core.sample;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import javax.swing.AbstractListModel;

import org.jdmp.core.util.DefaultObservableMap;
import org.jdmp.core.util.ObservableList;
import org.jdmp.core.util.ObservableMap;
import org.jdmp.core.variable.AbstractVariable;
import org.jdmp.core.variable.Variable;
import org.jdmp.core.variable.VariableFactory;
import org.ujmp.core.Matrix;
import org.ujmp.core.coordinates.Coordinates;
import org.ujmp.core.exceptions.MatrixException;
import org.ujmp.core.interfaces.Wrapper;
import org.ujmp.core.util.MathUtil;

public class MapSample extends AbstractSample implements Wrapper<Map<?, ?>> {
	private static final long serialVersionUID = -8219872482909787192L;

	private VariableMapWrapper variableMapWrapper = null;

	private Map<?, ?> map = null;

	public MapSample(Map<?, ?> map) {
		this.map = map;
	}

	@Override
	public final MapSample clone() {
		MapSample s = null;
		try {
			s = this.getClass().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Object k : getVariables().keySet()) {
			Variable v = getVariables().get(k);
			s.getVariables().put(k, v.clone());
		}
		return s;
	}

	@Override
	public ObservableMap<Variable> getVariables() {
		if (variableMapWrapper == null) {
			variableMapWrapper = new VariableMapWrapper(map);
		}
		return variableMapWrapper;
	}

	public void setMatrix(Object variableKey, Matrix matrix) {
		Variable v = getVariables().get(variableKey);
		if (v == null) {
			v = VariableFactory.labeledVariable(variableKey.toString());
			getVariables().put(variableKey, v);
		}
		v.addMatrix(matrix);
	}

	class VariableMapWrapper extends DefaultObservableMap<Variable> {
		private static final long serialVersionUID = 1252960592502010150L;

		public VariableMapWrapper(Map<?, ?> map) {
			for (Object key : map.keySet()) {
				Variable v = new VariableWrapper(map, key);
				this.put(key, v);
			}
		}
	}

	class VariableWrapper extends AbstractVariable {
		private static final long serialVersionUID = -6210738091770692066L;

		private Map<?, ?> map = null;

		private Object key = null;

		private ObservableList<Matrix> matrixList = null;

		public VariableWrapper(Map<?, ?> map, Object key) {
			this.map = map;
			this.key = key;
		}

		public Variable clone() {
			Variable v = VariableFactory.labeledVariable(getLabel());
			for (Matrix m : getMatrixList()) {
				v.getMatrixList().add(m.copy());
			}
			return v;
		}

		@Override
		public synchronized Matrix getAsMatrix() {
			return MathUtil.getMatrix(map.get(key));
		}

		@Override
		public synchronized long[] getSize() {
			Matrix m = getMatrix();
			return m == null ? Coordinates.ZERO2D : m.getSize();
		}

		@Override
		public void setSize(long... size) {

		}

		@Override
		public String getLabel() {
			return "" + key;
		}

		@Override
		public void setLabel(String label) {
		}

		@Override
		public String getDescription() {
			return null;
		}

		@Override
		public void setDescription(String description) {
		}

		@Override
		public synchronized ObservableList<Matrix> getMatrixList() {
			if (matrixList == null) {
				matrixList = new SingletonObservableList(map, key);
			}
			return matrixList;
		}
	}

	class SingletonObservableList extends AbstractListModel implements ObservableList<Matrix> {
		private static final long serialVersionUID = 5626812327084186535L;

		private Map<?, ?> map = null;

		private Object key = null;

		public SingletonObservableList(Map<?, ?> map, Object key) {
			this.map = map;
			this.key = key;
		}

		@Override
		public void add(Matrix value) {
			((Map<Object, Object>) map).put(key, value);
		}

		@Override
		public void addAll(Collection<Matrix> values) {
			throw new MatrixException("not implemented");
		}

		@Override
		public void fireContentsChanged() {
			fireContentsChanged(this, -1, -1);
		}

		@Override
		public boolean remove(Matrix value) {
			throw new MatrixException("not implemented");
		}

		@Override
		public void clear() {
			throw new MatrixException("not implemented");
		}

		@Override
		public Matrix getElementAt(int index) {
			return MathUtil.getMatrix(map.get(key));
		}

		@Override
		public int indexOf(Matrix value) {
			Matrix m = MathUtil.getMatrix(map.get(key));
			return m == value ? 0 : -1;
		}

		@Override
		public boolean isEmpty() {
			return false;
		}

		@Override
		public Collection<Matrix> toCollection() {
			throw new MatrixException("not implemented");
		}

		@Override
		public int getSize() {
			return 1;
		}

		@Override
		public Iterator<Matrix> iterator() {
			throw new MatrixException("not implemented");
		}

	}

	@Override
	public void setVariables(ObservableMap<Variable> variables) {
	}

	@Override
	public Map<?, ?> getWrappedObject() {
		return map;
	}

	@Override
	public void setWrappedObject(Map<?, ?> object) {
		this.map = object;
	}
}
