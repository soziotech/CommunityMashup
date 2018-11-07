package org.sociotech.communitymashup.source.excelinformation.transform;

import java.util.Date;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.Connection;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.Document;
import org.sociotech.communitymashup.data.Event;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.IndoorLocation;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.data.Location;
import org.sociotech.communitymashup.data.MetaTag;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.WebAccount;
import org.sociotech.communitymashup.data.WebSite;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelContent;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelMetaTag;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelOrganization;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelPerson;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelConnection;
import org.sociotech.communitymashup.source.excelinformation.meta.ExcelInformationTags;
import org.sociotech.communitymashup.source.excelinformation.properties.ExcelInformationProperties;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;

/**
 * Class that contains methods to transforms excel objects to CommunityMashup items
 * and adds them to the data set.
 * 
 * @author Peter Lachenmaier
 */
public class ExcelInformationTransformation {

	
	/**
	 * Local reference to the source service, used for logging and adding.
	 */
	private SourceServiceFacadeImpl source;

	/**
	 * Factory for creating new CommunityMashup objects
	 */
	private DataFactory factory = DataFactory.eINSTANCE;

	/**
	 * The key for organization identifiers.
	 */
	private String orgIdentifierKey;
	
	/**
	 * The key for content identifiers.
	 */
	private String contentIdentifierKey;

	/**
	 * The key for content identifiers.
	 */
	private String personIdentifierKey;

	/**
	 * The prefix for org identifier values
	 */
	private String orgIdentifierValuePrefix;

	/**
	 * The prefix for content identifier values
	 */
	private String contentIdentifierValuePrefix;
	
	/**
	 * The prefix for person identifier values
	 */
	private String personIdentifierValuePrefix;

	/**
	 * Whether to cache document attachments or not
	 */
	private boolean cacheDocuments;
	
	/**
	 * Creates a new transformation.
	 * 
	 * @param source Source to use for logging and adding of transformed items.
	 */
	public ExcelInformationTransformation(SourceServiceFacadeImpl source) {
		this.source = source;
		// create key for org identifier -> this allows merging based on ids across sources
		this.orgIdentifierKey = source.getConfiguration().getPropertyValueElseDefault(ExcelInformationProperties.ORG_IDENTIFIER_KEY_PREFIX_PROPERTY, ExcelInformationProperties.ORG_IDENTIFIER_KEY_PREFIX_DEFAULT)
							  + source.getConfiguration().getPropertyValueElseDefault(ExcelInformationProperties.IDENTIFIER_KEY_PROPERTY, ExcelInformationProperties.IDENTIFIER_KEY_DEFAULT);
		// together with prefix for ids
		this.orgIdentifierValuePrefix = source.getConfiguration().getPropertyValueElseDefault(ExcelInformationProperties.ORG_IDENTIFIER_VALUE_PREFIX_PROPERTY, ExcelInformationProperties.ORG_IDENTIFIER_VALUE_PREFIX_DEFAULT);
		
		// create key for content identifier -> this allows merging based on ids across sources
		this.contentIdentifierKey = source.getConfiguration().getPropertyValueElseDefault(ExcelInformationProperties.CONTENT_IDENTIFIER_KEY_PREFIX_PROPERTY, ExcelInformationProperties.CONTENT_IDENTIFIER_KEY_PREFIX_DEFAULT)
							  + source.getConfiguration().getPropertyValueElseDefault(ExcelInformationProperties.IDENTIFIER_KEY_PROPERTY, ExcelInformationProperties.IDENTIFIER_KEY_DEFAULT);
		// together with prefix for ids
		this.contentIdentifierValuePrefix = source.getConfiguration().getPropertyValueElseDefault(ExcelInformationProperties.CONTENT_IDENTIFIER_VALUE_PREFIX_PROPERTY, ExcelInformationProperties.CONTENT_IDENTIFIER_VALUE_PREFIX_DEFAULT);
		
		// create key for person identifier -> this allows merging based on ids across sources
		this.personIdentifierKey = source.getConfiguration().getPropertyValueElseDefault(ExcelInformationProperties.PERSON_IDENTIFIER_KEY_PREFIX_PROPERTY, ExcelInformationProperties.PERSON_IDENTIFIER_KEY_PREFIX_DEFAULT)
									  + source.getConfiguration().getPropertyValueElseDefault(ExcelInformationProperties.IDENTIFIER_KEY_PROPERTY, ExcelInformationProperties.IDENTIFIER_KEY_DEFAULT);
				
		// together with prefix for ids
		this.personIdentifierValuePrefix = source.getConfiguration().getPropertyValueElseDefault(ExcelInformationProperties.PERSON_IDENTIFIER_VALUE_PREFIX_PROPERTY, ExcelInformationProperties.CONTENT_IDENTIFIER_VALUE_PREFIX_DEFAULT);
		
		// whether to cache document attachments
		this.cacheDocuments = source.getConfiguration().isPropertyTrueElseDefault(ExcelInformationProperties.CACHE_DOCUMENTS_PROPERTY, ExcelInformationProperties.CACHE_DOCUMENTS_DEFAULT);
				
	}
	
