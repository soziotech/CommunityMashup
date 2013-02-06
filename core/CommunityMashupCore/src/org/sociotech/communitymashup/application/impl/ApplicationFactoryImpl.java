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
package org.sociotech.communitymashup.application.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.sociotech.communitymashup.application.ApplicationFactory;
import org.sociotech.communitymashup.application.ApplicationKeyConfig;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.application.Configuration;
import org.sociotech.communitymashup.application.Database;
import org.sociotech.communitymashup.application.FEEDInterface;
import org.sociotech.communitymashup.application.Interface;
import org.sociotech.communitymashup.application.MappingRule;
import org.sociotech.communitymashup.application.Mashup;
import org.sociotech.communitymashup.application.MashupAdmin;
import org.sociotech.communitymashup.application.MashupContainer;
import org.sociotech.communitymashup.application.OAuthAdmin;
import org.sociotech.communitymashup.application.OAuthClientConfig;
import org.sociotech.communitymashup.application.OAuthClientScope;
import org.sociotech.communitymashup.application.OAuthConfig;
import org.sociotech.communitymashup.application.OCLRestrictedProperty;
import org.sociotech.communitymashup.application.Persistency;
import org.sociotech.communitymashup.application.Property;
import org.sociotech.communitymashup.application.PropertyTypes;
import org.sociotech.communitymashup.application.RESTInterface;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.application.SourceActiveStates;
import org.sociotech.communitymashup.application.SourceState;
import org.sociotech.communitymashup.application.XMLFile;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationFactoryImpl extends EFactoryImpl implements ApplicationFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationFactory init() {
		try {
			ApplicationFactory theApplicationFactory = (ApplicationFactory)EPackage.Registry.INSTANCE.getEFactory("http://application.cscm.communitymashup.de"); 
			if (theApplicationFactory != null) {
				return theApplicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApplicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApplicationPackage.SOURCE: return createSource();
			case ApplicationPackage.MASHUP: return createMashup();
			case ApplicationPackage.MAPPING_RULE: return createMappingRule();
			case ApplicationPackage.CONFIGURATION: return createConfiguration();
			case ApplicationPackage.PERSISTENCY: return createPersistency();
			case ApplicationPackage.XML_FILE: return createXMLFile();
			case ApplicationPackage.DATABASE: return createDatabase();
			case ApplicationPackage.PROPERTY: return createProperty();
			case ApplicationPackage.OCL_RESTRICTED_PROPERTY: return createOCLRestrictedProperty();
			case ApplicationPackage.MASHUP_CONTAINER: return createMashupContainer();
			case ApplicationPackage.INTERFACE: return createInterface();
			case ApplicationPackage.REST_INTERFACE: return createRESTInterface();
			case ApplicationPackage.FEED_INTERFACE: return createFEEDInterface();
			case ApplicationPackage.OAUTH_CONFIG: return createOAuthConfig();
			case ApplicationPackage.APPLICATION_KEY_CONFIG: return createApplicationKeyConfig();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG: return createOAuthClientConfig();
			case ApplicationPackage.OAUTH_ADMIN: return createOAuthAdmin();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE: return createOAuthClientScope();
			case ApplicationPackage.MASHUP_ADMIN: return createMashupAdmin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApplicationPackage.SOURCE_STATE:
				return createSourceStateFromString(eDataType, initialValue);
			case ApplicationPackage.SOURCE_ACTIVE_STATES:
				return createSourceActiveStatesFromString(eDataType, initialValue);
			case ApplicationPackage.PROPERTY_TYPES:
				return createPropertyTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApplicationPackage.SOURCE_STATE:
				return convertSourceStateToString(eDataType, instanceValue);
			case ApplicationPackage.SOURCE_ACTIVE_STATES:
				return convertSourceActiveStatesToString(eDataType, instanceValue);
			case ApplicationPackage.PROPERTY_TYPES:
				return convertPropertyTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mashup createMashup() {
		MashupImpl mashup = new MashupImpl();
		return mashup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRule createMappingRule() {
		MappingRuleImpl mappingRule = new MappingRuleImpl();
		return mappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persistency createPersistency() {
		PersistencyImpl persistency = new PersistencyImpl();
		return persistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLFile createXMLFile() {
		XMLFileImpl xmlFile = new XMLFileImpl();
		return xmlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLRestrictedProperty createOCLRestrictedProperty() {
		OCLRestrictedPropertyImpl oclRestrictedProperty = new OCLRestrictedPropertyImpl();
		return oclRestrictedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MashupContainer createMashupContainer() {
		MashupContainerImpl mashupContainer = new MashupContainerImpl();
		return mashupContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTInterface createRESTInterface() {
		RESTInterfaceImpl restInterface = new RESTInterfaceImpl();
		return restInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FEEDInterface createFEEDInterface() {
		FEEDInterfaceImpl feedInterface = new FEEDInterfaceImpl();
		return feedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuthConfig createOAuthConfig() {
		OAuthConfigImpl oAuthConfig = new OAuthConfigImpl();
		return oAuthConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationKeyConfig createApplicationKeyConfig() {
		ApplicationKeyConfigImpl applicationKeyConfig = new ApplicationKeyConfigImpl();
		return applicationKeyConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuthClientConfig createOAuthClientConfig() {
		OAuthClientConfigImpl oAuthClientConfig = new OAuthClientConfigImpl();
		return oAuthClientConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuthAdmin createOAuthAdmin() {
		OAuthAdminImpl oAuthAdmin = new OAuthAdminImpl();
		return oAuthAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuthClientScope createOAuthClientScope() {
		OAuthClientScopeImpl oAuthClientScope = new OAuthClientScopeImpl();
		return oAuthClientScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MashupAdmin createMashupAdmin() {
		MashupAdminImpl mashupAdmin = new MashupAdminImpl();
		return mashupAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceState createSourceStateFromString(EDataType eDataType, String initialValue) {
		SourceState result = SourceState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceActiveStates createSourceActiveStatesFromString(EDataType eDataType, String initialValue) {
		SourceActiveStates result = SourceActiveStates.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceActiveStatesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypes createPropertyTypesFromString(EDataType eDataType, String initialValue) {
		PropertyTypes result = PropertyTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationPackage getApplicationPackage() {
		return (ApplicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApplicationPackage getPackage() {
		return ApplicationPackage.eINSTANCE;
	}

} //ApplicationFactoryImpl
