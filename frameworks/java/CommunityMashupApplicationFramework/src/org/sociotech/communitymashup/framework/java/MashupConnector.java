/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.framework.java;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.osgi.service.log.LogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sociotech.communitymashup.data.Attachment;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.data.observer.dataset.DataSetChangeObserver;
import org.sociotech.communitymashup.data.observer.dataset.DataSetChangedInterface;
import org.sociotech.communitymashup.framework.java.apiwrapper.CommunityMashupApi;
import org.sociotech.communitymashup.framework.java.asynchronous.AsynchronousProcessorThread;
import org.sociotech.communitymashup.framework.java.definitions.URLConstants;
import org.sociotech.communitymashup.framework.java.exceptions.MashupConnectionException;
import org.sociotech.communitymashup.framework.java.updater.UpdateThread;
import org.sociotech.communitymashup.rest.ProxyUtil;
import org.sociotech.communitymashup.rest.RestUtil;

/**
 * Class to connect to an external CommunityMashup instance. The Mashup
 * connector automatically keeps track of changes in the remote data set.
 * 
 * @author Peter Lachenmaier
 */
public class MashupConnector implements DataSetChangedInterface {

	/**
	 * The minimum value of the poll interval in seconds.
	 */
	public static final int MIN_POLL_INTERVAL = 1;

	/**
	 * Indicates if changes to the local data set should be played back to the
	 * remote data set or not.
	 */
	private boolean playBackChanges = true;

	/**
	 * Wheter to process changes asynchronous or not. 
	 */
	private boolean asynchronous = false;
	
	/**
	 * Contains all notifications which need to be processed asynchronous. 
	 */
	private ConcurrentLinkedQueue<Notification> asynchronousProcessingList = new ConcurrentLinkedQueue<Notification>();
	
	/**
	 * SLF4J Logger to log messages
	 */
	private Logger defaultLogger = null;

	/**
	 * The date of the last performed update
	 */
	private Date lastUpdate = null;

	/**
	 * The date of the last lookup for remote changes (local Time)
	 */
	private Date lastChangeLookup = null;

	/**
	 * The date of the newest change of a loaded item in the remote data set.
	 */
	private Date dateOfLastItemChange = null;

	/**
	 * Interval between poll interval to remote interface in seconds.
	 */
	private int pollInterval = MIN_POLL_INTERVAL;

	/**
	 * Url of the REST interface of the remote CommunityMashup
	 */
	private String remoteURL;

	/**
	 * Reference to the data set.
	 */
	private DataSet dataSet = null;

	/**
	 * Indicates if the data set is already loaded.
	 */
	private boolean loaded = false;

	/**
	 * Reference to api.
	 */
	private CommunityMashupApi api;

	/**
	 * Thread that call this in intervals to poll remote Mashup
	 */
	private UpdateThread updateThread;

	/**
	 * Indicates if the Mashup connector touches the local data set. If touching
	 * is true no changes to the data set will be played back to the server.
	 */
	private boolean touching = false;

	/**
	 * OSGi Log service, if set it is used for logging.
	 */
	private LogService logService = null;

	private AsynchronousProcessorThread asynchronousProcessorThread;

	/**
	 * Whether to load attached files directly.
	 */
	private boolean preLoadAttachedFiles = false;

	/**
	 * Creates a new connector to the CommunityMashup at the given url.
	 * 
	 * @param url
	 *            Url of the XML REST interface of a remote CommunityMashup
	 */
	public MashupConnector(String url) {
		this.remoteURL = url;
		if (!this.remoteURL.endsWith("/")) {
			// must always end with a slash to easily add operations
			this.remoteURL += "/";
		}
		// create api object
		api = new CommunityMashupApi();

		// create adapter
	}

	/**
	 * Creates a new connector to the CommunityMashup at the given url.
	 * 
	 * @param url
	 *            Url of the XML REST interface of a remote CommunityMashup
	 * @param pollInterval
	 *            Interval between two polls to the remote CommunityMashup. 0 or
	 *            below stops the updates.
	 */
	public MashupConnector(String url, int pollInterval) {
		this(url);
		this.setPollInterval(pollInterval);
	}

