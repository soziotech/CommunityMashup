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
package org.sociotech.communitymashup.mashup.factory.impl;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.ApplicationFactory;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.application.Mashup;
import org.sociotech.communitymashup.application.MashupContainer;
import org.sociotech.communitymashup.configuration.observer.mashupcontainer.ContainerChangeObserver;
import org.sociotech.communitymashup.configuration.observer.mashupcontainer.ContainerChangedInterface;
import org.sociotech.communitymashup.mashup.facade.MashupServiceFacade;
import org.sociotech.communitymashup.mashup.factory.facade.MashupFactoryFacade;
import org.sociotech.communitymashup.mashup.instantiation.facade.MashupInstantiationFacade;

/**
 * @author Peter Lachenmaier
 *
 * The Mashup Factory produces Mashups. It looks for a Mashup Instantiation Service and uses this
 * Service to create instances based on a given configuration. The Mashup Factory maintains a 
 * {@link MashupContainer} for all produced mashups.
 */
public class MashupFactoryImpl implements MashupFactoryFacade, ContainerChangedInterface {
	
	/**
	 * Local reference to an mashup instantiation service. This one will be used to produce mashups.
	 * Make sure to maintain the reference by using {@link #setMashupInstantiationService(MashupInstantiationFacade)}
	 * and {@link #unsetInstantiationService()}
	 */
	private MashupInstantiationFacade instantiationService = null;

	/**
	 * This list contains mashups that are currently not instantiated due to missing instantiation service.
	 */
	private List<Mashup> openMashups;
	
	/**
	 * This mashup container will be maintained and contains the configuration of all instantiated mashups. 
	 */
	private MashupContainer mashupContainer = null;
	
	/**
	 * A Map containing all produced Mashups, uses the configuration as key.
	 */
	private Map<Mashup, MashupServiceFacade> producedMashups;
	
	private static String fileSeparator = System.getProperty("file.separator");
	
	private static final String DEFAULT_CONFIGURATION_FOLDER = "configuration" + fileSeparator;
	private static final String DEFAULT_MASHUPS_FOLDER = "mashups" + fileSeparator;
	private static final String DEFAULT_CONFIGURATION_BACKUP_FOLDER = DEFAULT_CONFIGURATION_FOLDER + "backup" + fileSeparator;
	private static final String DEFAULT_CONFIGURATION_FILENAME = "configuration.xml";
	
	private File workingDirectory = null;
	private File configurationDirectory = null;
	private File configurationBackupDirectory = null;
	private File mashupsDirectory = null;
	
	/**
	 * This flag indicates if changed configurations can be saved.
	 * Bundled configuration can not be saved and external created can be.
	 */
	private boolean canSave = false;

	/**
	 * This indicates if there is a pending change that need to be saved.
	 */
	private boolean needSave = false;
	
	/**
	 * This indicates if there is a pending change that need to be backuped.
	 */
	private boolean needBackup;
	
	/**
	 * Indicates if configuration changes should be saved. This is derived from the configuration.
	 */
	private boolean shouldSave = false;
	
	/**
	 * Indicates if configuration changes should be saved immediately instead of in the backup task
	 */
	private boolean saveImmediately = false;
	
	/**
	 * Time interval for backing up configuration
	 */
	long backupInterval = 0; 
	
	/**
	 * Reference to the observer for container changes.
	 */
	private ContainerChangeObserver containerChangeObserver;

	/**
	 * Reference to the backup thread.
	 */
	private ConfigurationBackupThread backupThread;

	/**
	 * The file name used for the configuration
	 */
	private String configurationFileName;

	/**
	 * Reference to the loaded configuration resource
	 */
	private Resource configurationResource;
	
