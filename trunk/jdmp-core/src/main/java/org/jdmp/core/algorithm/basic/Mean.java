/*
 * Copyright (C) 2008-2015 by Holger Arndt
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

package org.jdmp.core.algorithm.basic;

import java.util.HashMap;
import java.util.Map;

import org.jdmp.core.algorithm.AbstractAlgorithm;
import org.jdmp.core.variable.Variable;
import org.ujmp.core.Matrix;
import org.ujmp.core.calculation.Calculation.Ret;
import org.ujmp.core.util.MathUtil;

public class Mean extends AbstractAlgorithm {
	private static final long serialVersionUID = 5594989536534719762L;

	public static final String DESCRIPTION = "target = mean(source)";

	private int defaultDimension = Matrix.ROW;

	private final boolean defaultIgnoreNaN = true;

	public Mean(int dimension) {
		this();
		this.defaultDimension = dimension;
	}

	public Mean(Variable... variables) {
		super();
		setDescription(DESCRIPTION);
		addVariableKey(SOURCE);
		addVariableKey(DIMENSION);
		addVariableKey(IGNORENAN);
		addVariableKey(TARGET);
		setEdgeLabel(SOURCE, "Source");
		setEdgeLabel(DIMENSION, "Dimension");
		setEdgeLabel(IGNORENAN, "IgnoreNaN");
		setEdgeLabel(TARGET, "Target");
		setEdgeDirection(SOURCE, EdgeDirection.Incoming);
		setEdgeDirection(DIMENSION, EdgeDirection.Incoming);
		setEdgeDirection(IGNORENAN, EdgeDirection.Incoming);
		setEdgeDirection(TARGET, EdgeDirection.Outgoing);
		setVariables(variables);
	}

	public Map<String, Object> calculateObjects(Map<String, Object> input) {
		int dimension = defaultDimension;
		boolean ignoreNaN = defaultIgnoreNaN;

		Map<String, Object> result = new HashMap<String, Object>();

		Matrix source = MathUtil.getMatrix(input.get(SOURCE));
		Object o2 = input.get(DIMENSION);
		if (o2 != null) {
			dimension = MathUtil.getInt(o2);
		}
		Object o3 = input.get(IGNORENAN);
		if (o3 != null) {
			ignoreNaN = MathUtil.getBoolean(o3);
		}

		Matrix target = source.mean(Ret.NEW, dimension, ignoreNaN);
		result.put(TARGET, target);
		return result;
	}

}
