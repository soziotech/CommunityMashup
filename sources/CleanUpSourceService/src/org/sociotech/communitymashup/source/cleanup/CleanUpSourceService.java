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
package org.sociotech.communitymashup.source.cleanup;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Document;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.comparators.ItemCreationDateDescendingComparator;
import org.sociotech.communitymashup.data.comparators.ItemModificationDateDescendingComparator;
import org.sociotech.communitymashup.source.cleanup.properties.CleanUpProperties;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;

/**
 * @author Peter Lachenmaier
 * 
 * Main class of the clean up source service.
 */
public class CleanUpSourceService extends SourceServiceFacadeImpl {

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#createDefaultConfiguration()
	 */
	@Override
	protected void createDefaultConfiguration() {

		super.createDefaultConfiguration();
	}


	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#initialize(org.sociotech.communitymashup.application.Source)
	 */
	@Override
	public boolean initialize(Source configuration) {

		boolean initialized = super.initialize(configuration);

		if(initialized)
		{
			// TODO check all properties
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
		
		// cleanup the data set
		cleanupDataSet();
		
		// TODO create adapter to react on new information objects
		// TODO create adapter to react on newly metatagged information objects
	}


	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#updateDataSet()
	 */
	@Override
	protected void updateDataSet() {
		
		super.updateDataSet();
		
		// simply clean up the whole data set in every update cycle
		cleanupDataSet();
	}


	/**
	 * Deletes information objects from the dataset according to the configuration.
	 */
	private void cleanupDataSet() {
		DataSet myDataSet = this.source.getDataSet();
		
		if(myDataSet == null)
		{
			return;
		}
		
		Collection<InformationObject> allInformationObjects = myDataSet.getInformationObjects();

		int maxInformationObjects = this.getMaximumNumberOfInformationObjects();
		
		if(maxInformationObjects >= 0)
		{
			// we need to sort the objects to keep only the newest
			
			Comparator<Item> comparator = null;
			
			// choose comparator
			if(isUseCreationDateEnabled())
			{
				comparator = new ItemCreationDateDescendingComparator();
			}
			else
			{
				comparator = new ItemModificationDateDescendingComparator();
			}
			
			// copy objects
			List<InformationObject> sortedInformationObjects = new LinkedList<InformationObject>(allInformationObjects);
			
			// sort it
			Collections.sort(sortedInformationObjects, comparator);
			
			// set it
			allInformationObjects = sortedInformationObjects;
		}
		
		// determine the date of the oldest io to keep
		Date oldestDate = getOldestPossibleDate();
		
		int ioCounter = 0;
		
		// look at all information objects and clean up
		for(InformationObject io : allInformationObjects)
		{
			if(!isAllowedToProcess(io))
			{
				continue;
			}
			
			// increase counter
			ioCounter++;
			
			if(maxInformationObjects >= 0 && ioCounter > maxInformationObjects)
			{
				// delete object that are to much
				log("Deleting object " + io.getName(), LogService.LOG_INFO);
				io.delete();
			}	
				
			// delete old objects
			deleteIfToOld(io, oldestDate);	
		
			// delete persons without content
			deleteIfPersonWithoutContent(io);
			
			// delete contents without value
			deleteIfContentWithoutValue(io);
			
			// delete contents without document
			deleteIfContentWithoutDocument(io);
		}
	}


	/**
	 * Deletes the given io if it is a content and has no document and feature enabled.
	 * 
	 * @param io Information object to possibly delete.
	 */
	private void deleteIfContentWithoutDocument(InformationObject io) {
		if(!(io instanceof Content) || !isContentWithoutDocumentDeletionEnabled())
		{
			// nothing to do
			return;
		}
		
		Content content = (Content) io;
		
		EList<Document> documents = content.getDocuments();
		
		if(documents == null || documents.isEmpty())
		{
			content.delete();
		}
	}


	/**
	 * Deletes the given io if it is a person and has no content and feature enabled.
	 * 
	 * @param io Information object to possibly delete.
	 */
	private void deleteIfPersonWithoutContent(InformationObject io) {
		if(!(io instanceof Person) || !isPersonWithoutContentDeletionEnabled())
		{
			// nothing to do
			return;
		}
		
		Person person = (Person) io;
		
		if(person.getContents().isEmpty())
		{
			person.delete();
		}
	}

	/**
	 * Deletes the given io if it is a content and has no value and feature enabled.
	 * 
	 * @param io Information object to possibly delete.
	 */
	private void deleteIfContentWithoutValue(InformationObject io) {
		if(!(io instanceof Content) || !isContentWithoutValueDeletionEnabled())
		{
			// nothing to do
			return;
		}
		
		Content content = (Content) io;
		
		if(content.getStringValue() == null || content.getStringValue().isEmpty())
		{
			content.delete();
		}
	}

	/**
	 * Deletes the given information object if it is last modified before the given date.
	 * 
	 * @param io Information object
	 * @param oldestDate Latest allowed date
	 */
	private void deleteIfToOld(InformationObject io, Date oldestDate) {
		
		if(io == null || oldestDate == null)
		{
			// nothing can be done
			return;
		}
		
		Date checkDate = null;
		
		if(isUseCreationDateEnabled())
		{
			checkDate = io.getCreated();
		}
		else
		{
			checkDate = io.getLastModified();
		}
		
		if(checkDate != null && checkDate.before(oldestDate))
		{
			log("Deleting old object " + io.getName(), LogService.LOG_INFO);
			// delete the information object
			io.delete();
		}
	}


	/**
	 * Calculates the oldest possible date based on the properties {@link CleanUpProperties#DELETE_INFORMATION_OBJECTS_OLDER_THAN_PROPERTY}
	 * and {@link CleanUpProperties#TIME_UNIT_PROPERTY}.
	 * 
	 * @return The calculated oldest date or null if properties not set or in error case
	 */
	private Date getOldestPossibleDate() {
		
		String timeValue = source.getPropertyValue(CleanUpProperties.DELETE_INFORMATION_OBJECTS_OLDER_THAN_PROPERTY);
		
		if(timeValue == null || timeValue.isEmpty())
		{
			// not set
			return null;
		}
		
		int timeIntValue = 0;
		
		try {
			timeIntValue = new Integer(timeValue);	
		} catch (Exception e) {
			log("Exception while parsing value of property " + CleanUpProperties.DELETE_INFORMATION_OBJECTS_OLDER_THAN_PROPERTY + ": " + e.getMessage(), LogService.LOG_WARNING);
			return null;
		}
		
		int timeFactor = 1;
		// determine the time unit
		String timeUnit = source.getPropertyValue(CleanUpProperties.TIME_UNIT_PROPERTY);
		
		if(timeUnit == null || timeUnit.isEmpty())
		{
			// not set use the default value
			timeUnit = CleanUpProperties.TIME_UNIT_DEFAULT;
		}
		
		// check possible values
		if(timeUnit.equalsIgnoreCase(CleanUpProperties.TIME_UNIT_MONTHS))
		{
			// assume month = 30 days
			timeFactor = 30 * 24 * 60;
		}
		else if(timeUnit.equalsIgnoreCase(CleanUpProperties.TIME_UNIT_DAYS))
		{
			timeFactor = 24 * 60;
		}
		else if(timeUnit.equalsIgnoreCase(CleanUpProperties.TIME_UNIT_HOURS))
		{
			timeFactor = 60;
		}
		else if(timeUnit.equalsIgnoreCase(CleanUpProperties.TIME_UNIT_MINUTES))
		{
			timeFactor = 1;
		}
		else
		{
			log("Value (" + timeUnit + ") not valid for property " + CleanUpProperties.TIME_UNIT_PROPERTY, LogService.LOG_WARNING);
			return null;
		}
		
		// now time factor is according to minutes
		// calculate for milliseconds
		timeFactor *= 60 * 1000;
		
		// create new date object for now
		Date oldestDate = new Date();
		
		// subtract timespan from now and set it
		oldestDate.setTime(oldestDate.getTime() - timeIntValue * timeFactor);
		
		return oldestDate;
	}

	/**
	 * Returns if it is allowed to process the given information object.
	 * 
	 * @param informationObject Content to check.
	 * @return True if the given information object is allowed to process.
	 */
	private boolean isAllowedToProcess(InformationObject informationObject)
	{
		if(informationObject == null)
		{
			return false;
		}
		
		if(informationObject instanceof Content && !isContentProcessingEnabled())
		{
			return false;
		}
		
		if(informationObject instanceof Person && !isPersonProcessingEnabled())
		{
			return false;
		}
		
		if(informationObject instanceof Organisation && !isOrganisationProcessingEnabled())
		{
			return false;
		}
		
		
		boolean isAllowed = true;
		
		String includingMetaTag = source.getPropertyValue(CleanUpProperties.PROCESS_ONLY_WITH_METATAG_PROPERTY);
		if(includingMetaTag != null && !includingMetaTag.isEmpty())
		{
			// only allowed if the given information object has the including meta tag
			isAllowed &= informationObject.hasMetaTag(includingMetaTag);
		}
		
		String excludingMetaTag = source.getPropertyValue(CleanUpProperties.DONT_PROCESS_WITH_METATAG_PROPERTY);
		if(excludingMetaTag != null && !excludingMetaTag.isEmpty())
		{
			// not allowed if the given information object has the excluding meta tag
			isAllowed &= !informationObject.hasMetaTag(excludingMetaTag);
		}
		
		return isAllowed;
	}
	
	/**
	 * Returns true if person processing is enabled.
	 * 
	 * @return true if person processing is enabled.
	 */
	private boolean isPersonProcessingEnabled()
	{
		String property = source.getPropertyValue(CleanUpProperties.PROCESS_PERSONS_PROPERTY);
		if(property == null)
		{
			property = CleanUpProperties.PROCESS_PERSONS_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns true if person without content deletion is enabled.
	 * 
	 * @return true if person without content deletion is enabled.
	 */
	private boolean isPersonWithoutContentDeletionEnabled()
	{
		String property = source.getPropertyValue(CleanUpProperties.DELETE_PERSONS_WITHOUT_CONTENT_PROPERTY);
		if(property == null)
		{
			property = CleanUpProperties.DELETE_PERSONS_WITHOUT_CONTENT_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns true if content without value deletion is enabled.
	 * 
	 * @return true if content without value deletion is enabled.
	 */
	private boolean isContentWithoutValueDeletionEnabled()
	{
		String property = source.getPropertyValue(CleanUpProperties.DELETE_CONTENTS_WITHOUT_VALUE_PROPERTY);
		if(property == null)
		{
			property = CleanUpProperties.DELETE_CONTENTS_WITHOUT_VALUE_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns true if content without document deletion is enabled.
	 * 
	 * @return true if content without document deletion is enabled.
	 */
	private boolean isContentWithoutDocumentDeletionEnabled()
	{
		String property = source.getPropertyValue(CleanUpProperties.DELETE_CONTENTS_WITHOUT_DOCUMENT_PROPERTY);
		if(property == null)
		{
			property = CleanUpProperties.DELETE_CONTENTS_WITHOUT_DOCUMENT_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns true if content processing is enabled.
	 * 
	 * @return true if content processing is enabled.
	 */
	private boolean isContentProcessingEnabled()
	{
		String property = source.getPropertyValue(CleanUpProperties.PROCESS_CONTENTS_PROPERTY);
		if(property == null)
		{
			property = CleanUpProperties.PROCESS_CONTENTS_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns true if organisation processing is enabled.
	 * 
	 * @return true if organisation processing is enabled.
	 */
	private boolean isOrganisationProcessingEnabled()
	{
		String property = source.getPropertyValue(CleanUpProperties.PROCESS_ORGANISATIONS_PROPERTY);
		if(property == null)
		{
			property = CleanUpProperties.PROCESS_ORGANISATIONS_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns true if the creation date should be used for comparisons.
	 * 
	 * @return true if the creation date should be used for comparisons.
	 */
	private boolean isUseCreationDateEnabled()
	{
		String property = source.getPropertyValue(CleanUpProperties.USE_CREATION_DATE_PROPERTY);
		if(property == null)
		{
			property = CleanUpProperties.USE_CREATION_DATE_DEFAULT;
		}
		return new Boolean(property);
	}
	
	/**
	 * Returns the maximum number of information objects that should be kept.
	 * 
	 * @return The maximum number of information objects that should be kept, -1 if not defined.
	 */
	private int getMaximumNumberOfInformationObjects()
	{
		String property = source.getPropertyValue(CleanUpProperties.NUMBER_OF_INFORMATIONOBJECTS_PROPERTY);
		if(property == null)
		{
			// not defined
			return -1;
		}
		
		int maxInformationObjects = -1;
		
		try {
			maxInformationObjects = new Integer(property);
		} catch (Exception e) {
			log("Could not parse configured maximum information objecs, setting it to " + maxInformationObjects, LogService.LOG_WARNING);
		}
		
		return maxInformationObjects;
	}
}
