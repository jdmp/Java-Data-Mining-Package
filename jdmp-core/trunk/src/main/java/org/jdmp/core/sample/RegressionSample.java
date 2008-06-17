package org.jdmp.core.sample;

public class RegressionSample extends DefaultSample {
	private static final long serialVersionUID = -7326840837391243268L;

	public RegressionSample(String label) {
		super(label);
	}

	public RegressionSample() {
		super();
	}

	public RegressionSample clone() {
		RegressionSample s = new RegressionSample();
		s.setMatrix(INPUT, getMatrix(INPUT).clone());
		s.setMatrix(TARGET, getMatrix(TARGET).clone());
		return s;
	}

}
