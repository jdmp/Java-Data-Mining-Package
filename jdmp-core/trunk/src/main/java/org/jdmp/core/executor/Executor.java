package org.jdmp.core.executor;

import java.util.List;

import org.jdmp.core.interpreter.AlgorithmCommand;
import org.jdmp.core.interpreter.Command;
import org.jdmp.core.interpreter.VariableCommand;
import org.jdmp.core.module.Module;
import org.jdmp.core.variable.DefaultVariable;
import org.jdmp.core.variable.Variable;
import org.ujmp.core.Matrix;

public class Executor {

	private Module module = null;

	public Executor(Module module) {
		this.module = module;
	}

	public void execute(Command... commands) {
		for (Command command : commands) {
			if (command instanceof AlgorithmCommand) {
				executeAlgorithmCommand((AlgorithmCommand) command);
			} else if (command instanceof VariableCommand) {
				executeVariableCommand((VariableCommand) command);
			}
		}
	}

	private void executeVariableCommand(VariableCommand command) {
		String variableName = command.getVariable();
		Matrix matrix = command.getValue();

		Variable variable = module.getVariableList().get(variableName);
		if (variable == null) {
			variable = new DefaultVariable(variableName);
			module.getVariableList().put(variableName, variable);
		}
		variable.addMatrix(matrix);
	}

	private void executeAlgorithmCommand(AlgorithmCommand command) {
	}

	public void execute(List<Command> commands) {
		for (Command command : commands) {
			execute(command);
		}
	}

}