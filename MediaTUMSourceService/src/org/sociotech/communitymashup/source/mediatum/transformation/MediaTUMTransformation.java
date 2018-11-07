/*******************************************************************************
 * Copyright (c) 2015 Michael Koch - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Koch - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.mediatum.transformation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.EList;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.Document;
import org.sociotech.communitymashup.data.Email;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.WebSite;
import org.sociotech.communitymashup.source.mediatum.MediaTUMSourceService;
import org.sociotech.communitymashup.source.mediatum.apiwrapper.MediaTUMAPIWrapper;
import org.sociotech.communitymashup.source.mediatum.apiwrapper.items.Node;
import org.sociotech.communitymashup.source.mediatum.meta.MediaTUMTags;
import org.sociotech.communitymashup.source.mediatum.properties.MediaTUMProperties;

/**
 * Transforms results from the MediaTUM api wrapper into CommunityMashup objects.
 * 
 * @author Michael Koch
 *
 */
public class MediaTUMTransformation {

	/**
	 * Reference to the MediaTUM source service, used e. g. for logging 
	 */
	private MediaTUMSourceService source = null;
	
	/**
	 * Factory for creating new CommunityMashup objects
	 */
	private DataFactory factory = DataFactory.eINSTANCE;
	
	/**
	 * Reference to the MediaTUM api to possible get additional information 
	 */
	private MediaTUMAPIWrapper api = null;
	
	/**
	 * Creates a new MediaTUM transformation.
	 * 
	 * @param source Source service used for logging and data adding
	 * @param api Reference to the api wrapper
	 */
	public MediaTUMTransformation(MediaTUMSourceService source, MediaTUMAPIWrapper api) {
		this.source = source;
		this.api = api;
	}

	
	/**
	 * Transform Objects to CommunityMashup objects
	 * 
	 * @param list List of all objects to transform in CommunityMashup objects
	 * 
	 * if configuration says to create author/editor then will create
	 */
	public void transformAndAddObjects(List<Node> list) {
		transformAndAddObjects(list, null);
	}
		
