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
package org.sociotech.communitymashup.source.yammer.constant;

/**
 * This class contains constants for all needed Urls communitcating with the Yammer API.
 * 
 * @author Peter Lachenmaier
 *
 */
public class YammerAPIUrls {
	
	public static final String GET_USERS = "https://www.yammer.com/api/v1/users.json";

	public static final String GET_MESSAGES = "https://www.yammer.com/api/v1/messages.json";
	
	public static final String GET_LIKED_MESSAGES = "https://www.yammer.com/api/v1/messages/liked_by/current.json";
	
	public static final String GET_MESSAGE_WITH_ID = "https://www.yammer.com/api/v1/messages/%s.json";
	
	public static final String GET_USER_WITH_ID = "https://www.yammer.com/api/v1/users/%s.json";

	public static final String POST_LIKE_WITH_USERID = "https://www.yammer.com/api/v1/messages/liked_by/%s.json";
	
	public static final String POST_MESSAGES = "https://www.yammer.com/api/v1/messages.json";
	
}
