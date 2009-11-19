/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class TDotRdiv extends Token
{
    public TDotRdiv()
    {
        super.setText("./");
    }

    public TDotRdiv(int line, int pos)
    {
        super.setText("./");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDotRdiv(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDotRdiv(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDotRdiv text.");
    }
}