	/**
	 * Transforms and adds the given organization.
	 * 
	 * @param excelOrg Organization to transform.
	 */
	public Organisation transformAndAddOrganization(ExcelOrganization excelOrg) {
		if(excelOrg == null) {
			return null;
		}
		
		// at least a name and an id is required
		if(excelOrg.getName() == null || excelOrg.getName().isEmpty() || excelOrg.getId() == null || excelOrg.getId().isEmpty()) { 
			return null;
		}
		
		// create new org
		Organisation organization = factory.createOrganisation();
		
		// set name
		organization.setName(excelOrg.getName());
		
		if(excelOrg.getAlternativeNames() != null) {
			// add original also as alternative name to keep it when merging with existing items
			organization.addAlternativeName(excelOrg.getName());
		}
		
		// add alternative names
		for(String altName : excelOrg.getAlternativeNamesAsList()) {
			organization.addAlternativeName(altName);
		}
		
		// set abstract
		if(excelOrg.getAbstract()!=null) {
			organization.setStringValue(excelOrg.getAbstract());
		}
		// set xmlString
		if (excelOrg.getXmlString()!=null) {
			organization.setStringXML(excelOrg.getXmlString());
		}
		
		// add it
		Organisation tmporg = organization;
		organization = source.add(organization, "org_" + excelOrg.getId());
		if(organization == null) {
			source.log("Could not add organization " + excelOrg.getName() + " (" + excelOrg.getId() + ")", LogService.LOG_WARNING);
			return null;
		}
		if (tmporg == organization) {
			source.log("new organisation object added - "+organization.getIdent(), LogService.LOG_INFO);
		} else {
			source.log("organisation object merged - "+organization.getIdent(), LogService.LOG_INFO);
		}
		
		// add source specific meta tags
		organization.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
		organization.metaTag(ExcelInformationTags.EXCEL_ORGANIZATION_METATAG);
		
		// add tags
		for(String tag : excelOrg.getTagsAsList()) {
			organization.tag(tag);
		}
		
		// add meta tags
		for(String metatag : excelOrg.getMetaTagsAsList()) {
			organization.metaTag(metatag);
		}
		
		// set additional identifier (if defined)
		if(excelOrg.getIdentifier() != null) {
			String[] parts = excelOrg.getIdentifier().split(":");
			if (parts.length > 1) {
				organization.identifyBy(parts[0], parts[1]);
			}
		}
		
		// add location
		if(excelOrg.hasLocationInfo()) {
			// create location
			Location orgLoc = factory.createLocation();
			orgLoc.setCountry(excelOrg.getCountry());
			orgLoc.setCity(excelOrg.getTown());
			orgLoc.setZipCode(excelOrg.getZip());
			orgLoc.setStreet(excelOrg.getStreet());
			orgLoc.setHouseNumber(excelOrg.getHousenumber());
			orgLoc.setLongitude(excelOrg.getLongitude());
			orgLoc.setLatitude(excelOrg.getLatitude());
			
			// add it with id to be correctly merged on update
			orgLoc = source.add(orgLoc, "orgLoc_" + excelOrg.getId());
			
			if(orgLoc != null) {
				// metatag it
				orgLoc.metaTag(ExcelInformationTags.EXCEL_LOCATION_METATAG);
				orgLoc.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
				// and add it to the organization
				organization.extend(orgLoc);
			}
		}
		
		// add (parent) organization
		if(excelOrg.getOrg() != null && !excelOrg.getOrg().isEmpty()) {
			String[] s = excelOrg.getOrg().split(",");
			if (s.length>0) { // there is just one parent ...
		    	String tmpname = s[0].trim();
		    	Organisation org2 = factory.createOrganisation();
		    	org2.setName(tmpname);
		    	org2 = source.add(org2);
		    	if (org2 != null) {
		    		// metatag it
		    		org2.metaTag(ExcelInformationTags.EXCEL_ORGANIZATION_METATAG);
		    		org2.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
		    		organization.setParentOrganisation(org2);
		    	}
			}
		}
		
		// add person(s)
		if(excelOrg.getPers() != null && !excelOrg.getPers().isEmpty()) {
		    String[] s = excelOrg.getPers().split(",");
		    for (int i=0; i < s.length; i++) {
		    	Person person = factory.createPerson();
		    	String tmpname = s[i].trim();
		    	tmpname = tmpname.trim();
		    	int pos = tmpname.lastIndexOf(" ");
		    	if (pos > 0) {
		    		String firstname = tmpname.substring(0, pos);
		    		String lastname = tmpname.substring(pos+1);
		    		person.setFirstname(firstname);
		    		person.setLastname(lastname);
		    	} else {
		    		person.setName(tmpname);
		    	}
		    	person = source.add(person);
		    	if (person != null) {
		    		// content.connectTo(person);
		    		organization.addParticipant(person);
		    	}
		    }
		}
		
		// add images
		// main
		if(excelOrg.getMainimage() != null && !excelOrg.getMainimage().isEmpty()) {
			// check if there are more than one urls to be registered
			String tmps = excelOrg.getMainimage();
			if (tmps.indexOf(",")>0) {
				String[] imageUrls = tmps.split(",");
				for(String imageUrl : imageUrls) {
					imageUrl = imageUrl.trim();
					Image image = organization.attachImage(imageUrl);
					if (image != null) {
						image.metaTag(ExcelInformationTags.EXCEL_IMAGE_METATAG);
						image.metaTag(ExcelInformationTags.EXCEL_MAIN_IMAGE_METATAG);
						image.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
					}
				}
			} else {
				Image image = organization.attachImage(tmps.trim());
				if (image != null) {
					image.metaTag(ExcelInformationTags.EXCEL_IMAGE_METATAG);
					image.metaTag(ExcelInformationTags.EXCEL_MAIN_IMAGE_METATAG);
					image.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
				}
			}
		}
		// secondary
		if(excelOrg.getSecondaryimage() != null && !excelOrg.getSecondaryimage().isEmpty()) {
			// check if there are more than one urls to be registered as secondary images
			String tmps = excelOrg.getSecondaryimage();
			if (tmps.indexOf(",")>0) {
				String[] imageUrls = tmps.split(",");
				for(String imageUrl : imageUrls) {
					imageUrl = imageUrl.trim();
					Image image = organization.attachImage(imageUrl);
					if (image != null) {
						image.metaTag(ExcelInformationTags.EXCEL_IMAGE_METATAG);
						image.metaTag(ExcelInformationTags.EXCEL_SECONDARY_IMAGE_METATAG);
						image.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
					}
				}
			} else {
				Image image = organization.attachImage(tmps.trim());
				if (image != null) {
					image.metaTag(ExcelInformationTags.EXCEL_IMAGE_METATAG);
					image.metaTag(ExcelInformationTags.EXCEL_SECONDARY_IMAGE_METATAG);
					image.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
				}
			}
		}
		
		// add main website
		if(excelOrg.getWebsite() != null && !excelOrg.getWebsite().isEmpty()) {
			WebSite site = organization.addWebSite(excelOrg.getWebsite());
			if(site != null) {
				site.metaTag(ExcelInformationTags.EXCEL_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_MAIN_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
			}
		}

		// add secondary website
		if(excelOrg.getSecondaryWebsite() != null && !excelOrg.getSecondaryWebsite().isEmpty()) {
			WebSite site = organization.addWebSite(excelOrg.getSecondaryWebsite());
			if(site != null) {
				site.metaTag(ExcelInformationTags.EXCEL_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_SECONDARY_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
			}
		}
				
		// add special identifier -> may lead to merge
		organization.identifyBy(orgIdentifierKey, orgIdentifierValuePrefix + excelOrg.getId());
				
		return organization;
	}
	
	/**
	 * Transforms and adds the given person.
	 * 
	 * @param excelPerson Person to transform.
	 */
	public Person transformAndAddPerson(ExcelPerson excelPerson) {
		if(excelPerson == null) {
			return null;
		}
		
		// at least a name and an id is required
		if(((excelPerson.getName() == null || excelPerson.getName().isEmpty()) && (excelPerson.getFirstname() == null || excelPerson.getFirstname().isEmpty() || excelPerson.getLastname() == null || excelPerson.getLastname().isEmpty())) || 
			excelPerson.getId() == null || excelPerson.getId().isEmpty()) { 
			return null;
		}
		
		// create new person
		Person person = factory.createPerson();
		
		// set name
		if(excelPerson.getName() != null && !excelPerson.getName().isEmpty()) {
			person.setName(excelPerson.getName());
		}
		if(excelPerson.getFirstname() != null && !excelPerson.getFirstname().isEmpty()) {
			person.setFirstname(excelPerson.getFirstname());
		}
		if(excelPerson.getLastname() != null && !excelPerson.getLastname().isEmpty()) {
			person.setLastname(excelPerson.getLastname());
		}
		
		if(excelPerson.getAlternativeNames() != null) {
			// add original also as alternative name to keep it when merging with existing items
			person.addAlternativeName(excelPerson.getName());
		}
		
		// add alternative names
		for(String altName : excelPerson.getAlternativeNamesAsList()) {
			person.addAlternativeName(altName);
		}
		
		// set abstract
		if(excelPerson.getAbstract()!=null) {
			person.setStringValue(excelPerson.getAbstract());
		}
		// set xmlString
		if (excelPerson.getXmlString()!=null) {
			person.setStringXML(excelPerson.getXmlString());
		}
		
		// add it
		Person tmppers = person;
		person = source.add(person, "pers_" + excelPerson.getId());
		if(person == null) {
			source.log("Could not add person " + excelPerson.getName() + " (," + excelPerson.getFirstname() + " " + excelPerson.getLastname() + ", " + excelPerson.getId() + ")", LogService.LOG_WARNING);
			return null;
		}
		if (tmppers == person) {
			source.log("new person object added - "+person.getIdent(), LogService.LOG_INFO);
		} else {
			source.log("person object merged - "+person.getIdent(), LogService.LOG_INFO);
		}

		
		// add source specific meta tags
		person.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
		person.metaTag(ExcelInformationTags.EXCEL_PERSON_METATAG);
		
		// add tags
		for(String tag : excelPerson.getTagsAsList()) {
			person.tag(tag);
		}
		
		// add meta tags
		for(String metatag : excelPerson.getMetaTagsAsList()) {
			person.metaTag(metatag);
		}
		
		// set additional identifier (if defined)
		if(excelPerson.getIdentifier() != null) {
			String[] parts = excelPerson.getIdentifier().split(":");
			if (parts.length > 1) {
				person.identifyBy(parts[0].trim(), parts[1].trim());
			}
		}
		
		// add location
		if(excelPerson.hasLocationInfo()) {
			// create location
			Location orgLoc = factory.createLocation();
			orgLoc.setCountry(excelPerson.getCountry());
			orgLoc.setCity(excelPerson.getTown());
			orgLoc.setZipCode(excelPerson.getZip());
			orgLoc.setStreet(excelPerson.getStreet());
			orgLoc.setHouseNumber(excelPerson.getHousenumber());
			orgLoc.setLongitude(excelPerson.getLongitude());
			orgLoc.setLatitude(excelPerson.getLatitude());
			
			// add it with id to be correctly merged on update
			orgLoc = source.add(orgLoc, "orgLoc_" + excelPerson.getId());
			
			if(orgLoc != null) {
				// metatag it
				orgLoc.metaTag(ExcelInformationTags.EXCEL_LOCATION_METATAG);
				orgLoc.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
				// and add it to the organization
				person.extend(orgLoc);
			}
		}
		
		// add organization(s)
		if(excelPerson.getOrg() != null && !excelPerson.getOrg().isEmpty()) {
			String[] s = excelPerson.getOrg().split(",");
		    for (int i=0; i < s.length; i++) {
		    	String tmpname = s[i].trim();
		    	Organisation organisation = factory.createOrganisation();
		    	organisation.setName(tmpname);
		    	organisation = source.add(organisation);
		    	if (organisation != null) {
		    		// metatag it
		    		organisation.metaTag(ExcelInformationTags.EXCEL_ORGANIZATION_METATAG);
		    		organisation.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
		    		organisation.addParticipant(person);
		    	}
			}
		}
		
		// add person(s)
		if(excelPerson.getPers() != null && !excelPerson.getPers().isEmpty()) {
			String[] s = excelPerson.getPers().split(",");
		    for (int i=0; i < s.length; i++) {
		    	Person person2 = factory.createPerson();
		    	String tmpname = s[i].trim();
		    	int pos = tmpname.lastIndexOf(" ");
		    	if (pos > 0) {
		    		String firstname = tmpname.substring(0, pos);
		    		String lastname = tmpname.substring(pos+1);
		    		person2.setFirstname(firstname);
		    		person2.setLastname(lastname);
		    	} else {
		    		person2.setName(tmpname);
		    	}
		    	person2 = source.add(person2);
		    	if (person2 != null) {
		    		// metatag it
		    		person.metaTag(ExcelInformationTags.EXCEL_PERSON_METATAG);
		    		person.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
		    		person.connectTo(person2);
		    	}
			}
		}
		
		// add images
		// main
		if(excelPerson.getMainimage() != null && !excelPerson.getMainimage().isEmpty()) {
			Image image = person.attachImage(excelPerson.getMainimage());
			if(image != null) {
				image.metaTag(ExcelInformationTags.EXCEL_IMAGE_METATAG);
				image.metaTag(ExcelInformationTags.EXCEL_MAIN_IMAGE_METATAG);
				image.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
			}
		}
		// secondary
		if(excelPerson.getSecondaryimage() != null && !excelPerson.getSecondaryimage().isEmpty()) {
			Image image = person.attachImage(excelPerson.getSecondaryimage());
			if(image != null) {
				image.metaTag(ExcelInformationTags.EXCEL_IMAGE_METATAG);
				image.metaTag(ExcelInformationTags.EXCEL_SECONDARY_IMAGE_METATAG);
				image.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
			}
		}
		
		// add main website
		if(excelPerson.getWebsite() != null && !excelPerson.getWebsite().isEmpty()) {
			WebSite site = person.addWebSite(excelPerson.getWebsite());
			if(site != null) {
				site.metaTag(ExcelInformationTags.EXCEL_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_MAIN_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
			}
		}

		// add secondary website
		if(excelPerson.getSecondaryWebsite() != null && !excelPerson.getSecondaryWebsite().isEmpty()) {
			WebSite site = person.addWebSite(excelPerson.getSecondaryWebsite());
			if(site != null) {
				site.metaTag(ExcelInformationTags.EXCEL_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_SECONDARY_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
			}
		}
		
		if(excelPerson.getTwitterAccount() != null && !excelPerson.getTwitterAccount().isEmpty()) {
			WebAccount twitterAccount = person.addWebAccountForService(excelPerson.getTwitterAccount(), WebAccount.SERVICE_TWITTER);
			if(twitterAccount != null) {
				twitterAccount.metaTag(ExcelInformationTags.EXCEL_TWITTER_ACCOUNT_METATAG);
				twitterAccount.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
				twitterAccount.metaTag(WebAccount.SERVICE_TWITTER);	
			}
		}
		
		// add special identifier -> may lead to merge
		person.identifyBy(personIdentifierKey, personIdentifierValuePrefix + excelPerson.getId());
				
		return person;
	}
	
	/**
	 * Transforms and adds the given content.
	 * 
	 * @param excelContent Content to transform.
	 */
	public Content transformAndAddContent(ExcelContent excelContent) {
		if(excelContent == null) {
			return null;
		}
		
		// at least an id is required
		if(excelContent.getId() == null || excelContent.getId().isEmpty()) { 
			return null;
		}
		
		// create new content
		Content content = factory.createContent();

		// set name
		content.setName(excelContent.getName());
		
		if(excelContent.getAlternativeNames() != null) {
			// add original also as alternative name to keep it when merging with existing items
			content.addAlternativeName(excelContent.getName());
		}
		
		// add alternative names
		for(String altName : excelContent.getAlternativeNamesAsList()) {
			content.addAlternativeName(altName);
		}
		
		// add it
		Content tmpcont = content;
		content = source.add(content, "content_" + excelContent.getId());
		if(content == null) {
			source.log("Could not add content " + excelContent.getName() + " (" + excelContent.getId() + ")", LogService.LOG_WARNING);
			return null;
		}
		if (tmpcont == content) {
			source.log("new content object added - "+content.getIdent(), LogService.LOG_INFO);
		} else {
			source.log("content object merged - "+content.getIdent(), LogService.LOG_INFO);
		}
		
		// set abstract
		if(excelContent.getAbstract()!=null) {
			content.setStringValue(excelContent.getAbstract());
		}
		// set xmlString
		if (excelContent.getXmlString()!=null) {
			content.setStringXML(excelContent.getXmlString());
		}
		
		// add source specific meta tags
		content.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
		content.metaTag(ExcelInformationTags.EXCEL_CONTENT_METATAG);
		
		// add tags
		for(String tag : excelContent.getTagsAsList()) {
			content.tag(tag);
		}
		
		// add meta tags
		for(String metatag : excelContent.getMetaTagsAsList()) {
			content.metaTag(metatag);
		}
		
		// set additional identifier (if defined)
		if(excelContent.getIdentifier() != null) {
			String[] parts = excelContent.getIdentifier().split(":");
			if (parts.length > 1) {
				content.identifyBy(parts[0].trim(), parts[1].trim());
			}
		}
		
		// add location
		if(excelContent.hasLocationInfo()) {
			// create location
			Location contentLoc = factory.createLocation();
			contentLoc.setCountry(excelContent.getCountry());
			contentLoc.setCity(excelContent.getTown());
			contentLoc.setZipCode(excelContent.getZip());
			contentLoc.setStreet(excelContent.getStreet());
			contentLoc.setHouseNumber(excelContent.getHousenumber());
			contentLoc.setLongitude(excelContent.getLongitude());
			contentLoc.setLatitude(excelContent.getLatitude());
			
			// add it with id to be correctly merged on update
			contentLoc = source.add(contentLoc, "contentLoc_" + excelContent.getId());
			
			if(contentLoc != null) {
				// metatag it
				contentLoc.metaTag(ExcelInformationTags.EXCEL_LOCATION_METATAG);
				contentLoc.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
				// and add it to the content
				content.extend(contentLoc);
			}
		}
		if (excelContent.getLocation()!=null) {
			// create indoor location
			IndoorLocation contentLoc = factory.createIndoorLocation();
			contentLoc.setName(excelContent.getLocation());
			
			// add it with id to be correctly merged on update
			contentLoc = source.add(contentLoc, "contentILoc_" + excelContent.getId());
			
			if(contentLoc != null) {
				// metatag it
				contentLoc.metaTag(ExcelInformationTags.EXCEL_LOCATION_METATAG);
				contentLoc.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
				// and add it to the content
				content.extend(contentLoc);
			}
		}
		
		// add organization
		if(excelContent.getOrg() != null && !excelContent.getOrg().isEmpty()) {
			String[] s = excelContent.getOrg().split(",");
		    for (int i=0; i < s.length; i++) {
		    	String tmpname = s[i].trim();
		    	Organisation organisation = factory.createOrganisation();
		    	organisation.setName(tmpname);
		    	organisation = source.add(organisation);
		    	if (organisation != null) {
		    		content.connectTo(organisation);
		    	}
		    }
		}
		
		// add person(s)
		if(excelContent.getPers() != null && !excelContent.getPers().isEmpty()) {
		    String[] s = excelContent.getPers().split(",");
		    for (int i=0; i < s.length; i++) {
		    	Person person = factory.createPerson();
		    	String tmpname = s[i].trim();
		    	tmpname = tmpname.trim();
		    	int pos = tmpname.lastIndexOf(" ");
		    	if (pos > 0) {
		    		String firstname = tmpname.substring(0, pos);
		    		String lastname = tmpname.substring(pos+1);
		    		person.setFirstname(firstname);
		    		person.setLastname(lastname);
		    	} else {
		    		person.setName(tmpname);
		    	}
		    	person = source.add(person);
		    	if (person != null) {
		    		// content.connectTo(person);
		    		content.addContributor(person);
		    	}
		    }
		}
		
		// add images
		// main
		if(excelContent.getMainimage() != null && !excelContent.getMainimage().isEmpty()) {
			Image image = content.attachImage(excelContent.getMainimage());
			if(image != null) {
				image.metaTag(ExcelInformationTags.EXCEL_IMAGE_METATAG);
				image.metaTag(ExcelInformationTags.EXCEL_MAIN_IMAGE_METATAG);
				image.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
			}
		}
		// secondary
		if(excelContent.getSecondaryimage() != null && !excelContent.getSecondaryimage().isEmpty()) {
			Image image = content.attachImage(excelContent.getSecondaryimage());
			if(image != null) {
				image.metaTag(ExcelInformationTags.EXCEL_IMAGE_METATAG);
				image.metaTag(ExcelInformationTags.EXCEL_SECONDARY_IMAGE_METATAG);
				image.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
			}
		}
		
		// add main website
		if(excelContent.getWebsite() != null && !excelContent.getWebsite().isEmpty()) {
			WebSite site = content.addWebSite(excelContent.getWebsite());
			if(site != null) {
				site.metaTag(ExcelInformationTags.EXCEL_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_MAIN_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
			}
		}
		
		// add secondary website
		if(excelContent.getSecondaryWebsite() != null && !excelContent.getSecondaryWebsite().isEmpty()) {
			WebSite site = content.addWebSite(excelContent.getSecondaryWebsite());
			if(site != null) {
				site.metaTag(ExcelInformationTags.EXCEL_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_SECONDARY_WEBSITE_METATAG);
				site.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
			}
		}
			
		// add document
		if(excelContent.getDocumentUrl() != null && !excelContent.getDocumentUrl().isEmpty()) {
			Document document = content.attachDocument(excelContent.getDocumentUrl());
			if(document != null) {
				document.metaTag(ExcelInformationTags.EXCEL_DOCUMENT_METATAG);
				document.metaTag(ExcelInformationTags.EXCEL_ELEMENT_METATAG);
				document.setNoCache(!cacheDocuments);
			}
		}
		
		// check and add some information for agenda content
		Date startDate = excelContent.getStartdate();
		Date endDate = excelContent.getEnddate();
		if (startDate != null) {
			Event agendaItemStartEvent = factory.createEvent();
			agendaItemStartEvent.setDate(startDate);
			agendaItemStartEvent = source.add(agendaItemStartEvent, "start_" + excelContent.getId());
			agendaItemStartEvent.metaTag(ExcelInformationTags.EVENT_STARTDATE_METATAG);
			content.extend(agendaItemStartEvent);		
		}
		if (endDate != null) {
			Event agendaItemEndEvent = factory.createEvent();
			agendaItemEndEvent.setDate(endDate);
			agendaItemEndEvent = source.add(agendaItemEndEvent, "end_" + excelContent.getId());
			agendaItemEndEvent.metaTag(ExcelInformationTags.EVENT_ENDDATE_METATAG);
			content.extend(agendaItemEndEvent);
		}
		
		// add special identifier -> may lead to merge
		content.identifyBy(contentIdentifierKey, contentIdentifierValuePrefix + excelContent.getId());
				
		return content;
	}
	
	/**
	 * Transforms and adds the given connection.
	 * 
	 * @param excelConnection Connection to transform.
	 */
	public Connection transformAndAddConnection(ExcelConnection excelConnection) {
		if(excelConnection == null) {
			return null;
		}
		
		// at least an id and to and from ids are required
		if(excelConnection.getFromid() == null || excelConnection.getFromid().isEmpty() || excelConnection.getToid() == null || excelConnection.getToid().isEmpty() || 
				excelConnection.getId() == null || excelConnection.getId().isEmpty()) { 
			return null;
		}
		
		// create new connection
		Connection connection = factory.createConnection();
		
		// set from
		String identifierKey = "org.sociotech.communitymashup.source.excelinformation.ExcelInformationSourceService";
		Item itemfrom = source.getDataSet().getItemWithIdentifier(identifierKey, excelConnection.getFromid());
		if (itemfrom != null && (itemfrom instanceof InformationObject)) {
			connection.setFrom((InformationObject)itemfrom);
		} else {
			source.log("Could not retrieve from object " + excelConnection.getFromid(), LogService.LOG_WARNING);
			return null;
		}
		
		// set to
		Item itemto = source.getDataSet().getItemWithIdentifier(identifierKey, excelConnection.getToid());
		if (itemto != null && (itemto instanceof InformationObject)) {
			connection.setTo((InformationObject)itemto);
		} else {
			source.log("Could not retrieve from object " + excelConnection.getToid(), LogService.LOG_WARNING);
			return null;
		}
		
		// set abstract
		if(excelConnection.getAbstract()!=null) {
			connection.setStringValue(excelConnection.getAbstract());
		}
		// set xmlString
		if (excelConnection.getXmlString()!=null) {
			connection.setStringXML(excelConnection.getXmlString());
		}
		
		// add it
		Connection tmpconnection = connection;
		connection = source.add(connection, "connection_" + excelConnection.getId());
		if(connection == null) {
			source.log("Could not add connection " + excelConnection.getId(), LogService.LOG_WARNING);
			return null;
		}
		if (tmpconnection == connection) {
			source.log("new connection object added - "+connection.getIdent(), LogService.LOG_INFO);
		} else {
			source.log("connection object merged - "+connection.getIdent(), LogService.LOG_INFO);
		}
		
		// add meta tags
		for(String metatag : excelConnection.getMetaTagsAsList()) {
			connection.metaTag(metatag);
		}
		
		// set additional identifier (if defined)
		if(excelConnection.getIdentifier() != null) {
			String[] parts = excelConnection.getIdentifier().split(":");
			if (parts.length > 1) {
				connection.identifyBy(parts[0], parts[1]);
			}
		}
				
		return connection;
	}
	
	/**
	 * Transforms and adds the given meta tag.
	 * 
	 * @param excelMetaTag MetaTag to transform.
	 */
	public MetaTag transformAndAddMetaTag(ExcelMetaTag excelMetaTag) {
		if(excelMetaTag == null) {
			return null;
		}
		
		// at least a name is required
		if(excelMetaTag.getName() == null || excelMetaTag.getName().isEmpty()) {
			return null;
		}
		
		// create new connection
		MetaTag metaTag = factory.createMetaTag();
		
		// set name
		if(excelMetaTag.getName()!=null) {
			metaTag.setName(excelMetaTag.getName());
		}
		
		// set abstract
		if(excelMetaTag.getAbstract()!=null) {
			metaTag.setStringValue(excelMetaTag.getAbstract());
		}
		// set xmlString
		if (excelMetaTag.getXmlString()!=null) {
			metaTag.setStringXML(excelMetaTag.getXmlString());
		}
		
		// add it
		MetaTag tmpMetaTag = metaTag;
		metaTag = source.add(metaTag);
		if(metaTag == null) {
			source.log("Could not add meta tag " + excelMetaTag.getName(), LogService.LOG_WARNING);
			return null;
		}
		if (tmpMetaTag == metaTag) {
			source.log("new meta tag object added - "+metaTag.getIdent(), LogService.LOG_INFO);
		} else {
			source.log("meta tag object merged - "+metaTag.getIdent(), LogService.LOG_INFO);
		}
		
		// set additional identifier (if defined)
		if(excelMetaTag.getIdentifier() != null) {
			String[] parts = excelMetaTag.getIdentifier().split(":");
			if (parts.length > 1) {
				metaTag.identifyBy(parts[0], parts[1]);
			}
		}
				
		return metaTag;
	}
	
}
