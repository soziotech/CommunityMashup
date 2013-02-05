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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Peter Lachenmaier
 */
public class YammerMessage extends YammerEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 244453495467983791L;

	/** The creation date. */
	private String created_at;
	
	/** The message id. */
	private String id;
	
	/** The message body. */
	private YammerMessageBody body;
	
	/** The sender type. */
	private String sender_type;
	
	/** The network id. */
	private String network_id;
	
	/** The thread id. */
	private String thread_id;
	
	/** The url. */
	private String url;
	
	/** The client type. */
	private String client_type;
	
	/** The message type. */
	private String message_type;
	
	/** The web url. */
	private String web_url;
	
	/** The sender id. */
	private String sender_id;
	
	/** The replied to id. */
	private String replied_to_id;
	
	/** The attachements. */
	private List<YammerMessageAttachement> attachements;
	
	/** The likes of this message. */
	private YammerLike liked_by;
	
	/** The privacy. */
	private String privacy;

	/**
	 * @return the created_at
	 */
	public String getCreated_at() {
		return created_at;
	}

	/**
	 * Returns the attribute created_at as Date object
	 * @return The attribute created_at as Date object
	 */
	public Date getCreatedDate()
	{
		if(created_at == null)
		{
			return null;
		}
		
		// Sample: 2011/03/28 20:39:12 +0000
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss Z");
		Date date = null;
		try {
			date = format.parse(created_at);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return date;
	}
	
	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the id as int
	 */
	public int getIntId() {
		return Integer.parseInt(getId());
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the body
	 */
	public YammerMessageBody getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(YammerMessageBody body) {
		this.body = body;
	}

	/**
	 * @return the sender_type
	 */
	public String getSender_type() {
		return sender_type;
	}

	/**
	 * @param sender_type the sender_type to set
	 */
	public void setSender_type(String sender_type) {
		this.sender_type = sender_type;
	}

	/**
	 * @return the network_id
	 */
	public String getNetwork_id() {
		return network_id;
	}

	/**
	 * @param network_id the network_id to set
	 */
	public void setNetwork_id(String network_id) {
		this.network_id = network_id;
	}

	/**
	 * @return the thread_id
	 */
	public String getThread_id() {
		return thread_id;
	}

	/**
	 * @param thread_id the thread_id to set
	 */
	public void setThread_id(String thread_id) {
		this.thread_id = thread_id;
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
	 * @return the client_type
	 */
	public String getClient_type() {
		return client_type;
	}

	/**
	 * @param client_type the client_type to set
	 */
	public void setClient_type(String client_type) {
		this.client_type = client_type;
	}

	/**
	 * @return the message_type
	 */
	public String getMessage_type() {
		return message_type;
	}

	/**
	 * @param message_type the message_type to set
	 */
	public void setMessage_type(String message_type) {
		this.message_type = message_type;
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
	 * @return the sender_id
	 */
	public String getSender_id() {
		return sender_id;
	}

	/**
	 * @param sender_id the sender_id to set
	 */
	public void setSender_id(String sender_id) {
		this.sender_id = sender_id;
	}

	/**
	 * @return the replied_to_id
	 */
	public String getReplied_to_id() {
		return replied_to_id;
	}

	/**
	 * @param replied_to_id the replied_to_id to set
	 */
	public void setReplied_to_id(String replied_to_id) {
		this.replied_to_id = replied_to_id;
	}

	/**
	 * @return the attachements
	 */
	public List<YammerMessageAttachement> getAttachements() {
		return attachements;
	}

	/**
	 * @param attachements the attachements to set
	 */
	public void setAttachements(List<YammerMessageAttachement> attachements) {
		this.attachements = attachements;
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

	/**
	 * @return the liked_by
	 */
	public YammerLike getLiked_by() {
		return liked_by;
	}

	/**
	 * @param liked_by the liked_by to set
	 */
	public void setLiked_by(YammerLike liked_by) {
		this.liked_by = liked_by;
	}
}
