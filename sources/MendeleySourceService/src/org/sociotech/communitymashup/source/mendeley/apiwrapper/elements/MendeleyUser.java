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
 * A mendeley user profile.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyUser extends MendeleyEntity {
	/**
	 * Generated serial version uid 
	 */
	private static final long serialVersionUID = 2597938026815153705L;
	
	private String profile_id;
	private String name;
	private String discipline_id;
	private String discipline_name;
	private String academic_status_id;
	private String academic_status;
	private String research_interests;
	private String location;
	private String bio;
	private String photo;
	private String url;
	private String last_synced;
	private String joined;	
		
	public String getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(String profile_id) {
		this.profile_id = profile_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscipline_id() {
		return discipline_id;
	}
	public void setDiscipline_id(String discipline_id) {
		this.discipline_id = discipline_id;
	}
	public String getDiscipline_name() {
		return discipline_name;
	}
	public void setDiscipline_name(String discipline_name) {
		this.discipline_name = discipline_name;
	}
	public String getAcademic_status_id() {
		return academic_status_id;
	}
	public void setAcademic_status_id(String academic_status_id) {
		this.academic_status_id = academic_status_id;
	}
	public String getAcademic_status() {
		return academic_status;
	}
	public void setAcademic_status(String academic_status) {
		this.academic_status = academic_status;
	}
	public String getResearch_interests() {
		return research_interests;
	}
	public void setResearch_interests(String research_interests) {
		this.research_interests = research_interests;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLast_synced() {
		return last_synced;
	}
	public void setLast_synced(String last_synced) {
		this.last_synced = last_synced;
	}
	public String getJoined() {
		return joined;
	}
	public void setJoined(String joined) {
		this.joined = joined;
	}
}
