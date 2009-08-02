package org.jdmp.core.dataset;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;

import org.jdmp.core.matrix.wrappers.DataSetInputAndClassWrapper;
import org.jdmp.core.sample.ClassificationSample;
import org.jdmp.core.sample.Sample;
import org.jdmp.core.variable.DefaultVariable;
import org.jdmp.core.variable.Variable;
import org.jdmp.matrix.Matrix;
import org.jdmp.matrix.MatrixFactory;
import org.jdmp.matrix.Matrix.Format;
import org.jdmp.matrix.calculation.Calculation.Ret;
import org.jdmp.matrix.calculation.general.statistical.IndexOfMax;
import org.jdmp.matrix.collections.DefaultMatrixList;
import org.jdmp.matrix.collections.MatrixList;
import org.jdmp.matrix.exceptions.MatrixException;
import org.jdmp.matrix.implementations.basic.GenericCalculationMatrix;
import org.jdmp.matrix.util.MathUtil;

public class ClassificationDataSet extends RegressionDataSet {
	private static final long serialVersionUID = 3969274321783319184L;

	public static final int ACCURACY = 1;

	public static final int CONFUSION = 2;

	public static final int ERRORCOUNT = 3;

	private Matrix inputAndClassMatrix = null;

	private Matrix desiredClassMatrix = null;

	public ClassificationDataSet(File file, String separator) throws MatrixException, IOException {
		this(file.getName());
		importFromFile(file, separator);
	}

	public static ClassificationDataSet copyFromMatrix(Matrix input, Matrix desiredOutput) throws MatrixException {
		ClassificationDataSet ds = new ClassificationDataSet();
		for (int i = 0; i < input.getRowCount(); i++) {
			ClassificationSample s = new ClassificationSample();
			Matrix in = input.subMatrix(Ret.NEW, i, 0, i, input.getColumnCount() - 1);
			Matrix out = desiredOutput.subMatrix(Ret.NEW, i, 0, i, desiredOutput.getColumnCount() - 1);
			s.setInputMatrix(in);
			s.setDesiredOutputMatrix(out);
			ds.addSample(s);
		}
		return ds;
	}

	public ClassificationDataSet(String label) {
		this();
		setLabel(label);
	}

	public Matrix getClassDistribution() {
		Matrix m = MatrixFactory.zeros(getClassCount(), 1);

		Map<Integer, Double> map = new HashMap<Integer, Double>();

		for (Sample s : getSampleList()) {
			int c = ((ClassificationSample) s).getDesiredClass();
			Double d = map.get(c);
			if (d == null) {
				d = 0.0;
			}
			d++;
			map.put(c, d);
		}

		for (int i = 0; i < getClassCount(); i++) {
			Double d = map.get(i);
			if (d == null) {
				d = 0.0;
			}
			m.setDouble(d / getSampleCount(), i, 0);
		}
		return m;
	}

	public double getEarlyStoppingErrorCount(int numberOfSteps) {
		int index = getEarlyStoppingIndex(numberOfSteps);
		if (index >= 0) {
			return getErrorCountVariable().getMatrix(index).getEuklideanValue();
		}
		return -1;
	}

	public ClassificationSample getSample(int pos) {
		return (ClassificationSample) super.getSample(pos);
	}

	public ClassificationDataSet() {
		super();
		setVariable(ACCURACY, new DefaultVariable("Accuracy", 10000));
		setVariable(CONFUSION, new DefaultVariable("Confusion", 1000));
		setVariable(ERRORCOUNT, new DefaultVariable("Error Count", 1000));
	}

	public ClassificationDataSet clone() {
		ClassificationDataSet ds = new ClassificationDataSet();
		for (Sample s : getSampleList()) {
			ds.addSample(s.clone());
		}
		return ds;
	}

	public Matrix getInputAndClassMatrix() {
		if (inputAndClassMatrix == null) {
			inputAndClassMatrix = new DataSetInputAndClassWrapper(this);
		}
		return inputAndClassMatrix;
	}

