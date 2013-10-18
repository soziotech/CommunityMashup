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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.application.impl.ApplicationPackageImpl;
import org.sociotech.communitymashup.collection.CollectionFactory;
import org.sociotech.communitymashup.collection.CollectionPackage;
import org.sociotech.communitymashup.collection.ItemsCollection;
import org.sociotech.communitymashup.collection.ManualCollection;
import org.sociotech.communitymashup.collection.RemoteCollection;
import org.sociotech.communitymashup.collection.SmartInformationObjectCollection;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.impl.DataPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionPackageImpl extends EPackageImpl implements CollectionPackage {
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
	private EClass itemsCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartInformationObjectCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteCollectionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollectionPackageImpl() {
		super(eNS_URI, CollectionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CollectionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CollectionPackage init() {
		if (isInited) return (CollectionPackage)EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI);

		// Obtain or create and register package
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CollectionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CollectionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);

		// Create package meta-data objects
		theCollectionPackage.createPackageContents();
		theDataPackage.createPackageContents();
		theApplicationPackage.createPackageContents();

		// Initialize created meta-data
		theCollectionPackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCollectionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CollectionPackage.eNS_URI, theCollectionPackage);
		return theCollectionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemsCollection() {
		return itemsCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemsCollection_Items() {
		return (EReference)itemsCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemsCollection_DataSet() {
		return (EReference)itemsCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartInformationObjectCollection() {
		return smartInformationObjectCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartInformationObjectCollection_PositiveTags() {
		return (EReference)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartInformationObjectCollection_NegativeTags() {
		return (EReference)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartInformationObjectCollection_PositiveMetaTags() {
		return (EReference)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartInformationObjectCollection_PositiveCategories() {
		return (EReference)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartInformationObjectCollection_PositivePersons() {
		return (EReference)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartInformationObjectCollection_NegativeMetaTags() {
		return (EReference)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartInformationObjectCollection_NegativeCategories() {
		return (EReference)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartInformationObjectCollection_NegativePersons() {
		return (EReference)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartInformationObjectCollection_PositiveOrganisations() {
		return (EReference)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSmartInformationObjectCollection_NegativeOrganisations() {
		return (EReference)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartInformationObjectCollection_IncludePersons() {
		return (EAttribute)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartInformationObjectCollection_IncludeOrganisations() {
		return (EAttribute)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartInformationObjectCollection_IncludeContents() {
		return (EAttribute)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmartInformationObjectCollection_MinimumAge() {
		return (EAttribute)smartInformationObjectCollectionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSmartInformationObjectCollection__AddPositive__Item() {
		return smartInformationObjectCollectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSmartInformationObjectCollection__AddNegative__Item() {
		return smartInformationObjectCollectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSmartInformationObjectCollection__Remove__Item() {
		return smartInformationObjectCollectionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualCollection() {
		return manualCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManualCollection__AddItem__Item() {
		return manualCollectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManualCollection__RemoveItem__Item() {
		return manualCollectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoteCollection() {
		return remoteCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoteCollection_RemoteURL() {
		return (EAttribute)remoteCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFactory getCollectionFactory() {
		return (CollectionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		itemsCollectionEClass = createEClass(ITEMS_COLLECTION);
		createEReference(itemsCollectionEClass, ITEMS_COLLECTION__ITEMS);
		createEReference(itemsCollectionEClass, ITEMS_COLLECTION__DATA_SET);

		smartInformationObjectCollectionEClass = createEClass(SMART_INFORMATION_OBJECT_COLLECTION);
		createEReference(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_TAGS);
		createEReference(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_TAGS);
		createEReference(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_META_TAGS);
		createEReference(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_CATEGORIES);
		createEReference(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_PERSONS);
		createEReference(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_META_TAGS);
		createEReference(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_CATEGORIES);
		createEReference(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_PERSONS);
		createEReference(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_ORGANISATIONS);
		createEReference(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_ORGANISATIONS);
		createEAttribute(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_PERSONS);
		createEAttribute(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_ORGANISATIONS);
		createEAttribute(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_CONTENTS);
		createEAttribute(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION__MINIMUM_AGE);
		createEOperation(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION___ADD_POSITIVE__ITEM);
		createEOperation(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION___ADD_NEGATIVE__ITEM);
		createEOperation(smartInformationObjectCollectionEClass, SMART_INFORMATION_OBJECT_COLLECTION___REMOVE__ITEM);

		manualCollectionEClass = createEClass(MANUAL_COLLECTION);
		createEOperation(manualCollectionEClass, MANUAL_COLLECTION___ADD_ITEM__ITEM);
		createEOperation(manualCollectionEClass, MANUAL_COLLECTION___REMOVE_ITEM__ITEM);

		remoteCollectionEClass = createEClass(REMOTE_COLLECTION);
		createEAttribute(remoteCollectionEClass, REMOTE_COLLECTION__REMOTE_URL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		smartInformationObjectCollectionEClass.getESuperTypes().add(this.getItemsCollection());
		manualCollectionEClass.getESuperTypes().add(this.getItemsCollection());
		remoteCollectionEClass.getESuperTypes().add(this.getItemsCollection());

		// Initialize classes, features, and operations; add parameters
		initEClass(itemsCollectionEClass, ItemsCollection.class, "ItemsCollection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemsCollection_Items(), theDataPackage.getItem(), null, "items", null, 0, -1, ItemsCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemsCollection_DataSet(), theDataPackage.getDataSet(), null, "dataSet", null, 1, 1, ItemsCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smartInformationObjectCollectionEClass, SmartInformationObjectCollection.class, "SmartInformationObjectCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSmartInformationObjectCollection_PositiveTags(), theDataPackage.getTag(), null, "positiveTags", null, 0, -1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartInformationObjectCollection_NegativeTags(), theDataPackage.getTag(), null, "negativeTags", null, 0, -1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartInformationObjectCollection_PositiveMetaTags(), theDataPackage.getMetaTag(), null, "positiveMetaTags", null, 0, -1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartInformationObjectCollection_PositiveCategories(), theDataPackage.getCategory(), null, "positiveCategories", null, 0, -1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartInformationObjectCollection_PositivePersons(), theDataPackage.getPerson(), null, "positivePersons", null, 0, -1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartInformationObjectCollection_NegativeMetaTags(), theDataPackage.getMetaTag(), null, "negativeMetaTags", null, 0, -1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartInformationObjectCollection_NegativeCategories(), theDataPackage.getCategory(), null, "negativeCategories", null, 0, -1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartInformationObjectCollection_NegativePersons(), theDataPackage.getPerson(), null, "negativePersons", null, 0, -1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartInformationObjectCollection_PositiveOrganisations(), theDataPackage.getOrganisation(), null, "positiveOrganisations", null, 0, -1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSmartInformationObjectCollection_NegativeOrganisations(), theDataPackage.getOrganisation(), null, "negativeOrganisations", null, 0, -1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartInformationObjectCollection_IncludePersons(), ecorePackage.getEBooleanObject(), "includePersons", "true", 0, 1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartInformationObjectCollection_IncludeOrganisations(), ecorePackage.getEBooleanObject(), "includeOrganisations", "true", 0, 1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartInformationObjectCollection_IncludeContents(), ecorePackage.getEBooleanObject(), "includeContents", "true", 0, 1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmartInformationObjectCollection_MinimumAge(), ecorePackage.getEDate(), "minimumAge", null, 0, 1, SmartInformationObjectCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getSmartInformationObjectCollection__AddPositive__Item(), theDataPackage.getItem(), "addPositive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getItem(), "item", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSmartInformationObjectCollection__AddNegative__Item(), theDataPackage.getItem(), "addNegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getItem(), "item", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSmartInformationObjectCollection__Remove__Item(), theDataPackage.getItem(), "remove", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getItem(), "item", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(manualCollectionEClass, ManualCollection.class, "ManualCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getManualCollection__AddItem__Item(), theDataPackage.getItem(), "addItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getManualCollection__RemoveItem__Item(), theDataPackage.getItem(), "removeItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theDataPackage.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(remoteCollectionEClass, RemoteCollection.class, "RemoteCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoteCollection_RemoteURL(), ecorePackage.getEString(), "remoteURL", null, 1, 1, RemoteCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CollectionPackageImpl
