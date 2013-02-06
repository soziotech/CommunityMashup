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
package org.sociotech.communitymashup.data.impl;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.ecore.CallOperationAction;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironment;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.SendSignalAction;
import org.ocpsoft.pretty.time.PrettyTime;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.Attachment;
import org.sociotech.communitymashup.data.Binary;
import org.sociotech.communitymashup.data.Category;
import org.sociotech.communitymashup.data.Classification;
import org.sociotech.communitymashup.data.Connection;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Document;
import org.sociotech.communitymashup.data.Email;
import org.sociotech.communitymashup.data.Event;
import org.sociotech.communitymashup.data.Extension;
import org.sociotech.communitymashup.data.Identifier;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.IndoorLocation;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.data.InstantMessenger;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.data.Location;
import org.sociotech.communitymashup.data.MetaInformation;
import org.sociotech.communitymashup.data.MetaTag;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.Phone;
import org.sociotech.communitymashup.data.Ranking;
import org.sociotech.communitymashup.data.StarRanking;
import org.sociotech.communitymashup.data.Tag;
import org.sociotech.communitymashup.data.ThumbRanking;
import org.sociotech.communitymashup.data.Transformation;
import org.sociotech.communitymashup.data.Video;
import org.sociotech.communitymashup.data.ViewRanking;
import org.sociotech.communitymashup.data.WebAccount;
import org.sociotech.communitymashup.data.WebSite;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.RestUtil;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.impl.ItemImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.ItemImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.ItemImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.ItemImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.ItemImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.ItemImpl#getCreated <em>Created</em>}</li>
 * </ul>
 * </p>
 *
 */
public abstract class ItemImpl extends EObjectImpl implements Item, Comparable<Item> {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Reference to singleton ocl environment. 
	 */
	private static EcoreEnvironment oclEnvironment = null;
	
	/**
	 * Creates the OCL Environment at first call and then returns the singleton instance.
	 * 
	 * @return The OCL singleton instance, null in error case.
	 */
	public static Environment<EPackage, EClassifier, EOperation, EStructuralFeature, EEnumLiteral, EParameter, EObject, CallOperationAction, SendSignalAction, Constraint, EClass, EObject> getOclEnvironment() {
		if(oclEnvironment == null)
		{
			oclEnvironment = (EcoreEnvironment) EcoreEnvironmentFactory.INSTANCE.createEnvironment();
		}
		return oclEnvironment;
	}

	/**
	 * The default value of the '{@link #getIdent() <em>Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdent()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdent() <em>Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdent()
	 * @generated
	 * @ordered
	 */
	protected String ident = IDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValue()
	 * @generated
	 * @ordered
	 */
	protected String stringValue = STRING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected Date lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetaTags() <em>Meta Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaTags()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaTag> metaTags;

