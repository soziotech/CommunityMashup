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
package org.sociotech.communitymashup.source.mendeley.transformation;

import java.util.Date;
import java.util.List;

import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.Document;
import org.sociotech.communitymashup.data.Email;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.WebSite;
import org.sociotech.communitymashup.source.mendeley.MendeleySourceService;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.MendeleyAPIWrapper;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyAuthor;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyContactSection;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyDocumentDetails;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyEditor;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyFileAttachement;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyGroupDocumentsPage;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyGroupMember;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyGroupMembersContainer;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyProfile;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyPublicGroupDetails;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyPublicGroupWithDocumentDetailsPage;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyUser;
import org.sociotech.communitymashup.source.mendeley.apiwrapper.elements.MendeleyUsersGroup;
import org.sociotech.communitymashup.source.mendeley.meta.MendeleyTags;
import org.sociotech.communitymashup.source.mendeley.properties.MendeleyProperties;

/**
 * Transforms results from the Mendeley api wrapper into CommunityMashup objects.
 * 
 * @author Peter Lachenmaier
 *
 */
public class MendeleyTransformation {

	/**
	 * Reference to the mendeley source service, used e. g. for logging 
	 */
	private MendeleySourceService source = null;
	
	/**
	 * Factory for creating new CommunityMashup objects
	 */
	private DataFactory factory = DataFactory.eINSTANCE;
	
	/**
	 * Reference to the mendeley api to possible get additional information 
	 */
	private MendeleyAPIWrapper mendeleyApi = null;
	
	/**
	 * Creates a new mendeley transformation.
	 * 
	 * @param mendeleySource Source service used for logging and data adding
	 * @param mendeleyApi Reference to the yammer api to possible get additional information
	 */
	public MendeleyTransformation(MendeleySourceService mendeleySource, MendeleyAPIWrapper mendeleyApi) {
		source = mendeleySource;
		this.mendeleyApi = mendeleyApi;
	}

	/**
	 * Creates a person representing the given mendeley user.
	 * 
	 * @param user Mendeley user
	 * @return The person representing the given mendeley user.
	 */
	public Person createPerson(MendeleyProfile profile) {
			
		if(profile == null || profile.getMain() == null)
		{
			// no main information
			return null;
		}

		MendeleyUser user = profile.getMain();

		String name = user.getName();
		if(name == null || name.isEmpty())
		{
			// at least a name is required
			return null;
		}

		String id = user.getProfile_id();
		
		if(id != null)
		{
			Person existingPerson = source.getPersonWithSourceIdent(id);
			
			// check if this person was created before
			if(existingPerson != null)
			{
				source.log("Created " + existingPerson.getName() + " already before", LogService.LOG_DEBUG);
				return existingPerson;
			}
		}

		// create new person
		Person profilePerson = factory.createPerson();

		// set the name
		profilePerson.setName(name);

		// and add it
		profilePerson = source.add(profilePerson, id);

		if(profilePerson == null)
		{
			source.log("Could not add person for mendeley user " + name, LogService.LOG_DEBUG);
			return null;
		}

		// tag the person
		profilePerson.metaTag(MendeleyTags.MENDELEY);

		// add more profile informations

		// tag the person with their academic status
		String academicStatus = user.getAcademic_status();
		if(academicStatus != null && !academicStatus.isEmpty())
		{
			profilePerson.tag(academicStatus);
		}

		// tag the person with their discipline
		String disciplineName = user.getDiscipline_name();
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
			profileImage = source.add(profileImage, "profimg_" + id);
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
			webProfile = source.add(webProfile, "profweb_" + id);
			if(webProfile != null)
			{
				webProfile.tag(MendeleyTags.MENDELEY);
				webProfile.tag(MendeleyTags.MENDELEY_PROFILE);
			}
		}

		addContactDetails(profile, profilePerson);

