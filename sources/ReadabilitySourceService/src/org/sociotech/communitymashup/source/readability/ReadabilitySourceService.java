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
package org.sociotech.communitymashup.source.readability;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.Connection;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.WebSite;
import org.sociotech.communitymashup.data.observer.dataset.DataSetChangeObserver;
import org.sociotech.communitymashup.data.observer.dataset.DataSetChangedInterface;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.readability.apiwrapper.ReadabilityAPIWrapper;
import org.sociotech.communitymashup.source.readability.apiwrapper.items.ReadabilityResult;
import org.sociotech.communitymashup.source.readability.meta.ReadabilityTags;
import org.sociotech.communitymashup.source.readability.properties.ReadabilityProperties;
import org.sociotech.communitymashup.source.readability.transformation.ReadabilityTransformation;

/**
 * Main class of the readability source service.
 * 
 * @author Peter Lachenmaier
 */
public class ReadabilitySourceService extends SourceServiceFacadeImpl implements
		DataSetChangedInterface {

	/**
	 * Trasformation to CommunityMashup objects.
	 */
	private ReadabilityTransformation transformation;

	/**
	 * Reference to the api
	 */
	private ReadabilityAPIWrapper api;

	/**
	 * Indicates if persons should be enriched
	 */
	private boolean enrichPersons;

	/**
	 * Indicates if contents should be enriched
	 */
	private boolean enrichContents;

	/**
	 * Indicates if organisations should be enriched
	 */
	private boolean enrichOrganisations;

	/**
	 * Indicates if authors should be created
	 */
	private boolean createAuthors;

	/**
	 * Indicates if excerpts should be added
	 */
	private boolean addExcerpts;

	/**
	 * Indicates if full content should be added
	 */
	private boolean addFullContents;

	private DataSetChangeObserver dataSetChangeObserver;

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
			// create transformation
			transformation = new ReadabilityTransformation(this);

			String apiBaseUrl = source.getPropertyValueElseDefault(
					ReadabilityProperties.API_URL_PROPERTY,
					ReadabilityProperties.API_URL_PROPERTY_DEFAULT);
			String apiKey = source.getPropertyValueElseDefault(
					ReadabilityProperties.API_KEY_PROPERTY, "");

			api = new ReadabilityAPIWrapper(apiBaseUrl, apiKey);

			enrichPersons = source.isPropertyTrueElseDefault(
					ReadabilityProperties.ENRICH_PERSON_WEBSITE_PROPERTY,
					ReadabilityProperties.ENRICH_PERSON_WEBSITE_DEFAULT);

			enrichContents = source.isPropertyTrueElseDefault(
					ReadabilityProperties.ENRICH_CONTENT_WEBSITE_PROPERTY,
					ReadabilityProperties.ENRICH_CONTENT_WEBSITE_DEFAULT);

			enrichOrganisations = source.isPropertyTrueElseDefault(
					ReadabilityProperties.ENRICH_ORGANISATION_WEBSITE_PROPERTY,
					ReadabilityProperties.ENRICH_ORGANISATION_WEBSITE_DEFAULT);

			createAuthors = source.isPropertyTrueElseDefault(
					ReadabilityProperties.ADD_AUTHOR_PROPERTY,
					ReadabilityProperties.ADD_AUTHOR_DEFAULT);

			addExcerpts = source.isPropertyTrueElseDefault(
					ReadabilityProperties.ADD_EXCERPT_PROPERTY,
					ReadabilityProperties.ADD_EXCERPT_DEFAULT);

			addFullContents = source.isPropertyTrueElseDefault(
					ReadabilityProperties.ADD_CONTENT_PROPERTY,
					ReadabilityProperties.ADD_CONTENT_DEFAULT);

		}

		this.setInitialized(initialized);
		return initialized;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#
	 * enrichDataSet()
	 */
	@Override
	protected void enrichDataSet() {
		super.enrichDataSet();

		DataSet dataSet = source.getDataSet();

		if (dataSet == null) {
			return;
		}

		// do enrichment

		// look for websites
		EList<WebSite> allWebSites = dataSet.getWebSites();

		for (WebSite webSite : allWebSites) {
			// enrich every single website
			enrichWebSite(webSite);
		}

		// add adapter to get informed about new or changed items
		dataSetChangeObserver = new DataSetChangeObserver(dataSet, this);
	}

	/**
	 * Enriches the base element based on the given website
	 * 
	 * @param webSite
	 *            Website for the base element to enrich
	 */
	private void enrichWebSite(WebSite webSite) {

		if (!isAllowedToEnrich(webSite)) {
			// enrichment switched off
			// -> nothing to do
			return;
		}

		// get result from readability
		ReadabilityResult readableWebSite = api.getReadablityVersionOf(webSite
				.getAdress());

		if (readableWebSite == null) {
			log("Website " + webSite.getAdress()
					+ " has no readability result.", LogService.LOG_WARNING);
			return;
		}

		Content excerpt = null;
		if (addExcerpts) {
			excerpt = transformation.createAndAddExcerpt(readableWebSite,
					createAuthors);
		}

		Content fullContent = null;
		if (addFullContents) {
			fullContent = transformation.createAndAddFullContent(
					readableWebSite, createAuthors);
		}

		Content contentToConnect;
		if (excerpt != null && fullContent != null) {
			// add excerpt as sub content
			excerpt.setParentContent(fullContent);
			contentToConnect = fullContent;
		} else if (fullContent != null) {
			contentToConnect = fullContent;
		} else if (excerpt != null) {
			contentToConnect = excerpt;
		} else {
			// nothing to connect
			return;
		}

		// do enrichment for all possible information objects
		EList<InformationObject> ios = webSite.getInformationObjects();

		// look if there is an enrichable information object
		for (InformationObject io : ios) {
			if (io instanceof Person && enrichPersons) {
				// TODO switch to set person as content author
				// connect to content with address as value
				Connection con = io.connectToWithValueAndMetaTag(
						contentToConnect, webSite.getAdress(),
						ReadabilityTags.PC_CONNECTION_METATAG);
				// add connection to mark it to be from this source
				this.add(con);
			} else if (io instanceof Organisation && enrichOrganisations) {
				// connect to content with address as value
				Connection con = io.connectToWithValueAndMetaTag(
						contentToConnect, webSite.getAdress(),
						ReadabilityTags.OC_CONNECTION_METATAG);
				// add connection to mark it to be from this source
				this.add(con);
			} else if (io instanceof Content && enrichContents) {
				// add as subcontent
				contentToConnect.setParentContent((Content) io);

				// connect to content with address as value
				Connection con = io.connectToWithValueAndMetaTag(
						contentToConnect, webSite.getAdress(),
						ReadabilityTags.CC_CONNECTION_METATAG);
				// add connection to mark it to be from this source
				this.add(con);
			}
		}

		log("Enriched with website " + webSite.getAdress(), LogService.LOG_INFO);

	}

	/**
	 * Checks if enrichment based on the given web site is allowed.
	 * 
	 * @param webSite
	 *            Website for enrichment
	 * @return True if enrichmen allowed and possible, false otherwise.
	 */
	private boolean isAllowedToEnrich(WebSite webSite) {
		if (webSite == null) {
			return false;
		}

		if (webSite.getAdress() == null || webSite.getAdress().isEmpty()) {
			// no url set
			return false;
		}

		// check needed meta tag
		String neededMetaTag = source
				.getPropertyValue(ReadabilityProperties.PROCESS_ONLY_WITH_METATAG_PROPERTY);

		if (neededMetaTag != null && !neededMetaTag.isEmpty()
				&& !webSite.hasMetaTag(neededMetaTag)) {
			// website does not have needed meta tag
			return false;
		}

		EList<InformationObject> ios = webSite.getInformationObjects();
		if (ios == null || ios.isEmpty()) {
			// nothing to do
			return false;
		}

		// look if there is an enrichable information object
		for (InformationObject io : ios) {
			if (io instanceof Person && enrichPersons)
				return true;
			if (io instanceof Organisation && enrichOrganisations)
				return true;
			if (io instanceof Content && enrichContents)
				return true;
		}

		return false;
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
		if(notification == null)
		{
			return;
		}
		
		// new web site added to the data set
		if(notification.getEventType() == Notification.ADD && notification.getNotifier() instanceof DataSet && notification.getNewValue() instanceof WebSite)
		{
			WebSite newWebSite = (WebSite) notification.getNewValue();
			// enrich new web site
			enrichWebSite(newWebSite);
		}
		// web site changed
		else if(notification.getNotifier() instanceof WebSite)
		{
			WebSite changedWebSite = (WebSite) notification.getNotifier();
			// enrich changed web site
			enrichWebSite(changedWebSite);
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

		super.stop();
	}

}
