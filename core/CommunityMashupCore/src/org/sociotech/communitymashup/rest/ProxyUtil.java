/*******************************************************************************
 * Copyright (c) 2013 lachenma.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.rest;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.data.impl.ItemImpl;

/**
 * Util to resolve proxy items and references in CommunityMashup items.
 * 
 * @author Peter Lachenmaier
 */
public class ProxyUtil {

	/**
	 * Resolves all referenced proxy items and replaces them with items from the server side
	 * data set.
	 * 
	 * @param item Item to resolve proxies for
	 * @param dataSet Data set to contains the item for the proxy object.
	 * 
	 * @return The item with resolved proxies or null in error case
	 */
	public static Item resolveProxies(Item item, DataSet dataSet) {
		if(item == null)
		{
			return null;
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
				// dont use the data set reference
				continue;
			}
			
			if(referencedObject instanceof EList<?>)
			{
				// There can only be item lists
				@SuppressWarnings("unchecked")
				EList<Object> referenceList = (EList<Object>) referencedObject;
				
				if(referenceList.isEmpty())
				{
					continue;
				}
				
				// create new list for the resolved items
				EList<Object> resolvedList = new BasicEList<Object>();
				
				
				// step over all items resolve the and add them to the new list
				for(Object refObject : referenceList)
				{
					
					Item newItem = resolveProxyItem(refObject, dataSet);
					
					if(newItem != null)
					{
						resolvedList.add(newItem);
					}
				}
				
				// clear old list and add all new objects
				referenceList.clear();
				referenceList.addAll(resolvedList);
			}
			else
			{
				Item newItem = resolveProxyItem(referencedObject, dataSet);
				
				// replace referenced object with new object
				item.eSet(reference, newItem);
			}
		}
		
		return item;
	}

	/**
	 * Returns the item from the given data set that is represented by the given
	 * proxy object.
	 * 
	 * @param proxyObject Proxy object for an item from the server side data set
	 * @param dataSet Data set to contains the item for the proxy object.
	 * @return The resolved item.
	 */
	public static Item resolveProxyItem(Object proxyObject, DataSet dataSet) {
		if(!(proxyObject instanceof ItemImpl))
		{
			// could only use items
			return null;
		}
		
		ItemImpl proxyItem = (ItemImpl) proxyObject;
		
		if(!proxyItem.eIsProxy())
		{
			// could only resolve proxies
			return null;
		}
		
		URI proxyUri = proxyItem.eProxyURI();
		
		if(proxyUri == null)
		{
			return null;
		}
		
		Item resolvedItem = getItemForProxyUri(proxyUri.toString(), dataSet);
		
		// check type to avoid wrong casts in error case
		if(resolvedItem == null || resolvedItem.eClass() != proxyItem.eClass())
		{
			return null;
		}
		
		return resolvedItem;
	}

	/**
	 * Looks up the item for the given uri in the server side data set.
	 * 
	 * @param proxyUri Uri for the item.
	 * @param dataSet Data set to contains the item for the proxy object.
	 * 
	 * @return The item represented by the given proxy uri or null if not found.
	 */
	public static Item getItemForProxyUri(String proxyUri, DataSet dataSet) {
		if(proxyUri == null || proxyUri.isEmpty() || dataSet == null)
		{
			return null;
		}
		
		// extract the ident
		String ident = getIdentFromProxyUri(proxyUri);
		
		// return the item with this ident.
		return dataSet.getItemsWithIdent(ident);
	}

	/**
	 * Looks up the item item for the given uri in the server side data set.
	 * 
	 * @param proxyUri Uri for the item.
	 * 
	 * @return The item item represented by the given proxy uri or null if not found.
	 */
	public static String getIdentFromProxyUri(String proxyUri) {
		if(proxyUri == null || proxyUri.isEmpty())
		{
			return null;
		}
		
		// extract the ident
		String[] uriParts = proxyUri.split("getItemsWithIdent\\?ident=");

		if(uriParts.length <= 1)	
		{
			return null;
		}
		
		String ident = uriParts[1].trim();
		while(ident.endsWith("/"))
		{
			ident = ident.replace("/", "");
		}

		return ident;
	}

	/**
	 * Extracts the ident from the proxy items uri.
	 * 
	 * @param proxyItem Proxy item.
	 * @return The ident of the proxy item
	 */
	public static String getIdentFromProxyItem(Item proxyItem) {
		if(proxyItem == null || !(proxyItem instanceof ItemImpl) || !(proxyItem.eIsProxy()))
		{
			return null;
		}
		
		ItemImpl proxyImpl = (ItemImpl) proxyItem;
		return getIdentFromProxyUri(proxyImpl.eProxyURI().toString());
	}
}
