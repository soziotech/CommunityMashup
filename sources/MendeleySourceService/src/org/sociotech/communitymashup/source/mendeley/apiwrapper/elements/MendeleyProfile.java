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
 * A mendeley profile as wrapper object for user
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyProfile extends MendeleyEntity {
	
	/**
	 * Generated serial version uid
	 */
	private static final long serialVersionUID = 335422166852216787L;
	
	private String id;
	private String first_name;
	private String last_name;
	private String display_name;
	private String email;
	private String link;
	private String institution;
	private String academic_status;
	private MendeleyDiscipline discipline;
	private List<MendeleyDiscipline> disciplines;
	private MendeleyProfilePhoto photo;
	private boolean verified;
	private boolean marketing;
	private String user_type;
	private String created;
	private String title;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDisplay_name() {
		return display_name;
	}
	public void setDisplay_name(String display_name) {
		this.display_name = display_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getAcademic_status() {
		return academic_status;
	}
	public void setAcademic_status(String academic_status) {
		this.academic_status = academic_status;
	}
	public MendeleyDiscipline getDiscipline() {
		return discipline;
	}
	public void setDiscipline(MendeleyDiscipline discipline) {
		this.discipline = discipline;
	}
	public List<MendeleyDiscipline> getDisciplines() {
		return disciplines;
	}
	public void setDisciplines(List<MendeleyDiscipline> disciplines) {
		this.disciplines = disciplines;
	}
	public MendeleyProfilePhoto getPhoto() {
		return photo;
	}
	public void setPhoto(MendeleyProfilePhoto photo) {
		this.photo = photo;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public boolean isMarketing() {
		return marketing;
	}
	public void setMarketing(boolean marketing) {
		this.marketing = marketing;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	// TBD
	// institution_details
	// photos
	// location
	// education
	
	
}
