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
package org.sociotech.communitymashup.source.cleanup.properties;

/**
 * This class contains string constants for properties used by the clean up source service.
 * 
 * @author Peter Lachenmaier
 */
public class CleanUpProperties {


	/**
	 * Set a specific meta tag that is needed for a information object to be processed.
	 */
	public static final String DELETE_INFORMATION_OBJECTS_OLDER_THAN_PROPERTY = "deleteOlderThan";

	/**
	 * If set to true the creation date will be checked for {@link #DELETE_INFORMATION_OBJECTS_OLDER_THAN_PROPERTY}
	 * otherwise the modification date will be checked.
	 */
	public static final String USE_CREATION_DATE_PROPERTY 	= "useCreationDate";
	public static final String USE_CREATION_DATE_DEFAULT 	= "false";
	
	
	/**
	 * Unit of timed entries like {@link #DELETE_INFORMATION_OBJECTS_OLDER_THAN_PROPERTY} 
	 */
	public static final String TIME_UNIT_PROPERTY 	= "timeUnit";
	public static final String TIME_UNIT_MINUTES 	= "minutes";
	public static final String TIME_UNIT_HOURS 		= "hours";
	public static final String TIME_UNIT_DAYS 		= "days";
	public static final String TIME_UNIT_MONTHS 	= "months";	
	public static final String TIME_UNIT_DEFAULT 	= TIME_UNIT_MINUTES;
	
	/**
	 * Set a specific meta tag that is needed for a information object to be excluded by the processing.
	 */
	public static final String DONT_PROCESS_WITH_METATAG_PROPERTY = "exclusionMetaTag";

	/**
	 * Set a specific meta tag that is needed for a information object to be processed.
	 */
	public static final String PROCESS_ONLY_WITH_METATAG_PROPERTY = "neededMetaTag";
	
	/**
	 * Whether contents should be processed or not.
	 */
	public static final String PROCESS_CONTENTS_PROPERTY = "processContents";
	public static final String PROCESS_CONTENTS_DEFAULT = "true";
	
	/**
	 * Whether persons should be processed or not.
	 */
	public static final String PROCESS_PERSONS_PROPERTY = "processPersons";
	public static final String PROCESS_PERSONS_DEFAULT = "true";
	
	/**
	 * Whether organisations should be processed or not.
	 */
	public static final String PROCESS_ORGANISATIONS_PROPERTY = "processOrganisations";
	public static final String PROCESS_ORGANISATIONS_DEFAULT = "true";
	
	/**
	 * Whether persons without contents should be deleted or not.
	 */
	public static final String DELETE_PERSONS_WITHOUT_CONTENT_PROPERTY = "deletePersonWithoutContent";
	public static final String DELETE_PERSONS_WITHOUT_CONTENT_DEFAULT = "false";
	
	/**
	 * Whether contents without string value should be deleted or not.
	 */
	public static final String DELETE_CONTENTS_WITHOUT_VALUE_PROPERTY = "deleteContentsWithoutValue";
	public static final String DELETE_CONTENTS_WITHOUT_VALUE_DEFAULT = "false";
	
	/**
	 * Whether contents without document should be deleted or not.
	 */
	public static final String DELETE_CONTENTS_WITHOUT_DOCUMENT_PROPERTY = "deleteContentsWithoutDocument";
	public static final String DELETE_CONTENTS_WITHOUT_DOCUMENT_DEFAULT = "false";
	
	/**
	 * Maximum number of newest information objects
	 */
	public static final String NUMBER_OF_INFORMATIONOBJECTS_PROPERTY = "maxNumberOfInformationObjects";	
}
