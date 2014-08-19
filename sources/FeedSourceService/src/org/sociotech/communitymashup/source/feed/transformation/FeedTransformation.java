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
package org.sociotech.communitymashup.source.feed.transformation;

import java.util.Date;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.source.feed.meta.FeedTags;
import org.sociotech.communitymashup.source.feed.properties.FeedProperties;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;

import com.sun.syndication.feed.synd.SyndCategory;
import com.sun.syndication.feed.synd.SyndContent;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndPerson;

/**
 * This class contains all methods to transform feed elements to CommunityMashup items.
 * 
 * @author Peter Lachenmaier
 */
public class FeedTransformation {

	private SourceServiceFacadeImpl sourceService;

	private boolean firstCategoryIsCategory = false;
	private boolean firstCategoryIsTag = false;
	private boolean addOnlyFirstImage = false;
	
	/**
	 * If set to a date, all entries older than the date will be skipped
	 */
	private Date skipOlderThan = null;

	
	/**
	 * Creates a new feed transformation using the give source service for adding items and logging.
	 * @param sourceService
	 */
	public FeedTransformation(SourceServiceFacadeImpl sourceService) {
		this.sourceService = sourceService;
	}

	/**
	 * @param feed
	 */
	public void transformFeed(SyndFeed feed, String contentMetaTag)
	{

		if(feed == null)
		{
			return;
		}

		updateOlderThanDate();
		
		// run through entry list
		for (Object e : feed.getEntries())
		{
			if(!(e instanceof SyndEntry))
			{
				// nothing to do
				continue;
			}

			SyndEntry entry = (SyndEntry) e;

			// and transform every feed entry

			transformAndAddFeedEntry(entry, contentMetaTag);
		}
	}

	/**
	 * Updates the date to skip old entries.
	 */
	private void updateOlderThanDate() {
		String olderThanDaysString = sourceService.getConfiguration().getPropertyValue(FeedProperties.SKIP_OLDER_THAN_DAYS_PROPERTY);
		
		if(olderThanDaysString == null) {
			skipOlderThan = null;
			return;
		}
		
		// try to parse
		try {
			int days = new Integer(olderThanDaysString);
			// now
			skipOlderThan = new Date();
			// - days (in millis)
			skipOlderThan.setTime(skipOlderThan.getTime() - days * 24 * 60 * 60 * 1000);
		} catch (Exception e) {
			skipOlderThan = null;
			return;
		}
		
		
	}
	/**
	 * @param entry
	 * @param removeHtml
	 */
	private void transformAndAddFeedEntry(SyndEntry entry, String contentMetaTag) {
		
		if(entry == null)
		{
			return;
		}
		
		// get entry details
		String entryUri = entry.getUri();
		String entryLink = entry.getLink();
		String entryTitle = entry.getTitle();
		String entryAuthor = entry.getAuthor();
		Date entryPublished = entry.getPublishedDate();
		Date entryUpdated = entry.getUpdatedDate(); 
		
		List<?> entryAuthors = entry.getAuthors();
		List<?> contents = entry.getContents();
		SyndContent description = entry.getDescription();
		List<?> categories = entry.getCategories();

		String entryId = createLocalEntryIdent(entry);

		// skip if to old
		if(skipOlderThan != null && skipOlderThan.after(entryPublished)) {
			// skip
			return;
		}
		
		// check if previously added
		Content content = sourceService.getContentWithSourceIdent(entryId);
		
		// previously created
		if(content != null)
		{
			return;
		}
		
		log("Adding feed entry: " + entryTitle + " Link: " + entryLink, LogService.LOG_INFO);

		// create new content
		content = DataFactory.eINSTANCE.createContent();
		
		// fill content
		content.setUri(entryUri);
		
		String title = entry.getTitle();
		
		content.setName(title);
		
		content.setCreated(entryPublished);
		content.setLastModified(entryUpdated);

		String htmlValue = null;
		
		// try content first
		if(contents != null && !contents.isEmpty())
		{
			// get first content element and transform
			SyndContent cont = (SyndContent) contents.get(0);
			htmlValue = cont.getValue();
		}
		else if(description != null)
		{
			// use description value as content
			htmlValue = description.getValue();
		}
			
		if(htmlValue != null)
		{
			String contentText = htmlValue;

			content.setStringValue(contentText);
		}
		
		// content is complete now, so add it
		content = (Content) sourceService.add(content, entryId);

		if(content == null)
		{
			// adding was not sucessfull
			return;
		}
		
		if(htmlValue != null)
		{
			// Extract images from html content

			//String imgUrl = (htmlExtractImage(htmlValue));
			Document doc = Jsoup.parse(htmlValue);
			Elements imgElements = doc.select("img");
			
			// add all images
			for(Element imgElement : imgElements)
			{
				String imgSrc = imgElement.attr("src");

				// attach image
				content.attachImage(imgSrc);

				log("Feed Image: " + imgSrc, LogService.LOG_INFO);
				
				if(addOnlyFirstImage)
				{
					// stop loop if only first image should be added 
					break;
				}
			}
		}
				
		// add meta tags for every feed entry
		if(contentMetaTag != null && !contentMetaTag.isEmpty()) content.metaTag(contentMetaTag);
		content.metaTag(FeedTags.FEED_ENTRY_METATAG);
		
		String authorId = createLocalPersonIdent(entryAuthor);

		// attach author person

		Person author = sourceService.getPersonWithSourceIdent(authorId);
		if (author == null) {
			author = DataFactory.eINSTANCE.createPerson();
			// fill author person
			author.setName(entryAuthor);
			author = (Person) sourceService.add(author, authorId);
		}

		if(author != null)
		{
			// adding was successfull
			content.setAuthor(author);
		}
		
		// add additional authors
		for (Object a : entryAuthors) {
			SyndPerson person = (SyndPerson) a;
			String ident = createLocalPersonIdent(person.getName());

			Person contributor = sourceService.getPersonWithSourceIdent(ident);

			// same person should not be added twice
			if (contributor == null) {
				// attach author person
				contributor = DataFactory.eINSTANCE.createPerson();
				// fill author person
				contributor.setName(person.getName());

				contributor = (Person) sourceService.add(contributor, ident);
			}

			if(contributor != null)
			{
				content.addContributor(contributor);
			}

		}

		// add categories
		boolean first = true;
		
		for (Object c : categories) {
			
			SyndCategory category = (SyndCategory) c;
			
			if(first && firstCategoryIsCategory)
			{
				// first category is a category
				content.categorize(category.getName());
				
			}
			if(!firstCategoryIsTag && first) {
				continue;
			}
			
			first = false;
			
			// others are tags
			content.tag(category.getName());
		}

	}

