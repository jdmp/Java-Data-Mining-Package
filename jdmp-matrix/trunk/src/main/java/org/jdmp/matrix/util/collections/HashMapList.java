/*
 * Copyright (C) 2008 Holger Arndt, Andreas Naegele and Markus Bundschus
 *
 * This file is part of the Java Data Mining Package (JDMP).
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership and licensing.
 *
 * JDMP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * JDMP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with JDMP; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.jdmp.matrix.util.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapList<K, V> extends HashMap<K, V> {
	private static final long serialVersionUID = -3287449965373105826L;

	public HashMapList() {
		super();
	}

	public HashMapList(Map<? extends K, ? extends V> m) {
		super(m);
	}

	public synchronized V put(K key, V value) {
		return super.put(key, value);
	}

	public synchronized int indexOf(V value) {
		Iterator<V> it = values().iterator();
		for (int i = 0; it.hasNext(); i++) {
			if (it.next().equals(value)) {
				return i;
			}
		}
		return -1;
	}

	public synchronized V get(int index) {
		Iterator<V> it = values().iterator();
		for (int i = 0; it.hasNext() && i < index; i++) {
			it.next();
		}
		return it.hasNext() ? it.next() : null;
	}

	public synchronized V remove(Object key) {
		return super.remove(key);
	}

}
