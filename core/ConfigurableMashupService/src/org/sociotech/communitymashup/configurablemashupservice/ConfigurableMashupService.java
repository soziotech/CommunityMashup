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
package org.sociotech.communitymashup.configurablemashupservice;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Interface;
import org.sociotech.communitymashup.application.Mashup;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.configurablemashupservice.instantiation.servicetrackers.InterfaceFactoryTracker;
import org.sociotech.communitymashup.configurablemashupservice.instantiation.servicetrackers.SourceFactoryTracker;
import org.sociotech.communitymashup.configurablemashupservice.update.UpdateThread;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.interfaceprovider.factory.facade.InterfaceFactoryFacade;
import org.sociotech.communitymashup.mashup.impl.MashupServiceFacadeImpl;
import org.sociotech.communitymashup.source.facade.SourceServiceFacade;
import org.sociotech.communitymashup.source.factory.facade.SourceFactoryServiceFacade;
import org.sociotech.communitymashup.source.factory.facade.callback.AsynchronousSourceInstantiationCallback;

/**
 * @author Peter Lachenmaier
 * 
 * This is a configurable implementation of a mashup service. 
 */
public class ConfigurableMashupService extends MashupServiceFacadeImpl implements AsynchronousSourceInstantiationCallback {

	/**
	 * The system specific file separator 
	 */
	private static String fileSeparator = System.getProperty("file.separator");
	
	/**
	 * Constant for the data folder
	 */
	private static final String DEFAULT_DATA_FOLDER = "data" + fileSeparator;

	/**
	 * Constant for the data backup folder
	 */
	private static final String DEFAULT_DATA_BACKUP_FOLDER = DEFAULT_DATA_FOLDER + "backup" + fileSeparator;;

	/**
	 * Constant for the attachments cache folder
	 */
	private static final String DEFAULT_ATTACHMENT_FOLDER = DEFAULT_DATA_FOLDER + "attachments" + fileSeparator;;

	/**
	 * Constant for the data set file name
	 */
	private static final String DEFAULT_DATASET_FILENAME = "dataSet.xml";
	
	/**
	 * Reference to a source factory that will be used for instantiating needed sources.
	 * The reference will be maintained by {@link #setSourceFactory(SourceFactoryServiceFacade)}
	 * and {@link #unsetSourceFactory()}
	 */
	private SourceFactoryServiceFacade sourceFactory = null;

	/**
	 * Reference to a interface factory that will be used for instantiating needed interfaces.
	 * The reference will be maintained by {@link #setInterfaceFactory(InterfaceFactoryFacade)}
	 * and {@link #unsetInterfaceFactory()}
	 */
	private InterfaceFactoryFacade interfaceFactory = null;

	/**
	 *	Represents if the configuration of this mashup service is completely fullfilled. 
	 */
	private boolean configurationFullfilled = false;

	/**
	 *	Represents if the data enrichment process was started for all sources. 
	 */
	private boolean startedEnrichment = false;

	/**
	 * A map that keeps the assignment of source services to source configurations.
	 */
	private Map<Source, SourceServiceFacade> sourceServices = null;

	/**
	 * This list keeps configurations of sources for which an asynchronous instantiation process is started.
	 */
	private List<Source> asynchronousInstantionStarted = null;

	/**
	 * This list keeps configurations of sources that are waiting for instantiation.
	 */
	private List<Source> sourcesWaitingForInstantiation = null;

	/**
	 * This list keeps configurations of interfaces that are waiting for instantiation.
	 */
	private List<Interface> interfacesWaitingForInstantiation = null;

	/**
	 * Reference to the opened interface factory tracker
	 */
	private InterfaceFactoryTracker interfaceFactoryTracker;

	/**
	 * Reference to the opened source factory tracker
	 */
	private SourceFactoryTracker sourceFactoryTracker;

	/**
	 * Thread that cyclic calls the update method
	 */
	private UpdateThread updateThread;

	/**
	 * Working directory, is set when configuration contains valid path
	 */
	private File workingDirectory = null;
	
	/**
	 * Directory used for data
	 */
	private File dataDirectory = null;
	
	/**
	 * Directory used for backups of the data set
	 */
	private File dataBackupDirectory = null;
	
