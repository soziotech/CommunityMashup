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
/**
 * 
 */
package org.sociotech.communitymashup.source.google.urlshortener;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Property;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.WebSite;
import org.sociotech.communitymashup.data.observer.dataset.DataSetChangeObserver;
import org.sociotech.communitymashup.data.observer.dataset.DataSetChangedInterface;
import org.sociotech.communitymashup.source.authorization.OAuthAuthorizationRegistrator;
import org.sociotech.communitymashup.source.google.urlshortener.authorization.GoogleOAuth20AuthorizationServlet;
import org.sociotech.communitymashup.source.google.urlshortener.meta.GoogleUrlShortenerTags;
import org.sociotech.communitymashup.source.google.urlshortener.properties.GoogleUrlShortenerProperties;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.properties.SourceServiceProperties;
import org.sociotech.communitymashup.util.servicetracker.HttpServiceTracker;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleRefreshTokenRequest;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.urlshortener.Urlshortener;
import com.google.api.services.urlshortener.model.Url;
import com.google.api.services.urlshortener.model.UrlHistory;

/**
 * This is the main class of a source service that shortens the urls of web site
 * objects.
 * 
 * @author Peter Lachenmaier
 */
public class GoogleUrlShortenerSourceService extends SourceServiceFacadeImpl
		implements DataSetChangedInterface {

	/**
	 * Observe to react on data set changes
	 */
	private DataSetChangeObserver dataSetChangeObserver;

	/**
	 * MetaTag needed for an website to be processed
	 */
	private String neededWebSiteMetaTag;

	/**
	 * The url shortener instance
	 */
	private Urlshortener shortener;

	/**
	 * The registrator for user base authorization
	 */
	private OAuthAuthorizationRegistrator authenticationRegistrator;

	/**
	 * Tracker for registering authorization servlet
	 */
	private HttpServiceTracker httpServiceTracker;

	/**
	 * Indicates a internal token update to self handle configuration changes.  
	 */
	private boolean tokenUpdate = false;
	
	/**
	 * Value of the client id for easier access 
	 */
	private String clientID;
	
	/**
	 * Value of the client secret for easier access 
	 */
	private String clientSecret;

	/**
	 * The expiration time of the access token
	 */
	private Long expirationTime;

	/**
	 * The refresh token
	 */
	private String refreshToken;

	/**
	 * Current access token
	 */
	private String accessToken;

	/**
	 * Configured application name
	 */
	private String applicationName;
	
	/**
	 * Whether to use history for shortening or not
	 */
	private boolean useHistory;

	/**
	 * The history of already shortened urls.
	 */
	private Map<String, String> longToShortHistoryMap;
	
	/**
	 * System time in millis of last api access
	 */
	long lastApiAccessTime = 0;
	
	/**
	 * Wait time in millis between two api calls
	 */
	long apiWaitTime = 2000;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#initialize
	 * (org.sociotech.communitymashup.application.Source)
	 */
	@Override
	public boolean initialize(Source configuration) {

		boolean initialized = super.initialize(configuration);

		if (initialized) {
			
			initialized = this.establishConnection();
			
			// read configuration
			neededWebSiteMetaTag = source
					.getPropertyValue(GoogleUrlShortenerProperties.PROCESS_WEBSITE_ONLY_WITH_METATAG_PROPERTY);

			useHistory = source.isPropertyTrueElseDefault(GoogleUrlShortenerProperties.USE_HISTORY_PROPERTY,
														  GoogleUrlShortenerProperties.USE_HISTORY_DEFAULT);
			
			// if allowed register an authentication servlet
			initialized |= startUIAuthentication();
						
		}

		this.setInitialized(initialized);
		return initialized;
	}

	/**
	 * Establishes a connection with google based on the user information given in the
	 * configuration.
	 * 
	 * @return True if it is possible to use the user information for the connection, false otherwise. 
	 */
	private boolean establishConnection() {
		
		clientID 		= source.getPropertyValue(GoogleUrlShortenerProperties.CLIENT_ID_PROPERTY);
		clientSecret	= source.getPropertyValue(GoogleUrlShortenerProperties.CLIENT_SECRET_PROPERTY);
		accessToken 	= source.getPropertyValue(GoogleUrlShortenerProperties.ACCESS_TOKEN_PROPERTY);
		applicationName = source.getPropertyValueElseDefault(GoogleUrlShortenerProperties.APPLICATION_NAME_PROPERTY,
															 GoogleUrlShortenerProperties.APPLICATION_NAME_DEFAULT);

		
		// check properties
		if(clientID == null || clientID.isEmpty())
		{
			log("A valid client id is needed in the configuration specified by " + GoogleUrlShortenerProperties.CLIENT_ID_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(clientSecret == null || clientSecret.isEmpty())
		{
			log("A valid client secret is needed in the configuration specified by " + GoogleUrlShortenerProperties.CLIENT_SECRET_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(accessToken == null || accessToken.isEmpty())
		{
			log("A valid access token is needed in the configuration specified by " + GoogleUrlShortenerProperties.ACCESS_TOKEN_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		
		refreshToken = source.getPropertyValueElseDefault(GoogleUrlShortenerProperties.REFRESH_TOKEN_PROPERTY, GoogleUrlShortenerProperties.REFRESH_TOKEN_DEFAULT);
		String accessTokenExpiration = source.getPropertyValueElseDefault(GoogleUrlShortenerProperties.ACCESS_TOKEN_EXPIRATION_PROPERTY, GoogleUrlShortenerProperties.ACCESS_TOKEN_EXPIRATION_DEFAULT);
	
		// try to parse expiration time
		try {
			expirationTime = new Long(accessTokenExpiration);
		} catch (Exception e) {
			// set to 0 which means expired and triggers update
			expirationTime = 0l;
		}
		
		// refresh token if neeeded
		refreshTokenIfNeeded();
		
		instantiateAuthorizedShortener();
		
		return true;
	}

	/**
	 * Instantiates a authorized shortener.
	 */
	private void instantiateAuthorizedShortener() {
		GoogleCredential credential = new GoogleCredential().setAccessToken(accessToken);
		// create shortener instance
		shortener = new Urlshortener.Builder(new NetHttpTransport(), new JacksonFactory(), credential)
										.setApplicationName(applicationName)
										.build();
	}
	
	/**
	 * Refreshes the access token if it expires soon
	 */
	private void refreshTokenIfNeeded() {
		// is expired or expires in the next 5 minutes
		if(expirationTime - System.currentTimeMillis() < 5000) {
			// refresh token
			log("Access token is expired, so refresh it", LogService.LOG_DEBUG);

			GoogleRefreshTokenRequest tokenRequest = new GoogleRefreshTokenRequest(new NetHttpTransport(), new JacksonFactory(), refreshToken, clientID, clientSecret); 
			// execute request
			try {
				// indicate token update
				tokenUpdate = true;
				
				GoogleTokenResponse googleToken = tokenRequest.execute();

				expirationTime = System.currentTimeMillis() + 1000 * googleToken.getExpiresInSeconds();

				// store access token
				
				source.addProperty(GoogleUrlShortenerProperties.ACCESS_TOKEN_PROPERTY, googleToken.getAccessToken());
				
				// store access token expiration date
				source.addProperty(GoogleUrlShortenerProperties.ACCESS_TOKEN_EXPIRATION_PROPERTY, "" + expirationTime);
				
				// recreate shortener instance
				instantiateAuthorizedShortener();
			} catch (IOException e) {
				log("Could not refresh access token (" + e.getMessage() + ")" , LogService.LOG_WARNING);
			}
			finally {
				// finished token update
				tokenUpdate = false;
			}
		}
	}

	/**
	 * Registers a specific google authentication servlet
	 */
	private boolean startUIAuthentication() {
		
		if(!source.isPropertyTrue(GoogleUrlShortenerProperties.ALLOW_UI_AUTHENTICATION))
		{
			return false;
		}
		
		// get property values from configuration
		String clientID 		= source.getPropertyValue(GoogleUrlShortenerProperties.CLIENT_ID_PROPERTY);
		String clientSecret 	= source.getPropertyValue(GoogleUrlShortenerProperties.CLIENT_SECRET_PROPERTY);

		// check properties
		if(clientID == null || clientID.isEmpty())
		{
			log("A valid client id is needed in the configuration specified by " + GoogleUrlShortenerProperties.CLIENT_ID_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(clientSecret == null || clientSecret.isEmpty())
		{
			log("A valid client secret is needed in the configuration specified by " + GoogleUrlShortenerProperties.CLIENT_SECRET_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
        
        // add empty property for authetication url
        source.addProperty(SourceServiceProperties.AUTHORIZATION_URL, "");
        Property authenticationUrlProperty = source.getProperty(SourceServiceProperties.AUTHORIZATION_URL);
        
        // create authentication registrator
		authenticationRegistrator = new OAuthAuthorizationRegistrator(new GoogleOAuth20AuthorizationServlet(source), authenticationUrlProperty);
		
		// enable it with a http service tracker
		httpServiceTracker = new HttpServiceTracker(GoogleUrlShortenerSourceBundleActivator.getContext(), authenticationRegistrator);
		httpServiceTracker.open();
		
		// TODO unregister and cleanup
		
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#
	 * enrichDataSet()
	 */
	@Override
	public void enrichDataSet() {

		// let the default implementation work
		super.enrichDataSet();

		DataSet dataSet = source.getDataSet();

		// be nice and check null values
		if (dataSet == null) {
			// nothing can be done
			return;
		}
		
		if(shortener == null) {
			// no connection
			return;
		}

		// add qr markers to all information object having a website
		EList<WebSite> webSites = dataSet.getWebSites();

		if (webSites != null && !webSites.isEmpty()) {
			// refresh token if time was to long between initialization and enrichment
			refreshTokenIfNeeded();
			createHistory();
		
			for (WebSite webSite : webSites) {
				shortenUrlAndEnrichWebsite(webSite);
			}
		}

		// add adapter to get informed about new or changed items
		dataSetChangeObserver = new DataSetChangeObserver(dataSet, this);
	}

	/**
	 * If enabled, the history will be loaded and localy stored.
	 */
	private void createHistory() {
		if(!useHistory) {
			return;
		}

		longToShortHistoryMap = new HashMap<String, String>();
		// first run: get history an put in map
		try {
			UrlHistory history = shortener.url().list().execute();
			List<Url> shortenedUrls = history.getItems();
			
			while(shortenedUrls != null && !shortenedUrls.isEmpty()) {
			
				log("Got " + shortenedUrls.size() + " shortened urls from history", LogService.LOG_DEBUG);
				
				for(Url url : shortenedUrls) {
					longToShortHistoryMap.put(url.getLongUrl(), url.getId());
				}
				
				if(history.getNextPageToken() != null) {
					waitIfNeeded();
					// load next page
					history = shortener.url().list().setStartToken(history.getNextPageToken()).execute();
					shortenedUrls = history.getItems();
				}
				else {
					// end paging
					shortenedUrls = null;
					break;
				}
			}

		} catch (IOException e) {
			// no history
			log("Could not process history of shortened urls (" + e.getMessage() + ")", LogService.LOG_WARNING);
			// but continue
		}

		log("Got history with " + longToShortHistoryMap.size() + " entries." + LogService.LOG_INFO);
	}

	/**
	 * Wait if otherwise two api calls will be to close
	 */
	private void waitIfNeeded() {
		
		long diff = System.currentTimeMillis() - lastApiAccessTime - apiWaitTime;
		
		if(diff < 0) {
			try {
				Thread.sleep(-1 * diff);
			} catch (InterruptedException e) {
				log("Exception while waiting for next api call (" + e.getMessage() + ")", LogService.LOG_WARNING);
				// just continue
			}
		}
		
		// next access will happen after leaving this method
		lastApiAccessTime = System.currentTimeMillis();
	}

	/**
	 * Shortens the url of the website and enriches it.
	 * 
	 * @param webSite Website to enrich.
	 */
	private void shortenUrlAndEnrichWebsite(WebSite webSite) {
		// check if allowed
		if (neededWebSiteMetaTag != null && !webSite.hasMetaTag(neededWebSiteMetaTag)) {
			// skip
			return;
		}

		String longUrl = webSite.getAdress();
		String shortUrl = null;
		
		if(useHistory) {
			// lookup short url in history
			shortUrl = longToShortHistoryMap.get(longUrl);			
		}
		
		if(shortUrl == null) {		
			// second try: create short url
			try {
				// refresh token if it is expired
				refreshTokenIfNeeded();
				// be nice and wait a little bit
				waitIfNeeded();
				// shorten url
				Url shortened = shortener.url().insert(new Url().setLongUrl(longUrl)).execute();
				shortUrl = shortened.getId();
			} catch (IOException e) {
				log("Could not shorten url " + webSite.getAdress() + "(" + e.getMessage() + ")", LogService.LOG_WARNING);
				return;
			}
		}
		
		if(shortUrl != null) {
			// and enrich website
			enrichWebSite(webSite, shortUrl);
			if(useHistory) {
				// put it into local history
				longToShortHistoryMap.put(longUrl, shortUrl);
			}
		}
	}

	/**
	 * Shortens the url of the web site.
	 * 
	 * @param webSite
	 *            The website to create a shortened url for
	 * @param shortUrl The short url for the websites adress
	 */
	private void enrichWebSite(WebSite webSite, String shortUrl) {
		if(webSite == null || shortUrl == null || shortUrl.isEmpty()) {
			// skip
			return;
		}
		if (neededWebSiteMetaTag != null && !webSite.hasMetaTag(neededWebSiteMetaTag)) {
			// skip
			return;
		}

		// set shortened url
		webSite.setShortenedUrl(shortUrl);
		// meta tag the web site
		webSite.metaTag(GoogleUrlShortenerTags.SHORTENED_URL);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sociotech.communitymashup.data.observer.dataset.DataSetChangedInterface
	 * #dataSetChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void dataSetChanged(Notification notification) {
		if (notification == null) {
			return;
		}

		// new website added to the data set
		if (notification.getEventType() == Notification.ADD
				&& notification.getNotifier() instanceof DataSet
				&& notification.getNewValue() instanceof WebSite) {
			
			shortenUrlAndEnrichWebsite((WebSite) notification.getNewValue());
		}
		// website adress changed
		else if (notification.getEventType() == Notification.SET
				&& notification.getNotifier() instanceof WebSite
				&& notification.getFeatureID(WebSite.class) == DataPackage.WEB_SITE__ADRESS) {
	
			// enrich website
			shortenUrlAndEnrichWebsite((WebSite) notification.getNotifier());
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#stop()
	 */
	@Override
	protected void stop() {
		// disconnect data set observer
		if (dataSetChangeObserver != null) {
			dataSetChangeObserver.disconnect();
		}

		// close service tracker
		if(httpServiceTracker != null) {
			httpServiceTracker.close();
		}
		
		// unregister authentication
		if(authenticationRegistrator != null) {
			authenticationRegistrator.unregisterAll();
		}
		
		super.stop();
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#handleProperty(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	protected boolean handleProperty(Notification notification) {
		if(super.handleProperty(notification))
		{
			return true;
		}
		
		if(notification.getNotifier() instanceof Property)
		{
			Property property = (Property) notification.getNotifier();
			if(property.getKey().equals(GoogleUrlShortenerProperties.ACCESS_TOKEN_PROPERTY) && tokenUpdate)
			{
				// internal token update is handled
				return true;
			}
			
			if(property.getKey().equals(GoogleUrlShortenerProperties.ACCESS_TOKEN_EXPIRATION_PROPERTY) && tokenUpdate)
			{
				// internal token update is handled
				return true;
			}
			
			if(property.getKey().equals(GoogleUrlShortenerProperties.REFRESH_TOKEN_PROPERTY) && tokenUpdate)
			{
				// internal token update is handled
				return true;
			}
		}
		return false;
	}
}
