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
 * A mendeley profile as wrapper object for user
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyProfile extends MendeleyEntity {
	
	/**
	 * Generate serial version uid
	 */
	private static final long serialVersionUID = 8195659655700903991L;
	
	private MendeleyUser main;
	private MendeleyContactSection contact;
	
	//TODO unused
	//awards 
	//cv 
			
	public MendeleyUser getMain() {
		return main;
	}

	public void setMain(MendeleyUser main) {
		this.main = main;
	}

	public MendeleyContactSection getContact() {
		return contact;
	}

	public void setContact(MendeleyContactSection contact) {
		this.contact = contact;
	}
}