	/**
	 * Directory used as attachments cache
	 */
	private File attachmentsCacheDirectory = null;
	
	/**
	 * Default constructor that is just initializing local lists.
	 */
	public ConfigurableMashupService() {

		// empty map of used source services
		sourceServices = new HashMap<Source, SourceServiceFacade>();

		// empty list for started asynchronous instantiation
		asynchronousInstantionStarted = new LinkedList<Source>();

		// empty list for source configurations waiting for instantiation
		sourcesWaitingForInstantiation = new LinkedList<Source>();

		// empty list for interface configurations waiting for instantiation
		interfacesWaitingForInstantiation = new LinkedList<Interface>();

		BundleContext context = ConfigurableMashupBundleActivator.getContext();

		// create and open service trackers for factory services
		interfaceFactoryTracker = new InterfaceFactoryTracker(context, this);
		interfaceFactoryTracker.open();

		sourceFactoryTracker = new SourceFactoryTracker(context, this);
		sourceFactoryTracker.open();
	}


	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.mashup.impl.MashupServiceFacadeImpl#initialize()
	 */
	@Override
	public boolean initialize()
	{
		if(this.mashup == null)
		{
			log("Could not initialize the mashup service without a previously loaded configuration" , LogService.LOG_ERROR);
			this.setInitialized(false);
			return this.isInitialized();
		}

		if(this.mashup.getDataSet() == null)
		{
			// not previously created or loaded from cache
			prepareDataSet();  
		}

		this.setInitialized(true);

		return this.isInitialized();
	}


	/**
	 * Creates a new and empty data set and sets it for usage
	 */
	private void initializeNewDataSet()
	{
		// create an empty data set
		DataSet newDataSet = DataPackage.eINSTANCE.getDataFactory().createDataSet();

		// create resource for data set
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("*", new ResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createURI("ConfigurableCommunityMashup"));

		resource.getContents().add(newDataSet);
				
		// set attachment caching
		boolean shouldCacheAttachments = this.mashup.getCacheAttachments();
		newDataSet.setCacheFileAttachements(shouldCacheAttachments);

		this.mashup.setDataSet(newDataSet);
	}


	/* (non-Javadoc)
	 * @see de.unibw.cscm.communitymashup.mashup.MashupServiceFacade#getDataSet()
	 */
	@Override
	public DataSet getDataSet() {
		if(this.isInitialized() || this.mashup != null)
		{
			return this.mashup.getDataSet();
		}

		return null;
	}

	/* (non-Javadoc)
	 * @see de.unibw.cscm.communitymashup.mashup.impl.MashupServiceFacadeImpl#loadConfiguration(de.unibw.cscm.communitymashup.application.Mashup)
	 */
	@Override
	public Mashup loadConfiguration(Mashup configuration) {

		super.loadConfiguration(configuration);

		if(mashup == null)
		{
			// could not start mashup service without configuration
			this.log("No valid mashup configuration: Could not start up mashup service.", LogService.LOG_ERROR);
			return null;
		}

		// mashup is also a source
		this.source = mashup;

		// prepare working directory
		prepareWorkingDirectory(mashup.getWorkingDirectory());
		
		// load or create data set
		prepareDataSet();

		logLevel = configuration.getLogLevelIntValue();
		
		// set mashup log level also for data set
		mashup.getDataSet().setLogLevel(logLevel);
		
		// create all sources

		EList<Source> sources = mashup.getSources();

		if(sources == null || sources.isEmpty())
		{
			// nothing to do yet
			configurationFullfilled  = true;
			return mashup;
		}

		// first put all source on waiting list
		sourcesWaitingForInstantiation.addAll(sources);
		
		// instantiate and initalize all needed source services
		for(Source currentSource : sources)
		{
			// create a source service for every source configuration
			createSourceService(currentSource);
		}

		// create all interfaces

		EList<Interface> interfaces = mashup.getInterfaces();

		for(Interface currentInterface : interfaces)
		{
			// create a interface for every interface in the configuration
			createInterfaceService(currentInterface);
		}

		// TODO track changes of configuration

		return mashup;
	}