	/**
	 * @param entry
	 * @return
	 */
	private String createLocalEntryIdent(SyndEntry entry) {
		if(entry == null || entry.getUri() == null || entry.getUri().isEmpty())
		{
			return null;
		}
		
		// use string has as identifier
		return "" + entry.getUri().hashCode();
	}

	/**
	 * @param personName
	 * @return
	 */
	private String createLocalPersonIdent(String personName) {
		
		if(personName == null || personName.isEmpty())
		{
			return null;
		}
		
		// make string hash as id
		return "" + personName.hashCode();
	}

	private void log(String message, int logLevel)
	{
		sourceService.log(message, logLevel);
	}

	/**
	 * @return the firstCategoryIsCategory
	 */
	public boolean isFirstCategoryIsCategory() {
		return firstCategoryIsCategory;
	}

	/**
	 * @param firstCategoryIsCategory the firstCategoryIsCategory to set
	 */
	public void setFirstCategoryIsCategory(boolean firstCategoryIsCategory) {
		this.firstCategoryIsCategory = firstCategoryIsCategory;
	}

	/**
	 * @param firstCategoryIsTag the firstCategoryIsTag to set
	 */
	public void setFirstCategoryIsTag(boolean firstCategoryIsTag) {
		this.firstCategoryIsTag = firstCategoryIsTag;
	}
	
	/**
	 * @return the addOnlyFirstImage
	 */
	public boolean isAddOnlyFirstImage() {
		return addOnlyFirstImage;
	}

	/**
	 * @param addOnlyFirstImage the addOnlyFirstImage to set
	 */
	public void setAddOnlyFirstImage(boolean addOnlyFirstImage) {
		this.addOnlyFirstImage = addOnlyFirstImage;
	}

}
