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
package org.sociotech.communitymashup.source.facade;

import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.data.DataSet;

/**
 * This is the interface every Source has to implement to be integrated into the
 * CommunityMashup Environment.
 * 
 * @author Peter Lachenmaier
 * 
 */
public interface SourceServiceFacade {

	/**
	 * Returns whether this source service is initialized or not.
	 * 
	 * @return True if Source Service is initialized
	 */
	public boolean isInitialized();
	
	/**
	 * Needs to be called first to initialize the Source. Uses the default
	 * configuration to start the source.
	 * 
	 * @return true if successful, false otherwise.
	 */
	public boolean initialize();

	/**
	 * Call this method to start {@link #initialize()} asynchronously. After finished
	 * initialization {@link AsynchronousSourceInitialization#sourceInitializationFinished(SourceServiceFacade)}
	 * will be called at the initializer.
	 * 
	 * @param initializer The calling initializer
	 */
	public void initializeAsynchronous(AsynchronousSourceInitialization initializer);
	
	/**
	 * Initializes the source service with the given configuration.
	 * 
	 * @param configuration
	 *            Configuration
	 * @return True if initialization was successful.
	 */
	public boolean initialize(Source configuration);

	/**
	 * Call this method to start {@link #initialize(Source)} asynchronously. After finished
	 * initialization {@link AsynchronousSourceInitialization#sourceInitializationFinished(SourceServiceFacade)}
	 * will be called at the initializer.
	 * 
	 * @param initializer The calling initializer
	 */
	public void initializeAsynchronous(Source configuration, AsynchronousSourceInitialization initializer);
	
	/**
	 * Returns the DataSet of the source for direct data access. If you call
	 * this method with no previous call to {@link #fillDataSet(DataSet)} a new
	 * and empty one will be created and the the source service maintains its
	 * own data set. Otherwise the shared data set given to
	 * {@link #fillDataSet(DataSet)} will be returned.
	 * 
	 * @return DataSet of the source
	 */
	public DataSet getDataSet();

	/**
	 * Instruct the source service to fill up the given data set. This data set
	 * will be maintained during the whole source service lifecycle.
	 * 
	 * @param dataSet
	 *            Data set to fill up with source data.
	 */
	public void fill(DataSet dataSet);

	/**
	 * Instructs the source service to enrich its internal data set with
	 * additional information. {@link #fill(DataSet)} must be called
	 * first.
	 */
	public void enrich();

	/**
	 * Instruct the source service to update the internal data set with new
	 * data. {@link #fill(DataSet)} must be called first.
	 */
	public void update();

	/**
	 * Returns the configuration of this source service.
	 * 
	 * @return The configuration of this source service.
	 */
	public Source getConfiguration();
	
	/**
	 * Stops the source service
	 */
	public void stopSourceService();

}