	/**
	 * Creates a new connector to the CommunityMashup at the given url.
	 * 
	 * @param url
	 *            Url of the XML REST interface of a remote CommunityMashup
	 * @param pollInterval
	 *            Interval between two polls to the remote CommunityMashup. 0 or
	 *            below stops the updates.
	 * @param playBackChanges
	 * 			  Whether to play back the changes to the local data set or ignore them.
	 */
	public MashupConnector(String url, int pollInterval, boolean playBackChanges) {
		this(url);
		this.setPollInterval(pollInterval);
		this.playBackChanges = playBackChanges;
	}

	/**
	 * Returns the interval between two polls.
	 * 
	 * @return The interval between two polls in seconds.
	 */
	public int getPollInterval() {
		return pollInterval;
	}

	/**
	 * Sets the interval between two polls. 0 or below stops polling.
	 * 
	 * @param pollInterval
	 *            Interval between two polls in seconds.
	 */
	public void setPollInterval(int pollInterval) {
		this.pollInterval = pollInterval;
		if (this.pollInterval < MIN_POLL_INTERVAL) {
			// stop polling
			this.pollInterval = 0;
		}
		checkUpdateThread();
	}

	/**
	 * Returns whether pre loading of attached files is enabled or not.
	 * 
	 * @return Whether pre loading of attached files is enabled or not.
	 */
	public boolean isPreLoadAttachedFiles() {
		return preLoadAttachedFiles;
	}

	/**
	 * Setting to true switches on direct loading of attached files.
	 * Works only in combination with switched on caching ({@link DataSet#setCacheFileAttachements(Boolean)}).
	 * 
	 * @param preLoadAttachedFiles True to enable pre loading
	 */
	public void setPreLoadAttachedFiles(boolean preLoadAttachedFiles) {
		this.preLoadAttachedFiles = preLoadAttachedFiles;
		
		// pre load attached files
		preLoadAttachedFiles();		
	}

	/**
	 * Checks if the update thread needs to be stopped or started.
	 */
	private void checkUpdateThread() {
		if (this.pollInterval < MIN_POLL_INTERVAL) {
			if (updateThread != null) {
				// interrupt update thread
				updateThread.interrupt();
			}
			return;
		}

		// updates should be performed

		if (updateThread == null) {
			// create new update thread
			updateThread = new UpdateThread(this);
		}

		// set poll interval
		updateThread.setUpdateInterval(pollInterval);

		// start
		updateThread.start();

	}

	/**
	 * Returns the minimum time between two polls.
	 * 
	 * @return The minimum interval between two polls.
	 */
	public static int getMinPollInterval() {
		return MIN_POLL_INTERVAL;
	}

	/**
	 * Returns the date of the last successful update.
	 * 
	 * @return The date of the last successful update.
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Returns the date of the last lookup for external changes.
	 * 
	 * @return The date of the last lookup for external changes.
	 */
	public Date getLastChangeLookup() {
		return lastChangeLookup;
	}

	/**
	 * Returns the url of the connected CommunityMashup.
	 * 
	 * @return The url of the connected CommunityMashup.
	 */
	public String getRemoteURL() {
		return remoteURL;
	}

	/**
	 * Returns the used osgi log service.
	 * 
	 * @return The used osgi log service, null if none used.
	 */
	public LogService getLogService() {
		return logService;
	}

	/**
	 * Sets the used log service.
	 * 
	 * @param logService Log service to use, null to disable osgi logging.
	 */
	public void setLogService(LogService logService) {
		this.logService = logService;
	}
	
	/**
	 * Returns true if data set changes will be played back asynchronous.
	 *  
	 * @return True if data set changes will be played back asynchronous
	 */
	public boolean isAsynchronous() {
		return asynchronous;
	}

	/**
	 * Set this to true if data set changes should be played back asynchronous.
	 * 
	 * @param asynchronous Whether to play back data set changes asynchronous or not.
	 */
	public void setAsynchronous(boolean asynchronous) {
		this.asynchronous = asynchronous;
	}

