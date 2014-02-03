/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.analysis;

import java.util.ArrayList;
import java.util.List;

import org.jdmp.core.script.jdmp.node.AAndLevel7;
import org.jdmp.core.script.jdmp.node.AArgumentListArgumentList;
import org.jdmp.core.script.jdmp.node.AArray;
import org.jdmp.core.script.jdmp.node.AArrayAssignment;
import org.jdmp.core.script.jdmp.node.AArrayMatrix;
import org.jdmp.core.script.jdmp.node.AAssignmentCommand;
import org.jdmp.core.script.jdmp.node.ABitComplementLevel2;
import org.jdmp.core.script.jdmp.node.ABooleanLiteral;
import org.jdmp.core.script.jdmp.node.AColumn;
import org.jdmp.core.script.jdmp.node.AColumnMatrix;
import org.jdmp.core.script.jdmp.node.ACommaValue;
import org.jdmp.core.script.jdmp.node.AComplementLevel2;
import org.jdmp.core.script.jdmp.node.ADotLdivLevel3;
import org.jdmp.core.script.jdmp.node.ADotMultLevel3;
import org.jdmp.core.script.jdmp.node.ADotPowerLevel1;
import org.jdmp.core.script.jdmp.node.ADotRdivLevel3;
import org.jdmp.core.script.jdmp.node.ADotTransposeLevel1;
import org.jdmp.core.script.jdmp.node.AEmptyFunction;
import org.jdmp.core.script.jdmp.node.AEmptyMatrix;
import org.jdmp.core.script.jdmp.node.AEqLevel6;
import org.jdmp.core.script.jdmp.node.AExpressionArgumentList;
import org.jdmp.core.script.jdmp.node.AExpressionLevel0;
import org.jdmp.core.script.jdmp.node.AFalseBoolean;
import org.jdmp.core.script.jdmp.node.AFloatingPointLiteral;
import org.jdmp.core.script.jdmp.node.AFunctionLevel0;
import org.jdmp.core.script.jdmp.node.AGtLevel6;
import org.jdmp.core.script.jdmp.node.AGteqLevel6;
import org.jdmp.core.script.jdmp.node.AIdentifierAssignment;
import org.jdmp.core.script.jdmp.node.AIdentifierLevel0;
import org.jdmp.core.script.jdmp.node.AIntegerLiteral;
import org.jdmp.core.script.jdmp.node.ALdivLevel3;
import org.jdmp.core.script.jdmp.node.ALevel0Level1;
import org.jdmp.core.script.jdmp.node.ALevel10Expression;
import org.jdmp.core.script.jdmp.node.ALevel1Level2;
import org.jdmp.core.script.jdmp.node.ALevel2Level3;
import org.jdmp.core.script.jdmp.node.ALevel3Level4;
import org.jdmp.core.script.jdmp.node.ALevel4Level5;
import org.jdmp.core.script.jdmp.node.ALevel5Level6;
import org.jdmp.core.script.jdmp.node.ALevel6Level7;
import org.jdmp.core.script.jdmp.node.ALevel7Level8;
import org.jdmp.core.script.jdmp.node.ALevel8Level9;
import org.jdmp.core.script.jdmp.node.ALevel9Level10;
import org.jdmp.core.script.jdmp.node.ALiteralLevel0;
import org.jdmp.core.script.jdmp.node.ALogicalAndLevel9;
import org.jdmp.core.script.jdmp.node.ALogicalOrLevel10;
import org.jdmp.core.script.jdmp.node.ALtLevel6;
import org.jdmp.core.script.jdmp.node.ALteqLevel6;
import org.jdmp.core.script.jdmp.node.AMatrixLevel0;
import org.jdmp.core.script.jdmp.node.AMinusLevel2;
import org.jdmp.core.script.jdmp.node.AMinusLevel4;
import org.jdmp.core.script.jdmp.node.AMultLevel3;
import org.jdmp.core.script.jdmp.node.ANeqLevel6;
import org.jdmp.core.script.jdmp.node.AOrLevel8;
import org.jdmp.core.script.jdmp.node.AParameterFunction;
import org.jdmp.core.script.jdmp.node.APlusLevel2;
import org.jdmp.core.script.jdmp.node.APlusLevel4;
import org.jdmp.core.script.jdmp.node.APowerLevel1;
import org.jdmp.core.script.jdmp.node.AQualifiedName;
import org.jdmp.core.script.jdmp.node.ARangeLevel5;
import org.jdmp.core.script.jdmp.node.ARdivLevel3;
import org.jdmp.core.script.jdmp.node.ARow;
import org.jdmp.core.script.jdmp.node.ARowMatrix;
import org.jdmp.core.script.jdmp.node.AScript;
import org.jdmp.core.script.jdmp.node.ASemicolonRow;
import org.jdmp.core.script.jdmp.node.ASemicolonValue;
import org.jdmp.core.script.jdmp.node.ASimpleName;
import org.jdmp.core.script.jdmp.node.AStatement;
import org.jdmp.core.script.jdmp.node.AStatementCommand;
import org.jdmp.core.script.jdmp.node.AStepsize;
import org.jdmp.core.script.jdmp.node.AStringLiteral;
import org.jdmp.core.script.jdmp.node.ATransposeLevel1;
import org.jdmp.core.script.jdmp.node.ATrueBoolean;
import org.jdmp.core.script.jdmp.node.AValueMatrix;
import org.jdmp.core.script.jdmp.node.Node;
import org.jdmp.core.script.jdmp.node.PCommaValue;
import org.jdmp.core.script.jdmp.node.PCommand;
import org.jdmp.core.script.jdmp.node.PSemicolonRow;
import org.jdmp.core.script.jdmp.node.PSemicolonValue;
import org.jdmp.core.script.jdmp.node.Start;

