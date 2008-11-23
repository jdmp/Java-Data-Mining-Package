/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.grammar.jdmp.node;

import org.jdmp.core.grammar.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class AInteger extends PInteger
{
    private TIntegerToken _integerToken_;

    public AInteger()
    {
        // Constructor
    }

    public AInteger(
        @SuppressWarnings("hiding") TIntegerToken _integerToken_)
    {
        // Constructor
        setIntegerToken(_integerToken_);

    }

    @Override
    public Object clone()
    {
        return new AInteger(
            cloneNode(this._integerToken_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInteger(this);
    }

    public TIntegerToken getIntegerToken()
    {
        return this._integerToken_;
    }

    public void setIntegerToken(TIntegerToken node)
    {
        if(this._integerToken_ != null)
        {
            this._integerToken_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._integerToken_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._integerToken_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._integerToken_ == child)
        {
            this._integerToken_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._integerToken_ == oldChild)
        {
            setIntegerToken((TIntegerToken) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
