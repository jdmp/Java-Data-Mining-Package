/*
 * Copyright (C) 2008-2013 by Holger Arndt
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

import org.jdmp.core.variable.Variable;

public abstract class AlgorithmTwoSources extends AbstractAlgorithm {
	private static final long serialVersionUID = 8817347583332070277L;

	public static final String SOURCE1 = "Source 1";

	public static final String SOURCE2 = "Source 2";

	public static final String TARGET = "Target";

	public AlgorithmTwoSources(Variable... variables) {
		addVariableKey(SOURCE1);
		addVariableKey(SOURCE2);
		addVariableKey(TARGET);
		setEdgeLabel(SOURCE1, "Source 1");
		setEdgeLabel(SOURCE2, "Source 2");
		setEdgeLabel(TARGET, "Target");
		setEdgeDirection(SOURCE1, EdgeDirection.Incoming);
		setEdgeDirection(SOURCE2, EdgeDirection.Incoming);
		setEdgeDirection(TARGET, EdgeDirection.Outgoing);
		setVariables(variables);
	}

}