public class DepthFirstAdapter extends AnalysisAdapter {
	public void inStart(Start node) {
		defaultIn(node);
	}

	public void outStart(Start node) {
		defaultOut(node);
	}

	public void defaultIn(@SuppressWarnings("unused") Node node) {
		// Do nothing
	}

	public void defaultOut(@SuppressWarnings("unused") Node node) {
		// Do nothing
	}

	public void caseStart(Start node) {
		inStart(node);
		node.getPScript().apply(this);
		node.getEOF().apply(this);
		outStart(node);
	}

	public void inAScript(AScript node) {
		defaultIn(node);
	}

	public void outAScript(AScript node) {
		defaultOut(node);
	}

	public void caseAScript(AScript node) {
		inAScript(node);
		{
			List<PCommand> copy = new ArrayList<PCommand>(node.getCommands());
			for (PCommand e : copy) {
				e.apply(this);
			}
		}
		outAScript(node);
	}

	public void inAAssignmentCommand(AAssignmentCommand node) {
		defaultIn(node);
	}

	public void outAAssignmentCommand(AAssignmentCommand node) {
		defaultOut(node);
	}

	public void caseAAssignmentCommand(AAssignmentCommand node) {
		inAAssignmentCommand(node);
		if (node.getAssignment() != null) {
			node.getAssignment().apply(this);
		}
		outAAssignmentCommand(node);
	}

	public void inAStatementCommand(AStatementCommand node) {
		defaultIn(node);
	}

	public void outAStatementCommand(AStatementCommand node) {
		defaultOut(node);
	}

	public void caseAStatementCommand(AStatementCommand node) {
		inAStatementCommand(node);
		if (node.getStatement() != null) {
			node.getStatement().apply(this);
		}
		outAStatementCommand(node);
	}

	public void inAStatement(AStatement node) {
		defaultIn(node);
	}

	public void outAStatement(AStatement node) {
		defaultOut(node);
	}

	public void caseAStatement(AStatement node) {
		inAStatement(node);
		if (node.getExpression() != null) {
			node.getExpression().apply(this);
		}
		if (node.getSemicolon() != null) {
			node.getSemicolon().apply(this);
		}
		outAStatement(node);
	}

	public void inAIdentifierAssignment(AIdentifierAssignment node) {
		defaultIn(node);
	}

	public void outAIdentifierAssignment(AIdentifierAssignment node) {
		defaultOut(node);
	}

	public void caseAIdentifierAssignment(AIdentifierAssignment node) {
		inAIdentifierAssignment(node);
		if (node.getName() != null) {
			node.getName().apply(this);
		}
		if (node.getAssign() != null) {
			node.getAssign().apply(this);
		}
		if (node.getExpression() != null) {
			node.getExpression().apply(this);
		}
		if (node.getSemicolon() != null) {
			node.getSemicolon().apply(this);
		}
		outAIdentifierAssignment(node);
	}

	public void inAArrayAssignment(AArrayAssignment node) {
		defaultIn(node);
	}

	public void outAArrayAssignment(AArrayAssignment node) {
		defaultOut(node);
	}

	public void caseAArrayAssignment(AArrayAssignment node) {
		inAArrayAssignment(node);
		if (node.getFunction() != null) {
			node.getFunction().apply(this);
		}
		if (node.getAssign() != null) {
			node.getAssign().apply(this);
		}
		if (node.getExpression() != null) {
			node.getExpression().apply(this);
		}
		if (node.getSemicolon() != null) {
			node.getSemicolon().apply(this);
		}
		outAArrayAssignment(node);
	}

	public void inALevel10Expression(ALevel10Expression node) {
		defaultIn(node);
	}

	public void outALevel10Expression(ALevel10Expression node) {
		defaultOut(node);
	}

	public void caseALevel10Expression(ALevel10Expression node) {
		inALevel10Expression(node);
		if (node.getLevel10() != null) {
			node.getLevel10().apply(this);
		}
		outALevel10Expression(node);
	}

	public void inAStepsize(AStepsize node) {
		defaultIn(node);
	}

	public void outAStepsize(AStepsize node) {
		defaultOut(node);
	}

