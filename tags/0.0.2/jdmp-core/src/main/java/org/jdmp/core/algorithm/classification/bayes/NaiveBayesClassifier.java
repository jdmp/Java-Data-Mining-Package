/* ----------------------------------------------------------------------------
 * File:    AlgorithmClassifierNaiveBayes.java
 * Project: jdmp-core
 * Package: org.jdmp.core.algorithm.classification.bayes
 * ID:      $Id$
 *
 * ----------------------------------------------------------------------------
 * 
 * << short description of class >>
 *
 * ----------------------------------------------------------------------------
 *
 * Author: Andreas Naegele
 * Date:   03.05.2008
 * --------------------------------------------------------------------------*/

package org.jdmp.core.algorithm.classification.bayes;

import org.jdmp.core.algorithm.classification.AbstractClassifier;
import org.jdmp.core.algorithm.classification.Classifier;
import org.jdmp.core.algorithm.estimator.DensityEstimator;
import org.jdmp.core.algorithm.estimator.DiscreteDensityEstimator;
import org.jdmp.core.dataset.RegressionDataSet;
import org.jdmp.core.sample.ClassificationSample;
import org.ujmp.core.Matrix;
import org.ujmp.core.MatrixFactory;
import org.ujmp.core.calculation.Calculation.Ret;
import org.ujmp.core.exceptions.MatrixException;

public class NaiveBayesClassifier extends AbstractClassifier {

	private static final long serialVersionUID = -6511197233753905836L;

	private DensityEstimator[][] dists = null;

	private DensityEstimator classDists = null;

	private int classCount = 0;

	// private double[][][] conditionals = null;

	// private double[] classDist = null;

	public NaiveBayesClassifier() {
		super("Naive Bayes");
	}

	@Override
	public Matrix predict(Matrix input, Matrix sampleWeight) throws Exception {
		double[] logs = new double[classCount];
		// for all classes
		for (int i = 0; i < classCount; i++) {
			// for all features
			logs[i] = Math.log(classDists.getProbability(i));
			for (int j = 0; j < input.getColumnCount(); j++) {
				int val = (int) input.getAsDouble(0, j);
				logs[i] += Math.log(dists[j][i].getProbability((double) val));
			}
		}
		double[] probs = logToProbs(logs);
		Matrix m = MatrixFactory.zeros(1, 2);
		m.setAsDouble(probs[0], 0, 1);
		m.setAsDouble(probs[1], 0, 0);
		return m;
		// Matrix r=MatrixFactory.fromArray(probs).transpose();
	}

	/**
	 * @todo Put in common class!
	 * @param logs
	 * @return
	 */
	public static double[] logToProbs(double[] logs) {
		double[] probs = new double[logs.length];
		double sum = 0.0;
		for (int i = 0; i < probs.length; i++) {
			probs[i] = Math.exp(logs[i]);

			sum += probs[i];
		}
		for (int i = 0; i < probs.length; i++) {
			probs[i] = probs[i] / sum;
		}
		return probs;
	}

	@Override
	public void reset() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void train(RegressionDataSet dataSet) throws Exception {
		// classCount = ((ClassificationDataSet) dataSet).getClassCount();
		classCount = 2;
		int featureCount = dataSet.getFeatureCount();

		Matrix dataSetInput = dataSet.getInputMatrix();

		Matrix max = dataSetInput.max(Ret.NEW, Matrix.ROW);

		this.dists = new DensityEstimator[featureCount][classCount];
		this.classDists = new DiscreteDensityEstimator(classCount, true);

		for (int i = 0; i < featureCount; i++) {
			for (int j = 0; j < classCount; j++) {
				dists[i][j] = new DiscreteDensityEstimator((int) max.getAsDouble(0, i) + 1, true);
			}
		}

		// go over all samples an count
		for (int i = 0; i < dataSet.getSampleCount(); i++) {
			ClassificationSample s = (ClassificationSample) dataSet.getSample(i);
			Matrix sampleInput = s.getMatrix(INPUT);
			Matrix sampleTarget = s.getMatrix(TARGET);
			double weight = 1.0;
			Matrix w = s.getMatrix(WEIGHT);
			if (w != null) {
				weight = w.getEuklideanValue();
			}
			int outputVal = (int) sampleTarget.getAsDouble(0, 0);
			for (int j = 0; j < sampleInput.getColumnCount(); j++) {
				int inputVal = (int) sampleInput.getAsDouble(0, j);
				dists[j][outputVal].addValue((double) inputVal, weight);
			}
			classDists.addValue(outputVal, weight);
		}

	}

	@Override
	public void train(Matrix input, Matrix sampleWeight, Matrix targetOutput) throws Exception {
		throw new MatrixException("sample by sample learning is not supported");
	}

	public Classifier emptyCopy() {
		return new NaiveBayesClassifier();
	}

}
