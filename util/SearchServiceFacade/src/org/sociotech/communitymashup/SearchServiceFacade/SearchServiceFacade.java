/**
 * 
 */
package org.sociotech.communitymashup.SearchServiceFacade;

import org.eclipse.emf.common.util.EList;

/**
 * @author Mark J. Becker
 *
 */
public interface SearchServiceFacade<A> {
	
	public EList<A> performSearch(String query);

}
