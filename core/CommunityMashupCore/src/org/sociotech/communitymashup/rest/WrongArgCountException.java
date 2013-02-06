/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.rest;

/**
 * A customized Exception for the REST-Interface.
 * 
 * @author Jan Philipp Fiedler (Jan.Fiedler@unibw.de)
 *
 */
public class WrongArgCountException extends Exception {
	
	/**
	 * Generated serial version uid
	 */
	private static final long serialVersionUID = 8863883658838608055L;
	private String caller;
	private int expectedCount;
	private int receivedCount;
	
	public WrongArgCountException(String caller, int expectedCount, int receivedCount) {
		super();
		this.caller = caller;
		this.expectedCount = expectedCount;
		this.receivedCount = receivedCount;
	}

	@Override
	public String getMessage() {
		if (expectedCount == 1) 
			return "[" + caller + "]: Expected " + expectedCount + " argument but received " + receivedCount + ".";
		else 
			return "[" + caller + "]: Expected " + expectedCount + " arguments but received " + receivedCount + ".";
	}
}
