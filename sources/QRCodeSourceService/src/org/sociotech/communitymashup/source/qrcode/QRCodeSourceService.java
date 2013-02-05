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
/**
 * 
 */
package org.sociotech.communitymashup.source.qrcode;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.data.WebSite;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.qrcode.adapter.NewWebSiteAdapter;
import org.sociotech.communitymashup.source.qrcode.adapter.NewWebSiteConnectionAdapter;
import org.sociotech.communitymashup.source.qrcode.meta.QRCodeTags;
import org.sociotech.communitymashup.source.qrcode.properties.QRCodeProperties;

/**
 * This is the main class of a source service that enriches a data set with
 * qr code markers using the google infographics api 
 * @see http://code.google.com/intl/de-DE/apis/chart/infographics/docs/overview.html
 * 
 * @author Peter Lachenmaier
 */
public class QRCodeSourceService extends SourceServiceFacadeImpl {

	private NewWebSiteAdapter newWebSiteAdapter;
	private NewWebSiteConnectionAdapter newWebSiteConnectionAdapter;

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#createDefaultConfiguration()
	 */
	@Override
	protected void createDefaultConfiguration() {
		
		// inherit default properties
		super.createDefaultConfiguration();
		
		// add own properties
		source.addProperty(QRCodeProperties.MARKER_SIZE_PROPERTY, 		 QRCodeProperties.MARKER_SIZE_DEFAULT);
		source.addProperty(QRCodeProperties.USE_LOAD_BALANCING_PROPERTY, QRCodeProperties.USE_LOAD_BALANCING_DEFAULT);
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#enrichDataSet()
	 */
	@Override
	public void enrichDataSet() {
		
		// let the default implentation work
		super.enrichDataSet();
		
		DataSet dataSet = source.getDataSet();
		
		// be nice and check null values
		if(dataSet == null)
		{
			// nothing can be done
			return;
		}
		
		// add qr markers to all information object having a website
		EList<WebSite> webSites = dataSet.getWebSites();
		
		if(webSites != null)
		{
			for(WebSite webSite : webSites)
			{
				enrichInformationObjectsOfWebSite(webSite);
			}
		}
		
		// TODO remove all of these adapters when stoping source
		
		// now add an adapter to observe future changes
		newWebSiteAdapter = new NewWebSiteAdapter(this);
		dataSet.eAdapters().add(newWebSiteAdapter);
		
		newWebSiteConnectionAdapter = new NewWebSiteConnectionAdapter(this);
		//dataSet.eAdapters().add(newWebSiteConnectionAdapter);
		
		EList<InformationObject> informationObjects = dataSet.getInformationObjects();
		for(InformationObject informationObject : informationObjects)
		{
			informationObject.eAdapters().add(newWebSiteConnectionAdapter);
		}
	}

	/**
	 * Attaches an qr marker to all information objects the given web site belongs
	 * to ({@link WebSite#getInformationObjects()})
	 * 
	 * @param webSite
	 */
	public void enrichInformationObjectsOfWebSite(WebSite webSite) {
		
		// check input parameters
		if(webSite == null)
		{
			return;
		}
		
		EList<InformationObject> informationObjects = webSite.getInformationObjects();
		
		if(informationObjects == null || informationObjects.isEmpty())
		{
			// not attached to an information object
			return;
		}
		
		// TODO check if this marker already exists as attachment of this information object
		
		String markerUrl = createMarkerUrl(webSite.getAdress()); 
		
		if(markerUrl == null)
		{
			log("Could not create qr marker url for " + webSite.getAdress(), LogService.LOG_WARNING);
			return;
		}
		
		// attach the image to all information objects
		for(InformationObject informationObject : informationObjects)
		{
			enrichInfomationObject(informationObject, markerUrl);
		}
		
	}

	/**
	 * Enriches the given information object with an qr marker linking to the given web site.
	 * 
	 * @param informationObject Information object to enrich
	 * @param webSite Web site the qr marker should link to
	 */
	public void enrichInformationObject(InformationObject informationObject, WebSite webSite)
	{
		if(informationObject == null || webSite == null)
		{
			return;
		}
		
		// check if this two belong together
		if(!webSite.getInformationObjects().contains(informationObject))
		{
			// not allowed to enrich information object with value of not connected website
			return;
		}
		
		// TODO check if this marker already exists as attachment of this information object
		
		String markerUrl = createMarkerUrl(webSite.getAdress()); 
				
		if(markerUrl == null)
		{
			log("Could not create qr marker url for " + webSite.getAdress(), LogService.LOG_WARNING);
			return;
		}
		
		// attach the image to the information objects
		enrichInfomationObject(informationObject, markerUrl);
	}
	
	/**
	 * Attaches an image with the given marker url to the given information object.
	 * 
	 * @param informationObject Information object to attach marker image to
	 * @param markerUrl Url of the marker image
	 */
	private void enrichInfomationObject(InformationObject informationObject, String markerUrl) {
		Image markerImage = informationObject.attachImage(markerUrl);
		// add it explicitly to this source
		markerImage = (Image) this.add(markerImage);
		// tag it
		markerImage.metaTag(QRCodeTags.QRCODE);
		// tag with size
		markerImage.metaTag(getMarkerSize());
		
		// add locally to remember that this image was attached by this source
		this.add(markerImage);
		
		log("Added qr marker " + markerUrl + " to " + informationObject.getName(), LogService.LOG_INFO);
	}

	/**
	 * Creates an url of a marker image using the google chart api. The size will be determined
	 * in the source configuration.
	 * 
	 * @param url Url the qr marker should link to
	 * @return The url of a qr marker image, null in error case.
	 */
	private String createMarkerUrl(String url) {
		
		if(url == null)
		{
			return null;
		}
		
		String balancePrefix = "";
		if(source.isPropertyTrue(QRCodeProperties.USE_LOAD_BALANCING_PROPERTY))
		{
			// create a prefix between 0 and 9
			balancePrefix += new Random().nextInt(10) + "."; 
		}
		
		String size = getMarkerSize();
		
		String encodedUrl = url;
		
		// try to encode the url
		try {
			encodedUrl = URLEncoder.encode(url, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			log("Could not UTF-8 ecode url " + url + " due to " + e.getMessage(), LogService.LOG_WARNING);
		}
		
		return "http://" + balancePrefix + "chart.googleapis.com/chart?chs=" + size + "&cht=qr&chl=" + encodedUrl;
	}

	/**
	 * Determine the needed marker size out of the configuration entry or the default value.
	 * 
	 * @return The marker size as String in Form {X}x{Y}
	 */
	private String getMarkerSize() {
		String size = source.getPropertyValue(QRCodeProperties.MARKER_SIZE_PROPERTY);
		
		if(size == null || size.isEmpty())
		{
			size = QRCodeProperties.MARKER_SIZE_DEFAULT;
		}
		
		if(!size.contains("x"))
		{
			// make quadratic size
			size = size + "x" + size;
		}
		return size;
	}
	
	
	
}