	/**
	 * Creates a new mashup factory.
	 */
	public MashupFactoryImpl() {
		// create empty collections
		openMashups 	= new LinkedList<Mashup>();
		producedMashups = new HashMap<Mashup, MashupServiceFacade>();
		
		// load configuration from bundled or external configuration file if available
		loadConfigurationIfAvailable();	
	}
	
	
	/**
	 * Loads the mashup configurations either from the bundled configuration or from configured external file.
	 */
	private void loadConfigurationIfAvailable() {
		
		String workingDirectory = System.getProperty("org.sociotech.communitymashup.configuration.workingdirectory");
		if(workingDirectory != null) {
			// working directory set, so prepare structure
			boolean validWorkingDirectory = prepareWorkingDirectory(workingDirectory);
		
			if(!validWorkingDirectory)
			{
				log("Working directory can not be set up, so no configuration will be loaded.", LogService.LOG_ERROR);
				// stoping
				return;
			}
			
			// working directory is valid, so we can save
			canSave = true;
		}
		
		configurationFileName = System.getProperty("org.sociotech.communitymashup.configuration.file");
		
		// check if a configuration was set as system property
		if(configurationFileName == null)
		{
			// not set, so set is to default
			configurationFileName = DEFAULT_CONFIGURATION_FILENAME;
		}
		
		URI configurationURI = null;
				
		
		if(configurationDirectory == null)
		{
			// no configuration directory set, so create URI for bundled configuration
			String resourcePath = fileSeparator + DEFAULT_CONFIGURATION_FOLDER + configurationFileName;
			
			// resource pathes must always be separated by slashes
			resourcePath = resourcePath.replace(fileSeparator, "/");
			URL bundledConfigurationURL = getClass().getResource(resourcePath);
			try
			{
				configurationURI = URI.createURI((bundledConfigurationURL.toURI().toString()));
			}
			catch (Exception e) {
				log("Could not load bundled configuration from " + configurationFileName, LogService.LOG_ERROR);
				return;
			}
		}
		else
		{
			// configuration directory set, so create URI for external configuration file
			File configurationFile = new File(configurationDirectory, configurationFileName);
			
			if(!configurationFile.exists())
			{
				// configuration does not exist yet, so create an empty configuration
				createEmptyConfigurationFile(configurationFile);
			}
			
			try
			{
				configurationURI = URI.createFileURI(configurationFile.getAbsolutePath());
			}
			catch (Exception e) {
				log("Could not load external configuration from " + configurationFile.getAbsolutePath(), LogService.LOG_ERROR);
				return;
			}
		}
		
		// produce if this is a valid uri
		produceFromConfigurationURI(configurationURI);
	}

	/**
	 * Creates an empty mashup container and saves it at the given file.
	 * 
	 * @param configurationFile File to store the configuration
	 */
	private void createEmptyConfigurationFile(File configurationFile) {
		// create resource set and resource 
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",  new XMLResourceFactoryImpl());

		Resource resource = resourceSet.createResource(URI.createFileURI(configurationFile.getAbsolutePath()));

		// Create empty mashup container
		MashupContainer mashupContainer = createEmptyConfiguration();

		// add the mashup container as root object to the resource
		resource.getContents().add(mashupContainer);

		// serialize resource
		try {
		    resource.save(null);
		} catch (IOException e) {
		    log("Could not write file with empty configuration. (" + e.getMessage() +")", LogService.LOG_ERROR);
		    return;
		}
		
		log("Created new empty configuration at " + configurationFile.getAbsolutePath(), LogService.LOG_INFO);
	}


	/**
	 * Creates an new mashup container as empty configuration.
	 * 
	 * @return The created mashup container
	 */
	private MashupContainer createEmptyConfiguration() {
		
		ApplicationFactory applicationFactory = ApplicationPackage.eINSTANCE.getApplicationFactory();
		// create mashup container
		MashupContainer mashupContainer = applicationFactory.createMashupContainer();
		
		return mashupContainer;
	}


