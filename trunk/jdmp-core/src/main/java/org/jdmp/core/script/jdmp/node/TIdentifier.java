/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class TIdentifier extends Token
{
    public TIdentifier(String text)
    {
        setText(text);
    }

    public TIdentifier(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    
    public Object clone()
    {
      return new TIdentifier(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIdentifier(this);
    }
}
