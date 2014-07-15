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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Property;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.source.authorization.OAuthAuthorizationRegistrator;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.MendeleyAPIWrapper;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyDocumentDetails;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyProfile;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyPublicGroupDetails;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyUsersGroup;
import org.sociotech.communitymashup.source.mendeley.authorization.MendeleyOAuth20AuthorizationServlet;
import org.sociotech.communitymashup.source.mendeley.oauth20.MendeleyOAuth20AccessToken;
import org.sociotech.communitymashup.source.mendeley.properties.MendeleyProperties;
import org.sociotech.communitymashup.source.mendeley.transformation.MendeleyTransformation;
import org.sociotech.communitymashup.source.properties.SourceServiceProperties;
import org.sociotech.communitymashup.util.servicetracker.HttpServiceTracker;

/**
 * This is the main class of the mendeley source service.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleySourceService extends SourceServiceFacadeImpl {

	/**
	 * Reference to the registrator of the authentication servlet 
	 */
	private OAuthAuthorizationRegistrator authenticationRegistrator = null;
	private HttpServiceTracker httpServiceTracker;
	private MendeleyAPIWrapper mendeleyApi;
	private MendeleyOAuth20AccessToken mendeleyToken;
	
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
	private MendeleyTransformation transformation;

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#initialize(org.sociotech.communitymashup.application.Source)
	 */
	@Override
	public boolean initialize(Source configuration) {
		
		boolean initialized = super.initialize(configuration);
		
		if(initialized)
		{
			initialized = this.establishConnection();
			
			// if allowed register an authentication servlet
			initialized |= startUIAuthentication();
			
			// TODO maybe we need another source state indication authentication for oauth 2.0
			
			this.setInitialized(initialized);
		}
		
		return this.isInitialized();
	}

	/**
	 * Registers a specific mendeley authentication servlet
	 */
	private boolean startUIAuthentication() {
		
		if(!source.isPropertyTrue(MendeleyProperties.ALLOW_UI_AUTHENTICATION))
		{
			return false;
		}
		
		// get property values from configuration
		String clientID 		= source.getPropertyValue(MendeleyProperties.CLIENT_ID_PROPERTY);
		String clientSecret 	= source.getPropertyValue(MendeleyProperties.CLIENT_SECRET_PROPERTY);

		// check properties
		if(clientID == null || clientID.isEmpty())
		{
			log("A valid client id is needed in the configuration specified by " + MendeleyProperties.CLIENT_ID_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(clientSecret == null || clientSecret.isEmpty())
		{
			log("A valid client secret is needed in the configuration specified by " + MendeleyProperties.CLIENT_SECRET_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
        
        // add empty property for authetication url
        source.addProperty(SourceServiceProperties.AUTHORIZATION_URL, "");
        Property authenticationUrlProperty = source.getProperty(SourceServiceProperties.AUTHORIZATION_URL);
        
        // create authentication registrator
		authenticationRegistrator = new OAuthAuthorizationRegistrator(new MendeleyOAuth20AuthorizationServlet(source), authenticationUrlProperty);
		
		// enable it with a http service tracker
		httpServiceTracker = new HttpServiceTracker(MendeleySourceBundleActivator.getContext(), authenticationRegistrator);
		httpServiceTracker.open();
		
		// TODO unregister and cleanup
		
		return true;
	}

	/**
	 * Establishes a connection with mendeley based on the user information given in the
	 * configuration.
	 * 
	 * @return True if it is possible to use the user information for the connection, false otherwise. 
	 */
	private boolean establishConnection() {
		
		clientID 				= source.getPropertyValue(MendeleyProperties.CLIENT_ID_PROPERTY);
		clientSecret		 	= source.getPropertyValue(MendeleyProperties.CLIENT_SECRET_PROPERTY);
		
		String accessToken		= source.getPropertyValue(MendeleyProperties.ACCESS_TOKEN_PROPERTY);
		
		// check properties
		if(clientID == null || clientID.isEmpty())
		{
			log("A valid client id is needed in the configuration specified by " + MendeleyProperties.CLIENT_ID_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(clientSecret == null || clientSecret.isEmpty())
		{
			log("A valid client secret is needed in the configuration specified by " + MendeleyProperties.CLIENT_SECRET_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		else if(accessToken == null || accessToken.isEmpty())
		{
			log("A valid access token is needed in the configuration specified by " + MendeleyProperties.ACCESS_TOKEN_PROPERTY, LogService.LOG_WARNING);
			return false;
		}
		
		// if access token is set, these two should be set, too.
		String refreshToken  = source.getPropertyValueElseDefault(MendeleyProperties.REFRESH_TOKEN_PROPERTY, MendeleyProperties.REFRESH_TOKEN_DEFAULT);
		String accessTokenExpiration = source.getPropertyValueElseDefault(MendeleyProperties.ACCESS_TOKEN_EXPIRATION_PROPERTY, MendeleyProperties.ACCESS_TOKEN_EXPIRATION_DEFAULT);
	
		// create api with access token
		mendeleyApi = new MendeleyAPIWrapper(accessToken);
		
		// create the complete mendeley token
		mendeleyToken = new MendeleyOAuth20AccessToken(accessToken, refreshToken);
		mendeleyToken.expireAt(new Long(accessTokenExpiration));
		
		// refresh token if neeeded
		refreshTokenIfNeeded();
		
		// create transformation
		transformation = new MendeleyTransformation(this, mendeleyApi);
		
		// try to access profile of authentication user
		MendeleyProfile profile = mendeleyApi.getUserProfile();
		
		if(profile == null) {
			log("Could not establish connection to mendeley.", LogService.LOG_INFO);
			return false;
		}
		
		//System.out.println(profile.getMain().getName());
		
		return true;
	}

	/**
	 * Refreshes the access token if it expires soon
	 */
	private void refreshTokenIfNeeded() {
		if(mendeleyToken.expiresSoon()) {
			// refresh if token expires soon
			writeUpdatedToken(mendeleyApi.getRefreshedAccessToken(mendeleyToken.getRefreshToken(), clientID, clientSecret));
		}
	}

	/**
	 * Writes the mendeley token to the source configuration
	 * @param newToken New mendeley oauth 2 token
	 */
	private void writeUpdatedToken(MendeleyOAuth20AccessToken newToken) {
		tokenUpdate = true;
		
		if(newToken != null) {
			// store access token
			source.addProperty(MendeleyProperties.ACCESS_TOKEN_PROPERTY, newToken.getAccessToken());
			// store access token expiration date 
			source.addProperty(MendeleyProperties.ACCESS_TOKEN_EXPIRATION_PROPERTY, "" + newToken.getExpiration().getTime());
			// store refresh token
			source.addProperty(MendeleyProperties.REFRESH_TOKEN_PROPERTY, newToken.getRefreshToken());
		}
		
		tokenUpdate  = false;
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
			if(property.getKey().equals(MendeleyProperties.ACCESS_TOKEN_PROPERTY) && tokenUpdate)
			{
				// internal token update is handled
				return true;
			}
			
			if(property.getKey().equals(MendeleyProperties.ACCESS_TOKEN_EXPIRATION_PROPERTY) && tokenUpdate)
			{
				// internal token update is handled
				return true;
			}
			
			if(property.getKey().equals(MendeleyProperties.REFRESH_TOKEN_PROPERTY) && tokenUpdate)
			{
				// internal token update is handled
				return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#fillDataSet(org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public void fillDataSet(DataSet dataSet) {
		
		super.fillDataSet(dataSet);
		
		if(mendeleyApi == null) {
			return;
		}
		
		Person accountOwner = null;
		
		// create own profile
		if(source.isPropertyTrueElseDefault(MendeleyProperties.CREATE_ACCOUNT_OWNER_PROPERTY, MendeleyProperties.CREATE_ACCOUNT_OWNER_DEFAULT))
		{
			accountOwner = createOwnProfile();
		
			if(accountOwner == null)
			{
				log("Error while creating account owner.", LogService.LOG_WARNING);
			}
		}
		
		// add account owners publications
		if(source.isPropertyTrueElseDefault(MendeleyProperties.ADD_AUTHORED_PUBLICATIONS_PROPERTY, MendeleyProperties.ADD_AUTHORED_PUBLICATIONS_DEFAULT))
		{
			createAuthoredPublications();
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
		
		List<MendeleyDocumentDetails> authoredDocuments = mendeleyApi.getAuthoredPublications();
		
		if(authoredDocuments == null || authoredDocuments.isEmpty())
		{
			log("No authored publications", LogService.LOG_DEBUG);
			return;
		}
		
		// get details for all documents
		for(MendeleyDocumentDetails document : authoredDocuments)
		{
			try {
				// create mashup content from document
				transformation.createDocument(document);
			}
			catch(Exception e) {
				log("Problem while creating content for document " + document.getTitle(), LogService.LOG_WARNING);
				continue;
			}
			
			
		}
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#updateDataSet()
	 */
	@Override
	protected void updateDataSet() {
		super.updateDataSet();
		
		if(mendeleyApi == null) {
			return;
		}
		
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
		
		// add account owners publications
		if(source.isPropertyTrueElseDefault(MendeleyProperties.ADD_AUTHORED_PUBLICATIONS_PROPERTY, MendeleyProperties.ADD_AUTHORED_PUBLICATIONS_DEFAULT))
		{
			createAuthoredPublications();
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
		
		MendeleyProfile userProfile = null;
		
		try {
			userProfile = mendeleyApi.getUserProfile();
		}
		catch (Exception e) {
			log("Error while getting profile information from mendeley (" + e.getMessage() + ")", LogService.LOG_DEBUG);
			return null;
		}
		
		return transformation.createPerson(userProfile);
	}

	/**
	 * Creates organisations for private mendeley groups of the user provided the mendeley access token.
	 */
	private void createPrivateGroups() {
		List<MendeleyUsersGroup> groups = mendeleyApi.getUsersGroups();
		
		if(groups == null)
		{
			// nothing to do
			return;
		}
		
		for(MendeleyUsersGroup group : groups)
		{
			String groupName = group.getName();
			if(!isPrivateGroupAllowed(groupName))
			{
				log("Skipping private group " + groupName, LogService.LOG_DEBUG);
				continue;
			}
			transformation.createGroup(group);
		}
	}
	
	/**
	 * Loads the configured public groups with all details and documents
	 */
	private void createPublicGroups() {
		
		List<MendeleyPublicGroupDetails> groups = new LinkedList<MendeleyPublicGroupDetails>();
		
		String publicGroupIds = source.getPropertyValue(MendeleyProperties.PUBLIC_GROUP_IDS_PROPERTY);
		
		if(publicGroupIds == null || publicGroupIds.isEmpty())
		{
			log("No ids for public groups specified. Use property " + MendeleyProperties.PUBLIC_GROUP_IDS_PROPERTY + " to specify a list of group ids", LogService.LOG_WARNING);
			return;
		}
		
		String[] groupIds = publicGroupIds.split(",");
		
		// get group for every group id
		for(String groupId : groupIds) {
			groupId = groupId.trim();
			try{
				log("Getting details for public group with id: " + groupId, LogService.LOG_DEBUG);
				MendeleyPublicGroupDetails group = mendeleyApi.getPublicGroupDetails(groupId);
				groups.add(group);
			}
			catch (Exception e)
			{
				log("Could not get details for public group with id: " + groupId + " (" + e.getMessage() + ")", LogService.LOG_WARNING);
			}
		}
		
		// create CommunityMashup representation for every group
		for(MendeleyPublicGroupDetails group : groups) {
			transformation.createPublicGroup(group);
		}
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
}
