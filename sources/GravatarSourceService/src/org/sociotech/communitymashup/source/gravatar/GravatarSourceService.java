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
package org.sociotech.communitymashup.source.gravatar;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.commons.codec.digest.DigestUtils;
import org.eclipse.emf.common.util.EList;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Email;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.source.gravatar.adapter.NewEmailAdapter;
import org.sociotech.communitymashup.source.gravatar.adapter.NewEmailConnectionAdapter;
import org.sociotech.communitymashup.source.gravatar.meta.GravatarTags;
import org.sociotech.communitymashup.source.gravatar.properties.GravatarProperties;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;

/**
 * This is the main class of a source service that enriches a data set with
 * images associated with email addresses using gravatar. 
 * @see http://de.gravatar.com/site/implement/images/
 * 
 * @author Peter Lachenmaier
 */
public class GravatarSourceService extends SourceServiceFacadeImpl {

	private NewEmailAdapter newEmailAdapter;
	private NewEmailConnectionAdapter newEmailConnectionAdapter;

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#createDefaultConfiguration()
	 */
	@Override
	protected void createDefaultConfiguration() {
		
		// inherit default properties
		super.createDefaultConfiguration();
		
		// add own properties
		source.addProperty(GravatarProperties.IMAGE_SIZE_PROPERTY,	 GravatarProperties.IMAGE_SIZE_DEFAULT);
		source.addProperty(GravatarProperties.RATING_PROPERTY,		 GravatarProperties.RATING_DEFAULT);
		source.addProperty(GravatarProperties.DEFAULTIMAGE_PROPERTY, GravatarProperties.DEFAULTIMAGE_DEFAULT);
		
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
		
		// add to all information objects having a email adress
		EList<Email> emailAddresses = dataSet.getEmails();
		
		if(emailAddresses != null)
		{
			for(Email email : emailAddresses)
			{
				enrichInformationObjectsOfEmail(email);
			}
		}
		
		// TODO remove all of these adapters when stoping source
		
		// now add an adapter to observe future changes
		newEmailAdapter = new NewEmailAdapter(this);
		dataSet.eAdapters().add(newEmailAdapter);
		
		newEmailConnectionAdapter = new NewEmailConnectionAdapter(this);
		//dataSet.eAdapters().add(newWebSiteConnectionAdapter);
		
		EList<InformationObject> informationObjects = dataSet.getInformationObjects();
		for(InformationObject informationObject : informationObjects)
		{
			informationObject.eAdapters().add(newEmailConnectionAdapter);
		}
	}

	/**
	 * Attaches a gravatar image to all information objects the given email belongs
	 * to ({@link Email#getInformationObjects()})
	 * 
	 * @param email Email Address to be used for retrieval of gravatar image
	 */
	public void enrichInformationObjectsOfEmail(Email email) {
		
		// check input parameters
		if(email == null)
		{
			return;
		}
		
		EList<InformationObject> informationObjects = email.getInformationObjects();
		
		if(informationObjects == null || informationObjects.isEmpty())
		{
			// not attached to an information object
			return;
		}
		
		// TODO check if this image already exists as attachment of this information object
		
		String imageUrl = createImageUrl(email.getAdress()); 
		
		if(imageUrl == null)
		{
			log("Could not create gravatar image url for " + email.getAdress(), LogService.LOG_WARNING);
			return;
		}
		
		// attach the image to all information objects
		for(InformationObject informationObject : informationObjects)
		{
			enrichInfomationObject(informationObject, imageUrl);
		}
		
	}

	/**
	 * Enriches the given information object with a gravatar image.
	 * 
	 * @param informationObject Information object to enrich
	 * @param email Email address used for retrieval of gravatar image
	 */
	public void enrichInformationObject(InformationObject informationObject, Email email)
	{
		if(informationObject == null || email == null)
		{
			return;
		}
		
		// check if this two belong together
		if(!email.getInformationObjects().contains(informationObject))
		{
			// not allowed to enrich information object with value of not connected website
			return;
		}
		
		// TODO check if this image already exists as attachment of this information object
		
		String imageUrl = createImageUrl(email.getAdress()); 
				
		if(imageUrl == null)
		{
			log("Could not create gravatar image url for " + email.getAdress(), LogService.LOG_WARNING);
			return;
		}
		
		// attach the image to the information objects
		enrichInfomationObject(informationObject, imageUrl);
	}
	
