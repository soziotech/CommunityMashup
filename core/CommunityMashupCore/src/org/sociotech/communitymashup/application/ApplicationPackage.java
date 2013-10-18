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
package org.sociotech.communitymashup.application;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.sociotech.communitymashup.application.ApplicationFactory
 * @model kind="package"
 * @generated
 */
public interface ApplicationPackage extends EPackage {
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
	String eNAME = "application";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://application.cscm.communitymashup.de";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "application";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApplicationPackage eINSTANCE = org.sociotech.communitymashup.application.impl.ApplicationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.ConfigurableElementImpl <em>Configurable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.ConfigurableElementImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getConfigurableElement()
	 * @generated
	 */
	int CONFIGURABLE_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Configuration Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT__CONFIGURATION_IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT__CHANGEABLE = 4;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT__HIDDEN = 5;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT__IDENT = 6;

	/**
	 * The number of structural features of the '<em>Configurable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT___GET_PROPERTY__STRING = 0;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT___ADD_PROPERTY__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT___ADD_PROPERTY__PROPERTY = 2;

	/**
	 * The operation id for the '<em>Get Property Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT___GET_PROPERTY_VALUE__STRING = 3;

	/**
	 * The operation id for the '<em>Is Property True</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT___IS_PROPERTY_TRUE__STRING = 4;

	/**
	 * The operation id for the '<em>Get Property Value Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Is Property True Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Remove Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT___REMOVE_PROPERTY__STRING = 7;

	/**
	 * The number of operations of the '<em>Configurable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURABLE_ELEMENT_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.SourceImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CONFIGURATION = CONFIGURABLE_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = CONFIGURABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CONFIGURATION_IMAGE = CONFIGURABLE_ELEMENT__CONFIGURATION_IMAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__DESCRIPTION = CONFIGURABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CHANGEABLE = CONFIGURABLE_ELEMENT__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__HIDDEN = CONFIGURABLE_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__IDENT = CONFIGURABLE_ELEMENT__IDENT;

	/**
	 * The feature id for the '<em><b>Persistency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__PERSISTENCY = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__DATA_SET = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bundle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__BUNDLE_ID = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__STATE = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Active State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ACTIVE_STATE = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LOG_LEVEL = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Mashup</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__MASHUP = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Remove Data On Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__REMOVE_DATA_ON_STOP = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Update Round</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__UPDATE_ROUND = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___GET_PROPERTY__STRING = CONFIGURABLE_ELEMENT___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___ADD_PROPERTY__STRING_STRING = CONFIGURABLE_ELEMENT___ADD_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___ADD_PROPERTY__PROPERTY = CONFIGURABLE_ELEMENT___ADD_PROPERTY__PROPERTY;

	/**
	 * The operation id for the '<em>Get Property Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___GET_PROPERTY_VALUE__STRING = CONFIGURABLE_ELEMENT___GET_PROPERTY_VALUE__STRING;

	/**
	 * The operation id for the '<em>Is Property True</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___IS_PROPERTY_TRUE__STRING = CONFIGURABLE_ELEMENT___IS_PROPERTY_TRUE__STRING;

	/**
	 * The operation id for the '<em>Get Property Value Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING = CONFIGURABLE_ELEMENT___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING;

	/**
	 * The operation id for the '<em>Is Property True Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING = CONFIGURABLE_ELEMENT___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING;

	/**
	 * The operation id for the '<em>Remove Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___REMOVE_PROPERTY__STRING = CONFIGURABLE_ELEMENT___REMOVE_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Get Log Level Int Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___GET_LOG_LEVEL_INT_VALUE = CONFIGURABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___START = CONFIGURABLE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___STOP = CONFIGURABLE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___PAUSE = CONFIGURABLE_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = CONFIGURABLE_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.MashupImpl <em>Mashup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.MashupImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getMashup()
	 * @generated
	 */
	int MASHUP = 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__CONFIGURATION = SOURCE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__NAME = SOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Configuration Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__CONFIGURATION_IMAGE = SOURCE__CONFIGURATION_IMAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__DESCRIPTION = SOURCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__CHANGEABLE = SOURCE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__HIDDEN = SOURCE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__IDENT = SOURCE__IDENT;

	/**
	 * The feature id for the '<em><b>Persistency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__PERSISTENCY = SOURCE__PERSISTENCY;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__DATA_SET = SOURCE__DATA_SET;

	/**
	 * The feature id for the '<em><b>Bundle Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__BUNDLE_ID = SOURCE__BUNDLE_ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__STATE = SOURCE__STATE;

	/**
	 * The feature id for the '<em><b>Active State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__ACTIVE_STATE = SOURCE__ACTIVE_STATE;

	/**
	 * The feature id for the '<em><b>Log Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__LOG_LEVEL = SOURCE__LOG_LEVEL;

	/**
	 * The feature id for the '<em><b>Mashup</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__MASHUP = SOURCE__MASHUP;

	/**
	 * The feature id for the '<em><b>Remove Data On Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__REMOVE_DATA_ON_STOP = SOURCE__REMOVE_DATA_ON_STOP;

	/**
	 * The feature id for the '<em><b>Update Round</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__UPDATE_ROUND = SOURCE__UPDATE_ROUND;

	/**
	 * The feature id for the '<em><b>Mapping Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__MAPPING_RULES = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__SOURCES = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__INTERFACES = SOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mashup Admins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__MASHUP_ADMINS = SOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__WORKING_DIRECTORY = SOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cache Attachments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__CACHE_ATTACHMENTS = SOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cache Data Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__CACHE_DATA_SET = SOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Backup Data Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__BACKUP_DATA_SET = SOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Backup Intervall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__BACKUP_INTERVALL = SOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Cache Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__CACHE_DELAY = SOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Source Ident Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP__SOURCE_IDENT_COUNTER = SOURCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Mashup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___GET_PROPERTY__STRING = SOURCE___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___ADD_PROPERTY__STRING_STRING = SOURCE___ADD_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___ADD_PROPERTY__PROPERTY = SOURCE___ADD_PROPERTY__PROPERTY;

	/**
	 * The operation id for the '<em>Get Property Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___GET_PROPERTY_VALUE__STRING = SOURCE___GET_PROPERTY_VALUE__STRING;

	/**
	 * The operation id for the '<em>Is Property True</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___IS_PROPERTY_TRUE__STRING = SOURCE___IS_PROPERTY_TRUE__STRING;

	/**
	 * The operation id for the '<em>Get Property Value Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING = SOURCE___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING;

	/**
	 * The operation id for the '<em>Is Property True Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING = SOURCE___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING;

	/**
	 * The operation id for the '<em>Remove Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___REMOVE_PROPERTY__STRING = SOURCE___REMOVE_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Get Log Level Int Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___GET_LOG_LEVEL_INT_VALUE = SOURCE___GET_LOG_LEVEL_INT_VALUE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___START = SOURCE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___STOP = SOURCE___STOP;

	/**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___PAUSE = SOURCE___PAUSE;

	/**
	 * The operation id for the '<em>Get New Source Ident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___GET_NEW_SOURCE_IDENT = SOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Source With Ident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP___GET_SOURCE_WITH_IDENT__STRING = SOURCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mashup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_OPERATION_COUNT = SOURCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.MappingRuleImpl <em>Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.MappingRuleImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getMappingRule()
	 * @generated
	 */
	int MAPPING_RULE = 2;

	/**
	 * The number of structural features of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.ConfigurationImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.PersistencyImpl <em>Persistency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.PersistencyImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getPersistency()
	 * @generated
	 */
	int PERSISTENCY = 4;

	/**
	 * The number of structural features of the '<em>Persistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Persistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.XMLFileImpl <em>XML File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.XMLFileImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getXMLFile()
	 * @generated
	 */
	int XML_FILE = 5;

	/**
	 * The number of structural features of the '<em>XML File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FILE_FEATURE_COUNT = PERSISTENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XML File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FILE_OPERATION_COUNT = PERSISTENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.DatabaseImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 6;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = PERSISTENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = PERSISTENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.PropertyImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__HIDDEN = 2;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__CHANGEABLE = 3;

	/**
	 * The feature id for the '<em><b>Possible Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__POSSIBLE_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Help Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__HELP_TEXT = 5;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__REQUIRED = 6;

	/**
	 * The feature id for the '<em><b>Property Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PROPERTY_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Is Value List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_VALUE_LIST = 0;

	/**
	 * The operation id for the '<em>Is Value Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___IS_VALUE_RANGE = 1;

	/**
	 * The operation id for the '<em>Get List Of Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_LIST_OF_VALUES = 2;

	/**
	 * The operation id for the '<em>Get Min Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_MIN_VALUE = 3;

	/**
	 * The operation id for the '<em>Get Max Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY___GET_MAX_VALUE = 4;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.OCLRestrictedPropertyImpl <em>OCL Restricted Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.OCLRestrictedPropertyImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getOCLRestrictedProperty()
	 * @generated
	 */
	int OCL_RESTRICTED_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY__KEY = PROPERTY__KEY;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY__VALUE = PROPERTY__VALUE;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY__HIDDEN = PROPERTY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY__CHANGEABLE = PROPERTY__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Possible Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY__POSSIBLE_VALUES = PROPERTY__POSSIBLE_VALUES;

