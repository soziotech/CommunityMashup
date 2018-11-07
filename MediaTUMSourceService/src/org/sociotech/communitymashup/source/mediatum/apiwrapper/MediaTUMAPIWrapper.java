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
package org.sociotech.communitymashup.source.mediatum.apiwrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.security.MessageDigest;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.osgi.service.log.LogService;

import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.sociotech.communitymashup.source.mediatum.apiwrapper.items.Node;
import org.sociotech.communitymashup.source.mediatum.apiwrapper.items.Response;


public class MediaTUMAPIWrapper {
	
	/**
	 * Reference to the source service for logging.
	 */
	private SourceServiceFacadeImpl sourceService;
	
	/**
	 * Url for accessing the MediaTUM server.
	 */
	private String baseUrl = null;
		
	/**
	 * API cache file prefix
	 */
	private final String cacheFilePrefix;
	
	
	/**
	 * Creates the api wrapper. 
	 * 
	 * @param baseUrl API base url
	 */
	public MediaTUMAPIWrapper(String baseUrl, String cacheFilePrefix, SourceServiceFacadeImpl sourceService) {
		this.sourceService = sourceService;
		this.baseUrl = baseUrl;
		this.cacheFilePrefix = cacheFilePrefix;
	}
	
	/**
	 * Returns the base URL.
	 * @return The base URL.
	 */
	public String getBaseUrl() {
		return baseUrl;
	}
	
	/**
	 * Fetches all MediaTUM objects and returns them as result object.
	 * 
	 * @return All objects, null in error case.
	 */
	public List<Node> getAllObjects()
	{
		try {		
			// parse xml file
			JAXBContext context = JAXBContext.newInstance(Response.class);
			Unmarshaller um = context.createUnmarshaller();
			
			// check if cache file exists (should be used) - DEBUG
			if (cacheFilePrefix != null && !cacheFilePrefix.isEmpty()) {
				String cacheFileName = cacheFilePrefix + "objects.xml";
				File f = new File(cacheFileName);
				if (f.exists()) {
					sourceService.log("Loading MediaTUM data from cache file: " + f.getAbsolutePath(), LogService.LOG_DEBUG);
					InputStreamReader in = new InputStreamReader(new FileInputStream(f), "UTF-8");
					List<Node> result = (List<Node>)((Response)um.unmarshal(in)).getNodeList();
					return result;
				}
			}
			
			String url = baseUrl + "/allchildren/?format=xml";
				
			sourceService.log("Loading MediaTUM data from server: " + url, LogService.LOG_DEBUG);
			URL website = new URL(url);
			InputStreamReader in = null;
				
			// should data be saved in cache file? - DEBUG
			if (cacheFilePrefix != null && !cacheFilePrefix.isEmpty()) {
				String cacheFileName = cacheFilePrefix + "objects.xml";
				sourceService.log("Saving MediaTUM data to cache file: " + cacheFileName, LogService.LOG_DEBUG);
				// copy file to output
				ReadableByteChannel rbc = Channels.newChannel(website.openStream());
				FileOutputStream fos = new FileOutputStream(cacheFileName);
				fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
				// open file to read from
				in = new InputStreamReader(new FileInputStream(cacheFileName), "UTF-8");
			} 
			else {
				in = new InputStreamReader(website.openStream(), "UTF-8");	
			}
				
			sourceService.log("Parsing MediaTUM data", LogService.LOG_DEBUG);

			List result = ((Response)um.unmarshal(in)).getNodeList();
				
			// sourceService.log("Loaded data: "+result.toString(), LogService.LOG_DEBUG);
			
			return result;
			
		} catch(Exception e) {
			sourceService.log("Could not load data from MediaTUM: " + e.toString(), LogService.LOG_ERROR);
			e.printStackTrace();
		}
		
		return null;
	}

}
