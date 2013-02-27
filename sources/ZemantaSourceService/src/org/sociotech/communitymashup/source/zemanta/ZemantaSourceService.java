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
package org.sociotech.communitymashup.source.zemanta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.zemanta.meta.ZemantaTags;
import org.sociotech.communitymashup.source.zemanta.properties.ZemantaProperties;

import com.zemanta.api.Zemanta;
import com.zemanta.api.ZemantaResult;
import com.zemanta.api.suggest.Category;
import com.zemanta.api.suggest.Keyword;


/**
 * @author Peter Lachenmaier
 * 
 * Main class of the Zemanta source service.
 */
public class ZemantaSourceService extends SourceServiceFacadeImpl {

	/**
	 * URL of the Zemanta api
	 */
	private static final String API_SERVICE_URL = "http://api.zemanta.com/services/rest/0.0/";
	
	/**
	 * The api Zemanta key, will be set by a property.
	 */
	private String apiKey = null;
	
	/**
	 * Counter for calls to the Zemanta api. 
	 */
	private int apiCallCounter = 0;
	
	/**
	 * Reference to the zemanta api instance.
	 */
	private Zemanta zemantaAPI = null;

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#initialize(org.sociotech.communitymashup.application.Source)
	 */
	@Override
	public boolean initialize(Source configuration) {

		boolean initialized = super.initialize(configuration);

		if(initialized)
		{
			apiKey = source.getPropertyValue(ZemantaProperties.ZEMANTA_API_KEY_PROPERTY);
			
			// check api key property
			initialized &= (apiKey != null && !apiKey.isEmpty());
			
			if(!initialized)
			{
				log("No api key set in the configuration. Use property " + ZemantaProperties.ZEMANTA_API_KEY_PROPERTY + "to set it.", LogService.LOG_WARNING);
			}
		}
		
		
		if(initialized)
		{
			// create api instance
			zemantaAPI = new Zemanta(apiKey, API_SERVICE_URL);	

			initialized &= zemantaAPI != null;
			// TODO do a test request
			
			if(!initialized)
			{
				log("API instance for Zemanta could not be created for api key: " + apiKey, LogService.LOG_ERROR);
			}
		}
		
		this.setInitialized(initialized);
		
		return isInitialized();
	}


	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#enrichDataSet()
	 */
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#enrichDataSet()
	 */
	@Override
	public void enrichDataSet() {

		super.enrichDataSet();
		
		// Use only main contents
		// TODO property to use all contents
		List<Content> contents = source.getDataSet().getContents();
		
		if(contents == null)
		{
			return;
		}
		
		// enrich all contents
		for(Content content : contents)
		{
			enrichContent(content);
		}

		// TODO create adapter to react on new contents
		// TODO create adapter to react on newly metatagged contents
	}


	/**
	 * Enriches a single content object.
	 * 
	 * @param content Content to enrich. 
	 */
	private void enrichContent(Content content) {
		
		if(content == null || !isAllowedToProcess(content))
		{
			return;
		}
		
		// the text to analyse is the string value
		String text = content.getStringValue();
		
		if(text == null)
		{
			// nothing can be done without a text
			return;
		}
		
		
		// create request parameter map
		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put("method", "zemanta.suggest");
		parameters.put("api_key", apiKey);
		parameters.put("format", "xml");

		// Stop returning unused stuff
		parameters.put("return_rdf_links", "0");
		parameters.put("articles_limit", "0");
		
		if(isAddingImagesEnabled() && !(isWithoutImageAddingEnabled() && content.hasImages()))
		{
			parameters.put("return_images", "1");
			parameters.put("images_limit", "" + getMaximumImages());
		}
		else
		{
			parameters.put("return_images", "0");
		}
		
		if(isTaggingEnabled())
		{
			parameters.put("return_keywords", "1");
		}
		else
		{
			parameters.put("return_keywords", "0");
		}
		
		if(isCategorizationEnabled())
		{
			// Require to return dmoz categories
			parameters.put("return_categories", "dmoz");
		}	
		
		parameters.put("text", text);
		
		String title = content.getName();
		
		if(title != null)
		{
			// set title for better results
			parameters.put("text_title", title);
		}
		
		
		// call zemanta suggest api
		ZemantaResult zemResult = zemantaAPI.suggest(parameters);
		
		// increase api call counter
		apiCallCounter ++;
		
		if(zemResult == null) {
			log("Error at " + apiCallCounter +"th Zemanta api call: No result" , LogService.LOG_ERROR);
			return;
		}
	
		if(zemResult.isError) {
			log("Error at " + apiCallCounter +"th Zemanta api call: " + zemResult.errorString, LogService.LOG_ERROR);
			return;
		}
		
		// add keywords as tags to content
		tagContent(content, zemResult.keywords);
		
		// add retrieved categories to content
		categorizeContent(content, zemResult.categories);
		
		// attach retrieved images to content
		attachImages(content, zemResult.images);
		
		// mark content as zemanta enriched
		content.metaTag(ZemantaTags.ZEMANTA_ENRICHED_METATAG);
	}

