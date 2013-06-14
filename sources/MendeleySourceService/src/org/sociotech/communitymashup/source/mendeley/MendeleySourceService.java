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
package org.sociotech.communitymashup.source.mendeley;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Property;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Document;
import org.sociotech.communitymashup.data.Email;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.WebSite;
import org.sociotech.communitymashup.source.authorization.OAuthAuthorizationRegistrator;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.mendeley.authorization.MendeleyAuthorizationServlet;
import org.sociotech.communitymashup.source.mendeley.meta.MendeleyTags;
import org.sociotech.communitymashup.source.mendeley.properties.MendeleyProperties;
import org.sociotech.communitymashup.source.mendeley.sdkadaption.AdaptedDocumentServiceImpl;
import org.sociotech.communitymashup.source.mendeley.sdkadaption.AdaptedPrivateGroupServiceImpl;
import org.sociotech.communitymashup.source.mendeley.sdkadaption.AdaptedProfile;
import org.sociotech.communitymashup.source.mendeley.sdkadaption.AdaptedProfileServiceImpl;
import org.sociotech.communitymashup.source.mendeley.sdkadaption.AdaptedPublicGroupServiceImpl;
import org.sociotech.communitymashup.source.mendeley.sdkadaption.Author;
import org.sociotech.communitymashup.source.mendeley.sdkadaption.AuthoredDocument;
import org.sociotech.communitymashup.source.mendeley.sdkadaption.Editor;
import org.sociotech.communitymashup.source.mendeley.sdkadaption.FileAttachement;
import org.sociotech.communitymashup.source.mendeley.sdkadaption.GroupDocument;
import org.sociotech.communitymashup.source.properties.SourceServiceProperties;
import org.sociotech.communitymashup.util.servicetracker.HttpServiceTracker;

import com.mendeley.oapi.schema.Contact;
import com.mendeley.oapi.schema.Discipline;
import com.mendeley.oapi.schema.Group;
import com.mendeley.oapi.schema.Group.MembershipType;
import com.mendeley.oapi.schema.Group.Type;
import com.mendeley.oapi.schema.User;
import com.mendeley.oapi.services.oauth.MendeleyAccessToken;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;
import com.mendeley.oapi.services.oauth.MendeleyOAuthService;
import com.mendeley.oapi.services.oauth.MendeleyOAuthServiceFactory;
import com.mendeley.oapi.services.oauth.MendeleyRequestToken;

