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
 * Details of a document
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyGroupDocumentsPage extends MendeleyEntity {
	/**
	 * Generated serial version uid 
	 */
	private static final long serialVersionUID = 3145554419118666972L;
	
	private int current_page;
	private List<String> document_ids;
	private String group_id;
	private String group_invite_only;
	private String group_name;
	private String group_type;
	private int items_per_page;
	private int total_pages;
	private int total_results;
	
	public int getCurrent_page() {
		return current_page;
	}
	public void setCurrent_page(int current_page) {
		this.current_page = current_page;
	}
	public List<String> getDocument_ids() {
		return document_ids;
	}
	public void setDocument_ids(List<String> document_ids) {
		this.document_ids = document_ids;
	}
	public String getGroup_id() {
		return group_id;
	}
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	public String getGroup_invite_only() {
		return group_invite_only;
	}
	public void setGroup_invite_only(String group_invite_only) {
		this.group_invite_only = group_invite_only;
	}
	public String getGroup_name() {
		return group_name;
	}
	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}
	public String getGroup_type() {
		return group_type;
	}
	public void setGroup_type(String group_type) {
		this.group_type = group_type;
	}
	public int getItems_per_page() {
		return items_per_page;
	}
	public void setItems_per_page(int items_per_page) {
		this.items_per_page = items_per_page;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