	/**
	 * The feature id for the '<em><b>Help Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY__HELP_TEXT = PROPERTY__HELP_TEXT;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY__REQUIRED = PROPERTY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Property Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY__PROPERTY_TYPE = PROPERTY__PROPERTY_TYPE;

	/**
	 * The feature id for the '<em><b>OCL Restriction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY__OCL_RESTRICTION = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>OCL Restricted Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;


	/**
	 * The operation id for the '<em>Is Value List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY___IS_VALUE_LIST = PROPERTY___IS_VALUE_LIST;

	/**
	 * The operation id for the '<em>Is Value Range</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY___IS_VALUE_RANGE = PROPERTY___IS_VALUE_RANGE;

	/**
	 * The operation id for the '<em>Get List Of Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY___GET_LIST_OF_VALUES = PROPERTY___GET_LIST_OF_VALUES;

	/**
	 * The operation id for the '<em>Get Min Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY___GET_MIN_VALUE = PROPERTY___GET_MIN_VALUE;

	/**
	 * The operation id for the '<em>Get Max Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY___GET_MAX_VALUE = PROPERTY___GET_MAX_VALUE;

	/**
	 * The number of operations of the '<em>OCL Restricted Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_RESTRICTED_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.MashupContainerImpl <em>Mashup Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.MashupContainerImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getMashupContainer()
	 * @generated
	 */
	int MASHUP_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Mashups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER__MASHUPS = 0;

	/**
	 * The feature id for the '<em><b>All Mashup Admins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER__ALL_MASHUP_ADMINS = 1;

	/**
	 * The feature id for the '<em><b>Backup Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER__BACKUP_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Backup Intervall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER__BACKUP_INTERVALL = 3;

	/**
	 * The feature id for the '<em><b>Default Mashups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER__DEFAULT_MASHUPS = 4;

	/**
	 * The feature id for the '<em><b>Source Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER__SOURCE_CONFIGURATIONS = 5;

	/**
	 * The feature id for the '<em><b>Interface Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER__INTERFACE_CONFIGURATIONS = 6;

	/**
	 * The feature id for the '<em><b>Immediate Save</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER__IMMEDIATE_SAVE = 7;

	/**
	 * The feature id for the '<em><b>Create Accounts At Login Try</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER__CREATE_ACCOUNTS_AT_LOGIN_TRY = 8;

	/**
	 * The feature id for the '<em><b>Ident Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER__IDENT_COUNTER = 9;

	/**
	 * The number of structural features of the '<em>Mashup Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Get Configuration Admins</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER___GET_CONFIGURATION_ADMINS = 0;

	/**
	 * The operation id for the '<em>Set New Ident For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER___SET_NEW_IDENT_FOR__CONFIGURABLEELEMENT = 1;

	/**
	 * The operation id for the '<em>Get New Ident Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER___GET_NEW_IDENT_NUMBER = 2;

	/**
	 * The operation id for the '<em>Get Mashup With Ident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER___GET_MASHUP_WITH_IDENT__STRING = 3;

	/**
	 * The operation id for the '<em>Get Source Configuration With Ident</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER___GET_SOURCE_CONFIGURATION_WITH_IDENT__STRING = 4;

	/**
	 * The number of operations of the '<em>Mashup Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_CONTAINER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.InterfaceImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONFIGURATION = CONFIGURABLE_ELEMENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = CONFIGURABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONFIGURATION_IMAGE = CONFIGURABLE_ELEMENT__CONFIGURATION_IMAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DESCRIPTION = CONFIGURABLE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CHANGEABLE = CONFIGURABLE_ELEMENT__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__HIDDEN = CONFIGURABLE_ELEMENT__HIDDEN;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__IDENT = CONFIGURABLE_ELEMENT__IDENT;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SECURITY = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__URL_SUFFIX = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mashup</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__MASHUP = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Front End Caching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__FRONT_END_CACHING = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = CONFIGURABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___GET_PROPERTY__STRING = CONFIGURABLE_ELEMENT___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___ADD_PROPERTY__STRING_STRING = CONFIGURABLE_ELEMENT___ADD_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___ADD_PROPERTY__PROPERTY = CONFIGURABLE_ELEMENT___ADD_PROPERTY__PROPERTY;

	/**
	 * The operation id for the '<em>Get Property Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___GET_PROPERTY_VALUE__STRING = CONFIGURABLE_ELEMENT___GET_PROPERTY_VALUE__STRING;

	/**
	 * The operation id for the '<em>Is Property True</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___IS_PROPERTY_TRUE__STRING = CONFIGURABLE_ELEMENT___IS_PROPERTY_TRUE__STRING;

	/**
	 * The operation id for the '<em>Get Property Value Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING = CONFIGURABLE_ELEMENT___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING;

	/**
	 * The operation id for the '<em>Is Property True Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING = CONFIGURABLE_ELEMENT___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING;

	/**
	 * The operation id for the '<em>Remove Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE___REMOVE_PROPERTY__STRING = CONFIGURABLE_ELEMENT___REMOVE_PROPERTY__STRING;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = CONFIGURABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.RESTInterfaceImpl <em>REST Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.RESTInterfaceImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getRESTInterface()
	 * @generated
	 */
	int REST_INTERFACE = 11;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__CONFIGURATION = INTERFACE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Configuration Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__CONFIGURATION_IMAGE = INTERFACE__CONFIGURATION_IMAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__DESCRIPTION = INTERFACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__CHANGEABLE = INTERFACE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__HIDDEN = INTERFACE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__IDENT = INTERFACE__IDENT;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__SECURITY = INTERFACE__SECURITY;

	/**
	 * The feature id for the '<em><b>Url Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__URL_SUFFIX = INTERFACE__URL_SUFFIX;

	/**
	 * The feature id for the '<em><b>Mashup</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__MASHUP = INTERFACE__MASHUP;

	/**
	 * The feature id for the '<em><b>Front End Caching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__FRONT_END_CACHING = INTERFACE__FRONT_END_CACHING;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE__TYPE = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>REST Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;


	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE___GET_PROPERTY__STRING = INTERFACE___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE___ADD_PROPERTY__STRING_STRING = INTERFACE___ADD_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE___ADD_PROPERTY__PROPERTY = INTERFACE___ADD_PROPERTY__PROPERTY;

	/**
	 * The operation id for the '<em>Get Property Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE___GET_PROPERTY_VALUE__STRING = INTERFACE___GET_PROPERTY_VALUE__STRING;

	/**
	 * The operation id for the '<em>Is Property True</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE___IS_PROPERTY_TRUE__STRING = INTERFACE___IS_PROPERTY_TRUE__STRING;

	/**
	 * The operation id for the '<em>Get Property Value Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING = INTERFACE___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING;

	/**
	 * The operation id for the '<em>Is Property True Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING = INTERFACE___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING;

	/**
	 * The operation id for the '<em>Remove Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE___REMOVE_PROPERTY__STRING = INTERFACE___REMOVE_PROPERTY__STRING;

	/**
	 * The number of operations of the '<em>REST Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl <em>FEED Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getFEEDInterface()
	 * @generated
	 */
	int FEED_INTERFACE = 12;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__CONFIGURATION = INTERFACE__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Configuration Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__CONFIGURATION_IMAGE = INTERFACE__CONFIGURATION_IMAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__DESCRIPTION = INTERFACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__CHANGEABLE = INTERFACE__CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__HIDDEN = INTERFACE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__IDENT = INTERFACE__IDENT;

	/**
	 * The feature id for the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__SECURITY = INTERFACE__SECURITY;

	/**
	 * The feature id for the '<em><b>Url Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__URL_SUFFIX = INTERFACE__URL_SUFFIX;

	/**
	 * The feature id for the '<em><b>Mashup</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__MASHUP = INTERFACE__MASHUP;

	/**
	 * The feature id for the '<em><b>Front End Caching</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__FRONT_END_CACHING = INTERFACE__FRONT_END_CACHING;

	/**
	 * The feature id for the '<em><b>Allow Person Filtering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__ALLOW_PERSON_FILTERING = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Organisation Filtering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__ALLOW_ORGANISATION_FILTERING = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Allow Type Filtering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__ALLOW_TYPE_FILTERING = INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allow Tag Filtering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__ALLOW_TAG_FILTERING = INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Allow Meta Tag Filtering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__ALLOW_META_TAG_FILTERING = INTERFACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Allow Category Filtering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__ALLOW_CATEGORY_FILTERING = INTERFACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__LANGUAGE = INTERFACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Feed Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__FEED_TYPE = INTERFACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Feed Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE__FEED_TITLE = INTERFACE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>FEED Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 9;


	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE___GET_PROPERTY__STRING = INTERFACE___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE___ADD_PROPERTY__STRING_STRING = INTERFACE___ADD_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE___ADD_PROPERTY__PROPERTY = INTERFACE___ADD_PROPERTY__PROPERTY;

	/**
	 * The operation id for the '<em>Get Property Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE___GET_PROPERTY_VALUE__STRING = INTERFACE___GET_PROPERTY_VALUE__STRING;

	/**
	 * The operation id for the '<em>Is Property True</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE___IS_PROPERTY_TRUE__STRING = INTERFACE___IS_PROPERTY_TRUE__STRING;

	/**
	 * The operation id for the '<em>Get Property Value Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING = INTERFACE___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING;

	/**
	 * The operation id for the '<em>Is Property True Else Default</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING = INTERFACE___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING;

	/**
	 * The operation id for the '<em>Remove Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE___REMOVE_PROPERTY__STRING = INTERFACE___REMOVE_PROPERTY__STRING;

	/**
	 * The number of operations of the '<em>FEED Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEED_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.SecurityImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 13;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.OAuthConfigImpl <em>OAuth Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.OAuthConfigImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getOAuthConfig()
	 * @generated
	 */
	int OAUTH_CONFIG = 14;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CONFIG__INTERFACE = SECURITY__INTERFACE;

	/**
	 * The feature id for the '<em><b>Clients</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CONFIG__CLIENTS = SECURITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Admins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CONFIG__ADMINS = SECURITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Scope Interface On Redirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CONFIG__USE_SCOPE_INTERFACE_ON_REDIRECT = SECURITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>OAuth Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CONFIG_FEATURE_COUNT = SECURITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>OAuth Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CONFIG_OPERATION_COUNT = SECURITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.ApplicationKeyConfigImpl <em>Key Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.ApplicationKeyConfigImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getApplicationKeyConfig()
	 * @generated
	 */
	int APPLICATION_KEY_CONFIG = 15;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_KEY_CONFIG__INTERFACE = SECURITY__INTERFACE;

