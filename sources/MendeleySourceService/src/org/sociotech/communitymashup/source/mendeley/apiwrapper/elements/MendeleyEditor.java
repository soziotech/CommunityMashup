/*******************************************************************************
 * Copyright (c) 2014 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.mendeley.apiwrapper.elements;

/**
 * A mendeley editor as wrapper object for editors in document details.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyEditor extends MendeleyEntity {
	
	/**
	 * Generate serial version uid
	 */
	private static final long serialVersionUID = 2026989340247496726L;
	
	private String forename;
	private String surname;
	
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surename) {
		this.surname = surename;
	}
}
