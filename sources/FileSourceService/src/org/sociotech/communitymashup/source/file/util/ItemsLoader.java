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
package org.sociotech.communitymashup.source.file.util;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Item;

/**
 * @author Peter Lachenmaier
 *
 */
public class ItemsLoader
{

	/**
	 * Deserializes an data set from an xml file and returns the contained items. Null if an error occurs.
	 * 
	 * @param fileUri Path of an xml file containing data according to the Mashup data model.
	 * 
	 * @return A list of items loaded from the file.
	 */
	public static EList<Item> loadItems(URI fileUri)
	{
		// create resource set and resource 
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",  new XMLResourceFactoryImpl());

		// Register XMI resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",  new XMIResourceFactoryImpl());

		Resource resource = resourceSet.createResource(fileUri);

		// register package in local resource registry
		String nsURI = DataPackage.eINSTANCE.getNsURI();
		resourceSet.getPackageRegistry().put(nsURI, DataPackage.eINSTANCE);

		// load resource 
		try 
		{
			resource.load(null);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}

		TreeIterator<EObject> dataIterator = resource.getAllContents();


		DataSet dataSet = null;

		// Mashup Data XML contains exactly one DataSet
		if(dataIterator.hasNext())
		{
			EObject workingObject = dataIterator.next();

			if(workingObject instanceof DataSet)
			{
				dataSet = (DataSet) workingObject;
				return dataSet.getItems();
			}
		}

		return null;
	}
}
