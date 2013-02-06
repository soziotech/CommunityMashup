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
package org.sociotech.communitymashup.collection.impl;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.sociotech.communitymashup.collection.CollectionPackage;
import org.sociotech.communitymashup.collection.ItemsCollection;
import org.sociotech.communitymashup.collection.ManualCollection;
import org.sociotech.communitymashup.collection.RemoteCollection;
import org.sociotech.communitymashup.collection.SmartInformationObjectCollection;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.RestUtil;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manual Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ManualCollectionImpl extends ItemsCollectionImpl implements ManualCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectionPackage.Literals.MANUAL_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Item addItem(Item item) {
		
		if(item == null)
		{
			return null;
		}
		
		// get all items
		EList<Item> itemList = this.getItems();
		
		// check if it is already contained
		if(!itemList.contains(item))
		{
			// add it
			itemList.add(item);
		}
			
		// and return it again
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Item removeItem(Item item) {
		if(item == null)
		{
			return null;
		}
		
		// get all items
		EList<Item> itemList = this.getItems();
		
		// check if it is already contained
		if(!itemList.contains(item))
		{
			// return it
			itemList.remove(item);
		}
			
		// and return it again
		return item;
	}


	/**
	 * Generates an EObjectCondition to check whether an Object is of the type ManualCollection.
	 * 
	 * @return An EObjectCondition whether the Object is of the type ManualCollection.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(CollectionPackageImpl.eINSTANCE.getManualCollection());
	}
	
	/**
	 * This method provides a generic access to the Getters of this class.
 	 * 
 	 * @param opName The name of the Feature to be gotten.
 	 *
 	 * @return The value of the Feature or null.
 	 * 
	 * @generated
	 */
	protected Object getFeature(String featureName) throws UnknownOperationException {	
		return super.getFeature(featureName); 
	}
	
	/**
	 * This method provides a generic access to the Setters of this class.
 	 * 
 	 * @param opName The name of the Feature to be set.
 	 * @param value The new value of the feature.
 	 * 
	 * @generated
	 */
	protected Object setFeature(String featureName, Object value) throws WrongArgException, UnknownOperationException {	
		super.setFeature(featureName, value);
		return this; 
	}
	
	/**
	 * This method provides a generic access to the Operations of this class.
 	 * 
 	 * @param opName The name of the requested Operation.
 	 * @param values The arguments to be used.
 	 * 
 	 * @return The result of the Operation or null.
 	 * 
	 * @generated
	 */
	protected Object doOperation(RestCommand command) throws ArgNotFoundException, WrongArgException, WrongArgCountException, UnknownOperationException {
		if ( command.getCommand().equalsIgnoreCase("addItem")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("ManualCollection.doOperation", 1, command.getArgCount()); 
			Item item = null;
			try {
				try {
					item = (Item)(RestUtil.fromInput(command.getArg("item")));
				} catch (ClassNotFoundException e) {
					item = (Item)command.getArg("item");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("ManualCollection.doOperation", "Item", command.getArg("item").getClass().getName());
			}
			return this.addItem(item);
		}
		if ( command.getCommand().equalsIgnoreCase("removeItem")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("ManualCollection.doOperation", 1, command.getArgCount()); 
			Item item = null;
			try {
				try {
					item = (Item)(RestUtil.fromInput(command.getArg("item")));
				} catch (ClassNotFoundException e) {
					item = (Item)command.getArg("item");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("ManualCollection.doOperation", "Item", command.getArg("item").getClass().getName());
			}
			return this.removeItem(item);
		}	
		return super.doOperation(command);
	}

	/**
	 * This method can be used to recursively and generically call the Getter, Setters and Operations of the generated classes.
	 * 
	 * @param input The commands to be processed.
	 * @param requestType The HTTP-Request method.
	 * 
	 * @return The result of the Getter/Operation or null.
	 * 
	 * @generated
	 */
	@Override
	public Object process(LinkedList<RestCommand> input, RequestType requestType) throws ArgNotFoundException, WrongArgException, WrongArgCountException, UnknownOperationException {
		Object o = null;
		RestCommand c = input.poll();
		// check for HTTP-Request method
		if (requestType == RequestType.rtGet) {
			// only Getters are allowed -> side-effects...
			if (c.getCommand().startsWith("get")) {
				if (c.getArgCount() != 0) throw new WrongArgCountException(c.getCommand(), 0, c.getArgCount());
				o = this.getFeature(c.getCommand().substring(3));
			}
		} else {
			// everything is allowed - at least for now
			try {
				o = this.doOperation(c);
			} catch(Exception e) {
				if (c.getCommand().startsWith("get")) {
					if (c.getArgCount() != 0) throw new WrongArgCountException(c.getCommand(), 0, c.getArgCount());
					o = this.getFeature(c.getCommand().substring(3));
				} else if (c.getCommand().startsWith("set")) {
					if (c.getArgCount() != 1) throw new WrongArgCountException(c.getCommand(), 1, c.getArgCount());
					Object so = c.getArg("new" + c.getCommand().substring(3));
					o = this.setFeature(c.getCommand().substring(3), so);
				} else {
					if (e instanceof ArgNotFoundException)
						throw (ArgNotFoundException)e;
					if (e instanceof WrongArgException)
						throw (WrongArgException)e;
					if (e instanceof WrongArgCountException)
						throw (WrongArgCountException)e;
					if (e instanceof UnknownOperationException)
						throw (UnknownOperationException)e;
				}
			}
		}
		if (input.isEmpty()) {
			return o;
		} else { 
			if (o instanceof ItemsCollectionImpl) {
				return ((ItemsCollection) o).process(input, requestType);
			}
			if (o instanceof SmartInformationObjectCollectionImpl) {
				return ((SmartInformationObjectCollection) o).process(input, requestType);
			}
			if (o instanceof ManualCollectionImpl) {
				return ((ManualCollection) o).process(input, requestType);
			}
			if (o instanceof RemoteCollectionImpl) {
				return ((RemoteCollection) o).process(input, requestType);
			}
			if (o instanceof List) {
				return RestUtil.listProcess((List<?>) o, input, requestType);
			}
		}
		return null;
	}
} //ManualCollectionImpl
