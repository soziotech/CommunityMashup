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
public class YammerMessageAttachement extends YammerEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3226281154739738632L;
		
	/** The type. */
	private String type;
	
	/** The content type. */
	private String content_type;
	
	/** The web url. */
	private String web_url;
	
	/** The y id. */
	private String y_id;
	
	/** The name. */
	private String name;
	
	/** The id. */
	private String id;

	// TODO image
	

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the content_type
	 */
	public String getContent_type() {
		return content_type;
	}

	/**
	 * @param content_type the content_type to set
	 */
	public void setContent_type(String content_type) {
		this.content_type = content_type;
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
	 * @return the y_id
	 */
	public String getY_id() {
		return y_id;
	}

	/**
	 * @param y_id the y_id to set
	 */
	public void setY_id(String y_id) {
		this.y_id = y_id;
	}

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

}