/**
 * This is the main class of the mendeley source service.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleySourceService extends SourceServiceFacadeImpl {

	private AdaptedProfileServiceImpl profileService;
	private AdaptedPrivateGroupServiceImpl privateGroupService;
	private AdaptedPublicGroupServiceImpl publicGroupService;
	private AdaptedDocumentServiceImpl documentService;
	
	/**
	 * Temporary keeps created persons identified by their mendeley profile id to avoid duplicated calls. 
	 */
	private Map<String, Person> createdPersons = new HashMap<String, Person>();
	
	/**
	 * Reference to the registrator of the authentication servlet 
	 */
	private OAuthAuthorizationRegistrator authenticationRegistrator = null;
	private HttpServiceTracker httpServiceTracker;

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#initialize(org.sociotech.communitymashup.application.Source)
	 */
	@Override
	public boolean initialize(Source configuration) {
		
		boolean initialized = super.initialize(configuration);
		
		if(initialized)
		{
			initialized &= this.establishConnection();
			
			if(!initialized)
			{
				// if allowed register an authentication servlet
				startUIAuthentication();
				
				// if allowed start command line authentication
				startCommandLineAuthentication();
			}
			
			this.setInitialized(initialized);
		}
		
		return this.isInitialized();
	}

	/**
	 * Registers a specific mendeley authentication servlet
	 */
	private void startUIAuthentication() {
		
		if(!source.isPropertyTrue(MendeleyProperties.ALLOW_UI_AUTHENTICATION))
		{
			return;
		}
		
		// get property values from configuration
		String consumerKey 		= source.getPropertyValue(MendeleyProperties.CONSUMER_KEY_PROPERTY);
		String consumerSecret 	= source.getPropertyValue(MendeleyProperties.CONSUMER_SECRET_PROPERTY);
			
		// check properties
		if(consumerKey == null || consumerKey.isEmpty())
		{
			log("A valid consumer key is needed in the configuration specified by " + MendeleyProperties.CONSUMER_KEY_PROPERTY, LogService.LOG_WARNING);
			return;
		}
		else if(consumerSecret == null || consumerSecret.isEmpty())
		{
			log("A valid consumer secret is needed in the configuration specified by " + MendeleyProperties.CONSUMER_SECRET_PROPERTY, LogService.LOG_WARNING);
			return;
		}
        
        // add empty property for authetication url
        source.addProperty(SourceServiceProperties.AUTHORIZATION_URL, "");
        Property authenticationUrlProperty = source.getProperty(SourceServiceProperties.AUTHORIZATION_URL);
        
        // create authentication registrator
		authenticationRegistrator = new OAuthAuthorizationRegistrator(new MendeleyAuthorizationServlet(source), authenticationUrlProperty);
		// enable it with a http service tracker
		httpServiceTracker = new HttpServiceTracker(MendeleySourceBundleActivator.getContext(), authenticationRegistrator);
		httpServiceTracker.open();
		
		// TODO unregister and cleanup
	}

	/**
	 * Starts a command line authentication with mendeley to get the needed access token.
	 */
	private void startCommandLineAuthentication() {
		
		if(!source.isPropertyTrue(MendeleyProperties.ALLOW_COMMAND_LINE_AUTHENTICATION))
		{
			return;
		}
		
		// get property values from configuration
		String consumerKey 		= source.getPropertyValue(MendeleyProperties.CONSUMER_KEY_PROPERTY);
		String consumerSecret 	= source.getPropertyValue(MendeleyProperties.CONSUMER_SECRET_PROPERTY);
			
		// check properties
		if(consumerKey == null || consumerKey.isEmpty())
		{
			log("A valid consumer key is needed in the configuration specified by " + MendeleyProperties.CONSUMER_KEY_PROPERTY, LogService.LOG_WARNING);
			return;
		}
		else if(consumerSecret == null || consumerSecret.isEmpty())
		{
			log("A valid consumer secret is needed in the configuration specified by " + MendeleyProperties.CONSUMER_SECRET_PROPERTY, LogService.LOG_WARNING);
			return;
		}
		
		log("Starting command line authentication.", LogService.LOG_INFO);
		
		final MendeleyOAuthService oauthService = MendeleyOAuthServiceFactory.getInstance().createMendeleyOAuthService(consumerKey, consumerSecret);
		
		System.out.println("Fetching request token from Mendeley...");
		
		MendeleyRequestToken requestToken = oauthService.getOAuthRequestToken();
		
        String authUrl = requestToken.getAuthorizationUrl();

        System.out.println("Request token: " + requestToken.getToken());
        System.out.println("Token secret: " + requestToken.getTokenSecret());
        System.out.println("Expiration time: " + requestToken.getExpirationTime());

        System.out.println("Now visit:\n" + authUrl
                + "\n... and grant this app authorization");
        System.out.println("Enter the PIN code and hit ENTER when you're done:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pin;
		try {
			pin = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

        System.out.println("Fetching access token from Mendeley...");
        
        MendeleyAccessToken accessToken = oauthService.getOAuthAccessToken(requestToken, pin);

        System.out.println("Access token: " + accessToken.getToken());
        System.out.println("Token secret: " + accessToken.getTokenSecret());
	}

	/**
	 * Establishes a connection with mendeley based on the user information given in the
	 * configuration.
	 * 
	 * @return True if it is possible to use the user information for the connection, false otherwise. 
	 */
	private boolean establishConnection() {
		
		// get property values from configuration
		String consumerKey 		= source.getPropertyValue(MendeleyProperties.CONSUMER_KEY_PROPERTY);
		String consumerSecret 	= source.getPropertyValue(MendeleyProperties.CONSUMER_SECRET_PROPERTY);
		String accessToken		= source.getPropertyValue(MendeleyProperties.ACCESS_TOKEN_PROPERTY);
		String tokenSecret		= source.getPropertyValue(MendeleyProperties.ACCESS_TOKEN_SECRET_PROPERTY);
		
		// check properties
		if(consumerKey == null || consumerKey.isEmpty())
		{
			log("A valid consumer key is needed in the configuration specified by " + MendeleyProperties.CONSUMER_KEY_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(consumerSecret == null || consumerSecret.isEmpty())
		{
			log("A valid consumer secret is needed in the configuration specified by " + MendeleyProperties.CONSUMER_SECRET_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(accessToken == null || accessToken.isEmpty())
		{
			log("A valid access token is needed in the configuration specified by " + MendeleyProperties.ACCESS_TOKEN_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(tokenSecret == null || tokenSecret.isEmpty())
		{
			log("A valid token secret is needed in the configuration specified by " + MendeleyProperties.ACCESS_TOKEN_SECRET_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		MendeleyApiConsumer apiConsumer = new MendeleyApiConsumer(consumerKey, consumerSecret);
		MendeleyAccessToken accessTokenObject = new MendeleyAccessToken(accessToken, tokenSecret);
		
		// try to access profile data
		try {
			profileService = new AdaptedProfileServiceImpl(apiConsumer, accessTokenObject);
			//profileService = new ProfileServiceImpl(apiConsumer, new MendeleyAccessToken(accessToken, tokenSecret));
		} catch (Exception e) {
			log("Could not create mendeley profile service (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return false;
		}
		
		try {
			// try to access profile service
			profileService.getUser(AdaptedProfile.ME);
		}
		catch (Exception e) {
			log("Could not access mendeley profile service (" + e.getMessage() + ")", LogService.LOG_ERROR);
			//e.printStackTrace();
			profileService = null;
			return false;
		}
		
		// TODO enable disable by configuration property
		
		// try to access private group data
		try {
			privateGroupService = new AdaptedPrivateGroupServiceImpl(apiConsumer, accessTokenObject); 
		}
		catch (Exception e) {
			log("Could not create mendeley private group service (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return false;
		}
		
		try {
			privateGroupService.getGroups();
		}
		catch (Exception e) {
			log("Could not access mendeley private group service (" + e.getMessage() + ")", LogService.LOG_ERROR);
			//e.printStackTrace();
			privateGroupService = null;
			return false;
		}
		
		try {
			documentService = new AdaptedDocumentServiceImpl(apiConsumer, accessTokenObject);
		}
		catch (Exception e) {
			log("Could not create mendeley document service (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return false;
		}
		
		try {
			documentService.getAuthoredDocumentIds();
		} catch (Exception e) {
			log("Could not access mendeley document service (" + e.getMessage() + ")", LogService.LOG_ERROR);
			//e.printStackTrace();
			documentService = null;
			return false;
		}
		
		// try to access private group data
		try {
			publicGroupService = new AdaptedPublicGroupServiceImpl(apiConsumer); 
		}
		catch (Exception e) {
			log("Could not create mendeley public group service (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return false;
		}
				
		return true;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#fillDataSet(org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public void fillDataSet(DataSet dataSet) {
		
		super.fillDataSet(dataSet);
		
		Person accountOwner = null;
		
		// create own profile
		if(source.isPropertyTrueElseDefault(MendeleyProperties.CREATE_ACCOUNT_OWNER_PROPERTY, MendeleyProperties.CREATE_ACCOUNT_OWNER_DEFAULT))
		{
			accountOwner = createOwnProfile();
		
			if(accountOwner == null)
			{
				log("Error while creating account owner.", LogService.LOG_WARNING);
				return;
			}
		}
		
		// add account owners publications
		if(source.isPropertyTrueElseDefault(MendeleyProperties.ADD_AUTHORED_PUBLICATIONS_PROPERTY, MendeleyProperties.ADD_AUTHORED_PUBLICATIONS_DEFAULT))
		{
			createAuthoredPublications();
		}
				
		if(source.isPropertyTrue(MendeleyProperties.ADD_CONTACTS_PROPERTY))
		{
			createContacts(accountOwner);
		}
		
		if(source.isPropertyTrue(MendeleyProperties.ADD_PRIVATE_GROUPS_PROPERTY))
		{
			createPrivateGroups();
		}
		
		if(source.isPropertyTrue(MendeleyProperties.ADD_PUBLIC_GROUPS_PROPERTY))
		{
			createPublicGroups();
		}
	}

	
	/**
	 * Adds all publication authored by the account owner
	 */
	private void createAuthoredPublications() {
		
		List<AuthoredDocument> authoredDocuments = documentService.getAuthoredDocuments();
		
		if(authoredDocuments == null || authoredDocuments.isEmpty())
		{
			log("No authored publications", LogService.LOG_DEBUG);
			return;
		}
		
		// get details for all documents
		for(AuthoredDocument document : authoredDocuments)
		{
			try {
				// create mashup content from document
				createAuthoredDocument(document);
			}
			catch(Exception e) {
				log("Problem while retrieving details for document " + document.getTitle(), LogService.LOG_WARNING);
				continue;
			}
			
			
		}
	}

	/**
	 * Creates a mashup content from the given document.
	 * 
	 * @param document Mendeley document.
	 */
	private void createAuthoredDocument(AuthoredDocument document) {
		if(document == null || document.getTitle() == null || document.getTitle().isEmpty())
		{
			// at least a valid title is required
			return;
		}
		
		DataFactory factory = DataFactory.eINSTANCE;
		
		// create new content object
		Content docContent = factory.createContent();
		
		docContent.setName(document.getTitle());
		
		String docAbstract = document.getAbstract();
		if(docAbstract != null && !docAbstract.isEmpty())
		{
			docContent.setStringValue(docAbstract);
		}
		
		// add it
		docContent = this.add(docContent, document.getId());
		
		if(docContent == null)
		{
			log("Could not add document for mendeley document " + document.getTitle(), LogService.LOG_DEBUG);
			return;
		}
		
		// tag it
		docContent.metaTag(MendeleyTags.MENDELEY);
		docContent.metaTag(MendeleyTags.AUTHORED_DOCUMENT);
		
		// add tags as tags
		List<String> tags = document.getTags();
		if(tags != null)
		{
			for(String tag : tags)
			{
				docContent.tag(tag);
			}
		}
		// add keywords as tags
		List<String> keywords = document.getKeywords();
		if(keywords != null)
		{
			for(String keyword : keywords)
			{
				docContent.tag(keyword);
			}
		}
		
		// add type as meta tag
		String type = document.getType();
		if(type != null && !type.isEmpty())
		{
			docContent.metaTag(type);
		}
		
		// add document url as web site
		String url = document.getUrl();
		if(url == null || url.isEmpty())
		{
			// use Mendeley url instead
			url = document.getMendeleyUrl();
		}
		
		if(url != null && !url.isEmpty())
		{
			WebSite docWebsite = docContent.addWebSite(url);
			docWebsite = this.add(docWebsite, "ws_" + document.getId());
			if(docWebsite != null)
			{
				docWebsite.metaTag(MendeleyTags.MENDELEY);
			}
		}
		
		// set added date as created date
		Date addedDate = document.getAddedDate();
		if(addedDate != null)
		{
			docContent.setCreated(addedDate);
		}
		
		// add files
		if(source.isPropertyTrueElseDefault(MendeleyProperties.ATTACH_FILES_PROPERTY, MendeleyProperties.ATTACH_FILES_DEFAULT))
		{
			List<FileAttachement> files = document.getFiles();
			
			for(FileAttachement file : files)
			{
				try {
					String fileUrl = documentService.getFileUrl(file, document.getId());
					Document attachedFile = docContent.attachDocument(fileUrl);
					
					// set file extension
					attachedFile.setFileExtension(file.getFile_extension());
					
					// create unique file identifier
					attachedFile.setFileIdentifier("mendeley_" + document.getId() + "_" + file.getFile_hash());
					
					// set added date as created date
					attachedFile.setCreated(file.getAddedDate());
					
					// mark as added by this source
					attachedFile = this.add(attachedFile);
					
					if(attachedFile != null)
					{
						attachedFile.metaTag(MendeleyTags.MENDELEY_DOCUMENT);
						attachedFile.metaTag(MendeleyTags.MENDELEY);
						attachedFile.metaTag(file.getFile_extension());
						
						// file urls are only valid for a short time so only the cached files are valid
						attachedFile.setCachedOnly(true);
					}
				} catch (Exception e) {
					log("Could not download file for document " + document.getTitle() + " due to exception (" + e.getMessage() + ")", LogService.LOG_WARNING);
					//e.printStackTrace();
				}
			}
		}
		
		// set authors
		if(shouldCreateAuthors())
		{
			addMendeleyAuthors(docContent, document.getAuthors(), addedDate);
		}
		
		// set editors as contributers
		if(shouldCreateEditors())
		{
			addMendeleyEditors(docContent, document.getEditors(), addedDate);			
		}
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#updateDataSet()
	 */
	@Override
	protected void updateDataSet() {
		super.updateDataSet();
		
		// do the same as in fill (mashup merges based on source idents)
		Person accountOwner = null;
		
		// create own profile
		if(source.isPropertyTrueElseDefault(MendeleyProperties.CREATE_ACCOUNT_OWNER_PROPERTY, MendeleyProperties.CREATE_ACCOUNT_OWNER_DEFAULT))
		{
			accountOwner = createOwnProfile();
		
			if(accountOwner == null)
			{
				log("Error while creating account owner.", LogService.LOG_WARNING);
				return;
			}
		}
		
		if(source.isPropertyTrue(MendeleyProperties.ADD_CONTACTS_PROPERTY))
		{
			createContacts(accountOwner);
		}
		
		if(source.isPropertyTrue(MendeleyProperties.ADD_PRIVATE_GROUPS_PROPERTY))
		{
			createPrivateGroups();
		}
		
		if(source.isPropertyTrue(MendeleyProperties.ADD_PUBLIC_GROUPS_PROPERTY))
		{
			createPublicGroups();
		}
	}

	/**
	 * Gets all profile information of the user provided the access token and creates a person object.
	 * 
	 * @return The Person representing the mendeley account owner.
	 */
	private Person createOwnProfile() {
		
		User userProfile = null;
		
		// get only main and contact section, cause dates from cv cause an json parse error 
		try {
			//mendeleyProfile = profileService.getAdaptedProfile(AdaptedProfile.ME, AdaptedProfile.Section.MAIN);
			userProfile = profileService.getUser(AdaptedProfile.ME);
		}
		catch (Exception e) {
			log("Error while getting profile information from mendeley (" + e.getMessage() + ")", LogService.LOG_DEBUG);
			return null;
		}
		
		Person profilePerson = createPerson(userProfile);
				
		return profilePerson;
		
	}

	/**
	 * Creates organisations for private mendeley groups of the user provided the mendeley access token.
	 */
	private void createPrivateGroups() {
		List<Group> groups = privateGroupService.getGroups();
		
		if(groups == null)
		{
			// nothing to do
			return;
		}
		
		for(Group group : groups)
		{
			String groupName = group.getName();
			if(!isPrivateGroupAllowed(groupName))
			{
				log("Skipping private group " + groupName, LogService.LOG_DEBUG);
				continue;
			}
			createGroup(group);
		}
	}
	
	/**
	 * 
	 */
	private void createPublicGroups() {
		
		List<Group> groups = new LinkedList<Group>();
		
		String publicGroupIds = source.getPropertyValue(MendeleyProperties.PUBLIC_GROUP_IDS_PROPERTY);
		
		if(publicGroupIds == null || publicGroupIds.isEmpty())
		{
			log("No ids for public groups specified. Use property " + MendeleyProperties.PUBLIC_GROUP_IDS_PROPERTY + " to specify a list of group ids", LogService.LOG_WARNING);
			return;
		}
		
		String[] groupIds = publicGroupIds.split(",");
		
		// get group for every group id
		for(String groupId : groupIds)
		{
			groupId = groupId.trim();
			try{
				log("Getting details for public group with id: " + groupId, LogService.LOG_DEBUG);
				Group group = publicGroupService.getGroupDetails(groupId);
				groups.add(group);
			}
			catch (Exception e)
			{
				log("Could not get details for public group with id: " + groupId, LogService.LOG_WARNING);
			}
		}
		
		// create CommunityMashup representation for every group
		for(Group group : groups)
		{
			createGroup(group);
		}
	}

	/**
	 * Creates an organisation repsenting the given mendeley group. Will be skipped if set in source properties.
	 * 
	 * @param group Mendeley group
	 * @return Organisation representing the given mendeley group.
	 */
	private Organisation createGroup(Group group) {
		
		if(group == null)
		{
			return null;
		}
		String groupName = group.getName();
		
		if(groupName == null || groupName.isEmpty())
		{
			// at least a name is required
			return null;
		}
		
		DataFactory factory = DataFactory.eINSTANCE;
		
		Group details = null;
		
		try {
			details = privateGroupService.getGroupDetails(group.getId());
		}
		catch (Exception e) {
			log("Could not get group details for group " + groupName + " due to " + e.getMessage(), LogService.LOG_WARNING);
			return null;
		}
		
		Organisation organisation = null;
		
		if(source.isPropertyTrueElseDefault(MendeleyProperties.CREATE_GROUP_ORGANISATIONS_PROPERTY, MendeleyProperties.CREATE_GROUP_ORGANISATIONS_DEFAULT))
		{
			// create new organisation as mapping for a group
			organisation = factory.createOrganisation();
			
			organisation.setName(groupName);
			
			organisation = this.add(organisation, group.getId());
			
			if(organisation == null)
			{
				log("Could not add organisation for group " + groupName, LogService.LOG_WARNING);
				return null;
			}
			
			// tag the organisation
			Type type = group.getType();
			if(type != null && !type.value().isEmpty())
			{
				organisation.tag(type.value());
			}
			
			organisation.metaTag(MendeleyTags.MENDELEY);
			organisation.metaTag(MendeleyTags.MENDELEY_GROUP);
		
			// now add group details
			Discipline discipline = details.getDisciplines();
			if(discipline != null && !discipline.getName().isEmpty())
			{
				// tag the organisation with the discipline
				organisation.tag(discipline.getName());
			}
		}
		
		// create persons in group
		
		Map<MembershipType, List<User>> people = null; 
		try {
			people = privateGroupService.getGroupPeople(group.getId());
		}
		catch (Exception e) {
			log("Could not get group members for group " + groupName + " due to " + e.getMessage(), LogService.LOG_WARNING);
			return organisation;	
		}
		
		List<User> owners = people.get(MembershipType.OWNER);
		for(User owner : owners)
		{
			// there regularly is only one owner so set him as organisation leader
			Person ownerPerson = createPerson(owner);
			log("Created leader " + ownerPerson.getName() + " of " + group.getName() + " from " + owner, LogService.LOG_DEBUG);
			if(organisation != null && ownerPerson != null)
			{
				organisation.setLeader(ownerPerson);
			}
			// TODO create tagged mashup connection
		}
		
		List<User> members = people.get(MembershipType.MEMBERS);
		for(User member : members)
		{
			Person memberPerson = createPerson(member);
			log("Created member " + memberPerson.getName() + " of " + group.getName() + " from " + member, LogService.LOG_DEBUG);
			if(organisation != null && memberPerson != null && !organisation.getParticipants().contains(member) && organisation.getLeader() != memberPerson)
			{
				organisation.getParticipants().add(memberPerson);
			}
			// TODO create tagged mashup connection
		}
		
		List<User> followers = people.get(MembershipType.FOLLOWERS);
		for(User follower : followers)
		{
			Person followerPerson = createPerson(follower);
			log("Created follower " + followerPerson.getName() + " of " + group.getName() + " from " + follower, LogService.LOG_DEBUG);
			if(organisation != null && followerPerson != null && !organisation.getParticipants().contains(follower) && organisation.getLeader() != followerPerson)
			{
				organisation.getParticipants().add(followerPerson);
			}
			// TODO create tagged mashup connection
		}
		
		if(source.isPropertyTrue(MendeleyProperties.ADD_GROUP_DOCUMENTS_PROPERTY))
		{
			List<GroupDocument> documents = privateGroupService.getGroupDocuments(group.getId());
			log("Got " + documents.size() + " documents for group " + groupName, LogService.LOG_DEBUG);
			
			createDocuments(documents, group.getId());
		}
		
		return organisation;
	}

	/**
	 * Adds every single group document out of the given list as content object to the data set.
	 *  
	 * @param documents A list of mendeley group documents
	 * @param groupId The id of the group the document belongs to
	 */
	private void createDocuments(List<GroupDocument> documents, String groupId) {
		
		if(documents == null || documents.isEmpty())
		{
			// nothing to do
			return;
		}
		
		for(GroupDocument document : documents)
		{
			createDocument(document, groupId);
		}
	}
	

	/**
	 * Creates a content representing the given group document.
	 * 
	 * @param document Mendeley group document
	 * @param groupId The id of the group the document belongs to
	  */
	private void createDocument(GroupDocument document, String groupId) {
		
		if(document == null || document.getTitle() == null || document.getTitle().isEmpty())
		{
			// at least a valid title is required
			return;
		}
		
		DataFactory factory = DataFactory.eINSTANCE;
		
		// create new content object
		Content docContent = factory.createContent();
		
		docContent.setName(document.getTitle());
		
		String docAbstract = document.getAbstract();
		if(docAbstract != null && !docAbstract.isEmpty())
		{
			docContent.setStringValue(docAbstract);
		}
		
		// add it
		docContent = this.add(docContent, document.getId());
		
		if(docContent == null)
		{
			log("Could not add document for mendeley document " + document.getTitle(), LogService.LOG_DEBUG);
			return;
		}
		
		// tag it
		docContent.metaTag(MendeleyTags.MENDELEY);
		docContent.metaTag(MendeleyTags.GROUP_DOCUMENT);
		
		// add tags as tags
		List<String> tags = document.getTags();
		if(tags != null)
		{
			for(String tag : tags)
			{
				docContent.tag(tag);
			}
		}
		// add keywords as tags
		List<String> keywords = document.getKeywords();
		if(keywords != null)
		{
			for(String keyword : keywords)
			{
				docContent.tag(keyword);
			}
		}
		
		// add type as meta tag
		String type = document.getType();
		if(type != null && !type.isEmpty())
		{
			docContent.metaTag(type);
		}
		
		// add document url as web site
		String url = document.getUrl();
		if(url == null || url.isEmpty())
		{
			// use Mendeley url instead
			url = document.getMendeleyUrl();
		}
		
		if(url != null && !url.isEmpty())
		{
			WebSite docWebsite = docContent.addWebSite(url);
			docWebsite = this.add(docWebsite, "ws_" + document.getId());
			if(docWebsite != null)
			{
				docWebsite.metaTag(MendeleyTags.MENDELEY);
			}
		}
		
		// set added date as created date
		Date addedDate = document.getAddedDate();
		if(addedDate != null)
		{
			docContent.setCreated(addedDate);
		}
		
		// add files
		if(source.isPropertyTrueElseDefault(MendeleyProperties.ATTACH_FILES_PROPERTY, MendeleyProperties.ATTACH_FILES_DEFAULT))
		{
			List<FileAttachement> files = document.getFiles();
			
			for(FileAttachement file : files)
			{
				try {
					String fileUrl = privateGroupService.getFileUrl(file, groupId, document.getId());
					Document attachedFile = docContent.attachDocument(fileUrl);
					
					// set file extension
					attachedFile.setFileExtension(file.getFile_extension());
					
					// create unique file identifier
					attachedFile.setFileIdentifier("mendeley_" + document.getId() + "_" + file.getFile_hash());
					
					// set added date as created date
					attachedFile.setCreated(file.getAddedDate());
					
					// mark as added by this source
					attachedFile = this.add(attachedFile);
					
					if(attachedFile != null)
					{
						attachedFile.metaTag(MendeleyTags.MENDELEY_DOCUMENT);
						attachedFile.metaTag(MendeleyTags.MENDELEY);
						attachedFile.metaTag(file.getFile_extension());
						
						// file urls are only valid for a short time so only the cached files are valid
						attachedFile.setCachedOnly(true);
						
					}
				} catch (Exception e) {
					log("Could not download file for document " + document.getTitle() + " due to exception (" + e.getMessage() + ")", LogService.LOG_WARNING);
					//e.printStackTrace();
				}
			}
		}
		
		// set authors
		if(shouldCreateAuthors())
		{
			addMendeleyAuthors(docContent, document.getAuthors(), addedDate);
		}
		
		// set editors as contributers
		if(shouldCreateEditors())
		{
			addMendeleyEditors(docContent, document.getEditors(), addedDate);			
		}
	}

	/**
	 * Adds a list of mendeley author as author (first one) and contributers to the given content.
	 * 
	 * @param docContent Content object
	 * @param authors List of mendeley authors
	 * @param addedDate Creation date of the authors
	 */
	private void addMendeleyAuthors(Content docContent, List<Author> authors, Date addedDate) {
		if(authors == null || authors.isEmpty())
		{
			return;
		}
		
		for(int i = 0; i < authors.size(); i++)
		{
			Person authorPerson = createPerson(authors.get(i), addedDate);
			
			if(i == 0 && authorPerson != null)
			{
				// first mendeley author is document author 
				docContent.setAuthor(authorPerson);
				
				// TODO create mashup connection
			}
			else if(authorPerson != null && !docContent.getContributors().contains(authorPerson))
			{
				// other authors are contributers
				docContent.getContributors().add(authorPerson);
				
				// TODO create mashup connection
			}
		}
	}

	/**
	 * Adds a list of mendeley editors as contributers to the given content.
	 * 
	 * @param docContent Content object
	 * @param editors List of mendeley editors
	 * @param creationDate Creation date of the editor
	 */
	private void addMendeleyEditors(Content docContent, List<Editor> editors, Date creationDate) {
		if(editors == null || editors.isEmpty())
		{
			return;
		}
		
		for(int i = 0; i < editors.size(); i++)
		{
			Person editorPerson = createPerson(editors.get(i), creationDate);
	
			if(!docContent.getContributors().contains(editorPerson))
			{
				// editors are contributers
				docContent.getContributors().add(editorPerson);
				
				// TODO create mashup connection
			}
		}
	}
	
	/**
	 * Creates a person from an given mendeley author.
	 * 
	 * @param author Mendeley author
	 * @param creationDate The creation date of the author
	 * @return The person representing the given mendeley author.
	 */
	private Person createPerson(Author author, Date creationDate) {
		if(author == null)
		{
			return null;
		}
		
		String firstname = author.getForename();
		String lastname = author.getSurname();
		
		return createPerson(firstname, lastname, creationDate);
	}

	/**
	 * Creates a person from an given mendeley editor.
	 * 
	 * @param editor Mendeley editor
	 * @param creationDate Creation date of the editor
 	 * @return The person representing the given mendeley editor.
	 */
	private Person createPerson(Editor editor, Date creationDate) {
		if(editor == null)
		{
			return null;
		}
		
		String firstname = editor.getForename();
		String lastname = editor.getSurname();
		
		return createPerson(firstname, lastname, creationDate);
	}
	
	/**
	 * Creates a person with the given first and lastname. (Both required)
	 * 
	 * @param firstname Firstname of the person
	 * @param lastname Lastname of the person
	 * @param creationDate The creation date of the author
	 * @return Person object with the given first and lastname
	 */
	private Person createPerson(String firstname, String lastname, Date creationDate) {
		if(firstname == null || firstname.isEmpty())
		{
			// at least a firstname is required
			return null;
		}
		
		if(firstname == null || firstname.isEmpty())
		{
			// at least a lastname is required
			return null;
		}
		
		DataFactory factory = DataFactory.eINSTANCE;
		
		// create new person
		Person person = factory.createPerson();
		if(creationDate != null)
		{
			person.setCreated(creationDate);
		}
		
		// set the name
		person.setFirstname(firstname);
		person.setLastname(lastname);
		
		// and add it
		person = this.add(person);
		
		if(person == null)
		{
			log("Could not add person for mendeley author " + firstname + lastname, LogService.LOG_DEBUG);
			return null;
		}
		
		// tag the person
		person.metaTag(MendeleyTags.MENDELEY);
		
		return person;
	}

	/**
	 * Determines from the configuration if persons should be created for authors.
	 * 
	 * @return True if they should be created.
	 */
	private boolean shouldCreateAuthors() {
		if(source.isPropertyTrue(MendeleyProperties.CREATE_AUTHOR_PERSONS_PROPERTY))
		{
			return true;
		}
		
		if(source.getProperty(MendeleyProperties.CREATE_AUTHOR_PERSONS_PROPERTY) == null)
		{
			return new Boolean(MendeleyProperties.CREATE_AUTHOR_PERSONS_DEFAULT);
		}
		
		return false;
	}

	/**
	 * Determines from the configuration if persons should be created for editors.
	 * 
	 * @return True if they should be created.
	 */
	private boolean shouldCreateEditors() {
		if(source.isPropertyTrue(MendeleyProperties.CREATE_EDITOR_PERSONS_PROPERTY))
		{
			return true;
		}
		
		if(source.getProperty(MendeleyProperties.CREATE_EDITOR_PERSONS_PROPERTY) == null)
		{
			return new Boolean(MendeleyProperties.CREATE_EDITOR_PERSONS_DEFAULT);
		}
		
		return false;
	}
	
	/**
	 * Determines from the configuration if a group with the given name is allowed to be added.
	 * 
	 * @param groupName Name of the group
	 * @return True if the group can be added
	 */
	private boolean isPrivateGroupAllowed(String groupName) {
		if(groupName == null || groupName.isEmpty())
		{
			return false;
		}
		
		String allowedGroups = source.getPropertyValue(MendeleyProperties.RESTRICT_PRIVATE_GROUPS_PROPERTY);
		
		// null if no restriction set
		if(allowedGroups == null || allowedGroups.contains(groupName))
		{
			return true;
		}
		
		return false;
	}

	/**
	 * Create the contacts of the account owner as persons.
	 * 
	 * @param profilePerson Person representing the account owner
	 */
	private void createContacts(Person profilePerson) {
		
		List<User> contacts = profileService.getContacts();
		
		if(contacts == null || contacts.isEmpty())
		{
			// no contacts so nothing to do
			return;
		}
		
		User completeUser = null;
		for(User user : contacts)
		{
			try {
				completeUser = profileService.getUser(user.getProfileId());
			}
			catch (Exception e) {
				log("Could not create person from Mendeley Profile of " + user.getName() + " due to " + e.getMessage());
				continue;
			}
			
			Person contactPerson = createPerson(completeUser);
			if(profilePerson != null && contactPerson != null)
			{
				makeContacts(profilePerson, contactPerson);
			}
		}
	}

	/**
	 * Creates a contact relation between the two given persons.
	 * 
	 * @param person1 First person
	 * @param person2 Second person
	 */
	private void makeContacts(Person person1, Person person2) {
		
		if(person1 == null || person2 == null)
		{
			return;
		}
		
		EList<Person> contactList = person1.getPersons();
		
		if(person2 != null && !contactList.contains(person2))
		{	
			// TODO maybe create bidirectional relationship
			contactList.add(person2);
		}
		
		// TODO create mashup connection and tag it
	}

	/**
	 * Creates a person representing the given mendeley user.
	 * 
	 * @param user Mendeley user
	 * @return The person representing the given mendeley user.
	 */
	private Person createPerson(User user) {
		
		if(user == null)
		{
			// no main information
			return null;
		}
		
		String name = user.getName();
		if(name == null || name.isEmpty())
		{
			// at least a name is required
			return null;
		}
		
		String id = user.getProfileId();
		// in some cases user and profile id are switched in mendeley api responses
		// TODO check in future versions
		if(id == null)
		{
			id = user.getUserId();
		}
		
		if(id != null)
		{
			Person existingPerson = createdPersons.get(id);
			// check if this person was created before
			if(existingPerson != null)
			{
				log("Created " + existingPerson.getName() + " already before", LogService.LOG_DEBUG);
				return existingPerson;
			}
		}
		
		DataFactory factory = DataFactory.eINSTANCE;
		
		// create new person
		Person profilePerson = factory.createPerson();
		
		// set the name
		profilePerson.setName(name);
		
		// and add it
		profilePerson = this.add(profilePerson, id);
		
		if(profilePerson == null)
		{
			log("Could not add person for mendeley user " + name, LogService.LOG_DEBUG);
			return null;
		}
		
		// tag the person
		profilePerson.metaTag(MendeleyTags.MENDELEY);
		
		// add more profile informations
		
		// tag the person with their academic status
		String academicStatus = user.getAcademicStatus();
		if(academicStatus != null && !academicStatus.isEmpty())
		{
			profilePerson.tag(academicStatus);
		}
		
		// tag the person with their discipline
		String disciplineName = user.getDisciplineName();
		if(disciplineName != null && !disciplineName.isEmpty())
		{
			profilePerson.tag(disciplineName);
		}
		
		// add the profile image
		String imageUrl = user.getPhoto();
		// dont use the default awaiting.png image
		if(imageUrl != null && !imageUrl.isEmpty() && !imageUrl.contains("awaiting.png"))
		{
			Image profileImage = profilePerson.attachImage(imageUrl);
			profileImage = this.add(profileImage, "profimg_" + id);
			if(profileImage != null)
			{
				profileImage.tag(MendeleyTags.MENDELEY);
			}
		}
		
		// add the profile url as web site
		String profileUrl = user.getUrl();
		if(profileUrl != null && !profileUrl.isEmpty())
		{
			WebSite webProfile = profilePerson.addWebSite(profileUrl);
			webProfile = this.add(webProfile, "profweb_" + id);
			if(webProfile != null)
			{
				webProfile.tag(MendeleyTags.MENDELEY);
				webProfile.tag(MendeleyTags.MENDELEY_PROFILE);
			}
		}
		
		addContactDetails(user, profilePerson);
	
		return profilePerson;
	}

	/**
	 * Adds the contact details of the given mendeley user to the given person.
	 * 
	 * @param mendeleyUser Mendeley user
	 * @param profilePerson Person to add the contact details to.
	 */
	private void addContactDetails(User mendeleyUser, Person profilePerson) {
		
		Contact contact = null;
		
		if(mendeleyUser == null || mendeleyUser.getProfileId() == null)
		{
			// could not get contact details without profile id 
			return;
		}
		
		try
		{
			String profileId = mendeleyUser.getProfileId();
			if(profileId == null || profileId.isEmpty())
			{
				// in some mendeley results user id and profile id are messed up
				// TODO check in future updates
				profileId = mendeleyUser.getUserId();
			}
			contact = profileService.getContact(profileId);
		}
		catch (Exception e) {
			log("Could not get additional contact details for " + profilePerson.getName() + " due to " + e.getMessage(), LogService.LOG_ERROR);
			return;
		}
		
		if(contact == null)
		{
			log("No additional contact details for " + profilePerson.getName(), LogService.LOG_INFO);
			return;
		}
		
		// add email address
		String emailAddress = contact.getEmail();
		if(emailAddress != null && !emailAddress.isEmpty())
		{
			Email email = profilePerson.addEmailAddress(emailAddress);
			email = this.add(email);
			if(email != null)
			{
				email.tag(MendeleyTags.MENDELEY);
			}
		}
		
		// add web page
		String url = contact.getWebpage();
		if(url != null && !url.isEmpty())
		{
			WebSite webProfile = profilePerson.addWebSite(url);
			webProfile = this.add(webProfile);
			if(webProfile != null)
			{
				webProfile.tag(MendeleyTags.MENDELEY);
			}
		}
		
		// TODO add other contact details
	}
	
}
