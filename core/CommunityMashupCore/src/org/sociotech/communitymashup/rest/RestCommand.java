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

import java.util.LinkedList;

/**
 * A Class containing information regarding a RestCommand like the method name and the arguments.
 * 
 * @author Jan Philipp Fiedler (Jan.Fiedler@unibw.de)
 *
 */
public class RestCommand {
	private String command;
	private LinkedList<String> argNames;
	private LinkedList<Object> argValues;
	private boolean isGet = false;
	
	/**
	 * The default constructor.
	 * 
	 * @param command The name of the Java method.
	 */
	public RestCommand(String command) {
		argNames = new LinkedList<String>();
		argValues = new LinkedList<Object>();
		this.command = command;
		if(command != null && command.startsWith("get"))
		{
			isGet = true;
		}
	}
	
	public String getCommand() {
		return command;
	}

	/**
	 * Returns the value of the specified argument or throws an error.
	 * The arguments name is not case-sensitive.
	 * 
	 * @param argName The name of the argument.
	 * @return The value of the argument. Not case-sensitive.
	 * @throws ArgNotFoundException
	 */
	public Object getArg(String argName) throws ArgNotFoundException {
		int index = argNames.indexOf(argName.toLowerCase());
		if (index != -1) {
			return argValues.get(index);
		}
		throw new ArgNotFoundException(command, argName);
	}
	
	public Object getArgValue(int index) {
		return argValues.get(index);
	}
	public int getArgCount() {
		return argNames.size();
	}
	
	/**
	 * Adds the argument to the list of arguments.
	 * 
	 * @param argName The name of the argument.
	 * @param argValue The value of the argument.
	 * @return The RestCommand.
	 */
	public RestCommand addArg(String argName, Object argValue) {
		this.argNames.add(argName.toLowerCase());
		this.argValues.add(argValue);
		return this;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s = this.command;
		for (int i = 0; i < argNames.size(); i++) {
			s += "|" + argNames.get(i) + "=" + argValues.get(i);
		}
		return s;
	}

	/**
	 * Removes the specified argument.
	 * 
	 * @param argName The name of the argument to be removed.
	 * @return Whether the argument was in the list.
	 */
	public boolean removeArg(String argName) {
		int index = argNames.indexOf(argName.toLowerCase());
		if (index != -1) {
			argNames.remove(index);
			argValues.remove(index);
			return true;
		}
		return false;
	}

	/**
	 * Returns true if this command is a get command
	 * 
	 * @return True if this command is a get command
	 */
	public boolean isGet() {
		return isGet;
	}
}
