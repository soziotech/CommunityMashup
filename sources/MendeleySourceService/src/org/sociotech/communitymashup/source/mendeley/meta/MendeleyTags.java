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
package org.sociotech.communitymashup.source.mendeley.meta;

/**
 * @author Peter Lachenmaier
 *
 * Collection of Tags used in the Mendeley Source Service
 */
public class MendeleyTags {

	/**
	 * Constant string to tag mendeley objects with
	 */
	public static final String MENDELEY = "mendeley";
	
	/**
	 * Constant string to tag mendeley file attachements with
	 */
	public static final String MENDELEY_DOCUMENT = "mendeley_document";
	
	/**
	 * Tag for mendeley profile web sites 
	 */
	public static final String MENDELEY_PROFILE = "mendeley_profile";
	
	/**
	 * Tag for mendeley groups 
	 */
	public static final String MENDELEY_GROUP = "mendeley_group";

	/**
	 * Tag for mendeley users groups 
	 */
	public static final String MENDELEY_USERS_GROUP = "mendeley_private_group";

	/**
	 * Tag for mendeley public groups 
	 */
	public static final String MENDELEY_PUBLIC_GROUP = "mendeley_public_group";

	/**
	 * Tag for all mendeley group documents 
	 */
	public static final String GROUP_DOCUMENT = "group_document";
	
	/**
	 * MetaTag for all owner connections between groups and owners
	 */
	public static final String GROUP_OWNER_CONNECTION = "group_owner";
	
	/**
	 * MetaTag for all owner connections between groups and admins
	 */
	public static final String GROUP_ADMIN_CONNECTION = "group_admin";
	
	/**
	 * MetaTag for all owner connections between groups and members
	 */
	public static final String GROUP_MEMBER_CONNECTION = "group_member";
	
	/**
	 * Tag for all authored documents of the account owner 
	 */
	public static final String AUTHORED_DOCUMENT = "authored_document";
}

