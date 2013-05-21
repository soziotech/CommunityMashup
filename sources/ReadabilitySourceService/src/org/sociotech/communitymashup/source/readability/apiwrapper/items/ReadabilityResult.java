/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.readability.apiwrapper.items;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * Wrapper for readability api results.
 * 
 * @author Peter Lachenmaier
 */
public class ReadabilityResult implements Serializable {

	/**
	 * Generated serial version uid
	 */
	private static final long serialVersionUID = 6135879646336486287L;

	public static final SimpleDateFormat DATEFORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	private String content;
	private String domain;
	private String author;
	private String url;
	private String short_url;
	private String title;
	private String excerpt;
	private String direction;
	private int word_count;
	private int total_pages;
	private String date_published;
	private String dek;
	private String lead_image_url;
	private String next_page_id;
	private int rendered_pages;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getShort_url() {
		return short_url;
	}

	public void setShort_url(String short_url) {
		this.short_url = short_url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getExcerpt() {
		return excerpt;
	}

	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getWord_count() {
		return word_count;
	}

	public void setWord_count(int word_count) {
		this.word_count = word_count;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public String getDate_published() {
		return date_published;
	}

	public void setDate_published(String date_published) {
		this.date_published = date_published;
	}

	public String getDek() {
		return dek;
	}

	public void setDek(String dek) {
		this.dek = dek;
	}

	public String getLead_image_url() {
		return lead_image_url;
	}

	public void setLead_image_url(String lead_image_url) {
		this.lead_image_url = lead_image_url;
	}

	public String getNext_page_id() {
		return next_page_id;
	}

	public void setNext_page_id(String next_page_id) {
		this.next_page_id = next_page_id;
	}

	public int getRendered_pages() {
		return rendered_pages;
	}

	public void setRendered_pages(int rendered_pages) {
		this.rendered_pages = rendered_pages;
	}

}