	/**
	 * Attaches an image with the given image url to the given information object.
	 * 
	 * @param informationObject Information object to attach gravatar image to
	 * @param imageUrl Url of the gravatar image
	 */
	private void enrichInfomationObject(InformationObject informationObject, String imageUrl) {
		
		Image gravatarImage = informationObject.attachImage(imageUrl);
		// add it explicitly to this source
		gravatarImage = (Image) this.add(gravatarImage);
		// tag it
		gravatarImage.metaTag(GravatarTags.GRAVATAR);
		// tag with size
		gravatarImage.metaTag(getImageSize());
		
		// add locally to remember that this image was attached by this source
		this.add(gravatarImage);
		
		log("Added gravatar image " + imageUrl + " to " + informationObject.getName(), LogService.LOG_INFO);
	}

	/**
	 * Creates an url of a gravatar image using a hash of the email address. The size will be determined
	 * in the source configuration.
	 * 
	 * @param emailAddress Address that should be used for the image retrieval
	 * @return The url of a gravatar image, null in error case.
	 */
	private String createImageUrl(String emailAddress) {
		
		if(emailAddress == null || emailAddress.isEmpty())
		{
			return null;
		}
		
		// get all needed parameters
		String size = getImageSize();
		String defaultImage = getDefaultImage();
		String rating = getRating();
		String emailHash = getEmailHash(emailAddress);
		
		// create specific image url and return it
		return "http://www.gravatar.com/avatar/" + emailHash + "?s=" + size + "&r=" + rating + "&d=" + defaultImage;
	}

	/**
	 * Determines the gravatar email hash parameter.
	 * @param emailAddress Address to be used for parameter generation.
	 * 
	 * @return Gravatar hash parameter.
	 */
	private String getEmailHash(String emailAddress) {
		return DigestUtils.md5Hex(emailAddress.toLowerCase().trim());
	}

	/**
	 * Determine the gravatar rating parameter out of the configuration entry or the default value.
	 *
	 * @return
	 */
	private String getRating() {
		String rating = source.getPropertyValue(GravatarProperties.RATING_PROPERTY);
		
		if(rating == null || rating.isEmpty())
		{
			// not set so use default value
			rating = GravatarProperties.RATING_DEFAULT;
		}
		
		return rating;
	}

	/**
	 * Determine the default image parameter out of the configuration entry or the default value.
	 
	 * @return Gravatar default image parameter
	 */
	private String getDefaultImage() {
		String defaultImage = source.getPropertyValue(GravatarProperties.DEFAULTIMAGE_PROPERTY);
		
		if(defaultImage == null || defaultImage.isEmpty())
		{
			// not set so use default value
			defaultImage = GravatarProperties.DEFAULTIMAGE_DEFAULT;
		}
		
		if(defaultImage.startsWith("http"))
		{
			// image url set as default image
			try {
				defaultImage = URLEncoder.encode(defaultImage, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				log("Could not encode default image.", LogService.LOG_ERROR);
				return GravatarProperties.DEFAULTIMAGE_DEFAULT;
			}
		}
		
		return defaultImage;
	}

	/**
	 * Determine the needed image size out of the configuration entry or the default value.
	 * 
	 * @return The image size as value between 1 and 512
	 */
	private String getImageSize() {
		String size = source.getPropertyValue(GravatarProperties.IMAGE_SIZE_PROPERTY);
		
		if(size == null || size.isEmpty())
		{
			size = GravatarProperties.IMAGE_SIZE_DEFAULT;
		}
		
		Integer intSize = new Integer(size);
		if(intSize < 1)
		{
			size = "1";
		}
		else if(intSize > 512)
		{
			size = "512";
		}
		
		return size;
	}
}
