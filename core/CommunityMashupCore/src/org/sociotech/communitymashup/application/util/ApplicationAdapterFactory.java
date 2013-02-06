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
package org.sociotech.communitymashup.application.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.sociotech.communitymashup.application.ApplicationKeyConfig;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.application.ConfigurableElement;
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
import org.sociotech.communitymashup.application.RESTInterface;
import org.sociotech.communitymashup.application.Security;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.application.XMLFile;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sociotech.communitymashup.application.ApplicationPackage
 * @generated
 */
public class ApplicationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApplicationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApplicationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationSwitch<Adapter> modelSwitch =
		new ApplicationSwitch<Adapter>() {
			@Override
			public Adapter caseSource(Source object) {
				return createSourceAdapter();
			}
			@Override
			public Adapter caseMashup(Mashup object) {
				return createMashupAdapter();
			}
			@Override
			public Adapter caseMappingRule(MappingRule object) {
				return createMappingRuleAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter casePersistency(Persistency object) {
				return createPersistencyAdapter();
			}
			@Override
			public Adapter caseXMLFile(XMLFile object) {
				return createXMLFileAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseOCLRestrictedProperty(OCLRestrictedProperty object) {
				return createOCLRestrictedPropertyAdapter();
			}
			@Override
			public Adapter caseMashupContainer(MashupContainer object) {
				return createMashupContainerAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseRESTInterface(RESTInterface object) {
				return createRESTInterfaceAdapter();
			}
			@Override
			public Adapter caseFEEDInterface(FEEDInterface object) {
				return createFEEDInterfaceAdapter();
			}
			@Override
			public Adapter caseSecurity(Security object) {
				return createSecurityAdapter();
			}
			@Override
			public Adapter caseOAuthConfig(OAuthConfig object) {
				return createOAuthConfigAdapter();
			}
			@Override
			public Adapter caseApplicationKeyConfig(ApplicationKeyConfig object) {
				return createApplicationKeyConfigAdapter();
			}
			@Override
			public Adapter caseOAuthClientConfig(OAuthClientConfig object) {
				return createOAuthClientConfigAdapter();
			}
			@Override
			public Adapter caseOAuthAdmin(OAuthAdmin object) {
				return createOAuthAdminAdapter();
			}
			@Override
			public Adapter caseOAuthClientScope(OAuthClientScope object) {
				return createOAuthClientScopeAdapter();
			}
			@Override
			public Adapter caseMashupAdmin(MashupAdmin object) {
				return createMashupAdminAdapter();
			}
			@Override
			public Adapter caseConfigurableElement(ConfigurableElement object) {
				return createConfigurableElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.Source
	 * @generated
	 */
	public Adapter createSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.Mashup <em>Mashup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.Mashup
	 * @generated
	 */
	public Adapter createMashupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.MappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.MappingRule
	 * @generated
	 */
	public Adapter createMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.Persistency <em>Persistency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.Persistency
	 * @generated
	 */
	public Adapter createPersistencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.XMLFile <em>XML File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.XMLFile
	 * @generated
	 */
	public Adapter createXMLFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.OCLRestrictedProperty <em>OCL Restricted Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.OCLRestrictedProperty
	 * @generated
	 */
	public Adapter createOCLRestrictedPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.MashupContainer <em>Mashup Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.MashupContainer
	 * @generated
	 */
	public Adapter createMashupContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.RESTInterface <em>REST Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.RESTInterface
	 * @generated
	 */
	public Adapter createRESTInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.FEEDInterface <em>FEED Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.FEEDInterface
	 * @generated
	 */
	public Adapter createFEEDInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.Security
	 * @generated
	 */
	public Adapter createSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.OAuthConfig <em>OAuth Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.OAuthConfig
	 * @generated
	 */
	public Adapter createOAuthConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.ApplicationKeyConfig <em>Key Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.ApplicationKeyConfig
	 * @generated
	 */
	public Adapter createApplicationKeyConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.OAuthClientConfig <em>OAuth Client Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.OAuthClientConfig
	 * @generated
	 */
	public Adapter createOAuthClientConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.OAuthAdmin <em>OAuth Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.OAuthAdmin
	 * @generated
	 */
	public Adapter createOAuthAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.OAuthClientScope <em>OAuth Client Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.OAuthClientScope
	 * @generated
	 */
	public Adapter createOAuthClientScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.MashupAdmin <em>Mashup Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.MashupAdmin
	 * @generated
	 */
	public Adapter createMashupAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sociotech.communitymashup.application.ConfigurableElement <em>Configurable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sociotech.communitymashup.application.ConfigurableElement
	 * @generated
	 */
	public Adapter createConfigurableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ApplicationAdapterFactory
