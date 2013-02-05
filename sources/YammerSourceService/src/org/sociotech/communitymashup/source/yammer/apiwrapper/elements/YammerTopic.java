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
public class YammerTopic extends YammerEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1653577626439011196L;
	
	/** The name. */
	private String name;
	
	/** The normalized name. */
	private String normalized_name;
	
	/** The url. */
	private String url;
	
	/** The web url. */
	private String web_url;
	
	/** The topic id. */
	private String id;
	
	/** The permalink */
	private String permalink;

	// TODO experts, references
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the normalized_name
	 */
	public String getNormalized_name() {
		return normalized_name;
	}

	/**
	 * @param normalized_name the normalized_name to set
	 */
	public void setNormalized_name(String normalized_name) {
		this.normalized_name = normalized_name;
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
	 * @return the permalink
	 */
	public String getPermalink() {
		return permalink;
	}

	/**
	 * @param permalink the permalink to set
	 */
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
}
