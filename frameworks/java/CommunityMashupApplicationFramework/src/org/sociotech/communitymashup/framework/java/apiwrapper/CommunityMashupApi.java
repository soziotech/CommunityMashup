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
package org.sociotech.communitymashup.framework.java.apiwrapper;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.framework.java.exceptions.MashupConnectionException;
import org.sociotech.communitymashup.rest.RestUtil;

/**
 * Offers basic access methods to remote CommunityMashup REST Api
 * 
 * @author Peter Lachenmaier
 */
public class CommunityMashupApi {

	/**
	 * Deserializes a list of items from a xmi resource and returns the contained
	 * items. Null if an error occurs.
	 * 
	 * @param url
	 *            Url of the external xmi resource
	 * 
	 * @return A list of items loaded from the external resource.
	 * 
	 * @throws MashupConnectionException
	 *             If data set could not be loaded.
	 */
	public EList<Item> loadItems(String url) throws MashupConnectionException {
		if (url == null || url.isEmpty()) {
			return null;
		}

		URI remoteUri = URI.createURI(url);

		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XMI resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());

		Resource resource = resourceSet.createResource(remoteUri);

		// register package in local resource registry
		String nsURI = DataPackage.eINSTANCE.getNsURI();
		resourceSet.getPackageRegistry().put(nsURI, DataPackage.eINSTANCE);

		// load resource
		try {
			resource.load(null);
		} catch (IOException e) {
			throw new MashupConnectionException(e.getMessage(), url);
		}

		TreeIterator<EObject> dataIterator = resource.getAllContents();

		EList<Item> allItems = new BasicEList<Item>();
		
		// look at all data and add items to the list
		while(dataIterator.hasNext()) {
			EObject workingObject = dataIterator.next();

			if (workingObject instanceof Item) {
				allItems.add((Item) workingObject);
			}
		}

