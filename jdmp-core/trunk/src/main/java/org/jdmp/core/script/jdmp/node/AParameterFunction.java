/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class AParameterFunction extends PFunction
{
    private PName _name_;
    private TLParenthese _lParenthese_;
    private PArgumentList _argumentList_;
    private TRParenthese _rParenthese_;

    public AParameterFunction()
    {
        // Constructor
    }

    public AParameterFunction(
        @SuppressWarnings("hiding") PName _name_,
        @SuppressWarnings("hiding") TLParenthese _lParenthese_,
        @SuppressWarnings("hiding") PArgumentList _argumentList_,
        @SuppressWarnings("hiding") TRParenthese _rParenthese_)
    {
        // Constructor
        setName(_name_);

        setLParenthese(_lParenthese_);

        setArgumentList(_argumentList_);

        setRParenthese(_rParenthese_);

    }

    @Override
    public Object clone()
    {
        return new AParameterFunction(
            cloneNode(this._name_),
            cloneNode(this._lParenthese_),
            cloneNode(this._argumentList_),
            cloneNode(this._rParenthese_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAParameterFunction(this);
    }

    public PName getName()
    {
        return this._name_;
    }

    public void setName(PName node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public TLParenthese getLParenthese()
    {
        return this._lParenthese_;
    }

    public void setLParenthese(TLParenthese node)
    {
        if(this._lParenthese_ != null)
        {
            this._lParenthese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lParenthese_ = node;
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

    public TRParenthese getRParenthese()
    {
        return this._rParenthese_;
    }

    public void setRParenthese(TRParenthese node)
    {
        if(this._rParenthese_ != null)
        {
            this._rParenthese_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rParenthese_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._name_)
            + toString(this._lParenthese_)
            + toString(this._argumentList_)
            + toString(this._rParenthese_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._lParenthese_ == child)
        {
            this._lParenthese_ = null;
            return;
        }

        if(this._argumentList_ == child)
        {
            this._argumentList_ = null;
            return;
        }

        if(this._rParenthese_ == child)
        {
            this._rParenthese_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._name_ == oldChild)
        {
            setName((PName) newChild);
            return;
        }

        if(this._lParenthese_ == oldChild)
        {
            setLParenthese((TLParenthese) newChild);
            return;
        }

        if(this._argumentList_ == oldChild)
        {
            setArgumentList((PArgumentList) newChild);
            return;
        }

        if(this._rParenthese_ == oldChild)
        {
            setRParenthese((TRParenthese) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