	/**
	 * The feature id for the '<em><b>Application Keys</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_KEY_CONFIG__APPLICATION_KEYS = SECURITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_KEY_CONFIG_FEATURE_COUNT = SECURITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Application Key</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_KEY_CONFIG___HAS_APPLICATION_KEY__STRING = SECURITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Key Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_KEY_CONFIG_OPERATION_COUNT = SECURITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl <em>OAuth Client Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getOAuthClientConfig()
	 * @generated
	 */
	int OAUTH_CLIENT_CONFIG = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Redirection URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__REDIRECTION_URL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Client ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__CLIENT_ID = 4;

	/**
	 * The feature id for the '<em><b>Client Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__CLIENT_SECRET = 5;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__CODE = 6;

	/**
	 * The feature id for the '<em><b>Grant Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__GRANT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Refresh Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__REFRESH_TOKEN = 8;

	/**
	 * The feature id for the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__ACCESS_TOKEN = 9;

	/**
	 * The feature id for the '<em><b>Access Token Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_CREATION_DATE = 10;

	/**
	 * The feature id for the '<em><b>Access Token Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_EXPIRATION_DATE = 11;

	/**
	 * The feature id for the '<em><b>Forbidden Meta Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__FORBIDDEN_META_TAGS = 12;

	/**
	 * The feature id for the '<em><b>Allowed Meta Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__ALLOWED_META_TAGS = 13;

	/**
	 * The feature id for the '<em><b>Client Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__CLIENT_SCOPE = 14;

	/**
	 * The feature id for the '<em><b>OAuth Scope Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG__OAUTH_SCOPE_LEVEL = 15;

	/**
	 * The number of structural features of the '<em>OAuth Client Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>OAuth Client Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.OAuthAdminImpl <em>OAuth Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.OAuthAdminImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getOAuthAdmin()
	 * @generated
	 */
	int OAUTH_ADMIN = 17;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_ADMIN__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Password Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_ADMIN__PASSWORD_HASH = 1;

	/**
	 * The number of structural features of the '<em>OAuth Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_ADMIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>OAuth Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_ADMIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl <em>OAuth Client Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getOAuthClientScope()
	 * @generated
	 */
	int OAUTH_CLIENT_SCOPE = 18;

	/**
	 * The feature id for the '<em><b>Positive Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__POSITIVE_TAG = 0;

	/**
	 * The feature id for the '<em><b>Negative Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__NEGATIVE_TAG = 1;

	/**
	 * The feature id for the '<em><b>Positive Meta Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__POSITIVE_META_TAG = 2;

	/**
	 * The feature id for the '<em><b>Negative Meta Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__NEGATIVE_META_TAG = 3;

	/**
	 * The feature id for the '<em><b>Positive Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__POSITIVE_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Negative Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__NEGATIVE_CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Positive Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__POSITIVE_PERSON = 6;

	/**
	 * The feature id for the '<em><b>Negative Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__NEGATIVE_PERSON = 7;

	/**
	 * The feature id for the '<em><b>Positive Organisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__POSITIVE_ORGANISATION = 8;

	/**
	 * The feature id for the '<em><b>Negative Organisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__NEGATIVE_ORGANISATION = 9;

	/**
	 * The feature id for the '<em><b>Ident Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__IDENT_SPECIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Allow Persons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__ALLOW_PERSONS = 11;

	/**
	 * The feature id for the '<em><b>Allow Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__ALLOW_CONTENTS = 12;

	/**
	 * The feature id for the '<em><b>Allow Organisations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__ALLOW_ORGANISATIONS = 13;

	/**
	 * The feature id for the '<em><b>Maximum Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE__MAXIMUM_AGE = 14;

	/**
	 * The number of structural features of the '<em>OAuth Client Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>OAuth Client Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OAUTH_CLIENT_SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.impl.MashupAdminImpl <em>Mashup Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.impl.MashupAdminImpl
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getMashupAdmin()
	 * @generated
	 */
	int MASHUP_ADMIN = 19;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_ADMIN__PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_ADMIN__ID = 1;

	/**
	 * The feature id for the '<em><b>Configurable Mashups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_ADMIN__CONFIGURABLE_MASHUPS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_ADMIN__NAME = 3;

	/**
	 * The feature id for the '<em><b>Local Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_ADMIN__LOCAL_IDENT = 4;

	/**
	 * The feature id for the '<em><b>Is Configuration Admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_ADMIN__IS_CONFIGURATION_ADMIN = 5;

	/**
	 * The feature id for the '<em><b>Profile Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_ADMIN__PROFILE_IMAGE = 6;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_ADMIN__EMAIL = 7;

	/**
	 * The number of structural features of the '<em>Mashup Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_ADMIN_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Mashup Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASHUP_ADMIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.SourceState <em>Source State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.SourceState
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getSourceState()
	 * @generated
	 */
	int SOURCE_STATE = 21;

	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.SourceActiveStates <em>Source Active States</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.SourceActiveStates
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getSourceActiveStates()
	 * @generated
	 */
	int SOURCE_ACTIVE_STATES = 22;


	/**
	 * The meta object id for the '{@link org.sociotech.communitymashup.application.PropertyTypes <em>Property Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sociotech.communitymashup.application.PropertyTypes
	 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getPropertyTypes()
	 * @generated
	 */
	int PROPERTY_TYPES = 23;


	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.sociotech.communitymashup.application.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.sociotech.communitymashup.application.Source#getPersistency <em>Persistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persistency</em>'.
	 * @see org.sociotech.communitymashup.application.Source#getPersistency()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Persistency();

