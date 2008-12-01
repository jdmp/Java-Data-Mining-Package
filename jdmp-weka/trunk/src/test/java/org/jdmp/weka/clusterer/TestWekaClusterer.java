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

package org.jdmp.weka.clusterer;

import junit.framework.TestCase;

import org.jdmp.core.dataset.ClassificationDataSet;
import org.jdmp.core.dataset.DataSetFactory;
import org.jdmp.weka.clusterer.WekaClusterer.WekaClustererType;
import org.ujmp.core.Matrix;
import org.ujmp.core.calculation.Calculation.Ret;

public class TestWekaClusterer extends TestCase {

	public void testClusteringEM() throws Exception {
		ClassificationDataSet iris = DataSetFactory.IRIS();
		WekaClusterer wc = new WekaClusterer(WekaClustererType.EM, false);
		wc.setNumberOfClusters(3);
		wc.train(iris);
		wc.predict(iris);

		Matrix result = iris.getPredictedMatrix().sum(Ret.NEW, Matrix.ROW, true);

		// the three classes should have approximately 50 samples each
		assertEquals(50, result.getAsDouble(0, 0), 15);
		assertEquals(50, result.getAsDouble(0, 1), 15);
		assertEquals(50, result.getAsDouble(0, 2), 15);
	}

	public void testClusteringKMeans() throws Exception {
		ClassificationDataSet iris = DataSetFactory.IRIS();
		WekaClusterer wc = new WekaClusterer(WekaClustererType.SimpleKMeans, false);
		wc.setNumberOfClusters(3);
		wc.train(iris);
		wc.predict(iris);

		Matrix result = iris.getPredictedMatrix().sum(Ret.NEW, Matrix.ROW, true);

		// the three classes should have approximately 50 samples each
		assertEquals(50, result.getAsDouble(0, 0), 15);
		assertEquals(50, result.getAsDouble(0, 1), 15);
		assertEquals(50, result.getAsDouble(0, 2), 15);
	}

}