	/**
	 * The cached value of the '{@link #getIdentifiedBy() <em>Identified By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet getDataSet() {
		if (eContainerFeatureID() != DataPackage.ITEM__DATA_SET) return null;
		return (DataSet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSet(DataSet newDataSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDataSet, DataPackage.ITEM__DATA_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSet(DataSet newDataSet) {
		if (newDataSet != eInternalContainer() || (eContainerFeatureID() != DataPackage.ITEM__DATA_SET && newDataSet != null)) {
			if (EcoreUtil.isAncestor(this, newDataSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDataSet != null)
				msgs = ((InternalEObject)newDataSet).eInverseAdd(this, DataPackage.DATA_SET__ITEMS, DataSet.class, msgs);
			msgs = basicSetDataSet(newDataSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM__DATA_SET, newDataSet, newDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdent() {
		return ident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdent(String newIdent) {
		String oldIdent = ident;
		ident = newIdent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM__IDENT, oldIdent, ident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the string value or an empty string if the string value isn't set.
	 * 
	 * @return The string value or an empty string if the string value isn't set
	 * <!-- end-user-doc -->
	 */
	public String getStringValue() {
		if(stringValue == null)
		{
			return "";
		}
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringValue(String newStringValue) {
		String oldStringValue = stringValue;
		stringValue = newStringValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM__STRING_VALUE, oldStringValue, stringValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModified(Date newLastModified) {
		Date oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM__LAST_MODIFIED, oldLastModified, lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ITEM__CREATED, oldCreated, created));
		
		// setting also the modification date if not set before or older than the new creation date
		Date lastModified = this.getLastModified();
		if(lastModified == null || lastModified.before(newCreated))
		{
			this.setLastModified(newCreated);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaTag> getMetaTags() {
		if (metaTags == null) {
			metaTags = new EObjectWithInverseResolvingEList.ManyInverse<MetaTag>(MetaTag.class, this, DataPackage.ITEM__META_TAGS, DataPackage.META_TAG__META_TAGGED);
		}
		return metaTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiedBy() {
		if (identifiedBy == null) {
			identifiedBy = new EObjectWithInverseResolvingEList<Identifier>(Identifier.class, this, DataPackage.ITEM__IDENTIFIED_BY, DataPackage.IDENTIFIER__IDENTIFIED);
		}
		return identifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns this.toString() as default.
	 * <!-- end-user-doc -->
	 */
	public String toAttributeMapString() {
		return this.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void log(String message) {
		DataSet ds = this.getDataSet();
		if(ds != null)
		{
			ds.log(message);
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void log(String message, Integer level) {
		DataSet ds = this.getDataSet();
		if(ds != null)
		{
			ds.log(message, level);
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public MetaTag metaTag(String name) {
		// check if data set exists
		DataSet dataSet = this.getDataSet();
		if(dataSet == null || name == null || name.isEmpty())
		{
			return null;
		}
		
		// find the Tag with the given string value
		MetaTag tag = dataSet.getMetaTag(name);
		
		if(tag == null)
		{
			DataFactory dataFactory = DataPackage.eINSTANCE.getDataFactory();
			tag = dataFactory.createMetaTag();
			tag.setName(name);
			// add the new Meta Tag to the data set
			dataSet.add(tag);
		}
		// tag this item
		this.getMetaTags().add(tag);
		
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Identifier identifyBy(String key, String value) {
		// check if data set exists
		DataSet dataSet = this.getDataSet();
		if(dataSet == null)
		{
			return null;
		}
		
		// create identifier
		DataFactory dataFactory = DataPackage.eINSTANCE.getDataFactory();
		Identifier identifier = dataFactory.createIdentifier();
		
		identifier.setKey(key);
		identifier.setValue(value);
		
		// add the new Identifier to the data set
		dataSet.add(identifier);
		
		// identify this item
		this.getIdentifiedBy().add(identifier);
		
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Identifier getIdentifier(String key) {
		
		if(key == null || key.isEmpty())
		{
			return null;
		}
		
		EList<Identifier> identifiers = this.getIdentifiedBy();
		
		// find identifier for key
		for(Identifier identifier : identifiers)
		{
			if(identifier.getKey().equals(key))
			{
				return identifier;
			}
		}
		
		// no result found
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Boolean hasMetaTag(String tag) {
		if(tag == null || tag.isEmpty())
		{
			return false;
		}
		
		EList<MetaTag> existingMetaTags = this.getMetaTags();
		
		for(MetaTag metaTag : existingMetaTags)
		{
			if(metaTag.getName() != null && metaTag.getName().equalsIgnoreCase(tag))
			{
				return true;
			}
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Boolean matchesSearch(String term) {
		if(term == null || term.isEmpty())
		{
			return false;
		}
		
		// TODO solve with OCL or EMF Query
		//String value = this.getStringValue();
		String value = this.toString();
		
		if(value == null || value.isEmpty())
		{
			return false;
		}
		
		// look if the search term is contained in the value and ignore case
		if(value.toLowerCase().contains(term.toLowerCase()))
		{
			return true;
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void delete() {
		
		log("Deleting " + this.eClass().getInstanceTypeName() + ": " + this.getIdent(), LogService.LOG_DEBUG);
		
		// use ecore util to delete
		try
		{
			EcoreUtil.delete(this, true);
		}
		catch (Exception e)
		{
			log("Exception " + e.getMessage() + " while deleting " + this.getIdent(), LogService.LOG_WARNING);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Boolean isEqualItem(Item item) {
		// basically items are equal if they are the same object
		// TODO create an observer to check when two different items are getting equal and then merge them
		if(this == item)
		{
			return true;
		}
		else if (item == null)
		{
			return false;
		}
		else if (this.eClass() != item.eClass())
		{
			return false;
		}	
		
		EList<Identifier> itemIdentifiers = item.getIdentifiedBy();
		EList<Identifier> thisIdentifiers = this.getIdentifiedBy();
		
		if(itemIdentifiers == null || thisIdentifiers == null)
		{
			return false;
		}
		
		// look if there is an equal identifier
		for(Identifier identifier1 : itemIdentifiers)
		{
			for(Identifier identifier2 : thisIdentifiers)
			{
				if(identifier1.isEqualItem(identifier2))
				{
					// one equal identifier is enough to be equal
					return true;
				}
			}
		}
	
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getCreatedPrettyInLanguage(String language) {
		return getPrettyDateString(this.getCreated(), language);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getCreatedPretty() {
		return getPrettyDateString(this.getCreated());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getLastModifiedPrettyInLanguage(String language) {
		return getPrettyDateString(this.getLastModified(), language);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getLastModifiedPretty() {
		return getPrettyDateString(this.getLastModified());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.ITEM__DATA_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDataSet((DataSet)otherEnd, msgs);
			case DataPackage.ITEM__META_TAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetaTags()).basicAdd(otherEnd, msgs);
			case DataPackage.ITEM__IDENTIFIED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIdentifiedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.ITEM__DATA_SET:
				return basicSetDataSet(null, msgs);
			case DataPackage.ITEM__META_TAGS:
				return ((InternalEList<?>)getMetaTags()).basicRemove(otherEnd, msgs);
			case DataPackage.ITEM__IDENTIFIED_BY:
				return ((InternalEList<?>)getIdentifiedBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DataPackage.ITEM__DATA_SET:
				return eInternalContainer().eInverseRemove(this, DataPackage.DATA_SET__ITEMS, DataSet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.ITEM__DATA_SET:
				return getDataSet();
			case DataPackage.ITEM__IDENT:
				return getIdent();
			case DataPackage.ITEM__URI:
				return getUri();
			case DataPackage.ITEM__STRING_VALUE:
				return getStringValue();
			case DataPackage.ITEM__LAST_MODIFIED:
				return getLastModified();
			case DataPackage.ITEM__CREATED:
				return getCreated();
			case DataPackage.ITEM__META_TAGS:
				return getMetaTags();
			case DataPackage.ITEM__IDENTIFIED_BY:
				return getIdentifiedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.ITEM__DATA_SET:
				setDataSet((DataSet)newValue);
				return;
			case DataPackage.ITEM__IDENT:
				setIdent((String)newValue);
				return;
			case DataPackage.ITEM__URI:
				setUri((String)newValue);
				return;
			case DataPackage.ITEM__STRING_VALUE:
				setStringValue((String)newValue);
				return;
			case DataPackage.ITEM__LAST_MODIFIED:
				setLastModified((Date)newValue);
				return;
			case DataPackage.ITEM__CREATED:
				setCreated((Date)newValue);
				return;
			case DataPackage.ITEM__META_TAGS:
				getMetaTags().clear();
				getMetaTags().addAll((Collection<? extends MetaTag>)newValue);
				return;
			case DataPackage.ITEM__IDENTIFIED_BY:
				getIdentifiedBy().clear();
				getIdentifiedBy().addAll((Collection<? extends Identifier>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataPackage.ITEM__DATA_SET:
				setDataSet((DataSet)null);
				return;
			case DataPackage.ITEM__IDENT:
				setIdent(IDENT_EDEFAULT);
				return;
			case DataPackage.ITEM__URI:
				setUri(URI_EDEFAULT);
				return;
			case DataPackage.ITEM__STRING_VALUE:
				setStringValue(STRING_VALUE_EDEFAULT);
				return;
			case DataPackage.ITEM__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case DataPackage.ITEM__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case DataPackage.ITEM__META_TAGS:
				getMetaTags().clear();
				return;
			case DataPackage.ITEM__IDENTIFIED_BY:
				getIdentifiedBy().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataPackage.ITEM__DATA_SET:
				return getDataSet() != null;
			case DataPackage.ITEM__IDENT:
				return IDENT_EDEFAULT == null ? ident != null : !IDENT_EDEFAULT.equals(ident);
			case DataPackage.ITEM__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case DataPackage.ITEM__STRING_VALUE:
				return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
			case DataPackage.ITEM__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case DataPackage.ITEM__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case DataPackage.ITEM__META_TAGS:
				return metaTags != null && !metaTags.isEmpty();
			case DataPackage.ITEM__IDENTIFIED_BY:
				return identifiedBy != null && !identifiedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ident: ");
		result.append(ident);
		result.append(", uri: ");
		result.append(uri);
		result.append(", stringValue: ");
		result.append(stringValue);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(", created: ");
		result.append(created);
		result.append(')');
		return result.toString();
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type Item.
	 * 
	 * @return An EObjectCondition whether the Object is of the type Item.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		EObjectCondition result = new EObjectTypeRelationCondition(DataPackageImpl.eINSTANCE.getItem());
		return result.OR(InformationObject.isTypeCondition).OR(Extension.isTypeCondition).OR(Classification.isTypeCondition).OR(MetaTag.isTypeCondition).OR(Identifier.isTypeCondition);
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
		if ( featureName.equalsIgnoreCase("dataSet") )
			return this.getDataSet();		
		if ( featureName.equalsIgnoreCase("ident") )
			return this.getIdent();		
		if ( featureName.equalsIgnoreCase("uri") )
			return this.getUri();		
		if ( featureName.equalsIgnoreCase("stringValue") )
			return this.getStringValue();		
		if ( featureName.equalsIgnoreCase("lastModified") )
			return this.getLastModified();		
		if ( featureName.equalsIgnoreCase("created") )
			return this.getCreated();		
		if ( featureName.equalsIgnoreCase("metaTags") )
			return this.getMetaTags();		
		if ( featureName.equalsIgnoreCase("identifiedBy") )
			return this.getIdentifiedBy();		
		throw new UnknownOperationException(this, new RestCommand("get" + featureName)); 
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
		if ( featureName.equalsIgnoreCase("dataSet") ) {
				org.sociotech.communitymashup.data.DataSet fdataSet = null;
				try {
					try {
						fdataSet = (org.sociotech.communitymashup.data.DataSet)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fdataSet = (org.sociotech.communitymashup.data.DataSet)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Item.setFeature", "org.sociotech.communitymashup.data.DataSet",value.getClass().getName());
				}
				this.setDataSet(fdataSet);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("ident") ) {
				java.lang.String fident = null;
				try {
					fident = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Item.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setIdent(fident);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("uri") ) {
				java.lang.String furi = null;
				try {
					furi = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Item.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setUri(furi);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("stringValue") ) {
				java.lang.String fstringValue = null;
				try {
					fstringValue = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Item.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setStringValue(fstringValue);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("lastModified") ) {
				java.util.Date flastModified = null;
				try {
					try {
						flastModified = RestUtil.fromDateString((String) value);
						if(flastModified == null) {
							flastModified = (java.util.Date)(RestUtil.fromInput(value));
						}
					} catch (ClassNotFoundException e) {
						flastModified = (java.util.Date)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Item.setFeature", "java.util.Date",value.getClass().getName());
				}
				this.setLastModified(flastModified);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("created") ) {
				java.util.Date fcreated = null;
				try {
					try {
						fcreated = RestUtil.fromDateString((String) value);
						if(fcreated == null) {
							fcreated = (java.util.Date)(RestUtil.fromInput(value));
						}
					} catch (ClassNotFoundException e) {
						fcreated = (java.util.Date)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Item.setFeature", "java.util.Date",value.getClass().getName());
				}
				this.setCreated(fcreated);
			return this;
			}		
	throw new UnknownOperationException(this, new RestCommand("set" + featureName).addArg("value",value));
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
		if ( command.getCommand().equalsIgnoreCase("metaTag")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("Item.doOperation", 1, command.getArgCount()); 
			java.lang.String name = null;
			try {
				name = (java.lang.String)command.getArg("name");
			} catch (ClassCastException e) {
				throw new WrongArgException("Item.doOperation", "java.lang.String", command.getArg("name").getClass().getName());
			}
			return this.metaTag(name);
		}
		if ( command.getCommand().equalsIgnoreCase("identifyBy")) {
			if (command.getArgCount() != 2) throw new WrongArgCountException("Item.doOperation", 2, command.getArgCount()); 
			java.lang.String key = null;
			try {
				key = (java.lang.String)command.getArg("key");
			} catch (ClassCastException e) {
				throw new WrongArgException("Item.doOperation", "java.lang.String", command.getArg("key").getClass().getName());
			}
			java.lang.String value = null;
			try {
				value = (java.lang.String)command.getArg("value");
			} catch (ClassCastException e) {
				throw new WrongArgException("Item.doOperation", "java.lang.String", command.getArg("value").getClass().getName());
			}
			return this.identifyBy(key, value);
		}
		if ( command.getCommand().equalsIgnoreCase("getIdentifier")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("Item.doOperation", 1, command.getArgCount()); 
			java.lang.String key = null;
			try {
				key = (java.lang.String)command.getArg("key");
			} catch (ClassCastException e) {
				throw new WrongArgException("Item.doOperation", "java.lang.String", command.getArg("key").getClass().getName());
			}
			return this.getIdentifier(key);
		}
		if ( command.getCommand().equalsIgnoreCase("hasMetaTag")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("Item.doOperation", 1, command.getArgCount()); 
			java.lang.String tag = null;
			try {
				tag = (java.lang.String)command.getArg("tag");
			} catch (ClassCastException e) {
				throw new WrongArgException("Item.doOperation", "java.lang.String", command.getArg("tag").getClass().getName());
			}
			return this.hasMetaTag(tag);
		}
		if ( command.getCommand().equalsIgnoreCase("matchesSearch")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("Item.doOperation", 1, command.getArgCount()); 
			java.lang.String term = null;
			try {
				term = (java.lang.String)command.getArg("term");
			} catch (ClassCastException e) {
				throw new WrongArgException("Item.doOperation", "java.lang.String", command.getArg("term").getClass().getName());
			}
			return this.matchesSearch(term);
		}
		if ( command.getCommand().equalsIgnoreCase("delete")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Item.doOperation", 0, command.getArgCount()); 
				this.delete();
				return this;
				}
		if ( command.getCommand().equalsIgnoreCase("isEqualItem")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("Item.doOperation", 1, command.getArgCount()); 
			Item item = null;
			try {
				try {
					item = (Item)(RestUtil.fromInput(command.getArg("item")));
				} catch (ClassNotFoundException e) {
					item = (Item)command.getArg("item");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("Item.doOperation", "Item", command.getArg("item").getClass().getName());
			}
			return this.isEqualItem(item);
		}
		if ( command.getCommand().equalsIgnoreCase("getCreatedPrettyInLanguage")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("Item.doOperation", 1, command.getArgCount()); 
			java.lang.String language = null;
			try {
				language = (java.lang.String)command.getArg("language");
			} catch (ClassCastException e) {
				throw new WrongArgException("Item.doOperation", "java.lang.String", command.getArg("language").getClass().getName());
			}
			return this.getCreatedPrettyInLanguage(language);
		}
		if ( command.getCommand().equalsIgnoreCase("getCreatedPretty")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Item.doOperation", 0, command.getArgCount()); 
			return this.getCreatedPretty();
		}
		if ( command.getCommand().equalsIgnoreCase("getLastModifiedPrettyInLanguage")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("Item.doOperation", 1, command.getArgCount()); 
			java.lang.String language = null;
			try {
				language = (java.lang.String)command.getArg("language");
			} catch (ClassCastException e) {
				throw new WrongArgException("Item.doOperation", "java.lang.String", command.getArg("language").getClass().getName());
			}
			return this.getLastModifiedPrettyInLanguage(language);
		}
		if ( command.getCommand().equalsIgnoreCase("getLastModifiedPretty")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Item.doOperation", 0, command.getArgCount()); 
			return this.getLastModifiedPretty();
		}
		throw new UnknownOperationException(this, command);
	}

	/**
	 * This method can be used to recursively and generically call the Getter, Setters and Operations of the generated classes.
	 * 
	 * @param input The commands to be processed.
	 * @param requestType The HTTP-Method of the request.
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
			if (o instanceof PersonImpl) {
				return ((Person) o).process(input, requestType);
			}
			if (o instanceof InformationObjectImpl) {
				return ((InformationObject) o).process(input, requestType);
			}
			if (o instanceof ContentImpl) {
				return ((Content) o).process(input, requestType);
			}
			if (o instanceof DataSetImpl) {
				return ((DataSet) o).process(input, requestType);
			}
			if (o instanceof ItemImpl) {
				return ((Item) o).process(input, requestType);
			}
			if (o instanceof ExtensionImpl) {
				return ((Extension) o).process(input, requestType);
			}
			if (o instanceof ClassificationImpl) {
				return ((Classification) o).process(input, requestType);
			}
			if (o instanceof CategoryImpl) {
				return ((Category) o).process(input, requestType);
			}
			if (o instanceof TagImpl) {
				return ((Tag) o).process(input, requestType);
			}
			if (o instanceof OrganisationImpl) {
				return ((Organisation) o).process(input, requestType);
			}
			if (o instanceof MetaTagImpl) {
				return ((MetaTag) o).process(input, requestType);
			}
			if (o instanceof PhoneImpl) {
				return ((Phone) o).process(input, requestType);
			}
			if (o instanceof InstantMessengerImpl) {
				return ((InstantMessenger) o).process(input, requestType);
			}
			if (o instanceof EmailImpl) {
				return ((Email) o).process(input, requestType);
			}
			if (o instanceof WebAccountImpl) {
				return ((WebAccount) o).process(input, requestType);
			}
			if (o instanceof WebSiteImpl) {
				return ((WebSite) o).process(input, requestType);
			}
			if (o instanceof RankingImpl) {
				return ((Ranking) o).process(input, requestType);
			}
			if (o instanceof AttachmentImpl) {
				return ((Attachment) o).process(input, requestType);
			}
			if (o instanceof LocationImpl) {
				return ((Location) o).process(input, requestType);
			}
			if (o instanceof ImageImpl) {
				return ((Image) o).process(input, requestType);
			}
			if (o instanceof DocumentImpl) {
				return ((Document) o).process(input, requestType);
			}
			if (o instanceof StarRankingImpl) {
				return ((StarRanking) o).process(input, requestType);
			}
			if (o instanceof ViewRankingImpl) {
				return ((ViewRanking) o).process(input, requestType);
			}
			if (o instanceof ThumbRankingImpl) {
				return ((ThumbRanking) o).process(input, requestType);
			}
			if (o instanceof TransformationImpl) {
				return ((Transformation) o).process(input, requestType);
			}
			if (o instanceof VideoImpl) {
				return ((Video) o).process(input, requestType);
			}
			if (o instanceof ConnectionImpl) {
				return ((Connection) o).process(input, requestType);
			}
			if (o instanceof BinaryImpl) {
				return ((Binary) o).process(input, requestType);
			}
			if (o instanceof MetaInformationImpl) {
				return ((MetaInformation) o).process(input, requestType);
			}
			if (o instanceof IndoorLocationImpl) {
				return ((IndoorLocation) o).process(input, requestType);
			}
			if (o instanceof IdentifierImpl) {
				return ((Identifier) o).process(input, requestType);
			}
			if (o instanceof EventImpl) {
				return ((Event) o).process(input, requestType);
			}
			if (o instanceof List) {
				return RestUtil.listProcess((List<?>) o, input, requestType);
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Item compareItem) {
		if(compareItem == null)
		{
			return 1;
		}
		if(this.getStringValue() == null && compareItem.getStringValue() == null)
		{
			return 0;
		}
		if(this.getStringValue() != null && compareItem.getStringValue() == null)
		{
			return 1;
		}
		if(this.getStringValue() == null && compareItem.getStringValue() != null)
		{
			return -1;
		}
		return this.getStringValue().compareTo(compareItem.getStringValue());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotify(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void eNotify(Notification notification) {
		
		if(notification.getEventType() == Notification.REMOVE)
		{
			this.deleteIfUnused();
		}
		super.eNotify(notification);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.common.notify.impl.BasicNotifierImpl#eNotificationRequired()
	 */
	@Override
	public boolean eNotificationRequired() {
		// always return true to get eNotify called
		return true;
	}
	
	/**
	 * Checks if this item is now unused and then deletes it self. Needs to be overwritten in concrete subclasses.
	 * Will be called after every remove action to this item.
	 */
	protected void deleteIfUnused() {
		// nothing to do in base implementation
	}
	
	/**
	 * Returns the pretty formatted date string for the given date in the default language.
	 * 
	 * @param date Date to format
	 * @return The pretty formatted date, null in error case
	 */
	protected static String getPrettyDateString(Date date)
	{
		return getPrettyDateString(date, null);
	}
	
	/**
	 * Returns the pretty formatted date string for the given date in the given language. Language must be set
	 * in iso language code {@linkplain http://ftp.ics.uci.edu/pub/ietf/http/related/iso639.txt}
	 * 
	 * @param date Date to format
	 * @param language Laguage to get the date formatted in, can be null to use the default language
	 * @return The pretty formatted date, null in error case
	 */
	protected static String getPrettyDateString(Date date, String language)
	{
		if(date == null)
		{
			return null;
		}
		
		PrettyTime p = new PrettyTime();
		if(language != null)
		{
			Locale loc = new Locale(language);
			p.setLocale(loc);
		}
		return p.format(date);
	}
	
} //ItemImpl