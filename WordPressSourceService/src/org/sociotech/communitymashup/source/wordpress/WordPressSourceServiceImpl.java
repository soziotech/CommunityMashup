package org.sociotech.communitymashup.source.wordpress;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import net.bican.wordpress.Author;
import net.bican.wordpress.Comment;
import net.bican.wordpress.CommentCount;
import net.bican.wordpress.CustomField;
import net.bican.wordpress.FilterPost;
import net.bican.wordpress.MediaItem;
import net.bican.wordpress.Post;
import net.bican.wordpress.PostType;
import net.bican.wordpress.Wordpress;

import org.jsoup.Jsoup;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Event;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.IndoorLocation;
import org.sociotech.communitymashup.data.Location;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.WebAccount;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.wordpress.meta.WordpressTags;

import redstone.xmlrpc.XmlRpcArray;
import redstone.xmlrpc.XmlRpcFault;

/**
 * @author Peter Lachenmaier
 *
 * Main implementation of the Source Service for Wordpress powered platforms.
 * 
 */
public class WordPressSourceServiceImpl extends SourceServiceFacadeImpl {

	/**
	 * Key for external wordpress url property.
	 */
	public static final String EXTERNAL_URL_PROPERTY = "externalURL";

	/**
	 * Key for username property.
	 */
	public static final String USERNAME_PROPERTY = "username";

	/**
	 * Key for password property.
	 */
	public static final String PASSWORD_PROPERTY = "password";

	/**
	 * Key for rpc path property
	 */
	public static final String RPCPATH_PROPERTY = "rpcpath";
	
	private Wordpress wordpress = null;
	private List<MediaItem> mediaLibrary;
	private Map<Integer,String> mediaItemURL;
	
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#initialize(org.sociotech.communitymashup.application.Source)
	 */
	@Override
	public boolean initialize(Source configuration) {
	
		boolean initialized = super.initialize(configuration);
		
		if(initialized)
		{
			// create wordpress
			
			// retrieve properties
			String username = source.getPropertyValue(USERNAME_PROPERTY);
			String password = source.getPropertyValue(PASSWORD_PROPERTY);
			
			String wordpressUrl = source.getPropertyValue(EXTERNAL_URL_PROPERTY);
			String rpcPath 		= source.getPropertyValue(RPCPATH_PROPERTY);
			
			// check properties
			if(username == null || password == null)
			{
				log("Password or Username not set in configuration", LogService.LOG_ERROR);
				initialized &= false;
			}
			else if(wordpressUrl == null || rpcPath == null)
			{
				log("Url or rpc path not set in configuration", LogService.LOG_ERROR);
				initialized &= false;
			}
			else
			{
				// all properties set
				// create instance of wordpress class
				try {
					wordpress = new Wordpress(username, password, wordpressUrl + rpcPath);
				}
				catch (MalformedURLException e) {
					log("Malformed URL. Could not create wordpress instance for user: " + username + " at " + wordpressUrl, LogService.LOG_ERROR);
					initialized &= false;
				}
			}
			
		}
		
		setInitialized(initialized);
		
		return initialized;
	}
	

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#fillDataSet(org.sociotech.communitymashup.data.DataSet)
	 */
	public void fillDataSet(DataSet dataSet)
	{
		super.fillDataSet(dataSet);
		
		// check wordpress instance

		if(wordpress == null) {
			return;
		}
		
		// add authors
		// addAuthors(dataSet);
		
		// add all pages and link to authors
		// addPages(dataSet);
		
		// add all posts and link to authors
		// addPosts(dataSet);
		
		// create hierarchy of categories
		// createCategoryHierarchy(dataSet);
		
		// load media library (for reference)
		try {
			mediaLibrary = wordpress.getMediaLibrary();
			mediaItemURL = new HashMap<Integer,String>();
			for(MediaItem mediaItem : mediaLibrary)	{
				mediaItemURL.put(mediaItem.getAttachment_id(), mediaItem.getLink());
			}
		} catch (XmlRpcFault e) {
			log("XmlRpcFault (" + e.getMessage() + "). Could not retrieve media library from wordpress.",LogService.LOG_WARNING);
		} catch (Exception e) {
			log("Exception (" + e.getMessage() +"). Could not retrieve categories from wordpress.",LogService.LOG_WARNING);
		}
		// add the content objects
		addContentObjects(dataSet);
		// add the person objects
		addPersonObjects(dataSet);
		// add the organization objects
		addOrganizationObjects(dataSet);
	}

