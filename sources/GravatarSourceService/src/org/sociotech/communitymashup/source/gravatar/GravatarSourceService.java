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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Email;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.data.observer.dataset.DataSetChangeObserver;
import org.sociotech.communitymashup.data.observer.dataset.DataSetChangedInterface;
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
public class GravatarSourceService extends SourceServiceFacadeImpl implements DataSetChangedInterface {

	/**
	 * Observer to react on data set changes
	 */
	private DataSetChangeObserver dataSetChangeObserver;

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
		
		// add adapter to get informed about new or changed items
		dataSetChangeObserver = new DataSetChangeObserver(dataSet, this);
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
		
		String imageUrl = createImageUrl(email.getAdress()); 
		
		if(imageUrl == null)
		{
			log("Could not create gravatar image url for " + email.getAdress(), LogService.LOG_WARNING);
			return;
		}
		
		// attach the image to all information objects
		for(InformationObject informationObject : informationObjects)
		{
			Image attachedImage = enrichInfomationObject(informationObject, imageUrl);
			if(attachedImage != null) {
				// delete image after deletion of email
				attachedImage.forceDeleteOnDeleteOf(email);
			}
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
		
		String imageUrl = createImageUrl(email.getAdress()); 
				
		if(imageUrl == null)
		{
			log("Could not create gravatar image url for " + email.getAdress(), LogService.LOG_WARNING);
			return;
		}
		
		// attach the image to the information objects
		Image attachedImage = enrichInfomationObject(informationObject, imageUrl);
		if(attachedImage != null) {
			// delete image after deletion of email
			attachedImage.forceDeleteOnDeleteOf(email);
		}
	}
	
	/**
	 * Attaches an image with the given image url to the given information object.
	 * 
	 * @param informationObject Information object to attach gravatar image to
	 * @param imageUrl Url of the gravatar image
	 * @return The attached image
	 */
	private Image enrichInfomationObject(InformationObject informationObject, String imageUrl) {
		
		String ioImageIdent = informationObject.getIdent() + "_" + imageUrl.hashCode();
		
		Image gravatarImage = this.getImageWithSourceIdent(ioImageIdent);
		
		if(gravatarImage != null) {
			// image already exists
			return null;
		}
		
		gravatarImage = informationObject.attachImage(imageUrl);
		
		// add locally to remember that this image was attached by this source
		gravatarImage = this.add(gravatarImage, ioImageIdent);
		
		if(gravatarImage == null) {
			return null;
		}
		
		// tag it
		gravatarImage.metaTag(GravatarTags.GRAVATAR);
		// tag with size
		gravatarImage.metaTag(getImageSize());
		
		log("Added gravatar image " + imageUrl + " to " + informationObject.getName(), LogService.LOG_INFO);
		
		return gravatarImage;
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
	 * @return The set rating, or the default if not set.
	 */
	private String getRating() {
		return source.getPropertyValueElseDefault(GravatarProperties.RATING_PROPERTY,
												  GravatarProperties.RATING_DEFAULT);
	}

	/**
	 * Determine the default image parameter out of the configuration entry or the default value.
	 
	 * @return Gravatar default image parameter
	 */
	private String getDefaultImage() {
		String defaultImage = source.getPropertyValueElseDefault(GravatarProperties.DEFAULTIMAGE_PROPERTY,
															     GravatarProperties.DEFAULTIMAGE_DEFAULT);
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
		String size = source.getPropertyValueElseDefault(GravatarProperties.IMAGE_SIZE_PROPERTY,
														 GravatarProperties.IMAGE_SIZE_DEFAULT);
		
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

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.observer.dataset.DataSetChangedInterface#dataSetChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void dataSetChanged(Notification notification) {
		if(notification == null)
		{
			return;
		}
		
		// new email added to the data set
		if(notification.getEventType() == Notification.ADD && notification.getNotifier() instanceof DataSet && notification.getNewValue() instanceof Email)
		{
			Email newEmail = (Email) notification.getNewValue();
			// enrich information objects of email
			enrichInformationObjectsOfEmail(newEmail);
		}
		// information object got new Email
		else if(notification.getEventType() == Notification.ADD && notification.getNotifier() instanceof InformationObject && notification.getNewValue() instanceof Email)
		{
			// information object with new email
			InformationObject changedIO = (InformationObject) notification.getNotifier();
			
			// get added email
			Email addedEmail = (Email) notification.getNewValue();
				
			// enrich with email
			enrichInformationObject(changedIO, addedEmail);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#stop()
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
