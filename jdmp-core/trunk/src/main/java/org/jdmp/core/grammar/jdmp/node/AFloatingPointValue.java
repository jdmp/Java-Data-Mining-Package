/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.grammar.jdmp.node;

import org.jdmp.core.grammar.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class AFloatingPointValue extends PValue
{
    private PFloatingPoint _floatingPoint_;

    public AFloatingPointValue()
    {
        // Constructor
    }

    public AFloatingPointValue(
        @SuppressWarnings("hiding") PFloatingPoint _floatingPoint_)
    {
        // Constructor
        setFloatingPoint(_floatingPoint_);

    }

    @Override
    public Object clone()
    {
        return new AFloatingPointValue(
            cloneNode(this._floatingPoint_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFloatingPointValue(this);
    }

    public PFloatingPoint getFloatingPoint()
    {
        return this._floatingPoint_;
    }

    public void setFloatingPoint(PFloatingPoint node)
    {
        if(this._floatingPoint_ != null)
        {
            this._floatingPoint_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._floatingPoint_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._floatingPoint_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._floatingPoint_ == child)
        {
            this._floatingPoint_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._floatingPoint_ == oldChild)
        {
            setFloatingPoint((PFloatingPoint) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
