/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class TMult extends Token
{
    public TMult()
    {
        super.setText("*");
    }

    public TMult(int line, int pos)
    {
        super.setText("*");
        setLine(line);
        setPos(pos);
    }

    
    public Object clone()
    {
      return new TMult(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTMult(this);
    }

    
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TMult text.");
    }
}
