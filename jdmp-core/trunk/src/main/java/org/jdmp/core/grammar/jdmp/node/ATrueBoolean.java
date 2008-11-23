/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.grammar.jdmp.node;

import org.jdmp.core.grammar.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class ATrueBoolean extends PBoolean
{
    private PTrue _true_;

    public ATrueBoolean()
    {
        // Constructor
    }

    public ATrueBoolean(
        @SuppressWarnings("hiding") PTrue _true_)
    {
        // Constructor
        setTrue(_true_);

    }

    @Override
    public Object clone()
    {
        return new ATrueBoolean(
            cloneNode(this._true_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATrueBoolean(this);
    }

    public PTrue getTrue()
    {
        return this._true_;
    }

    public void setTrue(PTrue node)
    {
        if(this._true_ != null)
        {
            this._true_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._true_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._true_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._true_ == child)
        {
            this._true_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._true_ == oldChild)
        {
            setTrue((PTrue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