	/**
	 * Returns the meta object for the reference '{@link org.sociotech.communitymashup.application.Source#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Set</em>'.
	 * @see org.sociotech.communitymashup.application.Source#getDataSet()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_DataSet();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Source#getBundleId <em>Bundle Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundle Id</em>'.
	 * @see org.sociotech.communitymashup.application.Source#getBundleId()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_BundleId();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Source#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.sociotech.communitymashup.application.Source#getState()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_State();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Source#getActiveState <em>Active State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active State</em>'.
	 * @see org.sociotech.communitymashup.application.Source#getActiveState()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_ActiveState();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Source#getLogLevel <em>Log Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Log Level</em>'.
	 * @see org.sociotech.communitymashup.application.Source#getLogLevel()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_LogLevel();

	/**
	 * Returns the meta object for the container reference '{@link org.sociotech.communitymashup.application.Source#getMashup <em>Mashup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mashup</em>'.
	 * @see org.sociotech.communitymashup.application.Source#getMashup()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Mashup();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Source#getRemoveDataOnStop <em>Remove Data On Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Data On Stop</em>'.
	 * @see org.sociotech.communitymashup.application.Source#getRemoveDataOnStop()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_RemoveDataOnStop();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Source#getUpdateRound <em>Update Round</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Round</em>'.
	 * @see org.sociotech.communitymashup.application.Source#getUpdateRound()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_UpdateRound();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.Source#getLogLevelIntValue() <em>Get Log Level Int Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Log Level Int Value</em>' operation.
	 * @see org.sociotech.communitymashup.application.Source#getLogLevelIntValue()
	 * @generated
	 */
	EOperation getSource__GetLogLevelIntValue();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.Source#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.sociotech.communitymashup.application.Source#start()
	 * @generated
	 */
	EOperation getSource__Start();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.Source#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.sociotech.communitymashup.application.Source#stop()
	 * @generated
	 */
	EOperation getSource__Stop();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.Source#pause() <em>Pause</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause</em>' operation.
	 * @see org.sociotech.communitymashup.application.Source#pause()
	 * @generated
	 */
	EOperation getSource__Pause();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.Mashup <em>Mashup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mashup</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup
	 * @generated
	 */
	EClass getMashup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.application.Mashup#getMappingRules <em>Mapping Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping Rules</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup#getMappingRules()
	 * @see #getMashup()
	 * @generated
	 */
	EReference getMashup_MappingRules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.application.Mashup#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup#getSources()
	 * @see #getMashup()
	 * @generated
	 */
	EReference getMashup_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.application.Mashup#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup#getInterfaces()
	 * @see #getMashup()
	 * @generated
	 */
	EReference getMashup_Interfaces();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.application.Mashup#getMashupAdmins <em>Mashup Admins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mashup Admins</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup#getMashupAdmins()
	 * @see #getMashup()
	 * @generated
	 */
	EReference getMashup_MashupAdmins();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Mashup#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Directory</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup#getWorkingDirectory()
	 * @see #getMashup()
	 * @generated
	 */
	EAttribute getMashup_WorkingDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Mashup#getCacheAttachments <em>Cache Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Attachments</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup#getCacheAttachments()
	 * @see #getMashup()
	 * @generated
	 */
	EAttribute getMashup_CacheAttachments();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Mashup#getCacheDataSet <em>Cache Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Data Set</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup#getCacheDataSet()
	 * @see #getMashup()
	 * @generated
	 */
	EAttribute getMashup_CacheDataSet();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Mashup#getBackupDataSet <em>Backup Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backup Data Set</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup#getBackupDataSet()
	 * @see #getMashup()
	 * @generated
	 */
	EAttribute getMashup_BackupDataSet();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Mashup#getBackupIntervall <em>Backup Intervall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backup Intervall</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup#getBackupIntervall()
	 * @see #getMashup()
	 * @generated
	 */
	EAttribute getMashup_BackupIntervall();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Mashup#getCacheDelay <em>Cache Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Delay</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup#getCacheDelay()
	 * @see #getMashup()
	 * @generated
	 */
	EAttribute getMashup_CacheDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Mashup#getSourceIdentCounter <em>Source Ident Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ident Counter</em>'.
	 * @see org.sociotech.communitymashup.application.Mashup#getSourceIdentCounter()
	 * @see #getMashup()
	 * @generated
	 */
	EAttribute getMashup_SourceIdentCounter();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.Mashup#getNewSourceIdent() <em>Get New Source Ident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Source Ident</em>' operation.
	 * @see org.sociotech.communitymashup.application.Mashup#getNewSourceIdent()
	 * @generated
	 */
	EOperation getMashup__GetNewSourceIdent();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.Mashup#getSourceWithIdent(java.lang.String) <em>Get Source With Ident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source With Ident</em>' operation.
	 * @see org.sociotech.communitymashup.application.Mashup#getSourceWithIdent(java.lang.String)
	 * @generated
	 */
	EOperation getMashup__GetSourceWithIdent__String();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.MappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rule</em>'.
	 * @see org.sociotech.communitymashup.application.MappingRule
	 * @generated
	 */
	EClass getMappingRule();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.sociotech.communitymashup.application.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.application.Configuration#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.sociotech.communitymashup.application.Configuration#getProperties()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Properties();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.Persistency <em>Persistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistency</em>'.
	 * @see org.sociotech.communitymashup.application.Persistency
	 * @generated
	 */
	EClass getPersistency();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.XMLFile <em>XML File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML File</em>'.
	 * @see org.sociotech.communitymashup.application.XMLFile
	 * @generated
	 */
	EClass getXMLFile();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see org.sociotech.communitymashup.application.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.sociotech.communitymashup.application.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.sociotech.communitymashup.application.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.sociotech.communitymashup.application.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Property#getHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.sociotech.communitymashup.application.Property#getHidden()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Property#getChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see org.sociotech.communitymashup.application.Property#getChangeable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Changeable();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Property#getPossibleValues <em>Possible Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Possible Values</em>'.
	 * @see org.sociotech.communitymashup.application.Property#getPossibleValues()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_PossibleValues();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Property#getHelpText <em>Help Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help Text</em>'.
	 * @see org.sociotech.communitymashup.application.Property#getHelpText()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_HelpText();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Property#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see org.sociotech.communitymashup.application.Property#getRequired()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Required();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Property#getPropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Type</em>'.
	 * @see org.sociotech.communitymashup.application.Property#getPropertyType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_PropertyType();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.Property#isValueList() <em>Is Value List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Value List</em>' operation.
	 * @see org.sociotech.communitymashup.application.Property#isValueList()
	 * @generated
	 */
	EOperation getProperty__IsValueList();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.Property#isValueRange() <em>Is Value Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Value Range</em>' operation.
	 * @see org.sociotech.communitymashup.application.Property#isValueRange()
	 * @generated
	 */
	EOperation getProperty__IsValueRange();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.Property#getListOfValues() <em>Get List Of Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get List Of Values</em>' operation.
	 * @see org.sociotech.communitymashup.application.Property#getListOfValues()
	 * @generated
	 */
	EOperation getProperty__GetListOfValues();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.Property#getMinValue() <em>Get Min Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Min Value</em>' operation.
	 * @see org.sociotech.communitymashup.application.Property#getMinValue()
	 * @generated
	 */
	EOperation getProperty__GetMinValue();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.Property#getMaxValue() <em>Get Max Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Max Value</em>' operation.
	 * @see org.sociotech.communitymashup.application.Property#getMaxValue()
	 * @generated
	 */
	EOperation getProperty__GetMaxValue();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.OCLRestrictedProperty <em>OCL Restricted Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OCL Restricted Property</em>'.
	 * @see org.sociotech.communitymashup.application.OCLRestrictedProperty
	 * @generated
	 */
	EClass getOCLRestrictedProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OCLRestrictedProperty#getOCLRestriction <em>OCL Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OCL Restriction</em>'.
	 * @see org.sociotech.communitymashup.application.OCLRestrictedProperty#getOCLRestriction()
	 * @see #getOCLRestrictedProperty()
	 * @generated
	 */
	EAttribute getOCLRestrictedProperty_OCLRestriction();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.MashupContainer <em>Mashup Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mashup Container</em>'.
	 * @see org.sociotech.communitymashup.application.MashupContainer
	 * @generated
	 */
	EClass getMashupContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.application.MashupContainer#getMashups <em>Mashups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mashups</em>'.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getMashups()
	 * @see #getMashupContainer()
	 * @generated
	 */
	EReference getMashupContainer_Mashups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.application.MashupContainer#getAllMashupAdmins <em>All Mashup Admins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>All Mashup Admins</em>'.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getAllMashupAdmins()
	 * @see #getMashupContainer()
	 * @generated
	 */
	EReference getMashupContainer_AllMashupAdmins();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupContainer#getBackupConfiguration <em>Backup Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backup Configuration</em>'.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getBackupConfiguration()
	 * @see #getMashupContainer()
	 * @generated
	 */
	EAttribute getMashupContainer_BackupConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupContainer#getBackupIntervall <em>Backup Intervall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backup Intervall</em>'.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getBackupIntervall()
	 * @see #getMashupContainer()
	 * @generated
	 */
	EAttribute getMashupContainer_BackupIntervall();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.application.MashupContainer#getDefaultMashups <em>Default Mashups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Mashups</em>'.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getDefaultMashups()
	 * @see #getMashupContainer()
	 * @generated
	 */
	EReference getMashupContainer_DefaultMashups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.application.MashupContainer#getSourceConfigurations <em>Source Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Configurations</em>'.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getSourceConfigurations()
	 * @see #getMashupContainer()
	 * @generated
	 */
	EReference getMashupContainer_SourceConfigurations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.application.MashupContainer#getInterfaceConfigurations <em>Interface Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface Configurations</em>'.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getInterfaceConfigurations()
	 * @see #getMashupContainer()
	 * @generated
	 */
	EReference getMashupContainer_InterfaceConfigurations();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupContainer#getImmediateSave <em>Immediate Save</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate Save</em>'.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getImmediateSave()
	 * @see #getMashupContainer()
	 * @generated
	 */
	EAttribute getMashupContainer_ImmediateSave();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupContainer#getCreateAccountsAtLoginTry <em>Create Accounts At Login Try</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create Accounts At Login Try</em>'.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getCreateAccountsAtLoginTry()
	 * @see #getMashupContainer()
	 * @generated
	 */
	EAttribute getMashupContainer_CreateAccountsAtLoginTry();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupContainer#getIdentCounter <em>Ident Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ident Counter</em>'.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getIdentCounter()
	 * @see #getMashupContainer()
	 * @generated
	 */
	EAttribute getMashupContainer_IdentCounter();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.MashupContainer#getConfigurationAdmins() <em>Get Configuration Admins</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Configuration Admins</em>' operation.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getConfigurationAdmins()
	 * @generated
	 */
	EOperation getMashupContainer__GetConfigurationAdmins();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.MashupContainer#setNewIdentFor(org.sociotech.communitymashup.application.ConfigurableElement) <em>Set New Ident For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set New Ident For</em>' operation.
	 * @see org.sociotech.communitymashup.application.MashupContainer#setNewIdentFor(org.sociotech.communitymashup.application.ConfigurableElement)
	 * @generated
	 */
	EOperation getMashupContainer__SetNewIdentFor__ConfigurableElement();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.MashupContainer#getNewIdentNumber() <em>Get New Ident Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get New Ident Number</em>' operation.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getNewIdentNumber()
	 * @generated
	 */
	EOperation getMashupContainer__GetNewIdentNumber();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.MashupContainer#getMashupWithIdent(java.lang.String) <em>Get Mashup With Ident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Mashup With Ident</em>' operation.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getMashupWithIdent(java.lang.String)
	 * @generated
	 */
	EOperation getMashupContainer__GetMashupWithIdent__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.MashupContainer#getSourceConfigurationWithIdent(java.lang.String) <em>Get Source Configuration With Ident</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Configuration With Ident</em>' operation.
	 * @see org.sociotech.communitymashup.application.MashupContainer#getSourceConfigurationWithIdent(java.lang.String)
	 * @generated
	 */
	EOperation getMashupContainer__GetSourceConfigurationWithIdent__String();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see org.sociotech.communitymashup.application.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference '{@link org.sociotech.communitymashup.application.Interface#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security</em>'.
	 * @see org.sociotech.communitymashup.application.Interface#getSecurity()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Security();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Interface#getUrlSuffix <em>Url Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Suffix</em>'.
	 * @see org.sociotech.communitymashup.application.Interface#getUrlSuffix()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_UrlSuffix();

