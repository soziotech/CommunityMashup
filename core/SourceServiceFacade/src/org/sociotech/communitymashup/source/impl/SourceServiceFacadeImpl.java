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
/**
 * 
 */
package org.sociotech.communitymashup.source.impl;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.jsoup.Jsoup;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.application.SourceActiveStates;
import org.sociotech.communitymashup.application.SourceState;
import org.sociotech.communitymashup.data.Category;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Extension;
import org.sociotech.communitymashup.data.Identifier;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.IndoorLocation;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.data.Location;
import org.sociotech.communitymashup.data.MetaTag;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.Tag;
import org.sociotech.communitymashup.source.facade.AsynchronousSourceInitialization;
import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.properties.SourceServiceProperties;

/**
 * Implementation of methods needed by all Source services.
 * 
 * @author Peter Lachenmaier
 * 
 */
public abstract class SourceServiceFacadeImpl implements SourceServiceFacade {

	private static final String DEFAULT_CONFIGURATION_PATH = "/configuration/configuration.xml";
	private static final String HASHTAG_REGEX = "[##]+([A-Za-z0-9-_]+)";
	
	private static final String NON_HTML_AND_REGEX = "&(?!([\\w\\n]{2,7}|#[\\d]{1,4});)";
	
	/**
	 * Regex for invalid xml characters from http://stackoverflow.com/questions/4237625/removing-invalid-xml-characters-from-a-string-in-java 
	 */
	private static final String INVALID_XML_CHARACTERS_REGEX = "[^" + "\u0001-\uD7FF"
																	+ "\uE000-\uFFFD"
															 + "]+";
																
	
	private static final Pattern TAG_PATTERN = 
			Pattern.compile(HASHTAG_REGEX);

	// TODO: configurations should be managed by the mashup service
	private static final String configurationFileNamePrefix = "source_configuration_";

	private boolean initialized = false;
	protected Source source;

	private boolean cachingEnabled = true;
	private Resource cachingResource;

	private boolean saveConfigurationEnabled = true;

	private LogService logService;

	private boolean cachingInitialized = false;

	/**
	 * Locally stored log level
	 * TODO: get default value from Source
	 */
	protected int logLevel = LogService.LOG_DEBUG;
	/**
	 * MetaTag for all items added by this source 
	 */
	private MetaTag sourceInstanceMetaTag;
	
	/**
	 * Wait that number of tries for the source service to be in the state for update.
	 */
	private static int UPDATE_TRY_COUNT = 5;
	/**
	 * Wait that number of tries for the source service to be in the state for enriching.
	 */
	private static int ENRICH_TRY_COUNT = 5;
	private static long WAITING_INTERVALL = 500;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sociotech.communitymashup.source.SourceServiceFacade#initialize()
	 */
	@Override
	public boolean initialize() {
		// initialize without log service
		// TODO: do initialization in this method, will be overwritten by real
		// source services
		return initialize(null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sociotech.communitymashup.source.facade.SourceServiceFacade#initialize
	 * (org.sociotech.communitymashup.application.Source)
	 */
	public boolean initialize(Source configuration) {
		// initialize without log service
		return initialize(null, configuration);
	}

	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.facade.SourceServiceFacade#initializeAsynchronous(org.sociotech.communitymashup.source.facade.AsynchronousSourceInitialization)
	 */
	@Override
	public void initializeAsynchronous(AsynchronousSourceInitialization initializer) {
		this.initializeAsynchronous(null, initializer);
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.facade.SourceServiceFacade#initializeAsynchronous(org.sociotech.communitymashup.application.Source, org.sociotech.communitymashup.source.facade.AsynchronousSourceInitialization)
	 */
	@Override
	public void initializeAsynchronous(Source configuration, AsynchronousSourceInitialization initializer) {
		
		// create a new thread
		ThreadedInitializer initializationThread = new ThreadedInitializer(this, configuration, initializer);
		
		// and start it
		initializationThread.start();
	}

	/**
	 * Initializes the source service with a log service and a configuration.
	 * 
	 * @param logService
	 *            The log service that should be used by this source
	 * @param configuration
	 *            The source configuration.
	 * @return True if initialization was successful.
	 */
	public boolean initialize(LogService logService, Source configuration) {
		// TODO handle configuration

		if (!isInitialized()) {
			// set log service
			this.setLogService(logService);

			// set configuration
			source = configuration;

			// first: try to load from default path if it was null
			if (source == null) {
				URL defaultConfigurationUrl = getClass().getResource(
						DEFAULT_CONFIGURATION_PATH);

				URI configurationURI = null;
				try {
					configurationURI = URI.createURI((defaultConfigurationUrl
							.toURI().toString()));
				} catch (Exception e) {
					// nothing to do
				}

				source = loadSourceConfiguration(configurationURI);

				// disable saving, configurations inside the bundle are read
				// only
				if (source != null) {
					saveConfigurationEnabled = false;
				}
			}

			// second: try to load existing configuration form temporary path
			if (source == null) {
				source = loadSourceConfiguration(createConfigurationFilePath());
			}

			// third: create default configuration if no previously existing
			// configuration could be loaded
			if (source == null) {
				createDefaultConfiguration();

				// save created configuration
				saveSourceConfiguration();
			}

			// get log level
			logLevel = source.getLogLevelIntValue();
			
			// load cached content if caching is enabled
			if (cachingEnabled()) {
				loadCachedResource();

				DataSet dataSet = getDataSet();

				if (dataSet != null) {
					// create adapter to save after data set changes
					// TODO

				}

			}
			setInitialized(true);
		}

		return isInitialized();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sociotech.communitymashup.source.facade.SourceServiceFacade#
	 * getConfiguration()
	 */
	@Override
	public Source getConfiguration() {
		// return the source object
		return source;
	}

	/**
	 * Create a source specific configuration file path.
	 * 
	 * @return A source specific configuration file path.
	 */
	private String createConfigurationFilePath() {
		String tmpDir = System.getProperty("java.io.tmpdir");

		if (!tmpDir.endsWith(System.getProperty("file.separator", "/"))) {
			// folder should always end with a slash
			tmpDir += System.getProperty("file.separator", "/");
		}

		return tmpDir + configurationFileNamePrefix
				+ this.getClass().getCanonicalName().replaceAll("\\.", "_")
				+ ".xml";
	}

	protected void saveSourceConfiguration() {

		if (!saveConfigurationEnabled) {
			// saving disabled
			return;
		}

		URI configurationURI = createResourceURI(createConfigurationFilePath());

		if (configurationURI == null) {
			log("Could not save source configuration.", LogService.LOG_ERROR);
			return;
		}

		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new XMLResourceFactoryImpl());

		Resource resource = resourceSet.createResource(configurationURI);

		// add the configuration to the resource
		resource.getContents().add(source);

		// serialize resource you can specify also serialization
		// options which defined on org.eclipse.emf.ecore.xmi.XMIResource
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
			log("Could not write source configuration file.",
					LogService.LOG_ERROR);
			return;
		}

		log("Succesfully generated configuration file at: " + configurationURI,
				LogService.LOG_INFO);
	}

	private Source loadSourceConfiguration(String configurationPath) {

		File file = new File(configurationPath);

		if (!file.exists()) {
			// configuration does not exist
			return null;
		}

		URI configurationURI = createResourceURI(configurationPath);

		return loadSourceConfiguration(configurationURI);
	}

	private Source loadSourceConfiguration(URI configurationURI) {
		if (configurationURI == null) {
			return null;
		}

		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new XMLResourceFactoryImpl());

		Resource resource = resourceSet.createResource(configurationURI);

		// register package in local resource registry
		String nsURI = DataPackage.eINSTANCE.getNsURI();
		resourceSet.getPackageRegistry().put(nsURI, DataPackage.eINSTANCE);

		// load resource
		try {
			resource.load(null);
		} catch (IOException e) {
			log("IO Exception when trying to load source configuration from file. ("
					+ e.getMessage() + ")", LogService.LOG_ERROR);
			return null;
		}

		TreeIterator<EObject> dataIterator = resource.getAllContents();

		// A valid source configuration contains exactly one Source
		if (dataIterator.hasNext()) {
			EObject workingObject = dataIterator.next();

			if (workingObject instanceof Source) {
				log("Loaded source configuration from "
						+ configurationURI.path(), LogService.LOG_INFO);
				return (Source) workingObject;
			}
		} else {
			log("No source configuration found in file: "
					+ configurationURI.path(), LogService.LOG_ERROR);
		}

		return null;
	}

	/**
	 * Creates an URI for a resource specified by the given path.
	 * 
	 * @param resourcePath
	 *            Path of the resource
	 * @return The URI of the resource, null in error case
	 */
	private URI createResourceURI(String resourcePath) {

		File file = new File(resourcePath);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				log("Could not create configuration file at: " + resourcePath,
						LogService.LOG_ERROR);
				return null;
			}
		}

