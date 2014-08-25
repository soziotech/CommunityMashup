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
package org.sociotech.communitymashup.source.twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Property;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.data.Location;
import org.sociotech.communitymashup.data.MetaTag;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.WebAccount;
import org.sociotech.communitymashup.data.WebSite;
import org.sociotech.communitymashup.data.impl.DataFactoryImpl;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.twitter.meta.TwitterTags;
import org.sociotech.communitymashup.source.twitter.properties.TwitterProperties;

import twitter4j.DirectMessage;
import twitter4j.GeoLocation;
import twitter4j.HashtagEntity;
import twitter4j.IDs;
import twitter4j.MediaEntity;
import twitter4j.Paging;
import twitter4j.Place;
import twitter4j.Query;
import twitter4j.Query.Unit;
import twitter4j.QueryResult;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserMentionEntity;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

/**
 * @author Peter Lachenmaier, Jennifer Salbego
 * 
 *         Main Class of the Twitter Source Service.
 */
public class TwitterSourceService extends SourceServiceFacadeImpl {

	public static DataFactory factory = new DataFactoryImpl();

	private Twitter twitterAPI = null;
	private User accountOwnerUser = null;
	
	/**
	 * If set to a date, all tweets older than the date will be skipped
	 */
	private Date skipOlderThan = null;

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#initialize(org.sociotech.communitymashup.application.Source)
	 */
	@Override
	public boolean initialize(Source configuration) {

		boolean initialized = super.initialize(configuration);

		if (initialized) {

			// establish connection
			initialized = establishConnection();

			if (!initialized) {
				// try to start the command line authentication if no
				// initialization is possible
				startCommandLineAuthentication();
			}

			// load the skip date if set
			updateOlderThanDate();
			
			// set initialization state
			setInitialized(initialized);
		}

		return isInitialized();
	}

	/**
	 * Establishes a connection with twitter based on the user information given
	 * in the configuration.
	 * 
	 * @return True if it is possible to use the user information for the
	 *         connection, false otherwise.
	 */
	private boolean establishConnection() {

		// get property values from configuration
		String consumerKey = source
				.getPropertyValue(TwitterProperties.CONSUMER_KEY_PROPERTY);
		String consumerSecret = source
				.getPropertyValue(TwitterProperties.CONSUMER_SECRET_PROPERTY);
		String accessTokenValue = source
				.getPropertyValue(TwitterProperties.ACCESS_TOKEN_PROPERTY);
		String accessTokenSecret = source
				.getPropertyValue(TwitterProperties.ACCESS_TOKEN_SECRET_PROPERTY);

		// check properties
		if (consumerKey == null || consumerKey.isEmpty()) {
			log("A valid consumer key is needed in the configuration specified by "
					+ TwitterProperties.CONSUMER_KEY_PROPERTY,
					LogService.LOG_WARNING);
			return false;
		} else if (consumerSecret == null || consumerSecret.isEmpty()) {
			log("A valid consumer secret is needed in the configuration specified by "
					+ TwitterProperties.CONSUMER_SECRET_PROPERTY,
					LogService.LOG_WARNING);
			return false;
		} else if (accessTokenValue == null || accessTokenValue.isEmpty()) {
			log("A valid access token is needed in the configuration specified by "
					+ TwitterProperties.ACCESS_TOKEN_PROPERTY,
					LogService.LOG_WARNING);
			return false;
		} else if (accessTokenSecret == null || accessTokenSecret.isEmpty()) {
			log("A valid token secret is needed in the configuration specified by "
					+ TwitterProperties.ACCESS_TOKEN_SECRET_PROPERTY,
					LogService.LOG_WARNING);
			return false;
		}

		// get access with the provided credencials
		// TODO disable debug
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true).setOAuthConsumerKey(consumerKey)
				.setOAuthConsumerSecret(consumerSecret)
				.setOAuthAccessToken(accessTokenValue)
				.setOAuthAccessTokenSecret(accessTokenSecret);

		TwitterFactory tf = new TwitterFactory(cb.build());

		twitterAPI = tf.getInstance();

		if (twitterAPI == null) {
			log("Could not create a connection to the twitter api!",
					LogService.LOG_ERROR);
		}

