/*
 * Copyright (C) 2008 Holger Arndt, Andreas Naegele and Markus Bundschus
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

package org.jdmp.matrix.stubs;

import java.util.Map;

import org.jdmp.matrix.Matrix;
import org.jdmp.matrix.coordinates.CoordinateIterator2D;
import org.jdmp.matrix.coordinates.Coordinates;
import org.jdmp.matrix.exceptions.MatrixException;
import org.jdmp.matrix.interfaces.Wrapper;
import org.jdmp.matrix.util.CoordinateSetToLongWrapper;
import org.jdmp.matrix.util.MathUtil;

public abstract class AbstractMapToSparseMatrixWrapper<A> extends AbstractSparseMatrix<A> implements
		Wrapper<Map<Coordinates, Object>> {

	private A defaultValue = null;

	private int maximumNumberOfEntries = -1;

	private long[] size = null;

	public AbstractMapToSparseMatrixWrapper(Matrix m) {
		this.size = Coordinates.copyOf(m.getSize());
		for (long[] c : m.allCoordinates()) {
			setObject(m.getObject(c), c);
		}
	}

	public AbstractMapToSparseMatrixWrapper(Matrix m, int maximumNumberOfEntries2) {
		this.size = Coordinates.copyOf(m.getSize());
		setMaximumNumberOfEntries(maximumNumberOfEntries);
		for (long[] c : m.allCoordinates()) {
			setObject(m.getObject(c), c);
		}
	}

	public AbstractMapToSparseMatrixWrapper(long... size) {
		this.size = Coordinates.copyOf(size);
	}

	public abstract Map<Coordinates, Object> getMap();

	public abstract void setMap(Map<Coordinates, Object> map);

	public final long[] getSize() {
		return size;
	}

	public final Map<Coordinates, Object> getWrappedObject() {
		return getMap();
	}

	public final void setWrappedObject(Map<Coordinates, Object> object) {
		setMap(object);
	}

	public final A getObject(long... coordinates) throws MatrixException {
		A v = (A) getMap().get(new Coordinates(coordinates));
		return v == null ? defaultValue : v;
	}

	public Iterable<long[]> allCoordinates() {
		return new CoordinateIterator2D(getSize());
	}

	public final boolean contains(long... coordinates) {
		return getMap().containsKey(new Coordinates(coordinates));
	}

	public final double getDouble(long... coordinates) throws MatrixException {
		return MathUtil.getDouble(getObject(coordinates));
	}

	public final void setDouble(double v, long... coordinates) throws MatrixException {
		setObject(v, coordinates);
	}

	public final void setObject(Object o, long... coordinates) throws MatrixException {
		while (maximumNumberOfEntries > 0 && getMap().size() > maximumNumberOfEntries) {
			getMap().remove(getMap().keySet().iterator().next());
		}
		if (Coordinates.isSmallerThan(coordinates, getSize())) {
			getMap().put(new Coordinates(coordinates), (A) o);
		}
	}

	public final EntryType getEntryType() {
		return EntryType.GENERIC;
	}

	public final int getMaximumNumberOfEntries() {
		return maximumNumberOfEntries;
	}

	@Override
	public final long getValueCount() {
		return getMap().size();
	}

	public final Iterable<long[]> availableCoordinates() {
		return new CoordinateSetToLongWrapper(getMap().keySet());
	}

	public final void setMaximumNumberOfEntries(int maximumNumberOfEntries) {
		this.maximumNumberOfEntries = maximumNumberOfEntries;
	}

}