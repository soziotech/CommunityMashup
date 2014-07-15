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

import java.util.List;

/**
 * The container for mendeley public group documents with details.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyPublicGroupDetails extends MendeleyEntity {
	
	/**
	 * Generate serial version uid
	 */
	private static final long serialVersionUID = 3159617667555368736L;
	
	// skipping discipline, cause it can be object or list
	//private MendeleyDiscipline disciplines;
	private String id;
	private String name;
	private String owner;
	private String public_url;
	private int total_documents;
	private List<String> tags;
	
	// TODO open
	// people (just count of admins followers and members)
		
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPublic_url() {
		return public_url;
	}
	public void setPublic_url(String public_url) {
		this.public_url = public_url;
	}
	public int getTotal_documents() {
		return total_documents;
	}
	public void setTotal_documents(int total_documents) {
		this.total_documents = total_documents;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
}
