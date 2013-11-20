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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.sociotech.communitymashup.application.ApplicationPackage;
import org.sociotech.communitymashup.application.impl.ApplicationPackageImpl;
import org.sociotech.communitymashup.collection.CollectionPackage;
import org.sociotech.communitymashup.collection.impl.CollectionPackageImpl;
import org.sociotech.communitymashup.data.Attachment;
import org.sociotech.communitymashup.data.Binary;
import org.sociotech.communitymashup.data.Category;
import org.sociotech.communitymashup.data.Classification;
import org.sociotech.communitymashup.data.Connection;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.DeletedItem;
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


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage {
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
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantMessengerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webSiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rankingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass starRankingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewRankingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thumbRankingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indoorLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletedItemEClass = null;

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
	 * @see org.sociotech.communitymashup.data.DataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataPackageImpl() {
		super(eNS_URI, DataFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataPackage init() {
		if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Obtain or create and register package
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) instanceof CollectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) : CollectionPackage.eINSTANCE);
		ApplicationPackageImpl theApplicationPackage = (ApplicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) instanceof ApplicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI) : ApplicationPackage.eINSTANCE);

		// Create package meta-data objects
		theDataPackage.createPackageContents();
		theCollectionPackage.createPackageContents();
		theApplicationPackage.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();
		theCollectionPackage.initializePackageContents();
		theApplicationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
		return theDataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Lastname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Firstname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Persons() {
		return (EReference)personEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Title() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Ranked() {
		return (EReference)personEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__GetContents() {
		return personEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__GetOrganisations() {
		return personEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__AddContributedContent__Content() {
		return personEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__AddAuthoredContent__Content() {
		return personEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__ParseFirstName() {
		return personEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerson__ParseLastName() {
		return personEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_LeaderOf() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Participates() {
		return (EReference)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Authored() {
		return (EReference)personEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Contributed() {
		return (EReference)personEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_DateOfBirth() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationObject() {
		return informationObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationObject_Categories() {
		return (EReference)informationObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationObject_Tags() {
		return (EReference)informationObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationObject_Images() {
		return (EReference)informationObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationObject_StarRankings() {
		return (EReference)informationObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationObject_ThumbRankings() {
		return (EReference)informationObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationObject_ViewRankings() {
		return (EReference)informationObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationObject_Name() {
		return (EAttribute)informationObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationObject_ConnectedTo() {
		return (EReference)informationObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationObject_ConnectedBy() {
		return (EReference)informationObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationObject_Binaries() {
		return (EReference)informationObjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationObject_MainCategory() {
		return (EReference)informationObjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationObject_MetaInformations() {
		return (EReference)informationObjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__Tag__String() {
		return informationObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__Categorize__String() {
		return informationObjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__AttachImage__String() {
		return informationObjectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetAttachments() {
		return informationObjectEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__StarRank__Integer_Integer() {
		return informationObjectEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__View() {
		return informationObjectEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__ThumbsUp() {
		return informationObjectEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__ThumbsDown() {
		return informationObjectEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetThumbsUp() {
		return informationObjectEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetThumbsDown() {
		return informationObjectEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetThumbsUpCount() {
		return informationObjectEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetThumbsDownCount() {
		return informationObjectEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetThumbsCount() {
		return informationObjectEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetViewsCount() {
		return informationObjectEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetStarRanking() {
		return informationObjectEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__Extend__MetaInformation() {
		return informationObjectEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetWebAccounts() {
		return informationObjectEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetWebSites() {
		return informationObjectEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetPhones() {
		return informationObjectEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetLocations() {
		return informationObjectEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetEmails() {
		return informationObjectEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetInstantMessengers() {
		return informationObjectEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__AddEmailAddress__String() {
		return informationObjectEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__AddWebSite__String() {
		return informationObjectEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetInformationObjectsWithCommonTags() {
		return informationObjectEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__AddWebAccount__String() {
		return informationObjectEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__HasImages() {
		return informationObjectEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetInformationObjectsConnectedTo() {
		return informationObjectEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetInformationObjectsConnectedFrom() {
		return informationObjectEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetInformationObjectsConnected() {
		return informationObjectEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__ConnectTo__InformationObject() {
		return informationObjectEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__ConnectToWithMetaTag__InformationObject_String() {
		return informationObjectEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetInformationObjectsConnectedToWithMetaTag__String() {
		return informationObjectEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetInformationObjectsConnectedFromWithMetaTag__String() {
		return informationObjectEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetInformationObjectsConnectedWithMetaTag__String() {
		return informationObjectEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetConnectionsFrom__InformationObject() {
		return informationObjectEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetConnectionsTo__InformationObject() {
		return informationObjectEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__ConnectToWithValueAndMetaTag__InformationObject_String_String() {
		return informationObjectEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetConnectionTo__InformationObject_String() {
		return informationObjectEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetConnectionFrom__InformationObject_String() {
		return informationObjectEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetAttachmentWithUrl__String() {
		return informationObjectEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetAttachedImageWithUrl__String() {
		return informationObjectEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__AddPhone__String() {
		return informationObjectEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetPersonsWithCommonTags() {
		return informationObjectEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetOrganisationsWithCommonTags() {
		return informationObjectEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetContentsWithCommonTags() {
		return informationObjectEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__UnTag__String() {
		return informationObjectEClass.getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__UnCategorize__String() {
		return informationObjectEClass.getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetSlugName() {
		return informationObjectEClass.getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetConnectionsToWithMetaTag__InformationObject_String() {
		return informationObjectEClass.getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationObject__GetConnectionsFromWithMetaTag__InformationObject_String() {
		return informationObjectEClass.getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Contents() {
		return (EReference)contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Contributors() {
		return (EReference)contentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Author() {
		return (EReference)contentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Documents() {
		return (EReference)contentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_ParentContent() {
		return (EReference)contentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_Locale() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Transformations() {
		return (EReference)contentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Videos() {
		return (EReference)contentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContent__GetOrganisations() {
		return contentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContent__GetPersons() {
		return contentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContent__Comment__String() {
		return contentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContent__AddContributor__Person() {
		return contentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContent__AttachDocument__String() {
		return contentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSet() {
		return dataSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSet_Items() {
		return (EReference)dataSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSet_CacheFolder() {
		return (EAttribute)dataSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSet_CacheFileAttachements() {
		return (EAttribute)dataSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSet_SetUp() {
		return (EReference)dataSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSet_LastModified() {
		return (EAttribute)dataSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSet_LogLevel() {
		return (EAttribute)dataSetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSet_IdentCounter() {
		return (EAttribute)dataSetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSet_IdentPrefix() {
		return (EAttribute)dataSetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSet_Created() {
		return (EAttribute)dataSetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSet_KeepDeletedItemsList() {
		return (EAttribute)dataSetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSet_ItemsDeleted() {
		return (EReference)dataSetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__Add__Item() {
		return dataSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetItemsWithStringValue__String() {
		return dataSetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonsWithName__String() {
		return dataSetEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonsWithLastname__String() {
		return dataSetEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonsWithFirstName__String() {
		return dataSetEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetTag__String() {
		return dataSetEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetMetaTag__String() {
		return dataSetEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetAllPersons() {
		return dataSetEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetAllContents() {
		return dataSetEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetAllOrganisations() {
		return dataSetEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetAllCategories() {
		return dataSetEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetCategory__String() {
		return dataSetEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetAllTags() {
		return dataSetEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetItemsModifiedSince__Date() {
		return dataSetEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetAllMetaTags() {
		return dataSetEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetAllConnections() {
		return dataSetEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__Log__String() {
		return dataSetEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__Log__String_Integer() {
		return dataSetEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetContentWithIdent__String() {
		return dataSetEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonWithIdent__String() {
		return dataSetEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetOrganisationWithIdent__String() {
		return dataSetEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetAttachmentWithIdent__String() {
		return dataSetEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetInformationObjectsWithAllCategories__EList() {
		return dataSetEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetInformationObjectsWithOneOfCategories__EList() {
		return dataSetEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetContentsWithAllCategories__EList() {
		return dataSetEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetContentsWithOneOfCategories__EList() {
		return dataSetEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonsWithAllCategories__EList() {
		return dataSetEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonsWithOneOfCategories__EList() {
		return dataSetEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetOrganisationsWithAllCategories__EList() {
		return dataSetEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetOrganisationsWithOneOfCategories__EList() {
		return dataSetEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetInformationObjectsWithAllTags__EList() {
		return dataSetEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetInformationObjectsWithOneOfTags__EList() {
		return dataSetEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetOrganisationsWithAllTags__EList() {
		return dataSetEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetOrganisationsWithOneOfTags__EList() {
		return dataSetEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonsWithAllTags__EList() {
		return dataSetEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonsWithOneOfTags__EList() {
		return dataSetEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetContentsWithAllTags__EList() {
		return dataSetEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetContentsWithOneOfTags__EList() {
		return dataSetEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetContentsWithName__String() {
		return dataSetEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetOrganisationsWithName__String() {
		return dataSetEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetItemsWithAllMetaTags__EList() {
		return dataSetEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetItemsWithOneOfMetaTags__EList() {
		return dataSetEClass.getEOperations().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersons() {
		return dataSetEClass.getEOperations().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetOrganisations() {
		return dataSetEClass.getEOperations().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetContents() {
		return dataSetEClass.getEOperations().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetInformationObjects() {
		return dataSetEClass.getEOperations().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetTags() {
		return dataSetEClass.getEOperations().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetMetaTags() {
		return dataSetEClass.getEOperations().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetAttachments() {
		return dataSetEClass.getEOperations().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetBinaries() {
		return dataSetEClass.getEOperations().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetCategories() {
		return dataSetEClass.getEOperations().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetClassifications() {
		return dataSetEClass.getEOperations().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetConnections() {
		return dataSetEClass.getEOperations().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetDocuments() {
		return dataSetEClass.getEOperations().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetEmails() {
		return dataSetEClass.getEOperations().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetExtensions() {
		return dataSetEClass.getEOperations().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetImages() {
		return dataSetEClass.getEOperations().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetInstantMessengers() {
		return dataSetEClass.getEOperations().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetLocations() {
		return dataSetEClass.getEOperations().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetMetaInformations() {
		return dataSetEClass.getEOperations().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPhones() {
		return dataSetEClass.getEOperations().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetRankings() {
		return dataSetEClass.getEOperations().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetStarRankings() {
		return dataSetEClass.getEOperations().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetThumbRankings() {
		return dataSetEClass.getEOperations().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetTransformations() {
		return dataSetEClass.getEOperations().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetVideos() {
		return dataSetEClass.getEOperations().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetViewRankings() {
		return dataSetEClass.getEOperations().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetWebAccounts() {
		return dataSetEClass.getEOperations().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetWebSites() {
		return dataSetEClass.getEOperations().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetInformationObjectsWithAllMetaTags__EList() {
		return dataSetEClass.getEOperations().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetInformationObjectsWithOneOfMetaTags__EList() {
		return dataSetEClass.getEOperations().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetIdentifiers() {
		return dataSetEClass.getEOperations().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetIdentifiersWithKey__String() {
		return dataSetEClass.getEOperations().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetIdentifierWithKeyValue__String_String() {
		return dataSetEClass.getEOperations().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetItemWithIdentifier__String_String() {
		return dataSetEClass.getEOperations().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonWithIdentifier__String_String() {
		return dataSetEClass.getEOperations().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetContentWithIdentifier__String_String() {
		return dataSetEClass.getEOperations().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetOrganisationWithIdentifier__String_String() {
		return dataSetEClass.getEOperations().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetLocationWithIdentifier__String_String() {
		return dataSetEClass.getEOperations().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetIndoorLocationWithIdentifier__String_String() {
		return dataSetEClass.getEOperations().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetImageWithIdentifier__String_String() {
		return dataSetEClass.getEOperations().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetEmptyItemWithIdent__String() {
		return dataSetEClass.getEOperations().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetTagsWithMoreThanXInformationObjects__Integer() {
		return dataSetEClass.getEOperations().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetItemsCreatedSince__Date() {
		return dataSetEClass.getEOperations().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__SearchItems__String() {
		return dataSetEClass.getEOperations().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__SearchInformationObjects__String() {
		return dataSetEClass.getEOperations().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetInformationObjectsWithAttachment__Attachment() {
		return dataSetEClass.getEOperations().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonsWithAttachment__Attachment() {
		return dataSetEClass.getEOperations().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetOrganisationsWithAttachment__Attachment() {
		return dataSetEClass.getEOperations().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetContentsWithAttachment__Attachment() {
		return dataSetEClass.getEOperations().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetEqualItem__Item() {
		return dataSetEClass.getEOperations().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__HasEqualItem__Item() {
		return dataSetEClass.getEOperations().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetItemsWithIdent__String() {
		return dataSetEClass.getEOperations().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetAttachmentsWithCachedFileName__String() {
		return dataSetEClass.getEOperations().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetEventsAfter__Date() {
		return dataSetEClass.getEOperations().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetEventsBefore__Date() {
		return dataSetEClass.getEOperations().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetEventsBetweenDates__Date_Date() {
		return dataSetEClass.getEOperations().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetSpicynodesRepresentation() {
		return dataSetEClass.getEOperations().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetConnectionsBetweenInformationObjectsOfDifferentCategories() {
		return dataSetEClass.getEOperations().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetInformationObjectsModifiedSince__Date() {
		return dataSetEClass.getEOperations().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetRandomXInformationObjects__Integer() {
		return dataSetEClass.getEOperations().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetRandomXContents__Integer() {
		return dataSetEClass.getEOperations().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetRandomXPersons__Integer() {
		return dataSetEClass.getEOperations().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetRandomXOrganisations__Integer() {
		return dataSetEClass.getEOperations().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__ForceAdd__Item() {
		return dataSetEClass.getEOperations().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetIdentsOfExistingItems() {
		return dataSetEClass.getEOperations().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetCategoryWithSlug__String() {
		return dataSetEClass.getEOperations().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__RebuildIndexes() {
		return dataSetEClass.getEOperations().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetContentsWithAllMetaTags__EList() {
		return dataSetEClass.getEOperations().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetContentsWithOneOfMetaTags__EList() {
		return dataSetEClass.getEOperations().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonsWithAllMetaTags__EList() {
		return dataSetEClass.getEOperations().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetPersonsWithOneOfMetaTags__EList() {
		return dataSetEClass.getEOperations().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetOrganisationsWithAllMetaTags__EList() {
		return dataSetEClass.getEOperations().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetOrganisationsWithOneOfMetaTags__EList() {
		return dataSetEClass.getEOperations().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetEvents() {
		return dataSetEClass.getEOperations().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__SearchByQuery__String() {
		return dataSetEClass.getEOperations().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetIndoorLocations() {
		return dataSetEClass.getEOperations().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetItemsExceptIdentifiers() {
		return dataSetEClass.getEOperations().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetIdentsOfDeletedItems() {
		return dataSetEClass.getEOperations().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetItemsDeletedSince__Date() {
		return dataSetEClass.getEOperations().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetIdentsOfItemsDeletedSince__Date() {
		return dataSetEClass.getEOperations().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__ClearDeletedItemsList() {
		return dataSetEClass.getEOperations().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetDeletedItems() {
		return dataSetEClass.getEOperations().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetItemsExceptIdentifiersCreatedSince__Date() {
		return dataSetEClass.getEOperations().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataSet__GetItemsExceptIdentifiersModifiedSince__Date() {
		return dataSetEClass.getEOperations().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_DataSet() {
		return (EReference)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Ident() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Uri() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_StringValue() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_LastModified() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Created() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_MetaTags() {
		return (EReference)itemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_IdentifiedBy() {
		return (EReference)itemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_DeleteOnDelete() {
		return (EReference)itemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_DeletedIfDeleted() {
		return (EReference)itemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_ForcedDeleteOnDelete() {
		return (EReference)itemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_ForcedDeletedIfDeleted() {
		return (EReference)itemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__Log__String() {
		return itemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__Log__String_Integer() {
		return itemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__MetaTag__String() {
		return itemEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__IdentifyBy__String_String() {
		return itemEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__GetIdentifier__String() {
		return itemEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__HasMetaTag__String() {
		return itemEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__MatchesSearch__String() {
		return itemEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__Delete() {
		return itemEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__IsEqualItem__Item() {
		return itemEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__GetCreatedPrettyInLanguage__String() {
		return itemEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__GetCreatedPretty() {
		return itemEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__GetLastModifiedPrettyInLanguage__String() {
		return itemEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__GetLastModifiedPretty() {
		return itemEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__DeleteOnDeleteOf__Item() {
		return itemEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__DeleteIfEmptyOnDelete() {
		return itemEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__Update__Item() {
		return itemEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__ForceUpdate__Item() {
		return itemEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__UnMetaTag__String() {
		return itemEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__RemoveIdentifier__String() {
		return itemEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItem__ForceDeleteOnDeleteOf__Item() {
		return itemEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtension__Tag__String() {
		return extensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassification() {
		return classificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassification_Name() {
		return (EAttribute)classificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassification__GetPersons() {
		return classificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassification__GetContents() {
		return classificationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassification__GetOrganisations() {
		return classificationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassification__GetCount() {
		return classificationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassification__GetPersonsCount() {
		return classificationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassification__GetContentsCount() {
		return classificationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassification__GetOrganisationsCount() {
		return classificationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassification__GetSlug() {
		return classificationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Categorized() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_ParentCategory() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Categories() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_MainCategorized() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_Tagged() {
		return (EReference)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganisation() {
		return organisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_ParentOrganisation() {
		return (EReference)organisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_Leader() {
		return (EReference)organisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_Participants() {
		return (EReference)organisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_Organisations() {
		return (EReference)organisationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrganisation__GetPersons() {
		return organisationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrganisation__GetContents() {
		return organisationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOrganisation__AddParticipant__Person() {
		return organisationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaTag() {
		return metaTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaTag_Name() {
		return (EAttribute)metaTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaTag_MetaTagged() {
		return (EReference)metaTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMetaTag__GetWebAccounts() {
		return metaTagEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMetaTag__GetInformationObjects() {
		return metaTagEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMetaTag__GetExtensions() {
		return metaTagEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMetaTag__GetCount() {
		return metaTagEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMetaTag__GetInformationObjectsCount() {
		return metaTagEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhone() {
		return phoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhone_AreaCode() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhone_CountryCode() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhone_Number() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstantMessenger() {
		return instantMessengerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstantMessenger_Username() {
		return (EAttribute)instantMessengerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmail() {
		return emailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmail_Adress() {
		return (EAttribute)emailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebAccount() {
		return webAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAccount_Username() {
		return (EAttribute)webAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebSite() {
		return webSiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebSite_Adress() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebSite_Title() {
		return (EAttribute)webSiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRanking() {
		return rankingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRanking_Date() {
		return (EAttribute)rankingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRanking_Ranker() {
		return (EReference)rankingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_FileUrl() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_CachedFileUrl() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_CachedOnly() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_FileExtension() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_FileIdentifier() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachment_CachedFileName() {
		return (EAttribute)attachmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAttachment__GetOriginalFileUrl() {
		return attachmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Street() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_HouseNumber() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_ZipCode() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Country() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Longitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Latitude() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_City() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_IndoorLocations() {
		return (EReference)locationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_State() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Width() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Height() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStarRanking() {
		return starRankingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStarRanking_RankedInformationObject() {
		return (EReference)starRankingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStarRanking_NormalizedValue() {
		return (EAttribute)starRankingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewRanking() {
		return viewRankingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewRanking_RankedInformationObject() {
		return (EReference)viewRankingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThumbRanking() {
		return thumbRankingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThumbRanking_RankedInformationObject() {
		return (EReference)thumbRankingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getThumbRanking__IsThumbUp() {
		return thumbRankingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getThumbRanking__IsThumbDown() {
		return thumbRankingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Transformed() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideo() {
		return videoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_From() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_To() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinary() {
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinary_Bytes() {
		return (EAttribute)binaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaInformation() {
		return metaInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaInformation_InformationObjects() {
		return (EReference)metaInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndoorLocation() {
		return indoorLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndoorLocation_Location() {
		return (EReference)indoorLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndoorLocation_ParentIndoorLocation() {
		return (EReference)indoorLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndoorLocation_IndoorLocations() {
		return (EReference)indoorLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndoorLocation_Name() {
		return (EAttribute)indoorLocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Key() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Value() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifier_Identified() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Date() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEvent__GetDatePrettyInLanguage__String() {
		return eventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEvent__GetDatePretty() {
		return eventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletedItem() {
		return deletedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletedItem_Deleted() {
		return (EAttribute)deletedItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeletedItem_IdentOfDeleted() {
		return (EAttribute)deletedItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFactory getDataFactory() {
		return (DataFactory)getEFactoryInstance();
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
		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__LASTNAME);
		createEAttribute(personEClass, PERSON__FIRSTNAME);
		createEReference(personEClass, PERSON__LEADER_OF);
		createEReference(personEClass, PERSON__PARTICIPATES);
		createEReference(personEClass, PERSON__AUTHORED);
		createEReference(personEClass, PERSON__CONTRIBUTED);
		createEAttribute(personEClass, PERSON__DATE_OF_BIRTH);
		createEReference(personEClass, PERSON__PERSONS);
		createEAttribute(personEClass, PERSON__TITLE);
		createEReference(personEClass, PERSON__RANKED);
		createEOperation(personEClass, PERSON___GET_CONTENTS);
		createEOperation(personEClass, PERSON___GET_ORGANISATIONS);
		createEOperation(personEClass, PERSON___ADD_CONTRIBUTED_CONTENT__CONTENT);
		createEOperation(personEClass, PERSON___ADD_AUTHORED_CONTENT__CONTENT);
		createEOperation(personEClass, PERSON___PARSE_FIRST_NAME);
		createEOperation(personEClass, PERSON___PARSE_LAST_NAME);

		informationObjectEClass = createEClass(INFORMATION_OBJECT);
		createEReference(informationObjectEClass, INFORMATION_OBJECT__CATEGORIES);
		createEReference(informationObjectEClass, INFORMATION_OBJECT__TAGS);
		createEReference(informationObjectEClass, INFORMATION_OBJECT__IMAGES);
		createEReference(informationObjectEClass, INFORMATION_OBJECT__STAR_RANKINGS);
		createEReference(informationObjectEClass, INFORMATION_OBJECT__THUMB_RANKINGS);
		createEReference(informationObjectEClass, INFORMATION_OBJECT__VIEW_RANKINGS);
		createEAttribute(informationObjectEClass, INFORMATION_OBJECT__NAME);
		createEReference(informationObjectEClass, INFORMATION_OBJECT__CONNECTED_TO);
		createEReference(informationObjectEClass, INFORMATION_OBJECT__CONNECTED_BY);
		createEReference(informationObjectEClass, INFORMATION_OBJECT__BINARIES);
		createEReference(informationObjectEClass, INFORMATION_OBJECT__MAIN_CATEGORY);
		createEReference(informationObjectEClass, INFORMATION_OBJECT__META_INFORMATIONS);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___TAG__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___CATEGORIZE__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___ATTACH_IMAGE__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_ATTACHMENTS);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___STAR_RANK__INTEGER_INTEGER);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___VIEW);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___THUMBS_UP);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___THUMBS_DOWN);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_THUMBS_UP);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_THUMBS_DOWN);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_THUMBS_UP_COUNT);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_THUMBS_DOWN_COUNT);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_THUMBS_COUNT);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_VIEWS_COUNT);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_STAR_RANKING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___EXTEND__METAINFORMATION);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_WEB_ACCOUNTS);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_WEB_SITES);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_PHONES);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_LOCATIONS);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_EMAILS);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_INSTANT_MESSENGERS);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___ADD_EMAIL_ADDRESS__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___ADD_WEB_SITE__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_WITH_COMMON_TAGS);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___ADD_WEB_ACCOUNT__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___HAS_IMAGES);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___CONNECT_TO__INFORMATIONOBJECT);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___CONNECT_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO_WITH_META_TAG__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM_WITH_META_TAG__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_WITH_META_TAG__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_CONNECTIONS_FROM__INFORMATIONOBJECT);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_CONNECTIONS_TO__INFORMATIONOBJECT);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___CONNECT_TO_WITH_VALUE_AND_META_TAG__INFORMATIONOBJECT_STRING_STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_CONNECTION_TO__INFORMATIONOBJECT_STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_CONNECTION_FROM__INFORMATIONOBJECT_STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_ATTACHMENT_WITH_URL__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_URL__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___ADD_PHONE__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_PERSONS_WITH_COMMON_TAGS);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_ORGANISATIONS_WITH_COMMON_TAGS);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_CONTENTS_WITH_COMMON_TAGS);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___UN_TAG__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___UN_CATEGORIZE__STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_SLUG_NAME);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_CONNECTIONS_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING);
		createEOperation(informationObjectEClass, INFORMATION_OBJECT___GET_CONNECTIONS_FROM_WITH_META_TAG__INFORMATIONOBJECT_STRING);

		contentEClass = createEClass(CONTENT);
		createEReference(contentEClass, CONTENT__CONTENTS);
		createEReference(contentEClass, CONTENT__CONTRIBUTORS);
		createEReference(contentEClass, CONTENT__AUTHOR);
		createEReference(contentEClass, CONTENT__DOCUMENTS);
		createEReference(contentEClass, CONTENT__PARENT_CONTENT);
		createEAttribute(contentEClass, CONTENT__LOCALE);
		createEReference(contentEClass, CONTENT__TRANSFORMATIONS);
		createEReference(contentEClass, CONTENT__VIDEOS);
		createEOperation(contentEClass, CONTENT___GET_ORGANISATIONS);
		createEOperation(contentEClass, CONTENT___GET_PERSONS);
		createEOperation(contentEClass, CONTENT___COMMENT__STRING);
		createEOperation(contentEClass, CONTENT___ADD_CONTRIBUTOR__PERSON);
		createEOperation(contentEClass, CONTENT___ATTACH_DOCUMENT__STRING);

		dataSetEClass = createEClass(DATA_SET);
		createEReference(dataSetEClass, DATA_SET__ITEMS);
		createEAttribute(dataSetEClass, DATA_SET__CACHE_FOLDER);
		createEAttribute(dataSetEClass, DATA_SET__CACHE_FILE_ATTACHEMENTS);
		createEReference(dataSetEClass, DATA_SET__SET_UP);
		createEAttribute(dataSetEClass, DATA_SET__LAST_MODIFIED);
		createEAttribute(dataSetEClass, DATA_SET__LOG_LEVEL);
		createEAttribute(dataSetEClass, DATA_SET__IDENT_COUNTER);
		createEAttribute(dataSetEClass, DATA_SET__IDENT_PREFIX);
		createEAttribute(dataSetEClass, DATA_SET__CREATED);
		createEAttribute(dataSetEClass, DATA_SET__KEEP_DELETED_ITEMS_LIST);
		createEReference(dataSetEClass, DATA_SET__ITEMS_DELETED);
		createEOperation(dataSetEClass, DATA_SET___ADD__ITEM);
		createEOperation(dataSetEClass, DATA_SET___GET_ITEMS_WITH_STRING_VALUE__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSONS_WITH_NAME__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSONS_WITH_LASTNAME__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSONS_WITH_FIRST_NAME__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_TAG__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_META_TAG__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_ALL_PERSONS);
		createEOperation(dataSetEClass, DATA_SET___GET_ALL_CONTENTS);
		createEOperation(dataSetEClass, DATA_SET___GET_ALL_ORGANISATIONS);
		createEOperation(dataSetEClass, DATA_SET___GET_ALL_CATEGORIES);
		createEOperation(dataSetEClass, DATA_SET___GET_CATEGORY__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_ALL_TAGS);
		createEOperation(dataSetEClass, DATA_SET___GET_ITEMS_MODIFIED_SINCE__DATE);
		createEOperation(dataSetEClass, DATA_SET___GET_ALL_META_TAGS);
		createEOperation(dataSetEClass, DATA_SET___GET_ALL_CONNECTIONS);
		createEOperation(dataSetEClass, DATA_SET___LOG__STRING);
		createEOperation(dataSetEClass, DATA_SET___LOG__STRING_INTEGER);
		createEOperation(dataSetEClass, DATA_SET___GET_CONTENT_WITH_IDENT__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSON_WITH_IDENT__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_ORGANISATION_WITH_IDENT__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_ATTACHMENT_WITH_IDENT__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_INFORMATION_OBJECTS_WITH_ALL_CATEGORIES__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_INFORMATION_OBJECTS_WITH_ONE_OF_CATEGORIES__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_CONTENTS_WITH_ALL_CATEGORIES__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_CONTENTS_WITH_ONE_OF_CATEGORIES__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSONS_WITH_ALL_CATEGORIES__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSONS_WITH_ONE_OF_CATEGORIES__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_ORGANISATIONS_WITH_ALL_CATEGORIES__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_ORGANISATIONS_WITH_ONE_OF_CATEGORIES__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_INFORMATION_OBJECTS_WITH_ALL_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_INFORMATION_OBJECTS_WITH_ONE_OF_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_ORGANISATIONS_WITH_ALL_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_ORGANISATIONS_WITH_ONE_OF_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSONS_WITH_ALL_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSONS_WITH_ONE_OF_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_CONTENTS_WITH_ALL_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_CONTENTS_WITH_ONE_OF_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_CONTENTS_WITH_NAME__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_ORGANISATIONS_WITH_NAME__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_ITEMS_WITH_ALL_META_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_ITEMS_WITH_ONE_OF_META_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSONS);
		createEOperation(dataSetEClass, DATA_SET___GET_ORGANISATIONS);
		createEOperation(dataSetEClass, DATA_SET___GET_CONTENTS);
		createEOperation(dataSetEClass, DATA_SET___GET_INFORMATION_OBJECTS);
		createEOperation(dataSetEClass, DATA_SET___GET_TAGS);
		createEOperation(dataSetEClass, DATA_SET___GET_META_TAGS);
		createEOperation(dataSetEClass, DATA_SET___GET_ATTACHMENTS);
		createEOperation(dataSetEClass, DATA_SET___GET_BINARIES);
		createEOperation(dataSetEClass, DATA_SET___GET_CATEGORIES);
		createEOperation(dataSetEClass, DATA_SET___GET_CLASSIFICATIONS);
		createEOperation(dataSetEClass, DATA_SET___GET_CONNECTIONS);
		createEOperation(dataSetEClass, DATA_SET___GET_DOCUMENTS);
		createEOperation(dataSetEClass, DATA_SET___GET_EMAILS);
		createEOperation(dataSetEClass, DATA_SET___GET_EXTENSIONS);
		createEOperation(dataSetEClass, DATA_SET___GET_IMAGES);
		createEOperation(dataSetEClass, DATA_SET___GET_INSTANT_MESSENGERS);
		createEOperation(dataSetEClass, DATA_SET___GET_LOCATIONS);
		createEOperation(dataSetEClass, DATA_SET___GET_META_INFORMATIONS);
		createEOperation(dataSetEClass, DATA_SET___GET_PHONES);
		createEOperation(dataSetEClass, DATA_SET___GET_RANKINGS);
		createEOperation(dataSetEClass, DATA_SET___GET_STAR_RANKINGS);
		createEOperation(dataSetEClass, DATA_SET___GET_THUMB_RANKINGS);
		createEOperation(dataSetEClass, DATA_SET___GET_TRANSFORMATIONS);
		createEOperation(dataSetEClass, DATA_SET___GET_VIDEOS);
		createEOperation(dataSetEClass, DATA_SET___GET_VIEW_RANKINGS);
		createEOperation(dataSetEClass, DATA_SET___GET_WEB_ACCOUNTS);
		createEOperation(dataSetEClass, DATA_SET___GET_WEB_SITES);
		createEOperation(dataSetEClass, DATA_SET___GET_INFORMATION_OBJECTS_WITH_ALL_META_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_INFORMATION_OBJECTS_WITH_ONE_OF_META_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_IDENTIFIERS);
		createEOperation(dataSetEClass, DATA_SET___GET_IDENTIFIERS_WITH_KEY__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_IDENTIFIER_WITH_KEY_VALUE__STRING_STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_ITEM_WITH_IDENTIFIER__STRING_STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSON_WITH_IDENTIFIER__STRING_STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_CONTENT_WITH_IDENTIFIER__STRING_STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_ORGANISATION_WITH_IDENTIFIER__STRING_STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_LOCATION_WITH_IDENTIFIER__STRING_STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_INDOOR_LOCATION_WITH_IDENTIFIER__STRING_STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_IMAGE_WITH_IDENTIFIER__STRING_STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_EMPTY_ITEM_WITH_IDENT__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_TAGS_WITH_MORE_THAN_XINFORMATION_OBJECTS__INTEGER);
		createEOperation(dataSetEClass, DATA_SET___GET_ITEMS_CREATED_SINCE__DATE);
		createEOperation(dataSetEClass, DATA_SET___SEARCH_ITEMS__STRING);
		createEOperation(dataSetEClass, DATA_SET___SEARCH_INFORMATION_OBJECTS__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_INFORMATION_OBJECTS_WITH_ATTACHMENT__ATTACHMENT);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSONS_WITH_ATTACHMENT__ATTACHMENT);
		createEOperation(dataSetEClass, DATA_SET___GET_ORGANISATIONS_WITH_ATTACHMENT__ATTACHMENT);
		createEOperation(dataSetEClass, DATA_SET___GET_CONTENTS_WITH_ATTACHMENT__ATTACHMENT);
		createEOperation(dataSetEClass, DATA_SET___GET_EQUAL_ITEM__ITEM);
		createEOperation(dataSetEClass, DATA_SET___HAS_EQUAL_ITEM__ITEM);
		createEOperation(dataSetEClass, DATA_SET___GET_ITEMS_WITH_IDENT__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_ATTACHMENTS_WITH_CACHED_FILE_NAME__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_EVENTS_AFTER__DATE);
		createEOperation(dataSetEClass, DATA_SET___GET_EVENTS_BEFORE__DATE);
		createEOperation(dataSetEClass, DATA_SET___GET_EVENTS_BETWEEN_DATES__DATE_DATE);
		createEOperation(dataSetEClass, DATA_SET___GET_SPICYNODES_REPRESENTATION);
		createEOperation(dataSetEClass, DATA_SET___GET_CONNECTIONS_BETWEEN_INFORMATION_OBJECTS_OF_DIFFERENT_CATEGORIES);
		createEOperation(dataSetEClass, DATA_SET___GET_INFORMATION_OBJECTS_MODIFIED_SINCE__DATE);
		createEOperation(dataSetEClass, DATA_SET___GET_RANDOM_XINFORMATION_OBJECTS__INTEGER);
		createEOperation(dataSetEClass, DATA_SET___GET_RANDOM_XCONTENTS__INTEGER);
		createEOperation(dataSetEClass, DATA_SET___GET_RANDOM_XPERSONS__INTEGER);
		createEOperation(dataSetEClass, DATA_SET___GET_RANDOM_XORGANISATIONS__INTEGER);
		createEOperation(dataSetEClass, DATA_SET___FORCE_ADD__ITEM);
		createEOperation(dataSetEClass, DATA_SET___GET_IDENTS_OF_EXISTING_ITEMS);
		createEOperation(dataSetEClass, DATA_SET___GET_CATEGORY_WITH_SLUG__STRING);
		createEOperation(dataSetEClass, DATA_SET___REBUILD_INDEXES);
		createEOperation(dataSetEClass, DATA_SET___GET_CONTENTS_WITH_ALL_META_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_CONTENTS_WITH_ONE_OF_META_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSONS_WITH_ALL_META_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_PERSONS_WITH_ONE_OF_META_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_ORGANISATIONS_WITH_ALL_META_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_ORGANISATIONS_WITH_ONE_OF_META_TAGS__ELIST);
		createEOperation(dataSetEClass, DATA_SET___GET_EVENTS);
		createEOperation(dataSetEClass, DATA_SET___SEARCH_BY_QUERY__STRING);
		createEOperation(dataSetEClass, DATA_SET___GET_INDOOR_LOCATIONS);
		createEOperation(dataSetEClass, DATA_SET___GET_ITEMS_EXCEPT_IDENTIFIERS);
		createEOperation(dataSetEClass, DATA_SET___GET_IDENTS_OF_DELETED_ITEMS);
		createEOperation(dataSetEClass, DATA_SET___GET_ITEMS_DELETED_SINCE__DATE);
		createEOperation(dataSetEClass, DATA_SET___GET_IDENTS_OF_ITEMS_DELETED_SINCE__DATE);
		createEOperation(dataSetEClass, DATA_SET___CLEAR_DELETED_ITEMS_LIST);
		createEOperation(dataSetEClass, DATA_SET___GET_DELETED_ITEMS);
		createEOperation(dataSetEClass, DATA_SET___GET_ITEMS_EXCEPT_IDENTIFIERS_CREATED_SINCE__DATE);
		createEOperation(dataSetEClass, DATA_SET___GET_ITEMS_EXCEPT_IDENTIFIERS_MODIFIED_SINCE__DATE);

		itemEClass = createEClass(ITEM);
		createEReference(itemEClass, ITEM__DATA_SET);
		createEAttribute(itemEClass, ITEM__IDENT);
		createEAttribute(itemEClass, ITEM__URI);
		createEAttribute(itemEClass, ITEM__STRING_VALUE);
		createEAttribute(itemEClass, ITEM__LAST_MODIFIED);
		createEAttribute(itemEClass, ITEM__CREATED);
		createEReference(itemEClass, ITEM__META_TAGS);
		createEReference(itemEClass, ITEM__IDENTIFIED_BY);
		createEReference(itemEClass, ITEM__DELETE_ON_DELETE);
		createEReference(itemEClass, ITEM__DELETED_IF_DELETED);
		createEReference(itemEClass, ITEM__FORCED_DELETE_ON_DELETE);
		createEReference(itemEClass, ITEM__FORCED_DELETED_IF_DELETED);
		createEOperation(itemEClass, ITEM___LOG__STRING);
		createEOperation(itemEClass, ITEM___LOG__STRING_INTEGER);
		createEOperation(itemEClass, ITEM___META_TAG__STRING);
		createEOperation(itemEClass, ITEM___IDENTIFY_BY__STRING_STRING);
		createEOperation(itemEClass, ITEM___GET_IDENTIFIER__STRING);
		createEOperation(itemEClass, ITEM___HAS_META_TAG__STRING);
		createEOperation(itemEClass, ITEM___MATCHES_SEARCH__STRING);
		createEOperation(itemEClass, ITEM___DELETE);
		createEOperation(itemEClass, ITEM___IS_EQUAL_ITEM__ITEM);
		createEOperation(itemEClass, ITEM___GET_CREATED_PRETTY_IN_LANGUAGE__STRING);
		createEOperation(itemEClass, ITEM___GET_CREATED_PRETTY);
		createEOperation(itemEClass, ITEM___GET_LAST_MODIFIED_PRETTY_IN_LANGUAGE__STRING);
		createEOperation(itemEClass, ITEM___GET_LAST_MODIFIED_PRETTY);
		createEOperation(itemEClass, ITEM___DELETE_ON_DELETE_OF__ITEM);
		createEOperation(itemEClass, ITEM___DELETE_IF_EMPTY_ON_DELETE);
		createEOperation(itemEClass, ITEM___UPDATE__ITEM);
		createEOperation(itemEClass, ITEM___FORCE_UPDATE__ITEM);
		createEOperation(itemEClass, ITEM___UN_META_TAG__STRING);
		createEOperation(itemEClass, ITEM___REMOVE_IDENTIFIER__STRING);
		createEOperation(itemEClass, ITEM___FORCE_DELETE_ON_DELETE_OF__ITEM);

		extensionEClass = createEClass(EXTENSION);
		createEOperation(extensionEClass, EXTENSION___TAG__STRING);

		classificationEClass = createEClass(CLASSIFICATION);
		createEAttribute(classificationEClass, CLASSIFICATION__NAME);
		createEOperation(classificationEClass, CLASSIFICATION___GET_PERSONS);
		createEOperation(classificationEClass, CLASSIFICATION___GET_CONTENTS);
		createEOperation(classificationEClass, CLASSIFICATION___GET_ORGANISATIONS);
		createEOperation(classificationEClass, CLASSIFICATION___GET_COUNT);
		createEOperation(classificationEClass, CLASSIFICATION___GET_PERSONS_COUNT);
		createEOperation(classificationEClass, CLASSIFICATION___GET_CONTENTS_COUNT);
		createEOperation(classificationEClass, CLASSIFICATION___GET_ORGANISATIONS_COUNT);
		createEOperation(classificationEClass, CLASSIFICATION___GET_SLUG);

		categoryEClass = createEClass(CATEGORY);
		createEReference(categoryEClass, CATEGORY__CATEGORIZED);
		createEReference(categoryEClass, CATEGORY__PARENT_CATEGORY);
		createEReference(categoryEClass, CATEGORY__CATEGORIES);
		createEReference(categoryEClass, CATEGORY__MAIN_CATEGORIZED);

		tagEClass = createEClass(TAG);
		createEReference(tagEClass, TAG__TAGGED);

		organisationEClass = createEClass(ORGANISATION);
		createEReference(organisationEClass, ORGANISATION__PARENT_ORGANISATION);
		createEReference(organisationEClass, ORGANISATION__LEADER);
		createEReference(organisationEClass, ORGANISATION__PARTICIPANTS);
		createEReference(organisationEClass, ORGANISATION__ORGANISATIONS);
		createEOperation(organisationEClass, ORGANISATION___GET_PERSONS);
		createEOperation(organisationEClass, ORGANISATION___GET_CONTENTS);
		createEOperation(organisationEClass, ORGANISATION___ADD_PARTICIPANT__PERSON);

		metaTagEClass = createEClass(META_TAG);
		createEAttribute(metaTagEClass, META_TAG__NAME);
		createEReference(metaTagEClass, META_TAG__META_TAGGED);
		createEOperation(metaTagEClass, META_TAG___GET_WEB_ACCOUNTS);
		createEOperation(metaTagEClass, META_TAG___GET_INFORMATION_OBJECTS);
		createEOperation(metaTagEClass, META_TAG___GET_EXTENSIONS);
		createEOperation(metaTagEClass, META_TAG___GET_COUNT);
		createEOperation(metaTagEClass, META_TAG___GET_INFORMATION_OBJECTS_COUNT);

		phoneEClass = createEClass(PHONE);
		createEAttribute(phoneEClass, PHONE__AREA_CODE);
		createEAttribute(phoneEClass, PHONE__COUNTRY_CODE);
		createEAttribute(phoneEClass, PHONE__NUMBER);

		instantMessengerEClass = createEClass(INSTANT_MESSENGER);
		createEAttribute(instantMessengerEClass, INSTANT_MESSENGER__USERNAME);

		emailEClass = createEClass(EMAIL);
		createEAttribute(emailEClass, EMAIL__ADRESS);

		webAccountEClass = createEClass(WEB_ACCOUNT);
		createEAttribute(webAccountEClass, WEB_ACCOUNT__USERNAME);

		webSiteEClass = createEClass(WEB_SITE);
		createEAttribute(webSiteEClass, WEB_SITE__ADRESS);
		createEAttribute(webSiteEClass, WEB_SITE__TITLE);

		rankingEClass = createEClass(RANKING);
		createEAttribute(rankingEClass, RANKING__DATE);
		createEReference(rankingEClass, RANKING__RANKER);

		attachmentEClass = createEClass(ATTACHMENT);
		createEAttribute(attachmentEClass, ATTACHMENT__FILE_URL);
		createEAttribute(attachmentEClass, ATTACHMENT__CACHED_FILE_URL);
		createEAttribute(attachmentEClass, ATTACHMENT__CACHED_ONLY);
		createEAttribute(attachmentEClass, ATTACHMENT__FILE_EXTENSION);
		createEAttribute(attachmentEClass, ATTACHMENT__FILE_IDENTIFIER);
		createEAttribute(attachmentEClass, ATTACHMENT__CACHED_FILE_NAME);
		createEOperation(attachmentEClass, ATTACHMENT___GET_ORIGINAL_FILE_URL);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__STREET);
		createEAttribute(locationEClass, LOCATION__HOUSE_NUMBER);
		createEAttribute(locationEClass, LOCATION__ZIP_CODE);
		createEAttribute(locationEClass, LOCATION__COUNTRY);
		createEAttribute(locationEClass, LOCATION__LONGITUDE);
		createEAttribute(locationEClass, LOCATION__LATITUDE);
		createEAttribute(locationEClass, LOCATION__CITY);
		createEReference(locationEClass, LOCATION__INDOOR_LOCATIONS);
		createEAttribute(locationEClass, LOCATION__STATE);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__WIDTH);
		createEAttribute(imageEClass, IMAGE__HEIGHT);

		documentEClass = createEClass(DOCUMENT);

		starRankingEClass = createEClass(STAR_RANKING);
		createEReference(starRankingEClass, STAR_RANKING__RANKED_INFORMATION_OBJECT);
		createEAttribute(starRankingEClass, STAR_RANKING__NORMALIZED_VALUE);

		viewRankingEClass = createEClass(VIEW_RANKING);
		createEReference(viewRankingEClass, VIEW_RANKING__RANKED_INFORMATION_OBJECT);

		thumbRankingEClass = createEClass(THUMB_RANKING);
		createEReference(thumbRankingEClass, THUMB_RANKING__RANKED_INFORMATION_OBJECT);
		createEOperation(thumbRankingEClass, THUMB_RANKING___IS_THUMB_UP);
		createEOperation(thumbRankingEClass, THUMB_RANKING___IS_THUMB_DOWN);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__TRANSFORMED);

		videoEClass = createEClass(VIDEO);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__FROM);
		createEReference(connectionEClass, CONNECTION__TO);

		binaryEClass = createEClass(BINARY);
		createEAttribute(binaryEClass, BINARY__BYTES);

		metaInformationEClass = createEClass(META_INFORMATION);
		createEReference(metaInformationEClass, META_INFORMATION__INFORMATION_OBJECTS);

		indoorLocationEClass = createEClass(INDOOR_LOCATION);
		createEReference(indoorLocationEClass, INDOOR_LOCATION__LOCATION);
		createEReference(indoorLocationEClass, INDOOR_LOCATION__PARENT_INDOOR_LOCATION);
		createEReference(indoorLocationEClass, INDOOR_LOCATION__INDOOR_LOCATIONS);
		createEAttribute(indoorLocationEClass, INDOOR_LOCATION__NAME);

		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__KEY);
		createEAttribute(identifierEClass, IDENTIFIER__VALUE);
		createEReference(identifierEClass, IDENTIFIER__IDENTIFIED);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__DATE);
		createEOperation(eventEClass, EVENT___GET_DATE_PRETTY_IN_LANGUAGE__STRING);
		createEOperation(eventEClass, EVENT___GET_DATE_PRETTY);

		deletedItemEClass = createEClass(DELETED_ITEM);
		createEAttribute(deletedItemEClass, DELETED_ITEM__DELETED);
		createEAttribute(deletedItemEClass, DELETED_ITEM__IDENT_OF_DELETED);
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
		ApplicationPackage theApplicationPackage = (ApplicationPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		personEClass.getESuperTypes().add(this.getInformationObject());
		informationObjectEClass.getESuperTypes().add(this.getItem());
		contentEClass.getESuperTypes().add(this.getInformationObject());
		extensionEClass.getESuperTypes().add(this.getItem());
		classificationEClass.getESuperTypes().add(this.getItem());
		categoryEClass.getESuperTypes().add(this.getClassification());
		tagEClass.getESuperTypes().add(this.getClassification());
		organisationEClass.getESuperTypes().add(this.getInformationObject());
		metaTagEClass.getESuperTypes().add(this.getItem());
		phoneEClass.getESuperTypes().add(this.getMetaInformation());
		instantMessengerEClass.getESuperTypes().add(this.getMetaInformation());
		emailEClass.getESuperTypes().add(this.getMetaInformation());
		webAccountEClass.getESuperTypes().add(this.getMetaInformation());
		webSiteEClass.getESuperTypes().add(this.getMetaInformation());
		rankingEClass.getESuperTypes().add(this.getExtension());
		attachmentEClass.getESuperTypes().add(this.getExtension());
		locationEClass.getESuperTypes().add(this.getMetaInformation());
		imageEClass.getESuperTypes().add(this.getAttachment());
		documentEClass.getESuperTypes().add(this.getAttachment());
		starRankingEClass.getESuperTypes().add(this.getRanking());
		viewRankingEClass.getESuperTypes().add(this.getRanking());
		thumbRankingEClass.getESuperTypes().add(this.getRanking());
		transformationEClass.getESuperTypes().add(this.getAttachment());
		videoEClass.getESuperTypes().add(this.getAttachment());
		connectionEClass.getESuperTypes().add(this.getExtension());
		binaryEClass.getESuperTypes().add(this.getAttachment());
		metaInformationEClass.getESuperTypes().add(this.getExtension());
		indoorLocationEClass.getESuperTypes().add(this.getMetaInformation());
		identifierEClass.getESuperTypes().add(this.getItem());
		eventEClass.getESuperTypes().add(this.getMetaInformation());
		deletedItemEClass.getESuperTypes().add(this.getItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Firstname(), ecorePackage.getEString(), "firstname", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_LeaderOf(), this.getOrganisation(), this.getOrganisation_Leader(), "leaderOf", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Participates(), this.getOrganisation(), this.getOrganisation_Participants(), "participates", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Authored(), this.getContent(), this.getContent_Author(), "authored", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Contributed(), this.getContent(), this.getContent_Contributors(), "contributed", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_DateOfBirth(), ecorePackage.getEDate(), "dateOfBirth", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Persons(), this.getPerson(), null, "persons", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Title(), ecorePackage.getEString(), "title", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_Ranked(), this.getRanking(), this.getRanking_Ranker(), "ranked", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPerson__GetContents(), this.getContent(), "getContents", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPerson__GetOrganisations(), this.getOrganisation(), "getOrganisations", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getPerson__AddContributedContent__Content(), this.getContent(), "addContributedContent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContent(), "contributedContent", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPerson__AddAuthoredContent__Content(), this.getContent(), "addAuthoredContent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContent(), "authoredContent", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPerson__ParseFirstName(), ecorePackage.getEString(), "parseFirstName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPerson__ParseLastName(), ecorePackage.getEString(), "parseLastName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(informationObjectEClass, InformationObject.class, "InformationObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationObject_Categories(), this.getCategory(), this.getCategory_Categorized(), "categories", null, 0, -1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationObject_Tags(), this.getTag(), this.getTag_Tagged(), "tags", null, 0, -1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationObject_Images(), this.getImage(), null, "images", null, 0, -1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationObject_StarRankings(), this.getStarRanking(), this.getStarRanking_RankedInformationObject(), "starRankings", null, 0, -1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationObject_ThumbRankings(), this.getThumbRanking(), this.getThumbRanking_RankedInformationObject(), "thumbRankings", null, 0, -1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationObject_ViewRankings(), this.getViewRanking(), this.getViewRanking_RankedInformationObject(), "viewRankings", null, 0, -1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInformationObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationObject_ConnectedTo(), this.getConnection(), this.getConnection_From(), "connectedTo", null, 0, -1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationObject_ConnectedBy(), this.getConnection(), this.getConnection_To(), "connectedBy", null, 0, -1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationObject_Binaries(), this.getBinary(), null, "binaries", null, 0, -1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationObject_MainCategory(), this.getCategory(), this.getCategory_MainCategorized(), "mainCategory", null, 0, 1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationObject_MetaInformations(), this.getMetaInformation(), this.getMetaInformation_InformationObjects(), "metaInformations", null, 0, -1, InformationObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getInformationObject__Tag__String(), this.getTag(), "tag", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__Categorize__String(), this.getCategory(), "categorize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__AttachImage__String(), this.getImage(), "attachImage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "imageUrl", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetAttachments(), this.getAttachment(), "getAttachments", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__StarRank__Integer_Integer(), this.getStarRanking(), "starRank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "stars", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "ofStars", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__View(), this.getViewRanking(), "view", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__ThumbsUp(), this.getThumbRanking(), "thumbsUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__ThumbsDown(), this.getThumbRanking(), "thumbsDown", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetThumbsUp(), this.getThumbRanking(), "getThumbsUp", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetThumbsDown(), this.getThumbRanking(), "getThumbsDown", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetThumbsUpCount(), ecorePackage.getEIntegerObject(), "getThumbsUpCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetThumbsDownCount(), ecorePackage.getEIntegerObject(), "getThumbsDownCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetThumbsCount(), ecorePackage.getEIntegerObject(), "getThumbsCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetViewsCount(), ecorePackage.getEIntegerObject(), "getViewsCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetStarRanking(), ecorePackage.getEDoubleObject(), "getStarRanking", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__Extend__MetaInformation(), this.getMetaInformation(), "extend", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaInformation(), "metaInformation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetWebAccounts(), this.getWebAccount(), "getWebAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetWebSites(), this.getWebSite(), "getWebSites", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetPhones(), this.getPhone(), "getPhones", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetLocations(), this.getLocation(), "getLocations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetEmails(), this.getEmail(), "getEmails", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetInstantMessengers(), this.getInstantMessenger(), "getInstantMessengers", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__AddEmailAddress__String(), this.getEmail(), "addEmailAddress", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "emailAdress", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__AddWebSite__String(), this.getWebSite(), "addWebSite", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "url", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetInformationObjectsWithCommonTags(), this.getInformationObject(), "getInformationObjectsWithCommonTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__AddWebAccount__String(), this.getWebAccount(), "addWebAccount", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__HasImages(), ecorePackage.getEBooleanObject(), "hasImages", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetInformationObjectsConnectedTo(), this.getInformationObject(), "getInformationObjectsConnectedTo", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetInformationObjectsConnectedFrom(), this.getInformationObject(), "getInformationObjectsConnectedFrom", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetInformationObjectsConnected(), this.getInformationObject(), "getInformationObjectsConnected", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__ConnectTo__InformationObject(), this.getConnection(), "connectTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__ConnectToWithMetaTag__InformationObject_String(), this.getConnection(), "connectToWithMetaTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__GetInformationObjectsConnectedToWithMetaTag__String(), this.getInformationObject(), "getInformationObjectsConnectedToWithMetaTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__GetInformationObjectsConnectedFromWithMetaTag__String(), this.getInformationObject(), "getInformationObjectsConnectedFromWithMetaTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__GetInformationObjectsConnectedWithMetaTag__String(), this.getInformationObject(), "getInformationObjectsConnectedWithMetaTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__GetConnectionsFrom__InformationObject(), this.getConnection(), "getConnectionsFrom", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__GetConnectionsTo__InformationObject(), this.getConnection(), "getConnectionsTo", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__ConnectToWithValueAndMetaTag__InformationObject_String_String(), this.getConnection(), "connectToWithValueAndMetaTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__GetConnectionTo__InformationObject_String(), this.getConnection(), "getConnectionTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__GetConnectionFrom__InformationObject_String(), this.getConnection(), "getConnectionFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__GetAttachmentWithUrl__String(), this.getAttachment(), "getAttachmentWithUrl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "url", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__GetAttachedImageWithUrl__String(), this.getImage(), "getAttachedImageWithUrl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "url", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__AddPhone__String(), this.getPhone(), "addPhone", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phoneNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetPersonsWithCommonTags(), this.getPerson(), "getPersonsWithCommonTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetOrganisationsWithCommonTags(), this.getOrganisation(), "getOrganisationsWithCommonTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetContentsWithCommonTags(), this.getContent(), "getContentsWithCommonTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__UnTag__String(), this.getTag(), "unTag", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__UnCategorize__String(), this.getCategory(), "unCategorize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getInformationObject__GetSlugName(), ecorePackage.getEString(), "getSlugName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__GetConnectionsToWithMetaTag__InformationObject_String(), this.getConnection(), "getConnectionsToWithMetaTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationObject__GetConnectionsFromWithMetaTag__InformationObject_String(), this.getConnection(), "getConnectionsFromWithMetaTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContent_Contents(), this.getContent(), this.getContent_ParentContent(), "contents", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Contributors(), this.getPerson(), this.getPerson_Contributed(), "contributors", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Author(), this.getPerson(), this.getPerson_Authored(), "author", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Documents(), this.getDocument(), null, "documents", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_ParentContent(), this.getContent(), this.getContent_Contents(), "parentContent", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_Locale(), ecorePackage.getEString(), "locale", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Transformations(), this.getTransformation(), this.getTransformation_Transformed(), "transformations", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Videos(), this.getVideo(), null, "videos", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getContent__GetOrganisations(), this.getOrganisation(), "getOrganisations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContent__GetPersons(), this.getPerson(), "getPersons", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContent__Comment__String(), this.getContent(), "comment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "comment", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContent__AddContributor__Person(), this.getPerson(), "addContributor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPerson(), "contributor", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContent__AttachDocument__String(), this.getDocument(), "attachDocument", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileUrl", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataSetEClass, DataSet.class, "DataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSet_Items(), this.getItem(), this.getItem_DataSet(), "items", null, 0, -1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_CacheFolder(), ecorePackage.getEString(), "cacheFolder", null, 0, 1, DataSet.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_CacheFileAttachements(), ecorePackage.getEBooleanObject(), "cacheFileAttachements", "false", 1, 1, DataSet.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSet_SetUp(), theApplicationPackage.getMashup(), null, "setUp", null, 0, 1, DataSet.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_LastModified(), ecorePackage.getEDate(), "lastModified", null, 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_LogLevel(), ecorePackage.getEIntegerObject(), "logLevel", null, 0, 1, DataSet.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_IdentCounter(), ecorePackage.getELongObject(), "identCounter", "1", 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_IdentPrefix(), ecorePackage.getEString(), "identPrefix", "a_", 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_Created(), ecorePackage.getEDate(), "created", null, 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_KeepDeletedItemsList(), ecorePackage.getEBooleanObject(), "keepDeletedItemsList", "false", 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSet_ItemsDeleted(), this.getDeletedItem(), null, "itemsDeleted", null, 0, -1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDataSet__Add__Item(), this.getItem(), "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetItemsWithStringValue__String(), this.getItem(), "getItemsWithStringValue", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "stringValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonsWithName__String(), this.getPerson(), "getPersonsWithName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonsWithLastname__String(), this.getPerson(), "getPersonsWithLastname", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastname", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonsWithFirstName__String(), this.getPerson(), "getPersonsWithFirstName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstname", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetTag__String(), this.getTag(), "getTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetMetaTag__String(), this.getMetaTag(), "getMetaTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetAllPersons(), this.getPerson(), "getAllPersons", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetAllContents(), this.getContent(), "getAllContents", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetAllOrganisations(), this.getOrganisation(), "getAllOrganisations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetAllCategories(), this.getCategory(), "getAllCategories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetCategory__String(), this.getCategory(), "getCategory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetAllTags(), this.getTag(), "getAllTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetItemsModifiedSince__Date(), this.getItem(), "getItemsModifiedSince", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetAllMetaTags(), this.getMetaTag(), "getAllMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetAllConnections(), this.getConnection(), "getAllConnections", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__Log__String(), null, "log", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__Log__String_Integer(), null, "log", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetContentWithIdent__String(), this.getContent(), "getContentWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonWithIdent__String(), this.getPerson(), "getPersonWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetOrganisationWithIdent__String(), this.getOrganisation(), "getOrganisationWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetAttachmentWithIdent__String(), this.getAttachment(), "getAttachmentWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetInformationObjectsWithAllCategories__EList(), this.getInformationObject(), "getInformationObjectsWithAllCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetInformationObjectsWithOneOfCategories__EList(), this.getInformationObject(), "getInformationObjectsWithOneOfCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetContentsWithAllCategories__EList(), this.getContent(), "getContentsWithAllCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetContentsWithOneOfCategories__EList(), this.getContent(), "getContentsWithOneOfCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonsWithAllCategories__EList(), this.getPerson(), "getPersonsWithAllCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonsWithOneOfCategories__EList(), this.getPerson(), "getPersonsWithOneOfCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetOrganisationsWithAllCategories__EList(), this.getOrganisation(), "getOrganisationsWithAllCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetOrganisationsWithOneOfCategories__EList(), this.getOrganisation(), "getOrganisationsWithOneOfCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetInformationObjectsWithAllTags__EList(), this.getInformationObject(), "getInformationObjectsWithAllTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetInformationObjectsWithOneOfTags__EList(), this.getInformationObject(), "getInformationObjectsWithOneOfTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetOrganisationsWithAllTags__EList(), this.getOrganisation(), "getOrganisationsWithAllTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetOrganisationsWithOneOfTags__EList(), this.getOrganisation(), "getOrganisationsWithOneOfTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonsWithAllTags__EList(), this.getPerson(), "getPersonsWithAllTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonsWithOneOfTags__EList(), this.getPerson(), "getPersonsWithOneOfTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetContentsWithAllTags__EList(), this.getContent(), "getContentsWithAllTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetContentsWithOneOfTags__EList(), this.getContent(), "getContentsWithOneOfTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetContentsWithName__String(), this.getContent(), "getContentsWithName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetOrganisationsWithName__String(), this.getOrganisation(), "getOrganisationsWithName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetItemsWithAllMetaTags__EList(), this.getItem(), "getItemsWithAllMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetItemsWithOneOfMetaTags__EList(), this.getItem(), "getItemsWithOneOfMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetPersons(), this.getPerson(), "getPersons", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetOrganisations(), this.getOrganisation(), "getOrganisations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetContents(), this.getContent(), "getContents", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetInformationObjects(), this.getInformationObject(), "getInformationObjects", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetTags(), this.getTag(), "getTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetMetaTags(), this.getMetaTag(), "getMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetAttachments(), this.getAttachment(), "getAttachments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetBinaries(), this.getBinary(), "getBinaries", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetCategories(), this.getCategory(), "getCategories", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetClassifications(), this.getClassification(), "getClassifications", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetConnections(), this.getConnection(), "getConnections", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetDocuments(), this.getDocument(), "getDocuments", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetEmails(), this.getEmail(), "getEmails", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetExtensions(), this.getExtension(), "getExtensions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetImages(), this.getImage(), "getImages", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetInstantMessengers(), this.getInstantMessenger(), "getInstantMessengers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetLocations(), this.getLocation(), "getLocations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetMetaInformations(), this.getMetaInformation(), "getMetaInformations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetPhones(), this.getPhone(), "getPhones", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetRankings(), this.getRanking(), "getRankings", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetStarRankings(), this.getStarRanking(), "getStarRankings", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetThumbRankings(), this.getThumbRanking(), "getThumbRankings", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetTransformations(), this.getTransformation(), "getTransformations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetVideos(), this.getVideo(), "getVideos", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetViewRankings(), this.getViewRanking(), "getViewRankings", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetWebAccounts(), this.getWebAccount(), "getWebAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetWebSites(), this.getWebSite(), "getWebSites", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetInformationObjectsWithAllMetaTags__EList(), this.getInformationObject(), "getInformationObjectsWithAllMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetInformationObjectsWithOneOfMetaTags__EList(), this.getInformationObject(), "getInformationObjectsWithOneOfMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetIdentifiers(), this.getIdentifier(), "getIdentifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetIdentifiersWithKey__String(), this.getIdentifier(), "getIdentifiersWithKey", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetIdentifierWithKeyValue__String_String(), this.getIdentifier(), "getIdentifierWithKeyValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetItemWithIdentifier__String_String(), this.getItem(), "getItemWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonWithIdentifier__String_String(), this.getPerson(), "getPersonWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetContentWithIdentifier__String_String(), this.getContent(), "getContentWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetOrganisationWithIdentifier__String_String(), this.getOrganisation(), "getOrganisationWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetLocationWithIdentifier__String_String(), this.getLocation(), "getLocationWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetIndoorLocationWithIdentifier__String_String(), this.getIndoorLocation(), "getIndoorLocationWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetImageWithIdentifier__String_String(), this.getImage(), "getImageWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetEmptyItemWithIdent__String(), this.getItem(), "getEmptyItemWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetTagsWithMoreThanXInformationObjects__Integer(), this.getTag(), "getTagsWithMoreThanXInformationObjects", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "x", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetItemsCreatedSince__Date(), this.getItem(), "getItemsCreatedSince", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__SearchItems__String(), this.getItem(), "searchItems", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__SearchInformationObjects__String(), this.getInformationObject(), "searchInformationObjects", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetInformationObjectsWithAttachment__Attachment(), this.getInformationObject(), "getInformationObjectsWithAttachment", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttachment(), "attachment", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonsWithAttachment__Attachment(), this.getPerson(), "getPersonsWithAttachment", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttachment(), "attachment", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetOrganisationsWithAttachment__Attachment(), this.getOrganisation(), "getOrganisationsWithAttachment", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttachment(), "attachment", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetContentsWithAttachment__Attachment(), this.getContent(), "getContentsWithAttachment", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttachment(), "attachment", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetEqualItem__Item(), this.getItem(), "getEqualItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__HasEqualItem__Item(), ecorePackage.getEBooleanObject(), "hasEqualItem", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetItemsWithIdent__String(), this.getItem(), "getItemsWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetAttachmentsWithCachedFileName__String(), this.getAttachment(), "getAttachmentsWithCachedFileName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cachedFileName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetEventsAfter__Date(), this.getEvent(), "getEventsAfter", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetEventsBefore__Date(), this.getEvent(), "getEventsBefore", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetEventsBetweenDates__Date_Date(), this.getEvent(), "getEventsBetweenDates", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "after", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "before", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetSpicynodesRepresentation(), ecorePackage.getEString(), "getSpicynodesRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetConnectionsBetweenInformationObjectsOfDifferentCategories(), this.getConnection(), "getConnectionsBetweenInformationObjectsOfDifferentCategories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetInformationObjectsModifiedSince__Date(), this.getInformationObject(), "getInformationObjectsModifiedSince", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetRandomXInformationObjects__Integer(), this.getInformationObject(), "getRandomXInformationObjects", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "x", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetRandomXContents__Integer(), this.getContent(), "getRandomXContents", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "x", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetRandomXPersons__Integer(), this.getPerson(), "getRandomXPersons", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "x", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetRandomXOrganisations__Integer(), this.getOrganisation(), "getRandomXOrganisations", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "x", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__ForceAdd__Item(), this.getItem(), "forceAdd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetIdentsOfExistingItems(), ecorePackage.getEString(), "getIdentsOfExistingItems", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetCategoryWithSlug__String(), this.getCategory(), "getCategoryWithSlug", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "slug", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__RebuildIndexes(), null, "rebuildIndexes", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetContentsWithAllMetaTags__EList(), this.getContent(), "getContentsWithAllMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetContentsWithOneOfMetaTags__EList(), this.getContent(), "getContentsWithOneOfMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonsWithAllMetaTags__EList(), this.getPerson(), "getPersonsWithAllMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetPersonsWithOneOfMetaTags__EList(), this.getPerson(), "getPersonsWithOneOfMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetOrganisationsWithAllMetaTags__EList(), this.getOrganisation(), "getOrganisationsWithAllMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetOrganisationsWithOneOfMetaTags__EList(), this.getOrganisation(), "getOrganisationsWithOneOfMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetEvents(), this.getEvent(), "getEvents", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__SearchByQuery__String(), this.getItem(), "searchByQuery", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "query", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetIndoorLocations(), this.getIndoorLocation(), "getIndoorLocations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetItemsExceptIdentifiers(), this.getItem(), "getItemsExceptIdentifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetIdentsOfDeletedItems(), ecorePackage.getEString(), "getIdentsOfDeletedItems", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetItemsDeletedSince__Date(), this.getItem(), "getItemsDeletedSince", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetIdentsOfItemsDeletedSince__Date(), ecorePackage.getEString(), "getIdentsOfItemsDeletedSince", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__ClearDeletedItemsList(), this.getDeletedItem(), "clearDeletedItemsList", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataSet__GetDeletedItems(), this.getDeletedItem(), "getDeletedItems", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetItemsExceptIdentifiersCreatedSince__Date(), this.getItem(), "getItemsExceptIdentifiersCreatedSince", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDataSet__GetItemsExceptIdentifiersModifiedSince__Date(), this.getItem(), "getItemsExceptIdentifiersModifiedSince", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItem_DataSet(), this.getDataSet(), this.getDataSet_Items(), "dataSet", null, 0, 1, Item.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Ident(), ecorePackage.getEString(), "ident", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_LastModified(), ecorePackage.getEDate(), "lastModified", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Created(), ecorePackage.getEDate(), "created", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_MetaTags(), this.getMetaTag(), this.getMetaTag_MetaTagged(), "metaTags", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_IdentifiedBy(), this.getIdentifier(), this.getIdentifier_Identified(), "identifiedBy", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_DeleteOnDelete(), this.getItem(), this.getItem_DeletedIfDeleted(), "deleteOnDelete", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_DeletedIfDeleted(), this.getItem(), this.getItem_DeleteOnDelete(), "deletedIfDeleted", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_ForcedDeleteOnDelete(), this.getItem(), this.getItem_ForcedDeletedIfDeleted(), "forcedDeleteOnDelete", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_ForcedDeletedIfDeleted(), this.getItem(), this.getItem_ForcedDeleteOnDelete(), "forcedDeletedIfDeleted", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getItem__Log__String(), null, "log", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__Log__String_Integer(), null, "log", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__MetaTag__String(), this.getMetaTag(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__IdentifyBy__String_String(), this.getIdentifier(), "identifyBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__GetIdentifier__String(), this.getIdentifier(), "getIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__HasMetaTag__String(), ecorePackage.getEBooleanObject(), "hasMetaTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__MatchesSearch__String(), ecorePackage.getEBooleanObject(), "matchesSearch", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getItem__Delete(), null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__IsEqualItem__Item(), ecorePackage.getEBooleanObject(), "isEqualItem", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__GetCreatedPrettyInLanguage__String(), ecorePackage.getEString(), "getCreatedPrettyInLanguage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getItem__GetCreatedPretty(), ecorePackage.getEString(), "getCreatedPretty", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__GetLastModifiedPrettyInLanguage__String(), ecorePackage.getEString(), "getLastModifiedPrettyInLanguage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getItem__GetLastModifiedPretty(), ecorePackage.getEString(), "getLastModifiedPretty", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__DeleteOnDeleteOf__Item(), this.getItem(), "deleteOnDeleteOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getItem__DeleteIfEmptyOnDelete(), null, "deleteIfEmptyOnDelete", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__Update__Item(), this.getItem(), "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__ForceUpdate__Item(), this.getItem(), "forceUpdate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__UnMetaTag__String(), this.getMetaTag(), "unMetaTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__RemoveIdentifier__String(), this.getIdentifier(), "removeIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getItem__ForceDeleteOnDeleteOf__Item(), this.getItem(), "forceDeleteOnDeleteOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getExtension__Tag__String(), this.getMetaTag(), "tag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(classificationEClass, Classification.class, "Classification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassification_Name(), ecorePackage.getEString(), "name", null, 1, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getClassification__GetPersons(), this.getPerson(), "getPersons", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassification__GetContents(), this.getContent(), "getContents", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassification__GetOrganisations(), this.getOrganisation(), "getOrganisations", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassification__GetCount(), ecorePackage.getEIntegerObject(), "getCount", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassification__GetPersonsCount(), ecorePackage.getEIntegerObject(), "getPersonsCount", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassification__GetContentsCount(), ecorePackage.getEIntegerObject(), "getContentsCount", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassification__GetOrganisationsCount(), ecorePackage.getEIntegerObject(), "getOrganisationsCount", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassification__GetSlug(), ecorePackage.getEString(), "getSlug", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategory_Categorized(), this.getInformationObject(), this.getInformationObject_Categories(), "categorized", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_ParentCategory(), this.getCategory(), this.getCategory_Categories(), "parentCategory", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Categories(), this.getCategory(), this.getCategory_ParentCategory(), "categories", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_MainCategorized(), this.getInformationObject(), this.getInformationObject_MainCategory(), "mainCategorized", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTag_Tagged(), this.getInformationObject(), this.getInformationObject_Tags(), "tagged", null, 0, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organisationEClass, Organisation.class, "Organisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganisation_ParentOrganisation(), this.getOrganisation(), this.getOrganisation_Organisations(), "parentOrganisation", null, 0, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisation_Leader(), this.getPerson(), this.getPerson_LeaderOf(), "leader", null, 0, 1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisation_Participants(), this.getPerson(), this.getPerson_Participates(), "participants", null, 0, -1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisation_Organisations(), this.getOrganisation(), this.getOrganisation_ParentOrganisation(), "organisations", null, 0, -1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOrganisation__GetPersons(), this.getPerson(), "getPersons", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOrganisation__GetContents(), this.getContent(), "getContents", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOrganisation__AddParticipant__Person(), this.getPerson(), "addParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPerson(), "participant", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(metaTagEClass, MetaTag.class, "MetaTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetaTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaTag_MetaTagged(), this.getItem(), this.getItem_MetaTags(), "metaTagged", null, 0, -1, MetaTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMetaTag__GetWebAccounts(), this.getWebAccount(), "getWebAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMetaTag__GetInformationObjects(), this.getInformationObject(), "getInformationObjects", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMetaTag__GetExtensions(), this.getExtension(), "getExtensions", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMetaTag__GetCount(), ecorePackage.getEIntegerObject(), "getCount", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMetaTag__GetInformationObjectsCount(), ecorePackage.getEIntegerObject(), "getInformationObjectsCount", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(phoneEClass, Phone.class, "Phone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhone_AreaCode(), ecorePackage.getEString(), "areaCode", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhone_CountryCode(), ecorePackage.getEString(), "countryCode", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhone_Number(), ecorePackage.getEString(), "number", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantMessengerEClass, InstantMessenger.class, "InstantMessenger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstantMessenger_Username(), ecorePackage.getEString(), "username", null, 0, 1, InstantMessenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emailEClass, Email.class, "Email", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmail_Adress(), ecorePackage.getEString(), "adress", null, 0, 1, Email.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webAccountEClass, WebAccount.class, "WebAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebAccount_Username(), ecorePackage.getEString(), "username", null, 0, 1, WebAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webSiteEClass, WebSite.class, "WebSite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebSite_Adress(), ecorePackage.getEString(), "adress", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWebSite_Title(), ecorePackage.getEString(), "title", null, 0, 1, WebSite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rankingEClass, Ranking.class, "Ranking", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRanking_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Ranking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRanking_Ranker(), this.getPerson(), this.getPerson_Ranked(), "ranker", null, 0, 1, Ranking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentEClass, Attachment.class, "Attachment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachment_FileUrl(), ecorePackage.getEString(), "fileUrl", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_CachedFileUrl(), ecorePackage.getEString(), "cachedFileUrl", null, 0, 1, Attachment.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_CachedOnly(), ecorePackage.getEBooleanObject(), "cachedOnly", "false", 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_FileExtension(), ecorePackage.getEString(), "fileExtension", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_FileIdentifier(), ecorePackage.getEString(), "fileIdentifier", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_CachedFileName(), ecorePackage.getEString(), "cachedFileName", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAttachment__GetOriginalFileUrl(), ecorePackage.getEString(), "getOriginalFileUrl", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Street(), ecorePackage.getEString(), "street", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_HouseNumber(), ecorePackage.getEString(), "houseNumber", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_ZipCode(), ecorePackage.getEString(), "zipCode", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Country(), ecorePackage.getEString(), "country", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Longitude(), ecorePackage.getEString(), "longitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Latitude(), ecorePackage.getEString(), "latitude", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_City(), ecorePackage.getEString(), "city", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocation_IndoorLocations(), this.getIndoorLocation(), this.getIndoorLocation_Location(), "indoorLocations", null, 0, -1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_State(), ecorePackage.getEString(), "state", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Width(), ecorePackage.getEIntegerObject(), "width", "-1", 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImage_Height(), ecorePackage.getEIntegerObject(), "height", "-1", 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(starRankingEClass, StarRanking.class, "StarRanking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStarRanking_RankedInformationObject(), this.getInformationObject(), this.getInformationObject_StarRankings(), "rankedInformationObject", null, 0, 1, StarRanking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStarRanking_NormalizedValue(), ecorePackage.getEDoubleObject(), "normalizedValue", null, 1, 1, StarRanking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewRankingEClass, ViewRanking.class, "ViewRanking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewRanking_RankedInformationObject(), this.getInformationObject(), this.getInformationObject_ViewRankings(), "rankedInformationObject", null, 0, 1, ViewRanking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thumbRankingEClass, ThumbRanking.class, "ThumbRanking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThumbRanking_RankedInformationObject(), this.getInformationObject(), this.getInformationObject_ThumbRankings(), "rankedInformationObject", null, 0, 1, ThumbRanking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getThumbRanking__IsThumbUp(), ecorePackage.getEBooleanObject(), "isThumbUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getThumbRanking__IsThumbDown(), ecorePackage.getEBooleanObject(), "isThumbDown", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_Transformed(), this.getContent(), this.getContent_Transformations(), "transformed", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_From(), this.getInformationObject(), this.getInformationObject_ConnectedTo(), "from", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_To(), this.getInformationObject(), this.getInformationObject_ConnectedBy(), "to", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryEClass, Binary.class, "Binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinary_Bytes(), ecorePackage.getEByteArray(), "bytes", null, 0, 1, Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaInformationEClass, MetaInformation.class, "MetaInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetaInformation_InformationObjects(), this.getInformationObject(), this.getInformationObject_MetaInformations(), "informationObjects", null, 0, -1, MetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indoorLocationEClass, IndoorLocation.class, "IndoorLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndoorLocation_Location(), this.getLocation(), this.getLocation_IndoorLocations(), "location", null, 0, 1, IndoorLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndoorLocation_ParentIndoorLocation(), this.getIndoorLocation(), this.getIndoorLocation_IndoorLocations(), "parentIndoorLocation", null, 0, 1, IndoorLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndoorLocation_IndoorLocations(), this.getIndoorLocation(), this.getIndoorLocation_ParentIndoorLocation(), "indoorLocations", null, 0, -1, IndoorLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndoorLocation_Name(), ecorePackage.getEString(), "name", null, 0, 1, IndoorLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifier_Key(), ecorePackage.getEString(), "key", null, 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifier_Value(), ecorePackage.getEString(), "value", null, 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifier_Identified(), this.getItem(), this.getItem_IdentifiedBy(), "identified", null, 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEvent__GetDatePrettyInLanguage__String(), ecorePackage.getEString(), "getDatePrettyInLanguage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEvent__GetDatePretty(), ecorePackage.getEString(), "getDatePretty", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deletedItemEClass, DeletedItem.class, "DeletedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeletedItem_Deleted(), ecorePackage.getEDate(), "deleted", null, 0, 1, DeletedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeletedItem_IdentOfDeleted(), ecorePackage.getEString(), "identOfDeleted", null, 0, 1, DeletedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * Filters a list of Items based on the given condition using EMF Query.
	 * 
	 * @param items The list of items to filter.
	 * @param condition The condition every target item should match. 
	 * @return The EMF Query result, null in error case.
	 */
	public static IQueryResult filterItemsMatchingCondition(EList<? extends Item> items,
													   EObjectCondition condition) 
	{
		if(items == null || condition == null)
		{
			return null;
		}
		
		// select everything from all items that matches this condition
		SELECT selectStatement = new SELECT(
									new FROM(items),
									new WHERE(condition));
	
		// execute the query statement
		IQueryResult result = selectStatement.execute();
		
		return result;
	}

	/**
	 * Returns a condition that can be used to check for the type of a item.
	 * 
	 * @param itemType Type of the item.
	 * @return A new condition that evaluates true for items of the given type.
	 */
	public static EObjectTypeRelationCondition isTypeCondition(EClass itemType)
	{
		return new EObjectTypeRelationCondition(itemType);
	}

} //DataPackageImpl