	/**
	 * Returns the data set that will be maintained by the connector. If it was
	 * not loaded before, an inital load is performed which may take a while.
	 * 
	 * @return The data set that will be maintained by the connector.
	 * @throws MashupConnectionException
	 *             If an error occurs while connecting the remote server at
	 *             initial load.
	 */
	public DataSet getDataSet() throws MashupConnectionException {
		if (!loaded) {
			performInitialLoad();
		}
		return dataSet;
	}

	/**
	 * Performs an initial load of the whole data set.
	 * 
	 * @throws MashupConnectionException
	 */
	private void performInitialLoad() throws MashupConnectionException {
		if (loaded) {
			// already loaded
			return;
		}

		if(remoteURL.startsWith("file:")) {
			// only for local development
			// load from file
			dataSet = loadExistingDataSet(remoteURL);
		}
		else {
			// load complete data set and set it
			dataSet = api.loadDataSet(remoteURL);
		}

		if (dataSet == null) {
			return;
		}

		// set another ident prefix to do not interfere locally added items with server side items
		dataSet.setIdentPrefix("local_");

		// keep date of successful load
		lastUpdate = new Date();

		// keep last modified date of data set
		dateOfLastItemChange = dataSet.getLastModified();

		// pre load attached files
		preLoadAttachedFiles();
		
		// sucessfully loaded
		loaded = true;

		// add adapter to play back changes if needed
		if(playBackChanges) {
			new DataSetChangeObserver(dataSet, this);
		}
	}

	/**
	 * Loads an existing local data set.
	 * 
	 * @return The loaded data set
	 */
	private DataSet loadExistingDataSet(String localURL) {
		// create resource set and resource 
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",  new XMLResourceFactoryImpl());
		// Register XMI resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",  new XMLResourceFactoryImpl());

		if (localURL.endsWith("/")) {
			localURL = localURL.substring(0, localURL.length()-1);
		}
		File dataSetFile = new File(localURL.replaceFirst("file:", ""));
		
		if(!dataSetFile.exists())
		{
			// could not load
			System.err.println("Could not find local file '"+localURL+"'");
			return null;
		}
		
		URI fileUri = URI.createFileURI(dataSetFile.getAbsolutePath());
		Resource dataSetResource = resourceSet.createResource(fileUri);

		// register package in local resource registry
		String nsURI = DataPackage.eINSTANCE.getNsURI();
		resourceSet.getPackageRegistry().put(nsURI, DataPackage.eINSTANCE);

		// load resource 
		try 
		{
			dataSetResource.load(null);
		} 
		catch (IOException e) {
			System.err.println("Could not load data from local file '"+localURL+"'");
			e.printStackTrace(System.err);
			return null;
		}

		TreeIterator<EObject> dataIterator = dataSetResource.getAllContents();
		
		// Mashup Data XML contains exactly one DataSet
		if(dataIterator.hasNext()) {
			EObject workingObject = dataIterator.next();

			if(workingObject instanceof DataSet) {
				return (DataSet) workingObject;
			}
		}
		
		return null;
	}
	
	/**
	 * Loads the attached files if {@link MashupConnector#preLoadAttachedFiles} is true.
	 */
	private void preLoadAttachedFiles() {
		EList<Attachment> allAttachments = dataSet.getAttachments();
		if(preLoadAttachedFiles && allAttachments != null) {
			for(Attachment attachment : allAttachments) {
				// get file url to start downloading (if caching is enabled)
				attachment.getFileUrl();
			}
		}
	}

	/**
	 * Logs the given message at the given level.
	 * 
	 * @param message
	 *            Message to log
	 * @param level
	 *            Log level according to org.osgi.log LogService
	 */
	public void log(String message, int level) {
		
		if(logService != null)
		{
			// use log service if set
			logService.log(level, message);
			return;
		}
		
		// fallback to slf4j
		if(defaultLogger == null)
		{
			defaultLogger = LoggerFactory.getLogger("org.sociotech.communitymashup.mashupconnector");
		}
		
		switch (level) {
			case LogService.LOG_DEBUG:
				defaultLogger.debug(message);
				break;
			case LogService.LOG_ERROR:
				defaultLogger.error(message);
				break;
			case LogService.LOG_INFO:
				defaultLogger.info(message);
				break;
			case LogService.LOG_WARNING:
				defaultLogger.warn(message);
				break;
			default:
				defaultLogger.info(message);
				break;
		}
	}