	/**
	 * Transform Objects to CommunityMashup objects
	 * 
	 * @param list List of all objects to transform in CommunityMashup objects
	 * @param lastUpdated Date of last update (so only recently updated objects are added)
	 * 
	 * if configuration says to create author/editor then will create
	 */
	public void transformAndAddObjects(List<Node> list, Date lastUpdated) {
		
		List<Node> objects = (List<Node>)(api.getAllObjects());
		
		// get filter from properties
		String minYear = source.getConfiguration().getPropertyValueElseDefault(MediaTUMProperties.MIN_YEAR_PROPERTY, MediaTUMProperties.MIN_YEAR_DEFAULT);
		int minYearInt = 0;
		try {
			minYearInt = Integer.parseInt(minYear);
		} catch(Exception e)  { }
		
		// go through all objects retrieved from MediaTUM
		for (Node node: objects){
		
			// check lastUpdated
			if (lastUpdated != null) {
				long tmpl = node.getUpdateTime();
				if (tmpl > 0L) {
					if (tmpl < lastUpdated.getTime()) {
						continue;
					}
				}
			}
			
			int year = 0;
			Date tmpdate = getDate(node);
			if (tmpdate != null) {
				Calendar cal = new GregorianCalendar();
				cal.setTime(tmpdate);
				year = cal.get(Calendar.YEAR);
			} else if (minYearInt > 0) continue;
			
			// check filter
			if (minYearInt>0 && year < minYearInt) continue;
			
			// call the factory to create a new object
			Content temp = factory.createContent();
			
			Content tmpval = temp;
			temp = source.add(temp, "mediatum-"+node.getId());

			if (temp == null) {
				source.log("Could not add document to source", LogService.LOG_WARNING);
				return;
			}
			if (temp == tmpval) {
				source.log("created new Content object "+temp.getIdent(), LogService.LOG_INFO);
			} else {
				source.log("Content object merged "+temp.getIdent(), LogService.LOG_INFO);				
			}
			
			temp.metaTag(MediaTUMTags.MEDIATUM);			
			
			// check type (publication or project)
			boolean isPub = true;
			String tmps = node.getAttribute("project-title");
			if (tmps!=null && tmps.length()>0) {
				isPub = false;
				temp.metaTag(MediaTUMTags.PROJECT);
			} else {
				tmps = node.getAttribute("title");
				if (tmps==null || tmps.length()<1) {
					continue;
				}
				temp.metaTag(MediaTUMTags.PUBLICATION);
			}
			
			//set the title
			if (isPub) {
				temp.setName(node.getAttribute("title"));
			} else {
				temp.setName(node.getAttribute("project-title"));
			}			
			
			//set the full reference and abstract
			String tmpa = "";
			if (isPub) {
				tmpa = getFullReferencePublication(node);
			} else {
				tmpa = getFullReferenceProject(node);
			}
			if (isPub) {
				if (node.getAttribute("abstract") != null){
					tmpa += "\n\n"+node.getAttribute("abstract");
				}
			} else {
				if (node.getAttribute("project-abstract") != null) {
					tmpa += "\n\n"+node.getAttribute("project-abstract");
				}
			}
			temp.setStringValue(tmpa);
			
			//set created date
			tmpdate = getDate(node);
			if (tmpdate != null) {
				temp.setCreated(tmpdate);
			}			
		    
			//set the tags from given mendeley-tags (yes, there is such an attribute in MediaTUM ....)
		    if (node.getAttribute("mendeley-tags") != null){
		    	for(String tag: node.getAttribute("mendeley-tags").split(";")){
		    		tag = tag.trim();
		    		tag = tag.toLowerCase();
		    		temp.tag(tag);
		    	}
		    }
		    
		    //set the tags from given keywords
		    if (node.getAttribute("keywords") != null){
		    	for(String tag: node.getAttribute("keywords").split(";")){
		    		tag = tag.trim();
		    		tag = tag.toLowerCase();
		    		temp.tag(tag);
		    	}
		    }
		    
		    //set the type
		    if (node.getAttribute("typ") != null){
		    	temp.metaTag(node.getAttribute("typ"));
		    }
		    
		    //set the external funding body as tag
		    if (node.getAttribute("external-funds") != null){
		    	temp.tag(node.getAttribute("external-funds"));
		    }
		    
		    //set the url
		    if (node.getAttribute("url_full") != null){
		    	temp.addWebSite(node.getAttribute("url_full"));
		    }
		    
		    //add the file
		    if (node.getAttribute("file") != null){
		    	temp.attachDocument(node.getAttribute("file"));
		
		    }
		    
		    //set the authors - usually only for publications
		    if (node.getAttribute("authors") != null){
		    	boolean first = true;
				for(String author: node.getAttribute("authors").split(";")){
					author = author.trim();
					String[] authorarray = author.split(", ");
					if (shouldCreateAuthors()) {
						Person pauthor = createPerson((authorarray.length > 1 ? authorarray[1]: ""), authorarray[0], new Date());
						if (first) temp.setAuthor(pauthor);
						else temp.addContributor(pauthor);
						first = false;
					} else {
						// first check if person object already exists ...
						String tmpname = (authorarray.length > 1 ? authorarray[1] + " ": "") + authorarray[0];
						EList<Person> pauthors = source.getDataSet().getPersonsWithName(tmpname);
						if (pauthors!=null && pauthors.size()>0) {
							Person pauthor = createPerson((authorarray.length > 1 ? authorarray[1]: ""), authorarray[0], new Date());
							if (first) temp.setAuthor(pauthor);
							else temp.addContributor(pauthor);
							first = false;
						}
					}
				}
		    }
		    
		    //set the editors - usually only for publications
		    if (node.getAttribute("editors") != null){
		    	for(String editor: node.getAttribute("editors").split(";")){
		    		editor = editor.trim();
		    		String[] editorarray = editor.split(", ");
		    		if (shouldCreateEditors()) {
		    			Person peditor = createPerson((editorarray.length > 1 ? editorarray[1]: ""), editorarray[0], new Date());
		    			temp.addContributor(peditor);
		    		} else {
		    			// first check if person object already exists ...
		    			String tmpname = (editorarray.length > 1 ? editorarray[1] + " ": "") + editorarray[0];
		    			EList<Person> pauthors = source.getDataSet().getPersonsWithName(tmpname);
		    			if (pauthors!=null && pauthors.size()>0) {
		    				Person peditor = createPerson((editorarray.length > 1 ? editorarray[1]: ""), editorarray[0], new Date());
			    			temp.addContributor(peditor);
		    			}
		    		}
		    		
		     	}
		    }
		    
		    //set project coordinators
		    // - fist check for attribute "head" - if not defined, check for "name1","name2"
		    if (!isPub) {
			    if (node.getAttribute("head") != null) {
			    	// format: Prof. Vorname Nachname, Prof. Vorname Nachname
			    	StringTokenizer st = new StringTokenizer(node.getAttribute("head"), ",;");
			    	while (st.hasMoreTokens()) {
			    		tmps = st.nextToken(); tmps = tmps.trim();
			    		if (tmps.startsWith("Prof. ")) {
			    			tmps = tmps.substring(6);
			    			String[] names = tmps.split(" ");
			    			String lastname = names[1];
			    			String firstname = names[0];
			    			if (shouldCreateAuthors()) {
								Person pauthor = createPerson(firstname, lastname, new Date());
								temp.addContributor(pauthor);
							} else {
								// first check if person object already exists ...
								String tmpname = firstname + " " + lastname;
								EList<Person> pauthors = source.getDataSet().getPersonsWithName(tmpname);
								if (pauthors!=null && pauthors.size()>0) {
									Person pauthor = createPerson(firstname, lastname, new Date());
									temp.addContributor(pauthor);
								}
							}
			    		}
			    	}
			    	
			    } else {
			    	tmps = node.getAttribute("name1");
			    	if (tmps!=null && tmps.length()>0) {
			    		String lastname = tmps;
			    		String firstname = node.getAttribute("firstname1");
			    		if (firstname==null || firstname.length()<1) {
			    			firstname = node.getAttribute("Vorname1");
			    		}
						if (shouldCreateAuthors()) {
							Person pauthor = createPerson(firstname, lastname, new Date());
							temp.addContributor(pauthor);
						} else {
							// first check if person object already exists ...
							String tmpname = firstname + " " + lastname;
							EList<Person> pauthors = source.getDataSet().getPersonsWithName(tmpname);
							if (pauthors!=null && pauthors.size()>0) {
								Person pauthor = createPerson((firstname.length() > 1 ? firstname: ""), lastname, new Date());
								temp.addContributor(pauthor);
							}
						}
			    	}
			    	tmps = node.getAttribute("name2");
			    	if (tmps!=null && tmps.length()>0) {
			    		String lastname = tmps;
			    		String firstname = node.getAttribute("firstname2");
			    		if (firstname==null || firstname.length()<1) {
			    			firstname = node.getAttribute("Vorname2");
			    		}
						if (shouldCreateAuthors()) {
							Person pauthor = createPerson(firstname, lastname, new Date());
							temp.addContributor(pauthor);
						} else {
							// first check if person object already exists ...
							String tmpname = firstname + " " + lastname;
							EList<Person> pauthors = source.getDataSet().getPersonsWithName(tmpname);
							if (pauthors!=null && pauthors.size()>0) {
								Person pauthor = createPerson((firstname.length() > 1 ? firstname: ""), lastname, new Date());
								temp.addContributor(pauthor);
							}
						}
			    	}
			    }
		    }
		    
		    //set link to organisation
		    String department = node.getAttribute("department01"); // for projects
		    if (department == null) {
		    	department = node.getAttribute("department"); // for publications
		    }
		    
		    String chair = node.getAttribute("chair"); // for publications
		    
		    String institute = node.getAttribute("institute01"); // for projects
		    if (institute == null || institute.length()<1) {
		    	institute = node.getAttribute("dep_inst"); // for publications
		    }
		    
		    if (shouldAddInstituteAsTag()) {
		    	if (institute != null && institute.length()>5) {
		    		String[] institutearr = institute.split(";");
		    		for (String iname : institutearr) {
		    			iname = iname.trim();
		    			String prefix = iname.substring(0, 6);
		    			prefix = prefix.replaceAll("\\s","");
		    			prefix = prefix.toLowerCase();
		    			temp.tag(prefix);
		    		}
		    	}
		    }
		    if (shouldAddOrganizations()) {
		    	// create department object?
		    	String[] departmentarr = null;
		    	Organisation[] departmentobj = null;
		    	if (department != null) {
		    		departmentarr = department.split(";");
		    		departmentobj = new Organisation[departmentarr.length];
		    		for (int i=0; i<departmentarr.length; i++) {
		    			String dname = departmentarr[i];
		    			if (dname !=null) dname = dname.trim();
		    			if (dname == null || dname.length()<1) continue;
		    			Organisation tmporg = factory.createOrganisation();
		    			tmporg.setName(dname);
		    			departmentobj[i] = source.add(tmporg);
		    		}
		    	}
		    	// create institute object?
		    	String[] institutearr = null;
		    	Organisation[] instituteobj = null;
		    	if (institute != null) {
		    		institutearr = institute.split(";");
		    		instituteobj = new Organisation[institutearr.length];
		    		for (int i=0; i<institutearr.length; i++) {
		    			String iname = institutearr[i];
		    			if (iname !=null) iname = iname.trim();
		    			if (iname == null || iname.length()<1) continue;
		    			Organisation tmporg = factory.createOrganisation();
		    			tmporg.setName(iname);
		    			instituteobj[i] = source.add(tmporg);
		    		}
		    		// parent organisation only if there is only one department!
		    		if (departmentobj != null && departmentobj[0]!=null && departmentarr.length<2) {
		    			for (int i=0; i<institutearr.length; i++) {
		    				if (instituteobj[i]!=null)
		    					instituteobj[i].setParentOrganisation(departmentobj[0]);
		    			}
		    		}
		    	}		    	
		    	// create chair object?
		    	String[] chairarr = null;
		    	Organisation[] chairobj = null;
		    	if (chair != null) {
		    		chairarr = chair.split(";");
		    		chairobj = new Organisation[chairarr.length];
		    		for (int i=0; i<chairarr.length; i++) {
		    			String cname = chairarr[i];
		    			if (cname !=null) cname = cname.trim();
		    			if (cname == null || cname.length()<1) continue;
		    			Organisation tmporg = factory.createOrganisation();
		    			tmporg.setName(cname);
		    			chairobj[i] = source.add(tmporg);
		    		}
		    		// parent organisation only if there is only one institute!
		    		if (instituteobj != null && instituteobj[0]!=null && institutearr.length<2) {
		    			for (int i=0; i<chairarr.length; i++) {
		    				if (chairobj[i]!=null)
		    					chairobj[i].setParentOrganisation(instituteobj[0]);
		    			}
		    		}
		    		// if it is only one chair organization - then add authors as participants to organization
		    		if (chairarr.length < 2) {
		    			if (node.getAttribute("authors") != null){
		    				for(String author: node.getAttribute("authors").split(";")){
		    					author = author.trim();
		    					String[] authorarray = author.split(", ");
		    					Person pauthor = createPerson((authorarray.length > 1 ? authorarray[1]: ""), authorarray[0], new Date());
		    					if (pauthor != null && chairobj[0]!=null) {
		    						chairobj[0].addParticipant(pauthor);
		    					}
		    				}
		    			}
		    		}
		    	}
		    	// add lowest organization to content object
		    	if (chairarr != null) {
		    		for (Organisation tmporg : chairobj) {
		    			temp.connectToWithMetaTag(tmporg, "organization");
		    		}
		    	} else if (institutearr != null) {
		    		for (Organisation tmporg : instituteobj) {
		    			temp.connectToWithMetaTag(tmporg, "organization");
		    		}
		    	} else if (departmentarr != null) {
		    		for (Organisation tmporg : departmentobj) {
		    			temp.connectToWithMetaTag(tmporg, "organization");
		    		}
		    	}
		    }
		    
		}
	}
	
