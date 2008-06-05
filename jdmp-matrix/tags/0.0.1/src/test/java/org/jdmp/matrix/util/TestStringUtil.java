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

package org.jdmp.matrix.util;

import junit.framework.TestCase;

import org.jdmp.matrix.exceptions.MatrixException;
import org.jdmp.matrix.util.StringUtil;

public class TestStringUtil extends TestCase {

	public void testParseSelectionMatlab() {

		try {
			long[][] sel = StringUtil.parseSelection(":,2", new long[] { 3, 4 });
		} catch (MatrixException e) {
			// should not work yet
			return;
		}

		throw new RuntimeException("Matlab selection is available. Add tests");

	}

}