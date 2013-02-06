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
public class WrongArgException extends Exception {
	/**
	 * Generated serial version uid
	 */
	private static final long serialVersionUID = -7030524040544451267L;
	private String caller;
	private String expected;
	private String received;
	
	/**
	 * An extended constructor.
	 * 
	 * @param caller The method throwing the error.
	 * @param expected The expected argument type.
	 * @param received The received argument type.
	 */
	public WrongArgException(String caller, String expected, String received) {
		super();
		this.caller = caller;
		this.received = received;
		this.expected = expected;
	}
	
	/**
	 * The default constructor.
	 * 
	 * @param caller The method throwing the error.
	 * @param received The received argument type.
	 */
	public WrongArgException(String caller, String received) {
		super();
		this.caller = caller;
		this.received = received;
		this.expected = null;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		if (this.expected == null) {
			if (this.received == null) {
				return "[" + caller + "]: Received wrong argument type.";
			} else {
				return "[" + caller + "]: Received wrong argument type, expected '" + received + "'.";
			}
		}
		return "[" + caller + "]: Expected '" + expected + "' but received '" + received + "'.";
	}

}
