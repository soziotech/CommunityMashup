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
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LAST_MODIFIED = 4;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CREATED = 5;

	/**
	 * The feature id for the '<em><b>Meta Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__META_TAGS = 6;

	/**
	 * The feature id for the '<em><b>Identified By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__IDENTIFIED_BY = 7;

	/**
	 * The feature id for the '<em><b>Delete On Delete</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DELETE_ON_DELETE = 8;

	/**
	 * The feature id for the '<em><b>Deleted If Deleted</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__DELETED_IF_DELETED = 9;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 10;

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
	 * The number of structural features of the '<em>Information Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_OBJECT_FEATURE_COUNT = ITEM_FEATURE_COUNT + 12;

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
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SET_FEATURE_COUNT = 6;

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
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Phones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__PHONES = INFORMATION_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Emails</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__EMAILS = INFORMATION_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Web Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__WEB_ACCOUNTS = INFORMATION_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__LOCATIONS = INFORMATION_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Organisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION__ORGANISATIONS = INFORMATION_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Organisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATION_FEATURE_COUNT = INFORMATION_OBJECT_FEATURE_COUNT + 8;

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
	 * The number of structural features of the '<em>Web Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ACCOUNT_FEATURE_COUNT = META_INFORMATION_FEATURE_COUNT + 1;

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
	 * The number of structural features of the '<em>Web Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_SITE_FEATURE_COUNT = META_INFORMATION_FEATURE_COUNT + 2;

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
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 6;

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
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = META_INFORMATION_FEATURE_COUNT + 8;

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
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 0;

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
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = ATTACHMENT_FEATURE_COUNT + 0;


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
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see org.sociotech.communitymashup.data.Extension
	 * @generated
	 */
	EClass getExtension();

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
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Organisation#getPhones <em>Phones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Phones</em>'.
	 * @see org.sociotech.communitymashup.data.Organisation#getPhones()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Phones();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Organisation#getEmails <em>Emails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emails</em>'.
	 * @see org.sociotech.communitymashup.data.Organisation#getEmails()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Emails();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Organisation#getWebAccounts <em>Web Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Web Accounts</em>'.
	 * @see org.sociotech.communitymashup.data.Organisation#getWebAccounts()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_WebAccounts();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.data.Organisation#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see org.sociotech.communitymashup.data.Organisation#getLocations()
	 * @see #getOrganisation()
	 * @generated
	 */
	EReference getOrganisation_Locations();

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
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.data.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.sociotech.communitymashup.data.Image
	 * @generated
	 */
	EClass getImage();

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
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.ExtensionImpl <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.ExtensionImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

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
		 * The meta object literal for the '<em><b>Phones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__PHONES = eINSTANCE.getOrganisation_Phones();

		/**
		 * The meta object literal for the '<em><b>Emails</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__EMAILS = eINSTANCE.getOrganisation_Emails();

		/**
		 * The meta object literal for the '<em><b>Web Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__WEB_ACCOUNTS = eINSTANCE.getOrganisation_WebAccounts();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__LOCATIONS = eINSTANCE.getOrganisation_Locations();

		/**
		 * The meta object literal for the '<em><b>Organisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANISATION__ORGANISATIONS = eINSTANCE.getOrganisation_Organisations();

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
		 * The meta object literal for the '{@link org.sociotech.communitymashup.data.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.data.impl.ImageImpl
		 * @see org.sociotech.communitymashup.data.impl.DataPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

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

	}

} //DataPackage
