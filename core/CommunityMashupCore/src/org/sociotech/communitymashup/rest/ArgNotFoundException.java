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
public class ArgNotFoundException extends Exception {

	/**
	 * Generated serial version uid
	 */
	private static final long serialVersionUID = 910607782675657266L;
	private String caller;
	private String expectedArg;
	
	/**
	 * The default constructor.
	 * 
	 * @param caller The method throwing the error;
	 * @param expectedArg The name of the argument that would have been expected.
	 */
	public ArgNotFoundException(String caller, String expectedArg) {
		this.caller = caller;
		this.expectedArg = expectedArg;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		return "[" + caller + "]: expected the argument '" + expectedArg + "'.";
	}

}
