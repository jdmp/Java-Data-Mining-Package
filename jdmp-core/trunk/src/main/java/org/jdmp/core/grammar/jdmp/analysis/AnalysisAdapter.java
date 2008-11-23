/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.grammar.jdmp.analysis;

import java.util.*;
import org.jdmp.core.grammar.jdmp.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAScript(AScript node)
    {
        defaultCase(node);
    }

    public void caseAStatementCommand(AStatementCommand node)
    {
        defaultCase(node);
    }

    public void caseAAssignmentCommand(AAssignmentCommand node)
    {
        defaultCase(node);
    }

    public void caseASilentStatement(ASilentStatement node)
    {
        defaultCase(node);
    }

    public void caseAVerboseStatement(AVerboseStatement node)
    {
        defaultCase(node);
    }

    public void caseASilentAssignment(ASilentAssignment node)
    {
        defaultCase(node);
    }

    public void caseAVerboseAssignment(AVerboseAssignment node)
    {
        defaultCase(node);
    }

    public void caseAFactorExpression(AFactorExpression node)
    {
        defaultCase(node);
    }

    public void caseAPlusExpression(APlusExpression node)
    {
        defaultCase(node);
    }

    public void caseAMinusExpression(AMinusExpression node)
    {
        defaultCase(node);
    }

    public void caseATermFactor(ATermFactor node)
    {
        defaultCase(node);
    }

    public void caseAMultiplicationFactor(AMultiplicationFactor node)
    {
        defaultCase(node);
    }

    public void caseADivisionFactor(ADivisionFactor node)
    {
        defaultCase(node);
    }

    public void caseAMatrixTerm(AMatrixTerm node)
    {
        defaultCase(node);
    }

    public void caseAExpressionTerm(AExpressionTerm node)
    {
        defaultCase(node);
    }

    public void caseAScalarMatrix(AScalarMatrix node)
    {
        defaultCase(node);
    }

    public void caseAEmptyMatrix(AEmptyMatrix node)
    {
        defaultCase(node);
    }

    public void caseAValueMatrix(AValueMatrix node)
    {
        defaultCase(node);
    }

    public void caseARowMatrix(ARowMatrix node)
    {
        defaultCase(node);
    }

    public void caseAColumnMatrix(AColumnMatrix node)
    {
        defaultCase(node);
    }

    public void caseAArrayMatrix(AArrayMatrix node)
    {
        defaultCase(node);
    }

    public void caseAArray(AArray node)
    {
        defaultCase(node);
    }

    public void caseAColumn(AColumn node)
    {
        defaultCase(node);
    }

    public void caseARow(ARow node)
    {
        defaultCase(node);
    }

    public void caseACommaValue(ACommaValue node)
    {
        defaultCase(node);
    }

    public void caseASemicolonValue(ASemicolonValue node)
    {
        defaultCase(node);
    }

    public void caseASemicolonRow(ASemicolonRow node)
    {
        defaultCase(node);
    }

    public void caseAIntegerValue(AIntegerValue node)
    {
        defaultCase(node);
    }

    public void caseAFloatingPointValue(AFloatingPointValue node)
    {
        defaultCase(node);
    }

    public void caseABooleanValue(ABooleanValue node)
    {
        defaultCase(node);
    }

    public void caseACharacterValue(ACharacterValue node)
    {
        defaultCase(node);
    }

    public void caseAStringValue(AStringValue node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierValue(AIdentifierValue node)
    {
        defaultCase(node);
    }

    public void caseANullValue(ANullValue node)
    {
        defaultCase(node);
    }

    public void caseAIdentifier(AIdentifier node)
    {
        defaultCase(node);
    }

    public void caseANull(ANull node)
    {
        defaultCase(node);
    }

    public void caseAInteger(AInteger node)
    {
        defaultCase(node);
    }

    public void caseAFloatingPoint(AFloatingPoint node)
    {
        defaultCase(node);
    }

    public void caseATrueBoolean(ATrueBoolean node)
    {
        defaultCase(node);
    }

    public void caseAFalseBoolean(AFalseBoolean node)
    {
        defaultCase(node);
    }

    public void caseATrue(ATrue node)
    {
        defaultCase(node);
    }

    public void caseAFalse(AFalse node)
    {
        defaultCase(node);
    }

    public void caseTSemicolonToken(TSemicolonToken node)
    {
        defaultCase(node);
    }

    public void caseTPlusToken(TPlusToken node)
    {
        defaultCase(node);
    }

    public void caseTMinusToken(TMinusToken node)
    {
        defaultCase(node);
    }

    public void caseTMultiplicationToken(TMultiplicationToken node)
    {
        defaultCase(node);
    }

    public void caseTDivisionToken(TDivisionToken node)
    {
        defaultCase(node);
    }

    public void caseTCommaToken(TCommaToken node)
    {
        defaultCase(node);
    }

    public void caseTEqualsToken(TEqualsToken node)
    {
        defaultCase(node);
    }

    public void caseTLParToken(TLParToken node)
    {
        defaultCase(node);
    }

    public void caseTRParToken(TRParToken node)
    {
        defaultCase(node);
    }

    public void caseTLBracketToken(TLBracketToken node)
    {
        defaultCase(node);
    }

    public void caseTRBracketToken(TRBracketToken node)
    {
        defaultCase(node);
    }

    public void caseTNullToken(TNullToken node)
    {
        defaultCase(node);
    }

    public void caseTNewToken(TNewToken node)
    {
        defaultCase(node);
    }

    public void caseTTrueToken(TTrueToken node)
    {
        defaultCase(node);
    }

    public void caseTFalseToken(TFalseToken node)
    {
        defaultCase(node);
    }

    public void caseTIdentifierToken(TIdentifierToken node)
    {
        defaultCase(node);
    }

    public void caseTIntegerToken(TIntegerToken node)
    {
        defaultCase(node);
    }

    public void caseTFloatingPointToken(TFloatingPointToken node)
    {
        defaultCase(node);
    }

    public void caseTBooleanToken(TBooleanToken node)
    {
        defaultCase(node);
    }

    public void caseTCharacterToken(TCharacterToken node)
    {
        defaultCase(node);
    }

    public void caseTStringToken(TStringToken node)
    {
        defaultCase(node);
    }

    public void caseTWhiteSpaceToken(TWhiteSpaceToken node)
    {
        defaultCase(node);
    }

    public void caseTTraditionalCommentToken(TTraditionalCommentToken node)
    {
        defaultCase(node);
    }

    public void caseTDocumentationCommentToken(TDocumentationCommentToken node)
    {
        defaultCase(node);
    }

    public void caseTEndOfLineCommentToken(TEndOfLineCommentToken node)
    {
        defaultCase(node);
    }

    public void caseTMatlabCommentToken(TMatlabCommentToken node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