	/**
	 * If a working directory is set and a previous data set file exists than the data set is loaded.
	 * If the data set is not yet existing than a new one will be created and the source states will be
	 * reseted.
	 */
	private void prepareDataSet() {
		boolean existingDataSet = false;
		
		if(dataDirectory != null)
		{
			// try to load existing data set
			// TODO load data set from cached file if set in configuration and set it for usage
		}
		
		if(!existingDataSet)
		{
			// no dataset currently exist
			// initialize new data set
			initializeNewDataSet();
		}
		
		if(attachmentsCacheDirectory != null)
		{
			// set it in the data set to cache attachments in this directory
			mashup.getDataSet().setCacheFolder(attachmentsCacheDirectory.getAbsolutePath());
		}
		
	}

	/**
	 * Creates a source service if the factory is already available. Otherwise keeps reference to create it when the source
	 * factory appears.
	 * 
	 * @param sourceConfiguration Configuration of the source service to create.
	 */
	private void createSourceService(Source sourceConfiguration) {
		// get bundle id from configuration
		String bundleId = sourceConfiguration.getBundleId();

		if(sourceFactory != null)
		{
			
			// directly produce if source factory available

			// note it as open asynchronous instantiation
			asynchronousInstantionStarted.add(sourceConfiguration);

			// remove it if it is already waiting
			if(sourcesWaitingForInstantiation.contains(sourceConfiguration))
			{
				sourcesWaitingForInstantiation.remove(sourceConfiguration);
			}
			
			// instantiate service asynchronously and set source configuration as key
			log("Starting asynchronous production of source " + sourceConfiguration.getName(), LogService.LOG_DEBUG);
			sourceFactory.produceAsynchronous(bundleId, this, sourceConfiguration);
		}
		else
		{
			log("Keeping source " + sourceConfiguration.getName() + " for later production.", LogService.LOG_DEBUG);

			// keep it for later creation
			if(!sourcesWaitingForInstantiation.contains(sourceConfiguration))
			{
				sourcesWaitingForInstantiation.add(sourceConfiguration);
			}
		}
	}

	/**
	 * Creates a interface service if the factory is already available. Otherwise keeps reference to create it when the interface
	 * factory appears.
	 * 
	 * @param interfaceConfiguration Configuration of the interface service to create.
	 */
	private void createInterfaceService(Interface interfaceConfiguration) {
		if(interfaceFactory != null)
		{
			log("Starting production of interface", LogService.LOG_DEBUG);

			// directly produce if interface factory available

			// instantiate interface service
			interfaceFactory.produceInterface(interfaceConfiguration, this.getDataSet());
		}
		else
		{
			log("Keeping interface for later production.", LogService.LOG_DEBUG);

			// keep it for later creation
			interfacesWaitingForInstantiation.add(interfaceConfiguration);
		}
	}
	/**
	 * Sets the source factory used for the creation of source services.
	 * 
	 * @param sourceFactoryService Source factory service
	 */
	public void setSourceFactory(SourceFactoryServiceFacade sourceFactoryService) {
		// unset it first
		this.unsetSourceFactory();

		// keep reference
		this.sourceFactory = sourceFactoryService;

		// check if sources waiting for instantiation
		if(sourcesWaitingForInstantiation.isEmpty())
		{
			// return if no sources in the list
			return;
		}

		// temporary keep all waiting sources
		List<Source> tmpList = new LinkedList<Source>(sourcesWaitingForInstantiation);

		// clear the list
		sourcesWaitingForInstantiation.clear();

		for(Source waiting : tmpList)
		{
			// maybe puts it on the waiting list again
			createSourceService(waiting);
		}
	}

