package org.sociotech.communitymashup.source.excelinformation;

import java.util.List;

import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.source.excelinformation.loader.ExcelInformationLoader;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelContent;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelMetaTag;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelOrganization;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelPerson;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelConnection;
import org.sociotech.communitymashup.source.excelinformation.properties.ExcelInformationProperties;
import org.sociotech.communitymashup.source.excelinformation.transform.ExcelInformationTransformation;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;

/**
 * Source service to load information from an excel file.
 * 
 * @author Peter Lachenmaier
 */
public class ExcelInformationSourceService extends SourceServiceFacadeImpl {

	/**
	 * The loader for data from external excel file.
	 */
	private ExcelInformationLoader informationLoader;

	/**
	 * The transformation from excel specific to CommunityMashup specific.
	 */
	private ExcelInformationTransformation transformation;
	
	/**
	 * The last modified date for the external excel file.
	 */
	private Long lastModified = null;
	
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#initialize(org.sociotech.communitymashup.application.Source)
	 */
	@Override
	public boolean initialize(Source configuration) {

		boolean initialized = super.initialize(configuration);

		if(initialized) {
			// get file url from configuration
			String fileUrl = configuration.getPropertyValue(ExcelInformationProperties.FILE_URL_PROPERTY);

			if (fileUrl == null || fileUrl.isEmpty()) {
				log("No file url specified, use "
						+ ExcelInformationProperties.FILE_URL_PROPERTY
						+ " to specify an url of an excel file in the configuration",
						LogService.LOG_ERROR);
				return false;
			}

			// create information loader
			informationLoader = new ExcelInformationLoader(this, fileUrl);
			// create transfomation
			transformation = new ExcelInformationTransformation(this);
		}

		return isInitialized();
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#fillDataSet(org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public void fillDataSet(DataSet dataSet) {
		super.fillDataSet(dataSet);
		try {	
			loadAndAddOrganisations();
			loadAndAddContents();
			loadAndAddPersons();
			loadAndAddConnections();
			loadAndAddMetaTags();
		} catch (Exception e) {
			log("Failed in fillDataSet: "+e.getMessage()+", "+e.getStackTrace()[0].toString(), LogService.LOG_ERROR);
		}
		lastModified = informationLoader.getLastModified();
	}

	/**
	 * Loads all organisations from the excel file and transforms them. Processes only if it is switched on in the configuration
	 */
	private void loadAndAddOrganisations() {
		if(source.isPropertyTrueElseDefault(ExcelInformationProperties.USE_ORGANISATIONS_PROPERTY, ExcelInformationProperties.USE_ORGANISATIONS_DEFAULT)) {
			log("Loading organisation information from excel file: " + source.getPropertyValue(ExcelInformationProperties.FILE_URL_PROPERTY), LogService.LOG_DEBUG);
			// load all organizations
			List<ExcelOrganization> orgs = informationLoader.loadOrganizations();
			
			// transform and add every organisation
			if(orgs != null) {
				log("Got " + orgs.size() + " organizations", LogService.LOG_DEBUG);
				
				for(ExcelOrganization org : orgs)
					transformation.transformAndAddOrganization(org);
			}

		}
	}

	/**
	 * Loads all persons from the excel file and transforms them. Processes only if it is switched on in the configuration
	 */
	private void loadAndAddPersons() {
		if(source.isPropertyTrueElseDefault(ExcelInformationProperties.USE_PERSONS_PROPERTY, ExcelInformationProperties.USE_PERSONS_DEFAULT)) {
			log("Loading persons information from excel file: " + source.getPropertyValue(ExcelInformationProperties.FILE_URL_PROPERTY), LogService.LOG_DEBUG);
			// load all persons
			List<ExcelPerson> persons = informationLoader.loadPersons();
			
			// transform and add every person
			if(persons != null) {
				log("Got " + persons.size() + " persons", LogService.LOG_DEBUG);
				
				for(ExcelPerson person : persons)
					transformation.transformAndAddPerson(person);
			}

		}
	}
	
	/**
	 * Loads all contents from the excel file and transforms them. Processes only if it is switched on in the configuration
	 */
	private void loadAndAddContents() {
		if(source.isPropertyTrueElseDefault(ExcelInformationProperties.USE_CONTENTS_PROPERTY, ExcelInformationProperties.USE_CONTENTS_DEFAULT)) {
			log("Loading content information from excel file: " + source.getPropertyValue(ExcelInformationProperties.FILE_URL_PROPERTY), LogService.LOG_DEBUG);
			// load all contents
			List<ExcelContent> contents = informationLoader.loadContents();
			
			// transform and add every content
			if(contents != null) {
				log("Got " + contents.size() + " contents", LogService.LOG_DEBUG);
				
				for(ExcelContent content : contents)
					transformation.transformAndAddContent(content);
			}

		}
	}
	
	/**
	 * Loads all connections from the excel file and transforms them. Processes only if it is switched on in the configuration
	 */
	private void loadAndAddConnections() {
		if(source.isPropertyTrueElseDefault(ExcelInformationProperties.USE_CONNECTIONS_PROPERTY, ExcelInformationProperties.USE_CONNECTIONS_DEFAULT)) {
			log("Loading connection information from excel file: " + source.getPropertyValue(ExcelInformationProperties.FILE_URL_PROPERTY), LogService.LOG_DEBUG);
			// load all connections
			List<ExcelConnection> connections = informationLoader.loadConnections();
			
			// transform and add every content
			if(connections != null) {
				log("Got " + connections.size() + " connections", LogService.LOG_DEBUG);
				
				for(ExcelConnection connection : connections)
					transformation.transformAndAddConnection(connection);
			}

		}
	}
	
	/**
	 * Loads all meta tags from the excel file and transforms them. Processes only if it is switched on in the configuration
	 */
	private void loadAndAddMetaTags() {
		if(source.isPropertyTrueElseDefault(ExcelInformationProperties.USE_METATAGS_PROPERTY, ExcelInformationProperties.USE_METATAGS_DEFAULT)) {
			log("Loading meta tag information from excel file: " + source.getPropertyValue(ExcelInformationProperties.FILE_URL_PROPERTY), LogService.LOG_DEBUG);
			// load all connections
			List<ExcelMetaTag> metatags = informationLoader.loadMetaTags();
			
			// transform and add every content
			if(metatags != null) {
				log("Got " + metatags.size() + " meta tags", LogService.LOG_DEBUG);
				
				for(ExcelMetaTag metatag : metatags)
					transformation.transformAndAddMetaTag(metatag);
			}

		}
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#updateDataSet()
	 */
	@Override
	protected void updateDataSet() {
		super.updateDataSet();
		
		try {
			// check if source file was modified
			Long lastModifiedNew = informationLoader.getLastModified();
			log("Check lastModified "+lastModifiedNew+" vs "+lastModified, LogService.LOG_DEBUG);
			if (lastModifiedNew <= lastModified) {
				return;
			}
		
			lastModified = lastModifiedNew;

			// currently the same as fill
			loadAndAddOrganisations();
			loadAndAddContents();
			loadAndAddPersons();
			loadAndAddConnections();
			loadAndAddMetaTags();

		} catch (Exception e) {
			log("Failed in updateDataSet: "+e.getMessage()+", "+e.getStackTrace()[0].toString(), LogService.LOG_ERROR);
		}
		
	}
}