	public Matrix getDesiredClassMatrix() {
		if (desiredClassMatrix == null) {
			desiredClassMatrix = new GenericCalculationMatrix(new IndexOfMax(COLUMN, getDesiredOutputMatrix()));
			desiredClassMatrix.setLabel("Desired Class");
		}
		return desiredClassMatrix;
	}

	public final void createFromMatrix(Matrix m) throws MatrixException {
		long cols = m.getColumnCount();
		long rows = m.getRowCount();
		Set<Object> classes = new HashSet<Object>();
		for (int i = 0; i < rows; i++) {
			Object o = m.getObject(i, cols - 1);
			classes.add(o);
		}

		// insert dummy if only one class is there
		if (classes.size() == 1) {
			classes.add(Double.NEGATIVE_INFINITY);
		}

		List<Object> classList = new ArrayList<Object>(classes);

		for (int i = 0; i < rows; i++) {
			ClassificationSample s = new ClassificationSample("Sample" + i + " (" + m.getObject(i, cols - 1) + ")");
			Matrix input = MatrixFactory.zeros(1, cols - 1);
			Matrix output = MatrixFactory.zeros(1, classes.size());

			for (int c = 0; c < cols - 1; c++) {
				input.setDouble(m.getDouble(i, c), 0, c);
			}

			int classId = classList.indexOf(m.getObject(i, cols - 1));
			for (int c = 0; c < classList.size(); c++) {
				if (classId == c) {
					output.setDouble(1.0, 0, c);
				} else {
					// output.setDoubleValueAt(-1.0, 0, c);
				}
			}

			s.setInputMatrix(input);
			s.setDesiredOutputMatrix(output);
			addSample(s);
		}
	}

	public int getClassCount() {
		return (int) ((ClassificationSample) getSample(0)).getDesiredOutputMatrix().getColumnCount();
	}

	public final void importFromCSV(File file, String separator) throws MatrixException, IOException {
		Matrix m = MatrixFactory.importFromFile(Format.CSV, file, separator);
		createFromMatrix(m);
	}

	public final void importFromFile(File file, String separator) throws MatrixException, IOException {
		if (file == null) {
			logger.log(Level.WARNING, "no filename provided");
			return;
		}

		if (file.getAbsolutePath().toLowerCase().endsWith(".csv")) {
			importFromCSV(file, separator);
		} else {
			importFromCSV(file, separator);
		}
	}

	public MatrixList getMatrixList() {
		if (matrixList == null) {
			matrixList = new DefaultMatrixList();
			matrixList.add(getInputMatrix());
			matrixList.add(getOutputMatrix());
			matrixList.add(getDesiredOutputMatrix());
			matrixList.add(getDesiredClassMatrix());
			matrixList.add(getInputOutputMatrix());
			matrixList.add(getInputAndClassMatrix());
		}
		return matrixList;
	}

	public Variable getConfusionVariable() {
		return getVariable(CONFUSION);
	}

	public Variable getErrorCountVariable() {
		return getVariable(ERRORCOUNT);
	}

	public int getErrorCount() throws MatrixException {
		return (int) getErrorCountVariable().getEuklideanValue();
	}

	public Variable getAccuracyVariable() {
		return getVariable(ACCURACY);
	}

	public void appendConfusionMatrix(Matrix m) {
		getConfusionVariable().addMatrix(m);
	}

	public void appendAccuracyMatrix(Matrix m) {
		getAccuracyVariable().addMatrix(m);
	}

	public void appendErrorCountMatrix(Matrix m) {
		getErrorCountVariable().addMatrix(m);
	}

	public void addMissingValues(int dimension, double percentMissing) throws MatrixException {
		getInputMatrix().addMissing(Ret.ORIG, dimension, percentMissing);
	}

	public double getAccuracy() throws MatrixException {
		return getAccuracyVariable().getEuklideanValue();
	}

	public double getMaxAccuracy() throws MatrixException {
		return getAccuracyVariable().getMaxValue();
	}

