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
package org.sociotech.communitymashup.source.mendeley.sdkadaption;

import com.mendeley.oapi.schema.SchemaEntity;

public class Editor extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3223797937262129796L;
	
	/** The forename. */
	private String forename;
	
	/** The surname. */
	private String surname;

	/**
	 * Returns the forename
	 * 
	 * @return the forename
	 */
	public String getForename() {
		return forename;
	}

	/**
	 * Sets the forename
	 * 
	 * @param forename the forename to set
	 */
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	/**
	 * Returns the surename
	 * 
	 * @return the surename
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Sets the surename
	 * 
	 * @param surname the forename to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
