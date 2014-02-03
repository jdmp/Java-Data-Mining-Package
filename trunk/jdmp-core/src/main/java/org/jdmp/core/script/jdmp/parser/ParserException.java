/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.parser;

import org.jdmp.core.script.jdmp.node.Token;

@SuppressWarnings("serial")
public class ParserException extends Exception {
	Token token;

	public ParserException(@SuppressWarnings("hiding") Token token, String message) {
		super(message);
		this.token = token;
	}

	public Token getToken() {
		return this.token;
	}
}