	/**
	 * Connects the remote CommunityMashup and performs an update to the data
	 * set if new data is available.
	 */
	public void update() {

		// retrieve last modifiction date (quick method)
		Date remoteLastModified = null;
		try {
			remoteLastModified = api.loadDateObject(remoteURL
					+ URLConstants.GET_LAST_MODIFIED);
		} catch (MashupConnectionException e) {
			log("Could not perform update due to connection exception (" + e.getMessage()
					+ ") on " + e.getConnectionUrl(), LogService.LOG_WARNING);
			return;
		}

		// keep date of lookup
		lastChangeLookup = new Date();

		// check if not yet initialized (threading) or local data set is up to date
		if (dateOfLastItemChange == null || !remoteLastModified.after(dateOfLastItemChange)) {
			return;
		}

		try {
			// load changes and update data set
			loadAndUpdateItems();
		} catch (MashupConnectionException e) {
			log("Could not perform update due to connection exception ("
					+ e.getMessage() + ") on " + e.getConnectionUrl(),
					LogService.LOG_WARNING);
			//e.printStackTrace();
			return;
		}
		catch (Exception e) {
			log("Could not perform update due to exception ("
					+ e.getMessage() + ").",
					LogService.LOG_WARNING);
			//e.printStackTrace();
			return;
		}

		// check if all local items still exist
		try {
			checkForItemExistency();
		} catch (MashupConnectionException e) {
			log("Could not check for existing items due to connection exception ("
					+ e.getMessage() + ") on " + e.getConnectionUrl(),
					LogService.LOG_WARNING);
			e.printStackTrace();
			return;
		}
		catch (Exception e) {
			log("Could not check for existing items to exception ("
					+ e.getMessage() + ").",
					LogService.LOG_WARNING);
			e.printStackTrace();
			return;
		}

		// keep date of successful update
		lastUpdate = new Date();

	}

	/**
	 * Checks if all local items still exists remote and deletes the non existing.
	 * 
	 * @throws MashupConnectionException
	 */
	private void checkForItemExistency() throws MashupConnectionException {
		// retrieve ident list of existing items
		String identList = api.loadStringObject(remoteURL + URLConstants.GET_EXISTING_ITEMS_IDENTS);

		if(identList == null || identList.isEmpty())
		{
			return;
		}

		// split the list
		String[] idents = identList.split(",");

		// create lookup set for better performance
		HashSet<String> lookUpSet = new HashSet<String>(Arrays.asList(idents));

		// duplicate list to allow changes to the original items list
		List<Item> runList = new LinkedList<Item>(dataSet.getItems());

		for(Item localItem : runList)
		{
			if(!lookUpSet.contains(localItem.getIdent()))
			{
				// item does not exist on the server side
				localDelete(localItem);
			}
		}
	}

	private void localDelete(Item itemToDelete) {
		// indicate that we are changing the data set to not play back
		// the change to the server again
		touching = true;

		// delete the item
		try {
			log("Deleting item " + itemToDelete.getIdent(), LogService.LOG_DEBUG);
			itemToDelete.delete();
		} catch (Exception e) {
			// do nothing
		}
		finally	{
			// always reset touch
			touching = false;
		}
	}