	/**
	 * Returns the meta object for the container reference '{@link org.sociotech.communitymashup.application.Interface#getMashup <em>Mashup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Mashup</em>'.
	 * @see org.sociotech.communitymashup.application.Interface#getMashup()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Mashup();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.Interface#getFrontEndCaching <em>Front End Caching</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Front End Caching</em>'.
	 * @see org.sociotech.communitymashup.application.Interface#getFrontEndCaching()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_FrontEndCaching();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.RESTInterface <em>REST Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST Interface</em>'.
	 * @see org.sociotech.communitymashup.application.RESTInterface
	 * @generated
	 */
	EClass getRESTInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.RESTInterface#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.sociotech.communitymashup.application.RESTInterface#getType()
	 * @see #getRESTInterface()
	 * @generated
	 */
	EAttribute getRESTInterface_Type();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.FEEDInterface <em>FEED Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FEED Interface</em>'.
	 * @see org.sociotech.communitymashup.application.FEEDInterface
	 * @generated
	 */
	EClass getFEEDInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowPersonFiltering <em>Allow Person Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Person Filtering</em>'.
	 * @see org.sociotech.communitymashup.application.FEEDInterface#getAllowPersonFiltering()
	 * @see #getFEEDInterface()
	 * @generated
	 */
	EAttribute getFEEDInterface_AllowPersonFiltering();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowOrganisationFiltering <em>Allow Organisation Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Organisation Filtering</em>'.
	 * @see org.sociotech.communitymashup.application.FEEDInterface#getAllowOrganisationFiltering()
	 * @see #getFEEDInterface()
	 * @generated
	 */
	EAttribute getFEEDInterface_AllowOrganisationFiltering();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowTypeFiltering <em>Allow Type Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Type Filtering</em>'.
	 * @see org.sociotech.communitymashup.application.FEEDInterface#getAllowTypeFiltering()
	 * @see #getFEEDInterface()
	 * @generated
	 */
	EAttribute getFEEDInterface_AllowTypeFiltering();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowTagFiltering <em>Allow Tag Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Tag Filtering</em>'.
	 * @see org.sociotech.communitymashup.application.FEEDInterface#getAllowTagFiltering()
	 * @see #getFEEDInterface()
	 * @generated
	 */
	EAttribute getFEEDInterface_AllowTagFiltering();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowMetaTagFiltering <em>Allow Meta Tag Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Meta Tag Filtering</em>'.
	 * @see org.sociotech.communitymashup.application.FEEDInterface#getAllowMetaTagFiltering()
	 * @see #getFEEDInterface()
	 * @generated
	 */
	EAttribute getFEEDInterface_AllowMetaTagFiltering();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowCategoryFiltering <em>Allow Category Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Category Filtering</em>'.
	 * @see org.sociotech.communitymashup.application.FEEDInterface#getAllowCategoryFiltering()
	 * @see #getFEEDInterface()
	 * @generated
	 */
	EAttribute getFEEDInterface_AllowCategoryFiltering();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.FEEDInterface#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.sociotech.communitymashup.application.FEEDInterface#getLanguage()
	 * @see #getFEEDInterface()
	 * @generated
	 */
	EAttribute getFEEDInterface_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.FEEDInterface#getFeedType <em>Feed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Type</em>'.
	 * @see org.sociotech.communitymashup.application.FEEDInterface#getFeedType()
	 * @see #getFEEDInterface()
	 * @generated
	 */
	EAttribute getFEEDInterface_FeedType();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.FEEDInterface#getFeedTitle <em>Feed Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Title</em>'.
	 * @see org.sociotech.communitymashup.application.FEEDInterface#getFeedTitle()
	 * @see #getFEEDInterface()
	 * @generated
	 */
	EAttribute getFEEDInterface_FeedTitle();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see org.sociotech.communitymashup.application.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for the container reference '{@link org.sociotech.communitymashup.application.Security#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Interface</em>'.
	 * @see org.sociotech.communitymashup.application.Security#getInterface()
	 * @see #getSecurity()
	 * @generated
	 */
	EReference getSecurity_Interface();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.OAuthConfig <em>OAuth Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth Config</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthConfig
	 * @generated
	 */
	EClass getOAuthConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.application.OAuthConfig#getClients <em>Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clients</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthConfig#getClients()
	 * @see #getOAuthConfig()
	 * @generated
	 */
	EReference getOAuthConfig_Clients();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sociotech.communitymashup.application.OAuthConfig#getAdmins <em>Admins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Admins</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthConfig#getAdmins()
	 * @see #getOAuthConfig()
	 * @generated
	 */
	EReference getOAuthConfig_Admins();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthConfig#getUseScopeInterfaceOnRedirect <em>Use Scope Interface On Redirect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Scope Interface On Redirect</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthConfig#getUseScopeInterfaceOnRedirect()
	 * @see #getOAuthConfig()
	 * @generated
	 */
	EAttribute getOAuthConfig_UseScopeInterfaceOnRedirect();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.ApplicationKeyConfig <em>Key Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Config</em>'.
	 * @see org.sociotech.communitymashup.application.ApplicationKeyConfig
	 * @generated
	 */
	EClass getApplicationKeyConfig();

	/**
	 * Returns the meta object for the attribute list '{@link org.sociotech.communitymashup.application.ApplicationKeyConfig#getApplicationKeys <em>Application Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Application Keys</em>'.
	 * @see org.sociotech.communitymashup.application.ApplicationKeyConfig#getApplicationKeys()
	 * @see #getApplicationKeyConfig()
	 * @generated
	 */
	EAttribute getApplicationKeyConfig_ApplicationKeys();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.ApplicationKeyConfig#hasApplicationKey(java.lang.String) <em>Has Application Key</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Application Key</em>' operation.
	 * @see org.sociotech.communitymashup.application.ApplicationKeyConfig#hasApplicationKey(java.lang.String)
	 * @generated
	 */
	EOperation getApplicationKeyConfig__HasApplicationKey__String();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.OAuthClientConfig <em>OAuth Client Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth Client Config</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig
	 * @generated
	 */
	EClass getOAuthClientConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getType()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getRedirectionURL <em>Redirection URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redirection URL</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getRedirectionURL()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_RedirectionURL();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getName()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getDescription()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getClientID <em>Client ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client ID</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getClientID()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_ClientID();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getClientSecret <em>Client Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Secret</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getClientSecret()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_ClientSecret();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getCode()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getGrantType <em>Grant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grant Type</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getGrantType()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_GrantType();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getRefreshToken <em>Refresh Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Token</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getRefreshToken()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_RefreshToken();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAccessToken <em>Access Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getAccessToken()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_AccessToken();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAccessTokenCreationDate <em>Access Token Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token Creation Date</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getAccessTokenCreationDate()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_AccessTokenCreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAccessTokenExpirationDate <em>Access Token Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Token Expiration Date</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getAccessTokenExpirationDate()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_AccessTokenExpirationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getForbiddenMetaTags <em>Forbidden Meta Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forbidden Meta Tags</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getForbiddenMetaTags()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_ForbiddenMetaTags();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAllowedMetaTags <em>Allowed Meta Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Meta Tags</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getAllowedMetaTags()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_AllowedMetaTags();

	/**
	 * Returns the meta object for the containment reference '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getClientScope <em>Client Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Client Scope</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getClientScope()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EReference getOAuthClientConfig_ClientScope();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getOAuthScopeLevel <em>OAuth Scope Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OAuth Scope Level</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig#getOAuthScopeLevel()
	 * @see #getOAuthClientConfig()
	 * @generated
	 */
	EAttribute getOAuthClientConfig_OAuthScopeLevel();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.OAuthAdmin <em>OAuth Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth Admin</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthAdmin
	 * @generated
	 */
	EClass getOAuthAdmin();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthAdmin#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthAdmin#getUsername()
	 * @see #getOAuthAdmin()
	 * @generated
	 */
	EAttribute getOAuthAdmin_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthAdmin#getPasswordHash <em>Password Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password Hash</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthAdmin#getPasswordHash()
	 * @see #getOAuthAdmin()
	 * @generated
	 */
	EAttribute getOAuthAdmin_PasswordHash();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.OAuthClientScope <em>OAuth Client Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OAuth Client Scope</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope
	 * @generated
	 */
	EClass getOAuthClientScope();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveTag <em>Positive Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Tag</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getPositiveTag()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_PositiveTag();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeTag <em>Negative Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative Tag</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getNegativeTag()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_NegativeTag();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveMetaTag <em>Positive Meta Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Meta Tag</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getPositiveMetaTag()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_PositiveMetaTag();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeMetaTag <em>Negative Meta Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative Meta Tag</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getNegativeMetaTag()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_NegativeMetaTag();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveCategory <em>Positive Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Category</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getPositiveCategory()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_PositiveCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeCategory <em>Negative Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative Category</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getNegativeCategory()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_NegativeCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositivePerson <em>Positive Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Person</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getPositivePerson()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_PositivePerson();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativePerson <em>Negative Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative Person</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getNegativePerson()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_NegativePerson();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveOrganisation <em>Positive Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive Organisation</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getPositiveOrganisation()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_PositiveOrganisation();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeOrganisation <em>Negative Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negative Organisation</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getNegativeOrganisation()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_NegativeOrganisation();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getIdentSpecification <em>Ident Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ident Specification</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getIdentSpecification()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_IdentSpecification();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getAllowPersons <em>Allow Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Persons</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getAllowPersons()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_AllowPersons();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getAllowContents <em>Allow Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Contents</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getAllowContents()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_AllowContents();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getAllowOrganisations <em>Allow Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Organisations</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getAllowOrganisations()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_AllowOrganisations();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.OAuthClientScope#getMaximumAge <em>Maximum Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Age</em>'.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope#getMaximumAge()
	 * @see #getOAuthClientScope()
	 * @generated
	 */
	EAttribute getOAuthClientScope_MaximumAge();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.MashupAdmin <em>Mashup Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mashup Admin</em>'.
	 * @see org.sociotech.communitymashup.application.MashupAdmin
	 * @generated
	 */
	EClass getMashupAdmin();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupAdmin#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see org.sociotech.communitymashup.application.MashupAdmin#getProvider()
	 * @see #getMashupAdmin()
	 * @generated
	 */
	EAttribute getMashupAdmin_Provider();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupAdmin#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.sociotech.communitymashup.application.MashupAdmin#getId()
	 * @see #getMashupAdmin()
	 * @generated
	 */
	EAttribute getMashupAdmin_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.sociotech.communitymashup.application.MashupAdmin#getConfigurableMashups <em>Configurable Mashups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Configurable Mashups</em>'.
	 * @see org.sociotech.communitymashup.application.MashupAdmin#getConfigurableMashups()
	 * @see #getMashupAdmin()
	 * @generated
	 */
	EReference getMashupAdmin_ConfigurableMashups();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupAdmin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.sociotech.communitymashup.application.MashupAdmin#getName()
	 * @see #getMashupAdmin()
	 * @generated
	 */
	EAttribute getMashupAdmin_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupAdmin#getLocalIdent <em>Local Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Ident</em>'.
	 * @see org.sociotech.communitymashup.application.MashupAdmin#getLocalIdent()
	 * @see #getMashupAdmin()
	 * @generated
	 */
	EAttribute getMashupAdmin_LocalIdent();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupAdmin#getIsConfigurationAdmin <em>Is Configuration Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Configuration Admin</em>'.
	 * @see org.sociotech.communitymashup.application.MashupAdmin#getIsConfigurationAdmin()
	 * @see #getMashupAdmin()
	 * @generated
	 */
	EAttribute getMashupAdmin_IsConfigurationAdmin();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupAdmin#getProfileImage <em>Profile Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Image</em>'.
	 * @see org.sociotech.communitymashup.application.MashupAdmin#getProfileImage()
	 * @see #getMashupAdmin()
	 * @generated
	 */
	EAttribute getMashupAdmin_ProfileImage();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.MashupAdmin#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.sociotech.communitymashup.application.MashupAdmin#getEmail()
	 * @see #getMashupAdmin()
	 * @generated
	 */
	EAttribute getMashupAdmin_Email();