		return URI.createFileURI(resourcePath);
	}

	private void initializeCaching() {
		if (!cachingEnabled || cachingInitialized) {
			return;
		}

		String cacheFilePath = this.getCacheFilePath();

		if (cacheFilePath == null) {
			return;
		}

		// create cache file uri
		URI cacheFileURI = URI.createFileURI(cacheFilePath);

		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xml", new XMLResourceFactoryImpl());

		cachingResource = resourceSet.createResource(cacheFileURI);

		// register package in local resource registry
		String nsURI = DataPackage.eINSTANCE.getNsURI();
		resourceSet.getPackageRegistry().put(nsURI, DataPackage.eINSTANCE);

		if (cachingResource != null) {
			// save initialization state
			cachingInitialized = true;
		}
	}

	/**
	 * Loads data set from cached file.
	 */
	private void loadCachedResource() {

		if (!cachingEnabled) {
			return;
		}

		initializeCaching();

		if (!cachingInitialized) {
			log("Caching could not be initialized or is disabled.");
			return;
		}
		URI cacheFileURI = cachingResource.getURI();

		// load resource
		try {
			cachingResource.load(null);
		} catch (IOException e) {
			log("Could not load cached resource: " + cacheFileURI.path(),
					LogService.LOG_ERROR);
		}

		if (this.source != null) {
			TreeIterator<EObject> dataIterator = cachingResource
					.getAllContents();

			DataSet dataSet = null;

			// Mashup Data XML contains exactly one DataSet
			if (dataIterator.hasNext()) {
				EObject workingObject = dataIterator.next();

				if (workingObject instanceof DataSet) {
					dataSet = (DataSet) workingObject;
					log("loaded dataset from " + cacheFileURI.path(),
							LogService.LOG_INFO);
				}

				this.source.setDataSet(dataSet);
			} else {
				log("no data Set found in file: " + cacheFileURI.path(),
						LogService.LOG_DEBUG);
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.sociotech.communitymashup.source.facade.SourceServiceFacade#getDataSet
	 * ()
	 */
	@Override
	public DataSet getDataSet() {
		if (!isInitialized() || source == null) {
			return null;
		}

		if (source.getDataSet() == null) {

			// create a new data set and fill it up
			DataFactory factory = DataPackage.eINSTANCE.getDataFactory();
			DataSet dataSet = factory.createDataSet();

			// fill it up (also sets it using source.setDataSet)
			fillDataSet(dataSet);
		}

		// return the data set
		return source.getDataSet();
	}

	/**
	 * Sets the initialized state of this source service.
	 * 
	 * @param initialized
	 *            Set to true if initialization was successful.
	 */
	protected synchronized void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.facade.SourceServiceFacade#isInitialized()
	 */
	public synchronized boolean isInitialized() {
		return initialized;
	}

	/**
	 * Creates the default configuration for this source service and saves it as
	 * {@link SourceServiceFacadeImpl#source}.
	 */
	protected void createDefaultConfiguration() {
		// create empty Source
		source = ApplicationPackage.eINSTANCE.getApplicationFactory()
				.createSource();

		// default properties for all sources

		// create a system specific cache file path
		source.addProperty(SourceServiceProperties.CACHE_FILE_PATH_PROPERTY, getCacheFilePath());

		// add default value for caching
		source.addProperty(SourceServiceProperties.CACHING_ENABLED_PROPERTY, "false");
	}

	/**
	 * Creates a source service specific local cache file
	 * 
	 * @return The created file URI, null in error case.
	 */
	private String getCacheFilePath() {

		// check for file path in configuration first
		if (source != null
				&& source.getPropertyValue(SourceServiceProperties.CACHE_FILE_PATH_PROPERTY) != null) {
			return source.getPropertyValue(SourceServiceProperties.CACHE_FILE_PATH_PROPERTY);
		}

		// create unique name for cache file
		String cacheFileName = "source_cache_"
				+ this.getClass().getCanonicalName().replaceAll("\\.", "_")
				+ "_" + System.currentTimeMillis() + ".xml";

		String cacheFolder = System.getProperty("java.io.tmpdir");

		if (!cacheFolder.endsWith("/")) {
			// folder should always end with a slash
			cacheFolder += "/";
		}

		String cacheFilePath = cacheFolder + cacheFileName;

		if (source != null) {
			// save file path to configuration
			source.addProperty(SourceServiceProperties.CACHE_FILE_PATH_PROPERTY, cacheFilePath);
		}

		return cacheFilePath;
	}

	/**
	 * Returns the log service used by this source service.
	 * 
	 * @return The log service used by this source service.
	 */
	public LogService getLogService() {
		return logService;
	}

	/**
	 * Sets the log service for this source service
	 * 
	 * @param logService
	 *            Log service, null disables logging
	 */
	public void setLogService(LogService logService) {
		this.logService = logService;
	}

	/**
	 * Logs a message with a LOG_INFO using
	 * {@link SourceServiceFacadeImpl#log(String, int)}
	 * 
	 * @param message
	 *            Message to log
	 */
	public void log(String message) {
		// log with default log level = INFO
		log(message, LogService.LOG_INFO);
	}

	/**
	 * Logs a message with the given log level using the OSGi log service.
	 * 
	 * @param message
	 *            Message to log
	 * @param logLevel
	 *            log level: {@link LogService#LOG_DEBUG},
	 *            {@link LogService#LOG_ERROR}, {@link LogService#LOG_INFO} or
	 *            {@link LogService#LOG_WARNING}
	 */
	public void log(String message, int logLevel) {
		if(logLevel > this.logLevel)
		{
			// dont log
			return;
		}
		
		if (logService != null)
		{
			logService.log(logLevel, message);
		} 
		else
		{
			System.out.println(message);
		}
	}

	/**
	 * Starts the caching process of this source
	 */
	public void cache() {
		if (!cachingEnabled()) {
			return;
		}

		initializeCaching();

		if (!cachingInitialized) {
			log("Caching could not be initialized or is disabled.");
			return;
		}

		URI cacheFileURI = cachingResource.getURI();

		try {
			cachingResource.save(null);
			log("Cached source content to " + cacheFileURI.path(),
					LogService.LOG_DEBUG);
		} catch (IOException e) {
			log("Could not write cache content to " + cacheFileURI.path(),
					LogService.LOG_ERROR);
		}
	}

	
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.facade.SourceServiceFacade#fill(org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public void fill(DataSet dataSet) {
		if(!isActive())
		{
			return;
		}
		
		source.setActiveState(SourceActiveStates.FILLING);
		
		try
		{
			this.fillDataSet(dataSet);
		}
		catch (Exception e) {
			log("Error while filling data set in source ." + this + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			//e.printStackTrace();
			source.setState(SourceState.ERROR);
			return;
		}
		
		source.setActiveState(SourceActiveStates.FILLED);
	}

	/**
	 * Checks if this source service is active.
	 * 
	 * @return True if this source service is active. False otherwise.
	 */
	protected boolean isActive() {
		if(source == null)
		{
			return false;
		}
		
		return source.getState() == SourceState.ACTIVE;
	}

	/**
	 * This method should be overwritten in concrete source service implementations. super.fillDataSet(dataSet) should
	 * always be called.
	 * 
	 * @param dataSet The data set to be filled
	 */
	protected void fillDataSet(DataSet dataSet) {

		if (dataSet == null) {
			// error case
			log("A null data set could not be filled.", LogService.LOG_ERROR);
			return;
		}

		if (source.getDataSet() != null) {
			// There was previously used data set
			// This is not the way fill data set should be used
			// During the whole lifecycle of source there should be only one
			// specific data set
			log("There was a data set which was previously used by this source service and will be switched now.",
					LogService.LOG_DEBUG);
		}

		// set data set for usage in configuration
		source.setDataSet(dataSet);

	}

	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.facade.SourceServiceFacade#enrich()
	 */
	@Override
	public void enrich() {
		if(!isActive())
		{
			return;
		}
		
		if(source.getActiveState() != SourceActiveStates.FILLED)
		{
			log("Data set must be filled before enriching.", LogService.LOG_WARNING);
			return;
		}
		
		source.setActiveState(SourceActiveStates.ENRICHING);
		
		try
		{
			this.enrichDataSet();
		}
		catch (Exception e) {
			log("Error while enriching data set in source " + this + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			e.printStackTrace();
			source.setState(SourceState.ERROR);
			return;
		}
		
		log("Successfully enriched data with source service " + this, LogService.LOG_DEBUG);
		
		// After first enrichment the source is ready and waiting for update
		source.setActiveState(SourceActiveStates.WAITING_FOR_UPDATE);
	}

	/**
	 * This method should be overwritten in concrete source service implementations. super.enrichDataSet() should
	 * always be called.
	 */
	protected void enrichDataSet() {
		if (source.getDataSet() == null) {
			// error message
			log("No data set set for source service, cannot perform an enrichment.",
					LogService.LOG_ERROR);
		}

	}

	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.facade.SourceServiceFacade#update()
	 */
	@Override
	public void update() {
		if(!isActive())
		{
			return;
		}
		
//		int counter = UPDATE_TRY_COUNT;
//		while(source.getActiveState() != SourceActiveStates.WAITING_FOR_UPDATE && counter > 0)
//		{
//			counter--;
//			try {
//				wait(WAITING_INTERVALL);
//			} catch (InterruptedException e) {
//				continue;
//			}
//		}
		
//		if(counter == 0)
//		{
//			log("Could not get token for updating in source " + this, LogService.LOG_WARNING);
//			return;
//		}
		
		source.setActiveState(SourceActiveStates.UPDATING);
		
		try
		{
			this.updateDataSet();
		}
		catch (Exception e) {
			log("Error while updating data set in source. " + this + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			//e.printStackTrace();
			source.setState(SourceState.ERROR);
			return;
		}
		
		// After first enrichment the source is ready and waiting for update
		source.setActiveState(SourceActiveStates.WAITING_FOR_UPDATE);
	}

	/**
	 * Call this method before doing any enrichment. Enrichment is only allowed if this method returns true.
	 * After enrichment has been finished, {@link #finishedEnriching()} must be called.
	 * 
	 * @return True if enrichment is allowed, false otherwise.
	 */
	protected boolean allowedToEnrich()
	{
		if(!isActive())
		{
			return false;
		}
		
		int counter = ENRICH_TRY_COUNT;
		while(source.getActiveState() != SourceActiveStates.WAITING_FOR_UPDATE && counter > 0)
		{
			counter--;
			try {
				wait(WAITING_INTERVALL);
			} catch (InterruptedException e) {
				continue;
			}
		}
		
		if(counter == 0)
		{
			log("Could not get token for enriching in source " + this, LogService.LOG_WARNING);
			return false;
		}
		
		// set sate to enrich
		source.setActiveState(SourceActiveStates.ENRICHING);
		
		return true;
	}
	
	/**
	 * Call this method after enriching has been finished. Only call this method after you are
	 * allowed to enrich {@link #allowedToEnrich()}. 
	 */
	protected void finishedEnriching()
	{
		if(!isActive() || source.getActiveState() == SourceActiveStates.ENRICHING)
		{
			log("Tried to finish enriching without being in enrich state in source " + this, LogService.LOG_WARNING);
			return;
		}
		
		source.setActiveState(SourceActiveStates.WAITING_FOR_UPDATE);
	}
	
	/**
	 * This method should be overwritten in concrete source service implementations. super.updateDataSet() should
	 * always be called.
	 */
	protected void updateDataSet() {
		if (source.getDataSet() == null) {
			// error message
			log("No data set set for source service, cannot perform an update.",
					LogService.LOG_ERROR);
		}
	}

	/**
	 * Adds an item to the sources data set. Use this method to add items
	 * from concrete source implementations. If the item already exists in the
	 * data set then the given item will be merged into the existing one and the
	 * existing one will be returned.
	 * 
	 * @param item
	 *            The item that should be added to the data set.
	 * @return An existing item if it already exists otherwise the added item.
	 *         Null in error case.
	 */
	public Item add(Item item) {
		
		if(item == null)
		{
			// could not add null
			return null;
		}
		
		DataSet dataSet = source.getDataSet();
		
		if (source == null || dataSet == null) {
			return null;
		}

		// check if item is already contained
		Item existingItem = dataSet.getEqualItem(item);
		if(existingItem != null)
		{
			// merge the items
			this.mergeItems(existingItem, item);
			
			// add tags, categories etc. defined in the configuration
			addSourceSpecificInformations(existingItem);
			// just return it
			return existingItem;
		}
		
		// check if an item with this ident already exists
		if(item.getIdent() != null && !item.getIdent().isEmpty())
		{
			if(dataSet.getItemsWithIdent(item.getIdent()) != null)
			{
				log("Resetting ident of " + item, LogService.LOG_DEBUG);
				// reset the ident
				item.setIdent(null);
			}
		}
		
		Item addedItem = null;
		
		if(item instanceof Person)
		{
			// special case for persons
			addedItem = addPerson((Person) item);
		}
		else if(item instanceof Organisation)
		{
			// special case for organisations
			addedItem = addOrganisation((Organisation) item);
		}
		else if(item instanceof Content)
		{
			// special case for contents
			addedItem = addContent((Content) item);
		}
		else if(item instanceof Tag)
		{
			// special case for tags
			addedItem = addTag((Tag) item);
		}
		else if(item instanceof Category)
		{
			// special case for categories
			addedItem = addCategory((Category) item);
		}
		else if(item instanceof MetaTag)
		{
			// special case for meta tags
			addedItem = addMetaTag((MetaTag) item);
		}
		
		if(addedItem == null)
		{
			addedItem = dataSet.add(item);
		}
		
		// add tags, categories etc. defined in the configuration
		addSourceSpecificInformations(addedItem);
		
		// check to add all referenced objects
		addReferencedObjects(addedItem);
				
		return addedItem;
	}
	
	private void addReferencedObjects(Item item) {
		
		if(item == null)
		{
			return;
		}
		
		EList<EReference> references = item.eClass().getEAllReferences();
		
		for(EReference reference : references)
		{
			Object referencedObject = item.eGet(reference);
			
			if(referencedObject == null)
			{
				// nothing to do
				continue;
			}
			
			if(referencedObject instanceof DataSet)
			{
				// dont change the data set reference
				continue;
			}
			
			DataSet dataSet = source.getDataSet();
			
			if(referencedObject instanceof EList<?>)
			{
				// There can only be item lists
				@SuppressWarnings("unchecked")
				EList<Item> origReferenceL = (EList<Item>) referencedObject;
				
				if(!origReferenceL.isEmpty())
				{
					log("Adding " + origReferenceL.size() + " referenced items.", LogService.LOG_DEBUG);
				}
				
				EList<Item> referencedList = new BasicEList<Item>();
				referencedList.addAll(origReferenceL);
				
				EList<Item> removeList = new BasicEList<Item>();
				EList<Item> addList = new BasicEList<Item>();
				
				// step over all object and add them to list 1
				for(Item tmpItem : referencedList)
				{
					if(dataSet.getItems().contains(tmpItem))
					{
						// already contained
						continue;
					}
					
					log("Adding referenced: " + tmpItem, LogService.LOG_DEBUG);
					Item addedItem = this.add(tmpItem);
					// check if the item (object reference) has changed and replace
					if(addedItem != null && tmpItem != addedItem)
					{
						// keep object and update list later
						removeList.add(tmpItem);
						addList.add(addedItem);
					}
				}
				
				origReferenceL.removeAll(removeList);
				origReferenceL.addAll(addList);
			}
			else
			{
				log("Adding referenced object: " + referencedObject, LogService.LOG_DEBUG);
				
				if(!dataSet.getItems().contains(item))
				{
					this.add((Item)referencedObject);
				}
			}
		}
	}

	/**
	 * Adds an item to the sources data set. Use only this method to add items
	 * from concrete source implementations and made them accessible by the given
	 * source specific identifier. If the item already exists in the
	 * data set then the given item will be merged into the existing one and the
	 * existing one will be returned.
	 * 
	 * @param item  The item that should be added to the data set.
	 * @param sourceIdent Ident that is unique for this source service.
	 * @return An existing item if it already exists otherwise the added item.
	 *         Null in error case.
	 */
	public Item add(Item item, String sourceIdent) {
		// TODO merge all items based on source specific identifiers
		
		Item existingItem = this.getItemWithSourceIdent(sourceIdent);
		
		if(existingItem != null)
		{
			// merge information object with their previous added version -> update
			return this.mergeItems(existingItem, item);
		}
		
		Item addedItem = this.add(item);
		
		if(addedItem != null && sourceIdent != null)
		{
			addedItem.identifyBy(getLocalIdentifierKey(), sourceIdent);
		}
		
		return addedItem;
	}
	
	/**
	 * Returns the item with the ident that is unique for this source service.
	 *  
	 * @param sourceIdent Ident unique for this source service.
	 * @return The item with the source specific identifier, null in error case
	 * 		   and if the item does not exist.
	 */
	public Item getItemWithSourceIdent(String sourceIdent)
	{
		if(sourceIdent == null || sourceIdent.isEmpty())
		{
			return null;
		}
		
		return source.getDataSet().getItemWithIdentifier(getLocalIdentifierKey(), sourceIdent);
	}
	
	/**
	 * Returns the image with the ident that is unique for this source service.
	 *  
	 * @param sourceIdent Ident unique for this source service.
	 * @return The image with the source specific identifier, null in error case
	 * 		   and if the image does not exist.
	 */
	public Image getImageWithSourceIdent(String sourceIdent)
	{
		if(sourceIdent == null || sourceIdent.isEmpty())
		{
			return null;
		}
		
		return source.getDataSet().getImageWithIdentifier(getLocalIdentifierKey(), sourceIdent);
	}
	
	/**
	 * Returns the person with the ident that is unique for this source service.
	 *  
	 * @param sourceIdent Ident unique for this source service.
	 * @return The person with the source specific identifier, null in error case
	 * 		   and if the person does not exist.
	 */
	public Person getPersonWithSourceIdent(String sourceIdent)
	{
		if(sourceIdent == null || sourceIdent.isEmpty())
		{
			return null;
		}
		
		return source.getDataSet().getPersonWithIdentifier(getLocalIdentifierKey(), sourceIdent);
	}
	
	/**
	 * Returns the organisation with the ident that is unique for this source service.
	 *  
	 * @param sourceIdent Ident unique for this source service.
	 * @return The organisation with the source specific identifier, null in error case
	 * 		   and if the organisation does not exist.
	 */
	public Organisation getOrganisationWithSourceIdent(String sourceIdent)
	{
		if(sourceIdent == null || sourceIdent.isEmpty())
		{
			return null;
		}
		
		return source.getDataSet().getOrganisationWithIdentifier(getLocalIdentifierKey(), sourceIdent);
	}
	
	/**
	 * Returns the content with the ident that is unique for this source service.
	 *  
	 * @param sourceIdent Ident unique for this source service.
	 * @return The content with the source specific identifier, null in error case
	 * 		   and if the content does not exist.
	 */
	public Content getContentWithSourceIdent(String sourceIdent)
	{
		if(sourceIdent == null || sourceIdent.isEmpty())
		{
			return null;
		}
		
		return source.getDataSet().getContentWithIdentifier(getLocalIdentifierKey(), sourceIdent);
	}
	
	/**
	 * Returns the location with the ident that is unique for this source service.
	 *  
	 * @param sourceIdent Ident unique for this source service.
	 * @return The location with the source specific identifier, null in error case
	 * 		   and if the location does not exist.
	 */
	public Location getLocationWithSourceIdent(String sourceIdent)
	{
		if(sourceIdent == null || sourceIdent.isEmpty())
		{
			return null;
		}
		
		return source.getDataSet().getLocationWithIdentifier(getLocalIdentifierKey(), sourceIdent);
	}
	
	/**
	 * Returns the indoor location with the ident that is unique for this source service.
	 *  
	 * @param sourceIdent Ident unique for this source service.
	 * @return The indoor location with the source specific identifier, null in error case
	 * 		   and if the indoor location does not exist.
	 */
	public IndoorLocation getIndoorLocationWithSourceIdent(String sourceIdent)
	{
		if(sourceIdent == null || sourceIdent.isEmpty())
		{
			return null;
		}
		
		return source.getDataSet().getIndoorLocationWithIdentifier(getLocalIdentifierKey(), sourceIdent);
	}
	/**
	 * Returns the key used for source specific identifiers.
	 * 
	 * @return The key used for source specific identifiers.
	 */
	protected String getLocalIdentifierKey() {
		// TODO make this configurable
		return this.getClass().getCanonicalName();
	}
	
	/**
	 * Adds source specific information like tags set in the configuration to the given item.
	 * 
	 * @param item Item to add information to.
	 */
	private void addSourceSpecificInformations(Item item) {
		if(item == null)
		{
			// nothing to do
			return;
		}
		
		// get source instance specific meta tag
		MetaTag sourceMetaTag = getSourceInstanceMetaTag();
		// meta tag item with
		sourceMetaTag.getMetaTagged().add(item);
		
		// if removing is on the item should be deleted when this source stops
		// so add it to the on delete list of the meta tag
		if(source.getRemoveDataOnStop())
		{
			item.deleteOnDeleteOf(sourceMetaTag);
		}
		
		// TODO this methods have a really bad performance
		
		addSourceSpecificTags(item);
		addSourceSpecificMetaTags(item);
		addSourceSpecificCategories(item);
		
		// TODO add addition source specific ids in this method 
	}

	/**
	 * Returns the meta tag that is used to tag all items added by this source instance. It will be
	 * created if not used before.
	 * 
	 * @return The source instance specific meta tag
	 */
	private MetaTag getSourceInstanceMetaTag() {
		
		if(sourceInstanceMetaTag == null)
		{
			sourceInstanceMetaTag = source.getDataSet().getMetaTag(source.getIdent());
		}
		
		if(sourceInstanceMetaTag == null)
		{
			// not created before
			sourceInstanceMetaTag = DataFactory.eINSTANCE.createMetaTag();
			sourceInstanceMetaTag.setName(source.getIdent());
			//add it to the data set
			source.getDataSet().add(sourceInstanceMetaTag);
		}
		
		return sourceInstanceMetaTag;
	}

	/**
	 * Adds categories specified by {@link SourceServiceProperties#CATEGORIZE_ALL_INFORMATIONOBJECTS_PROPERTY} to
	 * the given item if it is an {@link InformationObject}.
	 * 
	 * @param item Item to categorize
	 */
	private void addSourceSpecificCategories(Item item) {
		if(!(item instanceof InformationObject))
		{
			// nothing to do
			return;
		}
		
		String[] categoryValues = getSingleValues(SourceServiceProperties.CATEGORIZE_ALL_INFORMATIONOBJECTS_PROPERTY);
		
		if(categoryValues == null || categoryValues.length < 1)
		{
			// nothing set
			return;
		}
		
		// only information objects can be categorized
		InformationObject informationObject = (InformationObject) item;
		
		for(int i = 0; i < categoryValues.length; i++)
		{
			// categorize the information object
			informationObject.categorize(categoryValues[i]);
		}
	}

	/**
	 * Adds categories specified by {@link SourceServiceProperties#META_TAG_ALL_IITEMS_PROPERTY} to
	 * the given item if it is an {@link InformationObject} or an {@link Extension}.
	 * 
	 * @param item Item to meta tag
	 */
	private void addSourceSpecificMetaTags(Item item) {
		if(!(item instanceof InformationObject || item instanceof Extension))
		{
			// nothing to do
			return;
		}
		
		String[] metaTagValues = getSingleValues(SourceServiceProperties.META_TAG_ALL_IITEMS_PROPERTY);
		
		if(metaTagValues == null || metaTagValues.length < 1)
		{
			// nothing set
			return;
		}
		
		for(int i = 0; i < metaTagValues.length; i++)
		{
			// meta tag the item
			item.metaTag(metaTagValues[i]);
		}
	}

	/**
	 * Adds tags specified by {@link SourceServiceProperties#TAG_ALL_INFORMATIONOBJECTS_PROPERTY} to
	 * the given item if it is an {@link InformationObject}.
	 * 
	 * @param item Item to tag
	 */
	private void addSourceSpecificTags(Item item) {
		if(!(item instanceof InformationObject))
		{
			// nothing to do
			return;
		}
		
		String[] tagValues = getSingleValues(SourceServiceProperties.TAG_ALL_INFORMATIONOBJECTS_PROPERTY);
		
		if(tagValues == null || tagValues.length < 1)
		{
			// nothing set
			return;
		}
		
		// only information objects can be tagged
		InformationObject informationObject = (InformationObject) item;
		
		for(int i = 0; i < tagValues.length; i++)
		{
			// tag the information object
			informationObject.tag(tagValues[i]);
		}
	}

	/**
	 * Extracts single values (comma (,) separated) from the source configuration specified by the given property key.
	 * 
	 * @param propertyKey 
	 * @return 
	 */
	private String[] getSingleValues(String propertyKey) {
		
		String propertyValue = source.getPropertyValue(propertyKey);
		
		// check if this property was not set
		if(propertyValue == null)
		{
			return null;
		}
		
		String[] singleValues = propertyValue.split(",");
		
		for(int i = 0; i < singleValues.length; i++)
		{
			// remove all white spaces from the begin and the end
			singleValues[i] = singleValues[i].trim();
		}
		
		return singleValues;
	}

	/**
	 * Looks up if the category is already contained in the data set. If this is
	 * true, the two categories will be merged and the already existing one will be
	 * returned.
	 * 
	 * @param category Category to be added to the data set
	 * @return The merged category if it already exist or the newly added one.
	 *         Null in error case.
	 */
	private Category addCategory(Category category) {

		DataSet dataSet = source.getDataSet();

		// look up existing category with the same name
		Category existingCategory = dataSet.getCategory(category.getName());
		
		if(existingCategory == null)
		{
			// new category
			return (Category) dataSet.add(category);
		}
		
		// add all categorized objects
		EList<InformationObject> categorized = category.getCategorized();
		
		// temporary store them
		EList<InformationObject> tmpList = new BasicEList<InformationObject>(categorized);
		
		// clear categorized list
		categorized.clear();
		
		// and add all to existing category
		for(InformationObject categorizedObject : tmpList)
		{
			// add also the categorized object to this data set
			Item addedItem = this.add(categorizedObject);
			
			EList<InformationObject> alreadyCategorized = existingCategory.getCategorized();
			
			if(addedItem != null && !alreadyCategorized.contains(addedItem))
			{
				// successfully added now categorize it
				existingCategory.getCategorized().add((InformationObject) addedItem);
			}
		}
		
		// do the same with main categories
		
		// add all categorized objects
		EList<InformationObject> mainCategorized = category.getMainCategorized();

		// temporary store them
		EList<InformationObject> tmpListMain = new BasicEList<InformationObject>(mainCategorized);

		// clear categorized list
		mainCategorized.clear();

		// and add all to existing category
		for(InformationObject categorizedObject : tmpListMain)
		{
			// add also the categorized object to this data set
			Item addedItem = this.add(categorizedObject);

			if(addedItem != null)
			{
				// successfully added now categorize it
				existingCategory.getMainCategorized().add((InformationObject) addedItem);
			}
		}
		
		// create category hierarchy
		if(category.getParentCategory() != null && existingCategory.getParentCategory() == null)
		{
			Category newParentCategory = (Category)this.add(category.getParentCategory());
			
			if(newParentCategory != null)
			{	
				// set parent if not previously set
				existingCategory.setParentCategory(newParentCategory);
			}
		}
		
		return existingCategory;
	}

	/**
	 * Looks up if the tag is already contained in the data set. If this is
	 * true, the two tags will be merged and the already existing one will be
	 * returned.
	 * 
	 * @param tag Tag to be added to the data set
	 * @return The merged tag if it already exist or the newly added one.
	 *         Null in error case.
	 */
	private Tag addTag(Tag tag) {
		
		DataSet dataSet = source.getDataSet();

		// look up existing tag with the same name
		Tag existingTag = dataSet.getTag(tag.getName());
		
		if(existingTag == null)
		{
			// new tag
			return (Tag) dataSet.add(tag);
		}
		
		// add all tagged objects
		EList<InformationObject> tagged = tag.getTagged();
		
		// temporary store them
		EList<InformationObject> tmpList = new BasicEList<InformationObject>(tagged);
		
		// clear tagged list
		tagged.clear();
		
		// and add all to existing tag
		for(InformationObject taggedObject : tmpList)
		{
			// add also the tagged object to this data set
			Item addedItem = this.add(taggedObject);
			
			EList<InformationObject> alreadyTagged = existingTag.getTagged();
			if(addedItem != null && !alreadyTagged.contains(addedItem))
			{
				// successfully added and not already tagged so tag it
				alreadyTagged.add((InformationObject) addedItem);
			}
		}
		
		return existingTag;
	}

	/**
	 * Looks up if the meta tag is already contained in the data set. If this is
	 * true, the two tags will be merged and the already existing one will be
	 * returned.
	 * 
	 * @param tag Meta tag to be added to the data set
	 * @return The merged meta tag if it already exist or the newly added one.
	 *         Null in error case.
	 */
	private MetaTag addMetaTag(MetaTag tag) {
		
		DataSet dataSet = source.getDataSet();

		// look up existing tag with the same name
		MetaTag existingTag = dataSet.getMetaTag(tag.getName());
		
		if(existingTag == null)
		{
			// new tag
			return (MetaTag) dataSet.add(tag);
		}
		
		// add all tagged objects
		EList<Item> tagged = tag.getMetaTagged();
		
		// temporary store them
		EList<Item> tmpList = new BasicEList<Item>(tagged);
		
		// clear tagged list
		tagged.clear();
		
		// and add all to existing tag
		for(Item taggedObject : tmpList)
		{
			// add also the tagged object to this data set
			Item addedItem = this.add(taggedObject);
			
			EList<Item> alreadyTagged = existingTag.getMetaTagged();
			if(addedItem != null && !alreadyTagged.contains(addedItem))
			{
				// successfully added and not already tagged so tag it
				alreadyTagged.add((Item) addedItem);
			}
		}
		
		return existingTag;
	}
	/**
	 * Looks up if the person is already contained in the data set. If this is
	 * true, the two persons will be merged and the already existing one will be
	 * returned.
	 * 
	 * @param person
	 *            Person to be added to the data set
	 * @return The merged person if it already exist or the newly added one.
	 *         Null in error case.
	 */
	private Item addPerson(Person person) {
		DataSet dataSet = source.getDataSet();

		// look up existing person with the same name
		String personName = person.getName();
		
		if(source.isPropertyTrue(SourceServiceProperties.REMOVE_NON_HTML_AND_PROPERTY))
		{
			personName = removeNonHtmlAnd(personName);
			person.setName(personName);
		}
		
		EList<Person> existingPersons = dataSet.getPersonsWithName(personName);

		if (existingPersons == null || existingPersons.isEmpty()) {
			// simply add it if the person does not exist yet
			return dataSet.add(person);
		}

		// if there already exists one than merge it

		// take the first one, of course their should only be one
		Person original = existingPersons.get(0);

		Item merged = null;
		try {
			merged = mergeItems(original, person);
		} catch (Exception e) {
			log("Exception while merging two persons: " + e.getMessage(),
					LogService.LOG_DEBUG);
		}

		if (merged == null) {
			log("Could not merge " + original + " and " + person,
					LogService.LOG_ERROR);
			log("Adding the duplicated person.", LogService.LOG_ERROR);
			return dataSet.add(person);
		}

		return (Person) merged;
	}

	/**
	 * Removes all non html and characters from the given String
	 * 
	 * @param value String to remove non html ands from
	 * @return The cleaned up string
	 */
	private String removeNonHtmlAnd(String value) {
		if(value == null)
		{
			// nothing to do
			return null;
		}
		
		// remove all & to let values be interpreted as html even if they are non html
		return value.replaceAll(NON_HTML_AND_REGEX, " ");		
	}

	/**
	 * Removes all invalid xml characters from the given String
	 * 
	 * @param value String to remove invalid xml characters from
	 * @return The cleaned up string
	 */
	private String removeInvalidXMLCharacters(String value) {
		if(value == null)
		{
			// nothing to do
			return null;
		}
		
		// replace all invalid xml characters
		return value.replaceAll(INVALID_XML_CHARACTERS_REGEX, " "); 		
	}
	
	/**
	 * Preprocesses the content and adds it to the dataset.
	 * 
	 * @param content The content to be added.
	 * 
	 * @return The added content or null in error case.
	 */
	private Content addContent(Content content) {
		
		if(source.isPropertyTrueElseDefault(SourceServiceProperties.REMOVE_HTML_PROPERTY, SourceServiceProperties.REMOVE_HTML_DEFAULT))
		{
			content.setStringValue(removeHtml(content.getStringValue()));
			content.setName(removeHtml(content.getName()));
		}
		
		if(source.isPropertyTrueElseDefault(SourceServiceProperties.REMOVE_NON_HTML_AND_PROPERTY, SourceServiceProperties.REMOVE_NON_HTML_AND_DEFAULT))
		{
			content.setStringValue(removeNonHtmlAnd(content.getStringValue()));
			content.setName(removeNonHtmlAnd(content.getName()));
		}
		
		if(source.isPropertyTrueElseDefault(SourceServiceProperties.REMOVE_INVALID_XML_CHARACTER_PROPERTY, SourceServiceProperties.REMOVE_INVALID_XML_CHARACTER_DEFAULT))
		{
			content.setStringValue(removeInvalidXMLCharacters(content.getStringValue()));
			content.setName(removeInvalidXMLCharacters(content.getName()));
		}
		
		content = (Content) source.getDataSet().add(content);
		
		return (Content) content;
	}

	/**
	 * Removes all html from the given value and returns it. Also replaces all &.
	 * 
	 * @param value Value from wich all html should be removed.
	 * @return The non html result.
	 */
	private String removeHtml(String value) {
		
		if(value == null)
		{
			// nothing to do
			return null;
		}
		
		// remove html using jsoup
		return Jsoup.parse(value).text();
	}

	/**
	 * Looks up if the organisation is already contained in the data set. If this is
	 * true, the two organisations will be merged and the already existing one will be
	 * returned.
	 * 
	 * @param organisation
	 *            Organisation to be added to the data set
	 * @return The merged organisation if it already exist or the newly added one.
	 *         Null in error case.
	 */
	private Organisation addOrganisation(Organisation organisation) {
		DataSet dataSet = source.getDataSet();

		String organisationName = organisation.getName();
		
		if(source.isPropertyTrue(SourceServiceProperties.REMOVE_NON_HTML_AND_PROPERTY))
		{
			organisationName = removeNonHtmlAnd(organisationName);
			organisation.setName(organisationName);
		}
		
		// look up existing organisation with the same name
		EList<Organisation> existingOrganisations = dataSet.getOrganisationsWithName(organisationName);

		if (existingOrganisations == null || existingOrganisations.isEmpty()) {
			// simply add it if the person does not exist yet
			return (Organisation) dataSet.add(organisation);
		}

		// if there already exists one than merge it

		// take the first one, of course their should only be one
		Organisation original = existingOrganisations.get(0);

		Item merged = null;
		try {
			merged = mergeItems(original, organisation);
		} catch (Exception e) {
			log("Exception while merging two organisations: " + e.getMessage(),
					LogService.LOG_DEBUG);
		}

		if (merged == null) {
			log("Could not merge " + original + " and " + organisation,
					LogService.LOG_ERROR);
			log("Adding the duplicated organisation.", LogService.LOG_ERROR);
			return (Organisation) dataSet.add(organisation);
		}

		return (Organisation) merged;
	}
	
	/**
	 * Merges the references and attributes from information object 2 into information object 1.
	 * The two information objects must be of the same type.
	 * 
	 * @param io1 Target information object
	 * @param io2 Information object with new values
	 * @return The merged information object or null in error case.
	 */
	@SuppressWarnings("unchecked")
	protected Item mergeItems(Item io1, Item io2)
	{
		if(io1 == io2)
		{
			// no merge needed on same objects
			return io1;
		}
		
		// TODO refactor this method to an update method of information object (or item)
		if(io1 == null)
		{
			return null;
		}
		
		if(io2 == null)
		{
			return io1;
		}
		
		if(io1.eClass() != io2.eClass())
		{
			log("Item " + io1 + " and Item " + io2 + " are from different types and can not be merged", LogService.LOG_WARNING);
			return io1;
		}	
		
		log("Merging " + io1.getIdent() + " and " + io2.getIdent(), LogService.LOG_DEBUG);
		
		// get possible attributes and references
		EList<EAttribute> attributes = io1.eClass().getEAllAttributes();
		EList<EReference> references = io1.eClass().getEAllReferences();
		
		// step through all attributes and update them
		for(EAttribute attribute : attributes)
		{
			Object attributeValue1 = io1.eGet(attribute);
			Object attributeValue2 = io2.eGet(attribute);
			if(attribute.getFeatureID() == DataPackage.ITEM__IDENT)
			{
				// dont change the ident
				continue;
			}	
			
			if(attributeValue2 == null || (attributeValue2.equals(attributeValue1)))
			{
				// nothing to do
				log("No new value for attribute " + attribute + " for information object " + io1, LogService.LOG_DEBUG);
				continue;
			}
			else 
			{
				if(attributeValue2 instanceof String)
				{
					String stringValue = (String) attributeValue2;
					if(stringValue.isEmpty())
					{
						// dont overwrite with empty values
						continue;
					}
				}
						
					
				// TODO check if new value is newer
				log("Setting attribute " + attribute + " for information object " + io1 + " to " + attributeValue2, LogService.LOG_DEBUG);
				io1.eSet(attribute, attributeValue2);
			}
			
		}
		
		for(EReference reference : references)
		{
			Object referencedObject1 = io1.eGet(reference);
			Object referencedObject2 = io2.eGet(reference);
			
			if(referencedObject1 == null && referencedObject2 == null)
			{
				// nothing to do
				continue;
			}
			
			if(referencedObject2 == null)
			{
				// no new references
				continue;
			}
			
			if(referencedObject1 instanceof DataSet)
			{
				// dont change the data set reference
				continue;
			}
			
			if(referencedObject1 instanceof EList<?> && referencedObject2 instanceof EList<?>)
			{
				EList<Item> list2 = null;
				try {
					// try to cast, there should only be list of items
					list2 = (EList<Item>) referencedObject2;
				} catch (Exception e) {
					// merge only list of items
					log("References contain a list of non Item!", LogService.LOG_WARNING);
					continue;
				}
				
				if(list2.isEmpty())
				{
					// no new references
					continue;
				}
				
				log("Referenced1: " + referencedObject1, LogService.LOG_DEBUG);
				log("Referenced2: " + referencedObject2, LogService.LOG_DEBUG);
				
				EList<Item> list1 = (EList<Item>) referencedObject1;
				
				// temporary keep all items from list2
				EList<Item> tmpList = new BasicEList<Item>(list2);
				
				// clear list 2
				list2.clear();
				
				// step over all object and add them to list 1
				for(Item tmpItem : tmpList)
				{
					log("Adding: " + tmpItem);
					Item addedItem = this.add(tmpItem);
					// add it to list if not already contained
					if(addedItem != null && !list1.contains(addedItem))
					{
						list1.add(addedItem);
					}
				}
			}
			
			if(referencedObject1 == null && referencedObject2 instanceof Item)
			{
				log("Referenced1: " + referencedObject1, LogService.LOG_DEBUG);
				log("Referenced2: " + referencedObject2, LogService.LOG_DEBUG);
				
				// reference is no list an not previously set
				Item addedItem = this.add((Item) referencedObject2);
				io1.eSet(reference, addedItem);
			}
		}
		
		return io1;
	}
	
	/**
	 * Determines if caching is enabled
	 * 
	 * @return true if caching is enabled, false otherwise
	 */
	protected boolean cachingEnabled() {
		if (source.getProperty(SourceServiceProperties.CACHING_ENABLED_PROPERTY) != null
				&& source.getProperty(SourceServiceProperties.CACHING_ENABLED_PROPERTY).equals("true")) {
			return true;
		}
		return false;
	}

	/**
	 * Checks if a given belongs to this source.
	 * 
	 * @param item Item to be checked
	 * @return True if the given item belongs to this source, false otherwise.
	 */
	protected boolean isItemOfThisSource(Item item)
	{
		return getLocalId(item) != null;
	}
	
	/**
	 * Returns the id of the given item used in this source.
	 * @param localItem
	 * @return
	 */
	protected String getLocalId(Item localItem) {
		
		if(localItem == null)
		{
			return null;
		}
		
		Identifier localIdentifier = localItem.getIdentifier(getLocalIdentifierKey());
				
		if(localIdentifier != null)
		{
			return localIdentifier.getValue();
		}
		
		return null;
	}
	
	/**
	 * Deletes the given item and references to it.
	 * 
	 * @param item Item to be deleted.
	 */
	protected void deleteItem(Item item)
	{
		if(item == null)
		{
			return;
		}
		
		// use the ecore util to delete it
		EcoreUtil.delete(item, true);
	}
	
	/**
	 * Parses the given content for hashtags (#tag) and adds {@link Tag Tags} to the content.
	 * 
	 * @param content Content that contains hash tags.
	 */
	public void parseAndAddHashTags(Content content)
	{
		if(content == null)
		{
			return;
		}
		
		String value = content.getStringValue();
		
		if(value == null || value.isEmpty())
		{
			return;
		}
				
		Matcher matcher = TAG_PATTERN.matcher(value);

		// find first
		matcher.find();
		
		// while there is one add all as tags to the content 
		while(!matcher.hitEnd())
		{
			String tag = value.substring(matcher.start() +1, matcher.end());
			content.tag(tag);
			matcher.find();
		}		
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.facade.SourceServiceFacade#stopSourceService()
	 */
	@Override
	public void stopSourceService() {
		this.stop();
	}
	
	/**
	 * Stop everything, should be overwritten in concrete source implementations with call to super.stop().
	 */
	protected void stop() {
	
		// remove added data if set
		if(source.getRemoveDataOnStop())
		{
			// simply delete source secific meta tag
			getSourceInstanceMetaTag().delete();
		}
		
		source.setState(SourceState.STOPED);
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.facade.SourceServiceFacade#handleChange(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public boolean handleChange(Notification notification) {
		if(notification == null)
		{
			return false;
		}
		
		if(notification.getNotifier() != this.source)
		{
			// no change at the configuration of this source
			return false;
		}
		
		return this.handle(notification);
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.facade.SourceServiceFacade#handlePropertyChange(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public boolean handlePropertyChange(Notification notification) {
		if(notification == null)
		{
			return false;
		}
		
		if(notification.getNotifier() != this.source.getConfiguration())
		{
			// no property of this source
			return false;
		}
			
		return this.handleProperty(notification);
	}

	/**
	 * This method should be overwritten in concrete interface implementations with call to super.handleProperty();
	 * 
	 * @param notification Notification indicating a change to a source configuration property
	 * @return True if the change is handled, false otherwise.
	 */
	protected boolean handleProperty(Notification notification) {
		// handle source service facade specific properties
		
		// currently all of them need a restart, so return false
		
		return false;
	}
	
	/**
	 * This method should be overwritten in concrete interface implementations with call to super.handle();
	 * 
	 * @param notification Notification indicating a change to the source configuration
	 * @return True if the change is handled, false otherwise.
	 */
	protected boolean handle(Notification notification) {
		int featureID = notification.getFeatureID(Source.class);
		if(featureID == ApplicationPackage.SOURCE__CHANGEABLE ||
		   featureID == ApplicationPackage.SOURCE__HIDDEN ||
		   featureID == ApplicationPackage.SOURCE__DESCRIPTION ||
		   featureID == ApplicationPackage.SOURCE__NAME ||
		   featureID == ApplicationPackage.SOURCE__CONFIGURATION_IMAGE ||
		   featureID == ApplicationPackage.SOURCE__IDENT)
		{
			// basic attributes that only influence the gui don't need to be handled
			return true;
		}
		
		// handle remove data switch
		if(featureID == ApplicationPackage.SOURCE__REMOVE_DATA_ON_STOP)
		{
			// switched on
			if(source.getRemoveDataOnStop())
			{
				setAllRemoveOn();
			}
			// switched off
			else if(!source.getRemoveDataOnStop())
			{
				setAllRemoveOff();
			}
			return true;
		}
				
		// handle state changes
		if(featureID == ApplicationPackage.SOURCE__STATE && notification.getEventType() == Notification.SET)
		{
			// Setting to stop must be handled by mashup cause this needs to destroy the service instantiated by the mashup
			// TODO handle other state transitions
			return true;
		}	
		// handle active state changes
		else if(featureID == ApplicationPackage.SOURCE__ACTIVE_STATE && notification.getEventType() == Notification.SET)
		{
			// nothing to do
			return true;
		}	
		// handle log level change
		else if(featureID == ApplicationPackage.SOURCE__LOG_LEVEL && notification.getEventType() == Notification.SET)
		{
			// log level has changed, so set it
			this.logLevel = source.getLogLevelIntValue();
			log("Set log level to " + this.logLevel, LogService.LOG_DEBUG);
			
			return true;
		}
		// handle data set change, appears on source initialization
		else if(featureID == ApplicationPackage.SOURCE__DATA_SET && notification.getEventType() == Notification.SET)
		{
			// nothing to do for the service
			return true;
		}
		
		return false;
	}

	/**
	 * Removes all items added by this source instance from the delete on delete list of
	 * the source specific meta tag
	 */
	private void setAllRemoveOff() {
		MetaTag metaTag = getSourceInstanceMetaTag();
		
		// all added items are meta tagged with the source specific meta tag
		EList<Item> addedItems = metaTag.getMetaTagged();
		
		// remove them from the delete on delete list
		metaTag.getDeleteOnDelete().removeAll(addedItems);
	}

	/**
	 * Adds all items added by this source instance to the delete on delete list of
	 * the source specific meta tag
	 */
	private void setAllRemoveOn() {
		MetaTag metaTag = getSourceInstanceMetaTag();
		
		// all added items are meta tagged with the source specific meta tag
		EList<Item> addedItems = metaTag.getMetaTagged();
		
		// remove them from the delete on delete list
		metaTag.getDeleteOnDelete().addAll(addedItems);
	}
}
