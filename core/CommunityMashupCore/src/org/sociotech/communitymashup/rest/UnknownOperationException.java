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
public class UnknownOperationException extends Exception {
	/**
	 * Generated serial version uid
	 */
	private static final long serialVersionUID = 3997398501628409434L;
	private Object caller;
	private RestCommand command;
	
	/**
	 * The default constructor.
	 * 
	 * @param caller The method throwing the error.
	 * @param command The name of the unknown operation.
	 */
	public UnknownOperationException(Object caller, RestCommand command) {
		super();
		this.caller = caller;
		this.command = command;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		String s = "[" + caller.getClass().getName() + "]: Unknown operation: " + command.getCommand() + "(";
		boolean firstArg = true;
		for (int i = 0; i<command.getArgCount(); i++){
			if (firstArg) {
				firstArg = false;
				s += command.getArgValue(i).getClass().getName();
			} else {
				s += ", " + command.getArgValue(i).getClass().getName();
			}
		}
		return s + ").";
	}
}
