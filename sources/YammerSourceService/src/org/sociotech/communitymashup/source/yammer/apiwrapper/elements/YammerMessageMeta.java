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
public class YammerMessageMeta extends YammerEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8094522039508810516L;

	/** Liked message ids */
	private List<String> liked_message_ids;
	
	/** Favorite message ids */
	private List<String> favorite_message_ids;
	
	/** Bookmarked message ids */
	private List<String> bookmarked_message_ids;

	/**
	 * @return the liked_message_ids
	 */
	public List<String> getLiked_message_ids() {
		return liked_message_ids;
	}

	/**
	 * @param liked_message_ids the liked_message_ids to set
	 */
	public void setLiked_message_ids(List<String> liked_message_ids) {
		this.liked_message_ids = liked_message_ids;
	}

	/**
	 * @return the favorite_message_ids
	 */
	public List<String> getFavorite_message_ids() {
		return favorite_message_ids;
	}

	/**
	 * @param favorite_message_ids the favorite_message_ids to set
	 */
	public void setFavorite_message_ids(List<String> favorite_message_ids) {
		this.favorite_message_ids = favorite_message_ids;
	}

	/**
	 * @return the bookmarked_message_ids
	 */
	public List<String> getBookmarked_message_ids() {
		return bookmarked_message_ids;
	}

	/**
	 * @param bookmarked_message_ids the bookmarked_message_ids to set
	 */
	public void setBookmarked_message_ids(List<String> bookmarked_message_ids) {
		this.bookmarked_message_ids = bookmarked_message_ids;
	}
	
}
