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
 * A mendeley group in users library.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyUsersGroup extends MendeleyEntity {
	
	/**
	 * Generate serial version uid
	 */
	private static final long serialVersionUID = -4479179269870660423L;
	
	private String id;
	private String name;
	private String description;
	private List<String> disciplines;
	private List<String> tags;
	private MendeleyProfilePhoto photo;
	private String created;
	private String owning_profile_id;
	private String link;
	private String access_level;
	private String role;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getDisciplines() {
		return disciplines;
	}
	public void setDisciplines(List<String> disciplines) {
		this.disciplines = disciplines;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public MendeleyProfilePhoto getPhoto() {
		return photo;
	}
	public void setPhoto(MendeleyProfilePhoto photo) {
		this.photo = photo;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getOwning_profile_id() {
		return owning_profile_id;
	}
	public void setOwning_profile_id(String owning_profile_id) {
		this.owning_profile_id = owning_profile_id;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getAccess_level() {
		return access_level;
	}
	public void setAccess_level(String access_level) {
		this.access_level = access_level;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
