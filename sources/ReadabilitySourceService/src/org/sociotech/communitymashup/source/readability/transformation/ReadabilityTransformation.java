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
package org.sociotech.communitymashup.source.readability.transformation;

import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.readability.apiwrapper.items.ReadabilityResult;
import org.sociotech.communitymashup.source.readability.meta.ReadabilityTags;

/**
 * This class contains all methods to transform data to the CommunityMashup data
 * model.
 * 
 * @author Peter Lachenmaier
 */
public class ReadabilityTransformation {

	/**
	 * Factory for creating new CommunityMashup objects
	 */
	private DataFactory factory = DataFactory.eINSTANCE;

	/**
	 * Reference to the source service for logging and adding of objects
	 */
	private SourceServiceFacadeImpl sourceService;

	/**
	 * Creates a new transformation using the given source service for adding
	 * items and logging.
	 * 
	 * @param sourceService
	 *            SourceServie to use for logging and adding of items.
	 */
	public ReadabilityTransformation(SourceServiceFacadeImpl sourceService) {
		this.sourceService = sourceService;
	}

	/**
	 * Creates the excerpt content object from the given readability result.
	 * 
	 * @param readableWebSite
	 *            Result form readability
	 * @param createAuthor
	 *            Whether to create a author person or not
	 * 
	 * @return The created excerpt, null in error case.
	 */
	public Content createAndAddExcerpt(ReadabilityResult readableWebSite,
			boolean createAuthor) {

		if (readableWebSite == null) {
			return null;
		}
		
		String excerptValue = readableWebSite.getExcerpt();
		if(excerptValue == null || excerptValue.isEmpty())
		{
			// no excerpt extracted
			return null;
		}
		
		// create content object
		Content excerpt = factory.createContent();

		String title = readableWebSite.getTitle();
		
		if(title == null || title.isEmpty())
		{
			// title fallback
			title = readableWebSite.getUrl();
		}
		
		// set values
		excerpt.setName(title);
		excerpt.setStringValue(excerptValue);
		
		// TODO use published date
		
		// add it
		excerpt = sourceService.add(excerpt, "ex_" + readableWebSite.getUrl().hashCode());
		
		if(excerpt == null)
		{
			sourceService.log("Could not create excerpt for " + readableWebSite.getUrl());
			return null;
		}
		
		// create author
		String authorName = readableWebSite.getAuthor();
		if(authorName != null && !authorName.isEmpty() && createAuthor)
		{
			Person authorPerson = factory.createPerson();
			authorPerson.setName(authorName);
			
			// add it to the data set
			authorPerson = sourceService.add(authorPerson);
			if(authorPerson != null) {
				// add meta tags
				authorPerson.metaTag(ReadabilityTags.AUTHOR_METATAG);
				authorPerson.metaTag(ReadabilityTags.READABILITY_METATAG);
				
				// set author for content
				excerpt.setAuthor(authorPerson);
			}
		}
		
		// add lead image
		String leadImageUrl = readableWebSite.getLead_image_url();
		if(leadImageUrl != null && ! leadImageUrl.isEmpty())
		{
			Image leadImage = excerpt.attachImage(leadImageUrl);
			if(leadImage != null)
			{
				// add meta tag
				leadImage.metaTag(ReadabilityTags.LEAD_IMAGE_METATAG);
				leadImage.metaTag(ReadabilityTags.READABILITY_METATAG);
			}
		}
		
		// add meta tags
		excerpt.metaTag(ReadabilityTags.EXCERPT_METATAG);
		excerpt.metaTag(ReadabilityTags.READABILITY_METATAG);
		
		// return the finished excerpt object
		return excerpt;
	}

	/**
	 * Creates the full content content object from the given readability result.
	 * 
	 * @param readableWebSite
	 *            Result form readability
	 * @param createAuthor
	 *            Whether to create a author person or not
	 * 
	 * @return The created content, null in error case.
	 */
	public Content createAndAddFullContent(ReadabilityResult readableWebSite,
			boolean createAuthor) {
		if (readableWebSite == null) {
			return null;
		}
		
		String contentValue = readableWebSite.getContent();
		if(contentValue == null || contentValue.isEmpty())
		{
			// no content extracted
			return null;
		}
		
		// create content object
		Content fullContent = factory.createContent();

		String title = readableWebSite.getTitle();
		
		if(title == null || title.isEmpty())
		{
			// title fallback
			title = readableWebSite.getUrl();
		}
		
		// set values
		fullContent.setName(title);
		fullContent.setStringValue(contentValue);
		
		// TODO use published date
		
		// add it
		fullContent = sourceService.add(fullContent, "fc_" + readableWebSite.getUrl().hashCode());
		
		if(fullContent == null)
		{
			sourceService.log("Could not create full content for " + readableWebSite.getUrl());
			return null;
		}
		
		// create author
		String authorName = readableWebSite.getAuthor();
		if(authorName != null && !authorName.isEmpty() && createAuthor)
		{
			Person authorPerson = factory.createPerson();
			authorPerson.setName(authorName);
			
			// add it to the data set
			authorPerson = sourceService.add(authorPerson);
			if(authorPerson != null) {
				// add meta tags
				authorPerson.metaTag(ReadabilityTags.AUTHOR_METATAG);
				authorPerson.metaTag(ReadabilityTags.READABILITY_METATAG);
				
				// set author for content
				fullContent.setAuthor(authorPerson);
			}
		}
		
		// add lead image
		String leadImageUrl = readableWebSite.getLead_image_url();
		if(leadImageUrl != null && ! leadImageUrl.isEmpty())
		{
			Image leadImage = fullContent.attachImage(leadImageUrl);
			if(leadImage != null)
			{
				// add meta tag
				leadImage.metaTag(ReadabilityTags.LEAD_IMAGE_METATAG);
				leadImage.metaTag(ReadabilityTags.READABILITY_METATAG);
			}
		}
		
		// add meta tags
		fullContent.metaTag(ReadabilityTags.CONTENT_METATAG);
		fullContent.metaTag(ReadabilityTags.READABILITY_METATAG);
		
		// return the finished excerpt object
		return fullContent;
	}

}