	/**
	 * Attaches the given list of images to the given content if their confidence is high enough.
	 * 
	 * @param content Content to attach images to.
	 * @param images List of zemanta images.
	 */
	private void attachImages(Content content, ArrayList<com.zemanta.api.suggest.Image> images) {
		if(!isAddingImagesEnabled() || images == null || images.isEmpty() || content == null)
		{
			return;
		}
		
		for(com.zemanta.api.suggest.Image image : images)
		{
			if(!isConfident(image.confidence) || image.imageSource == null || image.imageSource.isEmpty())
			{
				// image url does not exist or image not confident enough
				continue;
			}
			
			// TODO maybe property to attach sized image
			// attach Image to content
			Image attachedImage = content.attachImage(image.url_l);
			
			// mark image to be added by this source
			attachedImage = (Image) this.add(attachedImage);
			
			if(attachedImage != null)
			{
				// add zemanta specific meta tags
				attachedImage.metaTag(ZemantaTags.ZEMANTA_IMAGE_METATAG);
				attachedImage.metaTag(ZemantaTags.ZEMANTA_ELEMENT_METATAG);
				
				// add image related meta tags
				attachedImage.metaTag(image.license);
				
				// set description as image string value
				attachedImage.setStringValue(image.description);
				
				log("Attached image from " + image.imageSource + " to " + content.getName(), LogService.LOG_DEBUG);
			}
		}
	}


	/**
	 * Tags (if enabled) the given content using the given list of zemanta keywords that have a high enough confidence.
	 *  
	 * @param content Content to tag
	 * @param keywords List of zemanta keywords
	 */
	private void tagContent(Content content, ArrayList<Keyword> keywords) {
		
		if(!isTaggingEnabled() || keywords == null || keywords.isEmpty() || content == null)
		{
			return;
		}
		
		for(Keyword keyword : keywords)
		{
			if(!isConfident(keyword.confidence))
			{
				// keyword not confident enough
				continue;
			}
			
			// tag content with retrieved keyword
			content.tag(keyword.name);
			log("Adding tag: " + keyword.name + " to " + content.getName(), LogService.LOG_DEBUG);
		}
	}


	/**
	 * Checks if the given confidence is higher than the minimum.
	 * 
	 * @return True if the given confidence is higher than the minimum.
	 */
	private boolean isConfident(float confidence) {
		return confidence > getMinimumConfidence();
	}


	/**
	 * Categorize (if enabled) the given content using the given list of zemanta categories that have a high enough confidence.
	 * 
	 * @param content Content to categorize
	 * @param categories List of zemanta categories
	 */
	private void categorizeContent(Content content, ArrayList<Category> categories) {
		if(!isCategorizationEnabled() || categories == null || categories.isEmpty() || content == null)
		{
			return;
		}
		
		for(Category category : categories)
		{
			if(!isConfident(category.confidence))
			{
				continue;
			}
			
			if(!category.categorization.equalsIgnoreCase("dmoz"))
			{
				// only dmoz categories are tested
				continue;
			}
			
			if(category.name == null || category.name.isEmpty())
			{
				continue;
			}
			
			String[] singleCategories = category.name.split("/");
			
			if(singleCategories.length > 0)
			{
				// TODO create complete category hierarchy
				
				// add most specific category
				String newCategory = singleCategories[singleCategories.length -1];
				content.categorize(newCategory);
				log("Adding category: " + newCategory + " to " + content.getName(), LogService.LOG_DEBUG);
			}
		}
	}
	
