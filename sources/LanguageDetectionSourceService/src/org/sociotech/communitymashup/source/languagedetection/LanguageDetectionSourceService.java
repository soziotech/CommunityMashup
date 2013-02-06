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
package org.sociotech.communitymashup.source.languagedetection;

import java.util.List;

import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.languagedetection.apiwrapper.DetectLanguageAPIWrapper;
import org.sociotech.communitymashup.source.languagedetection.apiwrapper.elements.Detection;
import org.sociotech.communitymashup.source.languagedetection.meta.LanguageDetectionTags;
import org.sociotech.communitymashup.source.languagedetection.properties.LanguageDetectionProperties;


/**
 * @author Peter Lachenmaier
 * 
 * Main class of the language detection source service.
 */
public class LanguageDetectionSourceService extends SourceServiceFacadeImpl {

	/**
	 * The api key, will be set by a property.
	 */
	private String apiKey = null;
	

	/**
	 * API instance 
	 */
	private DetectLanguageAPIWrapper api = null;
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#createDefaultConfiguration()
	 */
	@Override
	protected void createDefaultConfiguration() {

		super.createDefaultConfiguration();

		// default values
		source.addProperty(LanguageDetectionProperties.DETECTLANGUAGE_API_KEY_PROPERTY, LanguageDetectionProperties.DETECTLANGUAGE_API_KEY_DEFAULT);
		
	}


	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#initialize(org.sociotech.communitymashup.application.Source)
	 */
	@Override
	public boolean initialize(Source configuration) {

		boolean initialized = super.initialize(configuration);

		if(initialized)
		{
			apiKey = source.getPropertyValue(LanguageDetectionProperties.DETECTLANGUAGE_API_KEY_PROPERTY);
			
			// check api key property
			initialized &= (apiKey != null && !apiKey.isEmpty());
			
			if(!initialized)
			{
				log("No api key set in the configuration. Use property " + LanguageDetectionProperties.DETECTLANGUAGE_API_KEY_PROPERTY + "to set it.", LogService.LOG_WARNING);
			}
		}
		
		if(initialized)
		{
			// create new api instance
			api = new DetectLanguageAPIWrapper(apiKey);
			
			initialized &= api != null;
			
			if(!initialized)
			{
				log("Could not create api instance with key " + apiKey, LogService.LOG_WARNING);
			}
		}
		
		
		this.setInitialized(initialized);
		
		return isInitialized();
	}


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
		
		boolean languageDetected = false;
		
		// the text to analyse is the string value
		String text = content.getStringValue();
		
		// TODO: maybe strip out html
		// TODO: maybe include title
			
		// detect language
		Detection language = api.detectMostConfidentLanguage(text);
		if(language != null && isConfident(language.getConfidence()))
		{
			languageDetected = true;
		}
		
		if(languageDetected)
		{
			// mark content as language detected
			content.metaTag(LanguageDetectionTags.LANGUAGE_DETECTED_METATAG);
			
			log("Detected langugage " + language.getLanguage() + " for " + content.getName());
			
			if(setLocaleEnabled())
			{
				content.setLocale(language.getLanguage());
			}
			
			if(setMetaTagEnabled())
			{
				content.metaTag(language.getLanguage());
			}
		}
		else
		{
			// mark content as language detected
			content.metaTag(LanguageDetectionTags.LANGUAGE_UNDETECTED_METATAG);
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
	 * Returns true if set locale is enabled.
	 * 
	 * @return true if set locale is enabled.
	 */
	private boolean setLocaleEnabled()
	{
		String property = source.getPropertyValue(LanguageDetectionProperties.SET_LOCALE_ATTRIBUTE_PROPERTY);
		if(property == null)
		{
			property = LanguageDetectionProperties.SET_LOCALE_ATTRIBUTE_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns true if set meta tag is enabled.
	 * 
	 * @return true if set meta tag is enabled.
	 */
	private boolean setMetaTagEnabled()
	{
		String property = source.getPropertyValue(LanguageDetectionProperties.LANGUAGE_METATAG_PROPERTY);
		if(property == null)
		{
			property = LanguageDetectionProperties.LANGUAGE_METATAG_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns the minimum needed confidence for a language detection result to be processed.
	 * 
	 * @return the minimum needed confidence for a langugae detection result to be processed.
	 */
	private double getMinimumConfidence()
	{
		String property = source.getPropertyValue(LanguageDetectionProperties.MINIMUM_COFIDENCE_PROPERTY);
		if(property == null)
		{
			property = LanguageDetectionProperties.MINIMUM_COFIDENCE_DEFAULT;
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
		
		if(!setLocaleEnabled() && !setMetaTagEnabled())
		{
			// all features deactivated
			return false;
		}
		
		String restrictingMetaTag = source.getPropertyValue(LanguageDetectionProperties.PROCESS_ONLY_CONTENT_WITH_METATAG_PROPERTY);
		
		if(restrictingMetaTag == null || restrictingMetaTag.isEmpty())
		{
			// no restricting meta tag specified in configuration
			return true;
		}
		
		// check if content has meta tag and return
		return content.hasMetaTag(restrictingMetaTag);
	}
}
