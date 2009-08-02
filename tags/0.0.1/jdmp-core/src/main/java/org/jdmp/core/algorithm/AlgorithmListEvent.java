package org.jdmp.core.algorithm;

import org.jdmp.core.util.AbstractEvent;
import org.jdmp.core.util.AbstractGUIObject;

public class AlgorithmListEvent extends AbstractEvent {
	private static final long serialVersionUID = -511897235503692075L;

	public AlgorithmListEvent(Object source, EventType type, Object... data) {
		super((AbstractGUIObject) source, type, data);
	}
}
