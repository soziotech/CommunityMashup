/*******************************************************************************
 * Copyright (c) 2014 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.mendeley.apiwrapper.elements;

import java.util.List;

/**
 * The container for mendeley public group documents with details.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyPublicGroupWithDocumentDetailsPage extends MendeleyEntity {
	
	/**
	 * Generate serial version uid
	 */
	private static final long serialVersionUID = -8258365010865561913L;
	
	private int current_page;
	private int total_pages;
	private int total_results;
	private List<MendeleyDocumentDetails> documents;
	public int getCurrent_page() {
		return current_page;
	}
	public void setCurrent_page(int current_page) {
		this.current_page = current_page;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public int getTotal_results() {
		return total_results;
	}
	public void setTotal_results(int total_results) {
		this.total_results = total_results;
	}
	public List<MendeleyDocumentDetails> getDocuments() {
		return documents;
	}
	public void setDocuments(List<MendeleyDocumentDetails> documents) {
		this.documents = documents;
	}
}
