/*
 * Copyright (C) 2008-2009 Holger Arndt, A. Naegele and M. Bundschus
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

package org.jdmp.jetty;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.jdmp.jetty.collections.JettyMapClient;
import org.ujmp.core.collections.AbstractMapTest;

public class TestJettyMap extends AbstractMapTest {

	private JettyObjectServer server = null;

	public void setUp() throws Exception {
		Map<Object, Object> originalMap = new HashMap<Object, Object>();
		server = new JettyObjectServer(originalMap, 5555);
		server.start();
	}

	@Override
	public Map<String, Object> createMap() throws Exception {
		JettyMapClient<String, Object> map = new JettyMapClient<String, Object>(
				new URL("http://localhost:5555"));
		return map;
	}

	public void tearDown() throws Exception {
		server.stop();
		server = null;
	}
}