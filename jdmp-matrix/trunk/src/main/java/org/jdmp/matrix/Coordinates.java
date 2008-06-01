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

package org.jdmp.matrix;

import java.io.Serializable;

public class Coordinates implements Serializable {
	private static final long serialVersionUID = 8361257560328772093L;

	public static final int Y = Matrix.Y;

	public static final int X = Matrix.X;

	public static final int Z = Matrix.Z;

	public static final int ROW = Matrix.ROW;

	public static final int COLUMN = Matrix.COLUMN;

	public static final int ALL = Matrix.ALL;

	public static final Coordinates SINGLEVALUE = new Coordinates(1, 1);

	public long[] dimensions = null;

	public Coordinates(long... dimensions) {
		this.dimensions = new long[dimensions.length];
		System.arraycopy(dimensions, 0, this.dimensions, 0, dimensions.length);
	}

	public Coordinates(Coordinates c) {
		this.dimensions = new long[c.dimensions.length];
		System.arraycopy(c.dimensions, 0, this.dimensions, 0, c.dimensions.length);
	}

	public final int hashCode() {
		return hashCode(this.dimensions);
	}

	public static final int hashCode(long[] coordinates) {
		int h = 0;
		for (int i = coordinates.length - 1; i != -1; i--) {
			h = 31 * h + (int) coordinates[i];
		}
		return h;
	}

	public boolean equals(Coordinates c) {
		if (dimensions.length != c.dimensions.length) {
			return false;
		}
		for (int i = dimensions.length - 1; i != -1; i--) {
			if (dimensions[i] != c.dimensions[i])
				return false;
		}
		return true;
	}

	public static long product(long[] c) {
		long product = 1;
		for (int i = c.length - 1; i != -1; i--) {
			product *= c[i];
		}
		return product;
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Coordinates) {
			return equals((Coordinates) o);
		} else {
			return false;
		}
	}

	public void fillWithValue(long value) {
		for (int i = dimensions.length - 1; i != -1; i--) {
			dimensions[i] = value;
		}
	}

	public void clear() {
		for (int i = dimensions.length - 1; i != -1; i--) {
			dimensions[i] = 0;
		}
	}

	public static String toString(long[] coordinates) {
		String s = "";
		for (int i = 0; i < coordinates.length; i++) {
			s += coordinates[i];
			if (i < coordinates.length - 1) {
				s += ",";
			}
		}
		return s;
	}

	public Coordinates clone() {
		Coordinates c = new Coordinates(this);
		return c;
	}

	public static final long[] plus(long[] c1, long[] c2) {
		long[] co = copyOf(c1);
		for (int i = co.length - 1; i != -1; i--) {
			co[i] += c2[i];
		}
		return co;
	}

	public static final long[] minus(long[] c1, long[] c2) {
		long[] co = copyOf(c1);
		for (int i = co.length - 1; i != -1; i--) {
			co[i] -= c2[i];
		}
		return co;
	}

	public static long[] fromString(String s) {
		String[] fields = s.split(",");
		long[] dims = new long[fields.length];
		for (int i = fields.length - 1; i != -1; i--) {
			dims[i] = Long.parseLong(fields[i]);
		}
		return dims;
	}

	public int getDimensionCount() {
		return dimensions.length;
	}

	public static final boolean equals(long[] c1, long[] c2) {
		if (c1 == c2) {
			return true;
		}
		if (c1.length != c2.length) {
			return false;
		}
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i]) {
				return false;
			}
		}
		return true;
	}

	public static long[] copyOf(long[] c) {
		long[] ret = new long[c.length];
		System.arraycopy(c, 0, ret, 0, c.length);
		return ret;
	}

	public static final long[] transpose(long[] c) {
		long[] copy = copyOf(c);
		copy[ROW] = c[COLUMN];
		copy[COLUMN] = c[ROW];
		return copy;
	}

	public static final long[] transpose(long[] c, int swap1, int swap2) {
		long[] copy = copyOf(c);
		copy[swap1] = c[swap2];
		copy[swap2] = c[swap1];
		return copy;
	}

	public static boolean isInsideOf(long[] coordinates, long[] position, long[] size) {
		if (coordinates[ROW] < position[ROW]) {
			return false;
		}
		if (coordinates[COLUMN] < position[COLUMN]) {
			return false;
		}
		long[] secondCorner = Coordinates.plus(position, size);
		if (coordinates[ROW] >= secondCorner[ROW]) {
			return false;
		}
		if (coordinates[COLUMN] >= secondCorner[COLUMN]) {
			return false;
		}
		return true;
	}

	public static boolean isSmallerThan(long[] coordinates, long[] size) {
		for (int i = coordinates.length - 1; i != -1; i--) {
			if (coordinates[i] > size[i])
				return false;
		}
		return true;
	}

	public static long[] minusOne(long[] coordinates) {
		long[] ret = new long[coordinates.length];
		for (int i = coordinates.length - 1; i != -1; i--) {
			ret[i] = coordinates[i] - 1;
		}
		return ret;
	}

	public static boolean isZero(long[] coordinates) {
		for (int i = coordinates.length - 1; i != -1; i--) {
			if (coordinates[i] != 0)
				return false;
		}
		return true;
	}

}
