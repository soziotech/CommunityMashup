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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.sociotech.communitymashup.application.ApplicationFactory;
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
import org.sociotech.communitymashup.application.PropertyTypes;
import org.sociotech.communitymashup.application.RESTInterface;
import org.sociotech.communitymashup.application.Security;
import org.sociotech.communitymashup.application.Source;
import org.sociotech.communitymashup.application.SourceActiveStates;
import org.sociotech.communitymashup.application.SourceState;
import org.sociotech.communitymashup.application.XMLFile;
import org.sociotech.communitymashup.collection.CollectionPackage;
import org.sociotech.communitymashup.collection.impl.CollectionPackageImpl;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.impl.DataPackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationPackageImpl extends EPackageImpl implements ApplicationPackage {
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
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mashupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclRestrictedPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mashupContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass feedInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuthConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationKeyConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuthClientConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuthAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuthClientScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mashupAdminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceActiveStatesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyTypesEEnum = null;

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
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApplicationPackageImpl() {
		super(eNS_URI, ApplicationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApplicationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApplicationPackage init() {
		if (isInited) return (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);

		// Obtain or create and register package
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApplicationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) instanceof CollectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) : CollectionPackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);

		// Create package meta-data objects
		theApplicationPackage.createPackageContents();
		theCollectionPackage.createPackageContents();
		theDataPackage.createPackageContents();

		// Initialize created meta-data
		theApplicationPackage.initializePackageContents();
		theCollectionPackage.initializePackageContents();
		theDataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApplicationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApplicationPackage.eNS_URI, theApplicationPackage);
		return theApplicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_Persistency() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_DataSet() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_BundleId() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_State() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_ActiveState() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_LogLevel() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_Mashup() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_RemoveDataOnStop() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_UpdateRound() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMashup() {
		return mashupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMashup_MappingRules() {
		return (EReference)mashupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMashup_Sources() {
		return (EReference)mashupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMashup_Interfaces() {
		return (EReference)mashupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMashup_MashupAdmins() {
		return (EReference)mashupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashup_WorkingDirectory() {
		return (EAttribute)mashupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashup_CacheAttachments() {
		return (EAttribute)mashupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashup_CacheDataSet() {
		return (EAttribute)mashupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashup_BackupDataSet() {
		return (EAttribute)mashupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashup_BackupIntervall() {
		return (EAttribute)mashupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashup_CacheDelay() {
		return (EAttribute)mashupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashup_SourceIdentCounter() {
		return (EAttribute)mashupEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingRule() {
		return mappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Properties() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistency() {
		return persistencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLFile() {
		return xmlFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Key() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Hidden() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Changeable() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_PossibleValues() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_HelpText() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Required() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_PropertyType() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLRestrictedProperty() {
		return oclRestrictedPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLRestrictedProperty_OCLRestriction() {
		return (EAttribute)oclRestrictedPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMashupContainer() {
		return mashupContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMashupContainer_Mashups() {
		return (EReference)mashupContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMashupContainer_AllMashupAdmins() {
		return (EReference)mashupContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupContainer_BackupConfiguration() {
		return (EAttribute)mashupContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupContainer_BackupIntervall() {
		return (EAttribute)mashupContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMashupContainer_DefaultMashups() {
		return (EReference)mashupContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMashupContainer_SourceConfigurations() {
		return (EReference)mashupContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMashupContainer_InterfaceConfigurations() {
		return (EReference)mashupContainerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupContainer_ImmediateSave() {
		return (EAttribute)mashupContainerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupContainer_CreateAccountsAtLoginTry() {
		return (EAttribute)mashupContainerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupContainer_IdentCounter() {
		return (EAttribute)mashupContainerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Security() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_UrlSuffix() {
		return (EAttribute)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Mashup() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRESTInterface() {
		return restInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTInterface_Type() {
		return (EAttribute)restInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFEEDInterface() {
		return feedInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFEEDInterface_AllowPersonFiltering() {
		return (EAttribute)feedInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFEEDInterface_AllowOrganisationFiltering() {
		return (EAttribute)feedInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFEEDInterface_AllowTypeFiltering() {
		return (EAttribute)feedInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFEEDInterface_AllowTagFiltering() {
		return (EAttribute)feedInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFEEDInterface_AllowMetaTagFiltering() {
		return (EAttribute)feedInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFEEDInterface_AllowCategoryFiltering() {
		return (EAttribute)feedInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFEEDInterface_Language() {
		return (EAttribute)feedInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFEEDInterface_FeedType() {
		return (EAttribute)feedInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFEEDInterface_FeedTitle() {
		return (EAttribute)feedInterfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurity_Interface() {
		return (EReference)securityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuthConfig() {
		return oAuthConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOAuthConfig_Clients() {
		return (EReference)oAuthConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOAuthConfig_Admins() {
		return (EReference)oAuthConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthConfig_UseScopeInterfaceOnRedirect() {
		return (EAttribute)oAuthConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationKeyConfig() {
		return applicationKeyConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationKeyConfig_ApplicationKeys() {
		return (EAttribute)applicationKeyConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuthClientConfig() {
		return oAuthClientConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_Type() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_RedirectionURL() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_Name() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_Description() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_ClientID() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_ClientSecret() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_Code() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_GrantType() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_RefreshToken() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_AccessToken() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_AccessTokenCreationDate() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_AccessTokenExpirationDate() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_ForbiddenMetaTags() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_AllowedMetaTags() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOAuthClientConfig_ClientScope() {
		return (EReference)oAuthClientConfigEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientConfig_OAuthScopeLevel() {
		return (EAttribute)oAuthClientConfigEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuthAdmin() {
		return oAuthAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthAdmin_Username() {
		return (EAttribute)oAuthAdminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthAdmin_PasswordHash() {
		return (EAttribute)oAuthAdminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOAuthClientScope() {
		return oAuthClientScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_PositiveTag() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_NegativeTag() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_PositiveMetaTag() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_NegativeMetaTag() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_PositiveCategory() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_NegativeCategory() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_PositivePerson() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_NegativePerson() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_PositiveOrganisation() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_NegativeOrganisation() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_IdentSpecification() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_AllowPersons() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_AllowContents() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_AllowOrganisations() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOAuthClientScope_MaximumAge() {
		return (EAttribute)oAuthClientScopeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMashupAdmin() {
		return mashupAdminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupAdmin_Provider() {
		return (EAttribute)mashupAdminEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupAdmin_Id() {
		return (EAttribute)mashupAdminEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMashupAdmin_ConfigurableMashups() {
		return (EReference)mashupAdminEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupAdmin_Name() {
		return (EAttribute)mashupAdminEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupAdmin_LocalIdent() {
		return (EAttribute)mashupAdminEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupAdmin_IsConfigurationAdmin() {
		return (EAttribute)mashupAdminEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupAdmin_ProfileImage() {
		return (EAttribute)mashupAdminEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMashupAdmin_Email() {
		return (EAttribute)mashupAdminEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurableElement() {
		return configurableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurableElement_Configuration() {
		return (EReference)configurableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurableElement_Name() {
		return (EAttribute)configurableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurableElement_ConfigurationImage() {
		return (EAttribute)configurableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurableElement_Description() {
		return (EAttribute)configurableElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurableElement_Changeable() {
		return (EAttribute)configurableElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurableElement_Hidden() {
		return (EAttribute)configurableElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurableElement_Ident() {
		return (EAttribute)configurableElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceState() {
		return sourceStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceActiveStates() {
		return sourceActiveStatesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyTypes() {
		return propertyTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationFactory getApplicationFactory() {
		return (ApplicationFactory)getEFactoryInstance();
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
		sourceEClass = createEClass(SOURCE);
		createEReference(sourceEClass, SOURCE__PERSISTENCY);
		createEReference(sourceEClass, SOURCE__DATA_SET);
		createEAttribute(sourceEClass, SOURCE__BUNDLE_ID);
		createEAttribute(sourceEClass, SOURCE__STATE);
		createEAttribute(sourceEClass, SOURCE__ACTIVE_STATE);
		createEAttribute(sourceEClass, SOURCE__LOG_LEVEL);
		createEReference(sourceEClass, SOURCE__MASHUP);
		createEAttribute(sourceEClass, SOURCE__REMOVE_DATA_ON_STOP);
		createEAttribute(sourceEClass, SOURCE__UPDATE_ROUND);

		mashupEClass = createEClass(MASHUP);
		createEReference(mashupEClass, MASHUP__MAPPING_RULES);
		createEReference(mashupEClass, MASHUP__SOURCES);
		createEReference(mashupEClass, MASHUP__INTERFACES);
		createEReference(mashupEClass, MASHUP__MASHUP_ADMINS);
		createEAttribute(mashupEClass, MASHUP__WORKING_DIRECTORY);
		createEAttribute(mashupEClass, MASHUP__CACHE_ATTACHMENTS);
		createEAttribute(mashupEClass, MASHUP__CACHE_DATA_SET);
		createEAttribute(mashupEClass, MASHUP__BACKUP_DATA_SET);
		createEAttribute(mashupEClass, MASHUP__BACKUP_INTERVALL);
		createEAttribute(mashupEClass, MASHUP__CACHE_DELAY);
		createEAttribute(mashupEClass, MASHUP__SOURCE_IDENT_COUNTER);

		mappingRuleEClass = createEClass(MAPPING_RULE);

		configurationEClass = createEClass(CONFIGURATION);
		createEReference(configurationEClass, CONFIGURATION__PROPERTIES);

		persistencyEClass = createEClass(PERSISTENCY);

		xmlFileEClass = createEClass(XML_FILE);

		databaseEClass = createEClass(DATABASE);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__KEY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);
		createEAttribute(propertyEClass, PROPERTY__HIDDEN);
		createEAttribute(propertyEClass, PROPERTY__CHANGEABLE);
		createEAttribute(propertyEClass, PROPERTY__POSSIBLE_VALUES);
		createEAttribute(propertyEClass, PROPERTY__HELP_TEXT);
		createEAttribute(propertyEClass, PROPERTY__REQUIRED);
		createEAttribute(propertyEClass, PROPERTY__PROPERTY_TYPE);

		oclRestrictedPropertyEClass = createEClass(OCL_RESTRICTED_PROPERTY);
		createEAttribute(oclRestrictedPropertyEClass, OCL_RESTRICTED_PROPERTY__OCL_RESTRICTION);

		mashupContainerEClass = createEClass(MASHUP_CONTAINER);
		createEReference(mashupContainerEClass, MASHUP_CONTAINER__MASHUPS);
		createEReference(mashupContainerEClass, MASHUP_CONTAINER__ALL_MASHUP_ADMINS);
		createEAttribute(mashupContainerEClass, MASHUP_CONTAINER__BACKUP_CONFIGURATION);
		createEAttribute(mashupContainerEClass, MASHUP_CONTAINER__BACKUP_INTERVALL);
		createEReference(mashupContainerEClass, MASHUP_CONTAINER__DEFAULT_MASHUPS);
		createEReference(mashupContainerEClass, MASHUP_CONTAINER__SOURCE_CONFIGURATIONS);
		createEReference(mashupContainerEClass, MASHUP_CONTAINER__INTERFACE_CONFIGURATIONS);
		createEAttribute(mashupContainerEClass, MASHUP_CONTAINER__IMMEDIATE_SAVE);
		createEAttribute(mashupContainerEClass, MASHUP_CONTAINER__CREATE_ACCOUNTS_AT_LOGIN_TRY);
		createEAttribute(mashupContainerEClass, MASHUP_CONTAINER__IDENT_COUNTER);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__SECURITY);
		createEAttribute(interfaceEClass, INTERFACE__URL_SUFFIX);
		createEReference(interfaceEClass, INTERFACE__MASHUP);

		restInterfaceEClass = createEClass(REST_INTERFACE);
		createEAttribute(restInterfaceEClass, REST_INTERFACE__TYPE);

		feedInterfaceEClass = createEClass(FEED_INTERFACE);
		createEAttribute(feedInterfaceEClass, FEED_INTERFACE__ALLOW_PERSON_FILTERING);
		createEAttribute(feedInterfaceEClass, FEED_INTERFACE__ALLOW_ORGANISATION_FILTERING);
		createEAttribute(feedInterfaceEClass, FEED_INTERFACE__ALLOW_TYPE_FILTERING);
		createEAttribute(feedInterfaceEClass, FEED_INTERFACE__ALLOW_TAG_FILTERING);
		createEAttribute(feedInterfaceEClass, FEED_INTERFACE__ALLOW_META_TAG_FILTERING);
		createEAttribute(feedInterfaceEClass, FEED_INTERFACE__ALLOW_CATEGORY_FILTERING);
		createEAttribute(feedInterfaceEClass, FEED_INTERFACE__LANGUAGE);
		createEAttribute(feedInterfaceEClass, FEED_INTERFACE__FEED_TYPE);
		createEAttribute(feedInterfaceEClass, FEED_INTERFACE__FEED_TITLE);

		securityEClass = createEClass(SECURITY);
		createEReference(securityEClass, SECURITY__INTERFACE);

		oAuthConfigEClass = createEClass(OAUTH_CONFIG);
		createEReference(oAuthConfigEClass, OAUTH_CONFIG__CLIENTS);
		createEReference(oAuthConfigEClass, OAUTH_CONFIG__ADMINS);
		createEAttribute(oAuthConfigEClass, OAUTH_CONFIG__USE_SCOPE_INTERFACE_ON_REDIRECT);

		applicationKeyConfigEClass = createEClass(APPLICATION_KEY_CONFIG);
		createEAttribute(applicationKeyConfigEClass, APPLICATION_KEY_CONFIG__APPLICATION_KEYS);

		oAuthClientConfigEClass = createEClass(OAUTH_CLIENT_CONFIG);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__TYPE);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__REDIRECTION_URL);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__NAME);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__DESCRIPTION);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__CLIENT_ID);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__CLIENT_SECRET);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__CODE);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__GRANT_TYPE);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__REFRESH_TOKEN);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__ACCESS_TOKEN);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_CREATION_DATE);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_EXPIRATION_DATE);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__FORBIDDEN_META_TAGS);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__ALLOWED_META_TAGS);
		createEReference(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__CLIENT_SCOPE);
		createEAttribute(oAuthClientConfigEClass, OAUTH_CLIENT_CONFIG__OAUTH_SCOPE_LEVEL);

		oAuthAdminEClass = createEClass(OAUTH_ADMIN);
		createEAttribute(oAuthAdminEClass, OAUTH_ADMIN__USERNAME);
		createEAttribute(oAuthAdminEClass, OAUTH_ADMIN__PASSWORD_HASH);

		oAuthClientScopeEClass = createEClass(OAUTH_CLIENT_SCOPE);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__POSITIVE_TAG);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__NEGATIVE_TAG);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__POSITIVE_META_TAG);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__NEGATIVE_META_TAG);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__POSITIVE_CATEGORY);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__NEGATIVE_CATEGORY);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__POSITIVE_PERSON);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__NEGATIVE_PERSON);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__POSITIVE_ORGANISATION);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__NEGATIVE_ORGANISATION);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__IDENT_SPECIFICATION);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__ALLOW_PERSONS);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__ALLOW_CONTENTS);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__ALLOW_ORGANISATIONS);
		createEAttribute(oAuthClientScopeEClass, OAUTH_CLIENT_SCOPE__MAXIMUM_AGE);

		mashupAdminEClass = createEClass(MASHUP_ADMIN);
		createEAttribute(mashupAdminEClass, MASHUP_ADMIN__PROVIDER);
		createEAttribute(mashupAdminEClass, MASHUP_ADMIN__ID);
		createEReference(mashupAdminEClass, MASHUP_ADMIN__CONFIGURABLE_MASHUPS);
		createEAttribute(mashupAdminEClass, MASHUP_ADMIN__NAME);
		createEAttribute(mashupAdminEClass, MASHUP_ADMIN__LOCAL_IDENT);
		createEAttribute(mashupAdminEClass, MASHUP_ADMIN__IS_CONFIGURATION_ADMIN);
		createEAttribute(mashupAdminEClass, MASHUP_ADMIN__PROFILE_IMAGE);
		createEAttribute(mashupAdminEClass, MASHUP_ADMIN__EMAIL);

		configurableElementEClass = createEClass(CONFIGURABLE_ELEMENT);
		createEReference(configurableElementEClass, CONFIGURABLE_ELEMENT__CONFIGURATION);
		createEAttribute(configurableElementEClass, CONFIGURABLE_ELEMENT__NAME);
		createEAttribute(configurableElementEClass, CONFIGURABLE_ELEMENT__CONFIGURATION_IMAGE);
		createEAttribute(configurableElementEClass, CONFIGURABLE_ELEMENT__DESCRIPTION);
		createEAttribute(configurableElementEClass, CONFIGURABLE_ELEMENT__CHANGEABLE);
		createEAttribute(configurableElementEClass, CONFIGURABLE_ELEMENT__HIDDEN);
		createEAttribute(configurableElementEClass, CONFIGURABLE_ELEMENT__IDENT);

		// Create enums
		sourceStateEEnum = createEEnum(SOURCE_STATE);
		sourceActiveStatesEEnum = createEEnum(SOURCE_ACTIVE_STATES);
		propertyTypesEEnum = createEEnum(PROPERTY_TYPES);
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
		sourceEClass.getESuperTypes().add(this.getConfigurableElement());
		mashupEClass.getESuperTypes().add(this.getSource());
		xmlFileEClass.getESuperTypes().add(this.getPersistency());
		databaseEClass.getESuperTypes().add(this.getPersistency());
		oclRestrictedPropertyEClass.getESuperTypes().add(this.getProperty());
		interfaceEClass.getESuperTypes().add(this.getConfigurableElement());
		restInterfaceEClass.getESuperTypes().add(this.getInterface());
		feedInterfaceEClass.getESuperTypes().add(this.getInterface());
		oAuthConfigEClass.getESuperTypes().add(this.getSecurity());
		applicationKeyConfigEClass.getESuperTypes().add(this.getSecurity());

		// Initialize classes and features; add operations and parameters
		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSource_Persistency(), this.getPersistency(), null, "persistency", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_DataSet(), theDataPackage.getDataSet(), null, "dataSet", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_BundleId(), ecorePackage.getEString(), "bundleId", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_State(), this.getSourceState(), "state", "0", 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_ActiveState(), this.getSourceActiveStates(), "activeState", "7", 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_LogLevel(), ecorePackage.getEString(), "logLevel", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_Mashup(), this.getMashup(), this.getMashup_Sources(), "mashup", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_RemoveDataOnStop(), ecorePackage.getEBooleanObject(), "removeDataOnStop", "false", 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_UpdateRound(), ecorePackage.getEIntegerObject(), "updateRound", "1", 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sourceEClass, ecorePackage.getEIntegerObject(), "getLogLevelIntValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sourceEClass, null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sourceEClass, null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sourceEClass, null, "pause", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mashupEClass, Mashup.class, "Mashup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMashup_MappingRules(), this.getMappingRule(), null, "mappingRules", null, 0, -1, Mashup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMashup_Sources(), this.getSource(), this.getSource_Mashup(), "sources", null, 0, -1, Mashup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMashup_Interfaces(), this.getInterface(), this.getInterface_Mashup(), "interfaces", null, 0, -1, Mashup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMashup_MashupAdmins(), this.getMashupAdmin(), this.getMashupAdmin_ConfigurableMashups(), "mashupAdmins", null, 0, -1, Mashup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashup_WorkingDirectory(), ecorePackage.getEString(), "workingDirectory", null, 0, 1, Mashup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashup_CacheAttachments(), ecorePackage.getEBooleanObject(), "cacheAttachments", "true", 0, 1, Mashup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashup_CacheDataSet(), ecorePackage.getEBooleanObject(), "cacheDataSet", "false", 0, 1, Mashup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashup_BackupDataSet(), ecorePackage.getEBooleanObject(), "backupDataSet", "false", 0, 1, Mashup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashup_BackupIntervall(), ecorePackage.getEIntegerObject(), "backupIntervall", "3600", 0, 1, Mashup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashup_CacheDelay(), ecorePackage.getEIntegerObject(), "cacheDelay", "300", 0, 1, Mashup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashup_SourceIdentCounter(), ecorePackage.getEIntegerObject(), "sourceIdentCounter", "1", 0, 1, Mashup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mashupEClass, ecorePackage.getEIntegerObject(), "getNewSourceIdent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mappingRuleEClass, MappingRule.class, "MappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfiguration_Properties(), this.getProperty(), null, "properties", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getConfiguration_Properties().getEKeys().add(this.getProperty_Key());

		initEClass(persistencyEClass, Persistency.class, "Persistency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlFileEClass, XMLFile.class, "XMLFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Key(), ecorePackage.getEString(), "Key", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "Value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Hidden(), ecorePackage.getEBooleanObject(), "hidden", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Changeable(), ecorePackage.getEBooleanObject(), "changeable", "true", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_PossibleValues(), ecorePackage.getEString(), "possibleValues", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_HelpText(), ecorePackage.getEString(), "helpText", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Required(), ecorePackage.getEBooleanObject(), "required", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_PropertyType(), this.getPropertyTypes(), "propertyType", "String", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(propertyEClass, ecorePackage.getEBoolean(), "isValueList", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEClass, ecorePackage.getEBoolean(), "isValueRange", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEClass, ecorePackage.getEString(), "getListOfValues", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEClass, ecorePackage.getEString(), "getMinValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(propertyEClass, ecorePackage.getEString(), "getMaxValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oclRestrictedPropertyEClass, OCLRestrictedProperty.class, "OCLRestrictedProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOCLRestrictedProperty_OCLRestriction(), ecorePackage.getEString(), "OCLRestriction", null, 0, 1, OCLRestrictedProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mashupContainerEClass, MashupContainer.class, "MashupContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMashupContainer_Mashups(), this.getMashup(), null, "mashups", null, 0, -1, MashupContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMashupContainer_AllMashupAdmins(), this.getMashupAdmin(), null, "allMashupAdmins", null, 0, -1, MashupContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashupContainer_BackupConfiguration(), ecorePackage.getEBooleanObject(), "backupConfiguration", "false", 0, 1, MashupContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashupContainer_BackupIntervall(), ecorePackage.getEIntegerObject(), "backupIntervall", "600", 0, 1, MashupContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMashupContainer_DefaultMashups(), this.getMashup(), null, "defaultMashups", null, 0, -1, MashupContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMashupContainer_SourceConfigurations(), this.getMashup(), null, "sourceConfigurations", null, 0, -1, MashupContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMashupContainer_InterfaceConfigurations(), this.getInterface(), null, "interfaceConfigurations", null, 0, -1, MashupContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashupContainer_ImmediateSave(), ecorePackage.getEBooleanObject(), "immediateSave", "false", 0, 1, MashupContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashupContainer_CreateAccountsAtLoginTry(), ecorePackage.getEBooleanObject(), "createAccountsAtLoginTry", "false", 0, 1, MashupContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashupContainer_IdentCounter(), ecorePackage.getEIntegerObject(), "identCounter", "1", 0, 1, MashupContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mashupContainerEClass, this.getMashupAdmin(), "getConfigurationAdmins", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(mashupContainerEClass, null, "setNewIdentFor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConfigurableElement(), "configurableElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mashupContainerEClass, ecorePackage.getEIntegerObject(), "getNewIdentNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_Security(), this.getSecurity(), this.getSecurity_Interface(), "security", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterface_UrlSuffix(), ecorePackage.getEString(), "urlSuffix", "", 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Mashup(), this.getMashup(), this.getMashup_Interfaces(), "mashup", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restInterfaceEClass, RESTInterface.class, "RESTInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRESTInterface_Type(), ecorePackage.getEString(), "type", null, 0, 1, RESTInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(feedInterfaceEClass, FEEDInterface.class, "FEEDInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFEEDInterface_AllowPersonFiltering(), ecorePackage.getEBooleanObject(), "allowPersonFiltering", "true", 0, 1, FEEDInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFEEDInterface_AllowOrganisationFiltering(), ecorePackage.getEBooleanObject(), "allowOrganisationFiltering", "true", 0, 1, FEEDInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFEEDInterface_AllowTypeFiltering(), ecorePackage.getEBooleanObject(), "allowTypeFiltering", "true", 0, 1, FEEDInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFEEDInterface_AllowTagFiltering(), ecorePackage.getEBooleanObject(), "allowTagFiltering", "true", 0, 1, FEEDInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFEEDInterface_AllowMetaTagFiltering(), ecorePackage.getEBooleanObject(), "allowMetaTagFiltering", "true", 0, 1, FEEDInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFEEDInterface_AllowCategoryFiltering(), ecorePackage.getEBooleanObject(), "allowCategoryFiltering", "true", 0, 1, FEEDInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFEEDInterface_Language(), ecorePackage.getEString(), "language", "de", 0, 1, FEEDInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFEEDInterface_FeedType(), ecorePackage.getEString(), "feedType", null, 0, 1, FEEDInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFEEDInterface_FeedTitle(), ecorePackage.getEString(), "feedTitle", null, 0, 1, FEEDInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityEClass, Security.class, "Security", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurity_Interface(), this.getInterface(), this.getInterface_Security(), "interface", null, 0, 1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oAuthConfigEClass, OAuthConfig.class, "OAuthConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOAuthConfig_Clients(), this.getOAuthClientConfig(), null, "clients", null, 0, -1, OAuthConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOAuthConfig_Admins(), this.getOAuthAdmin(), null, "admins", null, 0, -1, OAuthConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthConfig_UseScopeInterfaceOnRedirect(), ecorePackage.getEBooleanObject(), "useScopeInterfaceOnRedirect", null, 0, 1, OAuthConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationKeyConfigEClass, ApplicationKeyConfig.class, "ApplicationKeyConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getApplicationKeyConfig_ApplicationKeys(), ecorePackage.getEString(), "applicationKeys", null, 0, -1, ApplicationKeyConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(applicationKeyConfigEClass, ecorePackage.getEBooleanObject(), "hasApplicationKey", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "applicationKey", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(oAuthClientConfigEClass, OAuthClientConfig.class, "OAuthClientConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOAuthClientConfig_Type(), ecorePackage.getEString(), "type", null, 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_RedirectionURL(), ecorePackage.getEString(), "redirectionURL", null, 1, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_Name(), ecorePackage.getEString(), "name", null, 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_Description(), ecorePackage.getEString(), "description", null, 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_ClientID(), ecorePackage.getEString(), "clientID", null, 1, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_ClientSecret(), ecorePackage.getEString(), "clientSecret", null, 1, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_Code(), ecorePackage.getEString(), "code", null, 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_GrantType(), ecorePackage.getEString(), "grantType", "AuthorizationCode", 1, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_RefreshToken(), ecorePackage.getEString(), "refreshToken", null, 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_AccessToken(), ecorePackage.getEString(), "accessToken", null, 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_AccessTokenCreationDate(), ecorePackage.getEDate(), "accessTokenCreationDate", null, 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_AccessTokenExpirationDate(), ecorePackage.getEDate(), "accessTokenExpirationDate", null, 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_ForbiddenMetaTags(), ecorePackage.getEString(), "forbiddenMetaTags", "", 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_AllowedMetaTags(), ecorePackage.getEString(), "allowedMetaTags", null, 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOAuthClientConfig_ClientScope(), this.getOAuthClientScope(), null, "clientScope", null, 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientConfig_OAuthScopeLevel(), ecorePackage.getEIntegerObject(), "oAuthScopeLevel", null, 0, 1, OAuthClientConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oAuthAdminEClass, OAuthAdmin.class, "OAuthAdmin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOAuthAdmin_Username(), ecorePackage.getEString(), "username", null, 0, 1, OAuthAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthAdmin_PasswordHash(), ecorePackage.getEString(), "passwordHash", null, 0, 1, OAuthAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oAuthClientScopeEClass, OAuthClientScope.class, "OAuthClientScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOAuthClientScope_PositiveTag(), ecorePackage.getEString(), "positiveTag", null, 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_NegativeTag(), ecorePackage.getEString(), "negativeTag", null, 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_PositiveMetaTag(), ecorePackage.getEString(), "positiveMetaTag", null, 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_NegativeMetaTag(), ecorePackage.getEString(), "negativeMetaTag", null, 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_PositiveCategory(), ecorePackage.getEString(), "positiveCategory", null, 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_NegativeCategory(), ecorePackage.getEString(), "negativeCategory", null, 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_PositivePerson(), ecorePackage.getEString(), "positivePerson", null, 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_NegativePerson(), ecorePackage.getEString(), "negativePerson", null, 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_PositiveOrganisation(), ecorePackage.getEString(), "positiveOrganisation", null, 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_NegativeOrganisation(), ecorePackage.getEString(), "negativeOrganisation", null, 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_IdentSpecification(), ecorePackage.getEBooleanObject(), "identSpecification", "false", 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_AllowPersons(), ecorePackage.getEBooleanObject(), "allowPersons", "true", 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_AllowContents(), ecorePackage.getEBooleanObject(), "allowContents", "true", 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_AllowOrganisations(), ecorePackage.getEBooleanObject(), "allowOrganisations", "true", 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthClientScope_MaximumAge(), ecorePackage.getEString(), "maximumAge", "true", 0, 1, OAuthClientScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mashupAdminEClass, MashupAdmin.class, "MashupAdmin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMashupAdmin_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, MashupAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashupAdmin_Id(), ecorePackage.getEString(), "id", null, 0, 1, MashupAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMashupAdmin_ConfigurableMashups(), this.getMashup(), this.getMashup_MashupAdmins(), "configurableMashups", null, 0, -1, MashupAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashupAdmin_Name(), ecorePackage.getEString(), "name", null, 0, 1, MashupAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashupAdmin_LocalIdent(), ecorePackage.getEString(), "localIdent", null, 0, 1, MashupAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashupAdmin_IsConfigurationAdmin(), ecorePackage.getEBooleanObject(), "isConfigurationAdmin", "false", 0, 1, MashupAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashupAdmin_ProfileImage(), ecorePackage.getEString(), "profileImage", null, 0, 1, MashupAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMashupAdmin_Email(), ecorePackage.getEString(), "email", null, 0, 1, MashupAdmin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurableElementEClass, ConfigurableElement.class, "ConfigurableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurableElement_Configuration(), this.getConfiguration(), null, "configuration", null, 1, 1, ConfigurableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurableElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConfigurableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurableElement_ConfigurationImage(), ecorePackage.getEString(), "configurationImage", null, 0, 1, ConfigurableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurableElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ConfigurableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurableElement_Changeable(), ecorePackage.getEBooleanObject(), "changeable", "true", 0, 1, ConfigurableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurableElement_Hidden(), ecorePackage.getEBooleanObject(), "hidden", "false", 0, 1, ConfigurableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigurableElement_Ident(), ecorePackage.getEString(), "ident", null, 0, 1, ConfigurableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(configurableElementEClass, this.getProperty(), "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(configurableElementEClass, null, "addProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(configurableElementEClass, null, "addProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(configurableElementEClass, ecorePackage.getEString(), "getPropertyValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(configurableElementEClass, ecorePackage.getEBoolean(), "isPropertyTrue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(configurableElementEClass, ecorePackage.getEString(), "getPropertyValueElseDefault", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(configurableElementEClass, ecorePackage.getEBoolean(), "isPropertyTrueElseDefault", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(configurableElementEClass, null, "removeProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(sourceStateEEnum, SourceState.class, "SourceState");
		addEEnumLiteral(sourceStateEEnum, SourceState.ACTIVE);
		addEEnumLiteral(sourceStateEEnum, SourceState.PAUSED);
		addEEnumLiteral(sourceStateEEnum, SourceState.ERROR);
		addEEnumLiteral(sourceStateEEnum, SourceState.STOPED);

		initEEnum(sourceActiveStatesEEnum, SourceActiveStates.class, "SourceActiveStates");
		addEEnumLiteral(sourceActiveStatesEEnum, SourceActiveStates.INITIALIZING);
		addEEnumLiteral(sourceActiveStatesEEnum, SourceActiveStates.INITIALIZED);
		addEEnumLiteral(sourceActiveStatesEEnum, SourceActiveStates.FILLING);
		addEEnumLiteral(sourceActiveStatesEEnum, SourceActiveStates.FILLED);
		addEEnumLiteral(sourceActiveStatesEEnum, SourceActiveStates.WAITING_FOR_UPDATE);
		addEEnumLiteral(sourceActiveStatesEEnum, SourceActiveStates.UPDATING);
		addEEnumLiteral(sourceActiveStatesEEnum, SourceActiveStates.ENRICHING);
		addEEnumLiteral(sourceActiveStatesEEnum, SourceActiveStates.UNKNOWN);

		initEEnum(propertyTypesEEnum, PropertyTypes.class, "PropertyTypes");
		addEEnumLiteral(propertyTypesEEnum, PropertyTypes.STRING);
		addEEnumLiteral(propertyTypesEEnum, PropertyTypes.INTEGER);
		addEEnumLiteral(propertyTypesEEnum, PropertyTypes.FLOAT);
		addEEnumLiteral(propertyTypesEEnum, PropertyTypes.DATE);
		addEEnumLiteral(propertyTypesEEnum, PropertyTypes.AUTHORIZATION);
		addEEnumLiteral(propertyTypesEEnum, PropertyTypes.UPLOAD_ZIP_FILE);
		addEEnumLiteral(propertyTypesEEnum, PropertyTypes.UPLOAD_FILE);
		addEEnumLiteral(propertyTypesEEnum, PropertyTypes.BOOLEAN);

		// Create resource
		createResource(eNS_URI);
	}

} //ApplicationPackageImpl
