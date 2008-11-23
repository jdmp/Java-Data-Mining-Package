/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.grammar.jdmp.node;

import org.jdmp.core.grammar.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class TIntegerToken extends Token
{
    public TIntegerToken(String text)
    {
        setText(text);
    }

    public TIntegerToken(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIntegerToken(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIntegerToken(this);
    }
}