	/**
	 * Build a String for the full reference from the publications attributes
	 * 
	 * @param node
	 * @return
	 */
	private String getFullReferencePublication(Node node) {
		// MediaTUM stores a full reference in the default mask ...
		String tmpa = node.getDefaultMask();
		tmpa = tmpa.replace("<br/>", "");
		tmpa = tmpa.replace("<b>Autor(en):</b> ","");
		tmpa = tmpa.replace("<b>Titel:</b> ","");
		tmpa = tmpa.replace("<b>Jahr:</b> ","");
		tmpa = tmpa.replace("<b>Vortrag bei:</b> ",""); 
		tmpa = tmpa.replace("<b>Zeitschrift:</b> ",""); 		
		tmpa = tmpa.replace("<b>Titel Konferenzpublikation:</b> ","");
		tmpa = tmpa.replace("<b>Titel Sammlung:</b> ","");
		tmpa = tmpa.replace("<b>Verlagsort:</b> ","");
		tmpa = tmpa.replace("<b>Verlag:</b> ","");
		tmpa = tmpa.replace("<b>Heft:</b> ","");
		tmpa = tmpa.replace("<b>Band:</b> ","");
		tmpa = tmpa.replace("<b>Seiten:</b> . - ",". "); 
		tmpa = tmpa.replaceAll("\\<.*?>",""); // remove all html
		return tmpa;
	}
	