	/**
	 * Loads all items modified since the last modified local item.
	 * 
	 * @throws MashupConnectionException
	 */
	private void loadAndUpdateItems() throws MashupConnectionException {

		if (dateOfLastItemChange == null) {
			// last item change date needed
			return;
		}

		// create url
		String itemsModifiedSinceUrl = remoteURL
				+ URLConstants.GET_ITEMS_MODIFIED_SINCE;
		// encode date
		itemsModifiedSinceUrl = String.format(itemsModifiedSinceUrl,
				RestUtil.toDateString(dateOfLastItemChange));

		// retrieve modified items
		EList<Item> modifiedItems = api.loadItems(itemsModifiedSinceUrl);

		if (modifiedItems == null || modifiedItems.isEmpty()) {
			// no changes
			return;
		}

		// step over all items and split in new and changed
		List<Item> newItems = new LinkedList<Item>();
		List<Item> changedItems = new LinkedList<Item>();

		for (Item modifiedItem : modifiedItems) {
			// keep newest modification date
			if(dateOfLastItemChange.before(modifiedItem.getLastModified()))
			{
				dateOfLastItemChange = new Date(modifiedItem.getLastModified().getTime());
			}

			// look if data set contains the item
			Item existingItem = dataSet.getItemsWithIdent(modifiedItem.getIdent());
			if(existingItem != null)
			{
				changedItems.add(modifiedItem);
			}
			else
			{
				newItems.add(modifiedItem);
			}
		}

		// step over all new items
		for(Item newItem : newItems)
		{
			// resolve proxies in new item
			Item resolvedItem = ProxyUtil.resolveProxies(newItem, dataSet);

			// and add it
			localAdd(resolvedItem);

			log("Added item " + newItem.getIdent(), LogService.LOG_DEBUG);
		}

		// step over all changed items
		for (Item changedItem : changedItems) {

			// look if the item exists locally
			Item existingItem = dataSet.getItemsWithIdent(changedItem.getIdent());

			// existing item -> update it
			// and add it
			localUpdate(changedItem, existingItem);

			log("(External) Updated item " + changedItem.getIdent(), LogService.LOG_DEBUG);
		}
	}

	/**
	 * Add the given item to the data set.
	 * 
	 * @param itemToAdd Item to add.
	 */
	private void localAdd(Item itemToAdd) {
		touching = true;
		try {
			dataSet.forceAdd(itemToAdd);
			postProcessItem(itemToAdd);
		} catch (Exception e) {
			log("(Local) Error while adding item " + itemToAdd + " (" + e.getMessage() + ")", LogService.LOG_WARNING);
		}
		finally {
			touching = false;
		}
	}

	/**
	 * Processes an item after adding locally.
	 * 
	 * @param itemToAdd Item to process
	 */
	private void postProcessItem(Item itemToAdd) {
		if(itemToAdd == null) {
			return;
		}
		
		if(preLoadAttachedFiles && itemToAdd instanceof Attachment) {
			// get file url to start file download
			((Attachment) itemToAdd).getFileUrl();
		}
	}

	/**
	 * Updates the item to update with the updated item.
	 * 
	 * @param updatedItem Updated item
	 * @param itemToUpdate Item to update
	 */
	private void localUpdate(Item updatedItem, Item itemToUpdate) {
		touching = true;
		try {
			// automatically resolves all proxies
			itemToUpdate.forceUpdate(updatedItem);
		} catch (Exception e) {
			log("(Local) Error while updating item " + updatedItem + " (" + e.getMessage() + ")", LogService.LOG_WARNING);
			//e.printStackTrace();
		}
		finally {
			touching = false;
		}
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.observer.dataset.DataSetChangedInterface#dataSetChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void dataSetChanged(Notification notification) {
		if(touching)
		{
			// do not playback own changes
			return;
		}

		if(notification == null)
		{
			return;
		}

		// process asynchronous or directly
		if(asynchronous)
		{
			processDataSetChangeAsynchronous(notification);
		}
		else
		{
			processDataSetChange(notification);
		}
	}

	/**
	 * Adds the data set change described by the notification to the queue to be
	 * processed asynchronous.
	 * 
	 * @param notification Notification describing the data set change
	 */
	private void processDataSetChangeAsynchronous(Notification notification) {
		// maybe start the thread
		checkAsynchronousThread();
		
		// add notification to queue
		asynchronousProcessingList.add(notification);
	}

	/**
	 * Starts the asynchronous thread if it is not running.
	 */
	private void checkAsynchronousThread() {
		if(asynchronousProcessorThread != null)
		{
			// everything ok
			return;
		}
		
		// create and start thread
		asynchronousProcessorThread = new AsynchronousProcessorThread(this);
		asynchronousProcessorThread.start();
	}

