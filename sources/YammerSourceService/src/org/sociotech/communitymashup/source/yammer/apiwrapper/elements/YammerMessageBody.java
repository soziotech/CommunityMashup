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
package org.sociotech.communitymashup.source.yammer.apiwrapper.elements;

/**
 * @author Peter Lachenmaier
 */
public class YammerMessageBody extends YammerEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2677100458097601473L;

	/** The parsed body */
	private String parsed;
	
	/** The plain body */
	private String plain;

	/** The rich body */
	private String rich;

	/**
	 * @return the parsed
	 */
	public String getParsed() {
		return parsed;
	}

	/**
	 * @param parsed the parsed to set
	 */
	public void setParsed(String parsed) {
		this.parsed = parsed;
	}

	/**
	 * @return the plain
	 */
	public String getPlain() {
		return plain;
	}

	/**
	 * @param plain the plain to set
	 */
	public void setPlain(String plain) {
		this.plain = plain;
	}

	/**
	 * @return the rich
	 */
	public String getRich() {
		return rich;
	}

	/**
	 * @param rich the rich to set
	 */
	public void setRich(String rich) {
		this.rich = rich;
	}
	
}
