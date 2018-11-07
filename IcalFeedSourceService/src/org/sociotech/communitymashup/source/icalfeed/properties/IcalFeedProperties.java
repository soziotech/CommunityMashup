package org.sociotech.communitymashup.source.icalfeed.properties;

public class IcalFeedProperties {

	/**
	 * This property is used to set the url of the external feed. 
	 */
	public static final String FEED_URL_PROPERTY = "feedUrl";
	public static final String FEED_URL_DEFAULT = "";
	
	/**
	 * This property is used to set the url of the external feed. 
	 */
	public static final String FEED_ENTRY_METATAG_PROPERTY = "entryMetaTag";
	public static final String FEED_ENTRY_METATAG_DEFAULT = "agenda_item";
	
	/**
	 * This property is used to limit import to entries with endDate <= NOW(). 
	 */
	public static final String FEED_ENTRY_FUTURE_PROPERTY = "entryInFutureOnly";
	public static final String FEED_ENTRY_FUTURE_DEFAULT = "true";
	
}
