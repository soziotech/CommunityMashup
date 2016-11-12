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
package org.sociotech.communitymashup.data;

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
 * @see org.sociotech.communitymashup.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
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
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://data.cscm.communitymashup.de";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = org.sociotech.communitymashup.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 4;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DATA_SET = 0;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IDENT = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__URI = 2;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STRING_VALUE = 3;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STRING_XML = 4;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LAST_MODIFIED = 5;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CREATED = 6;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__META_TAGS = 7;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IDENTIFIED_BY = 8;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DELETE_ON_DELETE = 9;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DELETED_IF_DELETED = 10;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__FORCED_DELETE_ON_DELETE = 11;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__FORCED_DELETED_IF_DELETED = 12;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 13;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___LOG__STRING = 0;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___LOG__STRING_INTEGER = 1;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___META_TAG__STRING = 2;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___IDENTIFY_BY__STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___GET_IDENTIFIER__STRING = 4;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___HAS_META_TAG__STRING = 5;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___MATCHES_SEARCH__STRING = 6;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___DELETE = 7;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___IS_EQUAL_ITEM__ITEM = 8;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = 9;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___GET_CREATED_PRETTY = 10;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = 11;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___GET_LAST_MODIFIED_PRETTY = 12;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___DELETE_ON_DELETE_OF__ITEM = 13;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___DELETE_IF_EMPTY_ON_DELETE = 14;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___UPDATE__ITEM = 15;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___FORCE_UPDATE__ITEM = 16;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___UN_META_TAG__STRING = 17;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___REMOVE_IDENTIFIER__STRING = 18;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___FORCE_DELETE_ON_DELETE_OF__ITEM = 19;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl <em>Information Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.InformationObjectImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getInformationObject()
	 * @generated
	 */
	int INFORMATION_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__DATA_SET = ITEM__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__IDENT = ITEM__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__URI = ITEM__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__STRING_VALUE = ITEM__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__STRING_XML = ITEM__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__LAST_MODIFIED = ITEM__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__CREATED = ITEM__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__META_TAGS = ITEM__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__IDENTIFIED_BY = ITEM__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__DELETE_ON_DELETE = ITEM__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__DELETED_IF_DELETED = ITEM__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__FORCED_DELETE_ON_DELETE = ITEM__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__FORCED_DELETED_IF_DELETED = ITEM__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__CATEGORIES = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__TAGS = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Images</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__IMAGES = ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Star Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__STAR_RANKINGS = ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Thumb Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__THUMB_RANKINGS = ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__VIEW_RANKINGS = ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__NAME = ITEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__CONNECTED_TO = ITEM_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Connected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__CONNECTED_BY = ITEM_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Binaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__BINARIES = ITEM_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Main Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__MAIN_CATEGORY = ITEM_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Meta Informations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__META_INFORMATIONS = ITEM_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Alternative Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__ALTERNATIVE_NAMES = ITEM_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Verified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT__VERIFIED_NAME = ITEM_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Information Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT_FEATURE_COUNT = ITEM_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___LOG__STRING = ITEM___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___LOG__STRING_INTEGER = ITEM___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___META_TAG__STRING = ITEM___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___IDENTIFY_BY__STRING_STRING = ITEM___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_IDENTIFIER__STRING = ITEM___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___HAS_META_TAG__STRING = ITEM___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___MATCHES_SEARCH__STRING = ITEM___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___DELETE = ITEM___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___IS_EQUAL_ITEM__ITEM = ITEM___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_CREATED_PRETTY = ITEM___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_LAST_MODIFIED_PRETTY = ITEM___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___DELETE_ON_DELETE_OF__ITEM = ITEM___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___DELETE_IF_EMPTY_ON_DELETE = ITEM___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___UPDATE__ITEM = ITEM___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___FORCE_UPDATE__ITEM = ITEM___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___UN_META_TAG__STRING = ITEM___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___REMOVE_IDENTIFIER__STRING = ITEM___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___FORCE_DELETE_ON_DELETE_OF__ITEM = ITEM___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___TAG__STRING = ITEM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Categorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___CATEGORIZE__STRING = ITEM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Attach Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___ATTACH_IMAGE__STRING = ITEM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Attachments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_ATTACHMENTS = ITEM_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Star Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___STAR_RANK__INTEGER_INTEGER = ITEM_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___VIEW = ITEM_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Thumbs Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___THUMBS_UP = ITEM_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Thumbs Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___THUMBS_DOWN = ITEM_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Thumbs Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_THUMBS_UP = ITEM_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Thumbs Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_THUMBS_DOWN = ITEM_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Thumbs Up Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_THUMBS_UP_COUNT = ITEM_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Thumbs Down Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_THUMBS_DOWN_COUNT = ITEM_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Thumbs Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_THUMBS_COUNT = ITEM_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Views Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_VIEWS_COUNT = ITEM_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Star Ranking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_STAR_RANKING = ITEM_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Extend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___EXTEND__METAINFORMATION = ITEM_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Get Web Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_WEB_ACCOUNTS = ITEM_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Get Web Sites</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_WEB_SITES = ITEM_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Get Phones</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_PHONES = ITEM_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Get Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_LOCATIONS = ITEM_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Get Emails</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_EMAILS = ITEM_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Get Instant Messengers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_INSTANT_MESSENGERS = ITEM_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Add Email Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___ADD_EMAIL_ADDRESS__STRING = ITEM_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Add Web Site</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___ADD_WEB_SITE__STRING = ITEM_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Get Information Objects With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_WITH_COMMON_TAGS = ITEM_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Add Web Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___ADD_WEB_ACCOUNT__STRING = ITEM_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Has Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___HAS_IMAGES = ITEM_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Get Information Objects Connected To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO = ITEM_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Get Information Objects Connected From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM = ITEM_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Information Objects Connected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED = ITEM_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Connect To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___CONNECT_TO__INFORMATIONOBJECT = ITEM_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Connect To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___CONNECT_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING = ITEM_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Get Information Objects Connected To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO_WITH_META_TAG__STRING = ITEM_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Get Information Objects Connected From With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM_WITH_META_TAG__STRING = ITEM_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Get Information Objects Connected With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_WITH_META_TAG__STRING = ITEM_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Get Connections From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_CONNECTIONS_FROM__INFORMATIONOBJECT = ITEM_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Get Connections To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_CONNECTIONS_TO__INFORMATIONOBJECT = ITEM_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Connect To With Value And Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___CONNECT_TO_WITH_VALUE_AND_META_TAG__INFORMATIONOBJECT_STRING_STRING = ITEM_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Get Connection To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_CONNECTION_TO__INFORMATIONOBJECT_STRING = ITEM_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Get Connection From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_CONNECTION_FROM__INFORMATIONOBJECT_STRING = ITEM_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Get Attachment With Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_ATTACHMENT_WITH_URL__STRING = ITEM_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Get Attached Image With Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_URL__STRING = ITEM_OPERATION_COUNT + 41;

	/**
	 * The operation id for the '<em>Add Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___ADD_PHONE__STRING = ITEM_OPERATION_COUNT + 42;

	/**
	 * The operation id for the '<em>Get Persons With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_PERSONS_WITH_COMMON_TAGS = ITEM_OPERATION_COUNT + 43;

	/**
	 * The operation id for the '<em>Get Organisations With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_ORGANISATIONS_WITH_COMMON_TAGS = ITEM_OPERATION_COUNT + 44;

	/**
	 * The operation id for the '<em>Get Contents With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_CONTENTS_WITH_COMMON_TAGS = ITEM_OPERATION_COUNT + 45;

	/**
	 * The operation id for the '<em>Un Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___UN_TAG__STRING = ITEM_OPERATION_COUNT + 46;

	/**
	 * The operation id for the '<em>Un Categorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___UN_CATEGORIZE__STRING = ITEM_OPERATION_COUNT + 47;

	/**
	 * The operation id for the '<em>Get Slug Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_SLUG_NAME = ITEM_OPERATION_COUNT + 48;

	/**
	 * The operation id for the '<em>Get Connections To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_CONNECTIONS_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING = ITEM_OPERATION_COUNT + 49;

	/**
	 * The operation id for the '<em>Get Connections From With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_CONNECTIONS_FROM_WITH_META_TAG__INFORMATIONOBJECT_STRING = ITEM_OPERATION_COUNT + 50;

	/**
	 * The operation id for the '<em>Star Rank With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG__INTEGER_INTEGER_STRING = ITEM_OPERATION_COUNT + 51;

	/**
	 * The operation id for the '<em>Add Alternative Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___ADD_ALTERNATIVE_NAME__STRING = ITEM_OPERATION_COUNT + 52;

	/**
	 * The operation id for the '<em>Get Attached Image With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG__METATAG = ITEM_OPERATION_COUNT + 53;

	/**
	 * The operation id for the '<em>Get Attached Image With Meta Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG_NAME__STRING = ITEM_OPERATION_COUNT + 54;

	/**
	 * The operation id for the '<em>Star Rank With Meta Tag List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG_LIST__INTEGER_INTEGER_STRING = ITEM_OPERATION_COUNT + 55;

	/**
	 * The operation id for the '<em>Add Web Account For Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___ADD_WEB_ACCOUNT_FOR_SERVICE__STRING_STRING = ITEM_OPERATION_COUNT + 56;

	/**
	 * The operation id for the '<em>Get Attached Images Without Meta Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG_NAME__STRING = ITEM_OPERATION_COUNT + 57;

	/**
	 * The operation id for the '<em>Get Attached Images Without Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG__METATAG = ITEM_OPERATION_COUNT + 58;

	/**
	 * The operation id for the '<em>Get Indoor Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_INDOOR_LOCATIONS = ITEM_OPERATION_COUNT + 59;

	/**
	 * The operation id for the '<em>Get Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT___GET_EVENTS = ITEM_OPERATION_COUNT + 60;

	/**
	 * The number of operations of the '<em>Information Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT_OPERATION_COUNT = ITEM_OPERATION_COUNT + 61;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.PersonImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 0;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATA_SET = INFORMATION_OBJECT__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IDENT = INFORMATION_OBJECT__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__URI = INFORMATION_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STRING_VALUE = INFORMATION_OBJECT__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STRING_XML = INFORMATION_OBJECT__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_MODIFIED = INFORMATION_OBJECT__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CREATED = INFORMATION_OBJECT__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__META_TAGS = INFORMATION_OBJECT__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IDENTIFIED_BY = INFORMATION_OBJECT__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DELETE_ON_DELETE = INFORMATION_OBJECT__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DELETED_IF_DELETED = INFORMATION_OBJECT__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FORCED_DELETE_ON_DELETE = INFORMATION_OBJECT__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FORCED_DELETED_IF_DELETED = INFORMATION_OBJECT__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CATEGORIES = INFORMATION_OBJECT__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TAGS = INFORMATION_OBJECT__TAGS;

	/**
	 * The feature id for the '<em><b>Images</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IMAGES = INFORMATION_OBJECT__IMAGES;

	/**
	 * The feature id for the '<em><b>Star Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__STAR_RANKINGS = INFORMATION_OBJECT__STAR_RANKINGS;

	/**
	 * The feature id for the '<em><b>Thumb Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__THUMB_RANKINGS = INFORMATION_OBJECT__THUMB_RANKINGS;

	/**
	 * The feature id for the '<em><b>View Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__VIEW_RANKINGS = INFORMATION_OBJECT__VIEW_RANKINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = INFORMATION_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONNECTED_TO = INFORMATION_OBJECT__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Connected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONNECTED_BY = INFORMATION_OBJECT__CONNECTED_BY;

	/**
	 * The feature id for the '<em><b>Binaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__BINARIES = INFORMATION_OBJECT__BINARIES;

	/**
	 * The feature id for the '<em><b>Main Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MAIN_CATEGORY = INFORMATION_OBJECT__MAIN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Meta Informations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__META_INFORMATIONS = INFORMATION_OBJECT__META_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Alternative Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ALTERNATIVE_NAMES = INFORMATION_OBJECT__ALTERNATIVE_NAMES;

	/**
	 * The feature id for the '<em><b>Verified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__VERIFIED_NAME = INFORMATION_OBJECT__VERIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LASTNAME = INFORMATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRSTNAME = INFORMATION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Leader Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LEADER_OF = INFORMATION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Participates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PARTICIPATES = INFORMATION_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Authored</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AUTHORED = INFORMATION_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contributed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONTRIBUTED = INFORMATION_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DATE_OF_BIRTH = INFORMATION_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSONS = INFORMATION_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TITLE = INFORMATION_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ranked</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__RANKED = INFORMATION_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = INFORMATION_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___LOG__STRING = INFORMATION_OBJECT___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___LOG__STRING_INTEGER = INFORMATION_OBJECT___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___META_TAG__STRING = INFORMATION_OBJECT___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___IDENTIFY_BY__STRING_STRING = INFORMATION_OBJECT___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_IDENTIFIER__STRING = INFORMATION_OBJECT___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___HAS_META_TAG__STRING = INFORMATION_OBJECT___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___MATCHES_SEARCH__STRING = INFORMATION_OBJECT___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___DELETE = INFORMATION_OBJECT___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___IS_EQUAL_ITEM__ITEM = INFORMATION_OBJECT___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = INFORMATION_OBJECT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_CREATED_PRETTY = INFORMATION_OBJECT___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = INFORMATION_OBJECT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_LAST_MODIFIED_PRETTY = INFORMATION_OBJECT___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___DELETE_ON_DELETE_OF__ITEM = INFORMATION_OBJECT___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___DELETE_IF_EMPTY_ON_DELETE = INFORMATION_OBJECT___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___UPDATE__ITEM = INFORMATION_OBJECT___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___FORCE_UPDATE__ITEM = INFORMATION_OBJECT___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___UN_META_TAG__STRING = INFORMATION_OBJECT___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___REMOVE_IDENTIFIER__STRING = INFORMATION_OBJECT___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___FORCE_DELETE_ON_DELETE_OF__ITEM = INFORMATION_OBJECT___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___TAG__STRING = INFORMATION_OBJECT___TAG__STRING;

	/**
	 * The operation id for the '<em>Categorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CATEGORIZE__STRING = INFORMATION_OBJECT___CATEGORIZE__STRING;

	/**
	 * The operation id for the '<em>Attach Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ATTACH_IMAGE__STRING = INFORMATION_OBJECT___ATTACH_IMAGE__STRING;

	/**
	 * The operation id for the '<em>Get Attachments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_ATTACHMENTS = INFORMATION_OBJECT___GET_ATTACHMENTS;

	/**
	 * The operation id for the '<em>Star Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___STAR_RANK__INTEGER_INTEGER = INFORMATION_OBJECT___STAR_RANK__INTEGER_INTEGER;

	/**
	 * The operation id for the '<em>View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___VIEW = INFORMATION_OBJECT___VIEW;

	/**
	 * The operation id for the '<em>Thumbs Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___THUMBS_UP = INFORMATION_OBJECT___THUMBS_UP;

	/**
	 * The operation id for the '<em>Thumbs Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___THUMBS_DOWN = INFORMATION_OBJECT___THUMBS_DOWN;

	/**
	 * The operation id for the '<em>Get Thumbs Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_THUMBS_UP = INFORMATION_OBJECT___GET_THUMBS_UP;

	/**
	 * The operation id for the '<em>Get Thumbs Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_THUMBS_DOWN = INFORMATION_OBJECT___GET_THUMBS_DOWN;

	/**
	 * The operation id for the '<em>Get Thumbs Up Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_THUMBS_UP_COUNT = INFORMATION_OBJECT___GET_THUMBS_UP_COUNT;

	/**
	 * The operation id for the '<em>Get Thumbs Down Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_THUMBS_DOWN_COUNT = INFORMATION_OBJECT___GET_THUMBS_DOWN_COUNT;

	/**
	 * The operation id for the '<em>Get Thumbs Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_THUMBS_COUNT = INFORMATION_OBJECT___GET_THUMBS_COUNT;

	/**
	 * The operation id for the '<em>Get Views Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_VIEWS_COUNT = INFORMATION_OBJECT___GET_VIEWS_COUNT;

	/**
	 * The operation id for the '<em>Get Star Ranking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_STAR_RANKING = INFORMATION_OBJECT___GET_STAR_RANKING;

	/**
	 * The operation id for the '<em>Extend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___EXTEND__METAINFORMATION = INFORMATION_OBJECT___EXTEND__METAINFORMATION;

	/**
	 * The operation id for the '<em>Get Web Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_WEB_ACCOUNTS = INFORMATION_OBJECT___GET_WEB_ACCOUNTS;

	/**
	 * The operation id for the '<em>Get Web Sites</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_WEB_SITES = INFORMATION_OBJECT___GET_WEB_SITES;

	/**
	 * The operation id for the '<em>Get Phones</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_PHONES = INFORMATION_OBJECT___GET_PHONES;

	/**
	 * The operation id for the '<em>Get Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_LOCATIONS = INFORMATION_OBJECT___GET_LOCATIONS;

	/**
	 * The operation id for the '<em>Get Emails</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_EMAILS = INFORMATION_OBJECT___GET_EMAILS;

	/**
	 * The operation id for the '<em>Get Instant Messengers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_INSTANT_MESSENGERS = INFORMATION_OBJECT___GET_INSTANT_MESSENGERS;

	/**
	 * The operation id for the '<em>Add Email Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ADD_EMAIL_ADDRESS__STRING = INFORMATION_OBJECT___ADD_EMAIL_ADDRESS__STRING;

	/**
	 * The operation id for the '<em>Add Web Site</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ADD_WEB_SITE__STRING = INFORMATION_OBJECT___ADD_WEB_SITE__STRING;

	/**
	 * The operation id for the '<em>Get Information Objects With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_INFORMATION_OBJECTS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Add Web Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ADD_WEB_ACCOUNT__STRING = INFORMATION_OBJECT___ADD_WEB_ACCOUNT__STRING;

	/**
	 * The operation id for the '<em>Has Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___HAS_IMAGES = INFORMATION_OBJECT___HAS_IMAGES;

	/**
	 * The operation id for the '<em>Get Information Objects Connected To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_INFORMATION_OBJECTS_CONNECTED_TO = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO;

	/**
	 * The operation id for the '<em>Get Information Objects Connected From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_INFORMATION_OBJECTS_CONNECTED_FROM = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM;

	/**
	 * The operation id for the '<em>Get Information Objects Connected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_INFORMATION_OBJECTS_CONNECTED = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED;

	/**
	 * The operation id for the '<em>Connect To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CONNECT_TO__INFORMATIONOBJECT = INFORMATION_OBJECT___CONNECT_TO__INFORMATIONOBJECT;

	/**
	 * The operation id for the '<em>Connect To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CONNECT_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___CONNECT_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Information Objects Connected To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_INFORMATION_OBJECTS_CONNECTED_TO_WITH_META_TAG__STRING = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO_WITH_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Information Objects Connected From With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_INFORMATION_OBJECTS_CONNECTED_FROM_WITH_META_TAG__STRING = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM_WITH_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Information Objects Connected With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_INFORMATION_OBJECTS_CONNECTED_WITH_META_TAG__STRING = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_WITH_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Connections From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_CONNECTIONS_FROM__INFORMATIONOBJECT = INFORMATION_OBJECT___GET_CONNECTIONS_FROM__INFORMATIONOBJECT;

	/**
	 * The operation id for the '<em>Get Connections To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_CONNECTIONS_TO__INFORMATIONOBJECT = INFORMATION_OBJECT___GET_CONNECTIONS_TO__INFORMATIONOBJECT;

	/**
	 * The operation id for the '<em>Connect To With Value And Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___CONNECT_TO_WITH_VALUE_AND_META_TAG__INFORMATIONOBJECT_STRING_STRING = INFORMATION_OBJECT___CONNECT_TO_WITH_VALUE_AND_META_TAG__INFORMATIONOBJECT_STRING_STRING;

	/**
	 * The operation id for the '<em>Get Connection To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_CONNECTION_TO__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTION_TO__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Connection From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_CONNECTION_FROM__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTION_FROM__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Attachment With Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_ATTACHMENT_WITH_URL__STRING = INFORMATION_OBJECT___GET_ATTACHMENT_WITH_URL__STRING;

	/**
	 * The operation id for the '<em>Get Attached Image With Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_ATTACHED_IMAGE_WITH_URL__STRING = INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_URL__STRING;

	/**
	 * The operation id for the '<em>Add Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ADD_PHONE__STRING = INFORMATION_OBJECT___ADD_PHONE__STRING;

	/**
	 * The operation id for the '<em>Get Persons With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_PERSONS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_PERSONS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Get Organisations With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_ORGANISATIONS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_ORGANISATIONS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Get Contents With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_CONTENTS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_CONTENTS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Un Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___UN_TAG__STRING = INFORMATION_OBJECT___UN_TAG__STRING;

	/**
	 * The operation id for the '<em>Un Categorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___UN_CATEGORIZE__STRING = INFORMATION_OBJECT___UN_CATEGORIZE__STRING;

	/**
	 * The operation id for the '<em>Get Slug Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_SLUG_NAME = INFORMATION_OBJECT___GET_SLUG_NAME;

	/**
	 * The operation id for the '<em>Get Connections To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_CONNECTIONS_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTIONS_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Connections From With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_CONNECTIONS_FROM_WITH_META_TAG__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTIONS_FROM_WITH_META_TAG__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Star Rank With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___STAR_RANK_WITH_META_TAG__INTEGER_INTEGER_STRING = INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG__INTEGER_INTEGER_STRING;

	/**
	 * The operation id for the '<em>Add Alternative Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ADD_ALTERNATIVE_NAME__STRING = INFORMATION_OBJECT___ADD_ALTERNATIVE_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Attached Image With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_ATTACHED_IMAGE_WITH_META_TAG__METATAG = INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG__METATAG;

	/**
	 * The operation id for the '<em>Get Attached Image With Meta Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_ATTACHED_IMAGE_WITH_META_TAG_NAME__STRING = INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Star Rank With Meta Tag List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___STAR_RANK_WITH_META_TAG_LIST__INTEGER_INTEGER_STRING = INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG_LIST__INTEGER_INTEGER_STRING;

	/**
	 * The operation id for the '<em>Add Web Account For Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ADD_WEB_ACCOUNT_FOR_SERVICE__STRING_STRING = INFORMATION_OBJECT___ADD_WEB_ACCOUNT_FOR_SERVICE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Attached Images Without Meta Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_ATTACHED_IMAGES_WITHOUT_META_TAG_NAME__STRING = INFORMATION_OBJECT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Attached Images Without Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_ATTACHED_IMAGES_WITHOUT_META_TAG__METATAG = INFORMATION_OBJECT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG__METATAG;

	/**
	 * The operation id for the '<em>Get Indoor Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_INDOOR_LOCATIONS = INFORMATION_OBJECT___GET_INDOOR_LOCATIONS;

	/**
	 * The operation id for the '<em>Get Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_EVENTS = INFORMATION_OBJECT___GET_EVENTS;

	/**
	 * The operation id for the '<em>Get Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_CONTENTS = INFORMATION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Organisations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___GET_ORGANISATIONS = INFORMATION_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Contributed Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ADD_CONTRIBUTED_CONTENT__CONTENT = INFORMATION_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Authored Content</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___ADD_AUTHORED_CONTENT__CONTENT = INFORMATION_OBJECT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Parse First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PARSE_FIRST_NAME = INFORMATION_OBJECT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Parse Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___PARSE_LAST_NAME = INFORMATION_OBJECT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = INFORMATION_OBJECT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.ContentImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DATA_SET = INFORMATION_OBJECT__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__IDENT = INFORMATION_OBJECT__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__URI = INFORMATION_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__STRING_VALUE = INFORMATION_OBJECT__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__STRING_XML = INFORMATION_OBJECT__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__LAST_MODIFIED = INFORMATION_OBJECT__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CREATED = INFORMATION_OBJECT__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__META_TAGS = INFORMATION_OBJECT__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__IDENTIFIED_BY = INFORMATION_OBJECT__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DELETE_ON_DELETE = INFORMATION_OBJECT__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DELETED_IF_DELETED = INFORMATION_OBJECT__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__FORCED_DELETE_ON_DELETE = INFORMATION_OBJECT__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__FORCED_DELETED_IF_DELETED = INFORMATION_OBJECT__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CATEGORIES = INFORMATION_OBJECT__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TAGS = INFORMATION_OBJECT__TAGS;

	/**
	 * The feature id for the '<em><b>Images</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__IMAGES = INFORMATION_OBJECT__IMAGES;

	/**
	 * The feature id for the '<em><b>Star Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__STAR_RANKINGS = INFORMATION_OBJECT__STAR_RANKINGS;

	/**
	 * The feature id for the '<em><b>Thumb Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__THUMB_RANKINGS = INFORMATION_OBJECT__THUMB_RANKINGS;

	/**
	 * The feature id for the '<em><b>View Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__VIEW_RANKINGS = INFORMATION_OBJECT__VIEW_RANKINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__NAME = INFORMATION_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONNECTED_TO = INFORMATION_OBJECT__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Connected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONNECTED_BY = INFORMATION_OBJECT__CONNECTED_BY;

	/**
	 * The feature id for the '<em><b>Binaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__BINARIES = INFORMATION_OBJECT__BINARIES;

	/**
	 * The feature id for the '<em><b>Main Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__MAIN_CATEGORY = INFORMATION_OBJECT__MAIN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Meta Informations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__META_INFORMATIONS = INFORMATION_OBJECT__META_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Alternative Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__ALTERNATIVE_NAMES = INFORMATION_OBJECT__ALTERNATIVE_NAMES;

	/**
	 * The feature id for the '<em><b>Verified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__VERIFIED_NAME = INFORMATION_OBJECT__VERIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTENTS = INFORMATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__CONTRIBUTORS = INFORMATION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__AUTHOR = INFORMATION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DOCUMENTS = INFORMATION_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__PARENT_CONTENT = INFORMATION_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__LOCALE = INFORMATION_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__TRANSFORMATIONS = INFORMATION_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Videos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__VIDEOS = INFORMATION_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = INFORMATION_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___LOG__STRING = INFORMATION_OBJECT___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___LOG__STRING_INTEGER = INFORMATION_OBJECT___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___META_TAG__STRING = INFORMATION_OBJECT___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___IDENTIFY_BY__STRING_STRING = INFORMATION_OBJECT___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_IDENTIFIER__STRING = INFORMATION_OBJECT___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___HAS_META_TAG__STRING = INFORMATION_OBJECT___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___MATCHES_SEARCH__STRING = INFORMATION_OBJECT___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___DELETE = INFORMATION_OBJECT___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___IS_EQUAL_ITEM__ITEM = INFORMATION_OBJECT___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = INFORMATION_OBJECT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_CREATED_PRETTY = INFORMATION_OBJECT___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = INFORMATION_OBJECT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_LAST_MODIFIED_PRETTY = INFORMATION_OBJECT___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___DELETE_ON_DELETE_OF__ITEM = INFORMATION_OBJECT___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___DELETE_IF_EMPTY_ON_DELETE = INFORMATION_OBJECT___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___UPDATE__ITEM = INFORMATION_OBJECT___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___FORCE_UPDATE__ITEM = INFORMATION_OBJECT___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___UN_META_TAG__STRING = INFORMATION_OBJECT___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___REMOVE_IDENTIFIER__STRING = INFORMATION_OBJECT___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___FORCE_DELETE_ON_DELETE_OF__ITEM = INFORMATION_OBJECT___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___TAG__STRING = INFORMATION_OBJECT___TAG__STRING;

	/**
	 * The operation id for the '<em>Categorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___CATEGORIZE__STRING = INFORMATION_OBJECT___CATEGORIZE__STRING;

	/**
	 * The operation id for the '<em>Attach Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___ATTACH_IMAGE__STRING = INFORMATION_OBJECT___ATTACH_IMAGE__STRING;

	/**
	 * The operation id for the '<em>Get Attachments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_ATTACHMENTS = INFORMATION_OBJECT___GET_ATTACHMENTS;

	/**
	 * The operation id for the '<em>Star Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___STAR_RANK__INTEGER_INTEGER = INFORMATION_OBJECT___STAR_RANK__INTEGER_INTEGER;

	/**
	 * The operation id for the '<em>View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___VIEW = INFORMATION_OBJECT___VIEW;

	/**
	 * The operation id for the '<em>Thumbs Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___THUMBS_UP = INFORMATION_OBJECT___THUMBS_UP;

	/**
	 * The operation id for the '<em>Thumbs Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___THUMBS_DOWN = INFORMATION_OBJECT___THUMBS_DOWN;

	/**
	 * The operation id for the '<em>Get Thumbs Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_THUMBS_UP = INFORMATION_OBJECT___GET_THUMBS_UP;

	/**
	 * The operation id for the '<em>Get Thumbs Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_THUMBS_DOWN = INFORMATION_OBJECT___GET_THUMBS_DOWN;

	/**
	 * The operation id for the '<em>Get Thumbs Up Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_THUMBS_UP_COUNT = INFORMATION_OBJECT___GET_THUMBS_UP_COUNT;

	/**
	 * The operation id for the '<em>Get Thumbs Down Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_THUMBS_DOWN_COUNT = INFORMATION_OBJECT___GET_THUMBS_DOWN_COUNT;

	/**
	 * The operation id for the '<em>Get Thumbs Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_THUMBS_COUNT = INFORMATION_OBJECT___GET_THUMBS_COUNT;

	/**
	 * The operation id for the '<em>Get Views Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_VIEWS_COUNT = INFORMATION_OBJECT___GET_VIEWS_COUNT;

	/**
	 * The operation id for the '<em>Get Star Ranking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_STAR_RANKING = INFORMATION_OBJECT___GET_STAR_RANKING;

	/**
	 * The operation id for the '<em>Extend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___EXTEND__METAINFORMATION = INFORMATION_OBJECT___EXTEND__METAINFORMATION;

	/**
	 * The operation id for the '<em>Get Web Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_WEB_ACCOUNTS = INFORMATION_OBJECT___GET_WEB_ACCOUNTS;

	/**
	 * The operation id for the '<em>Get Web Sites</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_WEB_SITES = INFORMATION_OBJECT___GET_WEB_SITES;

	/**
	 * The operation id for the '<em>Get Phones</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_PHONES = INFORMATION_OBJECT___GET_PHONES;

	/**
	 * The operation id for the '<em>Get Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_LOCATIONS = INFORMATION_OBJECT___GET_LOCATIONS;

	/**
	 * The operation id for the '<em>Get Emails</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_EMAILS = INFORMATION_OBJECT___GET_EMAILS;

	/**
	 * The operation id for the '<em>Get Instant Messengers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_INSTANT_MESSENGERS = INFORMATION_OBJECT___GET_INSTANT_MESSENGERS;

	/**
	 * The operation id for the '<em>Add Email Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___ADD_EMAIL_ADDRESS__STRING = INFORMATION_OBJECT___ADD_EMAIL_ADDRESS__STRING;

	/**
	 * The operation id for the '<em>Add Web Site</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___ADD_WEB_SITE__STRING = INFORMATION_OBJECT___ADD_WEB_SITE__STRING;

	/**
	 * The operation id for the '<em>Get Information Objects With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_INFORMATION_OBJECTS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Add Web Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___ADD_WEB_ACCOUNT__STRING = INFORMATION_OBJECT___ADD_WEB_ACCOUNT__STRING;

	/**
	 * The operation id for the '<em>Has Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___HAS_IMAGES = INFORMATION_OBJECT___HAS_IMAGES;

	/**
	 * The operation id for the '<em>Get Information Objects Connected To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_INFORMATION_OBJECTS_CONNECTED_TO = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO;

	/**
	 * The operation id for the '<em>Get Information Objects Connected From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_INFORMATION_OBJECTS_CONNECTED_FROM = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM;

	/**
	 * The operation id for the '<em>Get Information Objects Connected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_INFORMATION_OBJECTS_CONNECTED = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED;

	/**
	 * The operation id for the '<em>Connect To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___CONNECT_TO__INFORMATIONOBJECT = INFORMATION_OBJECT___CONNECT_TO__INFORMATIONOBJECT;

	/**
	 * The operation id for the '<em>Connect To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___CONNECT_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___CONNECT_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Information Objects Connected To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_INFORMATION_OBJECTS_CONNECTED_TO_WITH_META_TAG__STRING = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO_WITH_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Information Objects Connected From With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_INFORMATION_OBJECTS_CONNECTED_FROM_WITH_META_TAG__STRING = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM_WITH_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Information Objects Connected With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_INFORMATION_OBJECTS_CONNECTED_WITH_META_TAG__STRING = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_WITH_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Connections From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_CONNECTIONS_FROM__INFORMATIONOBJECT = INFORMATION_OBJECT___GET_CONNECTIONS_FROM__INFORMATIONOBJECT;

	/**
	 * The operation id for the '<em>Get Connections To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_CONNECTIONS_TO__INFORMATIONOBJECT = INFORMATION_OBJECT___GET_CONNECTIONS_TO__INFORMATIONOBJECT;

	/**
	 * The operation id for the '<em>Connect To With Value And Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___CONNECT_TO_WITH_VALUE_AND_META_TAG__INFORMATIONOBJECT_STRING_STRING = INFORMATION_OBJECT___CONNECT_TO_WITH_VALUE_AND_META_TAG__INFORMATIONOBJECT_STRING_STRING;

	/**
	 * The operation id for the '<em>Get Connection To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_CONNECTION_TO__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTION_TO__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Connection From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_CONNECTION_FROM__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTION_FROM__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Attachment With Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_ATTACHMENT_WITH_URL__STRING = INFORMATION_OBJECT___GET_ATTACHMENT_WITH_URL__STRING;

	/**
	 * The operation id for the '<em>Get Attached Image With Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_ATTACHED_IMAGE_WITH_URL__STRING = INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_URL__STRING;

	/**
	 * The operation id for the '<em>Add Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___ADD_PHONE__STRING = INFORMATION_OBJECT___ADD_PHONE__STRING;

	/**
	 * The operation id for the '<em>Get Persons With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_PERSONS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_PERSONS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Get Organisations With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_ORGANISATIONS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_ORGANISATIONS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Get Contents With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_CONTENTS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_CONTENTS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Un Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___UN_TAG__STRING = INFORMATION_OBJECT___UN_TAG__STRING;

	/**
	 * The operation id for the '<em>Un Categorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___UN_CATEGORIZE__STRING = INFORMATION_OBJECT___UN_CATEGORIZE__STRING;

	/**
	 * The operation id for the '<em>Get Slug Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_SLUG_NAME = INFORMATION_OBJECT___GET_SLUG_NAME;

	/**
	 * The operation id for the '<em>Get Connections To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_CONNECTIONS_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTIONS_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Connections From With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_CONNECTIONS_FROM_WITH_META_TAG__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTIONS_FROM_WITH_META_TAG__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Star Rank With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___STAR_RANK_WITH_META_TAG__INTEGER_INTEGER_STRING = INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG__INTEGER_INTEGER_STRING;

	/**
	 * The operation id for the '<em>Add Alternative Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___ADD_ALTERNATIVE_NAME__STRING = INFORMATION_OBJECT___ADD_ALTERNATIVE_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Attached Image With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_ATTACHED_IMAGE_WITH_META_TAG__METATAG = INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG__METATAG;

	/**
	 * The operation id for the '<em>Get Attached Image With Meta Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_ATTACHED_IMAGE_WITH_META_TAG_NAME__STRING = INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Star Rank With Meta Tag List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___STAR_RANK_WITH_META_TAG_LIST__INTEGER_INTEGER_STRING = INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG_LIST__INTEGER_INTEGER_STRING;

	/**
	 * The operation id for the '<em>Add Web Account For Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___ADD_WEB_ACCOUNT_FOR_SERVICE__STRING_STRING = INFORMATION_OBJECT___ADD_WEB_ACCOUNT_FOR_SERVICE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Attached Images Without Meta Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG_NAME__STRING = INFORMATION_OBJECT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Attached Images Without Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG__METATAG = INFORMATION_OBJECT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG__METATAG;

	/**
	 * The operation id for the '<em>Get Indoor Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_INDOOR_LOCATIONS = INFORMATION_OBJECT___GET_INDOOR_LOCATIONS;

	/**
	 * The operation id for the '<em>Get Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_EVENTS = INFORMATION_OBJECT___GET_EVENTS;

	/**
	 * The operation id for the '<em>Get Organisations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_ORGANISATIONS = INFORMATION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Persons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___GET_PERSONS = INFORMATION_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Comment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___COMMENT__STRING = INFORMATION_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Contributor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___ADD_CONTRIBUTOR__PERSON = INFORMATION_OBJECT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Attach Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___ATTACH_DOCUMENT__STRING = INFORMATION_OBJECT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Comment With Meta Tag List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT___COMMENT_WITH_META_TAG_LIST__STRING_STRING = INFORMATION_OBJECT_OPERATION_COUNT + 5;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = INFORMATION_OBJECT_OPERATION_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.DataSetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.DataSetImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getDataSet()
	 * @generated
	 */
	int DATA_SET = 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__ITEMS = 0;

	/**
	 * The feature id for the '<em><b>Cache Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__CACHE_FOLDER = 1;

	/**
	 * The feature id for the '<em><b>Cache File Attachements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__CACHE_FILE_ATTACHEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Set Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__SET_UP = 3;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__LAST_MODIFIED = 4;

	/**
	 * The feature id for the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__LOG_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Ident Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__IDENT_COUNTER = 6;

	/**
	 * The feature id for the '<em><b>Ident Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__IDENT_PREFIX = 7;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__CREATED = 8;

	/**
	 * The feature id for the '<em><b>Keep Deleted Items List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__KEEP_DELETED_ITEMS_LIST = 9;

	/**
	 * The feature id for the '<em><b>Items Deleted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET__ITEMS_DELETED = 10;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___ADD__ITEM = 0;

	/**
	 * The operation id for the '<em>Get Items With String Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ITEMS_WITH_STRING_VALUE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Persons With Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSONS_WITH_NAME__STRING = 2;

	/**
	 * The operation id for the '<em>Get Persons With Lastname</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSONS_WITH_LASTNAME__STRING = 3;

	/**
	 * The operation id for the '<em>Get Persons With First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSONS_WITH_FIRST_NAME__STRING = 4;

	/**
	 * The operation id for the '<em>Get Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_TAG__STRING = 5;

	/**
	 * The operation id for the '<em>Get Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_META_TAG__STRING = 6;

	/**
	 * The operation id for the '<em>Get All Persons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ALL_PERSONS = 7;

	/**
	 * The operation id for the '<em>Get All Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ALL_CONTENTS = 8;

	/**
	 * The operation id for the '<em>Get All Organisations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ALL_ORGANISATIONS = 9;

	/**
	 * The operation id for the '<em>Get All Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ALL_CATEGORIES = 10;

	/**
	 * The operation id for the '<em>Get Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CATEGORY__STRING = 11;

	/**
	 * The operation id for the '<em>Get All Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ALL_TAGS = 12;

	/**
	 * The operation id for the '<em>Get Items Modified Since</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ITEMS_MODIFIED_SINCE__DATE = 13;

	/**
	 * The operation id for the '<em>Get All Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ALL_META_TAGS = 14;

	/**
	 * The operation id for the '<em>Get All Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ALL_CONNECTIONS = 15;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___LOG__STRING = 16;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___LOG__STRING_INTEGER = 17;

	/**
	 * The operation id for the '<em>Get Content With Ident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONTENT_WITH_IDENT__STRING = 18;

	/**
	 * The operation id for the '<em>Get Person With Ident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSON_WITH_IDENT__STRING = 19;

	/**
	 * The operation id for the '<em>Get Organisation With Ident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ORGANISATION_WITH_IDENT__STRING = 20;

	/**
	 * The operation id for the '<em>Get Attachment With Ident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ATTACHMENT_WITH_IDENT__STRING = 21;

	/**
	 * The operation id for the '<em>Get Information Objects With All Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INFORMATION_OBJECTS_WITH_ALL_CATEGORIES__ELIST = 22;

	/**
	 * The operation id for the '<em>Get Information Objects With One Of Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INFORMATION_OBJECTS_WITH_ONE_OF_CATEGORIES__ELIST = 23;

	/**
	 * The operation id for the '<em>Get Contents With All Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONTENTS_WITH_ALL_CATEGORIES__ELIST = 24;

	/**
	 * The operation id for the '<em>Get Contents With One Of Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONTENTS_WITH_ONE_OF_CATEGORIES__ELIST = 25;

	/**
	 * The operation id for the '<em>Get Persons With All Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSONS_WITH_ALL_CATEGORIES__ELIST = 26;

	/**
	 * The operation id for the '<em>Get Persons With One Of Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSONS_WITH_ONE_OF_CATEGORIES__ELIST = 27;

	/**
	 * The operation id for the '<em>Get Organisations With All Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ORGANISATIONS_WITH_ALL_CATEGORIES__ELIST = 28;

	/**
	 * The operation id for the '<em>Get Organisations With One Of Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ORGANISATIONS_WITH_ONE_OF_CATEGORIES__ELIST = 29;

	/**
	 * The operation id for the '<em>Get Information Objects With All Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INFORMATION_OBJECTS_WITH_ALL_TAGS__ELIST = 30;

	/**
	 * The operation id for the '<em>Get Information Objects With One Of Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INFORMATION_OBJECTS_WITH_ONE_OF_TAGS__ELIST = 31;

	/**
	 * The operation id for the '<em>Get Organisations With All Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ORGANISATIONS_WITH_ALL_TAGS__ELIST = 32;

	/**
	 * The operation id for the '<em>Get Organisations With One Of Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ORGANISATIONS_WITH_ONE_OF_TAGS__ELIST = 33;

	/**
	 * The operation id for the '<em>Get Persons With All Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSONS_WITH_ALL_TAGS__ELIST = 34;

	/**
	 * The operation id for the '<em>Get Persons With One Of Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSONS_WITH_ONE_OF_TAGS__ELIST = 35;

	/**
	 * The operation id for the '<em>Get Contents With All Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONTENTS_WITH_ALL_TAGS__ELIST = 36;

	/**
	 * The operation id for the '<em>Get Contents With One Of Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONTENTS_WITH_ONE_OF_TAGS__ELIST = 37;

	/**
	 * The operation id for the '<em>Get Contents With Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONTENTS_WITH_NAME__STRING = 38;

	/**
	 * The operation id for the '<em>Get Organisations With Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ORGANISATIONS_WITH_NAME__STRING = 39;

	/**
	 * The operation id for the '<em>Get Items With All Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ITEMS_WITH_ALL_META_TAGS__ELIST = 40;

	/**
	 * The operation id for the '<em>Get Items With One Of Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ITEMS_WITH_ONE_OF_META_TAGS__ELIST = 41;

	/**
	 * The operation id for the '<em>Get Persons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSONS = 42;

	/**
	 * The operation id for the '<em>Get Organisations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ORGANISATIONS = 43;

	/**
	 * The operation id for the '<em>Get Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONTENTS = 44;

	/**
	 * The operation id for the '<em>Get Information Objects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INFORMATION_OBJECTS = 45;

	/**
	 * The operation id for the '<em>Get Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_TAGS = 46;

	/**
	 * The operation id for the '<em>Get Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_META_TAGS = 47;

	/**
	 * The operation id for the '<em>Get Attachments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ATTACHMENTS = 48;

	/**
	 * The operation id for the '<em>Get Binaries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_BINARIES = 49;

	/**
	 * The operation id for the '<em>Get Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CATEGORIES = 50;

	/**
	 * The operation id for the '<em>Get Classifications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CLASSIFICATIONS = 51;

	/**
	 * The operation id for the '<em>Get Connections</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONNECTIONS = 52;

	/**
	 * The operation id for the '<em>Get Documents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_DOCUMENTS = 53;

	/**
	 * The operation id for the '<em>Get Emails</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_EMAILS = 54;

	/**
	 * The operation id for the '<em>Get Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_EXTENSIONS = 55;

	/**
	 * The operation id for the '<em>Get Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_IMAGES = 56;

	/**
	 * The operation id for the '<em>Get Instant Messengers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INSTANT_MESSENGERS = 57;

	/**
	 * The operation id for the '<em>Get Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_LOCATIONS = 58;

	/**
	 * The operation id for the '<em>Get Meta Informations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_META_INFORMATIONS = 59;

	/**
	 * The operation id for the '<em>Get Phones</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PHONES = 60;

	/**
	 * The operation id for the '<em>Get Rankings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_RANKINGS = 61;

	/**
	 * The operation id for the '<em>Get Star Rankings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_STAR_RANKINGS = 62;

	/**
	 * The operation id for the '<em>Get Thumb Rankings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_THUMB_RANKINGS = 63;

	/**
	 * The operation id for the '<em>Get Transformations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_TRANSFORMATIONS = 64;

	/**
	 * The operation id for the '<em>Get Videos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_VIDEOS = 65;

	/**
	 * The operation id for the '<em>Get View Rankings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_VIEW_RANKINGS = 66;

	/**
	 * The operation id for the '<em>Get Web Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_WEB_ACCOUNTS = 67;

	/**
	 * The operation id for the '<em>Get Web Sites</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_WEB_SITES = 68;

	/**
	 * The operation id for the '<em>Get Information Objects With All Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INFORMATION_OBJECTS_WITH_ALL_META_TAGS__ELIST = 69;

	/**
	 * The operation id for the '<em>Get Information Objects With One Of Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INFORMATION_OBJECTS_WITH_ONE_OF_META_TAGS__ELIST = 70;

	/**
	 * The operation id for the '<em>Get Identifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_IDENTIFIERS = 71;

	/**
	 * The operation id for the '<em>Get Identifiers With Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_IDENTIFIERS_WITH_KEY__STRING = 72;

	/**
	 * The operation id for the '<em>Get Identifier With Key Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_IDENTIFIER_WITH_KEY_VALUE__STRING_STRING = 73;

	/**
	 * The operation id for the '<em>Get Item With Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ITEM_WITH_IDENTIFIER__STRING_STRING = 74;

	/**
	 * The operation id for the '<em>Get Person With Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSON_WITH_IDENTIFIER__STRING_STRING = 75;

	/**
	 * The operation id for the '<em>Get Content With Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONTENT_WITH_IDENTIFIER__STRING_STRING = 76;

	/**
	 * The operation id for the '<em>Get Organisation With Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ORGANISATION_WITH_IDENTIFIER__STRING_STRING = 77;

	/**
	 * The operation id for the '<em>Get Location With Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_LOCATION_WITH_IDENTIFIER__STRING_STRING = 78;

	/**
	 * The operation id for the '<em>Get Indoor Location With Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INDOOR_LOCATION_WITH_IDENTIFIER__STRING_STRING = 79;

	/**
	 * The operation id for the '<em>Get Image With Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_IMAGE_WITH_IDENTIFIER__STRING_STRING = 80;

	/**
	 * The operation id for the '<em>Get Empty Item With Ident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_EMPTY_ITEM_WITH_IDENT__STRING = 81;

	/**
	 * The operation id for the '<em>Get Tags With More Than XInformation Objects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_TAGS_WITH_MORE_THAN_XINFORMATION_OBJECTS__INTEGER = 82;

	/**
	 * The operation id for the '<em>Get Items Created Since</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ITEMS_CREATED_SINCE__DATE = 83;

	/**
	 * The operation id for the '<em>Search Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___SEARCH_ITEMS__STRING = 84;

	/**
	 * The operation id for the '<em>Search Information Objects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___SEARCH_INFORMATION_OBJECTS__STRING = 85;

	/**
	 * The operation id for the '<em>Get Information Objects With Attachment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INFORMATION_OBJECTS_WITH_ATTACHMENT__ATTACHMENT = 86;

	/**
	 * The operation id for the '<em>Get Persons With Attachment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSONS_WITH_ATTACHMENT__ATTACHMENT = 87;

	/**
	 * The operation id for the '<em>Get Organisations With Attachment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ORGANISATIONS_WITH_ATTACHMENT__ATTACHMENT = 88;

	/**
	 * The operation id for the '<em>Get Contents With Attachment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONTENTS_WITH_ATTACHMENT__ATTACHMENT = 89;

	/**
	 * The operation id for the '<em>Get Equal Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_EQUAL_ITEMS__ITEM = 90;

	/**
	 * The operation id for the '<em>Has Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___HAS_EQUAL_ITEM__ITEM = 91;

	/**
	 * The operation id for the '<em>Get Items With Ident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ITEMS_WITH_IDENT__STRING = 92;

	/**
	 * The operation id for the '<em>Get Attachments With Cached File Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ATTACHMENTS_WITH_CACHED_FILE_NAME__STRING = 93;

	/**
	 * The operation id for the '<em>Get Events After</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_EVENTS_AFTER__DATE = 94;

	/**
	 * The operation id for the '<em>Get Events Before</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_EVENTS_BEFORE__DATE = 95;

	/**
	 * The operation id for the '<em>Get Events Between Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_EVENTS_BETWEEN_DATES__DATE_DATE = 96;

	/**
	 * The operation id for the '<em>Get Spicynodes Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_SPICYNODES_REPRESENTATION = 97;

	/**
	 * The operation id for the '<em>Get Connections Between Information Objects Of Different Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONNECTIONS_BETWEEN_INFORMATION_OBJECTS_OF_DIFFERENT_CATEGORIES = 98;

	/**
	 * The operation id for the '<em>Get Information Objects Modified Since</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INFORMATION_OBJECTS_MODIFIED_SINCE__DATE = 99;

	/**
	 * The operation id for the '<em>Get Random XInformation Objects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_RANDOM_XINFORMATION_OBJECTS__INTEGER = 100;

	/**
	 * The operation id for the '<em>Get Random XContents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_RANDOM_XCONTENTS__INTEGER = 101;

	/**
	 * The operation id for the '<em>Get Random XPersons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_RANDOM_XPERSONS__INTEGER = 102;

	/**
	 * The operation id for the '<em>Get Random XOrganisations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_RANDOM_XORGANISATIONS__INTEGER = 103;

	/**
	 * The operation id for the '<em>Force Add</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___FORCE_ADD__ITEM = 104;

	/**
	 * The operation id for the '<em>Get Idents Of Existing Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_IDENTS_OF_EXISTING_ITEMS = 105;

	/**
	 * The operation id for the '<em>Get Category With Slug</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CATEGORY_WITH_SLUG__STRING = 106;

	/**
	 * The operation id for the '<em>Rebuild Indexes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___REBUILD_INDEXES = 107;

	/**
	 * The operation id for the '<em>Get Contents With All Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONTENTS_WITH_ALL_META_TAGS__ELIST = 108;

	/**
	 * The operation id for the '<em>Get Contents With One Of Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_CONTENTS_WITH_ONE_OF_META_TAGS__ELIST = 109;

	/**
	 * The operation id for the '<em>Get Persons With All Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSONS_WITH_ALL_META_TAGS__ELIST = 110;

	/**
	 * The operation id for the '<em>Get Persons With One Of Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_PERSONS_WITH_ONE_OF_META_TAGS__ELIST = 111;

	/**
	 * The operation id for the '<em>Get Organisations With All Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ORGANISATIONS_WITH_ALL_META_TAGS__ELIST = 112;

	/**
	 * The operation id for the '<em>Get Organisations With One Of Meta Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ORGANISATIONS_WITH_ONE_OF_META_TAGS__ELIST = 113;

	/**
	 * The operation id for the '<em>Get Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_EVENTS = 114;

	/**
	 * The operation id for the '<em>Search By Query</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___SEARCH_BY_QUERY__STRING = 115;

	/**
	 * The operation id for the '<em>Get Indoor Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_INDOOR_LOCATIONS = 116;

	/**
	 * The operation id for the '<em>Get Items Except Identifiers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ITEMS_EXCEPT_IDENTIFIERS = 117;

	/**
	 * The operation id for the '<em>Get Idents Of Deleted Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_IDENTS_OF_DELETED_ITEMS = 118;

	/**
	 * The operation id for the '<em>Get Items Deleted Since</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ITEMS_DELETED_SINCE__DATE = 119;

	/**
	 * The operation id for the '<em>Get Idents Of Items Deleted Since</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_IDENTS_OF_ITEMS_DELETED_SINCE__DATE = 120;

	/**
	 * The operation id for the '<em>Clear Deleted Items List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___CLEAR_DELETED_ITEMS_LIST = 121;

	/**
	 * The operation id for the '<em>Get Deleted Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_DELETED_ITEMS = 122;

	/**
	 * The operation id for the '<em>Get Items Except Identifiers Created Since</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ITEMS_EXCEPT_IDENTIFIERS_CREATED_SINCE__DATE = 123;

	/**
	 * The operation id for the '<em>Get Items Except Identifiers Modified Since</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___GET_ITEMS_EXCEPT_IDENTIFIERS_MODIFIED_SINCE__DATE = 124;

	/**
	 * The operation id for the '<em>Reload All Attachment Files</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET___RELOAD_ALL_ATTACHMENT_FILES = 125;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_OPERATION_COUNT = 126;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.ExtensionImpl <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.ExtensionImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 5;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__DATA_SET = ITEM__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IDENT = ITEM__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__URI = ITEM__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__STRING_VALUE = ITEM__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__STRING_XML = ITEM__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__LAST_MODIFIED = ITEM__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__CREATED = ITEM__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__META_TAGS = ITEM__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__IDENTIFIED_BY = ITEM__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__DELETE_ON_DELETE = ITEM__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__DELETED_IF_DELETED = ITEM__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__FORCED_DELETE_ON_DELETE = ITEM__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__FORCED_DELETED_IF_DELETED = ITEM__FORCED_DELETED_IF_DELETED;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___LOG__STRING = ITEM___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___LOG__STRING_INTEGER = ITEM___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___META_TAG__STRING = ITEM___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IDENTIFY_BY__STRING_STRING = ITEM___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___GET_IDENTIFIER__STRING = ITEM___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___HAS_META_TAG__STRING = ITEM___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___MATCHES_SEARCH__STRING = ITEM___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___DELETE = ITEM___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___IS_EQUAL_ITEM__ITEM = ITEM___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___GET_CREATED_PRETTY = ITEM___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___GET_LAST_MODIFIED_PRETTY = ITEM___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___DELETE_ON_DELETE_OF__ITEM = ITEM___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___DELETE_IF_EMPTY_ON_DELETE = ITEM___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___UPDATE__ITEM = ITEM___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___FORCE_UPDATE__ITEM = ITEM___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___UN_META_TAG__STRING = ITEM___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___REMOVE_IDENTIFIER__STRING = ITEM___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___FORCE_DELETE_ON_DELETE_OF__ITEM = ITEM___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION___TAG__STRING = ITEM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_OPERATION_COUNT = ITEM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.ClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.ClassificationImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__DATA_SET = ITEM__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__IDENT = ITEM__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__URI = ITEM__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__STRING_VALUE = ITEM__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__STRING_XML = ITEM__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__LAST_MODIFIED = ITEM__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__CREATED = ITEM__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__META_TAGS = ITEM__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__IDENTIFIED_BY = ITEM__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__DELETE_ON_DELETE = ITEM__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__DELETED_IF_DELETED = ITEM__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__FORCED_DELETE_ON_DELETE = ITEM__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__FORCED_DELETED_IF_DELETED = ITEM__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__NAME = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___LOG__STRING = ITEM___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___LOG__STRING_INTEGER = ITEM___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___META_TAG__STRING = ITEM___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___IDENTIFY_BY__STRING_STRING = ITEM___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_IDENTIFIER__STRING = ITEM___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___HAS_META_TAG__STRING = ITEM___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___MATCHES_SEARCH__STRING = ITEM___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___DELETE = ITEM___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___IS_EQUAL_ITEM__ITEM = ITEM___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_CREATED_PRETTY = ITEM___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_LAST_MODIFIED_PRETTY = ITEM___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___DELETE_ON_DELETE_OF__ITEM = ITEM___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___DELETE_IF_EMPTY_ON_DELETE = ITEM___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___UPDATE__ITEM = ITEM___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___FORCE_UPDATE__ITEM = ITEM___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___UN_META_TAG__STRING = ITEM___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___REMOVE_IDENTIFIER__STRING = ITEM___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___FORCE_DELETE_ON_DELETE_OF__ITEM = ITEM___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Get Persons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_PERSONS = ITEM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_CONTENTS = ITEM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Organisations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_ORGANISATIONS = ITEM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_COUNT = ITEM_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Persons Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_PERSONS_COUNT = ITEM_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Contents Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_CONTENTS_COUNT = ITEM_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Organisations Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_ORGANISATIONS_COUNT = ITEM_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Slug</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION___GET_SLUG = ITEM_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_OPERATION_COUNT = ITEM_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.CategoryImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 7;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DATA_SET = CLASSIFICATION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IDENT = CLASSIFICATION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__URI = CLASSIFICATION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__STRING_VALUE = CLASSIFICATION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__STRING_XML = CLASSIFICATION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__LAST_MODIFIED = CLASSIFICATION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CREATED = CLASSIFICATION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__META_TAGS = CLASSIFICATION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IDENTIFIED_BY = CLASSIFICATION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DELETE_ON_DELETE = CLASSIFICATION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DELETED_IF_DELETED = CLASSIFICATION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__FORCED_DELETE_ON_DELETE = CLASSIFICATION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__FORCED_DELETED_IF_DELETED = CLASSIFICATION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = CLASSIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Categorized</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORIZED = CLASSIFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PARENT_CATEGORY = CLASSIFICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORIES = CLASSIFICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Main Categorized</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__MAIN_CATEGORIZED = CLASSIFICATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = CLASSIFICATION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___LOG__STRING = CLASSIFICATION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___LOG__STRING_INTEGER = CLASSIFICATION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___META_TAG__STRING = CLASSIFICATION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___IDENTIFY_BY__STRING_STRING = CLASSIFICATION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_IDENTIFIER__STRING = CLASSIFICATION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___HAS_META_TAG__STRING = CLASSIFICATION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___MATCHES_SEARCH__STRING = CLASSIFICATION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___DELETE = CLASSIFICATION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___IS_EQUAL_ITEM__ITEM = CLASSIFICATION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = CLASSIFICATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_CREATED_PRETTY = CLASSIFICATION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = CLASSIFICATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_LAST_MODIFIED_PRETTY = CLASSIFICATION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___DELETE_ON_DELETE_OF__ITEM = CLASSIFICATION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___DELETE_IF_EMPTY_ON_DELETE = CLASSIFICATION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___UPDATE__ITEM = CLASSIFICATION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___FORCE_UPDATE__ITEM = CLASSIFICATION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___UN_META_TAG__STRING = CLASSIFICATION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___REMOVE_IDENTIFIER__STRING = CLASSIFICATION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___FORCE_DELETE_ON_DELETE_OF__ITEM = CLASSIFICATION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Get Persons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_PERSONS = CLASSIFICATION___GET_PERSONS;

	/**
	 * The operation id for the '<em>Get Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_CONTENTS = CLASSIFICATION___GET_CONTENTS;

	/**
	 * The operation id for the '<em>Get Organisations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_ORGANISATIONS = CLASSIFICATION___GET_ORGANISATIONS;

	/**
	 * The operation id for the '<em>Get Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_COUNT = CLASSIFICATION___GET_COUNT;

	/**
	 * The operation id for the '<em>Get Persons Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_PERSONS_COUNT = CLASSIFICATION___GET_PERSONS_COUNT;

	/**
	 * The operation id for the '<em>Get Contents Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_CONTENTS_COUNT = CLASSIFICATION___GET_CONTENTS_COUNT;

	/**
	 * The operation id for the '<em>Get Organisations Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_ORGANISATIONS_COUNT = CLASSIFICATION___GET_ORGANISATIONS_COUNT;

	/**
	 * The operation id for the '<em>Get Slug</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY___GET_SLUG = CLASSIFICATION___GET_SLUG;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = CLASSIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.TagImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 8;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DATA_SET = CLASSIFICATION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__IDENT = CLASSIFICATION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__URI = CLASSIFICATION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__STRING_VALUE = CLASSIFICATION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__STRING_XML = CLASSIFICATION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__LAST_MODIFIED = CLASSIFICATION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__CREATED = CLASSIFICATION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__META_TAGS = CLASSIFICATION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__IDENTIFIED_BY = CLASSIFICATION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DELETE_ON_DELETE = CLASSIFICATION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DELETED_IF_DELETED = CLASSIFICATION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__FORCED_DELETE_ON_DELETE = CLASSIFICATION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__FORCED_DELETED_IF_DELETED = CLASSIFICATION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = CLASSIFICATION__NAME;

	/**
	 * The feature id for the '<em><b>Tagged</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__TAGGED = CLASSIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = CLASSIFICATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___LOG__STRING = CLASSIFICATION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___LOG__STRING_INTEGER = CLASSIFICATION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___META_TAG__STRING = CLASSIFICATION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___IDENTIFY_BY__STRING_STRING = CLASSIFICATION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_IDENTIFIER__STRING = CLASSIFICATION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___HAS_META_TAG__STRING = CLASSIFICATION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___MATCHES_SEARCH__STRING = CLASSIFICATION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___DELETE = CLASSIFICATION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___IS_EQUAL_ITEM__ITEM = CLASSIFICATION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = CLASSIFICATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_CREATED_PRETTY = CLASSIFICATION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = CLASSIFICATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_LAST_MODIFIED_PRETTY = CLASSIFICATION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___DELETE_ON_DELETE_OF__ITEM = CLASSIFICATION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___DELETE_IF_EMPTY_ON_DELETE = CLASSIFICATION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___UPDATE__ITEM = CLASSIFICATION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___FORCE_UPDATE__ITEM = CLASSIFICATION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___UN_META_TAG__STRING = CLASSIFICATION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___REMOVE_IDENTIFIER__STRING = CLASSIFICATION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___FORCE_DELETE_ON_DELETE_OF__ITEM = CLASSIFICATION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Get Persons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_PERSONS = CLASSIFICATION___GET_PERSONS;

	/**
	 * The operation id for the '<em>Get Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_CONTENTS = CLASSIFICATION___GET_CONTENTS;

	/**
	 * The operation id for the '<em>Get Organisations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_ORGANISATIONS = CLASSIFICATION___GET_ORGANISATIONS;

	/**
	 * The operation id for the '<em>Get Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_COUNT = CLASSIFICATION___GET_COUNT;

	/**
	 * The operation id for the '<em>Get Persons Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_PERSONS_COUNT = CLASSIFICATION___GET_PERSONS_COUNT;

	/**
	 * The operation id for the '<em>Get Contents Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_CONTENTS_COUNT = CLASSIFICATION___GET_CONTENTS_COUNT;

	/**
	 * The operation id for the '<em>Get Organisations Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_ORGANISATIONS_COUNT = CLASSIFICATION___GET_ORGANISATIONS_COUNT;

	/**
	 * The operation id for the '<em>Get Slug</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG___GET_SLUG = CLASSIFICATION___GET_SLUG;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = CLASSIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.OrganisationImpl <em>Organisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.OrganisationImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getOrganisation()
	 * @generated
	 */
	int ORGANISATION = 9;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__DATA_SET = INFORMATION_OBJECT__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__IDENT = INFORMATION_OBJECT__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__URI = INFORMATION_OBJECT__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__STRING_VALUE = INFORMATION_OBJECT__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__STRING_XML = INFORMATION_OBJECT__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__LAST_MODIFIED = INFORMATION_OBJECT__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__CREATED = INFORMATION_OBJECT__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__META_TAGS = INFORMATION_OBJECT__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__IDENTIFIED_BY = INFORMATION_OBJECT__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__DELETE_ON_DELETE = INFORMATION_OBJECT__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__DELETED_IF_DELETED = INFORMATION_OBJECT__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__FORCED_DELETE_ON_DELETE = INFORMATION_OBJECT__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__FORCED_DELETED_IF_DELETED = INFORMATION_OBJECT__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__CATEGORIES = INFORMATION_OBJECT__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__TAGS = INFORMATION_OBJECT__TAGS;

	/**
	 * The feature id for the '<em><b>Images</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__IMAGES = INFORMATION_OBJECT__IMAGES;

	/**
	 * The feature id for the '<em><b>Star Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__STAR_RANKINGS = INFORMATION_OBJECT__STAR_RANKINGS;

	/**
	 * The feature id for the '<em><b>Thumb Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__THUMB_RANKINGS = INFORMATION_OBJECT__THUMB_RANKINGS;

	/**
	 * The feature id for the '<em><b>View Rankings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__VIEW_RANKINGS = INFORMATION_OBJECT__VIEW_RANKINGS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__NAME = INFORMATION_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Connected To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__CONNECTED_TO = INFORMATION_OBJECT__CONNECTED_TO;

	/**
	 * The feature id for the '<em><b>Connected By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__CONNECTED_BY = INFORMATION_OBJECT__CONNECTED_BY;

	/**
	 * The feature id for the '<em><b>Binaries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__BINARIES = INFORMATION_OBJECT__BINARIES;

	/**
	 * The feature id for the '<em><b>Main Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__MAIN_CATEGORY = INFORMATION_OBJECT__MAIN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Meta Informations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__META_INFORMATIONS = INFORMATION_OBJECT__META_INFORMATIONS;

	/**
	 * The feature id for the '<em><b>Alternative Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ALTERNATIVE_NAMES = INFORMATION_OBJECT__ALTERNATIVE_NAMES;

	/**
	 * The feature id for the '<em><b>Verified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__VERIFIED_NAME = INFORMATION_OBJECT__VERIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Parent Organisation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__PARENT_ORGANISATION = INFORMATION_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__LEADER = INFORMATION_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__PARTICIPANTS = INFORMATION_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ORGANISATIONS = INFORMATION_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = INFORMATION_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___LOG__STRING = INFORMATION_OBJECT___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___LOG__STRING_INTEGER = INFORMATION_OBJECT___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___META_TAG__STRING = INFORMATION_OBJECT___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___IDENTIFY_BY__STRING_STRING = INFORMATION_OBJECT___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_IDENTIFIER__STRING = INFORMATION_OBJECT___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___HAS_META_TAG__STRING = INFORMATION_OBJECT___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___MATCHES_SEARCH__STRING = INFORMATION_OBJECT___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___DELETE = INFORMATION_OBJECT___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___IS_EQUAL_ITEM__ITEM = INFORMATION_OBJECT___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = INFORMATION_OBJECT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_CREATED_PRETTY = INFORMATION_OBJECT___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = INFORMATION_OBJECT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_LAST_MODIFIED_PRETTY = INFORMATION_OBJECT___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___DELETE_ON_DELETE_OF__ITEM = INFORMATION_OBJECT___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___DELETE_IF_EMPTY_ON_DELETE = INFORMATION_OBJECT___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___UPDATE__ITEM = INFORMATION_OBJECT___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___FORCE_UPDATE__ITEM = INFORMATION_OBJECT___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___UN_META_TAG__STRING = INFORMATION_OBJECT___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___REMOVE_IDENTIFIER__STRING = INFORMATION_OBJECT___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___FORCE_DELETE_ON_DELETE_OF__ITEM = INFORMATION_OBJECT___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___TAG__STRING = INFORMATION_OBJECT___TAG__STRING;

	/**
	 * The operation id for the '<em>Categorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___CATEGORIZE__STRING = INFORMATION_OBJECT___CATEGORIZE__STRING;

	/**
	 * The operation id for the '<em>Attach Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___ATTACH_IMAGE__STRING = INFORMATION_OBJECT___ATTACH_IMAGE__STRING;

	/**
	 * The operation id for the '<em>Get Attachments</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_ATTACHMENTS = INFORMATION_OBJECT___GET_ATTACHMENTS;

	/**
	 * The operation id for the '<em>Star Rank</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___STAR_RANK__INTEGER_INTEGER = INFORMATION_OBJECT___STAR_RANK__INTEGER_INTEGER;

	/**
	 * The operation id for the '<em>View</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___VIEW = INFORMATION_OBJECT___VIEW;

	/**
	 * The operation id for the '<em>Thumbs Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___THUMBS_UP = INFORMATION_OBJECT___THUMBS_UP;

	/**
	 * The operation id for the '<em>Thumbs Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___THUMBS_DOWN = INFORMATION_OBJECT___THUMBS_DOWN;

	/**
	 * The operation id for the '<em>Get Thumbs Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_THUMBS_UP = INFORMATION_OBJECT___GET_THUMBS_UP;

	/**
	 * The operation id for the '<em>Get Thumbs Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_THUMBS_DOWN = INFORMATION_OBJECT___GET_THUMBS_DOWN;

	/**
	 * The operation id for the '<em>Get Thumbs Up Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_THUMBS_UP_COUNT = INFORMATION_OBJECT___GET_THUMBS_UP_COUNT;

	/**
	 * The operation id for the '<em>Get Thumbs Down Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_THUMBS_DOWN_COUNT = INFORMATION_OBJECT___GET_THUMBS_DOWN_COUNT;

	/**
	 * The operation id for the '<em>Get Thumbs Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_THUMBS_COUNT = INFORMATION_OBJECT___GET_THUMBS_COUNT;

	/**
	 * The operation id for the '<em>Get Views Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_VIEWS_COUNT = INFORMATION_OBJECT___GET_VIEWS_COUNT;

	/**
	 * The operation id for the '<em>Get Star Ranking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_STAR_RANKING = INFORMATION_OBJECT___GET_STAR_RANKING;

	/**
	 * The operation id for the '<em>Extend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___EXTEND__METAINFORMATION = INFORMATION_OBJECT___EXTEND__METAINFORMATION;

	/**
	 * The operation id for the '<em>Get Web Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_WEB_ACCOUNTS = INFORMATION_OBJECT___GET_WEB_ACCOUNTS;

	/**
	 * The operation id for the '<em>Get Web Sites</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_WEB_SITES = INFORMATION_OBJECT___GET_WEB_SITES;

	/**
	 * The operation id for the '<em>Get Phones</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_PHONES = INFORMATION_OBJECT___GET_PHONES;

	/**
	 * The operation id for the '<em>Get Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_LOCATIONS = INFORMATION_OBJECT___GET_LOCATIONS;

	/**
	 * The operation id for the '<em>Get Emails</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_EMAILS = INFORMATION_OBJECT___GET_EMAILS;

	/**
	 * The operation id for the '<em>Get Instant Messengers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_INSTANT_MESSENGERS = INFORMATION_OBJECT___GET_INSTANT_MESSENGERS;

	/**
	 * The operation id for the '<em>Add Email Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___ADD_EMAIL_ADDRESS__STRING = INFORMATION_OBJECT___ADD_EMAIL_ADDRESS__STRING;

	/**
	 * The operation id for the '<em>Add Web Site</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___ADD_WEB_SITE__STRING = INFORMATION_OBJECT___ADD_WEB_SITE__STRING;

	/**
	 * The operation id for the '<em>Get Information Objects With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_INFORMATION_OBJECTS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Add Web Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___ADD_WEB_ACCOUNT__STRING = INFORMATION_OBJECT___ADD_WEB_ACCOUNT__STRING;

	/**
	 * The operation id for the '<em>Has Images</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___HAS_IMAGES = INFORMATION_OBJECT___HAS_IMAGES;

	/**
	 * The operation id for the '<em>Get Information Objects Connected To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_INFORMATION_OBJECTS_CONNECTED_TO = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO;

	/**
	 * The operation id for the '<em>Get Information Objects Connected From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_INFORMATION_OBJECTS_CONNECTED_FROM = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM;

	/**
	 * The operation id for the '<em>Get Information Objects Connected</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_INFORMATION_OBJECTS_CONNECTED = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED;

	/**
	 * The operation id for the '<em>Connect To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___CONNECT_TO__INFORMATIONOBJECT = INFORMATION_OBJECT___CONNECT_TO__INFORMATIONOBJECT;

	/**
	 * The operation id for the '<em>Connect To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___CONNECT_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___CONNECT_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Information Objects Connected To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_INFORMATION_OBJECTS_CONNECTED_TO_WITH_META_TAG__STRING = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO_WITH_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Information Objects Connected From With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_INFORMATION_OBJECTS_CONNECTED_FROM_WITH_META_TAG__STRING = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM_WITH_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Information Objects Connected With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_INFORMATION_OBJECTS_CONNECTED_WITH_META_TAG__STRING = INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_WITH_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Get Connections From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_CONNECTIONS_FROM__INFORMATIONOBJECT = INFORMATION_OBJECT___GET_CONNECTIONS_FROM__INFORMATIONOBJECT;

	/**
	 * The operation id for the '<em>Get Connections To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_CONNECTIONS_TO__INFORMATIONOBJECT = INFORMATION_OBJECT___GET_CONNECTIONS_TO__INFORMATIONOBJECT;

	/**
	 * The operation id for the '<em>Connect To With Value And Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___CONNECT_TO_WITH_VALUE_AND_META_TAG__INFORMATIONOBJECT_STRING_STRING = INFORMATION_OBJECT___CONNECT_TO_WITH_VALUE_AND_META_TAG__INFORMATIONOBJECT_STRING_STRING;

	/**
	 * The operation id for the '<em>Get Connection To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_CONNECTION_TO__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTION_TO__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Connection From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_CONNECTION_FROM__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTION_FROM__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Attachment With Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_ATTACHMENT_WITH_URL__STRING = INFORMATION_OBJECT___GET_ATTACHMENT_WITH_URL__STRING;

	/**
	 * The operation id for the '<em>Get Attached Image With Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_ATTACHED_IMAGE_WITH_URL__STRING = INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_URL__STRING;

	/**
	 * The operation id for the '<em>Add Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___ADD_PHONE__STRING = INFORMATION_OBJECT___ADD_PHONE__STRING;

	/**
	 * The operation id for the '<em>Get Persons With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_PERSONS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_PERSONS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Get Organisations With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_ORGANISATIONS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_ORGANISATIONS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Get Contents With Common Tags</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_CONTENTS_WITH_COMMON_TAGS = INFORMATION_OBJECT___GET_CONTENTS_WITH_COMMON_TAGS;

	/**
	 * The operation id for the '<em>Un Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___UN_TAG__STRING = INFORMATION_OBJECT___UN_TAG__STRING;

	/**
	 * The operation id for the '<em>Un Categorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___UN_CATEGORIZE__STRING = INFORMATION_OBJECT___UN_CATEGORIZE__STRING;

	/**
	 * The operation id for the '<em>Get Slug Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_SLUG_NAME = INFORMATION_OBJECT___GET_SLUG_NAME;

	/**
	 * The operation id for the '<em>Get Connections To With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_CONNECTIONS_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTIONS_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Get Connections From With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_CONNECTIONS_FROM_WITH_META_TAG__INFORMATIONOBJECT_STRING = INFORMATION_OBJECT___GET_CONNECTIONS_FROM_WITH_META_TAG__INFORMATIONOBJECT_STRING;

	/**
	 * The operation id for the '<em>Star Rank With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___STAR_RANK_WITH_META_TAG__INTEGER_INTEGER_STRING = INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG__INTEGER_INTEGER_STRING;

	/**
	 * The operation id for the '<em>Add Alternative Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___ADD_ALTERNATIVE_NAME__STRING = INFORMATION_OBJECT___ADD_ALTERNATIVE_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Attached Image With Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_ATTACHED_IMAGE_WITH_META_TAG__METATAG = INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG__METATAG;

	/**
	 * The operation id for the '<em>Get Attached Image With Meta Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_ATTACHED_IMAGE_WITH_META_TAG_NAME__STRING = INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Star Rank With Meta Tag List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___STAR_RANK_WITH_META_TAG_LIST__INTEGER_INTEGER_STRING = INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG_LIST__INTEGER_INTEGER_STRING;

	/**
	 * The operation id for the '<em>Add Web Account For Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___ADD_WEB_ACCOUNT_FOR_SERVICE__STRING_STRING = INFORMATION_OBJECT___ADD_WEB_ACCOUNT_FOR_SERVICE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Attached Images Without Meta Tag Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_ATTACHED_IMAGES_WITHOUT_META_TAG_NAME__STRING = INFORMATION_OBJECT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Attached Images Without Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_ATTACHED_IMAGES_WITHOUT_META_TAG__METATAG = INFORMATION_OBJECT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG__METATAG;

	/**
	 * The operation id for the '<em>Get Indoor Locations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_INDOOR_LOCATIONS = INFORMATION_OBJECT___GET_INDOOR_LOCATIONS;

	/**
	 * The operation id for the '<em>Get Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_EVENTS = INFORMATION_OBJECT___GET_EVENTS;

	/**
	 * The operation id for the '<em>Get Persons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_PERSONS = INFORMATION_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Contents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___GET_CONTENTS = INFORMATION_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Participant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION___ADD_PARTICIPANT__PERSON = INFORMATION_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_OPERATION_COUNT = INFORMATION_OBJECT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.MetaTagImpl <em>Meta Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.MetaTagImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getMetaTag()
	 * @generated
	 */
	int META_TAG = 10;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__DATA_SET = ITEM__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__IDENT = ITEM__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__URI = ITEM__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__STRING_VALUE = ITEM__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__STRING_XML = ITEM__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__LAST_MODIFIED = ITEM__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__CREATED = ITEM__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__META_TAGS = ITEM__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__IDENTIFIED_BY = ITEM__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__DELETE_ON_DELETE = ITEM__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__DELETED_IF_DELETED = ITEM__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__FORCED_DELETE_ON_DELETE = ITEM__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__FORCED_DELETED_IF_DELETED = ITEM__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__NAME = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meta Tagged</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG__META_TAGGED = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Meta Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___LOG__STRING = ITEM___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___LOG__STRING_INTEGER = ITEM___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___META_TAG__STRING = ITEM___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___IDENTIFY_BY__STRING_STRING = ITEM___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___GET_IDENTIFIER__STRING = ITEM___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___HAS_META_TAG__STRING = ITEM___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___MATCHES_SEARCH__STRING = ITEM___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___DELETE = ITEM___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___IS_EQUAL_ITEM__ITEM = ITEM___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___GET_CREATED_PRETTY = ITEM___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___GET_LAST_MODIFIED_PRETTY = ITEM___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___DELETE_ON_DELETE_OF__ITEM = ITEM___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___DELETE_IF_EMPTY_ON_DELETE = ITEM___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___UPDATE__ITEM = ITEM___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___FORCE_UPDATE__ITEM = ITEM___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___UN_META_TAG__STRING = ITEM___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___REMOVE_IDENTIFIER__STRING = ITEM___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___FORCE_DELETE_ON_DELETE_OF__ITEM = ITEM___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Get Web Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___GET_WEB_ACCOUNTS = ITEM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Information Objects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___GET_INFORMATION_OBJECTS = ITEM_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Extensions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___GET_EXTENSIONS = ITEM_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___GET_COUNT = ITEM_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Information Objects Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG___GET_INFORMATION_OBJECTS_COUNT = ITEM_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Meta Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_TAG_OPERATION_COUNT = ITEM_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.MetaInformationImpl <em>Meta Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.MetaInformationImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getMetaInformation()
	 * @generated
	 */
	int META_INFORMATION = 28;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__DATA_SET = EXTENSION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__IDENT = EXTENSION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__URI = EXTENSION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__STRING_VALUE = EXTENSION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__STRING_XML = EXTENSION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__LAST_MODIFIED = EXTENSION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__CREATED = EXTENSION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__META_TAGS = EXTENSION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__IDENTIFIED_BY = EXTENSION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__DELETE_ON_DELETE = EXTENSION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__DELETED_IF_DELETED = EXTENSION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__FORCED_DELETE_ON_DELETE = EXTENSION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__FORCED_DELETED_IF_DELETED = EXTENSION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__INFORMATION_OBJECTS = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Meta Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___LOG__STRING = EXTENSION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___LOG__STRING_INTEGER = EXTENSION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___META_TAG__STRING = EXTENSION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___IDENTIFY_BY__STRING_STRING = EXTENSION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___GET_IDENTIFIER__STRING = EXTENSION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___HAS_META_TAG__STRING = EXTENSION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___MATCHES_SEARCH__STRING = EXTENSION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___DELETE = EXTENSION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___IS_EQUAL_ITEM__ITEM = EXTENSION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = EXTENSION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___GET_CREATED_PRETTY = EXTENSION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = EXTENSION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___GET_LAST_MODIFIED_PRETTY = EXTENSION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___DELETE_ON_DELETE_OF__ITEM = EXTENSION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___DELETE_IF_EMPTY_ON_DELETE = EXTENSION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___UPDATE__ITEM = EXTENSION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___FORCE_UPDATE__ITEM = EXTENSION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___UN_META_TAG__STRING = EXTENSION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___REMOVE_IDENTIFIER__STRING = EXTENSION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___FORCE_DELETE_ON_DELETE_OF__ITEM = EXTENSION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION___TAG__STRING = EXTENSION___TAG__STRING;

	/**
	 * The number of operations of the '<em>Meta Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.PhoneImpl <em>Phone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.PhoneImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getPhone()
	 * @generated
	 */
	int PHONE = 11;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__DATA_SET = META_INFORMATION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__IDENT = META_INFORMATION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__URI = META_INFORMATION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__STRING_VALUE = META_INFORMATION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__STRING_XML = META_INFORMATION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__LAST_MODIFIED = META_INFORMATION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__CREATED = META_INFORMATION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__META_TAGS = META_INFORMATION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__IDENTIFIED_BY = META_INFORMATION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__DELETE_ON_DELETE = META_INFORMATION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__DELETED_IF_DELETED = META_INFORMATION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__FORCED_DELETE_ON_DELETE = META_INFORMATION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__FORCED_DELETED_IF_DELETED = META_INFORMATION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__INFORMATION_OBJECTS = META_INFORMATION__INFORMATION_OBJECTS;

	/**
	 * The feature id for the '<em><b>Area Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__AREA_CODE = META_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__COUNTRY_CODE = META_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE__NUMBER = META_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_FEATURE_COUNT = META_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___LOG__STRING = META_INFORMATION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___LOG__STRING_INTEGER = META_INFORMATION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___META_TAG__STRING = META_INFORMATION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___IDENTIFY_BY__STRING_STRING = META_INFORMATION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___GET_IDENTIFIER__STRING = META_INFORMATION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___HAS_META_TAG__STRING = META_INFORMATION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___MATCHES_SEARCH__STRING = META_INFORMATION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___DELETE = META_INFORMATION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___IS_EQUAL_ITEM__ITEM = META_INFORMATION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___GET_CREATED_PRETTY = META_INFORMATION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___GET_LAST_MODIFIED_PRETTY = META_INFORMATION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___DELETE_IF_EMPTY_ON_DELETE = META_INFORMATION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___UPDATE__ITEM = META_INFORMATION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___FORCE_UPDATE__ITEM = META_INFORMATION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___UN_META_TAG__STRING = META_INFORMATION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___REMOVE_IDENTIFIER__STRING = META_INFORMATION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___FORCE_DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE___TAG__STRING = META_INFORMATION___TAG__STRING;

	/**
	 * The number of operations of the '<em>Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHONE_OPERATION_COUNT = META_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.InstantMessengerImpl <em>Instant Messenger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.InstantMessengerImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getInstantMessenger()
	 * @generated
	 */
	int INSTANT_MESSENGER = 12;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__DATA_SET = META_INFORMATION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__IDENT = META_INFORMATION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__URI = META_INFORMATION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__STRING_VALUE = META_INFORMATION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__STRING_XML = META_INFORMATION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__LAST_MODIFIED = META_INFORMATION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__CREATED = META_INFORMATION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__META_TAGS = META_INFORMATION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__IDENTIFIED_BY = META_INFORMATION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__DELETE_ON_DELETE = META_INFORMATION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__DELETED_IF_DELETED = META_INFORMATION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__FORCED_DELETE_ON_DELETE = META_INFORMATION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__FORCED_DELETED_IF_DELETED = META_INFORMATION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__INFORMATION_OBJECTS = META_INFORMATION__INFORMATION_OBJECTS;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER__USERNAME = META_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instant Messenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_FEATURE_COUNT = META_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___LOG__STRING = META_INFORMATION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___LOG__STRING_INTEGER = META_INFORMATION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___META_TAG__STRING = META_INFORMATION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___IDENTIFY_BY__STRING_STRING = META_INFORMATION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___GET_IDENTIFIER__STRING = META_INFORMATION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___HAS_META_TAG__STRING = META_INFORMATION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___MATCHES_SEARCH__STRING = META_INFORMATION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___DELETE = META_INFORMATION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___IS_EQUAL_ITEM__ITEM = META_INFORMATION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___GET_CREATED_PRETTY = META_INFORMATION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___GET_LAST_MODIFIED_PRETTY = META_INFORMATION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___DELETE_IF_EMPTY_ON_DELETE = META_INFORMATION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___UPDATE__ITEM = META_INFORMATION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___FORCE_UPDATE__ITEM = META_INFORMATION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___UN_META_TAG__STRING = META_INFORMATION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___REMOVE_IDENTIFIER__STRING = META_INFORMATION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___FORCE_DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER___TAG__STRING = META_INFORMATION___TAG__STRING;

	/**
	 * The number of operations of the '<em>Instant Messenger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_MESSENGER_OPERATION_COUNT = META_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.EmailImpl <em>Email</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.EmailImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getEmail()
	 * @generated
	 */
	int EMAIL = 13;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__DATA_SET = META_INFORMATION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__IDENT = META_INFORMATION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__URI = META_INFORMATION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__STRING_VALUE = META_INFORMATION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__STRING_XML = META_INFORMATION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__LAST_MODIFIED = META_INFORMATION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__CREATED = META_INFORMATION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__META_TAGS = META_INFORMATION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__IDENTIFIED_BY = META_INFORMATION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__DELETE_ON_DELETE = META_INFORMATION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__DELETED_IF_DELETED = META_INFORMATION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__FORCED_DELETE_ON_DELETE = META_INFORMATION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__FORCED_DELETED_IF_DELETED = META_INFORMATION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__INFORMATION_OBJECTS = META_INFORMATION__INFORMATION_OBJECTS;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL__ADRESS = META_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_FEATURE_COUNT = META_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___LOG__STRING = META_INFORMATION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___LOG__STRING_INTEGER = META_INFORMATION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___META_TAG__STRING = META_INFORMATION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___IDENTIFY_BY__STRING_STRING = META_INFORMATION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___GET_IDENTIFIER__STRING = META_INFORMATION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___HAS_META_TAG__STRING = META_INFORMATION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___MATCHES_SEARCH__STRING = META_INFORMATION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___DELETE = META_INFORMATION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___IS_EQUAL_ITEM__ITEM = META_INFORMATION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___GET_CREATED_PRETTY = META_INFORMATION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___GET_LAST_MODIFIED_PRETTY = META_INFORMATION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___DELETE_IF_EMPTY_ON_DELETE = META_INFORMATION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___UPDATE__ITEM = META_INFORMATION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___FORCE_UPDATE__ITEM = META_INFORMATION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___UN_META_TAG__STRING = META_INFORMATION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___REMOVE_IDENTIFIER__STRING = META_INFORMATION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___FORCE_DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL___TAG__STRING = META_INFORMATION___TAG__STRING;

	/**
	 * The number of operations of the '<em>Email</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_OPERATION_COUNT = META_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.WebAccountImpl <em>Web Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.WebAccountImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getWebAccount()
	 * @generated
	 */
	int WEB_ACCOUNT = 14;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__DATA_SET = META_INFORMATION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__IDENT = META_INFORMATION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__URI = META_INFORMATION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__STRING_VALUE = META_INFORMATION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__STRING_XML = META_INFORMATION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__LAST_MODIFIED = META_INFORMATION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__CREATED = META_INFORMATION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__META_TAGS = META_INFORMATION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__IDENTIFIED_BY = META_INFORMATION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__DELETE_ON_DELETE = META_INFORMATION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__DELETED_IF_DELETED = META_INFORMATION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__FORCED_DELETE_ON_DELETE = META_INFORMATION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__FORCED_DELETED_IF_DELETED = META_INFORMATION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__INFORMATION_OBJECTS = META_INFORMATION__INFORMATION_OBJECTS;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__USERNAME = META_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT__SERVICE = META_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Web Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT_FEATURE_COUNT = META_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___LOG__STRING = META_INFORMATION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___LOG__STRING_INTEGER = META_INFORMATION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___META_TAG__STRING = META_INFORMATION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___IDENTIFY_BY__STRING_STRING = META_INFORMATION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___GET_IDENTIFIER__STRING = META_INFORMATION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___HAS_META_TAG__STRING = META_INFORMATION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___MATCHES_SEARCH__STRING = META_INFORMATION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___DELETE = META_INFORMATION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___IS_EQUAL_ITEM__ITEM = META_INFORMATION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___GET_CREATED_PRETTY = META_INFORMATION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___GET_LAST_MODIFIED_PRETTY = META_INFORMATION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___DELETE_IF_EMPTY_ON_DELETE = META_INFORMATION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___UPDATE__ITEM = META_INFORMATION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___FORCE_UPDATE__ITEM = META_INFORMATION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___UN_META_TAG__STRING = META_INFORMATION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___REMOVE_IDENTIFIER__STRING = META_INFORMATION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___FORCE_DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT___TAG__STRING = META_INFORMATION___TAG__STRING;

	/**
	 * The number of operations of the '<em>Web Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT_OPERATION_COUNT = META_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.WebSiteImpl <em>Web Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.WebSiteImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getWebSite()
	 * @generated
	 */
	int WEB_SITE = 15;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__DATA_SET = META_INFORMATION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__IDENT = META_INFORMATION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__URI = META_INFORMATION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__STRING_VALUE = META_INFORMATION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__STRING_XML = META_INFORMATION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__LAST_MODIFIED = META_INFORMATION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__CREATED = META_INFORMATION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__META_TAGS = META_INFORMATION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__IDENTIFIED_BY = META_INFORMATION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__DELETE_ON_DELETE = META_INFORMATION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__DELETED_IF_DELETED = META_INFORMATION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__FORCED_DELETE_ON_DELETE = META_INFORMATION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__FORCED_DELETED_IF_DELETED = META_INFORMATION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__INFORMATION_OBJECTS = META_INFORMATION__INFORMATION_OBJECTS;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__ADRESS = META_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__TITLE = META_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Shortened Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE__SHORTENED_URL = META_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_FEATURE_COUNT = META_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___LOG__STRING = META_INFORMATION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___LOG__STRING_INTEGER = META_INFORMATION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___META_TAG__STRING = META_INFORMATION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___IDENTIFY_BY__STRING_STRING = META_INFORMATION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___GET_IDENTIFIER__STRING = META_INFORMATION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___HAS_META_TAG__STRING = META_INFORMATION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___MATCHES_SEARCH__STRING = META_INFORMATION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___DELETE = META_INFORMATION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___IS_EQUAL_ITEM__ITEM = META_INFORMATION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___GET_CREATED_PRETTY = META_INFORMATION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___GET_LAST_MODIFIED_PRETTY = META_INFORMATION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___DELETE_IF_EMPTY_ON_DELETE = META_INFORMATION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___UPDATE__ITEM = META_INFORMATION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___FORCE_UPDATE__ITEM = META_INFORMATION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___UN_META_TAG__STRING = META_INFORMATION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___REMOVE_IDENTIFIER__STRING = META_INFORMATION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___FORCE_DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE___TAG__STRING = META_INFORMATION___TAG__STRING;

	/**
	 * The number of operations of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_OPERATION_COUNT = META_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.RankingImpl <em>Ranking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.RankingImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getRanking()
	 * @generated
	 */
	int RANKING = 16;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__DATA_SET = EXTENSION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__IDENT = EXTENSION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__URI = EXTENSION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__STRING_VALUE = EXTENSION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__STRING_XML = EXTENSION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__LAST_MODIFIED = EXTENSION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__CREATED = EXTENSION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__META_TAGS = EXTENSION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__IDENTIFIED_BY = EXTENSION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__DELETE_ON_DELETE = EXTENSION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__DELETED_IF_DELETED = EXTENSION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__FORCED_DELETE_ON_DELETE = EXTENSION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__FORCED_DELETED_IF_DELETED = EXTENSION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__DATE = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ranker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__RANKER = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___LOG__STRING = EXTENSION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___LOG__STRING_INTEGER = EXTENSION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___META_TAG__STRING = EXTENSION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___IDENTIFY_BY__STRING_STRING = EXTENSION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___GET_IDENTIFIER__STRING = EXTENSION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___HAS_META_TAG__STRING = EXTENSION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___MATCHES_SEARCH__STRING = EXTENSION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___DELETE = EXTENSION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___IS_EQUAL_ITEM__ITEM = EXTENSION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = EXTENSION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___GET_CREATED_PRETTY = EXTENSION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = EXTENSION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___GET_LAST_MODIFIED_PRETTY = EXTENSION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___DELETE_ON_DELETE_OF__ITEM = EXTENSION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___DELETE_IF_EMPTY_ON_DELETE = EXTENSION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___UPDATE__ITEM = EXTENSION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___FORCE_UPDATE__ITEM = EXTENSION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___UN_META_TAG__STRING = EXTENSION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___REMOVE_IDENTIFIER__STRING = EXTENSION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___FORCE_DELETE_ON_DELETE_OF__ITEM = EXTENSION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING___TAG__STRING = EXTENSION___TAG__STRING;

	/**
	 * The number of operations of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.AttachmentImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 17;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__DATA_SET = EXTENSION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__IDENT = EXTENSION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__URI = EXTENSION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__STRING_VALUE = EXTENSION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__STRING_XML = EXTENSION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__LAST_MODIFIED = EXTENSION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CREATED = EXTENSION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__META_TAGS = EXTENSION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__IDENTIFIED_BY = EXTENSION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__DELETE_ON_DELETE = EXTENSION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__DELETED_IF_DELETED = EXTENSION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__FORCED_DELETE_ON_DELETE = EXTENSION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__FORCED_DELETED_IF_DELETED = EXTENSION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__FILE_URL = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cached File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CACHED_FILE_URL = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cached Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CACHED_ONLY = EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__FILE_EXTENSION = EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>File Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__FILE_IDENTIFIER = EXTENSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cached File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__CACHED_FILE_NAME = EXTENSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>No Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__NO_CACHE = EXTENSION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___LOG__STRING = EXTENSION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___LOG__STRING_INTEGER = EXTENSION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___META_TAG__STRING = EXTENSION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___IDENTIFY_BY__STRING_STRING = EXTENSION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___GET_IDENTIFIER__STRING = EXTENSION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___HAS_META_TAG__STRING = EXTENSION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___MATCHES_SEARCH__STRING = EXTENSION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___DELETE = EXTENSION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___IS_EQUAL_ITEM__ITEM = EXTENSION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = EXTENSION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___GET_CREATED_PRETTY = EXTENSION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = EXTENSION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___GET_LAST_MODIFIED_PRETTY = EXTENSION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___DELETE_ON_DELETE_OF__ITEM = EXTENSION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___DELETE_IF_EMPTY_ON_DELETE = EXTENSION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___UPDATE__ITEM = EXTENSION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___FORCE_UPDATE__ITEM = EXTENSION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___UN_META_TAG__STRING = EXTENSION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___REMOVE_IDENTIFIER__STRING = EXTENSION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___FORCE_DELETE_ON_DELETE_OF__ITEM = EXTENSION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___TAG__STRING = EXTENSION___TAG__STRING;

	/**
	 * The operation id for the '<em>Get Original File Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___GET_ORIGINAL_FILE_URL = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Reload File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT___RELOAD_FILE = EXTENSION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.LocationImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 18;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DATA_SET = META_INFORMATION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__IDENT = META_INFORMATION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__URI = META_INFORMATION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__STRING_VALUE = META_INFORMATION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__STRING_XML = META_INFORMATION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LAST_MODIFIED = META_INFORMATION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CREATED = META_INFORMATION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__META_TAGS = META_INFORMATION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__IDENTIFIED_BY = META_INFORMATION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DELETE_ON_DELETE = META_INFORMATION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__DELETED_IF_DELETED = META_INFORMATION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__FORCED_DELETE_ON_DELETE = META_INFORMATION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__FORCED_DELETED_IF_DELETED = META_INFORMATION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__INFORMATION_OBJECTS = META_INFORMATION__INFORMATION_OBJECTS;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__STREET = META_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>House Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__HOUSE_NUMBER = META_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ZIP_CODE = META_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__COUNTRY = META_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LONGITUDE = META_INFORMATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__LATITUDE = META_INFORMATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CITY = META_INFORMATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Indoor Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__INDOOR_LOCATIONS = META_INFORMATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__STATE = META_INFORMATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = META_INFORMATION_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___LOG__STRING = META_INFORMATION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___LOG__STRING_INTEGER = META_INFORMATION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___META_TAG__STRING = META_INFORMATION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IDENTIFY_BY__STRING_STRING = META_INFORMATION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___GET_IDENTIFIER__STRING = META_INFORMATION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___HAS_META_TAG__STRING = META_INFORMATION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___MATCHES_SEARCH__STRING = META_INFORMATION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___DELETE = META_INFORMATION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___IS_EQUAL_ITEM__ITEM = META_INFORMATION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___GET_CREATED_PRETTY = META_INFORMATION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___GET_LAST_MODIFIED_PRETTY = META_INFORMATION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___DELETE_IF_EMPTY_ON_DELETE = META_INFORMATION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___UPDATE__ITEM = META_INFORMATION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___FORCE_UPDATE__ITEM = META_INFORMATION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___UN_META_TAG__STRING = META_INFORMATION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___REMOVE_IDENTIFIER__STRING = META_INFORMATION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___FORCE_DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION___TAG__STRING = META_INFORMATION___TAG__STRING;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = META_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.ImageImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 19;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DATA_SET = ATTACHMENT__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IDENT = ATTACHMENT__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URI = ATTACHMENT__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STRING_VALUE = ATTACHMENT__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__STRING_XML = ATTACHMENT__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__LAST_MODIFIED = ATTACHMENT__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CREATED = ATTACHMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__META_TAGS = ATTACHMENT__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IDENTIFIED_BY = ATTACHMENT__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DELETE_ON_DELETE = ATTACHMENT__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__DELETED_IF_DELETED = ATTACHMENT__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FORCED_DELETE_ON_DELETE = ATTACHMENT__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FORCED_DELETED_IF_DELETED = ATTACHMENT__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FILE_URL = ATTACHMENT__FILE_URL;

	/**
	 * The feature id for the '<em><b>Cached File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CACHED_FILE_URL = ATTACHMENT__CACHED_FILE_URL;

	/**
	 * The feature id for the '<em><b>Cached Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CACHED_ONLY = ATTACHMENT__CACHED_ONLY;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FILE_EXTENSION = ATTACHMENT__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>File Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__FILE_IDENTIFIER = ATTACHMENT__FILE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Cached File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CACHED_FILE_NAME = ATTACHMENT__CACHED_FILE_NAME;

	/**
	 * The feature id for the '<em><b>No Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NO_CACHE = ATTACHMENT__NO_CACHE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = ATTACHMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___LOG__STRING = ATTACHMENT___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___LOG__STRING_INTEGER = ATTACHMENT___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___META_TAG__STRING = ATTACHMENT___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___IDENTIFY_BY__STRING_STRING = ATTACHMENT___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___GET_IDENTIFIER__STRING = ATTACHMENT___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___HAS_META_TAG__STRING = ATTACHMENT___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___MATCHES_SEARCH__STRING = ATTACHMENT___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___DELETE = ATTACHMENT___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___IS_EQUAL_ITEM__ITEM = ATTACHMENT___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = ATTACHMENT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___GET_CREATED_PRETTY = ATTACHMENT___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = ATTACHMENT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___GET_LAST_MODIFIED_PRETTY = ATTACHMENT___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___DELETE_ON_DELETE_OF__ITEM = ATTACHMENT___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___DELETE_IF_EMPTY_ON_DELETE = ATTACHMENT___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___UPDATE__ITEM = ATTACHMENT___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___FORCE_UPDATE__ITEM = ATTACHMENT___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___UN_META_TAG__STRING = ATTACHMENT___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___REMOVE_IDENTIFIER__STRING = ATTACHMENT___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___FORCE_DELETE_ON_DELETE_OF__ITEM = ATTACHMENT___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___TAG__STRING = ATTACHMENT___TAG__STRING;

	/**
	 * The operation id for the '<em>Get Original File Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___GET_ORIGINAL_FILE_URL = ATTACHMENT___GET_ORIGINAL_FILE_URL;

	/**
	 * The operation id for the '<em>Reload File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE___RELOAD_FILE = ATTACHMENT___RELOAD_FILE;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.DocumentImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 20;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DATA_SET = ATTACHMENT__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__IDENT = ATTACHMENT__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__URI = ATTACHMENT__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__STRING_VALUE = ATTACHMENT__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__STRING_XML = ATTACHMENT__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__LAST_MODIFIED = ATTACHMENT__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CREATED = ATTACHMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__META_TAGS = ATTACHMENT__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__IDENTIFIED_BY = ATTACHMENT__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DELETE_ON_DELETE = ATTACHMENT__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DELETED_IF_DELETED = ATTACHMENT__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FORCED_DELETE_ON_DELETE = ATTACHMENT__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FORCED_DELETED_IF_DELETED = ATTACHMENT__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FILE_URL = ATTACHMENT__FILE_URL;

	/**
	 * The feature id for the '<em><b>Cached File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CACHED_FILE_URL = ATTACHMENT__CACHED_FILE_URL;

	/**
	 * The feature id for the '<em><b>Cached Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CACHED_ONLY = ATTACHMENT__CACHED_ONLY;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FILE_EXTENSION = ATTACHMENT__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>File Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__FILE_IDENTIFIER = ATTACHMENT__FILE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Cached File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CACHED_FILE_NAME = ATTACHMENT__CACHED_FILE_NAME;

	/**
	 * The feature id for the '<em><b>No Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NO_CACHE = ATTACHMENT__NO_CACHE;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___LOG__STRING = ATTACHMENT___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___LOG__STRING_INTEGER = ATTACHMENT___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___META_TAG__STRING = ATTACHMENT___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___IDENTIFY_BY__STRING_STRING = ATTACHMENT___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GET_IDENTIFIER__STRING = ATTACHMENT___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___HAS_META_TAG__STRING = ATTACHMENT___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___MATCHES_SEARCH__STRING = ATTACHMENT___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___DELETE = ATTACHMENT___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___IS_EQUAL_ITEM__ITEM = ATTACHMENT___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = ATTACHMENT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GET_CREATED_PRETTY = ATTACHMENT___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = ATTACHMENT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GET_LAST_MODIFIED_PRETTY = ATTACHMENT___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___DELETE_ON_DELETE_OF__ITEM = ATTACHMENT___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___DELETE_IF_EMPTY_ON_DELETE = ATTACHMENT___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___UPDATE__ITEM = ATTACHMENT___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___FORCE_UPDATE__ITEM = ATTACHMENT___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___UN_META_TAG__STRING = ATTACHMENT___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___REMOVE_IDENTIFIER__STRING = ATTACHMENT___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___FORCE_DELETE_ON_DELETE_OF__ITEM = ATTACHMENT___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___TAG__STRING = ATTACHMENT___TAG__STRING;

	/**
	 * The operation id for the '<em>Get Original File Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___GET_ORIGINAL_FILE_URL = ATTACHMENT___GET_ORIGINAL_FILE_URL;

	/**
	 * The operation id for the '<em>Reload File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___RELOAD_FILE = ATTACHMENT___RELOAD_FILE;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.StarRankingImpl <em>Star Ranking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.StarRankingImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getStarRanking()
	 * @generated
	 */
	int STAR_RANKING = 21;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__DATA_SET = RANKING__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__IDENT = RANKING__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__URI = RANKING__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__STRING_VALUE = RANKING__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__STRING_XML = RANKING__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__LAST_MODIFIED = RANKING__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__CREATED = RANKING__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__META_TAGS = RANKING__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__IDENTIFIED_BY = RANKING__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__DELETE_ON_DELETE = RANKING__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__DELETED_IF_DELETED = RANKING__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__FORCED_DELETE_ON_DELETE = RANKING__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__FORCED_DELETED_IF_DELETED = RANKING__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__DATE = RANKING__DATE;

	/**
	 * The feature id for the '<em><b>Ranker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__RANKER = RANKING__RANKER;

	/**
	 * The feature id for the '<em><b>Ranked Information Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__RANKED_INFORMATION_OBJECT = RANKING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Normalized Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING__NORMALIZED_VALUE = RANKING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Star Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING_FEATURE_COUNT = RANKING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___LOG__STRING = RANKING___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___LOG__STRING_INTEGER = RANKING___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___META_TAG__STRING = RANKING___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___IDENTIFY_BY__STRING_STRING = RANKING___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___GET_IDENTIFIER__STRING = RANKING___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___HAS_META_TAG__STRING = RANKING___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___MATCHES_SEARCH__STRING = RANKING___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___DELETE = RANKING___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___IS_EQUAL_ITEM__ITEM = RANKING___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = RANKING___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___GET_CREATED_PRETTY = RANKING___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = RANKING___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___GET_LAST_MODIFIED_PRETTY = RANKING___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___DELETE_ON_DELETE_OF__ITEM = RANKING___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___DELETE_IF_EMPTY_ON_DELETE = RANKING___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___UPDATE__ITEM = RANKING___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___FORCE_UPDATE__ITEM = RANKING___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___UN_META_TAG__STRING = RANKING___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___REMOVE_IDENTIFIER__STRING = RANKING___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___FORCE_DELETE_ON_DELETE_OF__ITEM = RANKING___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING___TAG__STRING = RANKING___TAG__STRING;

	/**
	 * The number of operations of the '<em>Star Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_RANKING_OPERATION_COUNT = RANKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.ViewRankingImpl <em>View Ranking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.ViewRankingImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getViewRanking()
	 * @generated
	 */
	int VIEW_RANKING = 22;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__DATA_SET = RANKING__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__IDENT = RANKING__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__URI = RANKING__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__STRING_VALUE = RANKING__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__STRING_XML = RANKING__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__LAST_MODIFIED = RANKING__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__CREATED = RANKING__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__META_TAGS = RANKING__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__IDENTIFIED_BY = RANKING__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__DELETE_ON_DELETE = RANKING__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__DELETED_IF_DELETED = RANKING__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__FORCED_DELETE_ON_DELETE = RANKING__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__FORCED_DELETED_IF_DELETED = RANKING__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__DATE = RANKING__DATE;

	/**
	 * The feature id for the '<em><b>Ranker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__RANKER = RANKING__RANKER;

	/**
	 * The feature id for the '<em><b>Ranked Information Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING__RANKED_INFORMATION_OBJECT = RANKING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING_FEATURE_COUNT = RANKING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___LOG__STRING = RANKING___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___LOG__STRING_INTEGER = RANKING___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___META_TAG__STRING = RANKING___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___IDENTIFY_BY__STRING_STRING = RANKING___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___GET_IDENTIFIER__STRING = RANKING___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___HAS_META_TAG__STRING = RANKING___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___MATCHES_SEARCH__STRING = RANKING___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___DELETE = RANKING___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___IS_EQUAL_ITEM__ITEM = RANKING___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = RANKING___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___GET_CREATED_PRETTY = RANKING___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = RANKING___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___GET_LAST_MODIFIED_PRETTY = RANKING___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___DELETE_ON_DELETE_OF__ITEM = RANKING___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___DELETE_IF_EMPTY_ON_DELETE = RANKING___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___UPDATE__ITEM = RANKING___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___FORCE_UPDATE__ITEM = RANKING___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___UN_META_TAG__STRING = RANKING___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___REMOVE_IDENTIFIER__STRING = RANKING___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___FORCE_DELETE_ON_DELETE_OF__ITEM = RANKING___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING___TAG__STRING = RANKING___TAG__STRING;

	/**
	 * The number of operations of the '<em>View Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_RANKING_OPERATION_COUNT = RANKING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.ThumbRankingImpl <em>Thumb Ranking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.ThumbRankingImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getThumbRanking()
	 * @generated
	 */
	int THUMB_RANKING = 23;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__DATA_SET = RANKING__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__IDENT = RANKING__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__URI = RANKING__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__STRING_VALUE = RANKING__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__STRING_XML = RANKING__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__LAST_MODIFIED = RANKING__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__CREATED = RANKING__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__META_TAGS = RANKING__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__IDENTIFIED_BY = RANKING__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__DELETE_ON_DELETE = RANKING__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__DELETED_IF_DELETED = RANKING__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__FORCED_DELETE_ON_DELETE = RANKING__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__FORCED_DELETED_IF_DELETED = RANKING__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__DATE = RANKING__DATE;

	/**
	 * The feature id for the '<em><b>Ranker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__RANKER = RANKING__RANKER;

	/**
	 * The feature id for the '<em><b>Ranked Information Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING__RANKED_INFORMATION_OBJECT = RANKING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thumb Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING_FEATURE_COUNT = RANKING_FEATURE_COUNT + 1;


	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___LOG__STRING = RANKING___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___LOG__STRING_INTEGER = RANKING___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___META_TAG__STRING = RANKING___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___IDENTIFY_BY__STRING_STRING = RANKING___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___GET_IDENTIFIER__STRING = RANKING___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___HAS_META_TAG__STRING = RANKING___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___MATCHES_SEARCH__STRING = RANKING___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___DELETE = RANKING___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___IS_EQUAL_ITEM__ITEM = RANKING___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = RANKING___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___GET_CREATED_PRETTY = RANKING___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = RANKING___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___GET_LAST_MODIFIED_PRETTY = RANKING___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___DELETE_ON_DELETE_OF__ITEM = RANKING___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___DELETE_IF_EMPTY_ON_DELETE = RANKING___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___UPDATE__ITEM = RANKING___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___FORCE_UPDATE__ITEM = RANKING___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___UN_META_TAG__STRING = RANKING___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___REMOVE_IDENTIFIER__STRING = RANKING___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___FORCE_DELETE_ON_DELETE_OF__ITEM = RANKING___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___TAG__STRING = RANKING___TAG__STRING;

	/**
	 * The operation id for the '<em>Is Thumb Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___IS_THUMB_UP = RANKING_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Thumb Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING___IS_THUMB_DOWN = RANKING_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Thumb Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMB_RANKING_OPERATION_COUNT = RANKING_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.TransformationImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 24;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__DATA_SET = ATTACHMENT__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__IDENT = ATTACHMENT__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__URI = ATTACHMENT__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__STRING_VALUE = ATTACHMENT__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__STRING_XML = ATTACHMENT__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__LAST_MODIFIED = ATTACHMENT__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CREATED = ATTACHMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__META_TAGS = ATTACHMENT__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__IDENTIFIED_BY = ATTACHMENT__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__DELETE_ON_DELETE = ATTACHMENT__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__DELETED_IF_DELETED = ATTACHMENT__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__FORCED_DELETE_ON_DELETE = ATTACHMENT__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__FORCED_DELETED_IF_DELETED = ATTACHMENT__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__FILE_URL = ATTACHMENT__FILE_URL;

	/**
	 * The feature id for the '<em><b>Cached File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CACHED_FILE_URL = ATTACHMENT__CACHED_FILE_URL;

	/**
	 * The feature id for the '<em><b>Cached Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CACHED_ONLY = ATTACHMENT__CACHED_ONLY;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__FILE_EXTENSION = ATTACHMENT__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>File Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__FILE_IDENTIFIER = ATTACHMENT__FILE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Cached File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CACHED_FILE_NAME = ATTACHMENT__CACHED_FILE_NAME;

	/**
	 * The feature id for the '<em><b>No Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NO_CACHE = ATTACHMENT__NO_CACHE;

	/**
	 * The feature id for the '<em><b>Transformed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRANSFORMED = ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 1;


	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___LOG__STRING = ATTACHMENT___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___LOG__STRING_INTEGER = ATTACHMENT___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___META_TAG__STRING = ATTACHMENT___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___IDENTIFY_BY__STRING_STRING = ATTACHMENT___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___GET_IDENTIFIER__STRING = ATTACHMENT___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___HAS_META_TAG__STRING = ATTACHMENT___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___MATCHES_SEARCH__STRING = ATTACHMENT___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___DELETE = ATTACHMENT___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___IS_EQUAL_ITEM__ITEM = ATTACHMENT___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = ATTACHMENT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___GET_CREATED_PRETTY = ATTACHMENT___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = ATTACHMENT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___GET_LAST_MODIFIED_PRETTY = ATTACHMENT___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___DELETE_ON_DELETE_OF__ITEM = ATTACHMENT___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___DELETE_IF_EMPTY_ON_DELETE = ATTACHMENT___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___UPDATE__ITEM = ATTACHMENT___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___FORCE_UPDATE__ITEM = ATTACHMENT___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___UN_META_TAG__STRING = ATTACHMENT___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___REMOVE_IDENTIFIER__STRING = ATTACHMENT___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___FORCE_DELETE_ON_DELETE_OF__ITEM = ATTACHMENT___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___TAG__STRING = ATTACHMENT___TAG__STRING;

	/**
	 * The operation id for the '<em>Get Original File Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___GET_ORIGINAL_FILE_URL = ATTACHMENT___GET_ORIGINAL_FILE_URL;

	/**
	 * The operation id for the '<em>Reload File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___RELOAD_FILE = ATTACHMENT___RELOAD_FILE;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.VideoImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 25;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DATA_SET = ATTACHMENT__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__IDENT = ATTACHMENT__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__URI = ATTACHMENT__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__STRING_VALUE = ATTACHMENT__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__STRING_XML = ATTACHMENT__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__LAST_MODIFIED = ATTACHMENT__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__CREATED = ATTACHMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__META_TAGS = ATTACHMENT__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__IDENTIFIED_BY = ATTACHMENT__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DELETE_ON_DELETE = ATTACHMENT__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__DELETED_IF_DELETED = ATTACHMENT__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__FORCED_DELETE_ON_DELETE = ATTACHMENT__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__FORCED_DELETED_IF_DELETED = ATTACHMENT__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__FILE_URL = ATTACHMENT__FILE_URL;

	/**
	 * The feature id for the '<em><b>Cached File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__CACHED_FILE_URL = ATTACHMENT__CACHED_FILE_URL;

	/**
	 * The feature id for the '<em><b>Cached Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__CACHED_ONLY = ATTACHMENT__CACHED_ONLY;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__FILE_EXTENSION = ATTACHMENT__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>File Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__FILE_IDENTIFIER = ATTACHMENT__FILE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Cached File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__CACHED_FILE_NAME = ATTACHMENT__CACHED_FILE_NAME;

	/**
	 * The feature id for the '<em><b>No Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__NO_CACHE = ATTACHMENT__NO_CACHE;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 0;


	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___LOG__STRING = ATTACHMENT___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___LOG__STRING_INTEGER = ATTACHMENT___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___META_TAG__STRING = ATTACHMENT___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___IDENTIFY_BY__STRING_STRING = ATTACHMENT___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___GET_IDENTIFIER__STRING = ATTACHMENT___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___HAS_META_TAG__STRING = ATTACHMENT___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___MATCHES_SEARCH__STRING = ATTACHMENT___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___DELETE = ATTACHMENT___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___IS_EQUAL_ITEM__ITEM = ATTACHMENT___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = ATTACHMENT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___GET_CREATED_PRETTY = ATTACHMENT___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = ATTACHMENT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___GET_LAST_MODIFIED_PRETTY = ATTACHMENT___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___DELETE_ON_DELETE_OF__ITEM = ATTACHMENT___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___DELETE_IF_EMPTY_ON_DELETE = ATTACHMENT___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___UPDATE__ITEM = ATTACHMENT___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___FORCE_UPDATE__ITEM = ATTACHMENT___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___UN_META_TAG__STRING = ATTACHMENT___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___REMOVE_IDENTIFIER__STRING = ATTACHMENT___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___FORCE_DELETE_ON_DELETE_OF__ITEM = ATTACHMENT___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___TAG__STRING = ATTACHMENT___TAG__STRING;

	/**
	 * The operation id for the '<em>Get Original File Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___GET_ORIGINAL_FILE_URL = ATTACHMENT___GET_ORIGINAL_FILE_URL;

	/**
	 * The operation id for the '<em>Reload File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO___RELOAD_FILE = ATTACHMENT___RELOAD_FILE;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.ConnectionImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 26;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DATA_SET = EXTENSION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IDENT = EXTENSION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__URI = EXTENSION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__STRING_VALUE = EXTENSION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__STRING_XML = EXTENSION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__LAST_MODIFIED = EXTENSION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CREATED = EXTENSION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__META_TAGS = EXTENSION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IDENTIFIED_BY = EXTENSION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DELETE_ON_DELETE = EXTENSION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DELETED_IF_DELETED = EXTENSION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FORCED_DELETE_ON_DELETE = EXTENSION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FORCED_DELETED_IF_DELETED = EXTENSION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TO = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 2;


	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___LOG__STRING = EXTENSION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___LOG__STRING_INTEGER = EXTENSION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___META_TAG__STRING = EXTENSION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___IDENTIFY_BY__STRING_STRING = EXTENSION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_IDENTIFIER__STRING = EXTENSION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___HAS_META_TAG__STRING = EXTENSION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___MATCHES_SEARCH__STRING = EXTENSION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___DELETE = EXTENSION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___IS_EQUAL_ITEM__ITEM = EXTENSION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = EXTENSION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_CREATED_PRETTY = EXTENSION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = EXTENSION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___GET_LAST_MODIFIED_PRETTY = EXTENSION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___DELETE_ON_DELETE_OF__ITEM = EXTENSION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___DELETE_IF_EMPTY_ON_DELETE = EXTENSION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___UPDATE__ITEM = EXTENSION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___FORCE_UPDATE__ITEM = EXTENSION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___UN_META_TAG__STRING = EXTENSION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___REMOVE_IDENTIFIER__STRING = EXTENSION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___FORCE_DELETE_ON_DELETE_OF__ITEM = EXTENSION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION___TAG__STRING = EXTENSION___TAG__STRING;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.BinaryImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 27;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__DATA_SET = ATTACHMENT__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__IDENT = ATTACHMENT__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__URI = ATTACHMENT__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__STRING_VALUE = ATTACHMENT__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__STRING_XML = ATTACHMENT__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__LAST_MODIFIED = ATTACHMENT__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__CREATED = ATTACHMENT__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__META_TAGS = ATTACHMENT__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__IDENTIFIED_BY = ATTACHMENT__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__DELETE_ON_DELETE = ATTACHMENT__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__DELETED_IF_DELETED = ATTACHMENT__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__FORCED_DELETE_ON_DELETE = ATTACHMENT__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__FORCED_DELETED_IF_DELETED = ATTACHMENT__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__FILE_URL = ATTACHMENT__FILE_URL;

	/**
	 * The feature id for the '<em><b>Cached File Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__CACHED_FILE_URL = ATTACHMENT__CACHED_FILE_URL;

	/**
	 * The feature id for the '<em><b>Cached Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__CACHED_ONLY = ATTACHMENT__CACHED_ONLY;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__FILE_EXTENSION = ATTACHMENT__FILE_EXTENSION;

	/**
	 * The feature id for the '<em><b>File Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__FILE_IDENTIFIER = ATTACHMENT__FILE_IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Cached File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__CACHED_FILE_NAME = ATTACHMENT__CACHED_FILE_NAME;

	/**
	 * The feature id for the '<em><b>No Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__NO_CACHE = ATTACHMENT__NO_CACHE;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__BYTES = ATTACHMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 1;


	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___LOG__STRING = ATTACHMENT___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___LOG__STRING_INTEGER = ATTACHMENT___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___META_TAG__STRING = ATTACHMENT___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___IDENTIFY_BY__STRING_STRING = ATTACHMENT___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___GET_IDENTIFIER__STRING = ATTACHMENT___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___HAS_META_TAG__STRING = ATTACHMENT___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___MATCHES_SEARCH__STRING = ATTACHMENT___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___DELETE = ATTACHMENT___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___IS_EQUAL_ITEM__ITEM = ATTACHMENT___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = ATTACHMENT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___GET_CREATED_PRETTY = ATTACHMENT___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = ATTACHMENT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___GET_LAST_MODIFIED_PRETTY = ATTACHMENT___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___DELETE_ON_DELETE_OF__ITEM = ATTACHMENT___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___DELETE_IF_EMPTY_ON_DELETE = ATTACHMENT___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___UPDATE__ITEM = ATTACHMENT___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___FORCE_UPDATE__ITEM = ATTACHMENT___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___UN_META_TAG__STRING = ATTACHMENT___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___REMOVE_IDENTIFIER__STRING = ATTACHMENT___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___FORCE_DELETE_ON_DELETE_OF__ITEM = ATTACHMENT___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___TAG__STRING = ATTACHMENT___TAG__STRING;

	/**
	 * The operation id for the '<em>Get Original File Url</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___GET_ORIGINAL_FILE_URL = ATTACHMENT___GET_ORIGINAL_FILE_URL;

	/**
	 * The operation id for the '<em>Reload File</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY___RELOAD_FILE = ATTACHMENT___RELOAD_FILE;

	/**
	 * The number of operations of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_COUNT = ATTACHMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.IndoorLocationImpl <em>Indoor Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.IndoorLocationImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getIndoorLocation()
	 * @generated
	 */
	int INDOOR_LOCATION = 29;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__DATA_SET = META_INFORMATION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__IDENT = META_INFORMATION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__URI = META_INFORMATION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__STRING_VALUE = META_INFORMATION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__STRING_XML = META_INFORMATION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__LAST_MODIFIED = META_INFORMATION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__CREATED = META_INFORMATION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__META_TAGS = META_INFORMATION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__IDENTIFIED_BY = META_INFORMATION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__DELETE_ON_DELETE = META_INFORMATION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__DELETED_IF_DELETED = META_INFORMATION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__FORCED_DELETE_ON_DELETE = META_INFORMATION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__FORCED_DELETED_IF_DELETED = META_INFORMATION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__INFORMATION_OBJECTS = META_INFORMATION__INFORMATION_OBJECTS;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__LOCATION = META_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Indoor Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__PARENT_INDOOR_LOCATION = META_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Indoor Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__INDOOR_LOCATIONS = META_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION__NAME = META_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Indoor Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION_FEATURE_COUNT = META_INFORMATION_FEATURE_COUNT + 4;


	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___LOG__STRING = META_INFORMATION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___LOG__STRING_INTEGER = META_INFORMATION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___META_TAG__STRING = META_INFORMATION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___IDENTIFY_BY__STRING_STRING = META_INFORMATION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___GET_IDENTIFIER__STRING = META_INFORMATION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___HAS_META_TAG__STRING = META_INFORMATION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___MATCHES_SEARCH__STRING = META_INFORMATION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___DELETE = META_INFORMATION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___IS_EQUAL_ITEM__ITEM = META_INFORMATION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___GET_CREATED_PRETTY = META_INFORMATION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___GET_LAST_MODIFIED_PRETTY = META_INFORMATION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___DELETE_IF_EMPTY_ON_DELETE = META_INFORMATION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___UPDATE__ITEM = META_INFORMATION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___FORCE_UPDATE__ITEM = META_INFORMATION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___UN_META_TAG__STRING = META_INFORMATION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___REMOVE_IDENTIFIER__STRING = META_INFORMATION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___FORCE_DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION___TAG__STRING = META_INFORMATION___TAG__STRING;

	/**
	 * The number of operations of the '<em>Indoor Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDOOR_LOCATION_OPERATION_COUNT = META_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.IdentifierImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 30;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__DATA_SET = ITEM__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__IDENT = ITEM__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__URI = ITEM__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__STRING_VALUE = ITEM__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__STRING_XML = ITEM__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__LAST_MODIFIED = ITEM__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__CREATED = ITEM__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__META_TAGS = ITEM__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__IDENTIFIED_BY = ITEM__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__DELETE_ON_DELETE = ITEM__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__DELETED_IF_DELETED = ITEM__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__FORCED_DELETE_ON_DELETE = ITEM__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__FORCED_DELETED_IF_DELETED = ITEM__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__KEY = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__VALUE = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Identified</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__IDENTIFIED = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;


	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___LOG__STRING = ITEM___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___LOG__STRING_INTEGER = ITEM___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___META_TAG__STRING = ITEM___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___IDENTIFY_BY__STRING_STRING = ITEM___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___GET_IDENTIFIER__STRING = ITEM___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___HAS_META_TAG__STRING = ITEM___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___MATCHES_SEARCH__STRING = ITEM___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___DELETE = ITEM___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___IS_EQUAL_ITEM__ITEM = ITEM___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___GET_CREATED_PRETTY = ITEM___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___GET_LAST_MODIFIED_PRETTY = ITEM___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___DELETE_ON_DELETE_OF__ITEM = ITEM___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___DELETE_IF_EMPTY_ON_DELETE = ITEM___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___UPDATE__ITEM = ITEM___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___FORCE_UPDATE__ITEM = ITEM___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___UN_META_TAG__STRING = ITEM___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___REMOVE_IDENTIFIER__STRING = ITEM___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER___FORCE_DELETE_ON_DELETE_OF__ITEM = ITEM___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.EventImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 31;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATA_SET = META_INFORMATION__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IDENT = META_INFORMATION__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__URI = META_INFORMATION__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__STRING_VALUE = META_INFORMATION__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__STRING_XML = META_INFORMATION__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__LAST_MODIFIED = META_INFORMATION__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CREATED = META_INFORMATION__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__META_TAGS = META_INFORMATION__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IDENTIFIED_BY = META_INFORMATION__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DELETE_ON_DELETE = META_INFORMATION__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DELETED_IF_DELETED = META_INFORMATION__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FORCED_DELETE_ON_DELETE = META_INFORMATION__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__FORCED_DELETED_IF_DELETED = META_INFORMATION__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Information Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INFORMATION_OBJECTS = META_INFORMATION__INFORMATION_OBJECTS;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATE = META_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = META_INFORMATION_FEATURE_COUNT + 1;


	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___LOG__STRING = META_INFORMATION___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___LOG__STRING_INTEGER = META_INFORMATION___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___META_TAG__STRING = META_INFORMATION___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___IDENTIFY_BY__STRING_STRING = META_INFORMATION___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_IDENTIFIER__STRING = META_INFORMATION___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___HAS_META_TAG__STRING = META_INFORMATION___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___MATCHES_SEARCH__STRING = META_INFORMATION___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___DELETE = META_INFORMATION___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___IS_EQUAL_ITEM__ITEM = META_INFORMATION___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_CREATED_PRETTY = META_INFORMATION___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_LAST_MODIFIED_PRETTY = META_INFORMATION___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___DELETE_IF_EMPTY_ON_DELETE = META_INFORMATION___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___UPDATE__ITEM = META_INFORMATION___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___FORCE_UPDATE__ITEM = META_INFORMATION___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___UN_META_TAG__STRING = META_INFORMATION___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___REMOVE_IDENTIFIER__STRING = META_INFORMATION___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___FORCE_DELETE_ON_DELETE_OF__ITEM = META_INFORMATION___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___TAG__STRING = META_INFORMATION___TAG__STRING;

	/**
	 * The operation id for the '<em>Get Date Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_DATE_PRETTY_IN_LANGUAGE__STRING = META_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Date Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_DATE_PRETTY = META_INFORMATION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = META_INFORMATION_OPERATION_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.data.impl.DeletedItemImpl <em>Deleted Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.data.impl.DeletedItemImpl
	 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getDeletedItem()
	 * @generated
	 */
	int DELETED_ITEM = 32;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__DATA_SET = ITEM__DATA_SET;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__IDENT = ITEM__IDENT;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__URI = ITEM__URI;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__STRING_VALUE = ITEM__STRING_VALUE;

	/**
	 * The feature id for the '<em><b>String XML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__STRING_XML = ITEM__STRING_XML;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__LAST_MODIFIED = ITEM__LAST_MODIFIED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__CREATED = ITEM__CREATED;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__META_TAGS = ITEM__META_TAGS;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__IDENTIFIED_BY = ITEM__IDENTIFIED_BY;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__DELETE_ON_DELETE = ITEM__DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__DELETED_IF_DELETED = ITEM__DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Forced Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__FORCED_DELETE_ON_DELETE = ITEM__FORCED_DELETE_ON_DELETE;

	/**
	 * The feature id for the '<em><b>Forced Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__FORCED_DELETED_IF_DELETED = ITEM__FORCED_DELETED_IF_DELETED;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__DELETED = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ident Of Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM__IDENT_OF_DELETED = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deleted Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___LOG__STRING = ITEM___LOG__STRING;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___LOG__STRING_INTEGER = ITEM___LOG__STRING_INTEGER;

	/**
	 * The operation id for the '<em>Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___META_TAG__STRING = ITEM___META_TAG__STRING;

	/**
	 * The operation id for the '<em>Identify By</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___IDENTIFY_BY__STRING_STRING = ITEM___IDENTIFY_BY__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___GET_IDENTIFIER__STRING = ITEM___GET_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Has Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___HAS_META_TAG__STRING = ITEM___HAS_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Matches Search</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___MATCHES_SEARCH__STRING = ITEM___MATCHES_SEARCH__STRING;

	/**
	 * The operation id for the '<em>Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___DELETE = ITEM___DELETE;

	/**
	 * The operation id for the '<em>Is Equal Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___IS_EQUAL_ITEM__ITEM = ITEM___IS_EQUAL_ITEM__ITEM;

	/**
	 * The operation id for the '<em>Get Created Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_CREATED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Created Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___GET_CREATED_PRETTY = ITEM___GET_CREATED_PRETTY;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = ITEM___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING;

	/**
	 * The operation id for the '<em>Get Last Modified Pretty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___GET_LAST_MODIFIED_PRETTY = ITEM___GET_LAST_MODIFIED_PRETTY;

	/**
	 * The operation id for the '<em>Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___DELETE_ON_DELETE_OF__ITEM = ITEM___DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The operation id for the '<em>Delete If Empty On Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___DELETE_IF_EMPTY_ON_DELETE = ITEM___DELETE_IF_EMPTY_ON_DELETE;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___UPDATE__ITEM = ITEM___UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Force Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___FORCE_UPDATE__ITEM = ITEM___FORCE_UPDATE__ITEM;

	/**
	 * The operation id for the '<em>Un Meta Tag</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___UN_META_TAG__STRING = ITEM___UN_META_TAG__STRING;

	/**
	 * The operation id for the '<em>Remove Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___REMOVE_IDENTIFIER__STRING = ITEM___REMOVE_IDENTIFIER__STRING;

	/**
	 * The operation id for the '<em>Force Delete On Delete Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM___FORCE_DELETE_ON_DELETE_OF__ITEM = ITEM___FORCE_DELETE_ON_DELETE_OF__ITEM;

	/**
	 * The number of operations of the '<em>Deleted Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETED_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see org.sociotech.communitymashup.data.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Person#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see org.sociotech.communitymashup.data.Person#getLastname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Person#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see org.sociotech.communitymashup.data.Person#getFirstname()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Firstname();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Person#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persons</em>'.
	 * @see org.sociotech.communitymashup.data.Person#getPersons()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Persons();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Person#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.sociotech.communitymashup.data.Person#getTitle()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Title();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Person#getRanked <em>Ranked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ranked</em>'.
	 * @see org.sociotech.communitymashup.data.Person#getRanked()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Ranked();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Person#getContents() <em>Get Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents</em>' operation.
	 * @see org.sociotech.communitymashup.data.Person#getContents()
	 * @generated
	 */
	EOperation getPerson__GetContents();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Person#getOrganisations() <em>Get Organisations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations</em>' operation.
	 * @see org.sociotech.communitymashup.data.Person#getOrganisations()
	 * @generated
	 */
	EOperation getPerson__GetOrganisations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Person#addContributedContent(org.sociotech.communitymashup.data.Content) <em>Add Contributed Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Contributed Content</em>' operation.
	 * @see org.sociotech.communitymashup.data.Person#addContributedContent(org.sociotech.communitymashup.data.Content)
	 * @generated
	 */
	EOperation getPerson__AddContributedContent__Content();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Person#addAuthoredContent(org.sociotech.communitymashup.data.Content) <em>Add Authored Content</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Authored Content</em>' operation.
	 * @see org.sociotech.communitymashup.data.Person#addAuthoredContent(org.sociotech.communitymashup.data.Content)
	 * @generated
	 */
	EOperation getPerson__AddAuthoredContent__Content();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Person#parseFirstName() <em>Parse First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse First Name</em>' operation.
	 * @see org.sociotech.communitymashup.data.Person#parseFirstName()
	 * @generated
	 */
	EOperation getPerson__ParseFirstName();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Person#parseLastName() <em>Parse Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Parse Last Name</em>' operation.
	 * @see org.sociotech.communitymashup.data.Person#parseLastName()
	 * @generated
	 */
	EOperation getPerson__ParseLastName();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Person#getLeaderOf <em>Leader Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Leader Of</em>'.
	 * @see org.sociotech.communitymashup.data.Person#getLeaderOf()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_LeaderOf();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Person#getParticipates <em>Participates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participates</em>'.
	 * @see org.sociotech.communitymashup.data.Person#getParticipates()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Participates();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Person#getAuthored <em>Authored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Authored</em>'.
	 * @see org.sociotech.communitymashup.data.Person#getAuthored()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Authored();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Person#getContributed <em>Contributed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributed</em>'.
	 * @see org.sociotech.communitymashup.data.Person#getContributed()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Contributed();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Person#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Of Birth</em>'.
	 * @see org.sociotech.communitymashup.data.Person#getDateOfBirth()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_DateOfBirth();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.InformationObject <em>Information Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Object</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject
	 * @generated
	 */
	EClass getInformationObject();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.InformationObject#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getCategories()
	 * @see #getInformationObject()
	 * @generated
	 */
	EReference getInformationObject_Categories();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.InformationObject#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getTags()
	 * @see #getInformationObject()
	 * @generated
	 */
	EReference getInformationObject_Tags();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.InformationObject#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Images</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getImages()
	 * @see #getInformationObject()
	 * @generated
	 */
	EReference getInformationObject_Images();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.InformationObject#getStarRankings <em>Star Rankings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Star Rankings</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getStarRankings()
	 * @see #getInformationObject()
	 * @generated
	 */
	EReference getInformationObject_StarRankings();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.InformationObject#getThumbRankings <em>Thumb Rankings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Thumb Rankings</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getThumbRankings()
	 * @see #getInformationObject()
	 * @generated
	 */
	EReference getInformationObject_ThumbRankings();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.InformationObject#getViewRankings <em>View Rankings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>View Rankings</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getViewRankings()
	 * @see #getInformationObject()
	 * @generated
	 */
	EReference getInformationObject_ViewRankings();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.InformationObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getName()
	 * @see #getInformationObject()
	 * @generated
	 */
	EAttribute getInformationObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.InformationObject#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected To</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getConnectedTo()
	 * @see #getInformationObject()
	 * @generated
	 */
	EReference getInformationObject_ConnectedTo();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.InformationObject#getConnectedBy <em>Connected By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connected By</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getConnectedBy()
	 * @see #getInformationObject()
	 * @generated
	 */
	EReference getInformationObject_ConnectedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.InformationObject#getBinaries <em>Binaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Binaries</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getBinaries()
	 * @see #getInformationObject()
	 * @generated
	 */
	EReference getInformationObject_Binaries();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.InformationObject#getMainCategory <em>Main Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Category</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getMainCategory()
	 * @see #getInformationObject()
	 * @generated
	 */
	EReference getInformationObject_MainCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.InformationObject#getMetaInformations <em>Meta Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Informations</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getMetaInformations()
	 * @see #getInformationObject()
	 * @generated
	 */
	EReference getInformationObject_MetaInformations();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.InformationObject#getAlternativeNames <em>Alternative Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alternative Names</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getAlternativeNames()
	 * @see #getInformationObject()
	 * @generated
	 */
	EAttribute getInformationObject_AlternativeNames();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.InformationObject#getVerifiedName <em>Verified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verified Name</em>'.
	 * @see org.sociotech.communitymashup.data.InformationObject#getVerifiedName()
	 * @see #getInformationObject()
	 * @generated
	 */
	EAttribute getInformationObject_VerifiedName();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#tag(java.lang.String) <em>Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#tag(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__Tag__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#categorize(java.lang.String) <em>Categorize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Categorize</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#categorize(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__Categorize__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#attachImage(java.lang.String) <em>Attach Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attach Image</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#attachImage(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__AttachImage__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getAttachments() <em>Get Attachments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attachments</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getAttachments()
	 * @generated
	 */
	EOperation getInformationObject__GetAttachments();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#starRank(java.lang.Integer, java.lang.Integer) <em>Star Rank</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Star Rank</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#starRank(java.lang.Integer, java.lang.Integer)
	 * @generated
	 */
	EOperation getInformationObject__StarRank__Integer_Integer();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#view() <em>View</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#view()
	 * @generated
	 */
	EOperation getInformationObject__View();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#thumbsUp() <em>Thumbs Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Thumbs Up</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#thumbsUp()
	 * @generated
	 */
	EOperation getInformationObject__ThumbsUp();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#thumbsDown() <em>Thumbs Down</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Thumbs Down</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#thumbsDown()
	 * @generated
	 */
	EOperation getInformationObject__ThumbsDown();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getThumbsUp() <em>Get Thumbs Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thumbs Up</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getThumbsUp()
	 * @generated
	 */
	EOperation getInformationObject__GetThumbsUp();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getThumbsDown() <em>Get Thumbs Down</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thumbs Down</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getThumbsDown()
	 * @generated
	 */
	EOperation getInformationObject__GetThumbsDown();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getThumbsUpCount() <em>Get Thumbs Up Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thumbs Up Count</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getThumbsUpCount()
	 * @generated
	 */
	EOperation getInformationObject__GetThumbsUpCount();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getThumbsDownCount() <em>Get Thumbs Down Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thumbs Down Count</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getThumbsDownCount()
	 * @generated
	 */
	EOperation getInformationObject__GetThumbsDownCount();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getThumbsCount() <em>Get Thumbs Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thumbs Count</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getThumbsCount()
	 * @generated
	 */
	EOperation getInformationObject__GetThumbsCount();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getViewsCount() <em>Get Views Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Views Count</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getViewsCount()
	 * @generated
	 */
	EOperation getInformationObject__GetViewsCount();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getStarRanking() <em>Get Star Ranking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Star Ranking</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getStarRanking()
	 * @generated
	 */
	EOperation getInformationObject__GetStarRanking();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#extend(org.sociotech.communitymashup.data.MetaInformation) <em>Extend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extend</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#extend(org.sociotech.communitymashup.data.MetaInformation)
	 * @generated
	 */
	EOperation getInformationObject__Extend__MetaInformation();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getWebAccounts() <em>Get Web Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Web Accounts</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getWebAccounts()
	 * @generated
	 */
	EOperation getInformationObject__GetWebAccounts();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getWebSites() <em>Get Web Sites</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Web Sites</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getWebSites()
	 * @generated
	 */
	EOperation getInformationObject__GetWebSites();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getPhones() <em>Get Phones</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Phones</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getPhones()
	 * @generated
	 */
	EOperation getInformationObject__GetPhones();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getLocations() <em>Get Locations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Locations</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getLocations()
	 * @generated
	 */
	EOperation getInformationObject__GetLocations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getEmails() <em>Get Emails</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Emails</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getEmails()
	 * @generated
	 */
	EOperation getInformationObject__GetEmails();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getInstantMessengers() <em>Get Instant Messengers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instant Messengers</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getInstantMessengers()
	 * @generated
	 */
	EOperation getInformationObject__GetInstantMessengers();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#addEmailAddress(java.lang.String) <em>Add Email Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Email Address</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#addEmailAddress(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__AddEmailAddress__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#addWebSite(java.lang.String) <em>Add Web Site</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Web Site</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#addWebSite(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__AddWebSite__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getInformationObjectsWithCommonTags() <em>Get Information Objects With Common Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects With Common Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getInformationObjectsWithCommonTags()
	 * @generated
	 */
	EOperation getInformationObject__GetInformationObjectsWithCommonTags();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#addWebAccount(java.lang.String) <em>Add Web Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Web Account</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#addWebAccount(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__AddWebAccount__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#hasImages() <em>Has Images</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Images</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#hasImages()
	 * @generated
	 */
	EOperation getInformationObject__HasImages();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnectedTo() <em>Get Information Objects Connected To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects Connected To</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnectedTo()
	 * @generated
	 */
	EOperation getInformationObject__GetInformationObjectsConnectedTo();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnectedFrom() <em>Get Information Objects Connected From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects Connected From</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnectedFrom()
	 * @generated
	 */
	EOperation getInformationObject__GetInformationObjectsConnectedFrom();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnected() <em>Get Information Objects Connected</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects Connected</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnected()
	 * @generated
	 */
	EOperation getInformationObject__GetInformationObjectsConnected();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#connectTo(org.sociotech.communitymashup.data.InformationObject) <em>Connect To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect To</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#connectTo(org.sociotech.communitymashup.data.InformationObject)
	 * @generated
	 */
	EOperation getInformationObject__ConnectTo__InformationObject();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#connectToWithMetaTag(org.sociotech.communitymashup.data.InformationObject, java.lang.String) <em>Connect To With Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect To With Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#connectToWithMetaTag(org.sociotech.communitymashup.data.InformationObject, java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__ConnectToWithMetaTag__InformationObject_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnectedToWithMetaTag(java.lang.String) <em>Get Information Objects Connected To With Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects Connected To With Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnectedToWithMetaTag(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__GetInformationObjectsConnectedToWithMetaTag__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnectedFromWithMetaTag(java.lang.String) <em>Get Information Objects Connected From With Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects Connected From With Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnectedFromWithMetaTag(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__GetInformationObjectsConnectedFromWithMetaTag__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnectedWithMetaTag(java.lang.String) <em>Get Information Objects Connected With Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects Connected With Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getInformationObjectsConnectedWithMetaTag(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__GetInformationObjectsConnectedWithMetaTag__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getConnectionsFrom(org.sociotech.communitymashup.data.InformationObject) <em>Get Connections From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connections From</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getConnectionsFrom(org.sociotech.communitymashup.data.InformationObject)
	 * @generated
	 */
	EOperation getInformationObject__GetConnectionsFrom__InformationObject();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getConnectionsTo(org.sociotech.communitymashup.data.InformationObject) <em>Get Connections To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connections To</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getConnectionsTo(org.sociotech.communitymashup.data.InformationObject)
	 * @generated
	 */
	EOperation getInformationObject__GetConnectionsTo__InformationObject();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#connectToWithValueAndMetaTag(org.sociotech.communitymashup.data.InformationObject, java.lang.String, java.lang.String) <em>Connect To With Value And Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect To With Value And Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#connectToWithValueAndMetaTag(org.sociotech.communitymashup.data.InformationObject, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__ConnectToWithValueAndMetaTag__InformationObject_String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getConnectionTo(org.sociotech.communitymashup.data.InformationObject, java.lang.String) <em>Get Connection To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connection To</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getConnectionTo(org.sociotech.communitymashup.data.InformationObject, java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__GetConnectionTo__InformationObject_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getConnectionFrom(org.sociotech.communitymashup.data.InformationObject, java.lang.String) <em>Get Connection From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connection From</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getConnectionFrom(org.sociotech.communitymashup.data.InformationObject, java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__GetConnectionFrom__InformationObject_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getAttachmentWithUrl(java.lang.String) <em>Get Attachment With Url</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attachment With Url</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getAttachmentWithUrl(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__GetAttachmentWithUrl__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getAttachedImageWithUrl(java.lang.String) <em>Get Attached Image With Url</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attached Image With Url</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getAttachedImageWithUrl(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__GetAttachedImageWithUrl__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#addPhone(java.lang.String) <em>Add Phone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Phone</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#addPhone(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__AddPhone__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getPersonsWithCommonTags() <em>Get Persons With Common Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons With Common Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getPersonsWithCommonTags()
	 * @generated
	 */
	EOperation getInformationObject__GetPersonsWithCommonTags();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getOrganisationsWithCommonTags() <em>Get Organisations With Common Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations With Common Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getOrganisationsWithCommonTags()
	 * @generated
	 */
	EOperation getInformationObject__GetOrganisationsWithCommonTags();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getContentsWithCommonTags() <em>Get Contents With Common Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents With Common Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getContentsWithCommonTags()
	 * @generated
	 */
	EOperation getInformationObject__GetContentsWithCommonTags();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#unTag(java.lang.String) <em>Un Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Un Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#unTag(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__UnTag__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#unCategorize(java.lang.String) <em>Un Categorize</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Un Categorize</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#unCategorize(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__UnCategorize__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getSlugName() <em>Get Slug Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Slug Name</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getSlugName()
	 * @generated
	 */
	EOperation getInformationObject__GetSlugName();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getConnectionsToWithMetaTag(org.sociotech.communitymashup.data.InformationObject, java.lang.String) <em>Get Connections To With Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connections To With Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getConnectionsToWithMetaTag(org.sociotech.communitymashup.data.InformationObject, java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__GetConnectionsToWithMetaTag__InformationObject_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getConnectionsFromWithMetaTag(org.sociotech.communitymashup.data.InformationObject, java.lang.String) <em>Get Connections From With Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connections From With Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getConnectionsFromWithMetaTag(org.sociotech.communitymashup.data.InformationObject, java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__GetConnectionsFromWithMetaTag__InformationObject_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#starRankWithMetaTag(java.lang.Integer, java.lang.Integer, java.lang.String) <em>Star Rank With Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Star Rank With Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#starRankWithMetaTag(java.lang.Integer, java.lang.Integer, java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__StarRankWithMetaTag__Integer_Integer_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#addAlternativeName(java.lang.String) <em>Add Alternative Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Alternative Name</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#addAlternativeName(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__AddAlternativeName__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getAttachedImageWithMetaTag(org.sociotech.communitymashup.data.MetaTag) <em>Get Attached Image With Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attached Image With Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getAttachedImageWithMetaTag(org.sociotech.communitymashup.data.MetaTag)
	 * @generated
	 */
	EOperation getInformationObject__GetAttachedImageWithMetaTag__MetaTag();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getAttachedImageWithMetaTagName(java.lang.String) <em>Get Attached Image With Meta Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attached Image With Meta Tag Name</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getAttachedImageWithMetaTagName(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__GetAttachedImageWithMetaTagName__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#starRankWithMetaTagList(java.lang.Integer, java.lang.Integer, java.lang.String) <em>Star Rank With Meta Tag List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Star Rank With Meta Tag List</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#starRankWithMetaTagList(java.lang.Integer, java.lang.Integer, java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__StarRankWithMetaTagList__Integer_Integer_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#addWebAccountForService(java.lang.String, java.lang.String) <em>Add Web Account For Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Web Account For Service</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#addWebAccountForService(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__AddWebAccountForService__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getAttachedImagesWithoutMetaTagName(java.lang.String) <em>Get Attached Images Without Meta Tag Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attached Images Without Meta Tag Name</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getAttachedImagesWithoutMetaTagName(java.lang.String)
	 * @generated
	 */
	EOperation getInformationObject__GetAttachedImagesWithoutMetaTagName__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getAttachedImagesWithoutMetaTag(org.sociotech.communitymashup.data.MetaTag) <em>Get Attached Images Without Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attached Images Without Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getAttachedImagesWithoutMetaTag(org.sociotech.communitymashup.data.MetaTag)
	 * @generated
	 */
	EOperation getInformationObject__GetAttachedImagesWithoutMetaTag__MetaTag();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getIndoorLocations() <em>Get Indoor Locations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Indoor Locations</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getIndoorLocations()
	 * @generated
	 */
	EOperation getInformationObject__GetIndoorLocations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.InformationObject#getEvents() <em>Get Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events</em>' operation.
	 * @see org.sociotech.communitymashup.data.InformationObject#getEvents()
	 * @generated
	 */
	EOperation getInformationObject__GetEvents();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see org.sociotech.communitymashup.data.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Content#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contents</em>'.
	 * @see org.sociotech.communitymashup.data.Content#getContents()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Contents();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Content#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributors</em>'.
	 * @see org.sociotech.communitymashup.data.Content#getContributors()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Contributors();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.Content#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.sociotech.communitymashup.data.Content#getAuthor()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Author();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Content#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Documents</em>'.
	 * @see org.sociotech.communitymashup.data.Content#getDocuments()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Documents();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.Content#getParentContent <em>Parent Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Content</em>'.
	 * @see org.sociotech.communitymashup.data.Content#getParentContent()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_ParentContent();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Content#getLocale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locale</em>'.
	 * @see org.sociotech.communitymashup.data.Content#getLocale()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Locale();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Content#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformations</em>'.
	 * @see org.sociotech.communitymashup.data.Content#getTransformations()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Transformations();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Content#getVideos <em>Videos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Videos</em>'.
	 * @see org.sociotech.communitymashup.data.Content#getVideos()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Videos();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Content#getOrganisations() <em>Get Organisations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations</em>' operation.
	 * @see org.sociotech.communitymashup.data.Content#getOrganisations()
	 * @generated
	 */
	EOperation getContent__GetOrganisations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Content#getPersons() <em>Get Persons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons</em>' operation.
	 * @see org.sociotech.communitymashup.data.Content#getPersons()
	 * @generated
	 */
	EOperation getContent__GetPersons();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Content#comment(java.lang.String) <em>Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Comment</em>' operation.
	 * @see org.sociotech.communitymashup.data.Content#comment(java.lang.String)
	 * @generated
	 */
	EOperation getContent__Comment__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Content#addContributor(org.sociotech.communitymashup.data.Person) <em>Add Contributor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Contributor</em>' operation.
	 * @see org.sociotech.communitymashup.data.Content#addContributor(org.sociotech.communitymashup.data.Person)
	 * @generated
	 */
	EOperation getContent__AddContributor__Person();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Content#attachDocument(java.lang.String) <em>Attach Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Attach Document</em>' operation.
	 * @see org.sociotech.communitymashup.data.Content#attachDocument(java.lang.String)
	 * @generated
	 */
	EOperation getContent__AttachDocument__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Content#commentWithMetaTagList(java.lang.String, java.lang.String) <em>Comment With Meta Tag List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Comment With Meta Tag List</em>' operation.
	 * @see org.sociotech.communitymashup.data.Content#commentWithMetaTagList(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getContent__CommentWithMetaTagList__String_String();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.DataSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet
	 * @generated
	 */
	EClass getDataSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.data.DataSet#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet#getItems()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_Items();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.DataSet#getCacheFolder <em>Cache Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Folder</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet#getCacheFolder()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_CacheFolder();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.DataSet#getCacheFileAttachements <em>Cache File Attachements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache File Attachements</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet#getCacheFileAttachements()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_CacheFileAttachements();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.DataSet#getSetUp <em>Set Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Set Up</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet#getSetUp()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_SetUp();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.DataSet#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet#getLastModified()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.DataSet#getLogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Level</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet#getLogLevel()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_LogLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.DataSet#getIdentCounter <em>Ident Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ident Counter</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet#getIdentCounter()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_IdentCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.DataSet#getIdentPrefix <em>Ident Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ident Prefix</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet#getIdentPrefix()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_IdentPrefix();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.DataSet#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet#getCreated()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_Created();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.DataSet#getKeepDeletedItemsList <em>Keep Deleted Items List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keep Deleted Items List</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet#getKeepDeletedItemsList()
	 * @see #getDataSet()
	 * @generated
	 */
	EAttribute getDataSet_KeepDeletedItemsList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.data.DataSet#getItemsDeleted <em>Items Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items Deleted</em>'.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemsDeleted()
	 * @see #getDataSet()
	 * @generated
	 */
	EReference getDataSet_ItemsDeleted();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#add(org.sociotech.communitymashup.data.Item) <em>Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#add(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getDataSet__Add__Item();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getItemsWithStringValue(java.lang.String) <em>Get Items With String Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Items With String Value</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemsWithStringValue(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetItemsWithStringValue__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonsWithName(java.lang.String) <em>Get Persons With Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons With Name</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonsWithName(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetPersonsWithName__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonsWithLastname(java.lang.String) <em>Get Persons With Lastname</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons With Lastname</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonsWithLastname(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetPersonsWithLastname__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonsWithFirstName(java.lang.String) <em>Get Persons With First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons With First Name</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonsWithFirstName(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetPersonsWithFirstName__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getTag(java.lang.String) <em>Get Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getTag(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetTag__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getMetaTag(java.lang.String) <em>Get Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getMetaTag(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetMetaTag__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getAllPersons() <em>Get All Persons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Persons</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getAllPersons()
	 * @generated
	 */
	EOperation getDataSet__GetAllPersons();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getAllContents() <em>Get All Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Contents</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getAllContents()
	 * @generated
	 */
	EOperation getDataSet__GetAllContents();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getAllOrganisations() <em>Get All Organisations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Organisations</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getAllOrganisations()
	 * @generated
	 */
	EOperation getDataSet__GetAllOrganisations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getAllCategories() <em>Get All Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Categories</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getAllCategories()
	 * @generated
	 */
	EOperation getDataSet__GetAllCategories();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getCategory(java.lang.String) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Category</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getCategory(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetCategory__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getAllTags() <em>Get All Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getAllTags()
	 * @generated
	 */
	EOperation getDataSet__GetAllTags();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getItemsModifiedSince(java.util.Date) <em>Get Items Modified Since</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Items Modified Since</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemsModifiedSince(java.util.Date)
	 * @generated
	 */
	EOperation getDataSet__GetItemsModifiedSince__Date();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getAllMetaTags() <em>Get All Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getAllMetaTags()
	 * @generated
	 */
	EOperation getDataSet__GetAllMetaTags();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getAllConnections() <em>Get All Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Connections</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getAllConnections()
	 * @generated
	 */
	EOperation getDataSet__GetAllConnections();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#log(java.lang.String) <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#log(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__Log__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#log(java.lang.String, java.lang.Integer) <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#log(java.lang.String, java.lang.Integer)
	 * @generated
	 */
	EOperation getDataSet__Log__String_Integer();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getContentWithIdent(java.lang.String) <em>Get Content With Ident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content With Ident</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getContentWithIdent(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetContentWithIdent__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonWithIdent(java.lang.String) <em>Get Person With Ident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Person With Ident</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonWithIdent(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetPersonWithIdent__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getOrganisationWithIdent(java.lang.String) <em>Get Organisation With Ident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisation With Ident</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getOrganisationWithIdent(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetOrganisationWithIdent__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getAttachmentWithIdent(java.lang.String) <em>Get Attachment With Ident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attachment With Ident</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getAttachmentWithIdent(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetAttachmentWithIdent__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithAllCategories(org.eclipse.emf.common.util.EList) <em>Get Information Objects With All Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects With All Categories</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithAllCategories(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetInformationObjectsWithAllCategories__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithOneOfCategories(org.eclipse.emf.common.util.EList) <em>Get Information Objects With One Of Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects With One Of Categories</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithOneOfCategories(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetInformationObjectsWithOneOfCategories__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getContentsWithAllCategories(org.eclipse.emf.common.util.EList) <em>Get Contents With All Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents With All Categories</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getContentsWithAllCategories(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetContentsWithAllCategories__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getContentsWithOneOfCategories(org.eclipse.emf.common.util.EList) <em>Get Contents With One Of Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents With One Of Categories</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getContentsWithOneOfCategories(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetContentsWithOneOfCategories__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonsWithAllCategories(org.eclipse.emf.common.util.EList) <em>Get Persons With All Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons With All Categories</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonsWithAllCategories(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetPersonsWithAllCategories__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonsWithOneOfCategories(org.eclipse.emf.common.util.EList) <em>Get Persons With One Of Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons With One Of Categories</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonsWithOneOfCategories(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetPersonsWithOneOfCategories__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getOrganisationsWithAllCategories(org.eclipse.emf.common.util.EList) <em>Get Organisations With All Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations With All Categories</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getOrganisationsWithAllCategories(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetOrganisationsWithAllCategories__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getOrganisationsWithOneOfCategories(org.eclipse.emf.common.util.EList) <em>Get Organisations With One Of Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations With One Of Categories</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getOrganisationsWithOneOfCategories(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetOrganisationsWithOneOfCategories__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithAllTags(org.eclipse.emf.common.util.EList) <em>Get Information Objects With All Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects With All Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithAllTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetInformationObjectsWithAllTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithOneOfTags(org.eclipse.emf.common.util.EList) <em>Get Information Objects With One Of Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects With One Of Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithOneOfTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetInformationObjectsWithOneOfTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getOrganisationsWithAllTags(org.eclipse.emf.common.util.EList) <em>Get Organisations With All Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations With All Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getOrganisationsWithAllTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetOrganisationsWithAllTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getOrganisationsWithOneOfTags(org.eclipse.emf.common.util.EList) <em>Get Organisations With One Of Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations With One Of Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getOrganisationsWithOneOfTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetOrganisationsWithOneOfTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonsWithAllTags(org.eclipse.emf.common.util.EList) <em>Get Persons With All Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons With All Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonsWithAllTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetPersonsWithAllTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonsWithOneOfTags(org.eclipse.emf.common.util.EList) <em>Get Persons With One Of Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons With One Of Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonsWithOneOfTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetPersonsWithOneOfTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getContentsWithAllTags(org.eclipse.emf.common.util.EList) <em>Get Contents With All Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents With All Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getContentsWithAllTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetContentsWithAllTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getContentsWithOneOfTags(org.eclipse.emf.common.util.EList) <em>Get Contents With One Of Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents With One Of Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getContentsWithOneOfTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetContentsWithOneOfTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getContentsWithName(java.lang.String) <em>Get Contents With Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents With Name</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getContentsWithName(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetContentsWithName__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getOrganisationsWithName(java.lang.String) <em>Get Organisations With Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations With Name</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getOrganisationsWithName(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetOrganisationsWithName__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getItemsWithAllMetaTags(org.eclipse.emf.common.util.EList) <em>Get Items With All Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Items With All Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemsWithAllMetaTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetItemsWithAllMetaTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getItemsWithOneOfMetaTags(org.eclipse.emf.common.util.EList) <em>Get Items With One Of Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Items With One Of Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemsWithOneOfMetaTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetItemsWithOneOfMetaTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersons() <em>Get Persons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersons()
	 * @generated
	 */
	EOperation getDataSet__GetPersons();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getOrganisations() <em>Get Organisations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getOrganisations()
	 * @generated
	 */
	EOperation getDataSet__GetOrganisations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getContents() <em>Get Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getContents()
	 * @generated
	 */
	EOperation getDataSet__GetContents();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getInformationObjects() <em>Get Information Objects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getInformationObjects()
	 * @generated
	 */
	EOperation getDataSet__GetInformationObjects();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getTags() <em>Get Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getTags()
	 * @generated
	 */
	EOperation getDataSet__GetTags();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getMetaTags() <em>Get Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getMetaTags()
	 * @generated
	 */
	EOperation getDataSet__GetMetaTags();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getAttachments() <em>Get Attachments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attachments</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getAttachments()
	 * @generated
	 */
	EOperation getDataSet__GetAttachments();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getBinaries() <em>Get Binaries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Binaries</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getBinaries()
	 * @generated
	 */
	EOperation getDataSet__GetBinaries();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getCategories() <em>Get Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Categories</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getCategories()
	 * @generated
	 */
	EOperation getDataSet__GetCategories();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getClassifications() <em>Get Classifications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Classifications</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getClassifications()
	 * @generated
	 */
	EOperation getDataSet__GetClassifications();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getConnections() <em>Get Connections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connections</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getConnections()
	 * @generated
	 */
	EOperation getDataSet__GetConnections();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getDocuments() <em>Get Documents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Documents</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getDocuments()
	 * @generated
	 */
	EOperation getDataSet__GetDocuments();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getEmails() <em>Get Emails</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Emails</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getEmails()
	 * @generated
	 */
	EOperation getDataSet__GetEmails();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getExtensions() <em>Get Extensions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extensions</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getExtensions()
	 * @generated
	 */
	EOperation getDataSet__GetExtensions();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getImages() <em>Get Images</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Images</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getImages()
	 * @generated
	 */
	EOperation getDataSet__GetImages();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getInstantMessengers() <em>Get Instant Messengers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instant Messengers</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getInstantMessengers()
	 * @generated
	 */
	EOperation getDataSet__GetInstantMessengers();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getLocations() <em>Get Locations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Locations</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getLocations()
	 * @generated
	 */
	EOperation getDataSet__GetLocations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getMetaInformations() <em>Get Meta Informations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Meta Informations</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getMetaInformations()
	 * @generated
	 */
	EOperation getDataSet__GetMetaInformations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPhones() <em>Get Phones</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Phones</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPhones()
	 * @generated
	 */
	EOperation getDataSet__GetPhones();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getRankings() <em>Get Rankings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rankings</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getRankings()
	 * @generated
	 */
	EOperation getDataSet__GetRankings();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getStarRankings() <em>Get Star Rankings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Star Rankings</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getStarRankings()
	 * @generated
	 */
	EOperation getDataSet__GetStarRankings();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getThumbRankings() <em>Get Thumb Rankings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Thumb Rankings</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getThumbRankings()
	 * @generated
	 */
	EOperation getDataSet__GetThumbRankings();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getTransformations() <em>Get Transformations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Transformations</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getTransformations()
	 * @generated
	 */
	EOperation getDataSet__GetTransformations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getVideos() <em>Get Videos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Videos</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getVideos()
	 * @generated
	 */
	EOperation getDataSet__GetVideos();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getViewRankings() <em>Get View Rankings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get View Rankings</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getViewRankings()
	 * @generated
	 */
	EOperation getDataSet__GetViewRankings();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getWebAccounts() <em>Get Web Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Web Accounts</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getWebAccounts()
	 * @generated
	 */
	EOperation getDataSet__GetWebAccounts();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getWebSites() <em>Get Web Sites</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Web Sites</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getWebSites()
	 * @generated
	 */
	EOperation getDataSet__GetWebSites();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithAllMetaTags(org.eclipse.emf.common.util.EList) <em>Get Information Objects With All Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects With All Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithAllMetaTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetInformationObjectsWithAllMetaTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithOneOfMetaTags(org.eclipse.emf.common.util.EList) <em>Get Information Objects With One Of Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects With One Of Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithOneOfMetaTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetInformationObjectsWithOneOfMetaTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getIdentifiers() <em>Get Identifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Identifiers</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getIdentifiers()
	 * @generated
	 */
	EOperation getDataSet__GetIdentifiers();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getIdentifiersWithKey(java.lang.String) <em>Get Identifiers With Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Identifiers With Key</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getIdentifiersWithKey(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetIdentifiersWithKey__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getIdentifierWithKeyValue(java.lang.String, java.lang.String) <em>Get Identifier With Key Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Identifier With Key Value</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getIdentifierWithKeyValue(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetIdentifierWithKeyValue__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getItemWithIdentifier(java.lang.String, java.lang.String) <em>Get Item With Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Item With Identifier</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemWithIdentifier(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetItemWithIdentifier__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonWithIdentifier(java.lang.String, java.lang.String) <em>Get Person With Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Person With Identifier</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonWithIdentifier(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetPersonWithIdentifier__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getContentWithIdentifier(java.lang.String, java.lang.String) <em>Get Content With Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content With Identifier</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getContentWithIdentifier(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetContentWithIdentifier__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getOrganisationWithIdentifier(java.lang.String, java.lang.String) <em>Get Organisation With Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisation With Identifier</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getOrganisationWithIdentifier(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetOrganisationWithIdentifier__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getLocationWithIdentifier(java.lang.String, java.lang.String) <em>Get Location With Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Location With Identifier</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getLocationWithIdentifier(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetLocationWithIdentifier__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getIndoorLocationWithIdentifier(java.lang.String, java.lang.String) <em>Get Indoor Location With Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Indoor Location With Identifier</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getIndoorLocationWithIdentifier(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetIndoorLocationWithIdentifier__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getImageWithIdentifier(java.lang.String, java.lang.String) <em>Get Image With Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Image With Identifier</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getImageWithIdentifier(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetImageWithIdentifier__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getEmptyItemWithIdent(java.lang.String) <em>Get Empty Item With Ident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Empty Item With Ident</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getEmptyItemWithIdent(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetEmptyItemWithIdent__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getTagsWithMoreThanXInformationObjects(java.lang.Integer) <em>Get Tags With More Than XInformation Objects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Tags With More Than XInformation Objects</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getTagsWithMoreThanXInformationObjects(java.lang.Integer)
	 * @generated
	 */
	EOperation getDataSet__GetTagsWithMoreThanXInformationObjects__Integer();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getItemsCreatedSince(java.util.Date) <em>Get Items Created Since</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Items Created Since</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemsCreatedSince(java.util.Date)
	 * @generated
	 */
	EOperation getDataSet__GetItemsCreatedSince__Date();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#searchItems(java.lang.String) <em>Search Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Items</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#searchItems(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__SearchItems__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#searchInformationObjects(java.lang.String) <em>Search Information Objects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Information Objects</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#searchInformationObjects(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__SearchInformationObjects__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithAttachment(org.sociotech.communitymashup.data.Attachment) <em>Get Information Objects With Attachment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects With Attachment</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getInformationObjectsWithAttachment(org.sociotech.communitymashup.data.Attachment)
	 * @generated
	 */
	EOperation getDataSet__GetInformationObjectsWithAttachment__Attachment();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonsWithAttachment(org.sociotech.communitymashup.data.Attachment) <em>Get Persons With Attachment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons With Attachment</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonsWithAttachment(org.sociotech.communitymashup.data.Attachment)
	 * @generated
	 */
	EOperation getDataSet__GetPersonsWithAttachment__Attachment();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getOrganisationsWithAttachment(org.sociotech.communitymashup.data.Attachment) <em>Get Organisations With Attachment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations With Attachment</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getOrganisationsWithAttachment(org.sociotech.communitymashup.data.Attachment)
	 * @generated
	 */
	EOperation getDataSet__GetOrganisationsWithAttachment__Attachment();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getContentsWithAttachment(org.sociotech.communitymashup.data.Attachment) <em>Get Contents With Attachment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents With Attachment</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getContentsWithAttachment(org.sociotech.communitymashup.data.Attachment)
	 * @generated
	 */
	EOperation getDataSet__GetContentsWithAttachment__Attachment();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getEqualItems(org.sociotech.communitymashup.data.Item) <em>Get Equal Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Equal Items</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getEqualItems(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getDataSet__GetEqualItems__Item();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#hasEqualItem(org.sociotech.communitymashup.data.Item) <em>Has Equal Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Equal Item</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#hasEqualItem(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getDataSet__HasEqualItem__Item();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getItemsWithIdent(java.lang.String) <em>Get Items With Ident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Items With Ident</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemsWithIdent(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetItemsWithIdent__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getAttachmentsWithCachedFileName(java.lang.String) <em>Get Attachments With Cached File Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attachments With Cached File Name</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getAttachmentsWithCachedFileName(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetAttachmentsWithCachedFileName__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getEventsAfter(java.util.Date) <em>Get Events After</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events After</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getEventsAfter(java.util.Date)
	 * @generated
	 */
	EOperation getDataSet__GetEventsAfter__Date();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getEventsBefore(java.util.Date) <em>Get Events Before</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events Before</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getEventsBefore(java.util.Date)
	 * @generated
	 */
	EOperation getDataSet__GetEventsBefore__Date();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getEventsBetweenDates(java.util.Date, java.util.Date) <em>Get Events Between Dates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events Between Dates</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getEventsBetweenDates(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getDataSet__GetEventsBetweenDates__Date_Date();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getSpicynodesRepresentation() <em>Get Spicynodes Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Spicynodes Representation</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getSpicynodesRepresentation()
	 * @generated
	 */
	EOperation getDataSet__GetSpicynodesRepresentation();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getConnectionsBetweenInformationObjectsOfDifferentCategories() <em>Get Connections Between Information Objects Of Different Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Connections Between Information Objects Of Different Categories</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getConnectionsBetweenInformationObjectsOfDifferentCategories()
	 * @generated
	 */
	EOperation getDataSet__GetConnectionsBetweenInformationObjectsOfDifferentCategories();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getInformationObjectsModifiedSince(java.util.Date) <em>Get Information Objects Modified Since</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects Modified Since</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getInformationObjectsModifiedSince(java.util.Date)
	 * @generated
	 */
	EOperation getDataSet__GetInformationObjectsModifiedSince__Date();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getRandomXInformationObjects(java.lang.Integer) <em>Get Random XInformation Objects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Random XInformation Objects</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getRandomXInformationObjects(java.lang.Integer)
	 * @generated
	 */
	EOperation getDataSet__GetRandomXInformationObjects__Integer();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getRandomXContents(java.lang.Integer) <em>Get Random XContents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Random XContents</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getRandomXContents(java.lang.Integer)
	 * @generated
	 */
	EOperation getDataSet__GetRandomXContents__Integer();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getRandomXPersons(java.lang.Integer) <em>Get Random XPersons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Random XPersons</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getRandomXPersons(java.lang.Integer)
	 * @generated
	 */
	EOperation getDataSet__GetRandomXPersons__Integer();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getRandomXOrganisations(java.lang.Integer) <em>Get Random XOrganisations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Random XOrganisations</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getRandomXOrganisations(java.lang.Integer)
	 * @generated
	 */
	EOperation getDataSet__GetRandomXOrganisations__Integer();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#forceAdd(org.sociotech.communitymashup.data.Item) <em>Force Add</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Force Add</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#forceAdd(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getDataSet__ForceAdd__Item();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getIdentsOfExistingItems() <em>Get Idents Of Existing Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Idents Of Existing Items</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getIdentsOfExistingItems()
	 * @generated
	 */
	EOperation getDataSet__GetIdentsOfExistingItems();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getCategoryWithSlug(java.lang.String) <em>Get Category With Slug</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Category With Slug</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getCategoryWithSlug(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__GetCategoryWithSlug__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#rebuildIndexes() <em>Rebuild Indexes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rebuild Indexes</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#rebuildIndexes()
	 * @generated
	 */
	EOperation getDataSet__RebuildIndexes();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getContentsWithAllMetaTags(org.eclipse.emf.common.util.EList) <em>Get Contents With All Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents With All Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getContentsWithAllMetaTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetContentsWithAllMetaTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getContentsWithOneOfMetaTags(org.eclipse.emf.common.util.EList) <em>Get Contents With One Of Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents With One Of Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getContentsWithOneOfMetaTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetContentsWithOneOfMetaTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonsWithAllMetaTags(org.eclipse.emf.common.util.EList) <em>Get Persons With All Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons With All Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonsWithAllMetaTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetPersonsWithAllMetaTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getPersonsWithOneOfMetaTags(org.eclipse.emf.common.util.EList) <em>Get Persons With One Of Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons With One Of Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getPersonsWithOneOfMetaTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetPersonsWithOneOfMetaTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getOrganisationsWithAllMetaTags(org.eclipse.emf.common.util.EList) <em>Get Organisations With All Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations With All Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getOrganisationsWithAllMetaTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetOrganisationsWithAllMetaTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getOrganisationsWithOneOfMetaTags(org.eclipse.emf.common.util.EList) <em>Get Organisations With One Of Meta Tags</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations With One Of Meta Tags</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getOrganisationsWithOneOfMetaTags(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getDataSet__GetOrganisationsWithOneOfMetaTags__EList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getEvents() <em>Get Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Events</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getEvents()
	 * @generated
	 */
	EOperation getDataSet__GetEvents();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#searchByQuery(java.lang.String) <em>Search By Query</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search By Query</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#searchByQuery(java.lang.String)
	 * @generated
	 */
	EOperation getDataSet__SearchByQuery__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getIndoorLocations() <em>Get Indoor Locations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Indoor Locations</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getIndoorLocations()
	 * @generated
	 */
	EOperation getDataSet__GetIndoorLocations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getItemsExceptIdentifiers() <em>Get Items Except Identifiers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Items Except Identifiers</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemsExceptIdentifiers()
	 * @generated
	 */
	EOperation getDataSet__GetItemsExceptIdentifiers();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getIdentsOfDeletedItems() <em>Get Idents Of Deleted Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Idents Of Deleted Items</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getIdentsOfDeletedItems()
	 * @generated
	 */
	EOperation getDataSet__GetIdentsOfDeletedItems();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getItemsDeletedSince(java.util.Date) <em>Get Items Deleted Since</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Items Deleted Since</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemsDeletedSince(java.util.Date)
	 * @generated
	 */
	EOperation getDataSet__GetItemsDeletedSince__Date();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getIdentsOfItemsDeletedSince(java.util.Date) <em>Get Idents Of Items Deleted Since</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Idents Of Items Deleted Since</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getIdentsOfItemsDeletedSince(java.util.Date)
	 * @generated
	 */
	EOperation getDataSet__GetIdentsOfItemsDeletedSince__Date();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#clearDeletedItemsList() <em>Clear Deleted Items List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clear Deleted Items List</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#clearDeletedItemsList()
	 * @generated
	 */
	EOperation getDataSet__ClearDeletedItemsList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getDeletedItems() <em>Get Deleted Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Deleted Items</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getDeletedItems()
	 * @generated
	 */
	EOperation getDataSet__GetDeletedItems();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getItemsExceptIdentifiersCreatedSince(java.util.Date) <em>Get Items Except Identifiers Created Since</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Items Except Identifiers Created Since</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemsExceptIdentifiersCreatedSince(java.util.Date)
	 * @generated
	 */
	EOperation getDataSet__GetItemsExceptIdentifiersCreatedSince__Date();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#getItemsExceptIdentifiersModifiedSince(java.util.Date) <em>Get Items Except Identifiers Modified Since</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Items Except Identifiers Modified Since</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#getItemsExceptIdentifiersModifiedSince(java.util.Date)
	 * @generated
	 */
	EOperation getDataSet__GetItemsExceptIdentifiersModifiedSince__Date();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.DataSet#reloadAllAttachmentFiles() <em>Reload All Attachment Files</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reload All Attachment Files</em>' operation.
	 * @see org.sociotech.communitymashup.data.DataSet#reloadAllAttachmentFiles()
	 * @generated
	 */
	EOperation getDataSet__ReloadAllAttachmentFiles();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.sociotech.communitymashup.data.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the container reference '{@link org.sociotech.communitymashup.data.Item#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data Set</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getDataSet()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_DataSet();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Item#getIdent <em>Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ident</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getIdent()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Ident();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Item#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getUri()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Item#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getStringValue()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_StringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Item#getStringXML <em>String XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String XML</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getStringXML()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_StringXML();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Item#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getLastModified()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_LastModified();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Item#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getCreated()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Created();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Item#getMetaTags <em>Meta Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Tags</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getMetaTags()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_MetaTags();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Item#getIdentifiedBy <em>Identified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Identified By</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getIdentifiedBy()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_IdentifiedBy();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Item#getDeleteOnDelete <em>Delete On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delete On Delete</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getDeleteOnDelete()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_DeleteOnDelete();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Item#getDeletedIfDeleted <em>Deleted If Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deleted If Deleted</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getDeletedIfDeleted()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_DeletedIfDeleted();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Item#getForcedDeleteOnDelete <em>Forced Delete On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forced Delete On Delete</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getForcedDeleteOnDelete()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_ForcedDeleteOnDelete();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Item#getForcedDeletedIfDeleted <em>Forced Deleted If Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forced Deleted If Deleted</em>'.
	 * @see org.sociotech.communitymashup.data.Item#getForcedDeletedIfDeleted()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_ForcedDeletedIfDeleted();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#log(java.lang.String) <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#log(java.lang.String)
	 * @generated
	 */
	EOperation getItem__Log__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#log(java.lang.String, java.lang.Integer) <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#log(java.lang.String, java.lang.Integer)
	 * @generated
	 */
	EOperation getItem__Log__String_Integer();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#metaTag(java.lang.String) <em>Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#metaTag(java.lang.String)
	 * @generated
	 */
	EOperation getItem__MetaTag__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#identifyBy(java.lang.String, java.lang.String) <em>Identify By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Identify By</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#identifyBy(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getItem__IdentifyBy__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#getIdentifier(java.lang.String) <em>Get Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Identifier</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#getIdentifier(java.lang.String)
	 * @generated
	 */
	EOperation getItem__GetIdentifier__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#hasMetaTag(java.lang.String) <em>Has Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#hasMetaTag(java.lang.String)
	 * @generated
	 */
	EOperation getItem__HasMetaTag__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#matchesSearch(java.lang.String) <em>Matches Search</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Matches Search</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#matchesSearch(java.lang.String)
	 * @generated
	 */
	EOperation getItem__MatchesSearch__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#delete() <em>Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#delete()
	 * @generated
	 */
	EOperation getItem__Delete();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#isEqualItem(org.sociotech.communitymashup.data.Item) <em>Is Equal Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Equal Item</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#isEqualItem(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getItem__IsEqualItem__Item();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#getCreatedPrettyInLanguage(java.lang.String) <em>Get Created Pretty In Language</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Created Pretty In Language</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#getCreatedPrettyInLanguage(java.lang.String)
	 * @generated
	 */
	EOperation getItem__GetCreatedPrettyInLanguage__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#getCreatedPretty() <em>Get Created Pretty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Created Pretty</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#getCreatedPretty()
	 * @generated
	 */
	EOperation getItem__GetCreatedPretty();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#getLastModifiedPrettyInLanguage(java.lang.String) <em>Get Last Modified Pretty In Language</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Modified Pretty In Language</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#getLastModifiedPrettyInLanguage(java.lang.String)
	 * @generated
	 */
	EOperation getItem__GetLastModifiedPrettyInLanguage__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#getLastModifiedPretty() <em>Get Last Modified Pretty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Modified Pretty</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#getLastModifiedPretty()
	 * @generated
	 */
	EOperation getItem__GetLastModifiedPretty();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#deleteOnDeleteOf(org.sociotech.communitymashup.data.Item) <em>Delete On Delete Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete On Delete Of</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#deleteOnDeleteOf(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getItem__DeleteOnDeleteOf__Item();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#deleteIfEmptyOnDelete() <em>Delete If Empty On Delete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete If Empty On Delete</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#deleteIfEmptyOnDelete()
	 * @generated
	 */
	EOperation getItem__DeleteIfEmptyOnDelete();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#update(org.sociotech.communitymashup.data.Item) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#update(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getItem__Update__Item();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#forceUpdate(org.sociotech.communitymashup.data.Item) <em>Force Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Force Update</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#forceUpdate(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getItem__ForceUpdate__Item();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#unMetaTag(java.lang.String) <em>Un Meta Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Un Meta Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#unMetaTag(java.lang.String)
	 * @generated
	 */
	EOperation getItem__UnMetaTag__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#removeIdentifier(java.lang.String) <em>Remove Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Identifier</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#removeIdentifier(java.lang.String)
	 * @generated
	 */
	EOperation getItem__RemoveIdentifier__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Item#forceDeleteOnDeleteOf(org.sociotech.communitymashup.data.Item) <em>Force Delete On Delete Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Force Delete On Delete Of</em>' operation.
	 * @see org.sociotech.communitymashup.data.Item#forceDeleteOnDeleteOf(org.sociotech.communitymashup.data.Item)
	 * @generated
	 */
	EOperation getItem__ForceDeleteOnDeleteOf__Item();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.sociotech.communitymashup.data.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Extension#tag(java.lang.String) <em>Tag</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tag</em>' operation.
	 * @see org.sociotech.communitymashup.data.Extension#tag(java.lang.String)
	 * @generated
	 */
	EOperation getExtension__Tag__String();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see org.sociotech.communitymashup.data.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Classification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.sociotech.communitymashup.data.Classification#getName()
	 * @see #getClassification()
	 * @generated
	 */
	EAttribute getClassification_Name();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Classification#getPersons() <em>Get Persons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons</em>' operation.
	 * @see org.sociotech.communitymashup.data.Classification#getPersons()
	 * @generated
	 */
	EOperation getClassification__GetPersons();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Classification#getContents() <em>Get Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents</em>' operation.
	 * @see org.sociotech.communitymashup.data.Classification#getContents()
	 * @generated
	 */
	EOperation getClassification__GetContents();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Classification#getOrganisations() <em>Get Organisations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations</em>' operation.
	 * @see org.sociotech.communitymashup.data.Classification#getOrganisations()
	 * @generated
	 */
	EOperation getClassification__GetOrganisations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Classification#getCount() <em>Get Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count</em>' operation.
	 * @see org.sociotech.communitymashup.data.Classification#getCount()
	 * @generated
	 */
	EOperation getClassification__GetCount();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Classification#getPersonsCount() <em>Get Persons Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons Count</em>' operation.
	 * @see org.sociotech.communitymashup.data.Classification#getPersonsCount()
	 * @generated
	 */
	EOperation getClassification__GetPersonsCount();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Classification#getContentsCount() <em>Get Contents Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents Count</em>' operation.
	 * @see org.sociotech.communitymashup.data.Classification#getContentsCount()
	 * @generated
	 */
	EOperation getClassification__GetContentsCount();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Classification#getOrganisationsCount() <em>Get Organisations Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Organisations Count</em>' operation.
	 * @see org.sociotech.communitymashup.data.Classification#getOrganisationsCount()
	 * @generated
	 */
	EOperation getClassification__GetOrganisationsCount();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Classification#getSlug() <em>Get Slug</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Slug</em>' operation.
	 * @see org.sociotech.communitymashup.data.Classification#getSlug()
	 * @generated
	 */
	EOperation getClassification__GetSlug();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.sociotech.communitymashup.data.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Category#getCategorized <em>Categorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categorized</em>'.
	 * @see org.sociotech.communitymashup.data.Category#getCategorized()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Categorized();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.Category#getParentCategory <em>Parent Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Category</em>'.
	 * @see org.sociotech.communitymashup.data.Category#getParentCategory()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_ParentCategory();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Category#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Categories</em>'.
	 * @see org.sociotech.communitymashup.data.Category#getCategories()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Categories();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Category#getMainCategorized <em>Main Categorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Main Categorized</em>'.
	 * @see org.sociotech.communitymashup.data.Category#getMainCategorized()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_MainCategorized();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.sociotech.communitymashup.data.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Tag#getTagged <em>Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tagged</em>'.
	 * @see org.sociotech.communitymashup.data.Tag#getTagged()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Tagged();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Organisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisation</em>'.
	 * @see org.sociotech.communitymashup.data.Organisation
	 * @generated
	 */
	EClass getOrganisation();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.Organisation#getParentOrganisation <em>Parent Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Organisation</em>'.
	 * @see org.sociotech.communitymashup.data.Organisation#getParentOrganisation()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_ParentOrganisation();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.Organisation#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leader</em>'.
	 * @see org.sociotech.communitymashup.data.Organisation#getLeader()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Leader();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Organisation#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see org.sociotech.communitymashup.data.Organisation#getParticipants()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Participants();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Organisation#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Organisations</em>'.
	 * @see org.sociotech.communitymashup.data.Organisation#getOrganisations()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Organisations();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Organisation#getPersons() <em>Get Persons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Persons</em>' operation.
	 * @see org.sociotech.communitymashup.data.Organisation#getPersons()
	 * @generated
	 */
	EOperation getOrganisation__GetPersons();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Organisation#getContents() <em>Get Contents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contents</em>' operation.
	 * @see org.sociotech.communitymashup.data.Organisation#getContents()
	 * @generated
	 */
	EOperation getOrganisation__GetContents();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Organisation#addParticipant(org.sociotech.communitymashup.data.Person) <em>Add Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Participant</em>' operation.
	 * @see org.sociotech.communitymashup.data.Organisation#addParticipant(org.sociotech.communitymashup.data.Person)
	 * @generated
	 */
	EOperation getOrganisation__AddParticipant__Person();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.MetaTag <em>Meta Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Tag</em>'.
	 * @see org.sociotech.communitymashup.data.MetaTag
	 * @generated
	 */
	EClass getMetaTag();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.MetaTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.sociotech.communitymashup.data.MetaTag#getName()
	 * @see #getMetaTag()
	 * @generated
	 */
	EAttribute getMetaTag_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.MetaTag#getMetaTagged <em>Meta Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meta Tagged</em>'.
	 * @see org.sociotech.communitymashup.data.MetaTag#getMetaTagged()
	 * @see #getMetaTag()
	 * @generated
	 */
	EReference getMetaTag_MetaTagged();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.MetaTag#getWebAccounts() <em>Get Web Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Web Accounts</em>' operation.
	 * @see org.sociotech.communitymashup.data.MetaTag#getWebAccounts()
	 * @generated
	 */
	EOperation getMetaTag__GetWebAccounts();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.MetaTag#getInformationObjects() <em>Get Information Objects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects</em>' operation.
	 * @see org.sociotech.communitymashup.data.MetaTag#getInformationObjects()
	 * @generated
	 */
	EOperation getMetaTag__GetInformationObjects();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.MetaTag#getExtensions() <em>Get Extensions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Extensions</em>' operation.
	 * @see org.sociotech.communitymashup.data.MetaTag#getExtensions()
	 * @generated
	 */
	EOperation getMetaTag__GetExtensions();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.MetaTag#getCount() <em>Get Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Count</em>' operation.
	 * @see org.sociotech.communitymashup.data.MetaTag#getCount()
	 * @generated
	 */
	EOperation getMetaTag__GetCount();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.MetaTag#getInformationObjectsCount() <em>Get Information Objects Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Information Objects Count</em>' operation.
	 * @see org.sociotech.communitymashup.data.MetaTag#getInformationObjectsCount()
	 * @generated
	 */
	EOperation getMetaTag__GetInformationObjectsCount();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Phone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phone</em>'.
	 * @see org.sociotech.communitymashup.data.Phone
	 * @generated
	 */
	EClass getPhone();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Phone#getAreaCode <em>Area Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area Code</em>'.
	 * @see org.sociotech.communitymashup.data.Phone#getAreaCode()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_AreaCode();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Phone#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see org.sociotech.communitymashup.data.Phone#getCountryCode()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Phone#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.sociotech.communitymashup.data.Phone#getNumber()
	 * @see #getPhone()
	 * @generated
	 */
	EAttribute getPhone_Number();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.InstantMessenger <em>Instant Messenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant Messenger</em>'.
	 * @see org.sociotech.communitymashup.data.InstantMessenger
	 * @generated
	 */
	EClass getInstantMessenger();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.InstantMessenger#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.sociotech.communitymashup.data.InstantMessenger#getUsername()
	 * @see #getInstantMessenger()
	 * @generated
	 */
	EAttribute getInstantMessenger_Username();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Email <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email</em>'.
	 * @see org.sociotech.communitymashup.data.Email
	 * @generated
	 */
	EClass getEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Email#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see org.sociotech.communitymashup.data.Email#getAdress()
	 * @see #getEmail()
	 * @generated
	 */
	EAttribute getEmail_Adress();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.WebAccount <em>Web Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Account</em>'.
	 * @see org.sociotech.communitymashup.data.WebAccount
	 * @generated
	 */
	EClass getWebAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.WebAccount#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.sociotech.communitymashup.data.WebAccount#getUsername()
	 * @see #getWebAccount()
	 * @generated
	 */
	EAttribute getWebAccount_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.WebAccount#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.sociotech.communitymashup.data.WebAccount#getService()
	 * @see #getWebAccount()
	 * @generated
	 */
	EAttribute getWebAccount_Service();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.WebSite <em>Web Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Site</em>'.
	 * @see org.sociotech.communitymashup.data.WebSite
	 * @generated
	 */
	EClass getWebSite();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.WebSite#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see org.sociotech.communitymashup.data.WebSite#getAdress()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_Adress();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.WebSite#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.sociotech.communitymashup.data.WebSite#getTitle()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.WebSite#getShortenedUrl <em>Shortened Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shortened Url</em>'.
	 * @see org.sociotech.communitymashup.data.WebSite#getShortenedUrl()
	 * @see #getWebSite()
	 * @generated
	 */
	EAttribute getWebSite_ShortenedUrl();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Ranking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking</em>'.
	 * @see org.sociotech.communitymashup.data.Ranking
	 * @generated
	 */
	EClass getRanking();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Ranking#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.sociotech.communitymashup.data.Ranking#getDate()
	 * @see #getRanking()
	 * @generated
	 */
	EAttribute getRanking_Date();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.Ranking#getRanker <em>Ranker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ranker</em>'.
	 * @see org.sociotech.communitymashup.data.Ranking#getRanker()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_Ranker();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see org.sociotech.communitymashup.data.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Attachment#getFileUrl <em>File Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Url</em>'.
	 * @see org.sociotech.communitymashup.data.Attachment#getFileUrl()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_FileUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Attachment#getCachedFileUrl <em>Cached File Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached File Url</em>'.
	 * @see org.sociotech.communitymashup.data.Attachment#getCachedFileUrl()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_CachedFileUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Attachment#getCachedOnly <em>Cached Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached Only</em>'.
	 * @see org.sociotech.communitymashup.data.Attachment#getCachedOnly()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_CachedOnly();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Attachment#getFileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension</em>'.
	 * @see org.sociotech.communitymashup.data.Attachment#getFileExtension()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_FileExtension();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Attachment#getFileIdentifier <em>File Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Identifier</em>'.
	 * @see org.sociotech.communitymashup.data.Attachment#getFileIdentifier()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_FileIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Attachment#getCachedFileName <em>Cached File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cached File Name</em>'.
	 * @see org.sociotech.communitymashup.data.Attachment#getCachedFileName()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_CachedFileName();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Attachment#getNoCache <em>No Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Cache</em>'.
	 * @see org.sociotech.communitymashup.data.Attachment#getNoCache()
	 * @see #getAttachment()
	 * @generated
	 */
	EAttribute getAttachment_NoCache();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Attachment#getOriginalFileUrl() <em>Get Original File Url</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Original File Url</em>' operation.
	 * @see org.sociotech.communitymashup.data.Attachment#getOriginalFileUrl()
	 * @generated
	 */
	EOperation getAttachment__GetOriginalFileUrl();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Attachment#reloadFile() <em>Reload File</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reload File</em>' operation.
	 * @see org.sociotech.communitymashup.data.Attachment#reloadFile()
	 * @generated
	 */
	EOperation getAttachment__ReloadFile();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see org.sociotech.communitymashup.data.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Location#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see org.sociotech.communitymashup.data.Location#getStreet()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Street();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Location#getHouseNumber <em>House Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>House Number</em>'.
	 * @see org.sociotech.communitymashup.data.Location#getHouseNumber()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_HouseNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Location#getZipCode <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Code</em>'.
	 * @see org.sociotech.communitymashup.data.Location#getZipCode()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_ZipCode();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Location#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see org.sociotech.communitymashup.data.Location#getCountry()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Country();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Location#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see org.sociotech.communitymashup.data.Location#getLongitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Location#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see org.sociotech.communitymashup.data.Location#getLatitude()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Location#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see org.sociotech.communitymashup.data.Location#getCity()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_City();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Location#getIndoorLocations <em>Indoor Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Indoor Locations</em>'.
	 * @see org.sociotech.communitymashup.data.Location#getIndoorLocations()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_IndoorLocations();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Location#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.sociotech.communitymashup.data.Location#getState()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_State();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.sociotech.communitymashup.data.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Image#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.sociotech.communitymashup.data.Image#getWidth()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Image#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.sociotech.communitymashup.data.Image#getHeight()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Height();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.sociotech.communitymashup.data.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.StarRanking <em>Star Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Star Ranking</em>'.
	 * @see org.sociotech.communitymashup.data.StarRanking
	 * @generated
	 */
	EClass getStarRanking();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.StarRanking#getRankedInformationObject <em>Ranked Information Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ranked Information Object</em>'.
	 * @see org.sociotech.communitymashup.data.StarRanking#getRankedInformationObject()
	 * @see #getStarRanking()
	 * @generated
	 */
	EReference getStarRanking_RankedInformationObject();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.StarRanking#getNormalizedValue <em>Normalized Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normalized Value</em>'.
	 * @see org.sociotech.communitymashup.data.StarRanking#getNormalizedValue()
	 * @see #getStarRanking()
	 * @generated
	 */
	EAttribute getStarRanking_NormalizedValue();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.ViewRanking <em>View Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Ranking</em>'.
	 * @see org.sociotech.communitymashup.data.ViewRanking
	 * @generated
	 */
	EClass getViewRanking();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.ViewRanking#getRankedInformationObject <em>Ranked Information Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ranked Information Object</em>'.
	 * @see org.sociotech.communitymashup.data.ViewRanking#getRankedInformationObject()
	 * @see #getViewRanking()
	 * @generated
	 */
	EReference getViewRanking_RankedInformationObject();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.ThumbRanking <em>Thumb Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thumb Ranking</em>'.
	 * @see org.sociotech.communitymashup.data.ThumbRanking
	 * @generated
	 */
	EClass getThumbRanking();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.ThumbRanking#getRankedInformationObject <em>Ranked Information Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ranked Information Object</em>'.
	 * @see org.sociotech.communitymashup.data.ThumbRanking#getRankedInformationObject()
	 * @see #getThumbRanking()
	 * @generated
	 */
	EReference getThumbRanking_RankedInformationObject();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.ThumbRanking#isThumbUp() <em>Is Thumb Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Thumb Up</em>' operation.
	 * @see org.sociotech.communitymashup.data.ThumbRanking#isThumbUp()
	 * @generated
	 */
	EOperation getThumbRanking__IsThumbUp();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.ThumbRanking#isThumbDown() <em>Is Thumb Down</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Thumb Down</em>' operation.
	 * @see org.sociotech.communitymashup.data.ThumbRanking#isThumbDown()
	 * @generated
	 */
	EOperation getThumbRanking__IsThumbDown();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.sociotech.communitymashup.data.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Transformation#getTransformed <em>Transformed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformed</em>'.
	 * @see org.sociotech.communitymashup.data.Transformation#getTransformed()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Transformed();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see org.sociotech.communitymashup.data.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.sociotech.communitymashup.data.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.Connection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.sociotech.communitymashup.data.Connection#getFrom()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_From();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.Connection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.sociotech.communitymashup.data.Connection#getTo()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_To();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see org.sociotech.communitymashup.data.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Binary#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see org.sociotech.communitymashup.data.Binary#getBytes()
	 * @see #getBinary()
	 * @generated
	 */
	EAttribute getBinary_Bytes();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.MetaInformation <em>Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Information</em>'.
	 * @see org.sociotech.communitymashup.data.MetaInformation
	 * @generated
	 */
	EClass getMetaInformation();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.MetaInformation#getInformationObjects <em>Information Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Information Objects</em>'.
	 * @see org.sociotech.communitymashup.data.MetaInformation#getInformationObjects()
	 * @see #getMetaInformation()
	 * @generated
	 */
	EReference getMetaInformation_InformationObjects();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.IndoorLocation <em>Indoor Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indoor Location</em>'.
	 * @see org.sociotech.communitymashup.data.IndoorLocation
	 * @generated
	 */
	EClass getIndoorLocation();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.IndoorLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see org.sociotech.communitymashup.data.IndoorLocation#getLocation()
	 * @see #getIndoorLocation()
	 * @generated
	 */
	EReference getIndoorLocation_Location();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.IndoorLocation#getParentIndoorLocation <em>Parent Indoor Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Indoor Location</em>'.
	 * @see org.sociotech.communitymashup.data.IndoorLocation#getParentIndoorLocation()
	 * @see #getIndoorLocation()
	 * @generated
	 */
	EReference getIndoorLocation_ParentIndoorLocation();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.IndoorLocation#getIndoorLocations <em>Indoor Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Indoor Locations</em>'.
	 * @see org.sociotech.communitymashup.data.IndoorLocation#getIndoorLocations()
	 * @see #getIndoorLocation()
	 * @generated
	 */
	EReference getIndoorLocation_IndoorLocations();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.IndoorLocation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.sociotech.communitymashup.data.IndoorLocation#getName()
	 * @see #getIndoorLocation()
	 * @generated
	 */
	EAttribute getIndoorLocation_Name();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see org.sociotech.communitymashup.data.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Identifier#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.sociotech.communitymashup.data.Identifier#getKey()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Identifier#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.sociotech.communitymashup.data.Identifier#getValue()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Value();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.data.Identifier#getIdentified <em>Identified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identified</em>'.
	 * @see org.sociotech.communitymashup.data.Identifier#getIdentified()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Identified();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see org.sociotech.communitymashup.data.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.Event#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.sociotech.communitymashup.data.Event#getDate()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Date();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Event#getDatePrettyInLanguage(java.lang.String) <em>Get Date Pretty In Language</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Date Pretty In Language</em>' operation.
	 * @see org.sociotech.communitymashup.data.Event#getDatePrettyInLanguage(java.lang.String)
	 * @generated
	 */
	EOperation getEvent__GetDatePrettyInLanguage__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.data.Event#getDatePretty() <em>Get Date Pretty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Date Pretty</em>' operation.
	 * @see org.sociotech.communitymashup.data.Event#getDatePretty()
	 * @generated
	 */
	EOperation getEvent__GetDatePretty();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.DeletedItem <em>Deleted Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deleted Item</em>'.
	 * @see org.sociotech.communitymashup.data.DeletedItem
	 * @generated
	 */
	EClass getDeletedItem();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.DeletedItem#getDeleted <em>Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted</em>'.
	 * @see org.sociotech.communitymashup.data.DeletedItem#getDeleted()
	 * @see #getDeletedItem()
	 * @generated
	 */
	EAttribute getDeletedItem_Deleted();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.data.DeletedItem#getIdentOfDeleted <em>Ident Of Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ident Of Deleted</em>'.
	 * @see org.sociotech.communitymashup.data.DeletedItem#getIdentOfDeleted()
	 * @see #getDeletedItem()
	 * @generated
	 */
	EAttribute getDeletedItem_IdentOfDeleted();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.PersonImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LASTNAME = eINSTANCE.getPerson_Lastname();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRSTNAME = eINSTANCE.getPerson_Firstname();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PERSONS = eINSTANCE.getPerson_Persons();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__TITLE = eINSTANCE.getPerson_Title();

		/**
		 * The meta object literal for the '<em><b>Ranked</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__RANKED = eINSTANCE.getPerson_Ranked();

		/**
		 * The meta object literal for the '<em><b>Get Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___GET_CONTENTS = eINSTANCE.getPerson__GetContents();

		/**
		 * The meta object literal for the '<em><b>Get Organisations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___GET_ORGANISATIONS = eINSTANCE.getPerson__GetOrganisations();

		/**
		 * The meta object literal for the '<em><b>Add Contributed Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___ADD_CONTRIBUTED_CONTENT__CONTENT = eINSTANCE.getPerson__AddContributedContent__Content();

		/**
		 * The meta object literal for the '<em><b>Add Authored Content</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___ADD_AUTHORED_CONTENT__CONTENT = eINSTANCE.getPerson__AddAuthoredContent__Content();

		/**
		 * The meta object literal for the '<em><b>Parse First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___PARSE_FIRST_NAME = eINSTANCE.getPerson__ParseFirstName();

		/**
		 * The meta object literal for the '<em><b>Parse Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSON___PARSE_LAST_NAME = eINSTANCE.getPerson__ParseLastName();

		/**
		 * The meta object literal for the '<em><b>Leader Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__LEADER_OF = eINSTANCE.getPerson_LeaderOf();

		/**
		 * The meta object literal for the '<em><b>Participates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__PARTICIPATES = eINSTANCE.getPerson_Participates();

		/**
		 * The meta object literal for the '<em><b>Authored</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__AUTHORED = eINSTANCE.getPerson_Authored();

		/**
		 * The meta object literal for the '<em><b>Contributed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CONTRIBUTED = eINSTANCE.getPerson_Contributed();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DATE_OF_BIRTH = eINSTANCE.getPerson_DateOfBirth();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl <em>Information Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.InformationObjectImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getInformationObject()
		 * @generated
		 */
		EClass INFORMATION_OBJECT = eINSTANCE.getInformationObject();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_OBJECT__CATEGORIES = eINSTANCE.getInformationObject_Categories();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_OBJECT__TAGS = eINSTANCE.getInformationObject_Tags();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_OBJECT__IMAGES = eINSTANCE.getInformationObject_Images();

		/**
		 * The meta object literal for the '<em><b>Star Rankings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_OBJECT__STAR_RANKINGS = eINSTANCE.getInformationObject_StarRankings();

		/**
		 * The meta object literal for the '<em><b>Thumb Rankings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_OBJECT__THUMB_RANKINGS = eINSTANCE.getInformationObject_ThumbRankings();

		/**
		 * The meta object literal for the '<em><b>View Rankings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_OBJECT__VIEW_RANKINGS = eINSTANCE.getInformationObject_ViewRankings();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_OBJECT__NAME = eINSTANCE.getInformationObject_Name();

		/**
		 * The meta object literal for the '<em><b>Connected To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_OBJECT__CONNECTED_TO = eINSTANCE.getInformationObject_ConnectedTo();

		/**
		 * The meta object literal for the '<em><b>Connected By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_OBJECT__CONNECTED_BY = eINSTANCE.getInformationObject_ConnectedBy();

		/**
		 * The meta object literal for the '<em><b>Binaries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_OBJECT__BINARIES = eINSTANCE.getInformationObject_Binaries();

		/**
		 * The meta object literal for the '<em><b>Main Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_OBJECT__MAIN_CATEGORY = eINSTANCE.getInformationObject_MainCategory();

		/**
		 * The meta object literal for the '<em><b>Meta Informations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_OBJECT__META_INFORMATIONS = eINSTANCE.getInformationObject_MetaInformations();

		/**
		 * The meta object literal for the '<em><b>Alternative Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_OBJECT__ALTERNATIVE_NAMES = eINSTANCE.getInformationObject_AlternativeNames();

		/**
		 * The meta object literal for the '<em><b>Verified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_OBJECT__VERIFIED_NAME = eINSTANCE.getInformationObject_VerifiedName();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___TAG__STRING = eINSTANCE.getInformationObject__Tag__String();

		/**
		 * The meta object literal for the '<em><b>Categorize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___CATEGORIZE__STRING = eINSTANCE.getInformationObject__Categorize__String();

		/**
		 * The meta object literal for the '<em><b>Attach Image</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___ATTACH_IMAGE__STRING = eINSTANCE.getInformationObject__AttachImage__String();

		/**
		 * The meta object literal for the '<em><b>Get Attachments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_ATTACHMENTS = eINSTANCE.getInformationObject__GetAttachments();

		/**
		 * The meta object literal for the '<em><b>Star Rank</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___STAR_RANK__INTEGER_INTEGER = eINSTANCE.getInformationObject__StarRank__Integer_Integer();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___VIEW = eINSTANCE.getInformationObject__View();

		/**
		 * The meta object literal for the '<em><b>Thumbs Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___THUMBS_UP = eINSTANCE.getInformationObject__ThumbsUp();

		/**
		 * The meta object literal for the '<em><b>Thumbs Down</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___THUMBS_DOWN = eINSTANCE.getInformationObject__ThumbsDown();

		/**
		 * The meta object literal for the '<em><b>Get Thumbs Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_THUMBS_UP = eINSTANCE.getInformationObject__GetThumbsUp();

		/**
		 * The meta object literal for the '<em><b>Get Thumbs Down</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_THUMBS_DOWN = eINSTANCE.getInformationObject__GetThumbsDown();

		/**
		 * The meta object literal for the '<em><b>Get Thumbs Up Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_THUMBS_UP_COUNT = eINSTANCE.getInformationObject__GetThumbsUpCount();

		/**
		 * The meta object literal for the '<em><b>Get Thumbs Down Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_THUMBS_DOWN_COUNT = eINSTANCE.getInformationObject__GetThumbsDownCount();

		/**
		 * The meta object literal for the '<em><b>Get Thumbs Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_THUMBS_COUNT = eINSTANCE.getInformationObject__GetThumbsCount();

		/**
		 * The meta object literal for the '<em><b>Get Views Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_VIEWS_COUNT = eINSTANCE.getInformationObject__GetViewsCount();

		/**
		 * The meta object literal for the '<em><b>Get Star Ranking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_STAR_RANKING = eINSTANCE.getInformationObject__GetStarRanking();

		/**
		 * The meta object literal for the '<em><b>Extend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___EXTEND__METAINFORMATION = eINSTANCE.getInformationObject__Extend__MetaInformation();

		/**
		 * The meta object literal for the '<em><b>Get Web Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_WEB_ACCOUNTS = eINSTANCE.getInformationObject__GetWebAccounts();

		/**
		 * The meta object literal for the '<em><b>Get Web Sites</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_WEB_SITES = eINSTANCE.getInformationObject__GetWebSites();

		/**
		 * The meta object literal for the '<em><b>Get Phones</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_PHONES = eINSTANCE.getInformationObject__GetPhones();

		/**
		 * The meta object literal for the '<em><b>Get Locations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_LOCATIONS = eINSTANCE.getInformationObject__GetLocations();

		/**
		 * The meta object literal for the '<em><b>Get Emails</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_EMAILS = eINSTANCE.getInformationObject__GetEmails();

		/**
		 * The meta object literal for the '<em><b>Get Instant Messengers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_INSTANT_MESSENGERS = eINSTANCE.getInformationObject__GetInstantMessengers();

		/**
		 * The meta object literal for the '<em><b>Add Email Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___ADD_EMAIL_ADDRESS__STRING = eINSTANCE.getInformationObject__AddEmailAddress__String();

		/**
		 * The meta object literal for the '<em><b>Add Web Site</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___ADD_WEB_SITE__STRING = eINSTANCE.getInformationObject__AddWebSite__String();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects With Common Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_WITH_COMMON_TAGS = eINSTANCE.getInformationObject__GetInformationObjectsWithCommonTags();

		/**
		 * The meta object literal for the '<em><b>Add Web Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___ADD_WEB_ACCOUNT__STRING = eINSTANCE.getInformationObject__AddWebAccount__String();

		/**
		 * The meta object literal for the '<em><b>Has Images</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___HAS_IMAGES = eINSTANCE.getInformationObject__HasImages();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects Connected To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO = eINSTANCE.getInformationObject__GetInformationObjectsConnectedTo();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects Connected From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM = eINSTANCE.getInformationObject__GetInformationObjectsConnectedFrom();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects Connected</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED = eINSTANCE.getInformationObject__GetInformationObjectsConnected();

		/**
		 * The meta object literal for the '<em><b>Connect To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___CONNECT_TO__INFORMATIONOBJECT = eINSTANCE.getInformationObject__ConnectTo__InformationObject();

		/**
		 * The meta object literal for the '<em><b>Connect To With Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___CONNECT_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING = eINSTANCE.getInformationObject__ConnectToWithMetaTag__InformationObject_String();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects Connected To With Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO_WITH_META_TAG__STRING = eINSTANCE.getInformationObject__GetInformationObjectsConnectedToWithMetaTag__String();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects Connected From With Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM_WITH_META_TAG__STRING = eINSTANCE.getInformationObject__GetInformationObjectsConnectedFromWithMetaTag__String();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects Connected With Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_WITH_META_TAG__STRING = eINSTANCE.getInformationObject__GetInformationObjectsConnectedWithMetaTag__String();

		/**
		 * The meta object literal for the '<em><b>Get Connections From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_CONNECTIONS_FROM__INFORMATIONOBJECT = eINSTANCE.getInformationObject__GetConnectionsFrom__InformationObject();

		/**
		 * The meta object literal for the '<em><b>Get Connections To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_CONNECTIONS_TO__INFORMATIONOBJECT = eINSTANCE.getInformationObject__GetConnectionsTo__InformationObject();

		/**
		 * The meta object literal for the '<em><b>Connect To With Value And Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___CONNECT_TO_WITH_VALUE_AND_META_TAG__INFORMATIONOBJECT_STRING_STRING = eINSTANCE.getInformationObject__ConnectToWithValueAndMetaTag__InformationObject_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Connection To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_CONNECTION_TO__INFORMATIONOBJECT_STRING = eINSTANCE.getInformationObject__GetConnectionTo__InformationObject_String();

		/**
		 * The meta object literal for the '<em><b>Get Connection From</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_CONNECTION_FROM__INFORMATIONOBJECT_STRING = eINSTANCE.getInformationObject__GetConnectionFrom__InformationObject_String();

		/**
		 * The meta object literal for the '<em><b>Get Attachment With Url</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_ATTACHMENT_WITH_URL__STRING = eINSTANCE.getInformationObject__GetAttachmentWithUrl__String();

		/**
		 * The meta object literal for the '<em><b>Get Attached Image With Url</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_URL__STRING = eINSTANCE.getInformationObject__GetAttachedImageWithUrl__String();

		/**
		 * The meta object literal for the '<em><b>Add Phone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___ADD_PHONE__STRING = eINSTANCE.getInformationObject__AddPhone__String();

		/**
		 * The meta object literal for the '<em><b>Get Persons With Common Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_PERSONS_WITH_COMMON_TAGS = eINSTANCE.getInformationObject__GetPersonsWithCommonTags();

		/**
		 * The meta object literal for the '<em><b>Get Organisations With Common Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_ORGANISATIONS_WITH_COMMON_TAGS = eINSTANCE.getInformationObject__GetOrganisationsWithCommonTags();

		/**
		 * The meta object literal for the '<em><b>Get Contents With Common Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_CONTENTS_WITH_COMMON_TAGS = eINSTANCE.getInformationObject__GetContentsWithCommonTags();

		/**
		 * The meta object literal for the '<em><b>Un Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___UN_TAG__STRING = eINSTANCE.getInformationObject__UnTag__String();

		/**
		 * The meta object literal for the '<em><b>Un Categorize</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___UN_CATEGORIZE__STRING = eINSTANCE.getInformationObject__UnCategorize__String();

		/**
		 * The meta object literal for the '<em><b>Get Slug Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_SLUG_NAME = eINSTANCE.getInformationObject__GetSlugName();

		/**
		 * The meta object literal for the '<em><b>Get Connections To With Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_CONNECTIONS_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING = eINSTANCE.getInformationObject__GetConnectionsToWithMetaTag__InformationObject_String();

		/**
		 * The meta object literal for the '<em><b>Get Connections From With Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_CONNECTIONS_FROM_WITH_META_TAG__INFORMATIONOBJECT_STRING = eINSTANCE.getInformationObject__GetConnectionsFromWithMetaTag__InformationObject_String();

		/**
		 * The meta object literal for the '<em><b>Star Rank With Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG__INTEGER_INTEGER_STRING = eINSTANCE.getInformationObject__StarRankWithMetaTag__Integer_Integer_String();

		/**
		 * The meta object literal for the '<em><b>Add Alternative Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___ADD_ALTERNATIVE_NAME__STRING = eINSTANCE.getInformationObject__AddAlternativeName__String();

		/**
		 * The meta object literal for the '<em><b>Get Attached Image With Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG__METATAG = eINSTANCE.getInformationObject__GetAttachedImageWithMetaTag__MetaTag();

		/**
		 * The meta object literal for the '<em><b>Get Attached Image With Meta Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG_NAME__STRING = eINSTANCE.getInformationObject__GetAttachedImageWithMetaTagName__String();

		/**
		 * The meta object literal for the '<em><b>Star Rank With Meta Tag List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG_LIST__INTEGER_INTEGER_STRING = eINSTANCE.getInformationObject__StarRankWithMetaTagList__Integer_Integer_String();

		/**
		 * The meta object literal for the '<em><b>Add Web Account For Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___ADD_WEB_ACCOUNT_FOR_SERVICE__STRING_STRING = eINSTANCE.getInformationObject__AddWebAccountForService__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Attached Images Without Meta Tag Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG_NAME__STRING = eINSTANCE.getInformationObject__GetAttachedImagesWithoutMetaTagName__String();

		/**
		 * The meta object literal for the '<em><b>Get Attached Images Without Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_ATTACHED_IMAGES_WITHOUT_META_TAG__METATAG = eINSTANCE.getInformationObject__GetAttachedImagesWithoutMetaTag__MetaTag();

		/**
		 * The meta object literal for the '<em><b>Get Indoor Locations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_INDOOR_LOCATIONS = eINSTANCE.getInformationObject__GetIndoorLocations();

		/**
		 * The meta object literal for the '<em><b>Get Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INFORMATION_OBJECT___GET_EVENTS = eINSTANCE.getInformationObject__GetEvents();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.ContentImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CONTENTS = eINSTANCE.getContent_Contents();

		/**
		 * The meta object literal for the '<em><b>Contributors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__CONTRIBUTORS = eINSTANCE.getContent_Contributors();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__AUTHOR = eINSTANCE.getContent_Author();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__DOCUMENTS = eINSTANCE.getContent_Documents();

		/**
		 * The meta object literal for the '<em><b>Parent Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__PARENT_CONTENT = eINSTANCE.getContent_ParentContent();

		/**
		 * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__LOCALE = eINSTANCE.getContent_Locale();

		/**
		 * The meta object literal for the '<em><b>Transformations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__TRANSFORMATIONS = eINSTANCE.getContent_Transformations();

		/**
		 * The meta object literal for the '<em><b>Videos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__VIDEOS = eINSTANCE.getContent_Videos();

		/**
		 * The meta object literal for the '<em><b>Get Organisations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT___GET_ORGANISATIONS = eINSTANCE.getContent__GetOrganisations();

		/**
		 * The meta object literal for the '<em><b>Get Persons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT___GET_PERSONS = eINSTANCE.getContent__GetPersons();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT___COMMENT__STRING = eINSTANCE.getContent__Comment__String();

		/**
		 * The meta object literal for the '<em><b>Add Contributor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT___ADD_CONTRIBUTOR__PERSON = eINSTANCE.getContent__AddContributor__Person();

		/**
		 * The meta object literal for the '<em><b>Attach Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT___ATTACH_DOCUMENT__STRING = eINSTANCE.getContent__AttachDocument__String();

		/**
		 * The meta object literal for the '<em><b>Comment With Meta Tag List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTENT___COMMENT_WITH_META_TAG_LIST__STRING_STRING = eINSTANCE.getContent__CommentWithMetaTagList__String_String();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.DataSetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.DataSetImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getDataSet()
		 * @generated
		 */
		EClass DATA_SET = eINSTANCE.getDataSet();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__ITEMS = eINSTANCE.getDataSet_Items();

		/**
		 * The meta object literal for the '<em><b>Cache Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__CACHE_FOLDER = eINSTANCE.getDataSet_CacheFolder();

		/**
		 * The meta object literal for the '<em><b>Cache File Attachements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__CACHE_FILE_ATTACHEMENTS = eINSTANCE.getDataSet_CacheFileAttachements();

		/**
		 * The meta object literal for the '<em><b>Set Up</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__SET_UP = eINSTANCE.getDataSet_SetUp();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__LAST_MODIFIED = eINSTANCE.getDataSet_LastModified();

		/**
		 * The meta object literal for the '<em><b>Log Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__LOG_LEVEL = eINSTANCE.getDataSet_LogLevel();

		/**
		 * The meta object literal for the '<em><b>Ident Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__IDENT_COUNTER = eINSTANCE.getDataSet_IdentCounter();

		/**
		 * The meta object literal for the '<em><b>Ident Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__IDENT_PREFIX = eINSTANCE.getDataSet_IdentPrefix();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__CREATED = eINSTANCE.getDataSet_Created();

		/**
		 * The meta object literal for the '<em><b>Keep Deleted Items List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SET__KEEP_DELETED_ITEMS_LIST = eINSTANCE.getDataSet_KeepDeletedItemsList();

		/**
		 * The meta object literal for the '<em><b>Items Deleted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SET__ITEMS_DELETED = eINSTANCE.getDataSet_ItemsDeleted();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___ADD__ITEM = eINSTANCE.getDataSet__Add__Item();

		/**
		 * The meta object literal for the '<em><b>Get Items With String Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ITEMS_WITH_STRING_VALUE__STRING = eINSTANCE.getDataSet__GetItemsWithStringValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Persons With Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSONS_WITH_NAME__STRING = eINSTANCE.getDataSet__GetPersonsWithName__String();

		/**
		 * The meta object literal for the '<em><b>Get Persons With Lastname</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSONS_WITH_LASTNAME__STRING = eINSTANCE.getDataSet__GetPersonsWithLastname__String();

		/**
		 * The meta object literal for the '<em><b>Get Persons With First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSONS_WITH_FIRST_NAME__STRING = eINSTANCE.getDataSet__GetPersonsWithFirstName__String();

		/**
		 * The meta object literal for the '<em><b>Get Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_TAG__STRING = eINSTANCE.getDataSet__GetTag__String();

		/**
		 * The meta object literal for the '<em><b>Get Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_META_TAG__STRING = eINSTANCE.getDataSet__GetMetaTag__String();

		/**
		 * The meta object literal for the '<em><b>Get All Persons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ALL_PERSONS = eINSTANCE.getDataSet__GetAllPersons();

		/**
		 * The meta object literal for the '<em><b>Get All Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ALL_CONTENTS = eINSTANCE.getDataSet__GetAllContents();

		/**
		 * The meta object literal for the '<em><b>Get All Organisations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ALL_ORGANISATIONS = eINSTANCE.getDataSet__GetAllOrganisations();

		/**
		 * The meta object literal for the '<em><b>Get All Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ALL_CATEGORIES = eINSTANCE.getDataSet__GetAllCategories();

		/**
		 * The meta object literal for the '<em><b>Get Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CATEGORY__STRING = eINSTANCE.getDataSet__GetCategory__String();

		/**
		 * The meta object literal for the '<em><b>Get All Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ALL_TAGS = eINSTANCE.getDataSet__GetAllTags();

		/**
		 * The meta object literal for the '<em><b>Get Items Modified Since</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ITEMS_MODIFIED_SINCE__DATE = eINSTANCE.getDataSet__GetItemsModifiedSince__Date();

		/**
		 * The meta object literal for the '<em><b>Get All Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ALL_META_TAGS = eINSTANCE.getDataSet__GetAllMetaTags();

		/**
		 * The meta object literal for the '<em><b>Get All Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ALL_CONNECTIONS = eINSTANCE.getDataSet__GetAllConnections();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___LOG__STRING = eINSTANCE.getDataSet__Log__String();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___LOG__STRING_INTEGER = eINSTANCE.getDataSet__Log__String_Integer();

		/**
		 * The meta object literal for the '<em><b>Get Content With Ident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONTENT_WITH_IDENT__STRING = eINSTANCE.getDataSet__GetContentWithIdent__String();

		/**
		 * The meta object literal for the '<em><b>Get Person With Ident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSON_WITH_IDENT__STRING = eINSTANCE.getDataSet__GetPersonWithIdent__String();

		/**
		 * The meta object literal for the '<em><b>Get Organisation With Ident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ORGANISATION_WITH_IDENT__STRING = eINSTANCE.getDataSet__GetOrganisationWithIdent__String();

		/**
		 * The meta object literal for the '<em><b>Get Attachment With Ident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ATTACHMENT_WITH_IDENT__STRING = eINSTANCE.getDataSet__GetAttachmentWithIdent__String();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects With All Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INFORMATION_OBJECTS_WITH_ALL_CATEGORIES__ELIST = eINSTANCE.getDataSet__GetInformationObjectsWithAllCategories__EList();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects With One Of Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INFORMATION_OBJECTS_WITH_ONE_OF_CATEGORIES__ELIST = eINSTANCE.getDataSet__GetInformationObjectsWithOneOfCategories__EList();

		/**
		 * The meta object literal for the '<em><b>Get Contents With All Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONTENTS_WITH_ALL_CATEGORIES__ELIST = eINSTANCE.getDataSet__GetContentsWithAllCategories__EList();

		/**
		 * The meta object literal for the '<em><b>Get Contents With One Of Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONTENTS_WITH_ONE_OF_CATEGORIES__ELIST = eINSTANCE.getDataSet__GetContentsWithOneOfCategories__EList();

		/**
		 * The meta object literal for the '<em><b>Get Persons With All Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSONS_WITH_ALL_CATEGORIES__ELIST = eINSTANCE.getDataSet__GetPersonsWithAllCategories__EList();

		/**
		 * The meta object literal for the '<em><b>Get Persons With One Of Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSONS_WITH_ONE_OF_CATEGORIES__ELIST = eINSTANCE.getDataSet__GetPersonsWithOneOfCategories__EList();

		/**
		 * The meta object literal for the '<em><b>Get Organisations With All Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ORGANISATIONS_WITH_ALL_CATEGORIES__ELIST = eINSTANCE.getDataSet__GetOrganisationsWithAllCategories__EList();

		/**
		 * The meta object literal for the '<em><b>Get Organisations With One Of Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ORGANISATIONS_WITH_ONE_OF_CATEGORIES__ELIST = eINSTANCE.getDataSet__GetOrganisationsWithOneOfCategories__EList();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects With All Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INFORMATION_OBJECTS_WITH_ALL_TAGS__ELIST = eINSTANCE.getDataSet__GetInformationObjectsWithAllTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects With One Of Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INFORMATION_OBJECTS_WITH_ONE_OF_TAGS__ELIST = eINSTANCE.getDataSet__GetInformationObjectsWithOneOfTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Organisations With All Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ORGANISATIONS_WITH_ALL_TAGS__ELIST = eINSTANCE.getDataSet__GetOrganisationsWithAllTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Organisations With One Of Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ORGANISATIONS_WITH_ONE_OF_TAGS__ELIST = eINSTANCE.getDataSet__GetOrganisationsWithOneOfTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Persons With All Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSONS_WITH_ALL_TAGS__ELIST = eINSTANCE.getDataSet__GetPersonsWithAllTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Persons With One Of Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSONS_WITH_ONE_OF_TAGS__ELIST = eINSTANCE.getDataSet__GetPersonsWithOneOfTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Contents With All Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONTENTS_WITH_ALL_TAGS__ELIST = eINSTANCE.getDataSet__GetContentsWithAllTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Contents With One Of Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONTENTS_WITH_ONE_OF_TAGS__ELIST = eINSTANCE.getDataSet__GetContentsWithOneOfTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Contents With Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONTENTS_WITH_NAME__STRING = eINSTANCE.getDataSet__GetContentsWithName__String();

		/**
		 * The meta object literal for the '<em><b>Get Organisations With Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ORGANISATIONS_WITH_NAME__STRING = eINSTANCE.getDataSet__GetOrganisationsWithName__String();

		/**
		 * The meta object literal for the '<em><b>Get Items With All Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ITEMS_WITH_ALL_META_TAGS__ELIST = eINSTANCE.getDataSet__GetItemsWithAllMetaTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Items With One Of Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ITEMS_WITH_ONE_OF_META_TAGS__ELIST = eINSTANCE.getDataSet__GetItemsWithOneOfMetaTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Persons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSONS = eINSTANCE.getDataSet__GetPersons();

		/**
		 * The meta object literal for the '<em><b>Get Organisations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ORGANISATIONS = eINSTANCE.getDataSet__GetOrganisations();

		/**
		 * The meta object literal for the '<em><b>Get Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONTENTS = eINSTANCE.getDataSet__GetContents();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INFORMATION_OBJECTS = eINSTANCE.getDataSet__GetInformationObjects();

		/**
		 * The meta object literal for the '<em><b>Get Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_TAGS = eINSTANCE.getDataSet__GetTags();

		/**
		 * The meta object literal for the '<em><b>Get Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_META_TAGS = eINSTANCE.getDataSet__GetMetaTags();

		/**
		 * The meta object literal for the '<em><b>Get Attachments</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ATTACHMENTS = eINSTANCE.getDataSet__GetAttachments();

		/**
		 * The meta object literal for the '<em><b>Get Binaries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_BINARIES = eINSTANCE.getDataSet__GetBinaries();

		/**
		 * The meta object literal for the '<em><b>Get Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CATEGORIES = eINSTANCE.getDataSet__GetCategories();

		/**
		 * The meta object literal for the '<em><b>Get Classifications</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CLASSIFICATIONS = eINSTANCE.getDataSet__GetClassifications();

		/**
		 * The meta object literal for the '<em><b>Get Connections</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONNECTIONS = eINSTANCE.getDataSet__GetConnections();

		/**
		 * The meta object literal for the '<em><b>Get Documents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_DOCUMENTS = eINSTANCE.getDataSet__GetDocuments();

		/**
		 * The meta object literal for the '<em><b>Get Emails</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_EMAILS = eINSTANCE.getDataSet__GetEmails();

		/**
		 * The meta object literal for the '<em><b>Get Extensions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_EXTENSIONS = eINSTANCE.getDataSet__GetExtensions();

		/**
		 * The meta object literal for the '<em><b>Get Images</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_IMAGES = eINSTANCE.getDataSet__GetImages();

		/**
		 * The meta object literal for the '<em><b>Get Instant Messengers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INSTANT_MESSENGERS = eINSTANCE.getDataSet__GetInstantMessengers();

		/**
		 * The meta object literal for the '<em><b>Get Locations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_LOCATIONS = eINSTANCE.getDataSet__GetLocations();

		/**
		 * The meta object literal for the '<em><b>Get Meta Informations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_META_INFORMATIONS = eINSTANCE.getDataSet__GetMetaInformations();

		/**
		 * The meta object literal for the '<em><b>Get Phones</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PHONES = eINSTANCE.getDataSet__GetPhones();

		/**
		 * The meta object literal for the '<em><b>Get Rankings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_RANKINGS = eINSTANCE.getDataSet__GetRankings();

		/**
		 * The meta object literal for the '<em><b>Get Star Rankings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_STAR_RANKINGS = eINSTANCE.getDataSet__GetStarRankings();

		/**
		 * The meta object literal for the '<em><b>Get Thumb Rankings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_THUMB_RANKINGS = eINSTANCE.getDataSet__GetThumbRankings();

		/**
		 * The meta object literal for the '<em><b>Get Transformations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_TRANSFORMATIONS = eINSTANCE.getDataSet__GetTransformations();

		/**
		 * The meta object literal for the '<em><b>Get Videos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_VIDEOS = eINSTANCE.getDataSet__GetVideos();

		/**
		 * The meta object literal for the '<em><b>Get View Rankings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_VIEW_RANKINGS = eINSTANCE.getDataSet__GetViewRankings();

		/**
		 * The meta object literal for the '<em><b>Get Web Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_WEB_ACCOUNTS = eINSTANCE.getDataSet__GetWebAccounts();

		/**
		 * The meta object literal for the '<em><b>Get Web Sites</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_WEB_SITES = eINSTANCE.getDataSet__GetWebSites();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects With All Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INFORMATION_OBJECTS_WITH_ALL_META_TAGS__ELIST = eINSTANCE.getDataSet__GetInformationObjectsWithAllMetaTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects With One Of Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INFORMATION_OBJECTS_WITH_ONE_OF_META_TAGS__ELIST = eINSTANCE.getDataSet__GetInformationObjectsWithOneOfMetaTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Identifiers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_IDENTIFIERS = eINSTANCE.getDataSet__GetIdentifiers();

		/**
		 * The meta object literal for the '<em><b>Get Identifiers With Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_IDENTIFIERS_WITH_KEY__STRING = eINSTANCE.getDataSet__GetIdentifiersWithKey__String();

		/**
		 * The meta object literal for the '<em><b>Get Identifier With Key Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_IDENTIFIER_WITH_KEY_VALUE__STRING_STRING = eINSTANCE.getDataSet__GetIdentifierWithKeyValue__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Item With Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ITEM_WITH_IDENTIFIER__STRING_STRING = eINSTANCE.getDataSet__GetItemWithIdentifier__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Person With Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSON_WITH_IDENTIFIER__STRING_STRING = eINSTANCE.getDataSet__GetPersonWithIdentifier__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Content With Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONTENT_WITH_IDENTIFIER__STRING_STRING = eINSTANCE.getDataSet__GetContentWithIdentifier__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Organisation With Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ORGANISATION_WITH_IDENTIFIER__STRING_STRING = eINSTANCE.getDataSet__GetOrganisationWithIdentifier__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Location With Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_LOCATION_WITH_IDENTIFIER__STRING_STRING = eINSTANCE.getDataSet__GetLocationWithIdentifier__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Indoor Location With Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INDOOR_LOCATION_WITH_IDENTIFIER__STRING_STRING = eINSTANCE.getDataSet__GetIndoorLocationWithIdentifier__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Image With Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_IMAGE_WITH_IDENTIFIER__STRING_STRING = eINSTANCE.getDataSet__GetImageWithIdentifier__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Empty Item With Ident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_EMPTY_ITEM_WITH_IDENT__STRING = eINSTANCE.getDataSet__GetEmptyItemWithIdent__String();

		/**
		 * The meta object literal for the '<em><b>Get Tags With More Than XInformation Objects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_TAGS_WITH_MORE_THAN_XINFORMATION_OBJECTS__INTEGER = eINSTANCE.getDataSet__GetTagsWithMoreThanXInformationObjects__Integer();

		/**
		 * The meta object literal for the '<em><b>Get Items Created Since</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ITEMS_CREATED_SINCE__DATE = eINSTANCE.getDataSet__GetItemsCreatedSince__Date();

		/**
		 * The meta object literal for the '<em><b>Search Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___SEARCH_ITEMS__STRING = eINSTANCE.getDataSet__SearchItems__String();

		/**
		 * The meta object literal for the '<em><b>Search Information Objects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___SEARCH_INFORMATION_OBJECTS__STRING = eINSTANCE.getDataSet__SearchInformationObjects__String();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects With Attachment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INFORMATION_OBJECTS_WITH_ATTACHMENT__ATTACHMENT = eINSTANCE.getDataSet__GetInformationObjectsWithAttachment__Attachment();

		/**
		 * The meta object literal for the '<em><b>Get Persons With Attachment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSONS_WITH_ATTACHMENT__ATTACHMENT = eINSTANCE.getDataSet__GetPersonsWithAttachment__Attachment();

		/**
		 * The meta object literal for the '<em><b>Get Organisations With Attachment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ORGANISATIONS_WITH_ATTACHMENT__ATTACHMENT = eINSTANCE.getDataSet__GetOrganisationsWithAttachment__Attachment();

		/**
		 * The meta object literal for the '<em><b>Get Contents With Attachment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONTENTS_WITH_ATTACHMENT__ATTACHMENT = eINSTANCE.getDataSet__GetContentsWithAttachment__Attachment();

		/**
		 * The meta object literal for the '<em><b>Get Equal Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_EQUAL_ITEMS__ITEM = eINSTANCE.getDataSet__GetEqualItems__Item();

		/**
		 * The meta object literal for the '<em><b>Has Equal Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___HAS_EQUAL_ITEM__ITEM = eINSTANCE.getDataSet__HasEqualItem__Item();

		/**
		 * The meta object literal for the '<em><b>Get Items With Ident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ITEMS_WITH_IDENT__STRING = eINSTANCE.getDataSet__GetItemsWithIdent__String();

		/**
		 * The meta object literal for the '<em><b>Get Attachments With Cached File Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ATTACHMENTS_WITH_CACHED_FILE_NAME__STRING = eINSTANCE.getDataSet__GetAttachmentsWithCachedFileName__String();

		/**
		 * The meta object literal for the '<em><b>Get Events After</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_EVENTS_AFTER__DATE = eINSTANCE.getDataSet__GetEventsAfter__Date();

		/**
		 * The meta object literal for the '<em><b>Get Events Before</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_EVENTS_BEFORE__DATE = eINSTANCE.getDataSet__GetEventsBefore__Date();

		/**
		 * The meta object literal for the '<em><b>Get Events Between Dates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_EVENTS_BETWEEN_DATES__DATE_DATE = eINSTANCE.getDataSet__GetEventsBetweenDates__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Spicynodes Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_SPICYNODES_REPRESENTATION = eINSTANCE.getDataSet__GetSpicynodesRepresentation();

		/**
		 * The meta object literal for the '<em><b>Get Connections Between Information Objects Of Different Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONNECTIONS_BETWEEN_INFORMATION_OBJECTS_OF_DIFFERENT_CATEGORIES = eINSTANCE.getDataSet__GetConnectionsBetweenInformationObjectsOfDifferentCategories();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects Modified Since</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INFORMATION_OBJECTS_MODIFIED_SINCE__DATE = eINSTANCE.getDataSet__GetInformationObjectsModifiedSince__Date();

		/**
		 * The meta object literal for the '<em><b>Get Random XInformation Objects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_RANDOM_XINFORMATION_OBJECTS__INTEGER = eINSTANCE.getDataSet__GetRandomXInformationObjects__Integer();

		/**
		 * The meta object literal for the '<em><b>Get Random XContents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_RANDOM_XCONTENTS__INTEGER = eINSTANCE.getDataSet__GetRandomXContents__Integer();

		/**
		 * The meta object literal for the '<em><b>Get Random XPersons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_RANDOM_XPERSONS__INTEGER = eINSTANCE.getDataSet__GetRandomXPersons__Integer();

		/**
		 * The meta object literal for the '<em><b>Get Random XOrganisations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_RANDOM_XORGANISATIONS__INTEGER = eINSTANCE.getDataSet__GetRandomXOrganisations__Integer();

		/**
		 * The meta object literal for the '<em><b>Force Add</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___FORCE_ADD__ITEM = eINSTANCE.getDataSet__ForceAdd__Item();

		/**
		 * The meta object literal for the '<em><b>Get Idents Of Existing Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_IDENTS_OF_EXISTING_ITEMS = eINSTANCE.getDataSet__GetIdentsOfExistingItems();

		/**
		 * The meta object literal for the '<em><b>Get Category With Slug</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CATEGORY_WITH_SLUG__STRING = eINSTANCE.getDataSet__GetCategoryWithSlug__String();

		/**
		 * The meta object literal for the '<em><b>Rebuild Indexes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___REBUILD_INDEXES = eINSTANCE.getDataSet__RebuildIndexes();

		/**
		 * The meta object literal for the '<em><b>Get Contents With All Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONTENTS_WITH_ALL_META_TAGS__ELIST = eINSTANCE.getDataSet__GetContentsWithAllMetaTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Contents With One Of Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_CONTENTS_WITH_ONE_OF_META_TAGS__ELIST = eINSTANCE.getDataSet__GetContentsWithOneOfMetaTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Persons With All Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSONS_WITH_ALL_META_TAGS__ELIST = eINSTANCE.getDataSet__GetPersonsWithAllMetaTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Persons With One Of Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_PERSONS_WITH_ONE_OF_META_TAGS__ELIST = eINSTANCE.getDataSet__GetPersonsWithOneOfMetaTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Organisations With All Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ORGANISATIONS_WITH_ALL_META_TAGS__ELIST = eINSTANCE.getDataSet__GetOrganisationsWithAllMetaTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Organisations With One Of Meta Tags</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ORGANISATIONS_WITH_ONE_OF_META_TAGS__ELIST = eINSTANCE.getDataSet__GetOrganisationsWithOneOfMetaTags__EList();

		/**
		 * The meta object literal for the '<em><b>Get Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_EVENTS = eINSTANCE.getDataSet__GetEvents();

		/**
		 * The meta object literal for the '<em><b>Search By Query</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___SEARCH_BY_QUERY__STRING = eINSTANCE.getDataSet__SearchByQuery__String();

		/**
		 * The meta object literal for the '<em><b>Get Indoor Locations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_INDOOR_LOCATIONS = eINSTANCE.getDataSet__GetIndoorLocations();

		/**
		 * The meta object literal for the '<em><b>Get Items Except Identifiers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ITEMS_EXCEPT_IDENTIFIERS = eINSTANCE.getDataSet__GetItemsExceptIdentifiers();

		/**
		 * The meta object literal for the '<em><b>Get Idents Of Deleted Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_IDENTS_OF_DELETED_ITEMS = eINSTANCE.getDataSet__GetIdentsOfDeletedItems();

		/**
		 * The meta object literal for the '<em><b>Get Items Deleted Since</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ITEMS_DELETED_SINCE__DATE = eINSTANCE.getDataSet__GetItemsDeletedSince__Date();

		/**
		 * The meta object literal for the '<em><b>Get Idents Of Items Deleted Since</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_IDENTS_OF_ITEMS_DELETED_SINCE__DATE = eINSTANCE.getDataSet__GetIdentsOfItemsDeletedSince__Date();

		/**
		 * The meta object literal for the '<em><b>Clear Deleted Items List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___CLEAR_DELETED_ITEMS_LIST = eINSTANCE.getDataSet__ClearDeletedItemsList();

		/**
		 * The meta object literal for the '<em><b>Get Deleted Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_DELETED_ITEMS = eINSTANCE.getDataSet__GetDeletedItems();

		/**
		 * The meta object literal for the '<em><b>Get Items Except Identifiers Created Since</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ITEMS_EXCEPT_IDENTIFIERS_CREATED_SINCE__DATE = eINSTANCE.getDataSet__GetItemsExceptIdentifiersCreatedSince__Date();

		/**
		 * The meta object literal for the '<em><b>Get Items Except Identifiers Modified Since</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___GET_ITEMS_EXCEPT_IDENTIFIERS_MODIFIED_SINCE__DATE = eINSTANCE.getDataSet__GetItemsExceptIdentifiersModifiedSince__Date();

		/**
		 * The meta object literal for the '<em><b>Reload All Attachment Files</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_SET___RELOAD_ALL_ATTACHMENT_FILES = eINSTANCE.getDataSet__ReloadAllAttachmentFiles();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.ItemImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Data Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__DATA_SET = eINSTANCE.getItem_DataSet();

		/**
		 * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__IDENT = eINSTANCE.getItem_Ident();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__URI = eINSTANCE.getItem_Uri();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__STRING_VALUE = eINSTANCE.getItem_StringValue();

		/**
		 * The meta object literal for the '<em><b>String XML</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__STRING_XML = eINSTANCE.getItem_StringXML();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__LAST_MODIFIED = eINSTANCE.getItem_LastModified();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__CREATED = eINSTANCE.getItem_Created();

		/**
		 * The meta object literal for the '<em><b>Meta Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__META_TAGS = eINSTANCE.getItem_MetaTags();

		/**
		 * The meta object literal for the '<em><b>Identified By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__IDENTIFIED_BY = eINSTANCE.getItem_IdentifiedBy();

		/**
		 * The meta object literal for the '<em><b>Delete On Delete</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__DELETE_ON_DELETE = eINSTANCE.getItem_DeleteOnDelete();

		/**
		 * The meta object literal for the '<em><b>Deleted If Deleted</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__DELETED_IF_DELETED = eINSTANCE.getItem_DeletedIfDeleted();

		/**
		 * The meta object literal for the '<em><b>Forced Delete On Delete</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__FORCED_DELETE_ON_DELETE = eINSTANCE.getItem_ForcedDeleteOnDelete();

		/**
		 * The meta object literal for the '<em><b>Forced Deleted If Deleted</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__FORCED_DELETED_IF_DELETED = eINSTANCE.getItem_ForcedDeletedIfDeleted();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___LOG__STRING = eINSTANCE.getItem__Log__String();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___LOG__STRING_INTEGER = eINSTANCE.getItem__Log__String_Integer();

		/**
		 * The meta object literal for the '<em><b>Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___META_TAG__STRING = eINSTANCE.getItem__MetaTag__String();

		/**
		 * The meta object literal for the '<em><b>Identify By</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___IDENTIFY_BY__STRING_STRING = eINSTANCE.getItem__IdentifyBy__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___GET_IDENTIFIER__STRING = eINSTANCE.getItem__GetIdentifier__String();

		/**
		 * The meta object literal for the '<em><b>Has Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___HAS_META_TAG__STRING = eINSTANCE.getItem__HasMetaTag__String();

		/**
		 * The meta object literal for the '<em><b>Matches Search</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___MATCHES_SEARCH__STRING = eINSTANCE.getItem__MatchesSearch__String();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___DELETE = eINSTANCE.getItem__Delete();

		/**
		 * The meta object literal for the '<em><b>Is Equal Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___IS_EQUAL_ITEM__ITEM = eINSTANCE.getItem__IsEqualItem__Item();

		/**
		 * The meta object literal for the '<em><b>Get Created Pretty In Language</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___GET_CREATED_PRETTY_IN_LANGUAGE__STRING = eINSTANCE.getItem__GetCreatedPrettyInLanguage__String();

		/**
		 * The meta object literal for the '<em><b>Get Created Pretty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___GET_CREATED_PRETTY = eINSTANCE.getItem__GetCreatedPretty();

		/**
		 * The meta object literal for the '<em><b>Get Last Modified Pretty In Language</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING = eINSTANCE.getItem__GetLastModifiedPrettyInLanguage__String();

		/**
		 * The meta object literal for the '<em><b>Get Last Modified Pretty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___GET_LAST_MODIFIED_PRETTY = eINSTANCE.getItem__GetLastModifiedPretty();

		/**
		 * The meta object literal for the '<em><b>Delete On Delete Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___DELETE_ON_DELETE_OF__ITEM = eINSTANCE.getItem__DeleteOnDeleteOf__Item();

		/**
		 * The meta object literal for the '<em><b>Delete If Empty On Delete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___DELETE_IF_EMPTY_ON_DELETE = eINSTANCE.getItem__DeleteIfEmptyOnDelete();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___UPDATE__ITEM = eINSTANCE.getItem__Update__Item();

		/**
		 * The meta object literal for the '<em><b>Force Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___FORCE_UPDATE__ITEM = eINSTANCE.getItem__ForceUpdate__Item();

		/**
		 * The meta object literal for the '<em><b>Un Meta Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___UN_META_TAG__STRING = eINSTANCE.getItem__UnMetaTag__String();

		/**
		 * The meta object literal for the '<em><b>Remove Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___REMOVE_IDENTIFIER__STRING = eINSTANCE.getItem__RemoveIdentifier__String();

		/**
		 * The meta object literal for the '<em><b>Force Delete On Delete Of</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___FORCE_DELETE_ON_DELETE_OF__ITEM = eINSTANCE.getItem__ForceDeleteOnDeleteOf__Item();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.ExtensionImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTENSION___TAG__STRING = eINSTANCE.getExtension__Tag__String();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.ClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.ClassificationImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getClassification()
		 * @generated
		 */
		EClass CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION__NAME = eINSTANCE.getClassification_Name();

		/**
		 * The meta object literal for the '<em><b>Get Persons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFICATION___GET_PERSONS = eINSTANCE.getClassification__GetPersons();

		/**
		 * The meta object literal for the '<em><b>Get Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFICATION___GET_CONTENTS = eINSTANCE.getClassification__GetContents();

		/**
		 * The meta object literal for the '<em><b>Get Organisations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFICATION___GET_ORGANISATIONS = eINSTANCE.getClassification__GetOrganisations();

		/**
		 * The meta object literal for the '<em><b>Get Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFICATION___GET_COUNT = eINSTANCE.getClassification__GetCount();

		/**
		 * The meta object literal for the '<em><b>Get Persons Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFICATION___GET_PERSONS_COUNT = eINSTANCE.getClassification__GetPersonsCount();

		/**
		 * The meta object literal for the '<em><b>Get Contents Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFICATION___GET_CONTENTS_COUNT = eINSTANCE.getClassification__GetContentsCount();

		/**
		 * The meta object literal for the '<em><b>Get Organisations Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFICATION___GET_ORGANISATIONS_COUNT = eINSTANCE.getClassification__GetOrganisationsCount();

		/**
		 * The meta object literal for the '<em><b>Get Slug</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLASSIFICATION___GET_SLUG = eINSTANCE.getClassification__GetSlug();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.CategoryImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Categorized</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORIZED = eINSTANCE.getCategory_Categorized();

		/**
		 * The meta object literal for the '<em><b>Parent Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__PARENT_CATEGORY = eINSTANCE.getCategory_ParentCategory();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORIES = eINSTANCE.getCategory_Categories();

		/**
		 * The meta object literal for the '<em><b>Main Categorized</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__MAIN_CATEGORIZED = eINSTANCE.getCategory_MainCategorized();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.TagImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Tagged</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAG__TAGGED = eINSTANCE.getTag_Tagged();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.OrganisationImpl <em>Organisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.OrganisationImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getOrganisation()
		 * @generated
		 */
		EClass ORGANISATION = eINSTANCE.getOrganisation();

		/**
		 * The meta object literal for the '<em><b>Parent Organisation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__PARENT_ORGANISATION = eINSTANCE.getOrganisation_ParentOrganisation();

		/**
		 * The meta object literal for the '<em><b>Leader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__LEADER = eINSTANCE.getOrganisation_Leader();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__PARTICIPANTS = eINSTANCE.getOrganisation_Participants();

		/**
		 * The meta object literal for the '<em><b>Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__ORGANISATIONS = eINSTANCE.getOrganisation_Organisations();

		/**
		 * The meta object literal for the '<em><b>Get Persons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORGANISATION___GET_PERSONS = eINSTANCE.getOrganisation__GetPersons();

		/**
		 * The meta object literal for the '<em><b>Get Contents</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORGANISATION___GET_CONTENTS = eINSTANCE.getOrganisation__GetContents();

		/**
		 * The meta object literal for the '<em><b>Add Participant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ORGANISATION___ADD_PARTICIPANT__PERSON = eINSTANCE.getOrganisation__AddParticipant__Person();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.MetaTagImpl <em>Meta Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.MetaTagImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getMetaTag()
		 * @generated
		 */
		EClass META_TAG = eINSTANCE.getMetaTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_TAG__NAME = eINSTANCE.getMetaTag_Name();

		/**
		 * The meta object literal for the '<em><b>Meta Tagged</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_TAG__META_TAGGED = eINSTANCE.getMetaTag_MetaTagged();

		/**
		 * The meta object literal for the '<em><b>Get Web Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation META_TAG___GET_WEB_ACCOUNTS = eINSTANCE.getMetaTag__GetWebAccounts();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation META_TAG___GET_INFORMATION_OBJECTS = eINSTANCE.getMetaTag__GetInformationObjects();

		/**
		 * The meta object literal for the '<em><b>Get Extensions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation META_TAG___GET_EXTENSIONS = eINSTANCE.getMetaTag__GetExtensions();

		/**
		 * The meta object literal for the '<em><b>Get Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation META_TAG___GET_COUNT = eINSTANCE.getMetaTag__GetCount();

		/**
		 * The meta object literal for the '<em><b>Get Information Objects Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation META_TAG___GET_INFORMATION_OBJECTS_COUNT = eINSTANCE.getMetaTag__GetInformationObjectsCount();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.PhoneImpl <em>Phone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.PhoneImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getPhone()
		 * @generated
		 */
		EClass PHONE = eINSTANCE.getPhone();

		/**
		 * The meta object literal for the '<em><b>Area Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE__AREA_CODE = eINSTANCE.getPhone_AreaCode();

		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE__COUNTRY_CODE = eINSTANCE.getPhone_CountryCode();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHONE__NUMBER = eINSTANCE.getPhone_Number();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.InstantMessengerImpl <em>Instant Messenger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.InstantMessengerImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getInstantMessenger()
		 * @generated
		 */
		EClass INSTANT_MESSENGER = eINSTANCE.getInstantMessenger();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANT_MESSENGER__USERNAME = eINSTANCE.getInstantMessenger_Username();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.EmailImpl <em>Email</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.EmailImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getEmail()
		 * @generated
		 */
		EClass EMAIL = eINSTANCE.getEmail();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL__ADRESS = eINSTANCE.getEmail_Adress();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.WebAccountImpl <em>Web Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.WebAccountImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getWebAccount()
		 * @generated
		 */
		EClass WEB_ACCOUNT = eINSTANCE.getWebAccount();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ACCOUNT__USERNAME = eINSTANCE.getWebAccount_Username();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_ACCOUNT__SERVICE = eINSTANCE.getWebAccount_Service();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.WebSiteImpl <em>Web Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.WebSiteImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getWebSite()
		 * @generated
		 */
		EClass WEB_SITE = eINSTANCE.getWebSite();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__ADRESS = eINSTANCE.getWebSite_Adress();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__TITLE = eINSTANCE.getWebSite_Title();

		/**
		 * The meta object literal for the '<em><b>Shortened Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEB_SITE__SHORTENED_URL = eINSTANCE.getWebSite_ShortenedUrl();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.RankingImpl <em>Ranking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.RankingImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getRanking()
		 * @generated
		 */
		EClass RANKING = eINSTANCE.getRanking();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING__DATE = eINSTANCE.getRanking_Date();

		/**
		 * The meta object literal for the '<em><b>Ranker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__RANKER = eINSTANCE.getRanking_Ranker();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.AttachmentImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>File Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__FILE_URL = eINSTANCE.getAttachment_FileUrl();

		/**
		 * The meta object literal for the '<em><b>Cached File Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__CACHED_FILE_URL = eINSTANCE.getAttachment_CachedFileUrl();

		/**
		 * The meta object literal for the '<em><b>Cached Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__CACHED_ONLY = eINSTANCE.getAttachment_CachedOnly();

		/**
		 * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__FILE_EXTENSION = eINSTANCE.getAttachment_FileExtension();

		/**
		 * The meta object literal for the '<em><b>File Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__FILE_IDENTIFIER = eINSTANCE.getAttachment_FileIdentifier();

		/**
		 * The meta object literal for the '<em><b>Cached File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__CACHED_FILE_NAME = eINSTANCE.getAttachment_CachedFileName();

		/**
		 * The meta object literal for the '<em><b>No Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT__NO_CACHE = eINSTANCE.getAttachment_NoCache();

		/**
		 * The meta object literal for the '<em><b>Get Original File Url</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTACHMENT___GET_ORIGINAL_FILE_URL = eINSTANCE.getAttachment__GetOriginalFileUrl();

		/**
		 * The meta object literal for the '<em><b>Reload File</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTACHMENT___RELOAD_FILE = eINSTANCE.getAttachment__ReloadFile();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.LocationImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__STREET = eINSTANCE.getLocation_Street();

		/**
		 * The meta object literal for the '<em><b>House Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__HOUSE_NUMBER = eINSTANCE.getLocation_HouseNumber();

		/**
		 * The meta object literal for the '<em><b>Zip Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ZIP_CODE = eINSTANCE.getLocation_ZipCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__COUNTRY = eINSTANCE.getLocation_Country();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LONGITUDE = eINSTANCE.getLocation_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__LATITUDE = eINSTANCE.getLocation_Latitude();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CITY = eINSTANCE.getLocation_City();

		/**
		 * The meta object literal for the '<em><b>Indoor Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__INDOOR_LOCATIONS = eINSTANCE.getLocation_IndoorLocations();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__STATE = eINSTANCE.getLocation_State();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.ImageImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__WIDTH = eINSTANCE.getImage_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__HEIGHT = eINSTANCE.getImage_Height();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.DocumentImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.StarRankingImpl <em>Star Ranking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.StarRankingImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getStarRanking()
		 * @generated
		 */
		EClass STAR_RANKING = eINSTANCE.getStarRanking();

		/**
		 * The meta object literal for the '<em><b>Ranked Information Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAR_RANKING__RANKED_INFORMATION_OBJECT = eINSTANCE.getStarRanking_RankedInformationObject();

		/**
		 * The meta object literal for the '<em><b>Normalized Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAR_RANKING__NORMALIZED_VALUE = eINSTANCE.getStarRanking_NormalizedValue();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.ViewRankingImpl <em>View Ranking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.ViewRankingImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getViewRanking()
		 * @generated
		 */
		EClass VIEW_RANKING = eINSTANCE.getViewRanking();

		/**
		 * The meta object literal for the '<em><b>Ranked Information Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_RANKING__RANKED_INFORMATION_OBJECT = eINSTANCE.getViewRanking_RankedInformationObject();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.ThumbRankingImpl <em>Thumb Ranking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.ThumbRankingImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getThumbRanking()
		 * @generated
		 */
		EClass THUMB_RANKING = eINSTANCE.getThumbRanking();

		/**
		 * The meta object literal for the '<em><b>Ranked Information Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THUMB_RANKING__RANKED_INFORMATION_OBJECT = eINSTANCE.getThumbRanking_RankedInformationObject();

		/**
		 * The meta object literal for the '<em><b>Is Thumb Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THUMB_RANKING___IS_THUMB_UP = eINSTANCE.getThumbRanking__IsThumbUp();

		/**
		 * The meta object literal for the '<em><b>Is Thumb Down</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation THUMB_RANKING___IS_THUMB_DOWN = eINSTANCE.getThumbRanking__IsThumbDown();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.TransformationImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Transformed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TRANSFORMED = eINSTANCE.getTransformation_Transformed();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.VideoImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.ConnectionImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FROM = eINSTANCE.getConnection_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TO = eINSTANCE.getConnection_To();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.BinaryImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY__BYTES = eINSTANCE.getBinary_Bytes();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.MetaInformationImpl <em>Meta Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.MetaInformationImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getMetaInformation()
		 * @generated
		 */
		EClass META_INFORMATION = eINSTANCE.getMetaInformation();

		/**
		 * The meta object literal for the '<em><b>Information Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_INFORMATION__INFORMATION_OBJECTS = eINSTANCE.getMetaInformation_InformationObjects();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.IndoorLocationImpl <em>Indoor Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.IndoorLocationImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getIndoorLocation()
		 * @generated
		 */
		EClass INDOOR_LOCATION = eINSTANCE.getIndoorLocation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDOOR_LOCATION__LOCATION = eINSTANCE.getIndoorLocation_Location();

		/**
		 * The meta object literal for the '<em><b>Parent Indoor Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDOOR_LOCATION__PARENT_INDOOR_LOCATION = eINSTANCE.getIndoorLocation_ParentIndoorLocation();

		/**
		 * The meta object literal for the '<em><b>Indoor Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDOOR_LOCATION__INDOOR_LOCATIONS = eINSTANCE.getIndoorLocation_IndoorLocations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDOOR_LOCATION__NAME = eINSTANCE.getIndoorLocation_Name();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.IdentifierImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__KEY = eINSTANCE.getIdentifier_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__VALUE = eINSTANCE.getIdentifier_Value();

		/**
		 * The meta object literal for the '<em><b>Identified</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__IDENTIFIED = eINSTANCE.getIdentifier_Identified();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.EventImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DATE = eINSTANCE.getEvent_Date();

		/**
		 * The meta object literal for the '<em><b>Get Date Pretty In Language</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT___GET_DATE_PRETTY_IN_LANGUAGE__STRING = eINSTANCE.getEvent__GetDatePrettyInLanguage__String();

		/**
		 * The meta object literal for the '<em><b>Get Date Pretty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT___GET_DATE_PRETTY = eINSTANCE.getEvent__GetDatePretty();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.DeletedItemImpl <em>Deleted Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.DeletedItemImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getDeletedItem()
		 * @generated
		 */
		EClass DELETED_ITEM = eINSTANCE.getDeletedItem();

		/**
		 * The meta object literal for the '<em><b>Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETED_ITEM__DELETED = eINSTANCE.getDeletedItem_Deleted();

		/**
		 * The meta object literal for the '<em><b>Ident Of Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETED_ITEM__IDENT_OF_DELETED = eINSTANCE.getDeletedItem_IdentOfDeleted();

	}

} //DataPackage