	/**
	 * Returns true if tagging is enabled.
	 * 
	 * @return true if tagging is enabled.
	 */
	private boolean isTaggingEnabled()
	{
		String property = source.getPropertyValue(ZemantaProperties.TAG_CONTENT_PROPERTY);
		if(property == null)
		{
			property = ZemantaProperties.TAG_CONTENT_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns true if categorization is enabled.
	 * 
	 * @return true if categorization is enabled.
	 */
	private boolean isCategorizationEnabled()
	{
		String property = source.getPropertyValue(ZemantaProperties.CATEGORIZE_CONTENT_PROPERTY);
		if(property == null)
		{
			property = ZemantaProperties.CATEGORIZE_CONTENT_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns true if images should only be added to contents without images.
	 * 
	 * @return true if images should only be added to contents without images.
	 */
	private boolean isWithoutImageAddingEnabled()
	{
		String property = source.getPropertyValue(ZemantaProperties.PROCESS_ONLY_CONTENT_WITHOUT_IMAGE_PROPERTY);
		if(property == null)
		{
			property = ZemantaProperties.PROCESS_ONLY_CONTENT_WITHOUT_IMAGE_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns true if adding of imagaes is enabled.
	 * 
	 * @return true if adding of imagaes is enabled.
	 */
	private boolean isAddingImagesEnabled()
	{
		String property = source.getPropertyValue(ZemantaProperties.ATTACH_IMAGES_PROPERTY);
		if(property == null)
		{
			property = ZemantaProperties.ATTACH_IMAGES_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns the minimum needed confidence for a zemanta result to be processed.
	 * 
	 * @return the minimum needed confidence for a zemanta result to be processed.
	 */
	private double getMinimumConfidence()
	{
		String property = source.getPropertyValue(ZemantaProperties.MINIMUM_COFIDENCE_PROPERTY);
		if(property == null)
		{
			property = ZemantaProperties.MINIMUM_COFIDENCE_DEFAULT;
		}
		
		Double minConfidence = 1.0;
		
		try {
			minConfidence = new Double(property);
		} catch (Exception e) {
			log("Could not parse configured minimum confidence, setting it to " + minConfidence, LogService.LOG_WARNING);
		}
		
		return minConfidence;
	}
	
	/**
	 * Returns the maximum number of images that should be retrieved from zemanta.
	 * 
	 * @return The maximum number of images that should be retrieved from zemanta.
	 */
	private int getMaximumImages()
	{
		String property = source.getPropertyValue(ZemantaProperties.MAXIMUM_IMAGES_PROPERTY);
		if(property == null)
		{
			property = ZemantaProperties.MAXIMUM_IMAGES_DEFAULT;
		}
		
		int maxImages = 1;
		
		try {
			maxImages = new Integer(property);
		} catch (Exception e) {
			log("Could not parse configured maximum images, setting it to " + maxImages, LogService.LOG_WARNING);
		}
		
		return maxImages;
	}
	
	/**
	 * Returns if it is allowed to process the given content.
	 * 
	 * @param content Content to check.
	 * @return True if the given content is allowed to process.
	 */
	private boolean isAllowedToProcess(Content content)
	{
		if(content == null)
		{
			return false;
		}
		
		if(content.getStringValue() == null || content.getStringValue().isEmpty())
		{
			return false;
		}
		
		if(!isTaggingEnabled() && !isAddingImagesEnabled() && !isCategorizationEnabled())
		{
			// all features deactivated
			return false;
		}
		
		String restrictingMetaTag = source.getPropertyValue(ZemantaProperties.PROCESS_ONLY_CONTENT_WITH_METATAG_PROPERTY);
		
		if(restrictingMetaTag == null || restrictingMetaTag.isEmpty())
		{
			// no restricting meta tag specified in configuration
			return true;
		}
		
		// check if content has meta tag and return
		return content.hasMetaTag(restrictingMetaTag);
	}
}