	public void caseAStepsize(AStepsize node) {
		inAStepsize(node);
		if (node.getLevel4() != null) {
			node.getLevel4().apply(this);
		}
		if (node.getColon() != null) {
			node.getColon().apply(this);
		}
		outAStepsize(node);
	}

	public void inALevel9Level10(ALevel9Level10 node) {
		defaultIn(node);
	}

	public void outALevel9Level10(ALevel9Level10 node) {
		defaultOut(node);
	}

	public void caseALevel9Level10(ALevel9Level10 node) {
		inALevel9Level10(node);
		if (node.getLevel9() != null) {
			node.getLevel9().apply(this);
		}
		outALevel9Level10(node);
	}

	public void inALogicalOrLevel10(ALogicalOrLevel10 node) {
		defaultIn(node);
	}

	public void outALogicalOrLevel10(ALogicalOrLevel10 node) {
		defaultOut(node);
	}

	public void caseALogicalOrLevel10(ALogicalOrLevel10 node) {
		inALogicalOrLevel10(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getLogicalOr() != null) {
			node.getLogicalOr().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outALogicalOrLevel10(node);
	}

	public void inALevel8Level9(ALevel8Level9 node) {
		defaultIn(node);
	}

	public void outALevel8Level9(ALevel8Level9 node) {
		defaultOut(node);
	}

	public void caseALevel8Level9(ALevel8Level9 node) {
		inALevel8Level9(node);
		if (node.getLevel8() != null) {
			node.getLevel8().apply(this);
		}
		outALevel8Level9(node);
	}

	public void inALogicalAndLevel9(ALogicalAndLevel9 node) {
		defaultIn(node);
	}

	public void outALogicalAndLevel9(ALogicalAndLevel9 node) {
		defaultOut(node);
	}

	public void caseALogicalAndLevel9(ALogicalAndLevel9 node) {
		inALogicalAndLevel9(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getLogicalAnd() != null) {
			node.getLogicalAnd().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outALogicalAndLevel9(node);
	}

	public void inALevel7Level8(ALevel7Level8 node) {
		defaultIn(node);
	}

	public void outALevel7Level8(ALevel7Level8 node) {
		defaultOut(node);
	}

	public void caseALevel7Level8(ALevel7Level8 node) {
		inALevel7Level8(node);
		if (node.getLevel7() != null) {
			node.getLevel7().apply(this);
		}
		outALevel7Level8(node);
	}

	public void inAOrLevel8(AOrLevel8 node) {
		defaultIn(node);
	}

	public void outAOrLevel8(AOrLevel8 node) {
		defaultOut(node);
	}

	public void caseAOrLevel8(AOrLevel8 node) {
		inAOrLevel8(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getOr() != null) {
			node.getOr().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outAOrLevel8(node);
	}

	public void inALevel6Level7(ALevel6Level7 node) {
		defaultIn(node);
	}

	public void outALevel6Level7(ALevel6Level7 node) {
		defaultOut(node);
	}

	public void caseALevel6Level7(ALevel6Level7 node) {
		inALevel6Level7(node);
		if (node.getLevel6() != null) {
			node.getLevel6().apply(this);
		}
		outALevel6Level7(node);
	}

	public void inAAndLevel7(AAndLevel7 node) {
		defaultIn(node);
	}

	public void outAAndLevel7(AAndLevel7 node) {
		defaultOut(node);
	}

	public void caseAAndLevel7(AAndLevel7 node) {
		inAAndLevel7(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getAnd() != null) {
			node.getAnd().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outAAndLevel7(node);
	}

	public void inALevel5Level6(ALevel5Level6 node) {
		defaultIn(node);
	}

	public void outALevel5Level6(ALevel5Level6 node) {
		defaultOut(node);
	}

	public void caseALevel5Level6(ALevel5Level6 node) {
		inALevel5Level6(node);
		if (node.getLevel5() != null) {
			node.getLevel5().apply(this);
		}
		outALevel5Level6(node);
	}

	public void inAEqLevel6(AEqLevel6 node) {
		defaultIn(node);
	}

	public void outAEqLevel6(AEqLevel6 node) {
		defaultOut(node);
	}

	public void caseAEqLevel6(AEqLevel6 node) {
		inAEqLevel6(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getEq() != null) {
			node.getEq().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outAEqLevel6(node);
	}

	public void inANeqLevel6(ANeqLevel6 node) {
		defaultIn(node);
	}

	public void outANeqLevel6(ANeqLevel6 node) {
		defaultOut(node);
	}

	public void caseANeqLevel6(ANeqLevel6 node) {
		inANeqLevel6(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getNeq() != null) {
			node.getNeq().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outANeqLevel6(node);
	}

	public void inALteqLevel6(ALteqLevel6 node) {
		defaultIn(node);
	}

	public void outALteqLevel6(ALteqLevel6 node) {
		defaultOut(node);
	}

	public void caseALteqLevel6(ALteqLevel6 node) {
		inALteqLevel6(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getLteq() != null) {
			node.getLteq().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outALteqLevel6(node);
	}

	public void inAGteqLevel6(AGteqLevel6 node) {
		defaultIn(node);
	}

	public void outAGteqLevel6(AGteqLevel6 node) {
		defaultOut(node);
	}

	public void caseAGteqLevel6(AGteqLevel6 node) {
		inAGteqLevel6(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getGteq() != null) {
			node.getGteq().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outAGteqLevel6(node);
	}

	public void inAGtLevel6(AGtLevel6 node) {
		defaultIn(node);
	}

	public void outAGtLevel6(AGtLevel6 node) {
		defaultOut(node);
	}

	public void caseAGtLevel6(AGtLevel6 node) {
		inAGtLevel6(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getGt() != null) {
			node.getGt().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outAGtLevel6(node);
	}

	public void inALtLevel6(ALtLevel6 node) {
		defaultIn(node);
	}

	public void outALtLevel6(ALtLevel6 node) {
		defaultOut(node);
	}

	public void caseALtLevel6(ALtLevel6 node) {
		inALtLevel6(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getLt() != null) {
			node.getLt().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outALtLevel6(node);
	}

	public void inALevel4Level5(ALevel4Level5 node) {
		defaultIn(node);
	}

	public void outALevel4Level5(ALevel4Level5 node) {
		defaultOut(node);
	}

	public void caseALevel4Level5(ALevel4Level5 node) {
		inALevel4Level5(node);
		if (node.getLevel4() != null) {
			node.getLevel4().apply(this);
		}
		outALevel4Level5(node);
	}

	public void inARangeLevel5(ARangeLevel5 node) {
		defaultIn(node);
	}

	public void outARangeLevel5(ARangeLevel5 node) {
		defaultOut(node);
	}

	public void caseARangeLevel5(ARangeLevel5 node) {
		inARangeLevel5(node);
		if (node.getMin() != null) {
			node.getMin().apply(this);
		}
		if (node.getColon() != null) {
			node.getColon().apply(this);
		}
		if (node.getStepsize() != null) {
			node.getStepsize().apply(this);
		}
		if (node.getMax() != null) {
			node.getMax().apply(this);
		}
		outARangeLevel5(node);
	}

	public void inALevel3Level4(ALevel3Level4 node) {
		defaultIn(node);
	}

	public void outALevel3Level4(ALevel3Level4 node) {
		defaultOut(node);
	}

	public void caseALevel3Level4(ALevel3Level4 node) {
		inALevel3Level4(node);
		if (node.getLevel3() != null) {
			node.getLevel3().apply(this);
		}
		outALevel3Level4(node);
	}

	public void inAPlusLevel4(APlusLevel4 node) {
		defaultIn(node);
	}

	public void outAPlusLevel4(APlusLevel4 node) {
		defaultOut(node);
	}

	public void caseAPlusLevel4(APlusLevel4 node) {
		inAPlusLevel4(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getPlus() != null) {
			node.getPlus().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outAPlusLevel4(node);
	}

	public void inAMinusLevel4(AMinusLevel4 node) {
		defaultIn(node);
	}

	public void outAMinusLevel4(AMinusLevel4 node) {
		defaultOut(node);
	}

	public void caseAMinusLevel4(AMinusLevel4 node) {
		inAMinusLevel4(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getMinus() != null) {
			node.getMinus().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outAMinusLevel4(node);
	}

	public void inALevel2Level3(ALevel2Level3 node) {
		defaultIn(node);
	}

	public void outALevel2Level3(ALevel2Level3 node) {
		defaultOut(node);
	}

	public void caseALevel2Level3(ALevel2Level3 node) {
		inALevel2Level3(node);
		if (node.getLevel2() != null) {
			node.getLevel2().apply(this);
		}
		outALevel2Level3(node);
	}

	public void inAMultLevel3(AMultLevel3 node) {
		defaultIn(node);
	}

	public void outAMultLevel3(AMultLevel3 node) {
		defaultOut(node);
	}

	public void caseAMultLevel3(AMultLevel3 node) {
		inAMultLevel3(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getMult() != null) {
			node.getMult().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outAMultLevel3(node);
	}

	public void inADotMultLevel3(ADotMultLevel3 node) {
		defaultIn(node);
	}

	public void outADotMultLevel3(ADotMultLevel3 node) {
		defaultOut(node);
	}

	public void caseADotMultLevel3(ADotMultLevel3 node) {
		inADotMultLevel3(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getDotMult() != null) {
			node.getDotMult().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outADotMultLevel3(node);
	}

	public void inARdivLevel3(ARdivLevel3 node) {
		defaultIn(node);
	}

	public void outARdivLevel3(ARdivLevel3 node) {
		defaultOut(node);
	}

	public void caseARdivLevel3(ARdivLevel3 node) {
		inARdivLevel3(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getRdiv() != null) {
			node.getRdiv().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outARdivLevel3(node);
	}

	public void inADotRdivLevel3(ADotRdivLevel3 node) {
		defaultIn(node);
	}

	public void outADotRdivLevel3(ADotRdivLevel3 node) {
		defaultOut(node);
	}

	public void caseADotRdivLevel3(ADotRdivLevel3 node) {
		inADotRdivLevel3(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getDotRdiv() != null) {
			node.getDotRdiv().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outADotRdivLevel3(node);
	}

	public void inALdivLevel3(ALdivLevel3 node) {
		defaultIn(node);
	}

	public void outALdivLevel3(ALdivLevel3 node) {
		defaultOut(node);
	}

	public void caseALdivLevel3(ALdivLevel3 node) {
		inALdivLevel3(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getLdiv() != null) {
			node.getLdiv().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outALdivLevel3(node);
	}

	public void inADotLdivLevel3(ADotLdivLevel3 node) {
		defaultIn(node);
	}

	public void outADotLdivLevel3(ADotLdivLevel3 node) {
		defaultOut(node);
	}

	public void caseADotLdivLevel3(ADotLdivLevel3 node) {
		inADotLdivLevel3(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getDotLdiv() != null) {
			node.getDotLdiv().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outADotLdivLevel3(node);
	}

	public void inALevel1Level2(ALevel1Level2 node) {
		defaultIn(node);
	}

	public void outALevel1Level2(ALevel1Level2 node) {
		defaultOut(node);
	}

	public void caseALevel1Level2(ALevel1Level2 node) {
		inALevel1Level2(node);
		if (node.getLevel1() != null) {
			node.getLevel1().apply(this);
		}
		outALevel1Level2(node);
	}

	public void inAComplementLevel2(AComplementLevel2 node) {
		defaultIn(node);
	}

	public void outAComplementLevel2(AComplementLevel2 node) {
		defaultOut(node);
	}

	public void caseAComplementLevel2(AComplementLevel2 node) {
		inAComplementLevel2(node);
		if (node.getComplement() != null) {
			node.getComplement().apply(this);
		}
		if (node.getLevel1() != null) {
			node.getLevel1().apply(this);
		}
		outAComplementLevel2(node);
	}

	public void inABitComplementLevel2(ABitComplementLevel2 node) {
		defaultIn(node);
	}

	public void outABitComplementLevel2(ABitComplementLevel2 node) {
		defaultOut(node);
	}

	public void caseABitComplementLevel2(ABitComplementLevel2 node) {
		inABitComplementLevel2(node);
		if (node.getBitComplement() != null) {
			node.getBitComplement().apply(this);
		}
		if (node.getLevel1() != null) {
			node.getLevel1().apply(this);
		}
		outABitComplementLevel2(node);
	}

	public void inAPlusLevel2(APlusLevel2 node) {
		defaultIn(node);
	}

	public void outAPlusLevel2(APlusLevel2 node) {
		defaultOut(node);
	}

	public void caseAPlusLevel2(APlusLevel2 node) {
		inAPlusLevel2(node);
		if (node.getPlus() != null) {
			node.getPlus().apply(this);
		}
		if (node.getLevel1() != null) {
			node.getLevel1().apply(this);
		}
		outAPlusLevel2(node);
	}

	public void inAMinusLevel2(AMinusLevel2 node) {
		defaultIn(node);
	}

	public void outAMinusLevel2(AMinusLevel2 node) {
		defaultOut(node);
	}

	public void caseAMinusLevel2(AMinusLevel2 node) {
		inAMinusLevel2(node);
		if (node.getMinus() != null) {
			node.getMinus().apply(this);
		}
		if (node.getLevel1() != null) {
			node.getLevel1().apply(this);
		}
		outAMinusLevel2(node);
	}

	public void inALevel0Level1(ALevel0Level1 node) {
		defaultIn(node);
	}

	public void outALevel0Level1(ALevel0Level1 node) {
		defaultOut(node);
	}

	public void caseALevel0Level1(ALevel0Level1 node) {
		inALevel0Level1(node);
		if (node.getLevel0() != null) {
			node.getLevel0().apply(this);
		}
		outALevel0Level1(node);
	}

	public void inATransposeLevel1(ATransposeLevel1 node) {
		defaultIn(node);
	}

	public void outATransposeLevel1(ATransposeLevel1 node) {
		defaultOut(node);
	}

	public void caseATransposeLevel1(ATransposeLevel1 node) {
		inATransposeLevel1(node);
		if (node.getLevel0() != null) {
			node.getLevel0().apply(this);
		}
		if (node.getTranspose() != null) {
			node.getTranspose().apply(this);
		}
		outATransposeLevel1(node);
	}

	public void inADotTransposeLevel1(ADotTransposeLevel1 node) {
		defaultIn(node);
	}

	public void outADotTransposeLevel1(ADotTransposeLevel1 node) {
		defaultOut(node);
	}

	public void caseADotTransposeLevel1(ADotTransposeLevel1 node) {
		inADotTransposeLevel1(node);
		if (node.getLevel0() != null) {
			node.getLevel0().apply(this);
		}
		if (node.getDotTranspose() != null) {
			node.getDotTranspose().apply(this);
		}
		outADotTransposeLevel1(node);
	}

	public void inAPowerLevel1(APowerLevel1 node) {
		defaultIn(node);
	}

	public void outAPowerLevel1(APowerLevel1 node) {
		defaultOut(node);
	}

	public void caseAPowerLevel1(APowerLevel1 node) {
		inAPowerLevel1(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getPower() != null) {
			node.getPower().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outAPowerLevel1(node);
	}

	public void inADotPowerLevel1(ADotPowerLevel1 node) {
		defaultIn(node);
	}

	public void outADotPowerLevel1(ADotPowerLevel1 node) {
		defaultOut(node);
	}

	public void caseADotPowerLevel1(ADotPowerLevel1 node) {
		inADotPowerLevel1(node);
		if (node.getLeft() != null) {
			node.getLeft().apply(this);
		}
		if (node.getDotPower() != null) {
			node.getDotPower().apply(this);
		}
		if (node.getRight() != null) {
			node.getRight().apply(this);
		}
		outADotPowerLevel1(node);
	}

	public void inALiteralLevel0(ALiteralLevel0 node) {
		defaultIn(node);
	}

	public void outALiteralLevel0(ALiteralLevel0 node) {
		defaultOut(node);
	}

	public void caseALiteralLevel0(ALiteralLevel0 node) {
		inALiteralLevel0(node);
		if (node.getLiteral() != null) {
			node.getLiteral().apply(this);
		}
		outALiteralLevel0(node);
	}

	public void inAMatrixLevel0(AMatrixLevel0 node) {
		defaultIn(node);
	}

	public void outAMatrixLevel0(AMatrixLevel0 node) {
		defaultOut(node);
	}

	public void caseAMatrixLevel0(AMatrixLevel0 node) {
		inAMatrixLevel0(node);
		if (node.getMatrix() != null) {
			node.getMatrix().apply(this);
		}
		outAMatrixLevel0(node);
	}

	public void inAFunctionLevel0(AFunctionLevel0 node) {
		defaultIn(node);
	}

	public void outAFunctionLevel0(AFunctionLevel0 node) {
		defaultOut(node);
	}

	public void caseAFunctionLevel0(AFunctionLevel0 node) {
		inAFunctionLevel0(node);
		if (node.getFunction() != null) {
			node.getFunction().apply(this);
		}
		outAFunctionLevel0(node);
	}

	public void inAIdentifierLevel0(AIdentifierLevel0 node) {
		defaultIn(node);
	}

	public void outAIdentifierLevel0(AIdentifierLevel0 node) {
		defaultOut(node);
	}

	public void caseAIdentifierLevel0(AIdentifierLevel0 node) {
		inAIdentifierLevel0(node);
		if (node.getName() != null) {
			node.getName().apply(this);
		}
		outAIdentifierLevel0(node);
	}

	public void inAExpressionLevel0(AExpressionLevel0 node) {
		defaultIn(node);
	}

	public void outAExpressionLevel0(AExpressionLevel0 node) {
		defaultOut(node);
	}

	public void caseAExpressionLevel0(AExpressionLevel0 node) {
		inAExpressionLevel0(node);
		if (node.getLParenthese() != null) {
			node.getLParenthese().apply(this);
		}
		if (node.getExpression() != null) {
			node.getExpression().apply(this);
		}
		if (node.getRParenthese() != null) {
			node.getRParenthese().apply(this);
		}
		outAExpressionLevel0(node);
	}

	public void inAEmptyFunction(AEmptyFunction node) {
		defaultIn(node);
	}

	public void outAEmptyFunction(AEmptyFunction node) {
		defaultOut(node);
	}

	public void caseAEmptyFunction(AEmptyFunction node) {
		inAEmptyFunction(node);
		if (node.getName() != null) {
			node.getName().apply(this);
		}
		if (node.getLParenthese() != null) {
			node.getLParenthese().apply(this);
		}
		if (node.getRParenthese() != null) {
			node.getRParenthese().apply(this);
		}
		outAEmptyFunction(node);
	}

	public void inAParameterFunction(AParameterFunction node) {
		defaultIn(node);
	}

	public void outAParameterFunction(AParameterFunction node) {
		defaultOut(node);
	}

	public void caseAParameterFunction(AParameterFunction node) {
		inAParameterFunction(node);
		if (node.getName() != null) {
			node.getName().apply(this);
		}
		if (node.getLParenthese() != null) {
			node.getLParenthese().apply(this);
		}
		if (node.getArgumentList() != null) {
			node.getArgumentList().apply(this);
		}
		if (node.getRParenthese() != null) {
			node.getRParenthese().apply(this);
		}
		outAParameterFunction(node);
	}

	public void inAExpressionArgumentList(AExpressionArgumentList node) {
		defaultIn(node);
	}

	public void outAExpressionArgumentList(AExpressionArgumentList node) {
		defaultOut(node);
	}

	public void caseAExpressionArgumentList(AExpressionArgumentList node) {
		inAExpressionArgumentList(node);
		if (node.getExpression() != null) {
			node.getExpression().apply(this);
		}
		outAExpressionArgumentList(node);
	}

	public void inAArgumentListArgumentList(AArgumentListArgumentList node) {
		defaultIn(node);
	}

	public void outAArgumentListArgumentList(AArgumentListArgumentList node) {
		defaultOut(node);
	}

	public void caseAArgumentListArgumentList(AArgumentListArgumentList node) {
		inAArgumentListArgumentList(node);
		if (node.getArgumentList() != null) {
			node.getArgumentList().apply(this);
		}
		if (node.getComma() != null) {
			node.getComma().apply(this);
		}
		if (node.getExpression() != null) {
			node.getExpression().apply(this);
		}
		outAArgumentListArgumentList(node);
	}

	public void inAIntegerLiteral(AIntegerLiteral node) {
		defaultIn(node);
	}

	public void outAIntegerLiteral(AIntegerLiteral node) {
		defaultOut(node);
	}

	public void caseAIntegerLiteral(AIntegerLiteral node) {
		inAIntegerLiteral(node);
		if (node.getInteger() != null) {
			node.getInteger().apply(this);
		}
		outAIntegerLiteral(node);
	}

	public void inAFloatingPointLiteral(AFloatingPointLiteral node) {
		defaultIn(node);
	}

	public void outAFloatingPointLiteral(AFloatingPointLiteral node) {
		defaultOut(node);
	}

	public void caseAFloatingPointLiteral(AFloatingPointLiteral node) {
		inAFloatingPointLiteral(node);
		if (node.getFloatingPoint() != null) {
			node.getFloatingPoint().apply(this);
		}
		outAFloatingPointLiteral(node);
	}

	public void inAStringLiteral(AStringLiteral node) {
		defaultIn(node);
	}

	public void outAStringLiteral(AStringLiteral node) {
		defaultOut(node);
	}

	public void caseAStringLiteral(AStringLiteral node) {
		inAStringLiteral(node);
		if (node.getString() != null) {
			node.getString().apply(this);
		}
		outAStringLiteral(node);
	}

	public void inABooleanLiteral(ABooleanLiteral node) {
		defaultIn(node);
	}

	public void outABooleanLiteral(ABooleanLiteral node) {
		defaultOut(node);
	}

	public void caseABooleanLiteral(ABooleanLiteral node) {
		inABooleanLiteral(node);
		if (node.getBoolean() != null) {
			node.getBoolean().apply(this);
		}
		outABooleanLiteral(node);
	}

	public void inASimpleName(ASimpleName node) {
		defaultIn(node);
	}

	public void outASimpleName(ASimpleName node) {
		defaultOut(node);
	}

	public void caseASimpleName(ASimpleName node) {
		inASimpleName(node);
		if (node.getIdentifier() != null) {
			node.getIdentifier().apply(this);
		}
		outASimpleName(node);
	}

	public void inAQualifiedName(AQualifiedName node) {
		defaultIn(node);
	}

	public void outAQualifiedName(AQualifiedName node) {
		defaultOut(node);
	}

	public void caseAQualifiedName(AQualifiedName node) {
		inAQualifiedName(node);
		if (node.getName() != null) {
			node.getName().apply(this);
		}
		if (node.getDot() != null) {
			node.getDot().apply(this);
		}
		if (node.getIdentifier() != null) {
			node.getIdentifier().apply(this);
		}
		outAQualifiedName(node);
	}

	public void inAEmptyMatrix(AEmptyMatrix node) {
		defaultIn(node);
	}

	public void outAEmptyMatrix(AEmptyMatrix node) {
		defaultOut(node);
	}

	public void caseAEmptyMatrix(AEmptyMatrix node) {
		inAEmptyMatrix(node);
		if (node.getLBracket() != null) {
			node.getLBracket().apply(this);
		}
		if (node.getRBracket() != null) {
			node.getRBracket().apply(this);
		}
		outAEmptyMatrix(node);
	}

	public void inAValueMatrix(AValueMatrix node) {
		defaultIn(node);
	}

	public void outAValueMatrix(AValueMatrix node) {
		defaultOut(node);
	}

	public void caseAValueMatrix(AValueMatrix node) {
		inAValueMatrix(node);
		if (node.getLBracket() != null) {
			node.getLBracket().apply(this);
		}
		if (node.getExpression() != null) {
			node.getExpression().apply(this);
		}
		if (node.getRBracket() != null) {
			node.getRBracket().apply(this);
		}
		outAValueMatrix(node);
	}

	public void inARowMatrix(ARowMatrix node) {
		defaultIn(node);
	}

	public void outARowMatrix(ARowMatrix node) {
		defaultOut(node);
	}

	public void caseARowMatrix(ARowMatrix node) {
		inARowMatrix(node);
		if (node.getLBracket() != null) {
			node.getLBracket().apply(this);
		}
		if (node.getRow() != null) {
			node.getRow().apply(this);
		}
		if (node.getRBracket() != null) {
			node.getRBracket().apply(this);
		}
		outARowMatrix(node);
	}

	public void inAColumnMatrix(AColumnMatrix node) {
		defaultIn(node);
	}

	public void outAColumnMatrix(AColumnMatrix node) {
		defaultOut(node);
	}

	public void caseAColumnMatrix(AColumnMatrix node) {
		inAColumnMatrix(node);
		if (node.getLBracket() != null) {
			node.getLBracket().apply(this);
		}
		if (node.getColumn() != null) {
			node.getColumn().apply(this);
		}
		if (node.getRBracket() != null) {
			node.getRBracket().apply(this);
		}
		outAColumnMatrix(node);
	}

	public void inAArrayMatrix(AArrayMatrix node) {
		defaultIn(node);
	}

	public void outAArrayMatrix(AArrayMatrix node) {
		defaultOut(node);
	}

	public void caseAArrayMatrix(AArrayMatrix node) {
		inAArrayMatrix(node);
		if (node.getLBracket() != null) {
			node.getLBracket().apply(this);
		}
		if (node.getArray() != null) {
			node.getArray().apply(this);
		}
		if (node.getRBracket() != null) {
			node.getRBracket().apply(this);
		}
		outAArrayMatrix(node);
	}

	public void inAArray(AArray node) {
		defaultIn(node);
	}

	public void outAArray(AArray node) {
		defaultOut(node);
	}

	public void caseAArray(AArray node) {
		inAArray(node);
		if (node.getRow() != null) {
			node.getRow().apply(this);
		}
		{
			List<PSemicolonRow> copy = new ArrayList<PSemicolonRow>(node.getAdditionalRows());
			for (PSemicolonRow e : copy) {
				e.apply(this);
			}
		}
		outAArray(node);
	}

	public void inAColumn(AColumn node) {
		defaultIn(node);
	}

	public void outAColumn(AColumn node) {
		defaultOut(node);
	}

	public void caseAColumn(AColumn node) {
		inAColumn(node);
		if (node.getExpression() != null) {
			node.getExpression().apply(this);
		}
		{
			List<PSemicolonValue> copy = new ArrayList<PSemicolonValue>(node.getAdditionalValues());
			for (PSemicolonValue e : copy) {
				e.apply(this);
			}
		}
		outAColumn(node);
	}

	public void inARow(ARow node) {
		defaultIn(node);
	}

	public void outARow(ARow node) {
		defaultOut(node);
	}

	public void caseARow(ARow node) {
		inARow(node);
		if (node.getExpression() != null) {
			node.getExpression().apply(this);
		}
		{
			List<PCommaValue> copy = new ArrayList<PCommaValue>(node.getAdditionalValues());
			for (PCommaValue e : copy) {
				e.apply(this);
			}
		}
		outARow(node);
	}

	public void inACommaValue(ACommaValue node) {
		defaultIn(node);
	}

	public void outACommaValue(ACommaValue node) {
		defaultOut(node);
	}

	public void caseACommaValue(ACommaValue node) {
		inACommaValue(node);
		if (node.getComma() != null) {
			node.getComma().apply(this);
		}
		if (node.getExpression() != null) {
			node.getExpression().apply(this);
		}
		outACommaValue(node);
	}

	public void inASemicolonValue(ASemicolonValue node) {
		defaultIn(node);
	}

	public void outASemicolonValue(ASemicolonValue node) {
		defaultOut(node);
	}

	public void caseASemicolonValue(ASemicolonValue node) {
		inASemicolonValue(node);
		if (node.getSemicolon() != null) {
			node.getSemicolon().apply(this);
		}
		if (node.getExpression() != null) {
			node.getExpression().apply(this);
		}
		outASemicolonValue(node);
	}

	public void inASemicolonRow(ASemicolonRow node) {
		defaultIn(node);
	}

	public void outASemicolonRow(ASemicolonRow node) {
		defaultOut(node);
	}

	public void caseASemicolonRow(ASemicolonRow node) {
		inASemicolonRow(node);
		if (node.getSemicolon() != null) {
			node.getSemicolon().apply(this);
		}
		if (node.getRow() != null) {
			node.getRow().apply(this);
		}
		outASemicolonRow(node);
	}

	public void inATrueBoolean(ATrueBoolean node) {
		defaultIn(node);
	}

	public void outATrueBoolean(ATrueBoolean node) {
		defaultOut(node);
	}

	public void caseATrueBoolean(ATrueBoolean node) {
		inATrueBoolean(node);
		if (node.getTrue() != null) {
			node.getTrue().apply(this);
		}
		outATrueBoolean(node);
	}

	public void inAFalseBoolean(AFalseBoolean node) {
		defaultIn(node);
	}

	public void outAFalseBoolean(AFalseBoolean node) {
		defaultOut(node);
	}

	public void caseAFalseBoolean(AFalseBoolean node) {
		inAFalseBoolean(node);
		if (node.getFalse() != null) {
			node.getFalse().apply(this);
		}
		outAFalseBoolean(node);
	}
}