	/**
	 * Returns the meta object for class '{@link org.sociotech.communitymashup.application.ConfigurableElement <em>Configurable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configurable Element</em>'.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement
	 * @generated
	 */
	EClass getConfigurableElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.sociotech.communitymashup.application.ConfigurableElement#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#getConfiguration()
	 * @see #getConfigurableElement()
	 * @generated
	 */
	EReference getConfigurableElement_Configuration();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.ConfigurableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#getName()
	 * @see #getConfigurableElement()
	 * @generated
	 */
	EAttribute getConfigurableElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.ConfigurableElement#getConfigurationImage <em>Configuration Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Configuration Image</em>'.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#getConfigurationImage()
	 * @see #getConfigurableElement()
	 * @generated
	 */
	EAttribute getConfigurableElement_ConfigurationImage();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.ConfigurableElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#getDescription()
	 * @see #getConfigurableElement()
	 * @generated
	 */
	EAttribute getConfigurableElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.ConfigurableElement#getChangeable <em>Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changeable</em>'.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#getChangeable()
	 * @see #getConfigurableElement()
	 * @generated
	 */
	EAttribute getConfigurableElement_Changeable();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.ConfigurableElement#getHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#getHidden()
	 * @see #getConfigurableElement()
	 * @generated
	 */
	EAttribute getConfigurableElement_Hidden();

	/**
	 * Returns the meta object for the attribute '{@link org.sociotech.communitymashup.application.ConfigurableElement#getIdent <em>Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ident</em>'.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#getIdent()
	 * @see #getConfigurableElement()
	 * @generated
	 */
	EAttribute getConfigurableElement_Ident();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.ConfigurableElement#getProperty(java.lang.String) <em>Get Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Property</em>' operation.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#getProperty(java.lang.String)
	 * @generated
	 */
	EOperation getConfigurableElement__GetProperty__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.ConfigurableElement#addProperty(java.lang.String, java.lang.String) <em>Add Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Property</em>' operation.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#addProperty(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getConfigurableElement__AddProperty__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.ConfigurableElement#addProperty(org.sociotech.communitymashup.application.Property) <em>Add Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Property</em>' operation.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#addProperty(org.sociotech.communitymashup.application.Property)
	 * @generated
	 */
	EOperation getConfigurableElement__AddProperty__Property();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.ConfigurableElement#getPropertyValue(java.lang.String) <em>Get Property Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Property Value</em>' operation.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#getPropertyValue(java.lang.String)
	 * @generated
	 */
	EOperation getConfigurableElement__GetPropertyValue__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.ConfigurableElement#isPropertyTrue(java.lang.String) <em>Is Property True</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Property True</em>' operation.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#isPropertyTrue(java.lang.String)
	 * @generated
	 */
	EOperation getConfigurableElement__IsPropertyTrue__String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.ConfigurableElement#getPropertyValueElseDefault(java.lang.String, java.lang.String) <em>Get Property Value Else Default</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Property Value Else Default</em>' operation.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#getPropertyValueElseDefault(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getConfigurableElement__GetPropertyValueElseDefault__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.ConfigurableElement#isPropertyTrueElseDefault(java.lang.String, java.lang.String) <em>Is Property True Else Default</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Property True Else Default</em>' operation.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#isPropertyTrueElseDefault(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getConfigurableElement__IsPropertyTrueElseDefault__String_String();

	/**
	 * Returns the meta object for the '{@link org.sociotech.communitymashup.application.ConfigurableElement#removeProperty(java.lang.String) <em>Remove Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Property</em>' operation.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement#removeProperty(java.lang.String)
	 * @generated
	 */
	EOperation getConfigurableElement__RemoveProperty__String();

	/**
	 * Returns the meta object for enum '{@link org.sociotech.communitymashup.application.SourceState <em>Source State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source State</em>'.
	 * @see org.sociotech.communitymashup.application.SourceState
	 * @generated
	 */
	EEnum getSourceState();

	/**
	 * Returns the meta object for enum '{@link org.sociotech.communitymashup.application.SourceActiveStates <em>Source Active States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Active States</em>'.
	 * @see org.sociotech.communitymashup.application.SourceActiveStates
	 * @generated
	 */
	EEnum getSourceActiveStates();

	/**
	 * Returns the meta object for enum '{@link org.sociotech.communitymashup.application.PropertyTypes <em>Property Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Types</em>'.
	 * @see org.sociotech.communitymashup.application.PropertyTypes
	 * @generated
	 */
	EEnum getPropertyTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApplicationFactory getApplicationFactory();

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
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.SourceImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Persistency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__PERSISTENCY = eINSTANCE.getSource_Persistency();

		/**
		 * The meta object literal for the '<em><b>Data Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__DATA_SET = eINSTANCE.getSource_DataSet();

		/**
		 * The meta object literal for the '<em><b>Bundle Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__BUNDLE_ID = eINSTANCE.getSource_BundleId();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__STATE = eINSTANCE.getSource_State();

		/**
		 * The meta object literal for the '<em><b>Active State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__ACTIVE_STATE = eINSTANCE.getSource_ActiveState();

		/**
		 * The meta object literal for the '<em><b>Log Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__LOG_LEVEL = eINSTANCE.getSource_LogLevel();

		/**
		 * The meta object literal for the '<em><b>Mashup</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__MASHUP = eINSTANCE.getSource_Mashup();

		/**
		 * The meta object literal for the '<em><b>Remove Data On Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__REMOVE_DATA_ON_STOP = eINSTANCE.getSource_RemoveDataOnStop();

		/**
		 * The meta object literal for the '<em><b>Update Round</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__UPDATE_ROUND = eINSTANCE.getSource_UpdateRound();

		/**
		 * The meta object literal for the '<em><b>Get Log Level Int Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___GET_LOG_LEVEL_INT_VALUE = eINSTANCE.getSource__GetLogLevelIntValue();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___START = eINSTANCE.getSource__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___STOP = eINSTANCE.getSource__Stop();

		/**
		 * The meta object literal for the '<em><b>Pause</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SOURCE___PAUSE = eINSTANCE.getSource__Pause();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.MashupImpl <em>Mashup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.MashupImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getMashup()
		 * @generated
		 */
		EClass MASHUP = eINSTANCE.getMashup();

		/**
		 * The meta object literal for the '<em><b>Mapping Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASHUP__MAPPING_RULES = eINSTANCE.getMashup_MappingRules();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASHUP__SOURCES = eINSTANCE.getMashup_Sources();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASHUP__INTERFACES = eINSTANCE.getMashup_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Mashup Admins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASHUP__MASHUP_ADMINS = eINSTANCE.getMashup_MashupAdmins();

		/**
		 * The meta object literal for the '<em><b>Working Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP__WORKING_DIRECTORY = eINSTANCE.getMashup_WorkingDirectory();

		/**
		 * The meta object literal for the '<em><b>Cache Attachments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP__CACHE_ATTACHMENTS = eINSTANCE.getMashup_CacheAttachments();

		/**
		 * The meta object literal for the '<em><b>Cache Data Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP__CACHE_DATA_SET = eINSTANCE.getMashup_CacheDataSet();

		/**
		 * The meta object literal for the '<em><b>Backup Data Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP__BACKUP_DATA_SET = eINSTANCE.getMashup_BackupDataSet();

		/**
		 * The meta object literal for the '<em><b>Backup Intervall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP__BACKUP_INTERVALL = eINSTANCE.getMashup_BackupIntervall();

		/**
		 * The meta object literal for the '<em><b>Cache Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP__CACHE_DELAY = eINSTANCE.getMashup_CacheDelay();

		/**
		 * The meta object literal for the '<em><b>Source Ident Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP__SOURCE_IDENT_COUNTER = eINSTANCE.getMashup_SourceIdentCounter();

		/**
		 * The meta object literal for the '<em><b>Get New Source Ident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASHUP___GET_NEW_SOURCE_IDENT = eINSTANCE.getMashup__GetNewSourceIdent();

		/**
		 * The meta object literal for the '<em><b>Get Source With Ident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASHUP___GET_SOURCE_WITH_IDENT__STRING = eINSTANCE.getMashup__GetSourceWithIdent__String();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.MappingRuleImpl <em>Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.MappingRuleImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getMappingRule()
		 * @generated
		 */
		EClass MAPPING_RULE = eINSTANCE.getMappingRule();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.ConfigurationImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PROPERTIES = eINSTANCE.getConfiguration_Properties();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.PersistencyImpl <em>Persistency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.PersistencyImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getPersistency()
		 * @generated
		 */
		EClass PERSISTENCY = eINSTANCE.getPersistency();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.XMLFileImpl <em>XML File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.XMLFileImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getXMLFile()
		 * @generated
		 */
		EClass XML_FILE = eINSTANCE.getXMLFile();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.DatabaseImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.PropertyImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__HIDDEN = eINSTANCE.getProperty_Hidden();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__CHANGEABLE = eINSTANCE.getProperty_Changeable();