	/**
	 * @param notification
	 */
	private void processDataSetChange(Notification notification) {
		// interpret changes to call the right api method
		if(notification.getNotifier() == dataSet && notification.getFeatureID(DataSet.class) == DataPackage.DATA_SET__ITEMS)
		{
			if(notification.getEventType() == Notification.REMOVE && notification.getOldValue() != null && notification.getOldValue() instanceof Item) {
				// item deleted -> delete remote
				Item deletedItem = (Item) notification.getOldValue();
				String deleteUrl = remoteURL + URLConstants.DELETE_ITEM;
				// encode ident
				String.format(deleteUrl, deletedItem.getIdent());
				try {
					api.loadItems(deleteUrl);
				} catch (MashupConnectionException e) {
					log("Could not delete item " + deletedItem.getIdent() + " remotely due to mashup exception " + e.getMessage() + " on " + e.getConnectionUrl(), LogService.LOG_WARNING);
					return;
				}
				catch (Exception e) {
					log("Could not delete item " + deletedItem.getIdent() + " remotely due to exception " + e.getMessage() + " on " + deleteUrl, LogService.LOG_WARNING);
					return;
				}

				log("Deleted item " + deletedItem.getIdent(), LogService.LOG_DEBUG);
			}
			else if(notification.getEventType() == Notification.ADD && notification.getNewValue() != null && notification.getNewValue() instanceof Item) {
				// item added -> add remote -> may lead to a merge
				Item addedItem = (Item) notification.getNewValue();
				String addUrl = remoteURL + URLConstants.ADD_ITEM_POST;
				Item resultItem = null;
				try {
					resultItem = api.pushItem(addUrl, addedItem);
				} catch (MashupConnectionException e) {
					log("Could not add item " + addedItem + " remotely due to mashup exception " + e.getMessage() + " on " + e.getConnectionUrl(), LogService.LOG_WARNING);
					return;
				}
				catch (Exception e) {
					log("Could not add item " + addedItem + " remotely due to exception " + e.getMessage() + " on " + addUrl, LogService.LOG_WARNING);
					return;
				}

				if(resultItem != null)
				{
					log("Added item " + resultItem.getIdent(), LogService.LOG_DEBUG);
					// update with result item, add always return the new version
					// look if we already have an item with the ident of the result (merge on server)
					Item updatableItem = dataSet.getItemsWithIdent(resultItem.getIdent());
					if(updatableItem == null)
					{
						// no existing item so update added item
						updatableItem = addedItem;
					}
					else
					{
						// delete added item
						localDelete(addedItem);
					}
					localUpdate(resultItem, updatableItem);
				}
				else
				{
					log("Item " + addedItem + " could not be added! -> maybe incosistent dataset", LogService.LOG_WARNING);
				}
			}
		}
		else if(notification.getNotifier() != null && notification.getNotifier() instanceof Item) {
			// change of an item inside the data set
			//System.out.println("Change " + notification);
			
			// item changed -> force change remote
			Item changedItem = (Item) notification.getNotifier();
			
			String updateUrl = remoteURL + URLConstants.FORCE_UPDATE_ITEM_POST;
			
			// encode ident
			updateUrl = String.format(updateUrl, changedItem.getIdent());
			
			Item resultItem = null;
			try {
				resultItem = api.pushItem(updateUrl, changedItem);
			} catch (MashupConnectionException e) {
				log("Could not update item " + changedItem + " remotely due to mashup exception " + e.getMessage() + " on " + e.getConnectionUrl(), LogService.LOG_WARNING);
				return;
			}
			catch (Exception e) {
				log("Could not update item " + changedItem + " remotely due to exception " + e.getMessage() + " on " + updateUrl, LogService.LOG_WARNING);
				return;
			}

			if(resultItem != null)
			{
				log("Updated item " + resultItem.getIdent(), LogService.LOG_DEBUG);
				
				// update with result item, update may change values
				localUpdate(resultItem, changedItem);
			}
			else
			{
				log("Item " + changedItem + " could not be updated! -> maybe incosistent dataset", LogService.LOG_WARNING);
			}
		}
	}

	/**
	 * Processes all notifications in the asynchronous processing list.
	 */
	public void processAsynchronous() {
		while(!asynchronousProcessingList.isEmpty())
		{
			// get element and process it as long as the queue has elements
			processDataSetChange(asynchronousProcessingList.remove());
		}
	}
}
