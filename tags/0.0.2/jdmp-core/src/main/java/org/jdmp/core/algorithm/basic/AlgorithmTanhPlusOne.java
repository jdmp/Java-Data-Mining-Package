package org.jdmp.core.algorithm.basic;

import java.util.ArrayList;
import java.util.List;

import org.jdmp.core.algorithm.AlgorithmOneSource;
import org.ujmp.core.Matrix;
import org.ujmp.core.calculation.Calculation.Ret;
import org.ujmp.core.exceptions.MatrixException;

public class AlgorithmTanhPlusOne extends AlgorithmOneSource {
	private static final long serialVersionUID = 1972442317406585099L;

	public AlgorithmTanhPlusOne() {
		super("TanhPlusOne");
		setDescription("target = tanh(source+1)");
	}

	public List<Matrix> calculate(List<Matrix> input) throws MatrixException {
		List<Matrix> result = new ArrayList<Matrix>();

		if (input == null || input.size() < 1) {
			return result;
		}

		Matrix in = input.get(SOURCE);
		result.add(in.plus(1.0).tanh(Ret.NEW));
		return result;
	}

}