	/**
	 * Build a String for the full reference from the project attributes
	 * 
	 * @param node
	 * @return
	 */
	private String getFullReferenceProject(Node node) {
		// MediaTUM stores a full reference in the default mask ...
		String tmpa = node.getDefaultMask();
		tmpa = tmpa.replace("<br/>", "");
		tmpa = tmpa.replace("<b>Titel:</b> ","");
		tmpa = tmpa.replace("<b>Titel2:</b> ","");
		tmpa = tmpa.replace("<b>Vorname:</b> ","");
		tmpa = tmpa.replace("<b>Vorname2:</b> ","");
		tmpa = tmpa.replace("<b>Name:</b> ","");
		tmpa = tmpa.replace("<b>Name2:</b> ","");
		tmpa = tmpa.replace("<b>Projektbezeichnung:</b> ","");
		tmpa = tmpa.replace("<b>Projektbeginn:</b> ","");
		tmpa = tmpa.replace("<b>Projektende:</b> ","");
		tmpa = tmpa.replaceAll("\\<.*?>",""); // remove all html
		return tmpa;
	}
	
	/**
	 * Get the publication/start date for a publication/project
	 */
	private Date getDate(Node node) {
		Date date = null;
		String tmps = node.getAttribute("proj-beginn"); // or use "proj-end"?
		if (tmps == null || tmps.length()<1) {
			if (node.getAttribute("year") == null || node.getAttribute("year").split("-").length < 2) return null;
			// return January 1st ...
			int year = Integer.valueOf(node.getAttribute("year").split("-")[0]);
			Calendar tmpcal = new GregorianCalendar(year, Calendar.JANUARY, 1);
			Date tmpdate = tmpcal.getTime();
			return tmpdate;
		}
		if (tmps!=null && tmps.length()>0) {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); // 2015-01-01T00:00:00
			try {
				date = format.parse(tmps);		
			} catch (Exception e) {
			}
		} else {
			// default: use attribute "creationtime"
			tmps = node.getAttribute("creationtime");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); // 2015-01-01T00:00:00
			try {
				date = format.parse(tmps);
			} catch (Exception e) {
			}
		}
		return date;
	}
	
	/**
	 * Determines from the configuration if persons should be created for authors.
	 * 
	 * @return True if they should be created.
	 */
	private boolean shouldCreateAuthors() {
		if(source.getConfiguration().isPropertyTrue(MediaTUMProperties.CREATE_AUTHOR_PERSONS_PROPERTY))
		{
			return true;
		}
		
		if(source.getConfiguration().getProperty(MediaTUMProperties.CREATE_AUTHOR_PERSONS_PROPERTY) == null)
		{
			return new Boolean(MediaTUMProperties.CREATE_AUTHOR_PERSONS_DEFAULT);
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
			source.log("Could not add person for author " + firstname + lastname, LogService.LOG_DEBUG);
			return null;
		}
		
		// tag the person
		person.metaTag(MediaTUMTags.MEDIATUM);
		
		return person;
	}
	
	
	/**
	 * Determines from the configuration if persons should be created for editors.
	 * 
	 * @return True if they should be created.
	 */
	private boolean shouldCreateEditors() {
		if(source.getConfiguration().isPropertyTrue(MediaTUMProperties.CREATE_EDITOR_PERSONS_PROPERTY))
		{
			return true;
		}
		
		if(source.getConfiguration().getProperty(MediaTUMProperties.CREATE_EDITOR_PERSONS_PROPERTY) == null)
		{
			return new Boolean(MediaTUMProperties.CREATE_EDITOR_PERSONS_DEFAULT);
		}
		
		return false;
	}
	
	
	private boolean shouldAddInstituteAsTag() {
		if(source.getConfiguration().isPropertyTrue(MediaTUMProperties.ADD_INSTITUTE_AS_TAG_PROPERTY))	{
			return true;
		}
		
		if(source.getConfiguration().getProperty(MediaTUMProperties.ADD_INSTITUTE_AS_TAG_PROPERTY) == null) {
			return new Boolean(MediaTUMProperties.ADD_INSTITUTE_AS_TAG_DEFAULT);
		}
		return false;
	}

    private boolean shouldAddOrganizations() {
		if(source.getConfiguration().isPropertyTrue(MediaTUMProperties.ADD_ORGANIZATIONS_PROPERTY))	{
			return true;
		}
		
		if(source.getConfiguration().getProperty(MediaTUMProperties.ADD_ORGANIZATIONS_PROPERTY) == null) {
			return new Boolean(MediaTUMProperties.ADD_ORGANIZATIONS_DEFAULT);
		}
		return false;
    }

}
