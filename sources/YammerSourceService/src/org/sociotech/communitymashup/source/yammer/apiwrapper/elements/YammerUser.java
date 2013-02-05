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
public class YammerUser extends YammerEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7755281883224678597L;

	/** The name. */
	private String full_name;
	
	/** The Mugshot url. Url of the profile image*/
	private String mugshot_url;
	
	/** The department. */
	private String department;
	
	/** The user id. */
	private String id;
	
	/** The job title */
	private String job_title;
	
	/**
	 * @return the full_name
	 */
	public String getFull_name() {
		return full_name;
	}

	/**
	 * @param full_name the full_name to set
	 */
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	/**
	 * @return the mugshot_url
	 */
	public String getMugshot_url() {
		return mugshot_url;
	}

	/**
	 * @param mugshot_url the mugshot_url to set
	 */
	public void setMugshot_url(String mugshot_url) {
		this.mugshot_url = mugshot_url;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the job_title
	 */
	public String getJob_title() {
		return job_title;
	}

	/**
	 * @param job_title the job_title to set
	 */
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	
}
