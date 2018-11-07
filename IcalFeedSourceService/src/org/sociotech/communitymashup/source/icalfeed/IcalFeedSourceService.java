package org.sociotech.communitymashup.source.icalfeed;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.net.URL;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.application.SourceState;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.source.icalfeed.properties.IcalFeedProperties;
import org.sociotech.communitymashup.source.icalfeed.transformation.IcalFeedTransformation;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.data.CalendarBuilder;


/*
 * Documentation for ical4j:
 * http://ical4j.github.io/docs/ical4j/api/2.0-beta1/
 */


public class IcalFeedSourceService extends SourceServiceFacadeImpl {

	private IcalFeedTransformation transformation;
	
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
		
		if(initialized) {
			String feedUrl = source.getPropertyValue(IcalFeedProperties.FEED_URL_PROPERTY);
			
			// check url property
			initialized &= (feedUrl != null && !feedUrl.isEmpty());
		}
		
		if(!initialized) {
			log("No feed url set in the configuration. Use property " + IcalFeedProperties.FEED_URL_PROPERTY + "to set it.", LogService.LOG_WARNING);
		}
		else {
			// create new feed transformation instance
			transformation = new IcalFeedTransformation(this);
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
		getAndAddFeed(source.getPropertyValue(IcalFeedProperties.FEED_URL_PROPERTY), 
				source.getPropertyValueElseDefault(IcalFeedProperties.FEED_ENTRY_METATAG_PROPERTY, IcalFeedProperties.FEED_ENTRY_METATAG_DEFAULT),
				source.isPropertyTrueElseDefault(IcalFeedProperties.FEED_ENTRY_FUTURE_PROPERTY, IcalFeedProperties.FEED_ENTRY_FUTURE_DEFAULT));
	}

	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#updateDataSet()
	 */
	@Override
	public void updateDataSet() {
		
		super.updateDataSet();
		
		// get url from property and load the feed
		getAndAddFeed(source.getPropertyValue(IcalFeedProperties.FEED_URL_PROPERTY), 
				source.getPropertyValueElseDefault(IcalFeedProperties.FEED_ENTRY_METATAG_PROPERTY, IcalFeedProperties.FEED_ENTRY_METATAG_DEFAULT),
				source.isPropertyTrueElseDefault(IcalFeedProperties.FEED_ENTRY_FUTURE_PROPERTY, IcalFeedProperties.FEED_ENTRY_FUTURE_DEFAULT));
	}


	/**
	 * Parses RSS or ATOM feed for a given feed url.
	 * 
	 * @param url URL of the feed
	 * @param dataSet Data set to fill with feed elements
	 */
	public void getAndAddFeed(String url, String contentMetaTag, boolean futureOnly) {

		log("Loading Feed from: " + url, LogService.LOG_DEBUG);
		
		try {
			
			InputStream inputStream = new URL(url).openStream();
			
			CalendarBuilder builder = new CalendarBuilder();

			Calendar calendar = builder.build(inputStream);
			
			log("calendar loaded ... ");
			
			transformation.transformFeed(calendar, contentMetaTag, futureOnly);
			
		} catch (IOException e) {
			log("IOException while accessing ical feed. Error:" + e.getMessage(), LogService.LOG_ERROR);
			this.source.setState(SourceState.ERROR);
			return;
		} catch (Exception e) {
			e.printStackTrace();
			log("Error (" + e.getMessage() + ") occured trying to create the input for ical feed: " + url, LogService.LOG_ERROR);
			this.source.setState(SourceState.ERROR);
			return;
		}
		
	}
	
}