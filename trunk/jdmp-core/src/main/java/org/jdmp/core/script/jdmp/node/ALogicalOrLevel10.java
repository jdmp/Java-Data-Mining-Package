/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class ALogicalOrLevel10 extends PLevel10
{
    private PLevel10 _left_;
    private TLogicalOr _logicalOr_;
    private PLevel9 _right_;

    public ALogicalOrLevel10()
    {
        // Constructor
    }

    public ALogicalOrLevel10(
        @SuppressWarnings("hiding") PLevel10 _left_,
        @SuppressWarnings("hiding") TLogicalOr _logicalOr_,
        @SuppressWarnings("hiding") PLevel9 _right_)
    {
        // Constructor
        setLeft(_left_);

        setLogicalOr(_logicalOr_);

        setRight(_right_);

    }

    
    public Object clone()
    {
        return new ALogicalOrLevel10(
            cloneNode(this._left_),
            cloneNode(this._logicalOr_),
            cloneNode(this._right_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALogicalOrLevel10(this);
    }

    public PLevel10 getLeft()
    {
        return this._left_;
    }

    public void setLeft(PLevel10 node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TLogicalOr getLogicalOr()
    {
        return this._logicalOr_;
    }

    public void setLogicalOr(TLogicalOr node)
    {
        if(this._logicalOr_ != null)
        {
            this._logicalOr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._logicalOr_ = node;
    }

    public PLevel9 getRight()
    {
        return this._right_;
    }

    public void setRight(PLevel9 node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._logicalOr_)
            + toString(this._right_);
    }

    
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._logicalOr_ == child)
        {
            this._logicalOr_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PLevel10) newChild);
            return;
        }

        if(this._logicalOr_ == oldChild)
        {
            setLogicalOr((TLogicalOr) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PLevel9) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