	/**
	 * Checks and prepares the structure of the working directory.
	 * 
	 * @param workingDirectoryPath Configured path of the working directory
	 * @return True if the working directory structure is valid, false otherwise.
	 */
	private boolean prepareWorkingDirectory(String workingDirectoryPath) {
		
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
		
		// prepare mashups directory
		String mashupsDirectoryPath = directoryPath + DEFAULT_MASHUPS_FOLDER;
		mashupsDirectory = prepareDirectory(mashupsDirectoryPath);
		
		if(mashupsDirectory == null)
		{
			return false;
		}
		
		// all subdirectories for concrete mashups will be created by the mashups themself
		
		// prepare configuration directory
		String configurationDirectoryPath = directoryPath + DEFAULT_CONFIGURATION_FOLDER;
		configurationDirectory = prepareDirectory(configurationDirectoryPath);
		
		if(configurationDirectory == null)
		{
			return false;
		}
		
		// prepare configuration backup directory
		String configurationBackupDirectoryPath = directoryPath + DEFAULT_CONFIGURATION_BACKUP_FOLDER;
		configurationBackupDirectory = prepareDirectory(configurationBackupDirectoryPath);
		
		if(configurationBackupDirectory == null)
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


	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.mashup.factory.facade.MashupFactoryFacade#produceMashup(de.unibw.cscm.communitymashup.application.Mashup)
	 */
	@Override
	public MashupServiceFacade produceMashup(Mashup mashupConfiguration)
	{
		if(mashupConfiguration == null)
		{
			// illegal configuration
			return null;
		}
		
		if(producedMashups.containsKey(mashupConfiguration))
		{
			// already produced
			log("Already produce mashup " + mashupConfiguration, LogService.LOG_WARNING);
			return producedMashups.get(mashupConfiguration);
		}
		
		if(instantiationService == null)
		{
			// no instantiation service available, so keep configuration for later creation
			openMashups.add(mashupConfiguration);
			
			log("Keeping mashup " + mashupConfiguration.getName() + " for later production.", LogService.LOG_DEBUG);
			
			return null;
		}
		
		// prepare working directory if possible
		prepareSingleMashupWorkingDirectory(mashupConfiguration);
		
		// instantiate mashup
		MashupServiceFacade newMashupService = instantiationService.instantiate(mashupConfiguration);
		
		// store the created mashup
		producedMashups.put(mashupConfiguration, newMashupService);
		
		log("Produced Mashup with name: " + mashupConfiguration.getName(), LogService.LOG_DEBUG);
		
		// and register it
		newMashupService.register();

		// and return it
		return newMashupService;
	}


	/**
	 * If a name is set and a external working director is set, than a directory with the mashups name is
	 * prepared in the mashupsdirectory. The absolute path of the directory will be set in the mashup configuration
	 * as working directory.
	 * 
	 * @param mashupConfiguration Configuration of the mashup.
	 */
	private void prepareSingleMashupWorkingDirectory(Mashup mashupConfiguration) {
		String mashupIdent = mashupConfiguration.getIdent();
		
		// if we have a mashups directory, prepare a seperate one for every mashup
		if(mashupsDirectory != null && mashupIdent != null && !mashupIdent.isEmpty())
		{
			// prepare single mashup working directory with mashup ident
			File mashupDirectory = prepareDirectory(mashupsDirectory.getAbsolutePath() + fileSeparator + mashupIdent);
			// set full path in mashup configuration
			mashupConfiguration.setWorkingDirectory(mashupDirectory.getAbsolutePath());
		}
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.mashup.factory.facade.MashupFactoryFacade#produceMashups(de.unibw.cscm.communitymashup.application.MashupContainer)
	 */
	@Override
	public Map<Mashup, MashupServiceFacade> produceMashups(
			MashupContainer mashupConfigurations) {
		
		if(mashupConfigurations == null)
		{
			// invalid container
			return null;
		}
		
		if(mashupContainer != null)
		{
			// already called with a mashup container
			return null;
			// TODO: maybe merge/recreate containers??
			// Remove services that are no more contained
			// or remove all and newly create
		}
		
		// save this configuration as local mashup container
		mashupContainer = mashupConfigurations;
		
		// interpret the container attributes
		interpretContainerAttributes();
		
		// create observer to react on configuration changes
		containerChangeObserver = new ContainerChangeObserver(mashupContainer, this);
		
		// get all mashup configurations
		EList<Mashup> mashupConfigurationList = mashupConfigurations.getMashups();
		
		if(mashupConfigurationList == null || mashupConfigurationList.isEmpty())
		{
			// producedMashups is empty in this case
			return producedMashups;
		}
		
		for(Mashup configuration : mashupConfigurationList)
		{
			// produce every single mashup
			produceMashup(configuration);
		}
		
		// return all produced
		return producedMashups;
	}


	/**
	 * Interprets the attributes of the set mashup container
	 */
	private void interpretContainerAttributes() {
		
		// interpret attributes
		this.shouldSave 	 = mashupContainer.getBackupConfiguration();
		this.backupInterval  = mashupContainer.getBackupIntervall();
		this.saveImmediately = mashupContainer.getImmediateSave();
		
		// transform s to ms
		this.backupInterval *= 1000;
		
		if(this.shouldSave && this.canSave)
		{
			createBackupThread();
		}
		else if(backupThread != null)
		{
			// stop thread
			backupThread.interrupt();
			backupThread = null;
		}
	}

	/**
	 * Creates and starts a thread to create backups in a configured time interval
	 */
	private void createBackupThread() {
		
		if(this.backupThread == null)
		{
			// create thread
			this.backupThread = new ConfigurationBackupThread(this);
		}
		
		// set backup interval
		this.backupThread.setBackupInterval(this.backupInterval);
		
		if(this.canSave && this.shouldSave)
		{
			// start thread
			this.backupThread.start();
		}
	}


	/**
	 * Sets a reference to a mashup instantiation service which will be used for the creation of mashups.
	 * 
	 * @param mashupInstantiationService 
	 */
	public void setMashupInstantiationService(MashupInstantiationFacade mashupInstantiationService)
	{
		unsetInstantiationService();
		instantiationService = mashupInstantiationService;
		
		if(openMashups.isEmpty())
		{
			// nothing to do
			return;
		}
		
		// There are mashups waiting for production
		
		// temporary keep all open mashups
		LinkedList<Mashup> tmpList = new LinkedList<Mashup>(openMashups);
		
		// clear the list
		openMashups.clear();
		
		log("Got mashup instantiation service.", LogService.LOG_DEBUG);
		
		for(Mashup configuration : tmpList)
		{
			log("Producing mashup: " + configuration.getName(), LogService.LOG_DEBUG);
			
			// produce every single mashup
			// will be re-added to openMashups list if it can not be produced
			produceMashup(configuration);
		}
	}

	/**
	 * Removes the local reference to the mashup instantiation service.
	 */
	public void unsetInstantiationService()
	{
		if(instantiationService == null)
		{
			return;
		}
		
		log("Lost mashup instantiation service", LogService.LOG_DEBUG);
		
		// TODO: add cleanup code here
		instantiationService = null;
	}
	
	/**
	 * Produces the mashup or all mashups in a container defined at the given URI. Uses either 
	 * {@link #produceMashup(Mashup)} or {@link #produceMashups(MashupContainer)}
	 * 
	 * @param configurationURI URI of a configuration resource
	 */
	private void produceFromConfigurationURI(URI configurationURI) {
		
		if(configurationURI == null)
		{
			return;
		}
		
		// create resource set and resource 
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register XML resource factory
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",  new XMLResourceFactoryImpl());

        configurationResource = resourceSet.createResource(configurationURI);
		
		// register package in local resource registry
        String nsURI = ApplicationPackage.eINSTANCE.getNsURI();
		resourceSet.getPackageRegistry().put(nsURI, ApplicationPackage.eINSTANCE);
		
		// load resource 
		try 
		{
			configurationResource.load(null);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
			log("No valid configuration available at: " + configurationURI, LogService.LOG_ERROR);
		}
		
		TreeIterator<EObject> dataIterator = configurationResource.getAllContents();
		
		// Mashup application XML need to contain exactly one mashup container or one mashup 
		if(dataIterator.hasNext())
		{
			EObject workingObject = dataIterator.next();
			
			if(workingObject instanceof Mashup)
			{
				log("Loaded single mashup configuration from " + configurationURI.path(), LogService.LOG_DEBUG);
				
				// produce the mashup
				produceMashup((Mashup) workingObject);
			}
			else if(workingObject instanceof MashupContainer)
			{
				log("loading mashups from container in " + configurationURI.path(), LogService.LOG_DEBUG);
				
				// produce all mashups in the container
				produceMashups((MashupContainer) workingObject);
			}
		}
		else
		{
			log("No mashup configuration found in file: " + configurationURI.path(), LogService.LOG_ERROR);
		}
	}

	/**
	 * Logs the given message with the given log level.
	 * 
	 * @param message Message to log
	 * @param level Level of the message
	 */
	public void log(String message, int level) {
		// TODO replace
		System.out.println(message);
	}


	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.mashup.factory.facade.MashupFactoryFacade#getMashupContainer()
	 */
	@Override
	public MashupContainer getMashupContainer() {
		// return the mashup container
		// TODO create new mashup container if it does not exist
		return mashupContainer;
	}


	/**
	 * Stops the mashup factory.
	 */
	public void stop()
	{
		// TODO cleanup, maybe stop existing mashuup
		
		// disconnect observer
		containerChangeObserver.disconnect();
		
		// save configuration
		if(this.canSave && this.needSave)
		{
			saveConfiguration(null);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.configuration.observer.mashupcontainer.ContainerChangedInterface#configurationChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void configurationChanged(Notification notification) {
		log("Got configuration change notification " + notification, LogService.LOG_DEBUG);
		
		Object notifier = notification.getNotifier();
		
		// handle changes to container attributes 
		if(notifier instanceof MashupContainer && notifier == this.mashupContainer)
		{
			// possible change to container attributes -> interpret it
			interpretContainerAttributes();
			
			// handle new or deleted mashups
			if(notification.getEventType() == Notification.ADD && 
			   notification.getFeatureID(MashupContainer.class) == ApplicationPackage.MASHUP_CONTAINER__MASHUPS &&
			   notification.getNewValue() instanceof Mashup)
				
			{
				// new mashup added
				log("Mashup added.", LogService.LOG_DEBUG);
				
				// produce the new mashup
				produceMashup((Mashup) notification.getNewValue());
			}
			else if(notification.getEventType() == Notification.REMOVE && 
					notification.getFeatureID(MashupContainer.class) == ApplicationPackage.MASHUP_CONTAINER__MASHUPS &&
					notification.getOldValue() instanceof Mashup)
			{
				// mashup deleted
				log("Mashup removed.", LogService.LOG_DEBUG);
				
				// destroy mashup
				destroyMashup((Mashup) notification.getOldValue());
			}	
		}
		
		// configuration changed so we can save something
		this.needSave = true;
		this.needBackup = true;
		
		if(saveImmediately && this.canSave)
		{
			// directly save the change
			saveConfiguration(null);
			this.needSave = false;
		}
	}


	/**
	 * Stops and destroys the mashup service for the given mashup configuration.
	 * 
	 * @param mashupConfiguration
	 */
	private void destroyMashup(Mashup mashupConfiguration) {
		if(mashupConfiguration == null)
		{
			return;
		}
		
		MashupServiceFacade mashupService = producedMashups.get(mashupConfiguration);
		
		if(mashupService == null)
		{
			// not produced before
			if(openMashups.contains(mashupConfiguration))
			{
				// dont produce in future
				openMashups.remove(mashupConfiguration);
			}
			return;
		}
		
		// stop the service
		mashupService.stopMashupService();
		
		// remove from produced list
		producedMashups.remove(mashupConfiguration);
	}


	/**
	 * Creates a backup of the current configuration.
	 */
	public void backupConfiguration() {
		
		if(!needBackup || !this.canSave || !this.shouldSave)
		{
			// nothing changed
			return;
		}
		
		log("Creating backup of configuration", LogService.LOG_DEBUG);
		
		Date now = new Date();
		SimpleDateFormat suffix = new SimpleDateFormat("_yyyyMMddHHmmssZ");
		// create file name with date as suffix
		String backupFileName = configurationFileName.replace(".xml", suffix.format(now) + ".xml");
		
		// save backup
		saveConfiguration(configurationBackupDirectory + fileSeparator + backupFileName);
		
		// backuped, so set need backup to false
		this.needBackup = false;
		
		if(this.needSave)
		{
			// no immediate save
			// save configuration
			saveConfiguration(null);
			
			// saved, so set need save to false
			this.needSave = false;
		}
	}


	/**
	 * Saves the configuration at the given path. If path is null the original loaded resource
	 * will be saved.
	 * 
	 * @param configurationPath Path where the configuration will be saved
	 */
	private void saveConfiguration(String configurationPath) {
		String savePath = configurationPath;
		
		if(savePath == null && configurationResource != null)
		{
			log("Saving configuration.", LogService.LOG_DEBUG);
			try {
				configurationResource.save(null);
			} catch (IOException e) {
				log("Could not save configuration due to exception (" + e.getMessage() + ")", LogService.LOG_WARNING);
				return;
			}
		}
		else
		{
			// create resource set and resource 
	        ResourceSet resourceSet = new ResourceSetImpl();

	        // Register XML resource factory
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",  new XMLResourceFactoryImpl());

	        // configuration directory set, so create URI for external configuration file
 			File configurationFile = new File(configurationPath);
 			
 			if(configurationFile.exists())
 			{
 				log("Configuration file already exist, could not backup.", LogService.LOG_WARNING);
 				return;
 			}
 			
 			URI configurationURI;
 			
 			try
 			{
 				configurationURI = URI.createFileURI(configurationFile.getAbsolutePath());
 			}
 			catch (Exception e) {
 				log("Could not load external configuration from " + configurationFile.getAbsolutePath(), LogService.LOG_ERROR);
 				return;
 			}
	        Resource saveResource = resourceSet.createResource(configurationURI);
			
			// register package in local resource registry
	        String nsURI = ApplicationPackage.eINSTANCE.getNsURI();
			resourceSet.getPackageRegistry().put(nsURI, ApplicationPackage.eINSTANCE);
			
			// add configuration copy to resource
			saveResource.getContents().add(EcoreUtil.copy(mashupContainer));
			
			// save resource
			try {
				saveResource.save(null);
			} catch (IOException e) {
				log("Could not save configuration to " + configurationPath + " due to exception (" + e.getMessage() + ")", LogService.LOG_WARNING);
				return;
			}
			
			log("Saved configuration to " + configurationPath, LogService.LOG_DEBUG);
		}
	}
}
