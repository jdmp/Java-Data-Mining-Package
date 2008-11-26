/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class AArgumentListArgumentList extends PArgumentList
{
    private PArgumentList _argumentList_;
    private TComma _comma_;
    private PExpression _expression_;

    public AArgumentListArgumentList()
    {
        // Constructor
    }

    public AArgumentListArgumentList(
        @SuppressWarnings("hiding") PArgumentList _argumentList_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PExpression _expression_)
    {
        // Constructor
        setArgumentList(_argumentList_);

        setComma(_comma_);

        setExpression(_expression_);

    }

    @Override
    public Object clone()
    {
        return new AArgumentListArgumentList(
            cloneNode(this._argumentList_),
            cloneNode(this._comma_),
            cloneNode(this._expression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArgumentListArgumentList(this);
    }

    public PArgumentList getArgumentList()
    {
        return this._argumentList_;
    }

    public void setArgumentList(PArgumentList node)
    {
        if(this._argumentList_ != null)
        {
            this._argumentList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._argumentList_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._argumentList_)
            + toString(this._comma_)
            + toString(this._expression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._argumentList_ == child)
        {
            this._argumentList_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._argumentList_ == oldChild)
        {
            setArgumentList((PArgumentList) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
