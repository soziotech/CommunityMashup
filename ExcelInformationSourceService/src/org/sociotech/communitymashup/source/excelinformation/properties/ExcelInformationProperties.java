package org.sociotech.communitymashup.source.excelinformation.properties;

/**
 * This class contains string constants for properties used by the excel information source service.
 * 
 * @author Peter Lachenmaier
 */
public class ExcelInformationProperties {

    /**
     * This property is used to set the url of the excel file.
     */
    public static final String FILE_URL_PROPERTY = "fileUrl";
    
    /**
     * Whether to add organisation data or not 
     */
    public static final String USE_ORGANISATIONS_PROPERTY 	= "useOrganisations";
    public static final String USE_ORGANISATIONS_DEFAULT 	= "true";
    
    /**
     * Whether to add contents data or not 
     */
    public static final String USE_CONTENTS_PROPERTY 	= "useContents";
    public static final String USE_CONTENTS_DEFAULT 	= "true";
 
    /**
     * Whether to add persons data or not 
     */
    public static final String USE_PERSONS_PROPERTY 	= "usePersons";
    public static final String USE_PERSONS_DEFAULT 		= "true";
    
    /**
     * Whether to add connections data or not 
     */
    public static final String USE_CONNECTIONS_PROPERTY 	= "useConnections";
    public static final String USE_CONNECTIONS_DEFAULT 		= "false";
 
    /**
     * Whether to add meta tag data or not 
     */
    public static final String USE_METATAGS_PROPERTY 	= "useMetaTags";
    public static final String USE_METATAGS_DEFAULT 	= "false";
    
    /**
     * The key for identifiers created from the id column
     */
    public static final String IDENTIFIER_KEY_PROPERTY 	= "identifierKey";
    public static final String IDENTIFIER_KEY_DEFAULT 	= "excel";
    
    /**
     * The prefix for identifier keys for organisations
     */
    public static final String ORG_IDENTIFIER_KEY_PREFIX_PROPERTY 		= "orgIdentifierKeyPrefix";
    public static final String ORG_IDENTIFIER_KEY_PREFIX_DEFAULT 		= "org_";
    
    /**
     * The prefix for identifier values for organisations
     */
    public static final String ORG_IDENTIFIER_VALUE_PREFIX_PROPERTY 	= "orgIdentifierValuePrefix";
    public static final String ORG_IDENTIFIER_VALUE_PREFIX_DEFAULT 		= "";
   
    /**
     * The prefix for identifier keys for contents
     */
    public static final String CONTENT_IDENTIFIER_KEY_PREFIX_PROPERTY 	= "contentIdentifierKeyPrefix";
    public static final String CONTENT_IDENTIFIER_KEY_PREFIX_DEFAULT 	= "content_";
    
    /**
     * The prefix for identifier values for contents
     */
    public static final String CONTENT_IDENTIFIER_VALUE_PREFIX_PROPERTY = "contentIdentifierValuePrefix";
    public static final String CONTENT_IDENTIFIER_VALUE_PREFIX_DEFAULT 	= "";
    
    /**
     * The prefix for identifier keys for persons
     */
    public static final String PERSON_IDENTIFIER_KEY_PREFIX_PROPERTY 	= "personIdentifierKeyPrefix";
    public static final String PERSON_IDENTIFIER_KEY_PREFIX_DEFAULT 	= "person_";
    
    /**
     * The prefix for identifier values for persons
     */
    public static final String PERSON_IDENTIFIER_VALUE_PREFIX_PROPERTY = "personIdentifierValuePrefix";
    public static final String PERSON_IDENTIFIER_VALUE_PREFIX_DEFAULT 	= "";
    
    /**
     * Whether to cache document attachments or not
     */
    public static final String CACHE_DOCUMENTS_PROPERTY = "cacheDocumentAttachments";
    public static final String CACHE_DOCUMENTS_DEFAULT 	= "false";
    
    
}
