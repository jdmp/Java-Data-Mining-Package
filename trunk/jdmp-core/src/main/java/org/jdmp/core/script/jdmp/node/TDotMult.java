/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class TDotMult extends Token
{
    public TDotMult()
    {
        super.setText(".*");
    }

    public TDotMult(int line, int pos)
    {
        super.setText(".*");
        setLine(line);
        setPos(pos);
    }

    
    public Object clone()
    {
      return new TDotMult(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDotMult(this);
    }

    
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDotMult text.");
    }
}
