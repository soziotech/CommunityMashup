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
package org.sociotech.communitymashup.source.mendeley.sdkadaption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mendeley.oapi.schema.SchemaEntity;

public class AuthoredDocument extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3635975146264115996L;

	/** The id. */
	private String id;

	/** The title. */
	private String title;

	/** The document abstract. */
	private String documentAbstract;

	/** The publication outlet. */
	private String publicationOutlet;

	/** The year. */
	private int year;

	/** The mendeley url. */
	private String mendeleyUrl;

	/** The doi. */
	private String doi;

	/** The authors. */
	private List<Author> authors = new ArrayList<Author>();

	/** The editors. */
	private List<Editor> editors = new ArrayList<Editor>();

	/** The keywords. */
	private List<String> keywords = new ArrayList<String>();

	/** The tags. */
	private List<String> tags = new ArrayList<String>();

	/** The files. */
	private List<FileAttachement> files = new ArrayList<FileAttachement>();

	/** The issue. */
	private String issue;

	/** The volume. */
	private String volume;

	/** The pages. */
	private String pages;

	/** The type. */
	private String type;

	/** The url. */
	private String url;

	/** The uuid. */
	private String uuid;

	/** The city. */
	private String city;

	/** The publisher. */
	private String publisher;
	
	/** Modification timestamp. */
	private int modified;
	
	/** Add timestamp. */
	private int added;

	/**
	 * Gets the title.
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 * 
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the year.
	 * 
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the year.
	 * 
	 * @param year the new year
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Gets the id.
	 * 
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * 
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the publication outlet.
	 * 
	 * @return the publication outlet
	 */
	public String getPublicationOutlet() {
		return publicationOutlet;
	}

	/**
	 * Sets the publication outlet.
	 * 
	 * @param publicationOutlet the new publication outlet
	 */
	public void setPublicationOutlet(String publicationOutlet) {
		this.publicationOutlet = publicationOutlet;
	}

	/**
	 * Gets the mendeley url.
	 * 
	 * @return the mendeley url
	 */
	public String getMendeleyUrl() {
		return mendeleyUrl;
	}

	/**
	 * Sets the mendeley url.
	 * 
	 * @param mendeleyUrl the new mendeley url
	 */
	public void setMendeleyUrl(String mendeleyUrl) {
		this.mendeleyUrl = mendeleyUrl;
	}

	/**
	 * Gets the doi.
	 * 
	 * @return the doi
	 */
	public String getDoi() {
		return doi;
	}

	/**
	 * Sets the doi.
	 * 
	 * @param doi the new doi
	 */
	public void setDoi(String doi) {
		this.doi = doi;
	}

	/**
	 * Gets the authors.
	 * 
	 * @return the authors
	 */
	public List<Author> getAuthors() {
		return authors;
	}

	/**
	 * Sets the authors.
	 * 
	 * @param authors the new authors
	 */
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	/**
	 * Gets the files.
	 * 
	 * @return the authors
	 */
	public List<FileAttachement> getFiles() {
		return files;
	}

	/**
	 * Sets the files.
	 * 
	 * @param files the new files
	 */
	public void setFiles(List<FileAttachement> files) {
		this.files = files;
	}

	/**
	 * Gets the abstract.
	 * 
	 * @return the abstract
	 */
	public String getAbstract() {
		return documentAbstract;
	}

	/**
	 * Sets the abstract.
	 * 
	 * @param documentAbstract the new abstract
	 */
	public void setAbstract(String documentAbstract) {
		this.documentAbstract = documentAbstract;
	}

	/**
	 * Gets the editors.
	 * 
	 * @return the editors
	 */
	public List<Editor> getEditors() {
		return editors;
	}

	/**
	 * Sets the editors.
	 * 
	 * @param editors the new editors
	 */
	public void setEditors(List<Editor> editors) {
		this.editors = editors;
	}

	/**
	 * Gets the keywords.
	 * 
	 * @return the keywords
	 */
	public List<String> getKeywords() {
		return keywords;
	}

	/**
	 * Sets the keywords.
	 * 
	 * @param keywords the new keywords
	 */
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	/**
	 * Gets the tags.
	 * 
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * Sets the tags.
	 * 
	 * @param tags the new tags
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	/**
	 * Gets the issue.
	 * 
	 * @return the issue
	 */
	public String getIssue() {
		return issue;
	}

	/**
	 * Sets the issue.
	 * 
	 * @param issue the new issue
	 */
	public void setIssue(String issue) {
		this.issue = issue;
	}

	/**
	 * Gets the volume.
	 * 
	 * @return the volume
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * Sets the volume.
	 * 
	 * @param volume the new volume
	 */
	public void setVolume(String volume) {
		this.volume = volume;
	}

	/**
	 * Gets the pages.
	 * 
	 * @return the pages
	 */
	public String getPages() {
		return pages;
	}

	/**
	 * Sets the pages.
	 * 
	 * @param pages the new pages
	 */
	public void setPages(String pages) {
		this.pages = pages;
	}

	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type.
	 * 
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the url.
	 * 
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the url.
	 * 
	 * @param url the new url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the uuid.
	 * 
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * Sets the uuid.
	 * 
	 * @param uuid the new uuid
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * Gets the city.
	 * 
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 * 
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the publisher.
	 * 
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * Sets the publisher.
	 * 
	 * @param publisher the new publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * Returns the modified timestamp
	 * 
	 * @return The modified timestamp
	 */
	public int getModified() {
		return modified;
	}

	/**
	 * Set the modified timestamp.
	 * 
	 * @param modified timestamp
	 */
	public void setModified(int modified) {
		this.modified = modified;
	}

	/**
	 * Returns the attribute modified as Date object
	 * 
	 * @return modified date
	 */
	public Date getModifiedDate()
	{
		long ms = (long)modified * (long)1000;
		Date date = new Date(ms);
		return date;
	}
	
	/**
	 * Returns the added timestamp.
	 * 
	 * @return The added timestamp.
	 */
	public int getAdded() {
		return added;
	}

	/**
	 * Sets the added timestamp.
	 * 
	 * @param added The added timestamp.
	 */
	public void setAdded(int added) {
		this.added = added;
	}

	/**
	 * Returns the attribute added as Date object
	 * 
	 * @return added date
	 */
	public Date getAddedDate()
	{
		long ms = (long)added * (long)1000;
		Date date = new Date(ms);
		return date;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Document [authors=" + authors + ", city=" + city
				+ ", documentAbstract=" + documentAbstract + ", doi=" + doi
				+ ", editors=" + editors + ", id=" + id + ", issue=" + issue
				+ ", keywords=" + keywords + ", mendeleyUrl=" + mendeleyUrl
				+ ", pages=" + pages + ", publicationOutlet="
				+ publicationOutlet + ", publisher=" + publisher + ", tags="
				+ tags + ", title=" + title + ", type=" + type + ", url=" + url
				+ ", uuid=" + uuid + ", volume=" + volume + ", year=" + year
				+ "]";
	}
}
