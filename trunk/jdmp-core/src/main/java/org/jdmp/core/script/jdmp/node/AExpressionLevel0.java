/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import org.jdmp.core.script.jdmp.analysis.Analysis;

@SuppressWarnings("nls")
public final class AExpressionLevel0 extends PLevel0 {
	private TLParenthese _lParenthese_;
	private PExpression _expression_;
	private TRParenthese _rParenthese_;

	public AExpressionLevel0() {
		// Constructor
	}

	public AExpressionLevel0(@SuppressWarnings("hiding") TLParenthese _lParenthese_,
			@SuppressWarnings("hiding") PExpression _expression_,
			@SuppressWarnings("hiding") TRParenthese _rParenthese_) {
		// Constructor
		setLParenthese(_lParenthese_);

		setExpression(_expression_);

		setRParenthese(_rParenthese_);

	}

	public Object clone() {
		return new AExpressionLevel0(cloneNode(this._lParenthese_), cloneNode(this._expression_),
				cloneNode(this._rParenthese_));
	}

	public void apply(Switch sw) {
		((Analysis) sw).caseAExpressionLevel0(this);
	}

	public TLParenthese getLParenthese() {
		return this._lParenthese_;
	}

	public void setLParenthese(TLParenthese node) {
		if (this._lParenthese_ != null) {
			this._lParenthese_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._lParenthese_ = node;
	}

	public PExpression getExpression() {
		return this._expression_;
	}

	public void setExpression(PExpression node) {
		if (this._expression_ != null) {
			this._expression_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._expression_ = node;
	}

	public TRParenthese getRParenthese() {
		return this._rParenthese_;
	}

	public void setRParenthese(TRParenthese node) {
		if (this._rParenthese_ != null) {
			this._rParenthese_.parent(null);
		}

		if (node != null) {
			if (node.parent() != null) {
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		this._rParenthese_ = node;
	}

	public String toString() {
		return "" + toString(this._lParenthese_) + toString(this._expression_)
				+ toString(this._rParenthese_);
	}

	void removeChild(@SuppressWarnings("unused") Node child) {
		// Remove child
		if (this._lParenthese_ == child) {
			this._lParenthese_ = null;
			return;
		}

		if (this._expression_ == child) {
			this._expression_ = null;
			return;
		}

		if (this._rParenthese_ == child) {
			this._rParenthese_ = null;
			return;
		}

		throw new RuntimeException("Not a child.");
	}

	void replaceChild(@SuppressWarnings("unused") Node oldChild,
			@SuppressWarnings("unused") Node newChild) {
		// Replace child
		if (this._lParenthese_ == oldChild) {
			setLParenthese((TLParenthese) newChild);
			return;
		}

		if (this._expression_ == oldChild) {
			setExpression((PExpression) newChild);
			return;
		}

		if (this._rParenthese_ == oldChild) {
			setRParenthese((TRParenthese) newChild);
			return;
		}

		throw new RuntimeException("Not a child.");
	}
}