	/**
	 * 
	 * @param dataSet Data set to add pages to.
	 */
	private void addContentObjects(DataSet dataSet) {
		try {
			FilterPost filter = new FilterPost();
			filter.setPost_type("content");
			List<Post> posts = wordpress.getPosts(filter);
			log("loaded "+posts.size()+" content objects");
			for(Post post : posts) {
				// create a content object for every post
				Content pageContent = createContentFromPost(dataSet, post);
				// meta tag it
				pageContent.metaTag("cms_content");
			}
			
			// TODO create page hierarchy from page.getWp_page_parent_id()
		}
		catch (XmlRpcFault e) {
			System.err.println(e.toString());
			log("XmlRpcFault (" + e.getMessage() + "). Could not retrieve content from wordpress.",LogService.LOG_WARNING);
		}
		catch (Exception e) {
			System.err.println(e.toString());
			log("Exception (" + e.getMessage() +"). Could not retrieve content from wordpress.",LogService.LOG_WARNING);
		}
	}
	
	/**
	 * Creates a content object from a given content post
	 * and adds it to the given data set.
	 * 
	 * @param dataSet Data set to add the new content to
	 * @param post Post to transform to a content object
	 * @return The new content object, null in error case.
	 */
	private Content createContentFromPost(DataSet dataSet, Post post) {
		
		if (dataSet == null || post == null) {
			return null;
		}
		DataFactory factory = DataPackage.eINSTANCE.getDataFactory();
		
		// TODO: check if content already exits
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// create content and set values
		Content item = factory.createContent();
		item.setName(cleanWordpressHtml(post.getPost_title()));
		// add original also as alternative name to keep it when merging with existing items
		item.addAlternativeName(post.getPost_title());
		
		// take post id as ident
		String id = post.getPost_id().toString();
		// and set it, if null a unique one is generated when adding to data set
		item.setIdent(id);
		
		// the real page content is in the description
		item.setStringValue(cleanWordpressHtml(post.getPost_content()));
		
		// the permalink will be the uri 
		// item.setUri(post.getLink());
		
		// set the creation date
		if(post.getPost_date() != null) {
			// be nice and do a null check
			item.setCreated(post.getPost_date());
		}	
		
		// set the custom fields
		List<CustomField> cfields = post.getCustom_fields();
		for (CustomField cfield : cfields) {
			String name = cfield.getKey();
			String value = cfield.getValue();
			if (name.contentEquals("alternative-names")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					item.addAlternativeName(tokenizer.nextToken());
				}
			}
		}
		
		// add it to dataSet
		dataSet.add(item);
		
