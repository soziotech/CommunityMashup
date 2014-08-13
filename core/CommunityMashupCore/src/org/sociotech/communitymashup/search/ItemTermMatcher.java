package org.sociotech.communitymashup.search;

import org.sociotech.communitymashup.data.Item;

/**
 * Interface that must be implemented by any concrete term matcher
 * to be used for basic searching in a CommunityMashup data set.
 * 
 * @author Peter Lachenmaier
 */
public interface ItemTermMatcher {
	/**
	 * @param item
	 * @param term
	 * @return
	 */
	public boolean matchesTerm(Item item, String term);
}
