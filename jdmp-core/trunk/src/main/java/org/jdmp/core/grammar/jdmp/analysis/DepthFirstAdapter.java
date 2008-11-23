/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.grammar.jdmp.analysis;

import java.util.*;
import org.jdmp.core.grammar.jdmp.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPScript().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAScript(AScript node)
    {
        defaultIn(node);
    }

    public void outAScript(AScript node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAScript(AScript node)
    {
        inAScript(node);
        {
            List<PCommand> copy = new ArrayList<PCommand>(node.getCommands());
            for(PCommand e : copy)
            {
                e.apply(this);
            }
        }
        outAScript(node);
    }

    public void inAStatementCommand(AStatementCommand node)
    {
        defaultIn(node);
    }

    public void outAStatementCommand(AStatementCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStatementCommand(AStatementCommand node)
    {
        inAStatementCommand(node);
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAStatementCommand(node);
    }

    public void inAAssignmentCommand(AAssignmentCommand node)
    {
        defaultIn(node);
    }

    public void outAAssignmentCommand(AAssignmentCommand node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAssignmentCommand(AAssignmentCommand node)
    {
        inAAssignmentCommand(node);
        if(node.getAssignment() != null)
        {
            node.getAssignment().apply(this);
        }
        outAAssignmentCommand(node);
    }

    public void inASilentStatement(ASilentStatement node)
    {
        defaultIn(node);
    }

    public void outASilentStatement(ASilentStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASilentStatement(ASilentStatement node)
    {
        inASilentStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outASilentStatement(node);
    }

    public void inAVerboseStatement(AVerboseStatement node)
    {
        defaultIn(node);
    }

    public void outAVerboseStatement(AVerboseStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVerboseStatement(AVerboseStatement node)
    {
        inAVerboseStatement(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getSemicolonToken() != null)
        {
            node.getSemicolonToken().apply(this);
        }
        outAVerboseStatement(node);
    }

    public void inASilentAssignment(ASilentAssignment node)
    {
        defaultIn(node);
    }

    public void outASilentAssignment(ASilentAssignment node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASilentAssignment(ASilentAssignment node)
    {
        inASilentAssignment(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getEqualsToken() != null)
        {
            node.getEqualsToken().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getSemicolonToken() != null)
        {
            node.getSemicolonToken().apply(this);
        }
        outASilentAssignment(node);
    }

    public void inAVerboseAssignment(AVerboseAssignment node)
    {
        defaultIn(node);
    }

    public void outAVerboseAssignment(AVerboseAssignment node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVerboseAssignment(AVerboseAssignment node)
    {
        inAVerboseAssignment(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getEqualsToken() != null)
        {
            node.getEqualsToken().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        outAVerboseAssignment(node);
    }

    public void inAFactorExpression(AFactorExpression node)
    {
        defaultIn(node);
    }

    public void outAFactorExpression(AFactorExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactorExpression(AFactorExpression node)
    {
        inAFactorExpression(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAFactorExpression(node);
    }

    public void inAPlusExpression(APlusExpression node)
    {
        defaultIn(node);
    }

    public void outAPlusExpression(APlusExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExpression(APlusExpression node)
    {
        inAPlusExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getPlusToken() != null)
        {
            node.getPlusToken().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAPlusExpression(node);
    }

    public void inAMinusExpression(AMinusExpression node)
    {
        defaultIn(node);
    }

    public void outAMinusExpression(AMinusExpression node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExpression(AMinusExpression node)
    {
        inAMinusExpression(node);
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getMinusToken() != null)
        {
            node.getMinusToken().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAMinusExpression(node);
    }

    public void inATermFactor(ATermFactor node)
    {
        defaultIn(node);
    }

    public void outATermFactor(ATermFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermFactor(ATermFactor node)
    {
        inATermFactor(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outATermFactor(node);
    }

    public void inAMultiplicationFactor(AMultiplicationFactor node)
    {
        defaultIn(node);
    }

    public void outAMultiplicationFactor(AMultiplicationFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultiplicationFactor(AMultiplicationFactor node)
    {
        inAMultiplicationFactor(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getMultiplicationToken() != null)
        {
            node.getMultiplicationToken().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outAMultiplicationFactor(node);
    }

    public void inADivisionFactor(ADivisionFactor node)
    {
        defaultIn(node);
    }

    public void outADivisionFactor(ADivisionFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivisionFactor(ADivisionFactor node)
    {
        inADivisionFactor(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getDivisionToken() != null)
        {
            node.getDivisionToken().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outADivisionFactor(node);
    }

    public void inAMatrixTerm(AMatrixTerm node)
    {
        defaultIn(node);
    }

    public void outAMatrixTerm(AMatrixTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMatrixTerm(AMatrixTerm node)
    {
        inAMatrixTerm(node);
        if(node.getMatrix() != null)
        {
            node.getMatrix().apply(this);
        }
        outAMatrixTerm(node);
    }

    public void inAExpressionTerm(AExpressionTerm node)
    {
        defaultIn(node);
    }

    public void outAExpressionTerm(AExpressionTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpressionTerm(AExpressionTerm node)
    {
        inAExpressionTerm(node);
        if(node.getLParToken() != null)
        {
            node.getLParToken().apply(this);
        }
        if(node.getExpression() != null)
        {
            node.getExpression().apply(this);
        }
        if(node.getRParToken() != null)
        {
            node.getRParToken().apply(this);
        }
        outAExpressionTerm(node);
    }

    public void inAScalarMatrix(AScalarMatrix node)
    {
        defaultIn(node);
    }

    public void outAScalarMatrix(AScalarMatrix node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAScalarMatrix(AScalarMatrix node)
    {
        inAScalarMatrix(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outAScalarMatrix(node);
    }

    public void inAEmptyMatrix(AEmptyMatrix node)
    {
        defaultIn(node);
    }

    public void outAEmptyMatrix(AEmptyMatrix node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyMatrix(AEmptyMatrix node)
    {
        inAEmptyMatrix(node);
        if(node.getLBracketToken() != null)
        {
            node.getLBracketToken().apply(this);
        }
        if(node.getRBracketToken() != null)
        {
            node.getRBracketToken().apply(this);
        }
        outAEmptyMatrix(node);
    }

    public void inAValueMatrix(AValueMatrix node)
    {
        defaultIn(node);
    }

    public void outAValueMatrix(AValueMatrix node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValueMatrix(AValueMatrix node)
    {
        inAValueMatrix(node);
        if(node.getLBracketToken() != null)
        {
            node.getLBracketToken().apply(this);
        }
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        if(node.getRBracketToken() != null)
        {
            node.getRBracketToken().apply(this);
        }
        outAValueMatrix(node);
    }

    public void inARowMatrix(ARowMatrix node)
    {
        defaultIn(node);
    }

    public void outARowMatrix(ARowMatrix node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARowMatrix(ARowMatrix node)
    {
        inARowMatrix(node);
        if(node.getLBracketToken() != null)
        {
            node.getLBracketToken().apply(this);
        }
        if(node.getRow() != null)
        {
            node.getRow().apply(this);
        }
        if(node.getRBracketToken() != null)
        {
            node.getRBracketToken().apply(this);
        }
        outARowMatrix(node);
    }

    public void inAColumnMatrix(AColumnMatrix node)
    {
        defaultIn(node);
    }

    public void outAColumnMatrix(AColumnMatrix node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAColumnMatrix(AColumnMatrix node)
    {
        inAColumnMatrix(node);
        if(node.getLBracketToken() != null)
        {
            node.getLBracketToken().apply(this);
        }
        if(node.getColumn() != null)
        {
            node.getColumn().apply(this);
        }
        if(node.getRBracketToken() != null)
        {
            node.getRBracketToken().apply(this);
        }
        outAColumnMatrix(node);
    }

    public void inAArrayMatrix(AArrayMatrix node)
    {
        defaultIn(node);
    }

    public void outAArrayMatrix(AArrayMatrix node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayMatrix(AArrayMatrix node)
    {
        inAArrayMatrix(node);
        if(node.getLBracketToken() != null)
        {
            node.getLBracketToken().apply(this);
        }
        if(node.getArray() != null)
        {
            node.getArray().apply(this);
        }
        if(node.getRBracketToken() != null)
        {
            node.getRBracketToken().apply(this);
        }
        outAArrayMatrix(node);
    }

    public void inAArray(AArray node)
    {
        defaultIn(node);
    }

    public void outAArray(AArray node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArray(AArray node)
    {
        inAArray(node);
        if(node.getRow() != null)
        {
            node.getRow().apply(this);
        }
        {
            List<PSemicolonRow> copy = new ArrayList<PSemicolonRow>(node.getAdditionalRows());
            for(PSemicolonRow e : copy)
            {
                e.apply(this);
            }
        }
        outAArray(node);
    }

    public void inAColumn(AColumn node)
    {
        defaultIn(node);
    }

    public void outAColumn(AColumn node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAColumn(AColumn node)
    {
        inAColumn(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        {
            List<PSemicolonValue> copy = new ArrayList<PSemicolonValue>(node.getAdditionalValues());
            for(PSemicolonValue e : copy)
            {
                e.apply(this);
            }
        }
        outAColumn(node);
    }

    public void inARow(ARow node)
    {
        defaultIn(node);
    }

    public void outARow(ARow node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARow(ARow node)
    {
        inARow(node);
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        {
            List<PCommaValue> copy = new ArrayList<PCommaValue>(node.getAdditionalValues());
            for(PCommaValue e : copy)
            {
                e.apply(this);
            }
        }
        outARow(node);
    }

    public void inACommaValue(ACommaValue node)
    {
        defaultIn(node);
    }

    public void outACommaValue(ACommaValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACommaValue(ACommaValue node)
    {
        inACommaValue(node);
        if(node.getCommaToken() != null)
        {
            node.getCommaToken().apply(this);
        }
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outACommaValue(node);
    }

    public void inASemicolonValue(ASemicolonValue node)
    {
        defaultIn(node);
    }

    public void outASemicolonValue(ASemicolonValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASemicolonValue(ASemicolonValue node)
    {
        inASemicolonValue(node);
        if(node.getSemicolonToken() != null)
        {
            node.getSemicolonToken().apply(this);
        }
        if(node.getValue() != null)
        {
            node.getValue().apply(this);
        }
        outASemicolonValue(node);
    }

    public void inASemicolonRow(ASemicolonRow node)
    {
        defaultIn(node);
    }

    public void outASemicolonRow(ASemicolonRow node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASemicolonRow(ASemicolonRow node)
    {
        inASemicolonRow(node);
        if(node.getSemicolonToken() != null)
        {
            node.getSemicolonToken().apply(this);
        }
        if(node.getRow() != null)
        {
            node.getRow().apply(this);
        }
        outASemicolonRow(node);
    }

    public void inAIntegerValue(AIntegerValue node)
    {
        defaultIn(node);
    }

    public void outAIntegerValue(AIntegerValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegerValue(AIntegerValue node)
    {
        inAIntegerValue(node);
        if(node.getInteger() != null)
        {
            node.getInteger().apply(this);
        }
        outAIntegerValue(node);
    }

    public void inAFloatingPointValue(AFloatingPointValue node)
    {
        defaultIn(node);
    }

    public void outAFloatingPointValue(AFloatingPointValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFloatingPointValue(AFloatingPointValue node)
    {
        inAFloatingPointValue(node);
        if(node.getFloatingPoint() != null)
        {
            node.getFloatingPoint().apply(this);
        }
        outAFloatingPointValue(node);
    }

    public void inABooleanValue(ABooleanValue node)
    {
        defaultIn(node);
    }

    public void outABooleanValue(ABooleanValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooleanValue(ABooleanValue node)
    {
        inABooleanValue(node);
        if(node.getBoolean() != null)
        {
            node.getBoolean().apply(this);
        }
        outABooleanValue(node);
    }

    public void inACharacterValue(ACharacterValue node)
    {
        defaultIn(node);
    }

    public void outACharacterValue(ACharacterValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharacterValue(ACharacterValue node)
    {
        inACharacterValue(node);
        if(node.getCharacterToken() != null)
        {
            node.getCharacterToken().apply(this);
        }
        outACharacterValue(node);
    }

    public void inAStringValue(AStringValue node)
    {
        defaultIn(node);
    }

    public void outAStringValue(AStringValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringValue(AStringValue node)
    {
        inAStringValue(node);
        if(node.getStringToken() != null)
        {
            node.getStringToken().apply(this);
        }
        outAStringValue(node);
    }

    public void inAIdentifierValue(AIdentifierValue node)
    {
        defaultIn(node);
    }

    public void outAIdentifierValue(AIdentifierValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifierValue(AIdentifierValue node)
    {
        inAIdentifierValue(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdentifierValue(node);
    }

    public void inANullValue(ANullValue node)
    {
        defaultIn(node);
    }

    public void outANullValue(ANullValue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANullValue(ANullValue node)
    {
        inANullValue(node);
        if(node.getNull() != null)
        {
            node.getNull().apply(this);
        }
        outANullValue(node);
    }

    public void inAIdentifier(AIdentifier node)
    {
        defaultIn(node);
    }

    public void outAIdentifier(AIdentifier node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentifier(AIdentifier node)
    {
        inAIdentifier(node);
        if(node.getIdentifierToken() != null)
        {
            node.getIdentifierToken().apply(this);
        }
        outAIdentifier(node);
    }

    public void inANull(ANull node)
    {
        defaultIn(node);
    }

    public void outANull(ANull node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANull(ANull node)
    {
        inANull(node);
        if(node.getNullToken() != null)
        {
            node.getNullToken().apply(this);
        }
        outANull(node);
    }

    public void inAInteger(AInteger node)
    {
        defaultIn(node);
    }

    public void outAInteger(AInteger node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInteger(AInteger node)
    {
        inAInteger(node);
        if(node.getIntegerToken() != null)
        {
            node.getIntegerToken().apply(this);
        }
        outAInteger(node);
    }

    public void inAFloatingPoint(AFloatingPoint node)
    {
        defaultIn(node);
    }

    public void outAFloatingPoint(AFloatingPoint node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFloatingPoint(AFloatingPoint node)
    {
        inAFloatingPoint(node);
        if(node.getFloatingPointToken() != null)
        {
            node.getFloatingPointToken().apply(this);
        }
        outAFloatingPoint(node);
    }

    public void inATrueBoolean(ATrueBoolean node)
    {
        defaultIn(node);
    }

    public void outATrueBoolean(ATrueBoolean node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATrueBoolean(ATrueBoolean node)
    {
        inATrueBoolean(node);
        if(node.getTrue() != null)
        {
            node.getTrue().apply(this);
        }
        outATrueBoolean(node);
    }

    public void inAFalseBoolean(AFalseBoolean node)
    {
        defaultIn(node);
    }

    public void outAFalseBoolean(AFalseBoolean node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFalseBoolean(AFalseBoolean node)
    {
        inAFalseBoolean(node);
        if(node.getFalse() != null)
        {
            node.getFalse().apply(this);
        }
        outAFalseBoolean(node);
    }

    public void inATrue(ATrue node)
    {
        defaultIn(node);
    }

    public void outATrue(ATrue node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATrue(ATrue node)
    {
        inATrue(node);
        if(node.getTrueToken() != null)
        {
            node.getTrueToken().apply(this);
        }
        outATrue(node);
    }

    public void inAFalse(AFalse node)
    {
        defaultIn(node);
    }

    public void outAFalse(AFalse node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFalse(AFalse node)
    {
        inAFalse(node);
        if(node.getFalseToken() != null)
        {
            node.getFalseToken().apply(this);
        }
        outAFalse(node);
    }
}
