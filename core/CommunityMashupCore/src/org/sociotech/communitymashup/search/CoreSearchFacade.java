package org.sociotech.communitymashup.search;

import org.eclipse.emf.common.util.EList;

public interface CoreSearchFacade<A> {
	public EList<A> performSearch(String query);
}
