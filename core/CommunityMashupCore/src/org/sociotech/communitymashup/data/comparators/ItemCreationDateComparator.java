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
package org.sociotech.communitymashup.data.comparators;

import java.util.Comparator;
import java.util.Date;

import org.sociotech.communitymashup.data.Item;

/**
 * Comparator to compare {@link Item}s based on their creation date ({@link Item#getCreated()})
 * 
 * @author Peter Lachenmaier
 */
public class ItemCreationDateComparator implements Comparator<Item> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Item item1, Item item2) {
		
		if(item1 == null && item2 == null)
		{
			return 0;
		}
		
		if(item1 == null)
		{
			return -1;
		}
		
		if(item2 == null)
		{
			return 1;
		}
		
		Date date1 = item1.getCreated();
		Date date2 = item2.getCreated();
		
		// creation date may be not set
		if(date1 == null && date2 == null)
		{
			return 0;
		}
		
		if(date1 == null)
		{
			return -1;
		}
		
		if(date2 == null)
		{
			return 1;
		}
		
		// compare dates
		return date1.compareTo(date2);
	}

}