		return allItems;
	}

	/**
	 * Calls the given url with post and encodes the given item as post parameter.
	 * 
	 * @param url Url to call
	 * @param item Item to add as post parameter
	 * @return The deserialized result
	 * 
	 * @throws MashupConnectionException Exception indicating a connection problem.
	 */
	public Item pushItem(String url, Item item) throws MashupConnectionException {
		if (url == null || url.isEmpty() || item == null) {
			return null;
		}

		String xmlItem = xml(item);
		
		if( xmlItem == null || xmlItem.isEmpty())
		{
			// no serialisation
			return null;
		}
		
		// call mashup with serialized item as post parameter
		String resultXML = doPost(url, xmlItem);

		if(resultXML == null || resultXML.isEmpty())
		{
			// no result
			return null;
		}
		
		// create uri representing the local result item
		URI resultUri = URI.createURI("http://localhost/item.xmi");

		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XMI resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());

		Resource resource = resourceSet.createResource(resultUri);

		// register package in local resource registry
		String nsURI = DataPackage.eINSTANCE.getNsURI();
		resourceSet.getPackageRegistry().put(nsURI, DataPackage.eINSTANCE);

		// load resource from post result
		try {
			resource.load(new ByteArrayInputStream(resultXML.getBytes()), null);
		} catch (IOException e) {
			throw new MashupConnectionException(e.getMessage(), url);
		}

		TreeIterator<EObject> dataIterator = resource.getAllContents();

		Item resultItem = null;
		
		// look at all data and add items to the list
		if(dataIterator.hasNext()) {
			EObject workingObject = dataIterator.next();

			if (workingObject instanceof Item) {
				resultItem = (Item) workingObject;
			}
		}

		return resultItem;
	}
	
	/**
	 * Deserializes an data set from an xmi resource and returns the contained
	 * items. Null if an error occurs.
	 * 
	 * @param url
	 *            Url of the external xmi resource
	 * 
	 * @return A list of items loaded from the external resource.
	 * 
	 * @throws MashupConnectionException
	 *             If data set could not be loaded.
	 */
	public DataSet loadDataSet(String url) throws MashupConnectionException {
		if (url == null || url.isEmpty()) {
			return null;
		}

		URI remoteUri = URI.createURI(url);

		// create resource set and resource
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XMI resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new XMIResourceFactoryImpl());

		Resource resource = resourceSet.createResource(remoteUri);

		if(resource == null) {
			throw new MashupConnectionException("Could not create emf resource", url);
		}
		
		// register package in local resource registry
		String nsURI = DataPackage.eINSTANCE.getNsURI();
		resourceSet.getPackageRegistry().put(nsURI, DataPackage.eINSTANCE);

		// load resource
		try {
			resource.load(null);
		} catch (IOException e) {
			throw new MashupConnectionException(e.getMessage(), url);
		}

		TreeIterator<EObject> dataIterator = resource.getAllContents();

		// Mashup Data XML contains exactly one DataSet
		if (dataIterator.hasNext()) {
			EObject workingObject = dataIterator.next();

			if (workingObject instanceof DataSet) {
				return (DataSet) workingObject;
			}
		}

		return null;
	}

	/**
	 * Loads an object as String from the given url.
	 * 
	 * @param url
	 *            Url with string return.
	 * @return The string value returned by the given url.
	 * 
	 * @throws MashupConnectionException
	 *             If an error appears while connecting to the url.
	 */
	public String loadStringObject(String url) throws MashupConnectionException {
		return doGet(url);
	}

	/**
	 * Loads an object from the given url and tries to interpret it as date.
	 * 
	 * @param url
	 *            Url with date return.
	 * @return The date value returned by the given url.
	 * 
	 * @throws MashupConnectionException
	 *             If an error appears while connecting to the url.
	 */
	public Date loadDateObject(String url) throws MashupConnectionException {
		// load as string
		String dateString = loadStringObject(url);

		if (dateString == null) {
			return null;
		}

		// parse
		try {
			Date result = RestUtil.fromDateString(dateString);
			return result;
		} catch (Exception e) {
			throw new MashupConnectionException(e.getMessage(), url);
		}
	}

	/**
	 * Processes a get request against the given url.
	 * 
	 * @param url
	 *            Url for the get request.
	 * @return The response as string
	 * @throws MashupConnectionException
	 *             If connection was not successful
	 */
	private String doGet(String url) throws MashupConnectionException {
		// System.out.println("calling: " + url);

		String result = null;

		HttpClient httpClient = new DefaultHttpClient();

		HttpGet get = new HttpGet(url);

		ResponseHandler<String> responseHandler = new BasicResponseHandler();

		try {
			result = httpClient.execute(get, responseHandler);
		} catch (Exception e) {
			throw new MashupConnectionException(e.getMessage(), url);
		} finally {
			// client is no longer needed
			httpClient.getConnectionManager().shutdown();
		}

		// System.out.println("got: " + result);

		return result;
	}

	/**
	 * Processes a post request against the given url.
	 * 
	 * @param url
	 *            Url for the get request.
	 * @param parameterString All parameters serialized in a string
	 * @return The response as string
	 * @throws MashupConnectionException
	 *             If connection was not successful
	 */
	private String doPost(String url, String parameterString)
			throws MashupConnectionException {
		String result = null;

		HttpClient httpClient = new DefaultHttpClient();

		HttpPost post = new HttpPost(url);
		
		ResponseHandler<String> responseHandler = new BasicResponseHandler();

		try {
			post.setEntity(new StringEntity(parameterString));
			result = httpClient.execute(post, responseHandler);
		} catch (Exception e) {
			throw new MashupConnectionException(e.getMessage(), url);
		} finally {
			// client is no longer needed
			httpClient.getConnectionManager().shutdown();
		}

		return result;
	}
	
	/**
	 * Processes a post request against the given url.
	 * 
	 * @param url
	 *            Url for the get request.
	 * @param parameterMap
	 * @return The response as string
	 * @throws MashupConnectionException
	 *             If connection was not successful
	 */
	@SuppressWarnings("unused")
	private String doPost(String url, Map<String, String> parameterMap)
			throws MashupConnectionException {
		String result = null;

		HttpClient httpClient = new DefaultHttpClient();

		HttpPost post = new HttpPost(url);

		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);

		// add all post parameter
		for (String key : parameterMap.keySet()) {
			nameValuePairs.add(new BasicNameValuePair(key, parameterMap
					.get(key)));
		}

		ResponseHandler<String> responseHandler = new BasicResponseHandler();

		try {
			post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			result = httpClient.execute(post, responseHandler);
		} catch (Exception e) {
			throw new MashupConnectionException(e.getMessage(), url);
		} finally {
			// client is no longer needed
			httpClient.getConnectionManager().shutdown();
		}

		return result;
	}
	
	/**
	 * Serializes the given item as xmi.
	 * 
	 * @param item Item to serialize.
	 * @return The item serialized as xmi.
	 */
	private String xml(Item item) {
		if(item == null)
		{
			return null;
		}
		
		// put it in a list to use xml helper
		BasicEList<EObject> objectList = new BasicEList<EObject>();
		objectList.add(item);

		// create map for options
		Map<Object, Object> options = new HashMap<Object, Object>();
		
		// Switch off formating
		options.put(XMLResource.OPTION_FORMATTED, Boolean.FALSE);
		
		String result = "";
		try {
			result = XMLHelperImpl.saveString(options, objectList,
					"UTF-8", null);
		} catch (Exception e) {
			return null;
		}

		// cleanup xml and replace references
		result = replaceLocalReferencesXML(result);

		// done
		return result;
	}
	
	/**
	 * Replaces all local resource references by references with getItemsWithIdent?ident=
	 * 
	 * @param xmlInput
	 *            Xml serialized items
	 * @return Cleaned XML
	 */
	private String replaceLocalReferencesXML(String xmlInput) {
		String result = xmlInput.replaceAll("/#","/getItemsWithIdent?ident=");
		return result;
	}
}