		// attributes to be set after adding it to dataSet
		for (CustomField cfield : cfields) {
			String name = cfield.getKey();
			String value = cfield.getValue();
			if (value==null || value.length()<1) continue;
			if (name.contentEquals("startdate")) {
				try {
					Date date = dateFormat.parse(value);
					Event agendaItemStartEvent = factory.createEvent();
					agendaItemStartEvent.setDate(date);
					agendaItemStartEvent = this.add(agendaItemStartEvent, "start_" + id);
					agendaItemStartEvent.metaTag("startdate");
					item.extend(agendaItemStartEvent);		
				} catch (Exception e) {
					log("Failed parsing date "+value);
				}
			}
			if (name.contentEquals("enddate")) { // enddate=2020-05-30 00:00:00
				try {
					Date date = dateFormat.parse(value);    
					Event agendaItemEndEvent = factory.createEvent();
					agendaItemEndEvent.setDate(date);
					agendaItemEndEvent = this.add(agendaItemEndEvent, "end_" + id);
					agendaItemEndEvent.metaTag("enddate");
					item.extend(agendaItemEndEvent);
				} catch (Exception e) {
					log("Failed parsing date "+value);
				}
			}
			if (name.contentEquals("teaserimage")) {
				Integer mediaItemId = Integer.parseInt(value);
				String url = mediaItemURL.get(mediaItemId);
				Image image = item.attachImage(url);
				if (image != null) {
					image.metaTag("cms_image");
					image.metaTag("cms_information");
				}
			}
			if (name.contentEquals("url")) {
				item.setUri(value);
			}
			if (name.contentEquals("org")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					String tmpname = tokenizer.nextToken().trim();
			    	Organisation org = factory.createOrganisation();
			    	org.setName(tmpname);
			    	org = this.add(org);
			    	if (org != null) {
			    		// metatag it
			    		org.metaTag("cms_organization");
			    		org.metaTag("cms_information");
			    		item.connectTo(org);
			    	}
				}
			}
			if (name.contentEquals("pers")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					Person person = factory.createPerson();
			    	String tmpname = tokenizer.nextToken();
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
			    	person = this.add(person);
			    	if (person != null) {
			    		// content.connectTo(person);
			    		// org: organization.addParticipant(person);
			    	}
				}
			}
			if (name.contentEquals("identifier")) {
				if (value.length()>1) {
					String[] parts = value.split(":");
					item.identifyBy(parts[0], parts[1]);
				}
			}
			if (name.contentEquals("metatags")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					item.metaTag(tokenizer.nextToken());
				}
			}
			if (name.contentEquals("tags")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					item.tag(tokenizer.nextToken());
				}
			}
			if (name.contentEquals("location")) {
				// create indoor location
				IndoorLocation contentLoc = factory.createIndoorLocation();
				contentLoc.setName(value);
				// add it with id to be correctly merged on update
				contentLoc = this.add(contentLoc, "contentILoc_" + id);
				if(contentLoc != null) {
					// metatag it
					contentLoc.metaTag("cms_location");
					// and add it to the content
					item.extend(contentLoc);
				}
			}
		}
		
		// image
		MediaItem mediaItem = post.getPost_thumbnail();
		if (mediaItem != null) {
			String url = mediaItem.getLink();
			Image image = item.attachImage(url);
			if (image != null) {
				image.metaTag("cms_image");
				image.metaTag("cms_information");
			}
		}
				
		// add special identifier -> may lead to merge
		item.identifyBy("cms_content", id);
		
		return item;
	}
	
	/**
	 * 
	 * @param dataSet Data set to add pages to.
	 */
	private void addPersonObjects(DataSet dataSet) {
		try {
			FilterPost filter = new FilterPost();
			filter.setPost_type("person");
			List<Post> posts = wordpress.getPosts(filter);
			log("loaded "+posts.size()+" person objects");
			for(Post post : posts) {
				// create a content object for every post
				Person person = createPersonFromPost(dataSet, post);
				// meta tag it
				person.metaTag("cms_person");
			}
			
			// TODO create page hierarchy from page.getWp_page_parent_id()
		}
		catch (XmlRpcFault e)
		{
			log("XmlRpcFault (" + e.getMessage() + "). Could not retrieve persons from wordpress.",LogService.LOG_WARNING);
		}
		catch (Exception e)
		{
			log("Exception (" + e.getMessage() +"). Could not retrieve persons from wordpress.",LogService.LOG_WARNING);
		}
	}
	
	/**
	 *
	 */
	private Person createPersonFromPost(DataSet dataSet, Post post) {
		
		if (dataSet == null || post == null) {
			return null;
		}
		DataFactory factory = DataPackage.eINSTANCE.getDataFactory();
		
		// TODO: check if content already exits
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// create content and set values
		Person item = factory.createPerson();
		item.setName(cleanWordpressHtml(post.getPost_title()));
		// add original also as alternative name to keep it when merging with existing items
		item.addAlternativeName(post.getPost_title());
		
		// take post id as ident
		String id = post.getPost_id().toString();
		// and set it, if null a unique one is generated when adding to data set
		item.setIdent(id);
		
		// the real page content is in the description
		item.setStringValue(cleanWordpressHtml(post.getPost_content()));
		
		// the permalink will be the uri 
		// item.setUri(post.getLink());
		
		// set the creation date
		if(post.getPost_date() != null) {
			// be nice and do a null check
			item.setCreated(post.getPost_date());
		}	
		
		// set the custom fields
		List<CustomField> cfields = post.getCustom_fields();
		for (CustomField cfield : cfields) {
			String name = cfield.getKey();
			String value = cfield.getValue();
			if (name.contentEquals("alternative-names")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					item.addAlternativeName(tokenizer.nextToken());
				}
			}
		}
		
		// add it to dataSet
		dataSet.add(item);
		
		// attributes to be set after adding it to dataSet
		for (CustomField cfield : cfields) {
			String name = cfield.getKey();
			String value = cfield.getValue();
			if (value==null || value.length()<1) continue;
			if (name.contentEquals("url")) {
				item.setUri(value);
			}
			if (name.contentEquals("org")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					String tmpname = tokenizer.nextToken().trim();
			    	Organisation org = factory.createOrganisation();
			    	org.setName(tmpname);
			    	org = this.add(org);
			    	if (org != null) {
			    		// metatag it
			    		org.metaTag("cms_organization");
			    		org.metaTag("cms_information");
			    		item.connectTo(org);
			    	}
				}
			}
			if (name.contentEquals("pers")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					Person person = factory.createPerson();
			    	String tmpname = tokenizer.nextToken();
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
			    	person = this.add(person);
			    	if (person != null) {
			    		// content.connectTo(person);
			    		// org: organization.addParticipant(person);
			    	}
				}
			}
			if (name.contentEquals("identifier")) {
				if (value.length()>1) {
					String[] parts = value.split(":");
					item.identifyBy(parts[0], parts[1]);
				}
			}
			if (name.contentEquals("metatags")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					item.metaTag(tokenizer.nextToken());
				}
			}
			if (name.contentEquals("tags")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					item.tag(tokenizer.nextToken());
				}
			}
			if (name.contentEquals("fistname")) {
				
			}
			if (name.contentEquals("lastname")) {
				
			}
		}
		
		// image
		MediaItem mediaItem = post.getPost_thumbnail();
		if (mediaItem != null) {
			String url = mediaItem.getLink();
			Image image = item.attachImage(url);
			if (image != null) {
				image.metaTag("cms_image");
				image.metaTag("cms_information");
			}
		}
				
		// add special identifier -> may lead to merge
		item.identifyBy("cms_person", id);
				
		return item;
	}
	
	/**
	 * 
	 * @param dataSet Data set to add pages to.
	 */
	private void addOrganizationObjects(DataSet dataSet) {
		try {
			FilterPost filter = new FilterPost();
			filter.setPost_type("content");
			List<Post> posts = wordpress.getPosts(filter);
			log("loaded "+posts.size()+" organization objects");
			for(Post post : posts) {
				// create a content object for every post
				Organisation pageContent = createOrganizationFromPost(dataSet, post);
				// meta tag it
				pageContent.metaTag("cms_content");
			}
			
			// TODO create page hierarchy from page.getWp_page_parent_id()
		}
		catch (XmlRpcFault e)
		{
			log("XmlRpcFault (" + e.getMessage() + "). Could not retrieve pages from wordpress.",LogService.LOG_WARNING);
		}
		catch (Exception e)
		{
			log("Exception (" + e.getMessage() +"). Could not retrieve pages from wordpress.",LogService.LOG_WARNING);
		}
	}
	
	/**
	 * Creates a content object from a given content post
	 * and adds it to the given data set.
	 * 
	 * @param dataSet Data set to add the new content to
	 * @param post Post to transform to a content object
	 * @return The new content object, null in error case.
	 */
	private Organisation createOrganizationFromPost(DataSet dataSet, Post post) {
		
		if (dataSet == null || post == null) {
			return null;
		}
		DataFactory factory = DataPackage.eINSTANCE.getDataFactory();
		
		// TODO: check if content already exits
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// create content and set values
		Organisation item = factory.createOrganisation();
		item.setName(cleanWordpressHtml(post.getPost_title()));
		// add original also as alternative name to keep it when merging with existing items
		item.addAlternativeName(post.getPost_title());
		
		// take post id as ident
		String id = post.getPost_id().toString();
		// and set it, if null a unique one is generated when adding to data set
		item.setIdent(id);
		
		// the real page content is in the description
		item.setStringValue(cleanWordpressHtml(post.getPost_content()));
		
		// the permalink will be the uri 
		// item.setUri(post.getLink());
		
		// set the creation date
		if(post.getPost_date() != null) {
			// be nice and do a null check
			item.setCreated(post.getPost_date());
		}	
		
		// set the custom fields
		List<CustomField> cfields = post.getCustom_fields();
		for (CustomField cfield : cfields) {
			String name = cfield.getKey();
			String value = cfield.getValue();
			if (name.contentEquals("alternative-names")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					item.addAlternativeName(tokenizer.nextToken());
				}
			}
		}
		
		// add it to dataSet
		dataSet.add(item);
		
		// attributes to be set after adding it to dataSet
		for (CustomField cfield : cfields) {
			String name = cfield.getKey();
			String value = cfield.getValue();
			if (value==null || value.length()<1) continue;
			if (name.contentEquals("url")) {
				item.setUri(value);
			}
			if (name.contentEquals("org")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					String tmpname = tokenizer.nextToken().trim();
			    	Organisation org = factory.createOrganisation();
			    	org.setName(tmpname);
			    	org = this.add(org);
			    	if (org != null) {
			    		// metatag it
			    		org.metaTag("cms_organization");
			    		org.metaTag("cms_information");
			    		item.connectTo(org);
			    	}
				}
			}
			if (name.contentEquals("pers")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					Person person = factory.createPerson();
			    	String tmpname = tokenizer.nextToken();
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
			    	person = this.add(person);
			    	if (person != null) {
			    		// content.connectTo(person);
			    		// org: organization.addParticipant(person);
			    	}
				}
			}
			if (name.contentEquals("identifier")) {
				if (value.length()>1) {
					String[] parts = value.split(":");
					item.identifyBy(parts[0], parts[1]);
				}
			}
			if (name.contentEquals("metatags")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					item.metaTag(tokenizer.nextToken());
				}
			}
			if (name.contentEquals("tags")) {
				StringTokenizer tokenizer = new StringTokenizer(value, ",;");
				while (tokenizer.hasMoreElements()) {
					item.tag(tokenizer.nextToken());
				}
			}
		}
		
		// image
		MediaItem mediaItem = post.getPost_thumbnail();
		if (mediaItem != null) {
			String url = mediaItem.getLink();
			Image image = item.attachImage(url);
			if (image != null) {
				image.metaTag("cms_image");
				image.metaTag("cms_information");
			}
		}
				
		// add special identifier -> may lead to merge
		item.identifyBy("cms_org", id);
				
		return item;
	}
	
	/**
	 * Creates a hierarchy of the categories previously got from pages and post.
	 * 
	 * @param dataSet Data set to apply the hierarchy on
	 */
	private void createCategoryHierarchy(DataSet dataSet) {
		/*
		try {
			List<Category> wpCategories = wordpress.getCategories();
			
			if(wpCategories == null || wpCategories.isEmpty())
			{
				return;
			}
			
			// create hashmap for easy comparison, initialize with known size
			Map<String, String> idNameMap = new HashMap<String, String>(wpCategories.size());
			
			String name;
			
			// first: add all categories to a hashmap
			for(Category category : wpCategories)
			{
				name = cleanWordpressHtml(category.getCategoryName());
				idNameMap.put(category.getCategoryId(), name);
			}
			
			// second: set parent hierarchy in data set
			for(Category category : wpCategories)
			{
				if(category.getParentId() == null)
				{
					// nothing to do
					continue;
				}
				
				name = cleanWordpressHtml(category.getCategoryName());
				
				// lookup matching category in data set
				org.sociotech.communitymashup.data.Category mashupCategory = dataSet.getCategory(name);
				
				if(mashupCategory == null)
				{
					// category not used so nothing to do
					continue;
				}
				String parentCategoryName = idNameMap.get(category.getParentId());
				
				// look up category with name of parent
				org.sociotech.communitymashup.data.Category parentMashupCategory = dataSet.getCategory(parentCategoryName);
				
				if(parentMashupCategory != null)
				{
					// set parent relationship
					mashupCategory.setParentCategory(parentMashupCategory);
				}
			}
		}
		catch (XmlRpcFault e)
		{
			log("XmlRpcFault (" + e.getMessage() + "). Could not retrieve categories from wordpress.",LogService.LOG_WARNING);
		}
		catch (Exception e)
		{
			log("Exception (" + e.getMessage() +"). Could not retrieve categories from wordpress.",LogService.LOG_WARNING);
		}
		*/
	}

	/**
	 * Adds all authors from wordpress as persons to the given data set.
	 * 
	 * @param dataSet Data set to add authors to.
	 */
	private void addAuthors(DataSet dataSet) {
		DataFactory factory = DataPackage.eINSTANCE.getDataFactory();
		
		// use the base url of the external service to identify web accounts
		String webAccountUrl = source.getPropertyValue(EXTERNAL_URL_PROPERTY);
		
		try {
			List<Author> authors = wordpress.getAuthors();
			for(Author author : authors)
			{
				/*
				String personIdent = author.getUser_id();
				Person authorPerson = getPersonForWPAuthor(dataSet, personIdent);
			
				// add only new persons
				if(authorPerson == null)
				{
					// not yet existant
					authorPerson = factory.createPerson();
					
					authorPerson.setIdent(personIdent);
					
					// set display name as name 
					authorPerson.setName(author.getDisplay_name());
					
					// add the person to the dataset
					dataSet.add(authorPerson);
					
					// tag it 
					authorPerson.metaTag(WordpressTags.WORDPRESS);
					
					// set username as web account
					WebAccount webAccount = factory.createWebAccount();
					
					webAccount.setStringValue(author.getUser_login());
					
					// add it to data set
					dataSet.add(webAccount);
					
					// connect it with user
					authorPerson.extend(webAccount);
					
					// tag it with the plattform url
					webAccount.metaTag(webAccountUrl);
					// and wordpress
					webAccount.tag(WordpressTags.WORDPRESS);
					// add it to dataset
				}
				*/
				
			}
		}
		catch (XmlRpcFault e)
		{
			log("XmlRpcFault (" + e.getMessage() + "). Could not retrieve authors from wordpress.",LogService.LOG_WARNING);
		}
		catch (Exception e)
		{
			log("Exception (" + e.getMessage() +"). Could not retrieve authors from wordpress.",LogService.LOG_WARNING);
		}
	}

	
	/**
	 * Adds all pages from wordpress as contents to the given data set and creates the author relationship.
	 * 
	 * @param dataSet Data set to add pages to.
	 */
	private void addPages(DataSet dataSet) {
		
		/*
		try {
			List<Page> pages = wordpress.getPages();
			
			for(Page page : pages)
			{
				// create a content object for every post
				Content pageContent = createContentFromPage(dataSet, page);
				// meta tag it
				pageContent.metaTag(WordpressTags.PAGETAG);
			}
			
			// TODO create page hierarchy from page.getWp_page_parent_id()
		}
		catch (XmlRpcFault e)
		{
			log("XmlRpcFault (" + e.getMessage() + "). Could not retrieve pages from wordpress.",LogService.LOG_WARNING);
		}
		catch (Exception e)
		{
			log("Exception (" + e.getMessage() +"). Could not retrieve pages from wordpress.",LogService.LOG_WARNING);
		}
		*/
	}
	
	/**
	 * Adds all posts from wordpress as contents to the given data set and creates the author relationship.
	 * 
	 * @param dataSet Data set to add posts to.
	 */
	private void addPosts(DataSet dataSet) {
		/*
		try {
			 List<Page> posts = wordpress.getRecentPosts(0);
			
			for(Page post : posts)
			{
				// create a content object for every post
				Content pageContent = createContentFromPage(dataSet, post);
				// meta tag it
				pageContent.metaTag(WordpressTags.POSTTAG);
			}
			
			// TODO create page hierarchy from page.getWp_page_parent_id()
			
		}
		catch (XmlRpcFault e)
		{
			log("XmlRpcFault (" + e.getMessage() + "). Could not retrieve posts from wordpress.",LogService.LOG_WARNING);
		}
		catch (Exception e)
		{
			log("Exception (" + e.getMessage() +"). Could not retrieve posts from wordpress.",LogService.LOG_WARNING);
		}
		*/
	}

	/**
	 * Adds all comments of the given page or post from wordpress as child-contents of the 
	 * commented page or post to the given data set and creates the author relationship if person exists.
	 * 
	 * @param dataSet Data set to add comments to.
	 */
	private void addCommentsForPageOrPost(DataSet dataSet, String id) {
		
		if(dataSet == null || id == null)
		{
			return;
		}
		
		Integer intId = new Integer(id);
		
		try {
			CommentCount commentscount = wordpress.getCommentsCount(intId);
			
			if(commentscount == null || commentscount.getApproved() <= 0)
			{
				// return if no approved comments available
				return;
			}
			
			// only use approved comments
			List<Comment> comments = wordpress.getComments("approve", intId, commentscount.getApproved(), 0);
			
			for(Comment comment : comments)
			{
				// create a content object for every post
				Content pageContent = createContentFromComment(dataSet, comment);
				// meta tag it
				pageContent.metaTag(WordpressTags.COMMENTTAG);
			}
			
			// TODO create comment hierarchy 
		}
		catch (XmlRpcFault e)
		{
			log("XmlRpcFault (" + e.getMessage() + "). Could not retrieve comments from wordpress.",LogService.LOG_WARNING);
		}
		catch (Exception e)
		{
			log("Exception (" + e.getMessage() +"). Could not retrieve comments from wordpress.",LogService.LOG_WARNING);
		}
	}
	
	/**
	 * Creates a content object from a given wordpress comment. The parent content needs
	 * to exist to create the relationship.
	 * 
	 * @param dataSet Data set to add the comment to
	 * @param comment Wordpress comment object
	 * @return The created comment or null in error case
	 */
	private Content createContentFromComment(DataSet dataSet, Comment comment) {
		if(dataSet == null || comment == null)
		{
			return null;
		}
		
		DataFactory factory = DataPackage.eINSTANCE.getDataFactory();
		
		//log("Comment " + comment, LogService.LOG_INFO);
		
		// TODO: check if content already exits
		
		// create content and set values
		Content commentContent = factory.createContent();
		// set title of post with prefix to name
		commentContent.setName("Comment - " + comment.getPost_title());
		
		// ident is the comment id
		commentContent.setIdent(comment.getComment_id().toString());
		
		// the real comment content is in the cotent
		commentContent.setStringValue(cleanWordpressHtml(comment.getContent()));
		
		// the link will be the uri 
		commentContent.setUri(comment.getLink());
		
		// set the creation date
		if(comment.getDate_created_gmt() != null)
		{
			// be nice and do a null check
			commentContent.setCreated(comment.getDate_created_gmt());
		}	
		
		// TODO add more values here
		
		// add it to dataSet
		dataSet.add(commentContent);
		
		// if post id set, it is the parent
		if(comment.getPost_id() != null)
		{
			// get parent content from data set
			Content parentContent = dataSet.getContentWithIdent(comment.getPost_id().toString());
			if(parentContent != null)
			{
				log("Added comment to " + parentContent.getName());
				commentContent.setParentContent(parentContent);
			}
		}
		
		// tag and categorize it
		
		// meta tags
		commentContent.metaTag(WordpressTags.WORDPRESS);
	
		// TODO: create/search persons for comment authors and link
		
		return commentContent;
	}

	/**
	 * Removes Html and Wordpress Shortcodes from the given String using jSoup and returns the cleaned String.
	 * 
	 * @param htmlValue String containing Html
	 * @return Htmlless String
	 */
	private String cleanWordpressHtml(String htmlValue)
	{
		
		// remove html tags ...
		String cleanedText = Jsoup.parse(htmlValue).text();
		
		// decode html encoded values
		try {
			cleanedText = URLDecoder.decode(cleanedText, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			log("Could not decode html text, UTF-8 unsupported", LogService.LOG_WARNING);
		}
		
		// remove wordpress shortcodes
		
		cleanedText = cleanedText.replaceAll("\\[.*?]","");
		log(cleanedText);
		
		return cleanedText;
	}

	/**
	 * Creates a content object from a given wordpress page (post are also pages)
	 * and adds it to the given data set.
	 * 
	 * @param dataSet Data set to add the new content to
	 * @param page Page to transform to a content object
	 * @return The new content object, null in error case.
	 */
	/*
	private Content createContentFromPage(DataSet dataSet, Page page) {
		
		if(dataSet == null || page == null)
		{
			return null;
		}
		
		DataFactory factory = DataPackage.eINSTANCE.getDataFactory();
		
		//log("Page " + page, LogService.LOG_INFO);
		
		// TODO: check if content already exits
		
		// create content and set values
		Content pageContent = factory.createContent();
		pageContent.setName(cleanWordpressHtml(page.getTitle()));
		
		// take page id as ident
		String id = page.getPage_id();
		
		if(id == null)
		{
			// try post id
			id = page.getPostid().toString();
		}
		
		// and set it, if null a unique one is generated when adding to data set
		pageContent.setIdent(id);
		
		// the real page content is in the description
		pageContent.setStringValue(cleanWordpressHtml(page.getDescription()));
		
		// the permalink will be the uri 
		pageContent.setUri(page.getPermaLink());
		
		// set the creation date
		if(page.getDateCreated() != null)
		{
			// be nice and do a null check
			pageContent.setCreated(page.getDateCreated());
		}	
		
		// TODO add more values here
		
		// add it to dataSet
		dataSet.add(pageContent);
		
		// tag and categorize it
		
		// meta tags
		pageContent.metaTag(WordpressTags.WORDPRESS);
		
		// post type is a meta tag
		pageContent.metaTag(page.getPost_type());
		
		// categories from wordpress
		XmlRpcArray wpCategories = page.getCategories();
		
		if(wpCategories != null && !wpCategories.isEmpty())
		{
			for(int i = 0; i < wpCategories.size(); i++)
			{
				Object o = wpCategories.get(i);
				pageContent.categorize(cleanWordpressHtml(o.toString()));
			}
		}
		
		// tags from wordpress
		String wpKeywords = page.getMt_keywords();
		
		if(wpKeywords != null && !wpKeywords.isEmpty())
		{
			// keywords are komma seperated
		
			String[] tags = wpKeywords.split(", ");
			for(int i = 0; i < tags.length; i++)
			{
				pageContent.tag(tags[i]);
			}
		}
		
		// get and set author
		Person pageAuthor = getPersonForWPAuthor(dataSet, page.getWp_author_id());
		
		if(pageAuthor != null)
		{
			pageContent.setAuthor(pageAuthor);
		}
		
		if(id != null)
		{
			// add all comments of pages and post
			addCommentsForPageOrPost(dataSet, id);
		}
		
		return pageContent;
	}
	*/

	/**
	 * Looks up the Person in the data set for the given wordpress author id.
	 *  
	 * @param dataSet Data set with all persons
	 * @param authorId Wordpress id of the author
	 * @return The Person representing the wordpress author with the given id. Null if the Person does not exist.
	 */
	private Person getPersonForWPAuthor(DataSet dataSet, String authorId) {
		
		if(dataSet == null)
		{
			return null;
		}
		
		// TODO: change here to have source specific ids 
		
		return dataSet.getPersonWithIdent(authorId);
	}
	
//	/* (non-Javadoc)
//	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#createDefaultConfiguration()
//	 */
//	@Override
//	protected void createDefaultConfiguration() {
//		
//		// inherit default values from super class
//		super.createDefaultConfiguration();
//		
//		// add default properties
//		
//		// url of external wordpress service
//		source.addProperty(EXTERNAL_URL_PROPERTY, "http://sns-beta.informatik.unibw-muenchen.de");
//		source.addProperty(RPCPATH_PROPERTY, "/xmlrpc.php");
//
//		// username & password
//		source.addProperty(USERNAME_PROPERTY, "admin");
//		source.addProperty(PASSWORD_PROPERTY, "?????");
//	}

}
