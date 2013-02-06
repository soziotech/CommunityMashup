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

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.collection.CollectionPackage;
import org.sociotech.communitymashup.collection.ItemsCollection;
import org.sociotech.communitymashup.collection.ManualCollection;
import org.sociotech.communitymashup.collection.RemoteCollection;
import org.sociotech.communitymashup.collection.SmartInformationObjectCollection;
import org.sociotech.communitymashup.data.Category;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.data.MetaTag;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.Tag;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.RestUtil;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smart Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getPositiveTags <em>Positive Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getNegativeTags <em>Negative Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getPositiveMetaTags <em>Positive Meta Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getPositiveCategories <em>Positive Categories</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getPositivePersons <em>Positive Persons</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getNegativeMetaTags <em>Negative Meta Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getNegativeCategories <em>Negative Categories</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getNegativePersons <em>Negative Persons</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getPositiveOrganisations <em>Positive Organisations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getNegativeOrganisations <em>Negative Organisations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getIncludePersons <em>Include Persons</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getIncludeOrganisations <em>Include Organisations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getIncludeContents <em>Include Contents</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl#getMinimumAge <em>Minimum Age</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SmartInformationObjectCollectionImpl extends ItemsCollectionImpl implements SmartInformationObjectCollection {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The cached value of the '{@link #getPositiveTags() <em>Positive Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> positiveTags;

	/**
	 * The cached value of the '{@link #getNegativeTags() <em>Negative Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> negativeTags;

	/**
	 * The cached value of the '{@link #getPositiveMetaTags() <em>Positive Meta Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveMetaTags()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaTag> positiveMetaTags;

	/**
	 * The cached value of the '{@link #getPositiveCategories() <em>Positive Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> positiveCategories;

	/**
	 * The cached value of the '{@link #getPositivePersons() <em>Positive Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositivePersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> positivePersons;

	/**
	 * The cached value of the '{@link #getNegativeMetaTags() <em>Negative Meta Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeMetaTags()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaTag> negativeMetaTags;

	/**
	 * The cached value of the '{@link #getNegativeCategories() <em>Negative Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> negativeCategories;

	/**
	 * The cached value of the '{@link #getNegativePersons() <em>Negative Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativePersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> negativePersons;

	/**
	 * The cached value of the '{@link #getPositiveOrganisations() <em>Positive Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Organisation> positiveOrganisations;

	/**
	 * The cached value of the '{@link #getNegativeOrganisations() <em>Negative Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Organisation> negativeOrganisations;

	/**
	 * The default value of the '{@link #getIncludePersons() <em>Include Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePersons()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_PERSONS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIncludePersons() <em>Include Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludePersons()
	 * @generated
	 * @ordered
	 */
	protected Boolean includePersons = INCLUDE_PERSONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeOrganisations() <em>Include Organisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeOrganisations()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_ORGANISATIONS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIncludeOrganisations() <em>Include Organisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeOrganisations()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeOrganisations = INCLUDE_ORGANISATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeContents() <em>Include Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeContents()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCLUDE_CONTENTS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIncludeContents() <em>Include Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeContents()
	 * @generated
	 * @ordered
	 */
	protected Boolean includeContents = INCLUDE_CONTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumAge() <em>Minimum Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumAge()
	 * @generated
	 * @ordered
	 */
	protected static final Date MINIMUM_AGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumAge() <em>Minimum Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumAge()
	 * @generated
	 * @ordered
	 */
	protected Date minimumAge = MINIMUM_AGE_EDEFAULT;

	/**
	 * Adapter to monitor changes of the data set and automatically update the internal lists
	 */
	private DataSetChangeAdapter dataSetAdapter = null;

	/**
	 * Temporary set of elements that are allowed by a positive filter.
	 * This set exists for performance reasons.
	 */
	private HashSet<InformationObject> includedInformationObjects = null;
	
	/**
	 * Temporary set of elements that should be excluded by a negative filter
	 * This set exists for performance reasons.
	 */
	private HashSet<InformationObject> excludedInformationObjects = null;

	/**
	 * Temporary set of elements that mixes up included and excluded information objects.
	 * This set exists for performance reasons.
	 */
	private HashSet<InformationObject> possibleInformationObjects = null;

	/**
	 * Indicator to show if the possible elements set needs to be refreshed.
	 */
	private boolean possibleNeedsRefresh = true;
	
	/**
	 * Indicator to show if the included elements set needs to be refreshed.
	 */
	private boolean includedNeedsRefresh = true;
	
	/**
	 * Indicator to show if the excluded elements set needs to be refreshed.
	 */
	private boolean excludedNeedsRefresh = true;

	/**
	 * If this is true the interal list will only be updated on the next call to {@link #getItems()}
	 */
	private boolean onGetUpdate = false;

	/**
	 * Indicator to show if an update of the internal list is needed.
	 */
	private boolean needsUpdate = true;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartInformationObjectCollectionImpl() {
		super();
	}

	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.collection.impl.ItemsCollectionImpl#getDataSet()
	 */
	@Override
	public EList<Item> getItems() {
		if(needsUpdate)
		{
			// force update on get
			updateItemList(true);
		}
		return super.getItems();
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.collection.impl.ItemsCollectionImpl#setDataSet(org.sociotech.communitymashup.data.DataSet)
	 */
	@Override
	public void setDataSet(DataSet newDataSet) {
		DataSet oldDataSet = this.getDataSet();
	
		super.setDataSet(newDataSet);
		
		if(oldDataSet == newDataSet)
		{
			// no change
			return;
		}
		
		// update adapters on change
		if(dataSetAdapter != null && oldDataSet != null)
		{
			// remove it from old data set
			oldDataSet.eAdapters().remove(dataSetAdapter);
			dataSetAdapter = null;
		}
		
		// clear internal item list
		clearItemList();
		
		if(newDataSet == null)
		{
			return;
		}
		
		// refresh filtered items and update internal list
		includedNeedsRefresh();
		excludedNeedsRefresh();
		updateItemList(true);
		
		// create adapter to observe the data set and attach it to new data set
		dataSetAdapter = new DataSetChangeAdapter(this);
	}

	/**
	 * Removes all items from the internal list of items.
	 */
	private void clearItemList() {
		EList<Item> itemList = getItems();
		
		// if not already empty, clear it
		if(itemList != null && !itemList.isEmpty())
		{
			itemList.clear();
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectionPackage.Literals.SMART_INFORMATION_OBJECT_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getPositiveTags() {
		if (positiveTags == null) {
			positiveTags = new EObjectResolvingEList<Tag>(Tag.class, this, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_TAGS);
		}
		return positiveTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getNegativeTags() {
		if (negativeTags == null) {
			negativeTags = new EObjectResolvingEList<Tag>(Tag.class, this, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_TAGS);
		}
		return negativeTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaTag> getPositiveMetaTags() {
		if (positiveMetaTags == null) {
			positiveMetaTags = new EObjectResolvingEList<MetaTag>(MetaTag.class, this, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_META_TAGS);
		}
		return positiveMetaTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getPositiveCategories() {
		if (positiveCategories == null) {
			positiveCategories = new EObjectResolvingEList<Category>(Category.class, this, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_CATEGORIES);
		}
		return positiveCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPositivePersons() {
		if (positivePersons == null) {
			positivePersons = new EObjectResolvingEList<Person>(Person.class, this, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_PERSONS);
		}
		return positivePersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaTag> getNegativeMetaTags() {
		if (negativeMetaTags == null) {
			negativeMetaTags = new EObjectResolvingEList<MetaTag>(MetaTag.class, this, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_META_TAGS);
		}
		return negativeMetaTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getNegativeCategories() {
		if (negativeCategories == null) {
			negativeCategories = new EObjectResolvingEList<Category>(Category.class, this, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_CATEGORIES);
		}
		return negativeCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getNegativePersons() {
		if (negativePersons == null) {
			negativePersons = new EObjectResolvingEList<Person>(Person.class, this, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_PERSONS);
		}
		return negativePersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organisation> getPositiveOrganisations() {
		if (positiveOrganisations == null) {
			positiveOrganisations = new EObjectResolvingEList<Organisation>(Organisation.class, this, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_ORGANISATIONS);
		}
		return positiveOrganisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organisation> getNegativeOrganisations() {
		if (negativeOrganisations == null) {
			negativeOrganisations = new EObjectResolvingEList<Organisation>(Organisation.class, this, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_ORGANISATIONS);
		}
		return negativeOrganisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIncludePersons() {
		return includePersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setIncludePersons(Boolean newIncludePersons) {
		Boolean oldIncludePersons = includePersons;
		includePersons = newIncludePersons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_PERSONS, oldIncludePersons, includePersons));
		
		updateItemList(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIncludeOrganisations() {
		return includeOrganisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setIncludeOrganisations(Boolean newIncludeOrganisations) {
		Boolean oldIncludeOrganisations = includeOrganisations;
		includeOrganisations = newIncludeOrganisations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_ORGANISATIONS, oldIncludeOrganisations, includeOrganisations));
		
		updateItemList(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIncludeContents() {
		return includeContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setIncludeContents(Boolean newIncludeContents) {
		Boolean oldIncludeContents = includeContents;
		includeContents = newIncludeContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_CONTENTS, oldIncludeContents, includeContents));
		
		updateItemList(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMinimumAge() {
		return minimumAge;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Item addPositive(Item item) {
		if(item == null)
		{
			return null;
		}
		
		// add to lists depending on type
		if(item instanceof Tag)
		{
			this.getPositiveTags().add((Tag) item);
		}
		else if(item instanceof MetaTag)
		{
			this.getPositiveMetaTags().add((MetaTag) item);
		}
		else if(item instanceof Category)
		{
			this.getPositiveCategories().add((Category) item);
		}
		else if(item instanceof Person)
		{
			this.getPositivePersons().add((Person) item);
		}
		else if(item instanceof Organisation)
		{
			this.getPositiveOrganisations().add((Organisation) item);
		}
		else
		{
			log("Trying to add Item of unsupported type (" + item.getClass().getCanonicalName() + ") to positive filter list of smart collection" , LogService.LOG_ERROR);
		}
		
		// positive filter items have an impact to the included elements
		includedNeedsRefresh();
		
		updateItemList(false);
		
		return item;
	}

	/**
	 * Updates the internal item list. This is only be done if onGetUpdate is disabled or force is set to true.
	 * 
	 * @param force Set this to true to execute the update immediately.
	 */
	private void updateItemList(boolean force) {
		if(onGetUpdate == true && !force)
		{
			// then update on next get
			needsUpdate = true;
			return;
		}
		
		if(items == null)
		{
			// intitalize items with super get to avoid a new call to this method
			items = super.getItems();
		}
		
		EList<Item> removableObjects = new BasicEList<Item>();
	
		// remove old items
		
		// dont do a getItems cause this forces an new update
		for(Item item : items)
		{
			if(!fulFillsConditions(item))
			{
				removableObjects.add(item);
			}
		}
		
		// now remove all
		items.removeAll(removableObjects);
		
		// add new items
		for(InformationObject io : getPossibleInformationObjects())
		{
			// TODO: maybe this checks are to expensive
			if(fulFillsConditions(io) && !items.contains(io))
			{
				// than add it
				items.add(io);
			}
		}
		// update done
		needsUpdate = false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Item addNegative(Item item) {
		if(item == null)
		{
			return null;
		}
		
		// add to lists depending on type
		if(item instanceof Tag)
		{
			this.getNegativeTags().add((Tag) item);
		}
		else if(item instanceof MetaTag)
		{
			this.getNegativeMetaTags().add((MetaTag) item);
		}
		else if(item instanceof Category)
		{
			this.getNegativeCategories().add((Category) item);
		}
		else if(item instanceof Person)
		{
			this.getNegativePersons().add((Person) item);
		}
		else if(item instanceof Organisation)
		{
			this.getNegativeOrganisations().add((Organisation) item);
		}
		else
		{
			log("Trying to add Item of unsupported type (" + item.getClass().getCanonicalName() + ") to negative filter list of smart collection" , LogService.LOG_ERROR);
			return null;
		}
		
		// adding a negative has impact to excluded elements
		excludedNeedsRefresh();
		
		updateItemList(false);
		
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Removes the given item from any of the internal filter item list.
	 * 
	 * @param item The item that should be removed from the filter lists
	 * @return The item if it was contained in any of the filter list or null if it was not contained.
	 * <!-- end-user-doc -->
	 */
	public Item remove(Item item) {
		if(item == null)
		{
			return null;
		}
		
		// remove from list depending on type
		if(item instanceof Tag)
		{
			this.getPositiveTags().remove((Tag) item);
		}
		else if(item instanceof MetaTag)
		{
			this.getPositiveMetaTags().remove((MetaTag) item);
		}
		else if(item instanceof Category)
		{
			this.getPositiveCategories().remove((Category) item);
		}
		else if(item instanceof Person)
		{
			this.getPositivePersons().remove((Person) item);
		}
		else if(item instanceof Organisation)
		{
			this.getPositiveOrganisations().remove((Organisation) item);
		}
		else
		{
			// item not contained in any filter list, so return null to show that it was not removed
			return null;
		}
		
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setMinimumAge(Date newMinimumAge) {
		Date oldMinimumAge = minimumAge;
		minimumAge = newMinimumAge;
		updateItemList(false);
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__MINIMUM_AGE, oldMinimumAge, minimumAge));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_TAGS:
				return getPositiveTags();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_TAGS:
				return getNegativeTags();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_META_TAGS:
				return getPositiveMetaTags();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_CATEGORIES:
				return getPositiveCategories();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_PERSONS:
				return getPositivePersons();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_META_TAGS:
				return getNegativeMetaTags();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_CATEGORIES:
				return getNegativeCategories();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_PERSONS:
				return getNegativePersons();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_ORGANISATIONS:
				return getPositiveOrganisations();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_ORGANISATIONS:
				return getNegativeOrganisations();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_PERSONS:
				return getIncludePersons();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_ORGANISATIONS:
				return getIncludeOrganisations();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_CONTENTS:
				return getIncludeContents();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__MINIMUM_AGE:
				return getMinimumAge();
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
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_TAGS:
				getPositiveTags().clear();
				getPositiveTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_TAGS:
				getNegativeTags().clear();
				getNegativeTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_META_TAGS:
				getPositiveMetaTags().clear();
				getPositiveMetaTags().addAll((Collection<? extends MetaTag>)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_CATEGORIES:
				getPositiveCategories().clear();
				getPositiveCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_PERSONS:
				getPositivePersons().clear();
				getPositivePersons().addAll((Collection<? extends Person>)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_META_TAGS:
				getNegativeMetaTags().clear();
				getNegativeMetaTags().addAll((Collection<? extends MetaTag>)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_CATEGORIES:
				getNegativeCategories().clear();
				getNegativeCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_PERSONS:
				getNegativePersons().clear();
				getNegativePersons().addAll((Collection<? extends Person>)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_ORGANISATIONS:
				getPositiveOrganisations().clear();
				getPositiveOrganisations().addAll((Collection<? extends Organisation>)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_ORGANISATIONS:
				getNegativeOrganisations().clear();
				getNegativeOrganisations().addAll((Collection<? extends Organisation>)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_PERSONS:
				setIncludePersons((Boolean)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_ORGANISATIONS:
				setIncludeOrganisations((Boolean)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_CONTENTS:
				setIncludeContents((Boolean)newValue);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__MINIMUM_AGE:
				setMinimumAge((Date)newValue);
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
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_TAGS:
				getPositiveTags().clear();
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_TAGS:
				getNegativeTags().clear();
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_META_TAGS:
				getPositiveMetaTags().clear();
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_CATEGORIES:
				getPositiveCategories().clear();
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_PERSONS:
				getPositivePersons().clear();
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_META_TAGS:
				getNegativeMetaTags().clear();
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_CATEGORIES:
				getNegativeCategories().clear();
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_PERSONS:
				getNegativePersons().clear();
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_ORGANISATIONS:
				getPositiveOrganisations().clear();
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_ORGANISATIONS:
				getNegativeOrganisations().clear();
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_PERSONS:
				setIncludePersons(INCLUDE_PERSONS_EDEFAULT);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_ORGANISATIONS:
				setIncludeOrganisations(INCLUDE_ORGANISATIONS_EDEFAULT);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_CONTENTS:
				setIncludeContents(INCLUDE_CONTENTS_EDEFAULT);
				return;
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__MINIMUM_AGE:
				setMinimumAge(MINIMUM_AGE_EDEFAULT);
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
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_TAGS:
				return positiveTags != null && !positiveTags.isEmpty();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_TAGS:
				return negativeTags != null && !negativeTags.isEmpty();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_META_TAGS:
				return positiveMetaTags != null && !positiveMetaTags.isEmpty();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_CATEGORIES:
				return positiveCategories != null && !positiveCategories.isEmpty();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_PERSONS:
				return positivePersons != null && !positivePersons.isEmpty();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_META_TAGS:
				return negativeMetaTags != null && !negativeMetaTags.isEmpty();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_CATEGORIES:
				return negativeCategories != null && !negativeCategories.isEmpty();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_PERSONS:
				return negativePersons != null && !negativePersons.isEmpty();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_ORGANISATIONS:
				return positiveOrganisations != null && !positiveOrganisations.isEmpty();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_ORGANISATIONS:
				return negativeOrganisations != null && !negativeOrganisations.isEmpty();
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_PERSONS:
				return INCLUDE_PERSONS_EDEFAULT == null ? includePersons != null : !INCLUDE_PERSONS_EDEFAULT.equals(includePersons);
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_ORGANISATIONS:
				return INCLUDE_ORGANISATIONS_EDEFAULT == null ? includeOrganisations != null : !INCLUDE_ORGANISATIONS_EDEFAULT.equals(includeOrganisations);
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_CONTENTS:
				return INCLUDE_CONTENTS_EDEFAULT == null ? includeContents != null : !INCLUDE_CONTENTS_EDEFAULT.equals(includeContents);
			case CollectionPackage.SMART_INFORMATION_OBJECT_COLLECTION__MINIMUM_AGE:
				return MINIMUM_AGE_EDEFAULT == null ? minimumAge != null : !MINIMUM_AGE_EDEFAULT.equals(minimumAge);
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
		result.append(" (includePersons: ");
		result.append(includePersons);
		result.append(", includeOrganisations: ");
		result.append(includeOrganisations);
		result.append(", includeContents: ");
		result.append(includeContents);
		result.append(", minimumAge: ");
		result.append(minimumAge);
		result.append(')');
		return result.toString();
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type SmartInformationObjectCollection.
	 * 
	 * @return An EObjectCondition whether the Object is of the type SmartInformationObjectCollection.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(CollectionPackageImpl.eINSTANCE.getSmartInformationObjectCollection());
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
		if ( featureName.equalsIgnoreCase("positiveTags") )
			return this.getPositiveTags();		
		if ( featureName.equalsIgnoreCase("negativeTags") )
			return this.getNegativeTags();		
		if ( featureName.equalsIgnoreCase("positiveMetaTags") )
			return this.getPositiveMetaTags();		
		if ( featureName.equalsIgnoreCase("positiveCategories") )
			return this.getPositiveCategories();		
		if ( featureName.equalsIgnoreCase("positivePersons") )
			return this.getPositivePersons();		
		if ( featureName.equalsIgnoreCase("negativeMetaTags") )
			return this.getNegativeMetaTags();		
		if ( featureName.equalsIgnoreCase("negativeCategories") )
			return this.getNegativeCategories();		
		if ( featureName.equalsIgnoreCase("negativePersons") )
			return this.getNegativePersons();		
		if ( featureName.equalsIgnoreCase("positiveOrganisations") )
			return this.getPositiveOrganisations();		
		if ( featureName.equalsIgnoreCase("negativeOrganisations") )
			return this.getNegativeOrganisations();		
		if ( featureName.equalsIgnoreCase("includePersons") )
			return this.getIncludePersons();		
		if ( featureName.equalsIgnoreCase("includeOrganisations") )
			return this.getIncludeOrganisations();		
		if ( featureName.equalsIgnoreCase("includeContents") )
			return this.getIncludeContents();		
		if ( featureName.equalsIgnoreCase("minimumAge") )
			return this.getMinimumAge();			
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
		if ( featureName.equalsIgnoreCase("includePersons") ) {
				java.lang.Boolean fincludePersons = null;
				try {
					try {
						fincludePersons = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fincludePersons = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("SmartInformationObjectCollection.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setIncludePersons(fincludePersons);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("includeOrganisations") ) {
				java.lang.Boolean fincludeOrganisations = null;
				try {
					try {
						fincludeOrganisations = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fincludeOrganisations = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("SmartInformationObjectCollection.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setIncludeOrganisations(fincludeOrganisations);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("includeContents") ) {
				java.lang.Boolean fincludeContents = null;
				try {
					try {
						fincludeContents = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fincludeContents = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("SmartInformationObjectCollection.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setIncludeContents(fincludeContents);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("minimumAge") ) {
				java.util.Date fminimumAge = null;
				try {
					try {
						fminimumAge = RestUtil.fromDateString((String) value);
						if(fminimumAge == null) {
							fminimumAge = (java.util.Date)(RestUtil.fromInput(value));
						}
					} catch (ClassNotFoundException e) {
						fminimumAge = (java.util.Date)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("SmartInformationObjectCollection.setFeature", "java.util.Date",value.getClass().getName());
				}
				this.setMinimumAge(fminimumAge);
			return this;
			}			
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
		if ( command.getCommand().equalsIgnoreCase("addPositive")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("SmartInformationObjectCollection.doOperation", 1, command.getArgCount()); 
			Item item = null;
			try {
				try {
					item = (Item)(RestUtil.fromInput(command.getArg("item")));
				} catch (ClassNotFoundException e) {
					item = (Item)command.getArg("item");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("SmartInformationObjectCollection.doOperation", "Item", command.getArg("item").getClass().getName());
			}
			return this.addPositive(item);
		}
		if ( command.getCommand().equalsIgnoreCase("addNegative")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("SmartInformationObjectCollection.doOperation", 1, command.getArgCount()); 
			Item item = null;
			try {
				try {
					item = (Item)(RestUtil.fromInput(command.getArg("item")));
				} catch (ClassNotFoundException e) {
					item = (Item)command.getArg("item");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("SmartInformationObjectCollection.doOperation", "Item", command.getArg("item").getClass().getName());
			}
			return this.addNegative(item);
		}
		if ( command.getCommand().equalsIgnoreCase("remove")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("SmartInformationObjectCollection.doOperation", 1, command.getArgCount()); 
			Item item = null;
			try {
				try {
					item = (Item)(RestUtil.fromInput(command.getArg("item")));
				} catch (ClassNotFoundException e) {
					item = (Item)command.getArg("item");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("SmartInformationObjectCollection.doOperation", "Item", command.getArg("item").getClass().getName());
			}
			return this.remove(item);
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
	
	/**
	 * Checks if a given item fulfills all conditions to be included in this collection. Every
	 * information object is allowed if all filter lists are empty.
	 * 
	 * @param item Item to check if it should be contained in this collection.
	 * @return True if the given item fulfills all conditions, false otherwise.
	 */
	private boolean fulFillsConditions(Item item)
	{
		// only information objects are allowed
		if(!(item instanceof InformationObject))
		{
			// includes null
			return false;
		}
		
		InformationObject infoObject = (InformationObject) item;
		
		// check if type is allowed
		if(!isTypeAllowed(infoObject))
		{
			return false;
		}

		// check if object is old enough
		if(getMinimumAge() != null)
		{
			if(infoObject.getLastModified() == null && infoObject.getCreated() == null)
			{
				return false;
			}
			else if(!(infoObject.getCreated() != null 		 && infoObject.getCreated().after(getMinimumAge()) || 
					 (infoObject.getLastModified() != null	 && infoObject.getLastModified().after(getMinimumAge()))))
			{
				return false;
			}
		}
		
		// not in filtered objects
		if(!getPossibleInformationObjects().contains(infoObject))
		{
			return false;
		}
		
		return true;
	}
	
	/**
	 * Checks if all filter lists are empty.
	 * 
	 * @return True if all filter lists are empty, false otherwise.
	 */
	private boolean allFiltersEmpty() {
		
		// check all filter list if they are empty
		return  allPositiveFiltersEmpty() && allNegativeFiltersEmpty();
	}
	
	/**
	 * Returns true if all positive filters are empty.
	 * 
	 * @return True if all positive filters are empty.
	 */
	private boolean allPositiveFiltersEmpty() {
		return  getPositiveCategories().isEmpty() &&
				getPositiveMetaTags().isEmpty() &&
				getPositiveOrganisations().isEmpty() &&
				getPositivePersons().isEmpty() &&
				getPositiveTags().isEmpty();
	}
	
	/**
	 * Returns true if all negative filters are empty.
	 * 
	 * @return True if all negative filters are empty.
	 */
	private boolean allNegativeFiltersEmpty() {
		return  getNegativeCategories().isEmpty() &&
				getNegativeMetaTags().isEmpty() &&
				getNegativeOrganisations().isEmpty() &&
				getNegativePersons().isEmpty() &&
				getNegativeTags().isEmpty();
	}

	/**
	 * Returns true if types of the given information object should be included
	 * in this collection. This can be controlled by {@link #setIncludeContents(Boolean)}, {@link #setIncludeOrganisations(Boolean)}, {@link #setIncludePersons(Boolean)}
	 * 
	 * @param infoObject The information object to check the type of
	 * @return True if the type of the information object is allowed, false otherwise.
	 */
	private boolean isTypeAllowed(InformationObject infoObject) {
		
		// if it is a content and contents are allowed
		if(infoObject instanceof Content)
		{
			return getIncludeContents();
		}
		
		// if it is a person and persons are allowed
		if(infoObject instanceof Person)
		{
			return getIncludePersons();
		}
		
		// if it is an organisation and organisations are allowed
		if(infoObject instanceof Organisation)
		{
			return getIncludeOrganisations();
		}
		
		// could currently not be reached but maybe in the future by data model changes 
		return false;
	}

	/**
	 * Returns the set of possible information objects that should be included due to positive filters and not excluded due to negative fiters.
	 * Combines the sets of {@link #getIncludedInformationObjects()} and {@link #getExcludedInformationObjects()}.
	 * If this set does not exist yet or needs a refresh than it will be created.
	 * 
	 * @return A set of possible information objects that are included due to positive and negative filters.
	 */
	private HashSet<InformationObject> getPossibleInformationObjects() {
		
		if(possibleInformationObjects == null)
		{
			// create a new has set
			possibleInformationObjects = new HashSet<InformationObject>();
			possibleNeedsRefresh();
		}
		
		if(possibleNeedsRefresh)
		{
			possibleInformationObjects.clear();
			
			if(allFiltersEmpty())
			{
				// if no filters set than add all information objects
				possibleInformationObjects.addAll(dataSet.getInformationObjects());
			}	
			else
			{
				// add all included
				possibleInformationObjects.addAll(getIncludedInformationObjects());
				
				// remove all excluded
				possibleInformationObjects.removeAll(getExcludedInformationObjects());
			}
			
			// mark as refreshed
			possibleNeedsRefresh = false;
		}
		
		return possibleInformationObjects;
	}
	
	/**
	 * Returns the set of information objects that should be included due to positive filters.
	 * If this set does not exist yet or needs a refresh than it will be created.
	 * 
	 * @return A set of information objects that are included due to positive filters.
	 */
	private HashSet<InformationObject> getIncludedInformationObjects() {
		
		if(includedInformationObjects == null)
		{
			// create a new has set
			includedInformationObjects = new HashSet<InformationObject>();
			includedNeedsRefresh();
		}
		
		if(includedNeedsRefresh)
		{
			includedInformationObjects.clear();
			
			if(allPositiveFiltersEmpty())
			{
				includedInformationObjects.addAll(dataSet.getInformationObjects());
			}
			else
			{
				addByTag(getPositiveTags(), includedInformationObjects);
				addByMetaTag(getPositiveMetaTags(), includedInformationObjects);
				addByCategory(getPositiveCategories(), includedInformationObjects);
				addByPerson(getPositivePersons(), includedInformationObjects);
				addByOrganisation(getPositiveOrganisations(), includedInformationObjects);
			}
			
			// mark as refreshed
			includedNeedsRefresh = false;
			
			// now the possible elements need a refresh
			possibleNeedsRefresh();
		}
		
		return includedInformationObjects;
	}
	
	/**
	 * Returns the set of information objects that should be excluded due to negative filters.
	 * If this set does not exist yet or needs a refresh than it will be created.
	 * 
	 * @return A set of information objects that are excluded due to negative filters.
	 */
	private HashSet<InformationObject> getExcludedInformationObjects() {
		
		if(excludedInformationObjects == null)
		{
			// create a new has set
			excludedInformationObjects = new HashSet<InformationObject>();
			includedNeedsRefresh();
		}
		
		if(excludedNeedsRefresh)
		{
			excludedInformationObjects.clear();
			
			if(!allNegativeFiltersEmpty())
			{
				addByTag(getNegativeTags(), excludedInformationObjects);
				addByMetaTag(getNegativeMetaTags(), excludedInformationObjects);
				addByCategory(getNegativeCategories(), excludedInformationObjects);
				addByPerson(getNegativePersons(), excludedInformationObjects);
				addByOrganisation(getNegativeOrganisations(), excludedInformationObjects);
			}
			
			// mark as refreshed
			excludedNeedsRefresh = false;
			
			// now the possible elements need a refresh
			possibleNeedsRefresh();
		}
		
		return excludedInformationObjects;
	}

	/**
	 * Adds all information object to the given set, that are tagged by one of the given tags.
	 *  
	 * @param taglist List of tags.
	 * @param set Set to add the tagged information objects to.
	 */
	private void addByTag(EList<Tag> taglist, HashSet<InformationObject> set) {
		// add all information objects that are tagged by one of the given tags
		EList<InformationObject> possibleInformationObjects = null;
		if(!taglist.isEmpty())
		{
			possibleInformationObjects = dataSet.getInformationObjectsWithOneOfTags(taglist);
			set.addAll(possibleInformationObjects);
		}
	}
	
	/**
	 * Adds all information object to the given set, that are tagged by one of the given meta tags.
	 *  
	 * @param taglist List of meta tags.
	 * @param set Set to add the tagged information objects to.
	 */
	private void addByMetaTag(EList<MetaTag> taglist, HashSet<InformationObject> set) {
		// add all information objects that are tagged by one of the given meta tags
		EList<InformationObject> possibleInformationObjects = null;
		if(!taglist.isEmpty())
		{
			possibleInformationObjects = dataSet.getInformationObjectsWithOneOfMetaTags(taglist);
			set.addAll(possibleInformationObjects);
		}
	}
	
	/**
	 * Adds all information object to the given set, that are categorized by one of the given categories.
	 *  
	 * @param categoryList List of categories.
	 * @param set Set to add the categorized information objects to.
	 */
	private void addByCategory(EList<Category> categoryList, HashSet<InformationObject> set) {
		// add all information objects that are tagged by one of the given tags
		EList<InformationObject> possibleInformationObjects = null;
		if(!categoryList.isEmpty())
		{
			possibleInformationObjects = dataSet.getInformationObjectsWithOneOfCategories(categoryList);
			set.addAll(possibleInformationObjects);
		}
	}
	
	/**
	 * Adds all contents to the given set, that are authored or contributed to by one of the given persons. Adds also all
	 * organisations of every person.
	 *  
	 * @param personList List of persons.
	 * @param set Set to add the information object to.
	 */
	private void addByPerson(EList<Person> personList, HashSet<InformationObject> set) {
		
		if(!personList.isEmpty())
		{
			for(Person person : personList)
			{
				set.addAll(person.getAuthored());
				set.addAll(person.getContributed());
				set.addAll(person.getOrganisations());
				// TODO maybe check if connected persons make sense
			}
			// add also all persons
			set.addAll(personList);
		}
	}
	
	/**
	 * Adds all contents to the given set, that are authored or contributed to by one of the persons that are in one of the given organisations.
	 * Adds also all members of the given organisations, the leader and all sub organisations.
	 *  
	 * @param organisationList List of organisations.
	 * @param set Set to add the information objects to.
	 */
	private void addByOrganisation(EList<Organisation> organisationList, HashSet<InformationObject> set) {
		
		if(!organisationList.isEmpty())
		{
			for(Organisation organisation : organisationList)
			{
				set.addAll(organisation.getContents());
				set.addAll(organisation.getParticipants());
				set.add(organisation.getLeader());
				set.addAll(organisation.getOrganisations());
			}
			// add also all organisations
			set.addAll(organisationList);
		}
	}

	/**
	 * States that the possible elements set need a refresh.
	 */
	private void possibleNeedsRefresh() {
		possibleNeedsRefresh = true;
		needsUpdate = true;
	}
	
	/**
	 * States that the included elements set need a refresh.
	 */
	private void includedNeedsRefresh() {
		includedNeedsRefresh = true;
		possibleNeedsRefresh();
	}

	/**
	 * States that the included elements set need a refresh.
	 */
	private void excludedNeedsRefresh() {
		excludedNeedsRefresh = true;
		possibleNeedsRefresh();
	}
	
	/**
	 * Internal class to observe changes to the data set and update internal lists.
	 * 
	 * @author Peter Lachenmaier
	 */
	private class DataSetChangeAdapter extends EContentAdapter {
		
		private SmartInformationObjectCollectionImpl smartCollection = null;
		
		public DataSetChangeAdapter(SmartInformationObjectCollectionImpl smartCollection) {
			super();
			
			this.smartCollection = smartCollection;
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
		 */
		@Override
		public void notifyChanged(Notification notification) {
			
			Object value = null;
			Object notifier = null;
			
			int eventType = notification.getEventType();
			
			switch (eventType) {
				
				// only react to add and remove
				// these are the only operations used for data sets
				// TODO: maybe check this again when bulk operation are needed
				case Notification.ADD:
					
					// This notification will be thrown if an new item will be added to the data set
					// or if an item will be added to an list (like something is tagged)
					
					// the posible elements need a refresh if new item are added to the data set
					includedNeedsRefresh();
					excludedNeedsRefresh();
					
					value = notification.getNewValue();
					
					// check if the new value is an item and maybe needs to be added to the collection
					if(value instanceof Item)
					{
						Item item = (Item) value;
						checkItem(item);
					}
					
					notifier = notification.getNotifier();
					
					// check the notifier if it needs to be added or removed from the collection (maybe got a new tag)
					if(notifier instanceof Item)
					{
						Item item = (Item) value;
						checkItem(item);
					}
					
					break;
					
				case Notification.REMOVE:
					
					// This notification will be thrown if an item will be removed from the data set
					// or if an item will be removed from a list (like something is un-tagged)
					
					// the posible elements need a refresh if new item are added to the data set
					includedNeedsRefresh();
					excludedNeedsRefresh();
					
					value = notification.getOldValue();
					
					// check if the old value is an item and maybe needs to be removed from the collection
					if(value instanceof Item)
					{
						Item item = (Item) value;
						checkItem(item);
						
						// TODO: check if the item was a filter value
					}
					
					notifier = notification.getNotifier();
					
					// check the notifier if it needs to be added or removed from the collection (maybe got a new tag)
					if(notifier instanceof Item)
					{
						Item item = (Item) value;
						checkItem(item);
					}
					
					break;
	
				default:
					break;
			}
		}

		/**
		 * Checks if the given item fulfills all conditions and than adds it to the list. If it does not fulfill
		 * all conditions and was previously on the list, than it will be removed.
		 * 
		 * @param item Item to check
		 */
		private void checkItem(Item item) {
			
			if(item == null)
			{
				return;
			}
			
			EList<Item> allItems = smartCollection.getItems();
			
			if(smartCollection.fulFillsConditions(item))
			{
				if(!allItems.contains(item))
				{
					// add it only if it was not previously on the list
					allItems.add(item);
				}
			}
			else if(allItems.contains(item))
			{
				// if it previously fulfilled all condition and does no more than remove it
				allItems.remove(item);
			}
		}
	}
} //SmartInformationObjectCollectionImpl
