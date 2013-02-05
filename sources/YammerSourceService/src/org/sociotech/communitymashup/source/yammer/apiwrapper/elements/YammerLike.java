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
public class YammerLike extends YammerEntity {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4467667046844621467L;

	/** The like count. */
	private int count;
	
	/** The likers. */
	private List<YammerLiker> names;

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the names
	 */
	public List<YammerLiker> getNames() {
		return names;
	}

	/**
	 * @param names the names to set
	 */
	public void setNames(List<YammerLiker> names) {
		this.names = names;
	}
}