		return true;
	}

	/**
	 * Starts a command line authentication with yammer to get the needed access
	 * token.
	 */
	private void startCommandLineAuthentication() {

		if (!source
				.isPropertyTrue(TwitterProperties.ALLOW_COMMAND_LINE_AUTHENTICATION)) {
			return;
		}

		// get property values from configuration
		String consumerKey = source
				.getPropertyValue(TwitterProperties.CONSUMER_KEY_PROPERTY);
		String consumerSecret = source
				.getPropertyValue(TwitterProperties.CONSUMER_SECRET_PROPERTY);

		// check properties
		if (consumerKey == null || consumerKey.isEmpty()) {
			log("A valid consumer key is needed in the configuration specified by "
					+ TwitterProperties.CONSUMER_KEY_PROPERTY,
					LogService.LOG_WARNING);
			return;
		} else if (consumerSecret == null || consumerSecret.isEmpty()) {
			log("A valid consumer secret is needed in the configuration specified by "
					+ TwitterProperties.CONSUMER_SECRET_PROPERTY,
					LogService.LOG_WARNING);
			return;
		}

		log("Starting command line authentication.", LogService.LOG_INFO);

		// Access Token not contained in properties
		Twitter twitter = new TwitterFactory().getInstance();

		twitter.setOAuthConsumer(consumerKey, consumerSecret);
		RequestToken requestToken;

		// create new request token
		try {
			requestToken = twitter.getOAuthRequestToken();
		} catch (TwitterException e) {
			log("Unable to get request token from Twitter. Please check your Consumer Key and Secret.",
					LogService.LOG_ERROR);
			return;
		}

		System.out.println("Request token: " + requestToken.getToken());
		System.out.println("Token secret: " + requestToken.getTokenSecret());

		String authorizationURL = requestToken.getAuthorizationURL();

		// wait for user confirming the request
		System.out.println("Now visit:\n" + authorizationURL
				+ "\n... and grant this app authorization");
		System.out
				.println("Enter the PIN code and hit ENTER when you're done:");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pin;
		try {
			pin = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		AccessToken accessToken = null;
		try {
			accessToken = twitter.getOAuthAccessToken(requestToken, pin);
		} catch (Exception e) {
			accessToken = null;
		}

		if (accessToken == null) {
			log("Got no Twitter OAuth Access Token for given Request and Pin!",
					LogService.LOG_ERROR);
			return;
		}

		System.out.println("Access token: " + accessToken.getToken());
		System.out.println("Token secret: " + accessToken.getTokenSecret());
	}

	@Override
	protected void stop() {
		super.stop();
		
		// reset since id
		source.addProperty(TwitterProperties.SEARCH_SINCE_ID_PROPERTY, "");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#fillDataSet
	 * (org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public void fillDataSet(DataSet dataSet) {
		super.fillDataSet(dataSet);

		// check data set
		if (source.getDataSet() == null) {
			// nothing to do
			return;
		}

		if(source.isPropertyTrueElseDefault(TwitterProperties.LOAD_ACCOUNTOWNER_PROFILE_PROPERTY, TwitterProperties.LOAD_ACCOUNTOWNER_PROFILE_DEFAULT))
		{
			log("Loading personal profile from Twitter.", LogService.LOG_INFO);
			// adding the user that provided this account
			addMe();
		}
		
		if (loadFollowers()) {
			log("Loading followers from Twitter.", LogService.LOG_INFO);
			// add Followers
			addFollower();
		}

		if (loadFollowing()) {
			log("Loading following from Twitter.", LogService.LOG_INFO);
			// add Following
			addFollowing();
		}

		if (loadHomeTimeline()) {
			log("Loading home timeline from Twitter.", LogService.LOG_INFO);
			// add HomeTimeline
			addHomeTimeline();
		}

		if (loadUserTimeline()) {
			log("Loading user timeline from Twitter.", LogService.LOG_INFO);
			// add User Timeline
			addUserTimeline();
		}

		if (loadDirectMessages() || loadSentDirectMessages()) {
			log("Loading direct messages from Twitter.", LogService.LOG_INFO);
			// add DirectMessages
			addDirectMessages();
		}

		if (interconnectFollowers() || interconnectFollowing()) {
			log("Interconnecting people", LogService.LOG_INFO);
			// interconnect people
			interconnectPersons();
		}

		if (shouldSearch()) {
			log("Searching Twitter.", LogService.LOG_INFO);
			// reseting since date when filling
			source.addProperty(TwitterProperties.SEARCH_SINCE_ID_PROPERTY, "");
			// search
			search();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#
	 * enrichDataSet()
	 */
	@Override
	public void enrichDataSet() {
		super.enrichDataSet();
		
		if(shouldEnrichPersons()) {
			enrichPersonsWithTwitterAccounts();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#
	 * updateDataSet()
	 */
	@Override
	public void updateDataSet() {
		super.updateDataSet();
		
		// update skip date
		updateOlderThanDate();
		
		// updating search results
		if (shouldSearch()) {
			log("Update: Searching Twitter.", LogService.LOG_INFO);
			// search
			search();
		}
		
		if (loadUserTimeline()) {
			log("Loading user timeline from Twitter.", LogService.LOG_INFO);
			// add User Timeline
			addUserTimeline();
		}
		
		// do enrichment of persons in update due to call limits of api, instead of immediately after person changes
		if(shouldEnrichPersons()) {
			enrichPersonsWithTwitterAccounts();
		}
		
		// TODO do other updates, only tested updates are currently supported
	}

	/**
	 * Looks for users with a twitter web account in the data set, gets their
	 * followers and following and creates connections
	 * 
	 */
	private void interconnectPersons() {

		MetaTag twitterTag = source.getDataSet()
				.getMetaTag(TwitterTags.TWITTER);
		if (twitterTag == null) {
			// no tag defined, so no accounts
			return;
		}

		EList<WebAccount> twitterAccounts = twitterTag.getWebAccounts();
		if (twitterAccounts == null || twitterAccounts.isEmpty()) {
			// no accounts defined
			return;
		}

		for (WebAccount twitterAccount : twitterAccounts) {
			// assume screen name in twitter account
			String screenName = twitterAccount.getUsername();

			if (screenName == null || screenName.equals("")) {
				// skip this one
				continue;
			}

			// get twitter user with this screenname
			User twitterUser = null;
			try {
				twitterUser = twitterAPI.showUser(screenName);
			} catch (TwitterException e) {
				log("Could not get User with screename: " + screenName + " ("
						+ e.getMessage() + ")", LogService.LOG_DEBUG);
				continue;
			}

			if (twitterUser == null) {
				log("Got no User with screename: " + screenName,
						LogService.LOG_DEBUG);
				continue;
			}

			// add connection to extisting followers and following without
			// creating new users
			if (interconnectFollowers()) {
				addFollower(twitterUser, false);
			}
			if (interconnectFollowing()) {
				addFollowing(twitterUser, false);
			}
		}

	}

	private void addFollowing() {
		addFollowing(accountOwnerUser, true);
	}

	private void addFollowing(User twitterUser, boolean createNewUsers) {

		if (twitterUser == null) {
			return;
		}

		IDs following;
		long cursor = -1;

		// look up person for twitter user and connect
		Person connectToPerson = getPersonForTwitterUser(twitterUser);

		do {
			try {
				following = twitterAPI.getFriendsIDs(twitterUser.getId(),
						cursor);
				log("Retrieving following with cursor: " + cursor,
						LogService.LOG_INFO);
			} catch (TwitterException e) {
				log("Could not get more following Users from twitter. (Cursor: "
						+ cursor + "): " + e.getMessage(), LogService.LOG_DEBUG);
				break;
			}

			if (following == null) {
				return;
			}

			if (connectToPerson != null) {
				connectPersonsForTwitterUserIds(following.getIDs(),
						connectToPerson, true, createNewUsers);
			}

			// next cursor
			cursor = following.getNextCursor();
		} while (following.hasNext());
	}

	private void addFollower() {
		addFollower(accountOwnerUser, true);
	}

	private void addFollower(User twitterUser, boolean createNewUsers) {

		if (twitterUser == null) {
			return;
		}

		int followersMax = 1000;

		int followersCount = twitterUser.getFollowersCount();
		if (followersCount > followersMax) {
			// ignore users with to much followers
			log("Ignoring the " + followersCount + " Followers of "
					+ twitterUser.getName());
			return;
		}

		IDs followers;
		long cursor = -1;

		do {
			try {
				followers = twitterAPI.getFollowersIDs(twitterUser.getId(),
						cursor);
				log("Retrieving followers with cursor: " + cursor,
						LogService.LOG_INFO);
			} catch (TwitterException e) {
				log("Could not get more followers from twitter. (Cursor: "
						+ cursor + "): " + e.getMessage(), LogService.LOG_DEBUG);
				break;
			}

			if (followers == null) {
				return;
			}

			// look up person for twitter user and connect
			Person connectToPerson = getPersonForTwitterUser(twitterUser);
			if (connectToPerson != null) {
				connectPersonsForTwitterUserIds(followers.getIDs(),
						connectToPerson, false, createNewUsers);
			}
			// next cursor
			cursor = followers.getNextCursor();
		} while (followers.hasNext());
	}

	/**
	 * Lookup all Twitter users for all persons with twitter web account
	 */
	private void enrichPersonsWithTwitterAccounts() {
		
		EList<WebAccount> allWebAccounts = source.getDataSet().getWebAccounts();
		
		if(allWebAccounts == null || allWebAccounts.isEmpty()) {
			// nothing to do
			return;
		}
		
		Map<String, WebAccount> twitterAccounts = new HashMap<String, WebAccount>();
		
		// find twitter accounts
		for(WebAccount account : allWebAccounts) {
			if(!account.hasMetaTag(TwitterTags.TWITTER)
			   || account.getUsername() == null || account.getUsername().isEmpty()
			   || account.getInformationObjects() == null) {
				// must be an (attached) twitter account
				continue;
			}
			if(!(account.getInformationObjects().size() == 1) || !(account.getInformationObjects().get(0) instanceof Person)) {
				continue;
			}
			
			// add to map with twitter name as key
			twitterAccounts.put(account.getUsername(), account);
		}
		
		if(twitterAccounts.isEmpty()) {
			// nothing to do
			return;
		}
		
		// transform key set to string array
		String[] accountNames = twitterAccounts.keySet().toArray(new String[0]);
		
		int bufferLength = 99;
		int from = 0;
		int to = bufferLength;

		

		// finish if no id in array
		boolean finished = accountNames.length <= 0;

		while (!finished) {
			if (to >= accountNames.length) {
				to = accountNames.length;
				finished = true;
			}

			String[] buffer = Arrays.copyOfRange(accountNames, from, to);

			ResponseList<User> users = null;
			try {
				users = twitterAPI.lookupUsers(buffer);
				log("Lookup users at Twitter.", LogService.LOG_DEBUG);
			} catch (TwitterException e) {
				log("Could not lookup users at Twitter. (" + e.getMessage() + ")", LogService.LOG_ERROR);
				return;
			}

			// add all users

			for (User twitterUser : users) {
				Person person = createPersonFromTwitterUser(twitterUser);
				
				if(person == null) {
					// something went wrong, so skip
					continue;
				}
				
				WebAccount origAccount = twitterAccounts.get(twitterUser.getScreenName());
				
				if(origAccount == null) {
					// something went wrong, so skip
					continue; 
				}
				
				// direct access, check was done above
				Person origPerson = (Person) origAccount.getInformationObjects().get(0);
				
				// identify original account as twitter account for merge
				origAccount.identifyBy(getLocalIdentifierKey(), "acc_" + twitterUser.getScreenName());
				
				if(origPerson != person) {
					// not merged before (based on name or something), so merge now based on twitter account
					origPerson.update(person);
				}
			}

			// increase indeces
			from += bufferLength;
			to += bufferLength;

			if (from > accountNames.length) {
				finished = true;
			}
		}
	}
	
	/**
	 * Lookup all Twitter users for the given array of ids and can create
	 * persons of them. Connects the persons in the direction of to the given
	 * person (followers) if set to true. Otherwise from the given person to new
	 * person (following).
	 * 
	 * @param ids
	 *            Array of user ids
	 * @param connectToPerson
	 *            The person to connect to
	 * @param toPerson
	 *            direction of connection
	 * @param createNewUsers
	 *            If false, only existing users will be linked, otherwise new
	 *            ones will be created
	 */
	private void connectPersonsForTwitterUserIds(long[] ids,
			Person connectToPerson, boolean toPerson, boolean createNewUsers) {
		if (connectToPerson == null) {
			return;
		}

		int bufferLength = 99;

		int from = 0;
		int to = bufferLength;

		// finish if no id in array
		boolean finished = ids.length <= 0;

		while (!finished) {
			if (to >= ids.length) {
				to = ids.length;
				finished = true;
			}

			long[] buffer = Arrays.copyOfRange(ids, from, to);

			ResponseList<User> users = null;
			try {
				users = twitterAPI.lookupUsers(buffer);
				log("Lookup users at Twitter.", LogService.LOG_DEBUG);
			} catch (TwitterException e) {
				log("Could not lookup users at Twitter.", LogService.LOG_ERROR);
				return;
			}

			// add all users

			for (User twitterUser : users) {
				Person person = null;

				if (createNewUsers) {
					person = createPersonFromTwitterUser(twitterUser);
				} else {
					person = getPersonForTwitterUser(twitterUser);
				}

				if (connectToPerson != null && person != null) {

					if (!toPerson) {
						EList<Person> persons = person.getPersons();
						if (!persons.contains(connectToPerson)) {
							log("Connecting from " + person.getName() + " to "
									+ connectToPerson.getName(),
									LogService.LOG_DEBUG);
							persons.add(connectToPerson);
						}
					} else {
						EList<Person> persons = connectToPerson.getPersons();
						if (!persons.contains(person)) {
							log("Connecting from " + connectToPerson.getName()
									+ " to " + person.getName(),
									LogService.LOG_DEBUG);
							persons.add(person);
						}
					}

					// TODO: create tagged connection
				}
			}

			// increase indeces
			from += bufferLength;
			to += bufferLength;

			if (from > ids.length) {
				finished = true;
			}
		}
	}

	/**
	 * Creates the user of the mashup and adds him to the dataset
	 */
	private void addMe() {

		// get Twitter user
		User user = null;
		try {
			user = twitterAPI.verifyCredentials();
		} catch (Exception e) {
			log("Could not get user from twiter (" + e.getMessage() + ")",
					LogService.LOG_ERROR);
			return;
		}

		Person me = createPersonFromTwitterUser(user);
		me.metaTag(TwitterTags.PROVIDED_PROFILE);

		accountOwnerUser = user;

		// add status
		Status twitterStatus = user.getStatus();

		createContentFromTweet(me, twitterStatus);
	}

	/**
	 * Looks up the person for this twitter user in the given dataSet and
	 * returns it. If it does not already exist, the person will be created and
	 * returned.
	 * 
	 * @param user
	 * @return
	 */
	private Person createPersonFromTwitterUser(User user) {

		if (user == null) {
			return null;
		}

		Person person = getPersonForTwitterUser(user);

		String personIdent = createPersonIdentForTwitterUser(user);

		if (person == null) {
			// not previously created
			person = factory.createPerson();

			// set name
			person.setName(user.getName());

			// and add the person to the data set
			person = (Person) this.add(person, personIdent);
		}

		if (person == null) {
			// person could not be created
			return null;
		}

		// tag person
		person.metaTag(TwitterTags.TWITTER);

		// add web account
		String screenName = user.getScreenName();

		if (screenName != null && !screenName.equals("")) {
			// TODO check for existing web account
			WebAccount webAccount = factory.createWebAccount();
			webAccount.setUsername(screenName);
			webAccount.setService(WebAccount.SERVICE_TWITTER);
			webAccount.setCreated(user.getCreatedAt());

			webAccount = (WebAccount) this.add(webAccount, "acc_" + screenName);

			if (webAccount != null) {
				webAccount.metaTag(TwitterTags.TWITTER);
				person.extend(webAccount);
			}
		}

		// add location
		String twitterLocation = user.getLocation();

		if (twitterLocation != null && !twitterLocation.equals("")) {
			Location location = factory.createLocation();
			location.setStringValue(twitterLocation);

			location = (Location) this.add(location, "uloc_" + user.getId());

			if (location != null) {
				location.metaTag(TwitterTags.TWITTER);
				person.extend(location);
			}
		}

		// add website
		String twitterWebsite = user.getURL();

		if (twitterWebsite != null) {
			WebSite website = factory.createWebSite();
			website.setAdress(twitterWebsite.toString());

			website = (WebSite) this.add(website);

			if (website != null) {
				website.metaTag(TwitterTags.TWITTER);
				person.extend(website);
			}
		}

		// add profile image
		String profileImageUrl = user.getBiggerProfileImageURL();
	
		// add original res version if available
		if (screenName != null && source.isPropertyTrueElseDefault(TwitterProperties.LOAD_HIGHER_RES_PROFILE_IMAGE_PROPERTY, TwitterProperties.LOAD_HIGHER_RES_PROFILE_IMAGE_DEFAULT)) {
			if(user.getOriginalProfileImageURL() != null)
			{
				profileImageUrl = user.getOriginalProfileImageURL();
			}
		}

		if (profileImageUrl != null) {
			// create image
			Image profileImage = person.attachImage(profileImageUrl);
			profileImage.tag(TwitterTags.TWITTER);
			profileImage.tag(TwitterTags.PROFILE_IMAGE);
		}

		// add latest status of user
		Status status = user.getStatus();
		if (status != null
				&& source
						.isPropertyTrue(TwitterProperties.ADD_STATUS_OF_PEOPLE_PROPERTY)) {
			createContentFromTweet(person, status);
		}

		return person;
	}

	/**
	 * Looks up the person for this twitter user in the given dataSet and
	 * returns it.
	 * 
	 * @param user
	 *            Twitter User to look up coresponding Person.
	 * @return The looked up person, null if it does not exist.
	 */
	private Person getPersonForTwitterUser(User user) {
		String personIdent = createPersonIdentForTwitterUser(user);
		return this.getPersonWithSourceIdent(personIdent);
	}

	private String createPersonIdentForTwitterUser(User user) {
		return "" + user.getId();
	}

	/**
	 * Looks if the person for the twitter user already exists or otherwise loads it using the api.
	 * 
	 * @param id Twitter user id
	 * @return The Person for the twitter user or null in error case.
	 */
	private Person getPersonForTwitterUserId(long id) {
		Person person = getExistingPersonForTwitterUserId(id);

		if (person == null) {
			ResponseList<User> twitterUsers = null;

			// put id in an array to lookuup
			long[] userIdArray = new long[] { id };
			try {
				log("Looking up twitter user for id " + id,
						LogService.LOG_DEBUG);
				twitterUsers = twitterAPI.lookupUsers(userIdArray);
			} catch (TwitterException e) {
				log("Could not lookup single user " + id + " ("
						+ e.getMessage() + ")", LogService.LOG_WARNING);
				return null;
			}

			if (twitterUsers != null && !twitterUsers.isEmpty()) {
				// only one entry
				person = createPersonFromTwitterUser(twitterUsers.get(0));
			}
		}
		return person;
	}

	/**
	 * If the person for the twitter user already exists than it will be returned.
	 * 
	 * @param id Twitter user id
	 * @return The person for the twitter user or null if it does not yet exist
	 */
	private Person getExistingPersonForTwitterUserId(long id) {
		return this.getPersonWithSourceIdent(id + "");
	}

	private String createTitleFromTwitterText(String text) {
		if (text == null) {
			return null;
		}

		int titleLength = 4; // number of words

		String[] words = text.split(" ");
		if (words.length < titleLength) {
			return text;
		}

		String title = "";
		for (int i = 0; i < titleLength; i++) {
			title += words[i] + " ";
		}

		title += "...";

		return title;
	}

	/**
	 * Creates a content for the given message, adds it to the data set and sets
	 * the author.
	 * 
	 * @param author
	 *            Person corresponding to the twitter user which authored the
	 *            message
	 * @param author
	 *            Person corresponding to the twitter user which received the
	 *            message
	 * @param directMessage
	 *            The twitter status
	 * @return The Content created from the status, null in error case.
	 */
	private Content createContentFromTwitterDirectMessage(Person author,
			Person receipient, DirectMessage directMessage) {
		if (directMessage == null) {
			return null;
		}

		String messageText = directMessage.getText();
		if (messageText == null || messageText.isEmpty()) {
			return null;
		}

		String ident = directMessage.getId() + "";

		if (this.getContentWithSourceIdent(ident) != null) {
			// message already created
			return null;
		}

		Content message = factory.createContent();
		message.setStringValue(messageText);
		message.setName(createTitleFromTwitterText(messageText));
		message.metaTag(TwitterTags.TWITTER);

		message = (Content) this.add(message, ident);

		if (message == null) {
			return null;
		}

		if (author != null) {
			message.setAuthor(author);
		}

		message.setCreated(directMessage.getCreatedAt());

		if (receipient != null) {
			// set receiver as contributor
			message.getContributors().add(receipient);
		}

		message.metaTag(TwitterTags.DIRECT_MESSAGE);
				
		return message;
	}

	private void tagIOwithHashtags(InformationObject informationObject,
			HashtagEntity[] hashTags) {
		if (hashTags == null) {
			return;
		}

		for (HashtagEntity tag : hashTags) {
			informationObject.tag(tag.getText());
		}
	}

	/**
	 * Searches for the query defined in the configuration and adds the results.
	 */
	private void search()
	{
		// get query from configuration
		String query = source.getPropertyValue(TwitterProperties.SEARCH_PROPERTY);
		
		if(query == null || query.isEmpty())
		{
			return;
		}
		
		QueryResult searchResult = null;
		
		try {
			Query twitterQuery = new Query(query);
			// set requested number of tweets
			twitterQuery.setCount(getNumberOfSearchTweets());
			
			// add possible geo location parameter
			addSearchGeoLocation(twitterQuery);
			
			// if defined set since id
			String sinceId = source.getPropertyValue(TwitterProperties.SEARCH_SINCE_ID_PROPERTY);
			if(sinceId != null && !sinceId.isEmpty())
			{
				long sinceIdVal = new Long(sinceId);
				twitterQuery.setSinceId(sinceIdVal);
			}
         	searchResult = twitterAPI.search(twitterQuery);
		} catch (TwitterException e) {
			log("Could not search for " + query + "(" + e.getMessage() + ")", LogService.LOG_WARNING);
			return;
		}
		
		if(searchResult == null)
		{
			return;
		}
		
		String sinceId = parseSinceId(searchResult);
		
		if(sinceId != null)
		{
			// set it in configuration
			source.addProperty(TwitterProperties.SEARCH_SINCE_ID_PROPERTY, sinceId);
		}
		
		List<Status> tweets = searchResult.getTweets();
		
		log("Got " + tweets.size() + " tweets for search " + query, LogService.LOG_DEBUG);
		
		// add all tweets
		addTweetList(tweets);
	}

	/**
	 * Adds geolocation parameters to the given twitter query if they are defined in the
	 * configuration.
	 * 
	 * @param twitterQuery Twitter query
	 */
	private void addSearchGeoLocation(Query twitterQuery) {
		String lat = source.getPropertyValue(TwitterProperties.SEARCH_GEO_LATITUDE_PROPERTY);
		String lon = source.getPropertyValue(TwitterProperties.SEARCH_GEO_LONGITUDE_PROPERTY);
		
		if(lat == null || lon == null)
		{
			// no geo location set
			return;
		}
		
		String radius = source.getPropertyValueElseDefault(TwitterProperties.SEARCH_GEO_RADIUS_PROPERTY, TwitterProperties.SEARCH_GEO_RADIUS_DEFAULT);
		String unit = source.getPropertyValueElseDefault(TwitterProperties.SEARCH_GEO_RADIUS_UNIT_PROPERTY, TwitterProperties.SEARCH_GEO_RADIUS_UNIT_DEFAULT);
		
		double latVal = 0.0;
		double lonVal = 0.0;
		double radiusVal = 0.0;
		
		// try to parse the set properties
		try {
			latVal = new Double(lat);
			lonVal = new Double(lon);
			radiusVal = new Double(radius);
		} catch (Exception e) {
			log("Could not parse configured search geo coordinates. (" + e.getMessage() + ")", LogService.LOG_WARNING);
		}
		
		// add geo location to twitter query
		twitterQuery.setGeoCode(new GeoLocation(latVal, lonVal), radiusVal, Unit.valueOf(unit));
	}

	private String parseSinceId(QueryResult searchResult) {
		if (searchResult == null) {
			return null;
		}

		return "" + searchResult.getMaxId();
	}

	/**
	 * create the hometimeline
	 */
	private void addHomeTimeline() {

		List<Status> homeTimeline = null;

		// List of statuses (homeTimeline)
		try {
			homeTimeline = twitterAPI.getHomeTimeline();
		} catch (TwitterException te) {
			log("Could not get Home Timeline from Twitter. (" + te.getMessage()
					+ ")", LogService.LOG_ERROR);
			return;
		}

		addTweetList(homeTimeline);
	}

	/**
	 * Adds the User Timeline
	 */
	private void addUserTimeline() {

		List<Status> userTimeline = null;

		// List of statuses
		try {
			Paging userTimelineParam = new Paging();
			userTimelineParam.setCount(getNumberOfUserTimelineTweets());
			userTimeline = twitterAPI.getUserTimeline(userTimelineParam);
		} catch (TwitterException te) {
			log("Could not get User Timeline from Twitter. (" + te.getMessage()
					+ ")", LogService.LOG_ERROR);
			return;
		}

		addTweetList(userTimeline);
	}

	private void addTweetList(List<Status> tweetList) {
		// add all tweets and creates new persons, if they do not exist already
		
//		// users to lookup
//		Set<Long> lookupUserIds = new HashSet<Long>();
//		
//		// extract all needed users from tweet list
//		for (Tweet tweet : tweetList) {
//			// User who wrote the tweet
//			long userId = tweet.getFromUserId();
//			
//			// look if user already exists
//			if(getExistingPersonForTwitterUserId(userId) == null)
//			{
//				// does not exist, so add it to the lookup set
//				lookupUserIds.add(userId);
//			}
//		}
//		
//		// lookup the needed users
//		if(!lookupUserIds.isEmpty())
//		{
//			int numberOfUsers = lookupUserIds.size();
//			long[] userIdArray = new long[numberOfUsers];
//			int i = 0;
//			// create array of longs
//			for(Long userId : lookupUserIds)
//			{
//				userIdArray[i] = userId;
//				i++;
//			}
//			
//			ResponseList<User> twitterUsers = null;
//
//			// lookup
//			try {
//				 twitterUsers = twitterAPI.lookupUsers(userIdArray);
//			} catch (TwitterException e) {
//				log("Could not lookup users due to exception. (" + e.getMessage() + ")", LogService.LOG_ERROR);
//			}
//			
//			if(twitterUsers != null)
//			{
//				// add them all
//				for(User twitterUser : twitterUsers)
//				{
//					createPersonFromTwitterUser(twitterUser);
//				}
//			}
//		}
		
//		// now add all tweets, users should already be there
//		for (Tweet tweet : tweetList) {
//
//			long userId = tweet.getFromUserId();
//			Person author = getPersonForTwitterUserId(userId);
//
//			// create content
//			createContentFromTweet(author, tweet);
//		}
		
		// now add all tweets, users should already be there
		for (Status tweet : tweetList) {

			User user = tweet.getUser();
			
			Person author = createPersonFromTwitterUser(user);

			// create content
			createContentFromTweet(author, tweet);
		}
	}

	/**
	 * Creates a content for the given tweet, adds it to the data set and sets
	 * the author.
	 * 
	 * @param author
	 *            Person corresponding to the twitter user which authored the
	 *            tweet
	 * @param tweet
	 *            The tweet
	 * @return The Content created from the tweet, null in error case.
	 */
	private Content createContentFromTweet(Person author, Status tweet) {
		if (tweet == null) {
			return null;
		}

		String tweetText = tweet.getText();
		if (tweetText == null || tweetText.isEmpty()) {
			return null;
		}
		String ident = tweet.getId() + "";

		if(skipOlderThan != null && skipOlderThan.after(tweet.getCreatedAt())) {
			// skip the tweet
			return null;
		}
		
		if (this.getContentWithSourceIdent(ident) != null) {
			// status already created
			return null;
		}

		if(loadPhotoTweetsOnly() && !hasPhotos(tweet)) {
			// do not load without photos
			return null;
		}
		
		Content tweetContent = factory.createContent();
		tweetContent.setStringValue(tweetText);
		tweetContent.setName(createTitleFromTwitterText(tweetText));

		tweetContent = (Content) this.add(tweetContent, ident);

		if (tweetContent == null) {
			return null;
		}

		tweetContent.metaTag(TwitterTags.TWITTER);
		tweetContent.setCreated(tweet.getCreatedAt());

		if (author != null) {
			tweetContent.setAuthor(author);
		}

		// and tag the status
		HashtagEntity[] hashtags = tweet.getHashtagEntities();

		tagIOwithHashtags(tweetContent, hashtags);

		UserMentionEntity[] mentionedUsers = tweet.getUserMentionEntities();
		if (mentionedUsers != null
				&& mentionedUsers.length > 0
				&& source
						.isPropertyTrue(TwitterProperties.ADD_MENTIONED_PEOPLE_PROPERTY)) {
			for (int i = 0; i < mentionedUsers.length; i++) {
				Person mentionedPerson = getPersonForTwitterUserId(mentionedUsers[i]
						.getId());

				if (mentionedPerson == null) {
					continue;
				}

				tweetContent.addContributor(mentionedPerson);
			}
		}

		URLEntity[] urlEntities = tweet.getURLEntities();
		if (urlEntities != null
				&& urlEntities.length > 0
				&& source
						.isPropertyTrue(TwitterProperties.ADD_URL_ENTITIES_PROPERTY)) {
			for (int i = 0; i < urlEntities.length; i++) {
				String url = urlEntities[i].getURL();
				if (url != null) {
					// attach url as website
					tweetContent.addWebSite(url);
				}
			}
		}

		// no more available
//		String language = tweet.getIsoLanguageCode();
//		if(language != null && !language.isEmpty())
//		{
//			// set in content
//			tweetContent.setLocale(language);
//			// set as meta tag
//			tweetContent.metaTag(language);
//		}
		
		if(loadPhotos()) {
			// attach photos possibly contained in tweet
			attachPhotos(tweet, tweetContent);
		}
		
		// add location
		GeoLocation tweetLocation = tweet.getGeoLocation();
		Place place = tweet.getPlace();
		
		if (tweetLocation != null || place != null) {
			Location location = factory.createLocation();
			if(place != null)
			{
				location.setStreet(place.getStreetAddress());
				location.setCountry(place.getCountry());
				location.setStringValue(place.getFullName());				
			}
			if(tweetLocation != null)
			{
				location.setLatitude(tweetLocation.getLatitude() + "");
				location.setLongitude(tweetLocation.getLongitude() + "");
			}
			location = (Location) this.add(location,"tloc_" + tweet.getId());

			if (location != null) {
				location.metaTag(TwitterTags.TWITTER);
				tweetContent.extend(location);
				if(place != null)
				{
					location.metaTag(place.getCountryCode());
					location.metaTag(place.getPlaceType());
				}
			}
		}
		
		return tweetContent;
	}

	/**
	 * Attaches photos that are contained in the given tweet to the given content.
	 * 
	 * @param tweet Tweet with photos
	 * @param tweetContent Content to attach photos to.
	 */
	private void attachPhotos(Status tweet, Content tweetContent) {
		if(tweet == null || tweet.getMediaEntities().length == 0 || tweetContent == null) {
			// no photos
			return;
		}
		
		// check all media entities for a photo
		for(MediaEntity entity : tweet.getMediaEntities()) {
			if(entity.getType().equalsIgnoreCase("photo")) {
				// found photo
				// attach it
				Image attachedImage = tweetContent.attachImage(entity.getMediaURL());
				if(attachedImage != null) {
					// add a meta tag
					attachedImage.metaTag(TwitterTags.PHOTO_METATAG);
				}
			}
		}
	}

	/**
	 * Checks if the given tweet contains photos.
	 * 
	 * @param tweet Tweet to check
	 * @return True if tweet contains photos
	 */
	private boolean hasPhotos(Status tweet) {
		if(tweet == null || tweet.getMediaEntities().length == 0) {
			// no photos
			return false;
		}
		
		// check all media entities for a photo
		for(MediaEntity entity : tweet.getMediaEntities()) {
			if(entity.getType().equalsIgnoreCase("photo")) {
				// found photo
				return true;
			}
		}
		
		// no photo found
		return false;
	}

	/**
	 * Adds all direct messages sent from other users to the owner of this
	 * account and the ones sent from this user to others.
	 */
	private void addDirectMessages() {

		// add DirectMessages
		ResponseList<DirectMessage> directMessages = null;

		if (loadDirectMessages()) {
			try {
				directMessages = twitterAPI.getDirectMessages();
			} catch (TwitterException e) {
				log("Could not get received Direct Messages from Twitter. ("
						+ e.getMessage() + ")", LogService.LOG_ERROR);
				directMessages = null;
			}

			if (directMessages != null) {
				addDirectMessages(directMessages);
			}
		}

		if (loadSentDirectMessages()) {
			try {
				directMessages = twitterAPI.getSentDirectMessages();
			} catch (TwitterException e) {
				log("Could not get sent Direct Messages from Twitter. ("
						+ e.getMessage() + ")", LogService.LOG_ERROR);
				directMessages = null;
			}

			if (directMessages != null) {
				addDirectMessages(directMessages);
			}
		}

	}

	private void addDirectMessages(ResponseList<DirectMessage> directMessages) {
		for (DirectMessage message : directMessages) {

			// User who wrotes the message
			User twitterSender = message.getSender();
			Person sender = createPersonFromTwitterUser(twitterSender);

			User twitterRecipient = message.getRecipient();
			Person recipient = createPersonFromTwitterUser(twitterRecipient);

			createContentFromTwitterDirectMessage(sender, recipient, message);
		}
	}

	/**
	 * Returns whether to enrich person profiles or not.
	 * 
	 * @return True if enrichment is enabled.
	 */
	private boolean shouldEnrichPersons() {
		return source.isPropertyTrueElseDefault(TwitterProperties.ENRICH_PERSONS_PROPERTY, TwitterProperties.ENRICH_PERSONS_DEFAULT);
	}
	
	private boolean shouldSearch() {
		String searchValue = source
				.getPropertyValue(TwitterProperties.SEARCH_PROPERTY);

		// chech if search query is defined
		if (searchValue == null || searchValue.isEmpty()) {
			return false;
		}

		return true;
	}

	private boolean interconnectFollowing() {
		return source
				.isPropertyTrue(TwitterProperties.INTERCONNECT_FOLLOWING_PROPERTY);
	}

	private boolean interconnectFollowers() {
		return source
				.isPropertyTrue(TwitterProperties.INTERCONNECT_FOLLOWERS_PROPERTY);
	}

	private boolean loadFollowing() {
		return source.isPropertyTrue(TwitterProperties.LOAD_FOLLOWING_PROPERTY);
	}

	private boolean loadFollowers() {
		return source.isPropertyTrue(TwitterProperties.LOAD_FOLLOWERS_PROPERTY);
	}

	private boolean loadPhotoTweetsOnly() {
		return source.isPropertyTrueElseDefault(TwitterProperties.LOAD_PHOTO_TWEETS_ONLY_PROPERTY, TwitterProperties.LOAD_PHOTO_TWEETS_ONLY_DEFAULT);
	}

	private boolean loadPhotos() {
		return source.isPropertyTrueElseDefault(TwitterProperties.LOAD_PHOTOS_PROPERTY, TwitterProperties.LOAD_PHOTOS_DEFAULT);
	}

	private boolean loadSentDirectMessages() {
		// currently not supported due to restrictions of public applications
		return false; // return
						// source.getPropertyValue(LOAD_SENT_DIRECT_MESSAGES_PROPERTY)
						// != null &&
						// source.getPropertyValue(LOAD_SENT_DIRECT_MESSAGES_PROPERTY).equalsIgnoreCase("true");
	}

	private boolean loadDirectMessages() {
		// currently not supported due to restrictions of public applications
		return false; // return
						// source.getPropertyValue(LOAD_DIRECT_MESSAGES_PROPERTY)
						// != null &&
						// source.getPropertyValue(LOAD_DIRECT_MESSAGES_PROPERTY).equalsIgnoreCase("true");
	}

	private boolean loadUserTimeline() {
		return source
				.isPropertyTrue(TwitterProperties.LOAD_USER_TIMELINE_PROPERTY);
	}

	private boolean loadHomeTimeline() {
		return source
				.isPropertyTrue(TwitterProperties.LOAD_HOME_TIMELINE_PROPERTY);
	}

	private int getNumberOfUserTimelineTweets() {
		String property = source.getPropertyValueElseDefault(
				TwitterProperties.NUMBER_OF_USER_TIMELINE_TWEETS_PROPERTY,
				TwitterProperties.NUMBER_OF_USER_TIMELINE_TWEETS_DEFAULT);

		int numberOfTweets = 1;

		try {
			numberOfTweets = new Integer(property);
		} catch (Exception e) {
			log("Could not parse configured number of user timeline tweets, setting it to "
					+ numberOfTweets, LogService.LOG_WARNING);
		}

		return numberOfTweets;
	}

	private int getNumberOfSearchTweets() {
		String property = source.getPropertyValueElseDefault(
				TwitterProperties.NUMBER_OF_SEARCH_TWEETS_PROPERTY,
				TwitterProperties.NUMBER_OF_SEARCH_TWEETS_DEFAULT);

		int numberOfTweets = 1;

		try {
			numberOfTweets = new Integer(property);
		} catch (Exception e) {
			log("Could not parse configured number of user search tweets, setting it to "
					+ numberOfTweets, LogService.LOG_WARNING);
		}

		return numberOfTweets;
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
			if(property.getKey().equals(TwitterProperties.SEARCH_SINCE_ID_PROPERTY))
			{
				// since id property will be retrieved before every call so accept change
				return true;
			}
		}
		return false;
	}

	/**
	 * Updates the date to skip old entries.
	 */
	private void updateOlderThanDate() {
		String olderThanDaysString = getConfiguration().getPropertyValue(TwitterProperties.SKIP_OLDER_THAN_DAYS_PROPERTY);
		
		if(olderThanDaysString == null) {
			skipOlderThan = null;
			return;
		}
		
		// try to parse
		try {
			long days = new Long(olderThanDaysString);
			// now
			skipOlderThan = new Date();
			// - days (in millis)
			// 24 * 60 * 60 * 1000 = 86400000
			skipOlderThan.setTime(skipOlderThan.getTime() - days * 86400000l);
		} catch (Exception e) {
			skipOlderThan = null;
			return;
		}	
	}
}
