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
package org.sociotech.communitymashup.source.feed;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.application.SourceState;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.source.feed.properties.FeedProperties;
import org.sociotech.communitymashup.source.feed.transformation.FeedTransformation;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;


/**
 * @author Peter Lachenmaier, Martin Burkhard
 * 
 * Main class of the Feed source service.
 */
public class FeedSourceService extends SourceServiceFacadeImpl {

	private FeedTransformation transformation;
	
	/**
	 * Whether to remove invalid character before parsing or not. 
	 */
	private boolean deepXMLCleanup;

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#initialize(org.sociotech.communitymashup.application.Source)
	 */
	@Override
	public boolean initialize(Source configuration) {

		boolean initialized = super.initialize(configuration);

		if(initialized)
		{
			String feedUrl = source.getPropertyValue(FeedProperties.FEED_URL_PROPERTY);
			
			// check url property
			initialized &= (feedUrl != null && !feedUrl.isEmpty());
			
			// get xml cleanup property
			deepXMLCleanup = source.isPropertyTrueElseDefault(FeedProperties.DEEP_CLEANUP_PROPERTY, FeedProperties.DEEP_CLEANUP_DEFAULT);
		}
		
		if(!initialized)
		{
			log("No feed url set in the configuration. Use property " + FeedProperties.FEED_URL_PROPERTY + "to set it.", LogService.LOG_WARNING);
		}
		else
		{
			// create new feed transformation instance
			transformation = new FeedTransformation(this);
	
			// set transformation properties
			transformation.setFirstCategoryIsCategory(source.isPropertyTrueElseDefault(FeedProperties.SET_FIRST_CATEGORY_PROPERTY, FeedProperties.SET_FIRST_CATEGORY_DEFAULT));
			transformation.setFirstCategoryIsTag(source.isPropertyTrueElseDefault(FeedProperties.SET_FIRST_CATEGORY_AS_TAG_PROPERTY, FeedProperties.SET_FIRST_CATEGORY_AS_TAG_DEFAULT));
			transformation.setAddOnlyFirstImage(source.isPropertyTrue(FeedProperties.ADD_ONLY_FIRST_IMAGE_PROPERTY));
		}
		
		this.setInitialized(initialized);
		
		return initialized;
	}


	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#fillDataSet(org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public void fillDataSet(DataSet dataSet) {

		super.fillDataSet(dataSet);
		
		// get url from property and load the feed
		getAndAddFeed(source.getPropertyValue(FeedProperties.FEED_URL_PROPERTY), source.getPropertyValue(FeedProperties.FEED_ENTRY_METATAG_PROPERTY));
	}

	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#updateDataSet()
	 */
	@Override
	public void updateDataSet() {
		
		super.updateDataSet();
		
		// get url from property and load the feed
		try {
			getAndAddFeed(source.getPropertyValue(FeedProperties.FEED_URL_PROPERTY), source.getPropertyValue(FeedProperties.FEED_ENTRY_METATAG_PROPERTY));
		} catch (Exception e) {
			log("Got exception " + e.getMessage() + " during feed update. Retrying next time.", LogService.LOG_WARNING);
			return;
		}
		
	}


	/**
	 * Parses RSS or ATOM feed for a given feed url.
	 * 
	 * @param url URL of the feed
	 * @param dataSet Data set to fill with feed elements
	 */
	public void getAndAddFeed(String url, String contentMetaTag) {

		log("Loading Feed from: " + url, LogService.LOG_DEBUG);

		SyndFeed feed;

		try {
			SyndFeedInput input = new SyndFeedInput();
			if(!deepXMLCleanup ) {
				feed = input.build(new XmlReader(new URL(url)));
			}
			else {
					
				InputStream inputStream = new URL(url).openStream();
				StringWriter writer = new StringWriter();
				IOUtils.copy(inputStream, writer);
			
				// deep xml cleanup
				String inputString = this.stripNonValidXMLCharacters(writer.toString());
				feed = input.build(new XmlReader(IOUtils.toInputStream(inputString)));
			}
		}
		catch (IOException e) {
			log("IOException while accessing feed. Error:" + e.getMessage(), LogService.LOG_ERROR);
			this.source.setState(SourceState.ERROR);
			return;
		} catch (FeedException e) {
			log("FeedException while parsing feed. Error:" + e.getMessage(), LogService.LOG_ERROR);
			//e.printStackTrace();
			// set state to error
			this.source.setState(SourceState.ERROR);
			return;
		}
		catch (Exception e) {
			log("Error (" + e.getMessage() + ") occured trying to create the input for feed: " + url, LogService.LOG_ERROR);
			this.source.setState(SourceState.ERROR);
			return;
		}

		
		if(feed == null || feed.getEntries().isEmpty())
		{
			// nothing to do
			return;
		}

		transformation.transformFeed(feed, contentMetaTag);
	}
	
	/**
	 * Quick fix from http://blog.mark-mclaren.info/2007/02/invalid-xml-characters-when-valid-utf8_5873.html
	 * 
	 * This method ensures that the output String has only valid XML unicode
	 * characters as specified by the XML 1.0 standard. For reference, please
	 * see <a href="http://www.w3.org/TR/2000/REC-xml-20001006#NT-Char">the
	 * standard</a>. This method will return an empty String if the input is
	 * null or empty.
	 * 
	 * @param in
	 *            The String whose non-valid characters we want to remove.
	 * @return The in String, stripped of non-valid characters.
	 */
	private String stripNonValidXMLCharacters(String in) {
        StringBuffer out = new StringBuffer(); // Used to hold the output.
        char current; // Used to reference the current character.

        if (in == null || ("".equals(in))) return ""; // vacancy test.
        for (int i = 0; i < in.length(); i++) {
            current = in.charAt(i); // NOTE: No IndexOutOfBoundsException caught here; it should not happen.
            if ((current == 0x9) ||
                (current == 0xA) ||
                (current == 0xD) ||
                ((current >= 0x20) && (current <= 0xD7FF)) ||
                ((current >= 0xE000) && (current <= 0xFFFD)) ||
                ((current >= 0x10000) && (current <= 0x10FFFF)))
                out.append(current);
        }
        return out.toString();
    }    
}