		/**
		 * The meta object literal for the '<em><b>Possible Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__POSSIBLE_VALUES = eINSTANCE.getProperty_PossibleValues();

		/**
		 * The meta object literal for the '<em><b>Help Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__HELP_TEXT = eINSTANCE.getProperty_HelpText();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__REQUIRED = eINSTANCE.getProperty_Required();

		/**
		 * The meta object literal for the '<em><b>Property Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PROPERTY_TYPE = eINSTANCE.getProperty_PropertyType();

		/**
		 * The meta object literal for the '<em><b>Is Value List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___IS_VALUE_LIST = eINSTANCE.getProperty__IsValueList();

		/**
		 * The meta object literal for the '<em><b>Is Value Range</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___IS_VALUE_RANGE = eINSTANCE.getProperty__IsValueRange();

		/**
		 * The meta object literal for the '<em><b>Get List Of Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___GET_LIST_OF_VALUES = eINSTANCE.getProperty__GetListOfValues();

		/**
		 * The meta object literal for the '<em><b>Get Min Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___GET_MIN_VALUE = eINSTANCE.getProperty__GetMinValue();

		/**
		 * The meta object literal for the '<em><b>Get Max Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPERTY___GET_MAX_VALUE = eINSTANCE.getProperty__GetMaxValue();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.OCLRestrictedPropertyImpl <em>OCL Restricted Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.OCLRestrictedPropertyImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getOCLRestrictedProperty()
		 * @generated
		 */
		EClass OCL_RESTRICTED_PROPERTY = eINSTANCE.getOCLRestrictedProperty();

		/**
		 * The meta object literal for the '<em><b>OCL Restriction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCL_RESTRICTED_PROPERTY__OCL_RESTRICTION = eINSTANCE.getOCLRestrictedProperty_OCLRestriction();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.MashupContainerImpl <em>Mashup Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.MashupContainerImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getMashupContainer()
		 * @generated
		 */
		EClass MASHUP_CONTAINER = eINSTANCE.getMashupContainer();

		/**
		 * The meta object literal for the '<em><b>Mashups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASHUP_CONTAINER__MASHUPS = eINSTANCE.getMashupContainer_Mashups();

		/**
		 * The meta object literal for the '<em><b>All Mashup Admins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASHUP_CONTAINER__ALL_MASHUP_ADMINS = eINSTANCE.getMashupContainer_AllMashupAdmins();

		/**
		 * The meta object literal for the '<em><b>Backup Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_CONTAINER__BACKUP_CONFIGURATION = eINSTANCE.getMashupContainer_BackupConfiguration();

		/**
		 * The meta object literal for the '<em><b>Backup Intervall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_CONTAINER__BACKUP_INTERVALL = eINSTANCE.getMashupContainer_BackupIntervall();

		/**
		 * The meta object literal for the '<em><b>Default Mashups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASHUP_CONTAINER__DEFAULT_MASHUPS = eINSTANCE.getMashupContainer_DefaultMashups();

		/**
		 * The meta object literal for the '<em><b>Source Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASHUP_CONTAINER__SOURCE_CONFIGURATIONS = eINSTANCE.getMashupContainer_SourceConfigurations();

		/**
		 * The meta object literal for the '<em><b>Interface Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASHUP_CONTAINER__INTERFACE_CONFIGURATIONS = eINSTANCE.getMashupContainer_InterfaceConfigurations();

		/**
		 * The meta object literal for the '<em><b>Immediate Save</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_CONTAINER__IMMEDIATE_SAVE = eINSTANCE.getMashupContainer_ImmediateSave();

		/**
		 * The meta object literal for the '<em><b>Create Accounts At Login Try</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_CONTAINER__CREATE_ACCOUNTS_AT_LOGIN_TRY = eINSTANCE.getMashupContainer_CreateAccountsAtLoginTry();

		/**
		 * The meta object literal for the '<em><b>Ident Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_CONTAINER__IDENT_COUNTER = eINSTANCE.getMashupContainer_IdentCounter();

		/**
		 * The meta object literal for the '<em><b>Get Configuration Admins</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASHUP_CONTAINER___GET_CONFIGURATION_ADMINS = eINSTANCE.getMashupContainer__GetConfigurationAdmins();

		/**
		 * The meta object literal for the '<em><b>Set New Ident For</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASHUP_CONTAINER___SET_NEW_IDENT_FOR__CONFIGURABLEELEMENT = eINSTANCE.getMashupContainer__SetNewIdentFor__ConfigurableElement();

		/**
		 * The meta object literal for the '<em><b>Get New Ident Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASHUP_CONTAINER___GET_NEW_IDENT_NUMBER = eINSTANCE.getMashupContainer__GetNewIdentNumber();

		/**
		 * The meta object literal for the '<em><b>Get Mashup With Ident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASHUP_CONTAINER___GET_MASHUP_WITH_IDENT__STRING = eINSTANCE.getMashupContainer__GetMashupWithIdent__String();

		/**
		 * The meta object literal for the '<em><b>Get Source Configuration With Ident</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MASHUP_CONTAINER___GET_SOURCE_CONFIGURATION_WITH_IDENT__STRING = eINSTANCE.getMashupContainer__GetSourceConfigurationWithIdent__String();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.InterfaceImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__SECURITY = eINSTANCE.getInterface_Security();

		/**
		 * The meta object literal for the '<em><b>Url Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__URL_SUFFIX = eINSTANCE.getInterface_UrlSuffix();

		/**
		 * The meta object literal for the '<em><b>Mashup</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__MASHUP = eINSTANCE.getInterface_Mashup();

		/**
		 * The meta object literal for the '<em><b>Front End Caching</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__FRONT_END_CACHING = eINSTANCE.getInterface_FrontEndCaching();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.RESTInterfaceImpl <em>REST Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.RESTInterfaceImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getRESTInterface()
		 * @generated
		 */
		EClass REST_INTERFACE = eINSTANCE.getRESTInterface();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REST_INTERFACE__TYPE = eINSTANCE.getRESTInterface_Type();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl <em>FEED Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getFEEDInterface()
		 * @generated
		 */
		EClass FEED_INTERFACE = eINSTANCE.getFEEDInterface();

		/**
		 * The meta object literal for the '<em><b>Allow Person Filtering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_INTERFACE__ALLOW_PERSON_FILTERING = eINSTANCE.getFEEDInterface_AllowPersonFiltering();

		/**
		 * The meta object literal for the '<em><b>Allow Organisation Filtering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_INTERFACE__ALLOW_ORGANISATION_FILTERING = eINSTANCE.getFEEDInterface_AllowOrganisationFiltering();

		/**
		 * The meta object literal for the '<em><b>Allow Type Filtering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_INTERFACE__ALLOW_TYPE_FILTERING = eINSTANCE.getFEEDInterface_AllowTypeFiltering();

		/**
		 * The meta object literal for the '<em><b>Allow Tag Filtering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_INTERFACE__ALLOW_TAG_FILTERING = eINSTANCE.getFEEDInterface_AllowTagFiltering();

		/**
		 * The meta object literal for the '<em><b>Allow Meta Tag Filtering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_INTERFACE__ALLOW_META_TAG_FILTERING = eINSTANCE.getFEEDInterface_AllowMetaTagFiltering();

		/**
		 * The meta object literal for the '<em><b>Allow Category Filtering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_INTERFACE__ALLOW_CATEGORY_FILTERING = eINSTANCE.getFEEDInterface_AllowCategoryFiltering();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_INTERFACE__LANGUAGE = eINSTANCE.getFEEDInterface_Language();

		/**
		 * The meta object literal for the '<em><b>Feed Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_INTERFACE__FEED_TYPE = eINSTANCE.getFEEDInterface_FeedType();

		/**
		 * The meta object literal for the '<em><b>Feed Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEED_INTERFACE__FEED_TITLE = eINSTANCE.getFEEDInterface_FeedTitle();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.SecurityImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY__INTERFACE = eINSTANCE.getSecurity_Interface();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.OAuthConfigImpl <em>OAuth Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.OAuthConfigImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getOAuthConfig()
		 * @generated
		 */
		EClass OAUTH_CONFIG = eINSTANCE.getOAuthConfig();

		/**
		 * The meta object literal for the '<em><b>Clients</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH_CONFIG__CLIENTS = eINSTANCE.getOAuthConfig_Clients();

		/**
		 * The meta object literal for the '<em><b>Admins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH_CONFIG__ADMINS = eINSTANCE.getOAuthConfig_Admins();

		/**
		 * The meta object literal for the '<em><b>Use Scope Interface On Redirect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CONFIG__USE_SCOPE_INTERFACE_ON_REDIRECT = eINSTANCE.getOAuthConfig_UseScopeInterfaceOnRedirect();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.ApplicationKeyConfigImpl <em>Key Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.ApplicationKeyConfigImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getApplicationKeyConfig()
		 * @generated
		 */
		EClass APPLICATION_KEY_CONFIG = eINSTANCE.getApplicationKeyConfig();

		/**
		 * The meta object literal for the '<em><b>Application Keys</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION_KEY_CONFIG__APPLICATION_KEYS = eINSTANCE.getApplicationKeyConfig_ApplicationKeys();

		/**
		 * The meta object literal for the '<em><b>Has Application Key</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION_KEY_CONFIG___HAS_APPLICATION_KEY__STRING = eINSTANCE.getApplicationKeyConfig__HasApplicationKey__String();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl <em>OAuth Client Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getOAuthClientConfig()
		 * @generated
		 */
		EClass OAUTH_CLIENT_CONFIG = eINSTANCE.getOAuthClientConfig();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__TYPE = eINSTANCE.getOAuthClientConfig_Type();

