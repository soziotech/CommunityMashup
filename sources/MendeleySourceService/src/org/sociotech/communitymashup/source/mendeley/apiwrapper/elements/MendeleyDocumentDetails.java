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
	private List<MendeleyAuthor> authors;
	private List<MendeleyEditor> editors;
	private List<String> keywords;
	private List<String> tags;
	private String title;
	private String website;
	private String year;
	@SerializedName("abstract")
	private String abstractText;
	private String advisor;
	private String applicationNumber;
	private String articleColumn;
	private String associatedDate;
	private String chapter;
	private String city;
	private String code;
	private String codeNumber;
	private String codeSection;
	private String codeVolume;
	private String committee;
	private String counsel;
	private String country;
	private String dateAccessed;
	private String day;
	private String department;
	private String edition;
	private String genre;
	private String institution;
	private String internationalAuthor;
	private String internationalNumber;
	private String internationalTitle;
	private String internationalUserType;
	private String issue;
	private String language;
	private String lastUpdate;
	private String legalStatus;
	private String length;
	private String medium;
	private String month;
	private String originalPublication;
	private String owner;
	private String pages;
	private String publication;
	private String publicLawNumber;
	private String publisher;
	private String reprintEdition;
	private String reviewedArticle;
	private String revisionNumber;
	private String sections;
	private String series;
	private String seriesEditor;
	private String seriesNumber;
	private String session;
	private String shortTitle;
	private String sourceType;
	private String userType;
	private String volume;
	private String arxiv;
	private String doi;
	private String isbn;
	private String issn;
	private String pmid;
	private String uuid;
	// TODO if identifiers are empty, they are an array in the json, if they are set then there is an object
	// just leave them out, cause there are duplicated entries -> doi, isbn ...
	//private MendeleyDocumentIdentifier identifiers;
	private List<MendeleyFileAttachement> files;
	private int modified;
	private int added;
	private String type;
	private String url;
	private String mendeley_url;

	// TODO open (from json reengineering vs. documentation) ?
	// cast
	// notes
	// producers
	// citation_key
	// deletionPending
	// isRead
	// isStarred
	// isAuthor
	// producers
	// source_type (vs. sourceType)??
	// translators
	// publication_outlet
	// folders_ids
	// version
	// discipine
	// subdiscipline
	// year
	// ++
	
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getAbstract() {
		return abstractText;
	}
	public void setAbstract(String abstractText) {
		this.abstractText = abstractText;
	}
	public String getAdvisor() {
		return advisor;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getArticleColumn() {
		return articleColumn;
	}
	public void setArticleColumn(String articleColumn) {
		this.articleColumn = articleColumn;
	}
	public String getAssociatedDate() {
		return associatedDate;
	}
	public void setAssociatedDate(String associatedDate) {
		this.associatedDate = associatedDate;
	}
	public String getChapter() {
		return chapter;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeNumber() {
		return codeNumber;
	}
	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}
	public String getCodeSection() {
		return codeSection;
	}
	public void setCodeSection(String codeSection) {
		this.codeSection = codeSection;
	}
	public String getCodeVolume() {
		return codeVolume;
	}
	public void setCodeVolume(String codeVolume) {
		this.codeVolume = codeVolume;
	}
	public String getCommittee() {
		return committee;
	}
	public void setCommittee(String committee) {
		this.committee = committee;
	}
	public String getCounsel() {
		return counsel;
	}
	public void setCounsel(String counsel) {
		this.counsel = counsel;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDateAccessed() {
		return dateAccessed;
	}
	public void setDateAccessed(String dateAccessed) {
		this.dateAccessed = dateAccessed;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getInternationalAuthor() {
		return internationalAuthor;
	}
	public void setInternationalAuthor(String internationalAuthor) {
		this.internationalAuthor = internationalAuthor;
	}
	public String getInternationalNumber() {
		return internationalNumber;
	}
	public void setInternationalNumber(String internationalNumber) {
		this.internationalNumber = internationalNumber;
	}
	public String getInternationalTitle() {
		return internationalTitle;
	}
	public void setInternationalTitle(String internationalTitle) {
		this.internationalTitle = internationalTitle;
	}
	public String getInternationalUserType() {
		return internationalUserType;
	}
	public void setInternationalUserType(String internationalUserType) {
		this.internationalUserType = internationalUserType;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getLegalStatus() {
		return legalStatus;
	}
	public void setLegalStatus(String legalStatus) {
		this.legalStatus = legalStatus;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getOriginalPublication() {
		return originalPublication;
	}
	public void setOriginalPublication(String originalPublication) {
		this.originalPublication = originalPublication;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getPublicLawNumber() {
		return publicLawNumber;
	}
	public void setPublicLawNumber(String publicLawNumber) {
		this.publicLawNumber = publicLawNumber;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getReprintEdition() {
		return reprintEdition;
	}
	public void setReprintEdition(String reprintEdition) {
		this.reprintEdition = reprintEdition;
	}
	public String getReviewedArticle() {
		return reviewedArticle;
	}
	public void setReviewedArticle(String reviewedArticle) {
		this.reviewedArticle = reviewedArticle;
	}
	public String getRevisionNumber() {
		return revisionNumber;
	}
	public void setRevisionNumber(String revisionNumber) {
		this.revisionNumber = revisionNumber;
	}
	public String getSections() {
		return sections;
	}
	public void setSections(String sections) {
		this.sections = sections;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getSeriesEditor() {
		return seriesEditor;
	}
	public void setSeriesEditor(String seriesEditor) {
		this.seriesEditor = seriesEditor;
	}
	public String getSeriesNumber() {
		return seriesNumber;
	}
	public void setSeriesNumber(String seriesNumber) {
		this.seriesNumber = seriesNumber;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getShortTitle() {
		return shortTitle;
	}
	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}
	public String getSourceType() {
		return sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getArxiv() {
		return arxiv;
	}
	public void setArxiv(String arxiv) {
		this.arxiv = arxiv;
	}
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	public String getPmid() {
		return pmid;
	}
	public void setPmid(String pmid) {
		this.pmid = pmid;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
//	public MendeleyDocumentIdentifier getIdentifiers() {
//		return identifiers;
//	}
//	public void setIdentifiers(MendeleyDocumentIdentifier identifiers) {
//		this.identifiers = identifiers;
//	}
	
	public List<MendeleyFileAttachement> getFiles() {
		return files;
	}

	public void setFiles(List<MendeleyFileAttachement> files) {
		this.files = files;
	}

	public int getModified() {
		return modified;
	}

	public void setModified(int modified) {
		this.modified = modified;
	}

	public int getAdded() {
		return added;
	}

	public void setAdded(int added) {
		this.added = added;
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
}
