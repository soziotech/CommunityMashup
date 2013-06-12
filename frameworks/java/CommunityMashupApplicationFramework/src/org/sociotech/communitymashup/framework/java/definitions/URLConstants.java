/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.framework.java.definitions;

/**
 * This class contains constant definitions for CommunityMashup Urls
 * 
 * @author Peter Lachenmaier
 *
 */
public class URLConstants {

	/**
	 * Operation to get the date of the last modification.
	 */
	public static final String GET_LAST_MODIFIED = "getLastModified";
	
	/**
	 * Operation to get the items modified since a defined date.
	 */
	public static final String GET_ITEMS_MODIFIED_SINCE = "getItemsModifiedSince?date=%s";
	
	/**
	 * Operation to get a list of the idents of the existing items.
	 */
	public static final String GET_EXISTING_ITEMS_IDENTS = "getIdentsOfExistingItems";
	
	/**
	 * Operation to delete a item on the server.
	 */
	public static final String DELETE_ITEM = "getItemsWithIdent?ident=%s/delete";

	/**
	 * Operation to add a new item on the server.
	 */
	public static final String ADD_ITEM_POST = "add?item=*0";

	/**
	 * Operation to force an update of an item on the server
	 */
	public static final String FORCE_UPDATE_ITEM_POST = "getItemsWithIdent?ident=%s/forceUpdate?item=*0";
}