		/**
		 * The meta object literal for the '<em><b>Redirection URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__REDIRECTION_URL = eINSTANCE.getOAuthClientConfig_RedirectionURL();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__NAME = eINSTANCE.getOAuthClientConfig_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__DESCRIPTION = eINSTANCE.getOAuthClientConfig_Description();

		/**
		 * The meta object literal for the '<em><b>Client ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__CLIENT_ID = eINSTANCE.getOAuthClientConfig_ClientID();

		/**
		 * The meta object literal for the '<em><b>Client Secret</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__CLIENT_SECRET = eINSTANCE.getOAuthClientConfig_ClientSecret();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__CODE = eINSTANCE.getOAuthClientConfig_Code();

		/**
		 * The meta object literal for the '<em><b>Grant Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__GRANT_TYPE = eINSTANCE.getOAuthClientConfig_GrantType();

		/**
		 * The meta object literal for the '<em><b>Refresh Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__REFRESH_TOKEN = eINSTANCE.getOAuthClientConfig_RefreshToken();

		/**
		 * The meta object literal for the '<em><b>Access Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__ACCESS_TOKEN = eINSTANCE.getOAuthClientConfig_AccessToken();

		/**
		 * The meta object literal for the '<em><b>Access Token Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_CREATION_DATE = eINSTANCE.getOAuthClientConfig_AccessTokenCreationDate();

		/**
		 * The meta object literal for the '<em><b>Access Token Expiration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_EXPIRATION_DATE = eINSTANCE.getOAuthClientConfig_AccessTokenExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Forbidden Meta Tags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__FORBIDDEN_META_TAGS = eINSTANCE.getOAuthClientConfig_ForbiddenMetaTags();

		/**
		 * The meta object literal for the '<em><b>Allowed Meta Tags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__ALLOWED_META_TAGS = eINSTANCE.getOAuthClientConfig_AllowedMetaTags();

		/**
		 * The meta object literal for the '<em><b>Client Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OAUTH_CLIENT_CONFIG__CLIENT_SCOPE = eINSTANCE.getOAuthClientConfig_ClientScope();

		/**
		 * The meta object literal for the '<em><b>OAuth Scope Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_CONFIG__OAUTH_SCOPE_LEVEL = eINSTANCE.getOAuthClientConfig_OAuthScopeLevel();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.OAuthAdminImpl <em>OAuth Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.OAuthAdminImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getOAuthAdmin()
		 * @generated
		 */
		EClass OAUTH_ADMIN = eINSTANCE.getOAuthAdmin();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_ADMIN__USERNAME = eINSTANCE.getOAuthAdmin_Username();

		/**
		 * The meta object literal for the '<em><b>Password Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_ADMIN__PASSWORD_HASH = eINSTANCE.getOAuthAdmin_PasswordHash();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl <em>OAuth Client Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getOAuthClientScope()
		 * @generated
		 */
		EClass OAUTH_CLIENT_SCOPE = eINSTANCE.getOAuthClientScope();

		/**
		 * The meta object literal for the '<em><b>Positive Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__POSITIVE_TAG = eINSTANCE.getOAuthClientScope_PositiveTag();

		/**
		 * The meta object literal for the '<em><b>Negative Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__NEGATIVE_TAG = eINSTANCE.getOAuthClientScope_NegativeTag();

		/**
		 * The meta object literal for the '<em><b>Positive Meta Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__POSITIVE_META_TAG = eINSTANCE.getOAuthClientScope_PositiveMetaTag();

		/**
		 * The meta object literal for the '<em><b>Negative Meta Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__NEGATIVE_META_TAG = eINSTANCE.getOAuthClientScope_NegativeMetaTag();

		/**
		 * The meta object literal for the '<em><b>Positive Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__POSITIVE_CATEGORY = eINSTANCE.getOAuthClientScope_PositiveCategory();

		/**
		 * The meta object literal for the '<em><b>Negative Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__NEGATIVE_CATEGORY = eINSTANCE.getOAuthClientScope_NegativeCategory();

		/**
		 * The meta object literal for the '<em><b>Positive Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__POSITIVE_PERSON = eINSTANCE.getOAuthClientScope_PositivePerson();

		/**
		 * The meta object literal for the '<em><b>Negative Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__NEGATIVE_PERSON = eINSTANCE.getOAuthClientScope_NegativePerson();

		/**
		 * The meta object literal for the '<em><b>Positive Organisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__POSITIVE_ORGANISATION = eINSTANCE.getOAuthClientScope_PositiveOrganisation();

		/**
		 * The meta object literal for the '<em><b>Negative Organisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__NEGATIVE_ORGANISATION = eINSTANCE.getOAuthClientScope_NegativeOrganisation();

		/**
		 * The meta object literal for the '<em><b>Ident Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__IDENT_SPECIFICATION = eINSTANCE.getOAuthClientScope_IdentSpecification();

		/**
		 * The meta object literal for the '<em><b>Allow Persons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__ALLOW_PERSONS = eINSTANCE.getOAuthClientScope_AllowPersons();

		/**
		 * The meta object literal for the '<em><b>Allow Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__ALLOW_CONTENTS = eINSTANCE.getOAuthClientScope_AllowContents();

		/**
		 * The meta object literal for the '<em><b>Allow Organisations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__ALLOW_ORGANISATIONS = eINSTANCE.getOAuthClientScope_AllowOrganisations();

		/**
		 * The meta object literal for the '<em><b>Maximum Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OAUTH_CLIENT_SCOPE__MAXIMUM_AGE = eINSTANCE.getOAuthClientScope_MaximumAge();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.MashupAdminImpl <em>Mashup Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.MashupAdminImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getMashupAdmin()
		 * @generated
		 */
		EClass MASHUP_ADMIN = eINSTANCE.getMashupAdmin();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_ADMIN__PROVIDER = eINSTANCE.getMashupAdmin_Provider();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_ADMIN__ID = eINSTANCE.getMashupAdmin_Id();

		/**
		 * The meta object literal for the '<em><b>Configurable Mashups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASHUP_ADMIN__CONFIGURABLE_MASHUPS = eINSTANCE.getMashupAdmin_ConfigurableMashups();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_ADMIN__NAME = eINSTANCE.getMashupAdmin_Name();

		/**
		 * The meta object literal for the '<em><b>Local Ident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_ADMIN__LOCAL_IDENT = eINSTANCE.getMashupAdmin_LocalIdent();

		/**
		 * The meta object literal for the '<em><b>Is Configuration Admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_ADMIN__IS_CONFIGURATION_ADMIN = eINSTANCE.getMashupAdmin_IsConfigurationAdmin();

		/**
		 * The meta object literal for the '<em><b>Profile Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_ADMIN__PROFILE_IMAGE = eINSTANCE.getMashupAdmin_ProfileImage();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASHUP_ADMIN__EMAIL = eINSTANCE.getMashupAdmin_Email();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.impl.ConfigurableElementImpl <em>Configurable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.impl.ConfigurableElementImpl
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getConfigurableElement()
		 * @generated
		 */
		EClass CONFIGURABLE_ELEMENT = eINSTANCE.getConfigurableElement();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURABLE_ELEMENT__CONFIGURATION = eINSTANCE.getConfigurableElement_Configuration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURABLE_ELEMENT__NAME = eINSTANCE.getConfigurableElement_Name();

		/**
		 * The meta object literal for the '<em><b>Configuration Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURABLE_ELEMENT__CONFIGURATION_IMAGE = eINSTANCE.getConfigurableElement_ConfigurationImage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURABLE_ELEMENT__DESCRIPTION = eINSTANCE.getConfigurableElement_Description();

		/**
		 * The meta object literal for the '<em><b>Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURABLE_ELEMENT__CHANGEABLE = eINSTANCE.getConfigurableElement_Changeable();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURABLE_ELEMENT__HIDDEN = eINSTANCE.getConfigurableElement_Hidden();

		/**
		 * The meta object literal for the '<em><b>Ident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURABLE_ELEMENT__IDENT = eINSTANCE.getConfigurableElement_Ident();

		/**
		 * The meta object literal for the '<em><b>Get Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURABLE_ELEMENT___GET_PROPERTY__STRING = eINSTANCE.getConfigurableElement__GetProperty__String();

		/**
		 * The meta object literal for the '<em><b>Add Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURABLE_ELEMENT___ADD_PROPERTY__STRING_STRING = eINSTANCE.getConfigurableElement__AddProperty__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURABLE_ELEMENT___ADD_PROPERTY__PROPERTY = eINSTANCE.getConfigurableElement__AddProperty__Property();

		/**
		 * The meta object literal for the '<em><b>Get Property Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURABLE_ELEMENT___GET_PROPERTY_VALUE__STRING = eINSTANCE.getConfigurableElement__GetPropertyValue__String();

		/**
		 * The meta object literal for the '<em><b>Is Property True</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURABLE_ELEMENT___IS_PROPERTY_TRUE__STRING = eINSTANCE.getConfigurableElement__IsPropertyTrue__String();

		/**
		 * The meta object literal for the '<em><b>Get Property Value Else Default</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURABLE_ELEMENT___GET_PROPERTY_VALUE_ELSE_DEFAULT__STRING_STRING = eINSTANCE.getConfigurableElement__GetPropertyValueElseDefault__String_String();

		/**
		 * The meta object literal for the '<em><b>Is Property True Else Default</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURABLE_ELEMENT___IS_PROPERTY_TRUE_ELSE_DEFAULT__STRING_STRING = eINSTANCE.getConfigurableElement__IsPropertyTrueElseDefault__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONFIGURABLE_ELEMENT___REMOVE_PROPERTY__STRING = eINSTANCE.getConfigurableElement__RemoveProperty__String();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.SourceState <em>Source State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.SourceState
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getSourceState()
		 * @generated
		 */
		EEnum SOURCE_STATE = eINSTANCE.getSourceState();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.SourceActiveStates <em>Source Active States</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.SourceActiveStates
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getSourceActiveStates()
		 * @generated
		 */
		EEnum SOURCE_ACTIVE_STATES = eINSTANCE.getSourceActiveStates();

		/**
		 * The meta object literal for the '{@link org.sociotech.communitymashup.application.PropertyTypes <em>Property Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sociotech.communitymashup.application.PropertyTypes
		 * @see org.sociotech.communitymashup.application.impl.ApplicationPackageImpl#getPropertyTypes()
		 * @generated
		 */
		EEnum PROPERTY_TYPES = eINSTANCE.getPropertyTypes();

	}

} //ApplicationPackage
