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

package org.jdmp.matrix.io;

import java.io.File;
import java.io.IOException;

import org.jdmp.matrix.Matrix;
import org.jdmp.matrix.MatrixException;
import org.jdmp.matrix.Matrix.Format;
import org.jdmp.matrix.implementations.io.CSVMatrix;
import org.jdmp.matrix.implementations.io.WaveMatrix;

public abstract class Link {

	public static Matrix linkToFile(Format format, File file, Object... parameters)
			throws MatrixException, IOException {
		switch (format) {
		case CSV:
			return new CSVMatrix(file);
		case WAV:
			return new WaveMatrix(file);
		default:
			throw new MatrixException(
					"Linking to this file type is not supported. Try importing the file.");
		}
	}

}