	/**
	 * Removes the kept reference to a source factory service.
	 */
	public void unsetSourceFactory() {
		// remove reference to source factory
		sourceFactory = null;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.factory.facade.callback.AsynchronousSourceInstantiationCallback#sourceInstantiated(org.sociotech.communitymashup.source.facade.SourceServiceFacade, java.lang.Object)
	 */
	@Override
	public void sourceInstantiated(SourceServiceFacade sourceService, Object key) {
		// key object should be a source configuration
		// otherwise something went wrong.
		if(!(key instanceof Source))
		{
			return;
		}

		// cast it
		Source configuration = (Source) key;

		if(sourceService == null || key == null)
		{
			// invalid callback
			log("Invalid callback from source instantiation.", LogService.LOG_ERROR);
			return;
		}

		if(asynchronousInstantionStarted.contains(configuration))
		{
			log("Production of source " + configuration.getName() + " finished.");

			// remove it from asynchronous instantiation list
			asynchronousInstantionStarted.remove(configuration);
			// and add it to instantiated services
			sourceServices.put(configuration, sourceService);

			// TODO maintain a global(mashup service) initialization state
			// now initialize the source service with the configuration
			sourceService.initialize(configuration);

			// now let the source add data
			// TODO maybe do it after all sources are created 
			try {
				sourceService.fill(this.getDataSet());
				log("Filled data set by " + configuration.getName(), LogService.LOG_INFO);
			} catch (Exception e) {
				log("Exception (" + e.getMessage() + ") while filling dataset by source " + sourceService, LogService.LOG_ERROR);
			}
		}
		else
		{
			// error, should never happen
			log("Got callback from source instantiation that was not previously started: " + configuration, LogService.LOG_ERROR);
			return;
		}

		// check if mashup configuration is now fulfilled
		checkConfiguration();
	}

	/**
	 * Checks if the complete configuration given to {@link #loadConfiguration(Mashup)} is fulfilled. This
	 * means that all sources and interfaces are instantiated.
	 */
	private void checkConfiguration() {
		configurationFullfilled = checkInterfaceInstantiation() && checkSourceInstantiation();
		
		if(!configurationFullfilled || startedEnrichment)
		{
			// nothing to do if not fulfilled or enrichment already started
			return;
		}
		
		// enrich data set by all source services
		this.enrich();
		
		// start update loop
		this.startUpdateLoop();
		
		// TODO What else should happen if the configuration is now fulfilled
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#enrich()
	 */
	@Override
	public void enrich() {
		// TODO Maintain source active state also for mashup
		//super.enrich();
		
		// get all created source services
		Collection<SourceServiceFacade> services = sourceServices.values();
		
		if(services == null)
		{
			log("No valid services created by mashup configuration, could not enrich", LogService.LOG_ERROR);
			return;
		}
				
		// let all services enrich the data set
		// do it in the order specified in the configuration
		for(Source source : mashup.getSources())
		{
			SourceServiceFacade service = sourceServices.get(source);
			if(service == null)
			{
				log("Service not found for source " + source, LogService.LOG_WARNING);
				continue;
			}
			
			log("Enriching data with source service " + service.getConfiguration().getName(), LogService.LOG_INFO);
			try {
				service.enrich();
			} catch (Exception e) {
				log("Exception while enriching data with source service " + service, LogService.LOG_ERROR);
			}
		}
	}


	/**
	 * Starts a thread that cyclic call the update method of this mashup service
	 */
	private void startUpdateLoop() {
		// create new update thread
		updateThread = new UpdateThread(this);
		
		// and start it
		updateThread.start();
	}


	/**
	 * Checks if all sources are instantiated.
	 * 
	 * @return True if all sources are instantiated, false otherwise.
	 */
	private boolean checkSourceInstantiation() {
		return asynchronousInstantionStarted.isEmpty() && sourcesWaitingForInstantiation.isEmpty();
	}

	/**
	 * Checks if all interfaces are instantiated.
	 * 
	 * @return True if all interfaces are instantiated, false otherwise.
	 */
	private boolean checkInterfaceInstantiation() {
		// TODO implement
		return true;
	}

	/**
	 * Stops this mashup service.
	 */
	public void stop()
	{
		// TODO maybe stop or pause all instantiated sources
		// TODO stop all instantiated interfaces

		// TODO cache data

		// stop update thread
		if(updateThread != null)
		{
			updateThread.stopThread();
		}
		
		// close service trackers
		if(sourceFactoryTracker != null)
		{
			sourceFactoryTracker.close();
		}

		if(interfaceFactoryTracker != null)
		{
			interfaceFactoryTracker.close();
		}
	}


	/**
	 * Sets the interface factory used for the creation of interface services.
	 * 
	 * @param interfaceFactoryService Interface factory service
	 */
	public void setInterfaceFactory(InterfaceFactoryFacade interfaceFactoryService)
	{
		// unset it first
		this.unsetInterfaceFactory();

		// keep reference
		this.interfaceFactory = interfaceFactoryService;

		// check if sources waiting for instantiation
		if(interfacesWaitingForInstantiation.isEmpty())
		{
			// return if no sources in the list
			return;
		}

		// temporary keep all waiting sources
		List<Interface> tmpList = new LinkedList<Interface>(interfacesWaitingForInstantiation);

		// clear the list
		interfacesWaitingForInstantiation.clear();

		for(Interface waiting : tmpList)
		{
			// maybe puts it on the waiting list again
			createInterfaceService(waiting);
		}
	}

	/**
	 * Removes the kept reference to a interface factory service.
	 */
	public void unsetInterfaceFactory()
	{
		this.interfaceFactory = null;
	}


	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl#update()
	 */
	@Override
	public void update() {
		// TODO: Maintain source active state also for mashup
		//super.update();
		
		// get all created source services
		Collection<SourceServiceFacade> services = sourceServices.values();

		if(services == null)
		{
			log("No valid services created by mashup configuration, could not enrich", LogService.LOG_ERROR);
			return;
		}

		// update all source services
		for(SourceServiceFacade service : services)
		{
			log("Updating data with source service " + service.getConfiguration().getName(), LogService.LOG_INFO);
			try {
				service.update();
			} catch (Exception e) {
				log("Exception while updating data with source service " + service, LogService.LOG_ERROR);
			}
		}		
	}
	
	/**
	 * Checks and prepares the structure of the working directory.
	 * 
	 * @param workingDirectoryPath Configured path of the working directory
	 * @return True if the working directory structure is valid, false otherwise.
	 */
	private boolean prepareWorkingDirectory(String workingDirectoryPath) {
		
		if(workingDirectoryPath == null)
		{
			// not set, so nothing to do
			return false;
		}
		
		String directoryPath = workingDirectoryPath;
		
		// ensure directory path ends with file separator
		if(!directoryPath.endsWith(fileSeparator))
		{
			directoryPath = directoryPath + fileSeparator;
		}
		
		// prepare base working directory
		workingDirectory = prepareDirectory(directoryPath);
		
		if(workingDirectory == null)
		{
			return false;
		}
		
		// prepare sub directories
		
		// prepare data directory
		String dataDirectoryPath = directoryPath + DEFAULT_DATA_FOLDER;
		dataDirectory = prepareDirectory(dataDirectoryPath);
		
		if(dataDirectory == null)
		{
			return false;
		}
		
		// prepare data backup directory
		String dataBackupDirectoryPath = directoryPath + DEFAULT_DATA_BACKUP_FOLDER;
		dataBackupDirectory = prepareDirectory(dataBackupDirectoryPath);
		
		if(dataBackupDirectory == null)
		{
			return false;
		}
		
		// prepare attachment cache directory
		String attachmentDirectoryPath = directoryPath + DEFAULT_ATTACHMENT_FOLDER;
		attachmentsCacheDirectory = prepareDirectory(attachmentDirectoryPath);
		
		if(attachmentsCacheDirectory == null)
		{
			return false;
		}
		
		return true;
		
	}

	/**
	 * Checks if the directory with the given path already exists, otherwise creates it.
	 * 
	 * @param directoryPath Path of the directory to be prepared
	 * @return The directory or null if the directory does not exist and can not be created.
	 */
	private File prepareDirectory(String directoryPath) {
		
		File directory = new File(directoryPath);
	
		if(directory.exists())
		{
			// nothing to be done if working directory already exists
			return directory;
		}
		else
		{
			try {
				// try to create directory
				boolean directoryPrepared = directory.mkdirs();
				if(!directoryPrepared)
				{
					log("Directory " + directoryPath + " could not be created.", LogService.LOG_ERROR);
					return null;
				}
				else
				{
					log("Created directory " + directoryPath, LogService.LOG_INFO);
				}
			} catch (Exception e) {
				log("Directory " + directoryPath + " could not be created due to exception (" + e.getMessage() + ")", LogService.LOG_ERROR);
				return null;
			}
		}
		return directory;
	}
}
