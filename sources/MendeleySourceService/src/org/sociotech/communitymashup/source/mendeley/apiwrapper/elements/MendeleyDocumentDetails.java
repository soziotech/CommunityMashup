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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * Details of a document
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyDocumentDetails extends MendeleyEntity {
	/**
	 * Generated serial version uid 
	 */
	private static final long serialVersionUID = 3145554419118666972L;
	
	private String id;
	private String title;
	private String created;
	private List<MendeleyAuthor> authors;
	private List<MendeleyEditor> editors;
	private List<String> keywords;
	private List<String> tags;
	@SerializedName("abstract")
	private String abstractText;
	
	private List<MendeleyFileAttachement> files;
	private String type;
	private String url;
	private String mendeley_url;
	private boolean file_attached;

	public boolean isFile_attached() {
		return file_attached;
	}
	public void setFile_attached(boolean file_attached) {
		this.file_attached = file_attached;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<MendeleyAuthor> getAuthors() {
		return authors;
	}
	public void setAuthors(List<MendeleyAuthor> authors) {
		this.authors = authors;
	}
	public List<MendeleyEditor> getEditors() {
		return editors;
	}
	public void setEditors(List<MendeleyEditor> editors) {
		this.editors = editors;
	}
	public List<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstract() {
		return abstractText;
	}
	public void setAbstract(String abstractText) {
		this.abstractText = abstractText;
	}

	public List<MendeleyFileAttachement> getFiles() {
		return files;
	}

	public void setFiles(List<MendeleyFileAttachement> files) {
		this.files = files;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMendeley_url() {
		return mendeley_url;
	}

	public void setMendeley_url(String mendeley_url) {
		this.mendeley_url = mendeley_url;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}

	public Date getCreatedDate() {
		if(created == null)
		{
			return null;
		}
		
		// Sample: 2009-04-17T14:33:42.000Z
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		Date date = null;
		try {
			date = format.parse(created);
		} catch (Exception e) {
			return null;
		}
		return date;
	}
}