	public List<ClassificationDataSet> splitByClass() {
	  List<ClassificationDataSet> returnDataSets = new ArrayList<ClassificationDataSet>();
	  
	  
	  for(int i=0;i<getClassCount();i++){
	    ClassificationDataSet ds=new ClassificationDataSet("Class "+i);
	    for(Sample s:getSampleList()){
	      if(((ClassificationSample)s).getDesiredClass()==i){
	        ds.addSample(s.clone());
	      }
	    }
	    returnDataSets.add(ds);
	  }
	  
	  return returnDataSets;
	}
	
	public List<ClassificationDataSet> splitForStratifiedCV(int numberOfCVSets, int idOfCVSet, long randomSeed) {
		List<ClassificationDataSet> returnDataSets = new ArrayList<ClassificationDataSet>();
		Random rand = new Random(randomSeed);
		int classCount = getClassCount();

		// create empty lists
		List<List<Sample>> sortedSamples = new ArrayList<List<Sample>>();
		for (int i = 0; i < classCount; i++) {
			sortedSamples.add(new ArrayList<Sample>());
		}

		// add samples to lists according to class
		for (Sample s : getSampleList()) {
			int targetClass = ((ClassificationSample) s).getDesiredClass();
			sortedSamples.get(targetClass).add((ClassificationSample) s);
		}

		// shuffle lists
		Collections.shuffle(sortedSamples, rand);
		for (int i = 0; i < classCount; i++) {
			Collections.shuffle(sortedSamples.get(i), rand);
		}

		// create sample lists
		List<List<Sample>> cvSets = new ArrayList<List<Sample>>();
		for (int cvSet = 0; cvSet < numberOfCVSets; cvSet++) {
			List<Sample> samples = new ArrayList<Sample>();
			cvSets.add(samples);
		}

		// distribute the samples
		int fromPointer = 0;
		int toPointer = 0;
		while (!allEmpty(sortedSamples)) {

			for (toPointer = 0; toPointer < cvSets.size(); toPointer++) {

				List<Sample> to = cvSets.get(toPointer);

				while (to.size() < (double) getSampleCount() / numberOfCVSets && fromPointer < sortedSamples.size()) {
					List<Sample> from = sortedSamples.get(fromPointer);

					if (!from.isEmpty()) {
						to.add(from.remove(0));
					}

					fromPointer++;

				}

				fromPointer = 0;

			}

		}

		// create the data sets
		ClassificationDataSet train = new ClassificationDataSet("TrainingSet " + idOfCVSet + "/" + numberOfCVSets + "("
				+ randomSeed + ")");
		ClassificationDataSet test = new ClassificationDataSet("TestSet " + idOfCVSet + "/" + numberOfCVSets + "("
				+ randomSeed + ")");

		test.addAllSamples(cvSets.remove(idOfCVSet));

		for (List<Sample> list : cvSets) {
			train.addAllSamples(list);
		}

		returnDataSets.add(train);
		returnDataSets.add(test);

		return returnDataSets;
	}

	private static boolean allEmpty(List<List<Sample>> lists) {
		for (List<Sample> list : lists) {
			if (!list.isEmpty()) {
				return false;
			}
		}
		return true;
	}

	public double getEarlyStoppingAccuracy(int numberOfSteps) {
		int index = getEarlyStoppingIndex(numberOfSteps);
		if (index >= 0) {
			return getAccuracyVariable().getMatrix(index).getEuklideanValue();
		}
		return -1;		
	}
	
	
	public ClassificationDataSet bootstrap(int numberOfSamples){
          ClassificationDataSet ds=new ClassificationDataSet("Bootstrap of "+getLabel());
          List<Sample> sampleList=getSampleList();
          for(int i=0;i<numberOfSamples;i++){
            int rand=MathUtil.nextInteger(0, sampleList.size()-1);
            ds.addSample(sampleList.get(rand).clone());
          }
     return ds;
    }

}
