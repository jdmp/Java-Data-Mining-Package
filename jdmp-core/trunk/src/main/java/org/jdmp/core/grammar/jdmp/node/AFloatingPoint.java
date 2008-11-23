/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.grammar.jdmp.node;

import org.jdmp.core.grammar.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class AFloatingPoint extends PFloatingPoint
{
    private TFloatingPointToken _floatingPointToken_;

    public AFloatingPoint()
    {
        // Constructor
    }

    public AFloatingPoint(
        @SuppressWarnings("hiding") TFloatingPointToken _floatingPointToken_)
    {
        // Constructor
        setFloatingPointToken(_floatingPointToken_);

    }

    @Override
    public Object clone()
    {
        return new AFloatingPoint(
            cloneNode(this._floatingPointToken_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFloatingPoint(this);
    }

    public TFloatingPointToken getFloatingPointToken()
    {
        return this._floatingPointToken_;
    }

    public void setFloatingPointToken(TFloatingPointToken node)
    {
        if(this._floatingPointToken_ != null)
        {
            this._floatingPointToken_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._floatingPointToken_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._floatingPointToken_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._floatingPointToken_ == child)
        {
            this._floatingPointToken_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._floatingPointToken_ == oldChild)
        {
            setFloatingPointToken((TFloatingPointToken) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
