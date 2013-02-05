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

import java.util.List;

/**
 * @author Peter Lachenmaier
 */
public class YammerThread extends YammerEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4349646315269171186L;
	
	// TODO stats
	/** The topics */
	private List<YammerTopic> topics;
	
	/** The id. */
	private String id;
	
	/** The thread starter id. */
	private String thread_starter_id;
	
	/** The url. */
	private String url;
	
	/** Wheter the thread has attachements or not. */
	private boolean has_attachements;
	
	/** Wheter it is a direct message or not. */
	private boolean direct_message;
	
	/** The web url. */
	private String web_url;
	
	/** The privacy. */
	private String privacy;

	/**
	 * @return the topics
	 */
	public List<YammerTopic> getTopics() {
		return topics;
	}

	/**
	 * @param topics the topics to set
	 */
	public void setTopics(List<YammerTopic> topics) {
		this.topics = topics;
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
	 * @return the thread_starter_id
	 */
	public String getThread_starter_id() {
		return thread_starter_id;
	}

	/**
	 * @param thread_starter_id the thread_starter_id to set
	 */
	public void setThread_starter_id(String thread_starter_id) {
		this.thread_starter_id = thread_starter_id;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the has_attachements
	 */
	public boolean isHas_attachements() {
		return has_attachements;
	}

	/**
	 * @param has_attachements the has_attachements to set
	 */
	public void setHas_attachements(boolean has_attachements) {
		this.has_attachements = has_attachements;
	}

	/**
	 * @return the direct_message
	 */
	public boolean isDirect_message() {
		return direct_message;
	}

	/**
	 * @param direct_message the direct_message to set
	 */
	public void setDirect_message(boolean direct_message) {
		this.direct_message = direct_message;
	}

	/**
	 * @return the web_url
	 */
	public String getWeb_url() {
		return web_url;
	}

	/**
	 * @param web_url the web_url to set
	 */
	public void setWeb_url(String web_url) {
		this.web_url = web_url;
	}

	/**
	 * @return the privacy
	 */
	public String getPrivacy() {
		return privacy;
	}

	/**
	 * @param privacy the privacy to set
	 */
	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
}
