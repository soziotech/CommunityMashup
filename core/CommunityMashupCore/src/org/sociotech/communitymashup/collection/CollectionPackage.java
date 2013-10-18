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

package org.sociotech.communitymashup.collection;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.sociotech.communitymashup.collection.CollectionFactory
 * @model kind="package"
 * @generated
 */
public interface CollectionPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://collection.communitmashup.sociotech.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "collection";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollectionPackage eINSTANCE = org.sociotech.communitymashup.collection.impl.CollectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.collection.impl.ItemsCollectionImpl <em>Items Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.collection.impl.ItemsCollectionImpl
	 * @see org.sociotech.communitymashup.collection.impl.CollectionPackageImpl#getItemsCollection()
	 * @generated
	 */
	int ITEMS_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_COLLECTION__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_COLLECTION__DATA_SET = 1;

	/**
	 * The number of structural features of the '<em>Items Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_COLLECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Items Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMS_COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl <em>Smart Information Object Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl
	 * @see org.sociotech.communitymashup.collection.impl.CollectionPackageImpl#getSmartInformationObjectCollection()
	 * @generated
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__ITEMS = ITEMS_COLLECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__DATA_SET = ITEMS_COLLECTION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Positive Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_TAGS = ITEMS_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Negative Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_TAGS = ITEMS_COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Positive Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_META_TAGS = ITEMS_COLLECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Positive Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_CATEGORIES = ITEMS_COLLECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Positive Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_PERSONS = ITEMS_COLLECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Negative Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_META_TAGS = ITEMS_COLLECTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Negative Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_CATEGORIES = ITEMS_COLLECTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Negative Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_PERSONS = ITEMS_COLLECTION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Positive Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_ORGANISATIONS = ITEMS_COLLECTION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Negative Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_ORGANISATIONS = ITEMS_COLLECTION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Include Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_PERSONS = ITEMS_COLLECTION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Include Organisations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_ORGANISATIONS = ITEMS_COLLECTION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Include Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_CONTENTS = ITEMS_COLLECTION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Minimum Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION__MINIMUM_AGE = ITEMS_COLLECTION_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Smart Information Object Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION_FEATURE_COUNT = ITEMS_COLLECTION_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Add Positive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION___ADD_POSITIVE__ITEM = ITEMS_COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Negative</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION___ADD_NEGATIVE__ITEM = ITEMS_COLLECTION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION___REMOVE__ITEM = ITEMS_COLLECTION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Smart Information Object Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMART_INFORMATION_OBJECT_COLLECTION_OPERATION_COUNT = ITEMS_COLLECTION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.collection.impl.ManualCollectionImpl <em>Manual Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.collection.impl.ManualCollectionImpl
	 * @see org.sociotech.communitymashup.collection.impl.CollectionPackageImpl#getManualCollection()
	 * @generated
	 */
	int MANUAL_COLLECTION = 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_COLLECTION__ITEMS = ITEMS_COLLECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_COLLECTION__DATA_SET = ITEMS_COLLECTION__DATA_SET;

	/**
	 * The number of structural features of the '<em>Manual Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_COLLECTION_FEATURE_COUNT = ITEMS_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_COLLECTION___ADD_ITEM__ITEM = ITEMS_COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_COLLECTION___REMOVE_ITEM__ITEM = ITEMS_COLLECTION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Manual Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_COLLECTION_OPERATION_COUNT = ITEMS_COLLECTION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.collection.impl.RemoteCollectionImpl <em>Remote Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.collection.impl.RemoteCollectionImpl
	 * @see org.sociotech.communitymashup.collection.impl.CollectionPackageImpl#getRemoteCollection()
	 * @generated
	 */
	int REMOTE_COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COLLECTION__ITEMS = ITEMS_COLLECTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COLLECTION__DATA_SET = ITEMS_COLLECTION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Remote URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COLLECTION__REMOTE_URL = ITEMS_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remote Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COLLECTION_FEATURE_COUNT = ITEMS_COLLECTION_FEATURE_COUNT + 1;


	/**
	 * The number of operations of the '<em>Remote Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOTE_COLLECTION_OPERATION_COUNT = ITEMS_COLLECTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.collection.ItemsCollection <em>Items Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Items Collection</em>'.
	 * @see org.sociotech.communitymashup.collection.ItemsCollection
	 * @generated
	 */
	EClass getItemsCollection();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.collection.ItemsCollection#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see org.sociotech.communitymashup.collection.ItemsCollection#getItems()
	 * @see #getItemsCollection()
	 * @generated
	 */
	EReference getItemsCollection_Items();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.collection.ItemsCollection#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Set</em>'.
	 * @see org.sociotech.communitymashup.collection.ItemsCollection#getDataSet()
	 * @see #getItemsCollection()
	 * @generated
	 */
	EReference getItemsCollection_DataSet();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection <em>Smart Information Object Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smart Information Object Collection</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection
	 * @generated
	 */
	EClass getSmartInformationObjectCollection();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveTags <em>Positive Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Positive Tags</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveTags()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EReference getSmartInformationObjectCollection_PositiveTags();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeTags <em>Negative Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Negative Tags</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeTags()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EReference getSmartInformationObjectCollection_NegativeTags();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveMetaTags <em>Positive Meta Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Positive Meta Tags</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveMetaTags()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EReference getSmartInformationObjectCollection_PositiveMetaTags();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveCategories <em>Positive Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Positive Categories</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveCategories()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EReference getSmartInformationObjectCollection_PositiveCategories();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositivePersons <em>Positive Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Positive Persons</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositivePersons()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EReference getSmartInformationObjectCollection_PositivePersons();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeMetaTags <em>Negative Meta Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Negative Meta Tags</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeMetaTags()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EReference getSmartInformationObjectCollection_NegativeMetaTags();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeCategories <em>Negative Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Negative Categories</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeCategories()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EReference getSmartInformationObjectCollection_NegativeCategories();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativePersons <em>Negative Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Negative Persons</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativePersons()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EReference getSmartInformationObjectCollection_NegativePersons();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveOrganisations <em>Positive Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Positive Organisations</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveOrganisations()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EReference getSmartInformationObjectCollection_PositiveOrganisations();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeOrganisations <em>Negative Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Negative Organisations</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeOrganisations()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EReference getSmartInformationObjectCollection_NegativeOrganisations();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludePersons <em>Include Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Persons</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludePersons()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EAttribute getSmartInformationObjectCollection_IncludePersons();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludeOrganisations <em>Include Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Organisations</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludeOrganisations()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EAttribute getSmartInformationObjectCollection_IncludeOrganisations();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludeContents <em>Include Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Contents</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludeContents()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EAttribute getSmartInformationObjectCollection_IncludeContents();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getMinimumAge <em>Minimum Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Age</em>'.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getMinimumAge()
	 * @see #getSmartInformationObjectCollection()
	 * @generated
	 */
	EAttribute getSmartInformationObjectCollection_MinimumAge();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#addPositive(org.sociotech.communitymashup.data.Item) <em>Add Positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Positive</em>' operation.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#addPositive(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getSmartInformationObjectCollection__AddPositive__Item();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#addNegative(org.sociotech.communitymashup.data.Item) <em>Add Negative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Negative</em>' operation.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#addNegative(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getSmartInformationObjectCollection__AddNegative__Item();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#remove(org.sociotech.communitymashup.data.Item) <em>Remove</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove</em>' operation.
	 * @see org.sociotech.communitymashup.collection.SmartInformationObjectCollection#remove(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getSmartInformationObjectCollection__Remove__Item();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.collection.ManualCollection <em>Manual Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual Collection</em>'.
	 * @see org.sociotech.communitymashup.collection.ManualCollection
	 * @generated
	 */
	EClass getManualCollection();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.collection.ManualCollection#addItem(org.sociotech.communitymashup.data.Item) <em>Add Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Item</em>' operation.
	 * @see org.sociotech.communitymashup.collection.ManualCollection#addItem(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getManualCollection__AddItem__Item();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.collection.ManualCollection#removeItem(org.sociotech.communitymashup.data.Item) <em>Remove Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Item</em>' operation.
	 * @see org.sociotech.communitymashup.collection.ManualCollection#removeItem(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getManualCollection__RemoveItem__Item();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.collection.RemoteCollection <em>Remote Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remote Collection</em>'.
	 * @see org.sociotech.communitymashup.collection.RemoteCollection
	 * @generated
	 */
	EClass getRemoteCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.collection.RemoteCollection#getRemoteURL <em>Remote URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote URL</em>'.
	 * @see org.sociotech.communitymashup.collection.RemoteCollection#getRemoteURL()
	 * @see #getRemoteCollection()
	 * @generated
	 */
	EAttribute getRemoteCollection_RemoteURL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollectionFactory getCollectionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.collection.impl.ItemsCollectionImpl <em>Items Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.collection.impl.ItemsCollectionImpl
		 * @see org.sociotech.communitymashup.collection.impl.CollectionPackageImpl#getItemsCollection()
		 * @generated
		 */
		EClass ITEMS_COLLECTION = eINSTANCE.getItemsCollection();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEMS_COLLECTION__ITEMS = eINSTANCE.getItemsCollection_Items();

		/**
		 * The meta object literal for the '<em><b>Data Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEMS_COLLECTION__DATA_SET = eINSTANCE.getItemsCollection_DataSet();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl <em>Smart Information Object Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl
		 * @see org.sociotech.communitymashup.collection.impl.CollectionPackageImpl#getSmartInformationObjectCollection()
		 * @generated
		 */
		EClass SMART_INFORMATION_OBJECT_COLLECTION = eINSTANCE.getSmartInformationObjectCollection();

		/**
		 * The meta object literal for the '<em><b>Positive Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_TAGS = eINSTANCE.getSmartInformationObjectCollection_PositiveTags();

		/**
		 * The meta object literal for the '<em><b>Negative Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_TAGS = eINSTANCE.getSmartInformationObjectCollection_NegativeTags();

		/**
		 * The meta object literal for the '<em><b>Positive Meta Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_META_TAGS = eINSTANCE.getSmartInformationObjectCollection_PositiveMetaTags();

		/**
		 * The meta object literal for the '<em><b>Positive Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_CATEGORIES = eINSTANCE.getSmartInformationObjectCollection_PositiveCategories();

		/**
		 * The meta object literal for the '<em><b>Positive Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_PERSONS = eINSTANCE.getSmartInformationObjectCollection_PositivePersons();

		/**
		 * The meta object literal for the '<em><b>Negative Meta Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_META_TAGS = eINSTANCE.getSmartInformationObjectCollection_NegativeMetaTags();

		/**
		 * The meta object literal for the '<em><b>Negative Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_CATEGORIES = eINSTANCE.getSmartInformationObjectCollection_NegativeCategories();

		/**
		 * The meta object literal for the '<em><b>Negative Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_PERSONS = eINSTANCE.getSmartInformationObjectCollection_NegativePersons();

		/**
		 * The meta object literal for the '<em><b>Positive Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_INFORMATION_OBJECT_COLLECTION__POSITIVE_ORGANISATIONS = eINSTANCE.getSmartInformationObjectCollection_PositiveOrganisations();

		/**
		 * The meta object literal for the '<em><b>Negative Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMART_INFORMATION_OBJECT_COLLECTION__NEGATIVE_ORGANISATIONS = eINSTANCE.getSmartInformationObjectCollection_NegativeOrganisations();

		/**
		 * The meta object literal for the '<em><b>Include Persons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_PERSONS = eINSTANCE.getSmartInformationObjectCollection_IncludePersons();

		/**
		 * The meta object literal for the '<em><b>Include Organisations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_ORGANISATIONS = eINSTANCE.getSmartInformationObjectCollection_IncludeOrganisations();

		/**
		 * The meta object literal for the '<em><b>Include Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_INFORMATION_OBJECT_COLLECTION__INCLUDE_CONTENTS = eINSTANCE.getSmartInformationObjectCollection_IncludeContents();

		/**
		 * The meta object literal for the '<em><b>Minimum Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMART_INFORMATION_OBJECT_COLLECTION__MINIMUM_AGE = eINSTANCE.getSmartInformationObjectCollection_MinimumAge();

		/**
		 * The meta object literal for the '<em><b>Add Positive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SMART_INFORMATION_OBJECT_COLLECTION___ADD_POSITIVE__ITEM = eINSTANCE.getSmartInformationObjectCollection__AddPositive__Item();

		/**
		 * The meta object literal for the '<em><b>Add Negative</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SMART_INFORMATION_OBJECT_COLLECTION___ADD_NEGATIVE__ITEM = eINSTANCE.getSmartInformationObjectCollection__AddNegative__Item();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SMART_INFORMATION_OBJECT_COLLECTION___REMOVE__ITEM = eINSTANCE.getSmartInformationObjectCollection__Remove__Item();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.collection.impl.ManualCollectionImpl <em>Manual Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.collection.impl.ManualCollectionImpl
		 * @see org.sociotech.communitymashup.collection.impl.CollectionPackageImpl#getManualCollection()
		 * @generated
		 */
		EClass MANUAL_COLLECTION = eINSTANCE.getManualCollection();

		/**
		 * The meta object literal for the '<em><b>Add Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANUAL_COLLECTION___ADD_ITEM__ITEM = eINSTANCE.getManualCollection__AddItem__Item();

		/**
		 * The meta object literal for the '<em><b>Remove Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANUAL_COLLECTION___REMOVE_ITEM__ITEM = eINSTANCE.getManualCollection__RemoveItem__Item();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.collection.impl.RemoteCollectionImpl <em>Remote Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.collection.impl.RemoteCollectionImpl
		 * @see org.sociotech.communitymashup.collection.impl.CollectionPackageImpl#getRemoteCollection()
		 * @generated
		 */
		EClass REMOTE_COLLECTION = eINSTANCE.getRemoteCollection();

		/**
		 * The meta object literal for the '<em><b>Remote URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOTE_COLLECTION__REMOTE_URL = eINSTANCE.getRemoteCollection_RemoteURL();

	}

} //CollectionPackage