		return profilePerson;
	}

	/**
	 * Adds the contact details of the given mendeley user to the given person.
	 * 
	 * @param mendeleyProfile Mendeley user
	 * @param profilePerson Person to add the contact details to.
	 */
	private void addContactDetails(MendeleyProfile mendeleyProfile, Person profilePerson) {

		if(mendeleyProfile == null || mendeleyProfile.getContact() == null)
		{
			// could not get contact details without profile id 
			return;
		}

		MendeleyContactSection contact = mendeleyProfile.getContact();

		// add email address
		String emailAddress = contact.getEmail();
		if(emailAddress != null && !emailAddress.isEmpty())
		{
			Email email = profilePerson.addEmailAddress(emailAddress);
			email = source.add(email);
			if(email != null)
			{
				email.metaTag(MendeleyTags.MENDELEY);
			}
		}

		// add web page
		String url = contact.getWebpage();
		if(url != null && !url.isEmpty())
		{
			WebSite webProfile = profilePerson.addWebSite(url);
			webProfile = source.add(webProfile);
			if(webProfile != null)
			{
				webProfile.metaTag(MendeleyTags.MENDELEY);
			}
		}

		// TODO add other contact details
	}

	/**
	 * Creates a mashup content from the given document.
	 * 
	 * @param document Mendeley document.
	 */
	public void createDocument(MendeleyDocumentDetails document) {
		createDocument(document, null);
	}
	
	/**
	 * Creates a mashup content from the given document.
	 * 
	 * @param document Mendeley document.
	 * @param groupId The group id if the given document belongs to a group.
	 */
	public void createDocument(MendeleyDocumentDetails document, String groupId) {
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
		docContent = source.add(docContent, document.getId());
		
		if(docContent == null)
		{
			source.log("Could not add document for mendeley document " + document.getTitle(), LogService.LOG_DEBUG);
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
			url = document.getMendeley_url();
		}
		
		if(url != null && !url.isEmpty())
		{
			WebSite docWebsite = docContent.addWebSite(url);
			docWebsite = source.add(docWebsite, "ws_" + document.getId());
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
		if(source.getConfiguration().isPropertyTrueElseDefault(MendeleyProperties.ATTACH_FILES_PROPERTY, MendeleyProperties.ATTACH_FILES_DEFAULT))
		{
			List<MendeleyFileAttachement> files = document.getFiles();
			
			for(MendeleyFileAttachement file : files)
			{
				try {
					String fileUrl = null;
					
					// create file url different if file belongs to group or not
					if(groupId != null) {
						fileUrl = mendeleyApi.getGroupFileUrl(file, document.getId(), groupId);
					} else {
						fileUrl = mendeleyApi.getFileUrl(file, document.getId());
					}
					
					Document attachedFile = docContent.attachDocument(fileUrl);
					
					// set file extension
					attachedFile.setFileExtension(file.getFile_extension());
					
					// create unique file identifier
					attachedFile.setFileIdentifier("mendeley_" + document.getId() + "_" + file.getFile_hash());
					
					// set added date as created date
					attachedFile.setCreated(file.getAddedDate());
					
					// mark as added by this source
					attachedFile = source.add(attachedFile);
					
					if(attachedFile != null)
					{
						attachedFile.metaTag(MendeleyTags.MENDELEY_DOCUMENT);
						attachedFile.metaTag(MendeleyTags.MENDELEY);
						attachedFile.metaTag(file.getFile_extension());
						
						// file urls are only valid for a short time so only the cached files are valid
						attachedFile.setCachedOnly(true);
					}
				} catch (Exception e) {
					source.log("Could not download file for document " + document.getTitle() + " due to exception (" + e.getMessage() + ")", LogService.LOG_WARNING);
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
	private void addMendeleyAuthors(Content docContent, List<MendeleyAuthor> authors, Date addedDate) {
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
	private void addMendeleyEditors(Content docContent, List<MendeleyEditor> editors, Date creationDate) {
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
	private Person createPerson(MendeleyAuthor author, Date creationDate) {
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
	private Person createPerson(MendeleyEditor editor, Date creationDate) {
		if(editor == null)
		{
			return null;
		}
		
		String firstname = editor.getForename();
		String lastname = editor.getSurname();
		
		return createPerson(firstname, lastname, creationDate);
	}
	/**
	 * Determines from the configuration if persons should be created for authors.
	 * 
	 * @return True if they should be created.
	 */
	private boolean shouldCreateAuthors() {
		if(source.getConfiguration().isPropertyTrue(MendeleyProperties.CREATE_AUTHOR_PERSONS_PROPERTY))
		{
			return true;
		}
		
		if(source.getConfiguration().getProperty(MendeleyProperties.CREATE_AUTHOR_PERSONS_PROPERTY) == null)
		{
			return new Boolean(MendeleyProperties.CREATE_AUTHOR_PERSONS_DEFAULT);
		}
		
		return false;
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
		person = source.add(person);
		
		if(person == null)
		{
			source.log("Could not add person for mendeley author " + firstname + lastname, LogService.LOG_DEBUG);
			return null;
		}
		
		// tag the person
		person.metaTag(MendeleyTags.MENDELEY);
		
		return person;
	}

	/**
	 * Creates a person for the given group memeber.
	 * 
	 * @param groupMember Member of group
	 * @return Person representing the group member
	 */
	private Person createPerson(MendeleyGroupMember groupMember) {
		Person person = factory.createPerson();
		
		// set the name
		person.setName(groupMember.getName());
		
		// and add it
		person = source.add(person, groupMember.getUser_id());
		
		if(person == null)
		{
			source.log("Could not add person for mendeley author " + groupMember.getName(), LogService.LOG_DEBUG);
			return null;
		}
		
		// tag the person
		person.metaTag(MendeleyTags.MENDELEY);
		
		return person;
	}
		
	/**
	 * Determines from the configuration if persons should be created for editors.
	 * 
	 * @return True if they should be created.
	 */
	private boolean shouldCreateEditors() {
		if(source.getConfiguration().isPropertyTrue(MendeleyProperties.CREATE_EDITOR_PERSONS_PROPERTY))
		{
			return true;
		}
		
		if(source.getConfiguration().getProperty(MendeleyProperties.CREATE_EDITOR_PERSONS_PROPERTY) == null)
		{
			return new Boolean(MendeleyProperties.CREATE_EDITOR_PERSONS_DEFAULT);
		}
		
		return false;
	}

	/**
	 * Creates an organisation repsenting the given mendeley group. Will be skipped if set in source properties.
	 * 
	 * @param group Mendeley group
	 * @return Organisation representing the given mendeley group.
	 */
	public Organisation createGroup(MendeleyUsersGroup group) {
		
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
		
		Organisation organisation = null;
		
		if(source.getConfiguration().isPropertyTrueElseDefault(MendeleyProperties.CREATE_GROUP_ORGANISATIONS_PROPERTY, MendeleyProperties.CREATE_GROUP_ORGANISATIONS_DEFAULT))
		{
			// create new organisation as mapping for a group
			organisation = factory.createOrganisation();
			
			organisation.setName(groupName);
			
			organisation = source.add(organisation, group.getId());
			
			if(organisation == null)
			{
				source.log("Could not add organisation for group " + groupName, LogService.LOG_WARNING);
				return null;
			}
			
			//meta tag the organisation
			String type = group.getType();
			if(type != null && !type.isEmpty())
			{
				organisation.metaTag(type);
			}
			
			organisation.metaTag(MendeleyTags.MENDELEY);
			organisation.metaTag(MendeleyTags.MENDELEY_GROUP);
			organisation.metaTag(MendeleyTags.MENDELEY_USERS_GROUP);
		}
		
		// switch if group members should be created
		if(source.getConfiguration().isPropertyTrueElseDefault(MendeleyProperties.CREATE_GROUP_MEMBERS_PROPERTY, MendeleyProperties.CREATE_GROUP_MEMBERS_DEFAULT)) {
			// create persons in group
			MendeleyGroupMembersContainer people = null; 
			try {
				people = mendeleyApi.getUsersGroupMembers(group.getId());
			}
			catch (Exception e) {
				source.log("Could not get group members for group " + groupName + " due to " + e.getMessage(), LogService.LOG_WARNING);
				return organisation;	
			}


			MendeleyGroupMember owner = people.getOwner();
			if(owner != null){

				// there is one owner so set him as organisation leader
				Person ownerPerson = createPerson(owner);
				source.log("Created leader " + ownerPerson.getName() + " of " + group.getName() + " from " + owner, LogService.LOG_DEBUG);
				if(organisation != null && ownerPerson != null)
				{
					organisation.setLeader(ownerPerson);
					// connect to keep role
					organisation.connectToWithMetaTag(ownerPerson, MendeleyTags.GROUP_OWNER_CONNECTION);
				}
			}

			List<MendeleyGroupMember> members = people.getMembers();
			for(MendeleyGroupMember member : members)
			{
				Person memberPerson = createPerson(member);
				source.log("Created member " + memberPerson.getName() + " of " + group.getName() + " from " + member, LogService.LOG_DEBUG);
				if(organisation != null && memberPerson != null && !organisation.getParticipants().contains(member) && organisation.getLeader() != memberPerson)
				{
					organisation.getParticipants().add(memberPerson);
					// connect to keep role
					organisation.connectToWithMetaTag(memberPerson, MendeleyTags.GROUP_MEMBER_CONNECTION);
				}
			}

			List<MendeleyGroupMember> admins = people.getAdmins();
			for(MendeleyGroupMember admin : admins)
			{
				Person adminPerson = createPerson(admin);
				source.log("Created admin " + adminPerson.getName() + " of " + group.getName() + " from " + admin, LogService.LOG_DEBUG);
				if(organisation != null && adminPerson != null && !organisation.getParticipants().contains(admin) && organisation.getLeader() != adminPerson)
				{
					organisation.getParticipants().add(adminPerson);
					// connect to keep role
					organisation.connectToWithMetaTag(adminPerson, MendeleyTags.GROUP_ADMIN_CONNECTION);
				}
			}
		}
		
		if(source.getConfiguration().isPropertyTrue(MendeleyProperties.ADD_GROUP_DOCUMENTS_PROPERTY))
		{
			MendeleyGroupDocumentsPage documents = mendeleyApi.getGroupDocuments(group.getId());
			
			if(documents != null) {
				source.log("Got " + documents.getDocument_ids().size() + " documents for group " + groupName, LogService.LOG_DEBUG);
				
				for(String docId : documents.getDocument_ids()) {
					// fetch details for every group document and create it
					createDocument(mendeleyApi.getGroupDocumentDetails(docId, group.getId()), group.getId());
				}
			}
		}
		
		return organisation;
	}

	public Organisation createPublicGroup(MendeleyPublicGroupDetails group) {
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
		
		Organisation organisation = null;
		
		if(source.getConfiguration().isPropertyTrueElseDefault(MendeleyProperties.CREATE_GROUP_ORGANISATIONS_PROPERTY, MendeleyProperties.CREATE_GROUP_ORGANISATIONS_DEFAULT))
		{
			// create new organisation as mapping for a group
			organisation = factory.createOrganisation();
			
			organisation.setName(groupName);
			
			organisation = source.add(organisation, group.getId());
			
			if(organisation == null)
			{
				source.log("Could not add organisation for group " + groupName, LogService.LOG_WARNING);
				return null;
			}
			
			//meta tag the organisation
			organisation.metaTag(MendeleyTags.MENDELEY);
			organisation.metaTag(MendeleyTags.MENDELEY_GROUP);
			organisation.metaTag(MendeleyTags.MENDELEY_PUBLIC_GROUP);
			
			// add group tags to organisation
			if(group.getTags() != null) {
				for(String tag : group.getTags()) {
					organisation.tag(tag);
				}
			}
		}
		
		// switch if group members should be created
		if(source.getConfiguration().isPropertyTrueElseDefault(MendeleyProperties.CREATE_GROUP_MEMBERS_PROPERTY, MendeleyProperties.CREATE_GROUP_MEMBERS_DEFAULT))
		{
		
			// create persons in group
			MendeleyGroupMembersContainer people = null; 
			try {
				people = mendeleyApi.getPublicGroupMembers(group.getId());
			}
			catch (Exception e) {
				source.log("Could not get group members for public group " + groupName + " due to " + e.getMessage(), LogService.LOG_WARNING);
				return organisation;	
			}
			
			
			MendeleyGroupMember owner = people.getOwner();
			if(owner != null){
				
				// there is one owner so set him as organisation leader
				Person ownerPerson = createPerson(owner);
				source.log("Created leader " + ownerPerson.getName() + " of " + group.getName() + " from " + owner, LogService.LOG_DEBUG);
				if(organisation != null && ownerPerson != null)
				{
					organisation.setLeader(ownerPerson);
					// connect to keep role
					organisation.connectToWithMetaTag(ownerPerson, MendeleyTags.GROUP_OWNER_CONNECTION);
				}
			}
			
			List<MendeleyGroupMember> members = people.getMembers();
			for(MendeleyGroupMember member : members)
			{
				Person memberPerson = createPerson(member);
				source.log("Created member " + memberPerson.getName() + " of " + group.getName() + " from " + member, LogService.LOG_DEBUG);
				if(organisation != null && memberPerson != null && !organisation.getParticipants().contains(member) && organisation.getLeader() != memberPerson)
				{
					organisation.getParticipants().add(memberPerson);
					// connect to keep role
					organisation.connectToWithMetaTag(memberPerson, MendeleyTags.GROUP_MEMBER_CONNECTION);
				}
			}
			
			List<MendeleyGroupMember> admins = people.getAdmins();
			for(MendeleyGroupMember admin : admins)
			{
				Person adminPerson = createPerson(admin);
				source.log("Created admin " + adminPerson.getName() + " of " + group.getName() + " from " + admin, LogService.LOG_DEBUG);
				if(organisation != null && adminPerson != null && !organisation.getParticipants().contains(admin) && organisation.getLeader() != adminPerson)
				{
					organisation.getParticipants().add(adminPerson);
					// connect to keep role
					organisation.connectToWithMetaTag(adminPerson, MendeleyTags.GROUP_ADMIN_CONNECTION);
				}
			}
		}
		
		if(source.getConfiguration().isPropertyTrue(MendeleyProperties.ADD_GROUP_DOCUMENTS_PROPERTY))
		{
			MendeleyPublicGroupWithDocumentDetailsPage groupDocuments = mendeleyApi.getPublicGroupWithDocumentDetails(group.getId());
			
			if(groupDocuments != null && groupDocuments.getDocuments() != null) {
				source.log("Got " + groupDocuments.getDocuments().size() + " documents for group " + groupName, LogService.LOG_DEBUG);
				
				for(MendeleyDocumentDetails document : groupDocuments.getDocuments()) {
					createDocument(document);
				}
			}
		}
		
		return organisation;
	}
}
