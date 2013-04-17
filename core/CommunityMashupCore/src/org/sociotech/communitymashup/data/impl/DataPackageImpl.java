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
	public EClass getExtension() {
		return extensionEClass;
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
	public EReference getOrganisation_Phones() {
		return (EReference)organisationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_Emails() {
		return (EReference)organisationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_WebAccounts() {
		return (EReference)organisationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_Locations() {
		return (EReference)organisationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganisation_Organisations() {
		return (EReference)organisationEClass.getEStructuralFeatures().get(7);
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

		contentEClass = createEClass(CONTENT);
		createEReference(contentEClass, CONTENT__CONTENTS);
		createEReference(contentEClass, CONTENT__CONTRIBUTORS);
		createEReference(contentEClass, CONTENT__AUTHOR);
		createEReference(contentEClass, CONTENT__DOCUMENTS);
		createEReference(contentEClass, CONTENT__PARENT_CONTENT);
		createEAttribute(contentEClass, CONTENT__LOCALE);
		createEReference(contentEClass, CONTENT__TRANSFORMATIONS);
		createEReference(contentEClass, CONTENT__VIDEOS);

		dataSetEClass = createEClass(DATA_SET);
		createEReference(dataSetEClass, DATA_SET__ITEMS);
		createEAttribute(dataSetEClass, DATA_SET__CACHE_FOLDER);
		createEAttribute(dataSetEClass, DATA_SET__CACHE_FILE_ATTACHEMENTS);
		createEReference(dataSetEClass, DATA_SET__SET_UP);
		createEAttribute(dataSetEClass, DATA_SET__LAST_MODIFIED);
		createEAttribute(dataSetEClass, DATA_SET__LOG_LEVEL);

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

		extensionEClass = createEClass(EXTENSION);

		classificationEClass = createEClass(CLASSIFICATION);
		createEAttribute(classificationEClass, CLASSIFICATION__NAME);

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
		createEReference(organisationEClass, ORGANISATION__PHONES);
		createEReference(organisationEClass, ORGANISATION__EMAILS);
		createEReference(organisationEClass, ORGANISATION__WEB_ACCOUNTS);
		createEReference(organisationEClass, ORGANISATION__LOCATIONS);
		createEReference(organisationEClass, ORGANISATION__ORGANISATIONS);

		metaTagEClass = createEClass(META_TAG);
		createEAttribute(metaTagEClass, META_TAG__NAME);
		createEReference(metaTagEClass, META_TAG__META_TAGGED);

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

		documentEClass = createEClass(DOCUMENT);

		starRankingEClass = createEClass(STAR_RANKING);
		createEReference(starRankingEClass, STAR_RANKING__RANKED_INFORMATION_OBJECT);
		createEAttribute(starRankingEClass, STAR_RANKING__NORMALIZED_VALUE);

		viewRankingEClass = createEClass(VIEW_RANKING);
		createEReference(viewRankingEClass, VIEW_RANKING__RANKED_INFORMATION_OBJECT);

		thumbRankingEClass = createEClass(THUMB_RANKING);
		createEReference(thumbRankingEClass, THUMB_RANKING__RANKED_INFORMATION_OBJECT);

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

		// Initialize classes and features; add operations and parameters
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

		addEOperation(personEClass, this.getContent(), "getContents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(personEClass, this.getOrganisation(), "getOrganisations", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(personEClass, this.getContent(), "addContributedContent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContent(), "contributedContent", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(personEClass, this.getContent(), "addAuthoredContent", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContent(), "authoredContent", 1, 1, IS_UNIQUE, IS_ORDERED);

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

		op = addEOperation(informationObjectEClass, this.getTag(), "tag", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getCategory(), "categorize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getImage(), "attachImage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "imageUrl", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getAttachment(), "getAttachments", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getStarRanking(), "starRank", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "stars", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "ofStars", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getViewRanking(), "view", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getThumbRanking(), "thumbsUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getThumbRanking(), "thumbsDown", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getThumbRanking(), "getThumbsUp", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getThumbRanking(), "getThumbsDown", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, ecorePackage.getEIntegerObject(), "getThumbsUpCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, ecorePackage.getEIntegerObject(), "getThumbsDownCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, ecorePackage.getEIntegerObject(), "getThumbsCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, ecorePackage.getEIntegerObject(), "getViewsCount", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, ecorePackage.getEDoubleObject(), "getStarRanking", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getMetaInformation(), "extend", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaInformation(), "metaInformation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getWebAccount(), "getWebAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getWebSite(), "getWebSites", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getPhone(), "getPhones", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getLocation(), "getLocations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getEmail(), "getEmails", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getInstantMessenger(), "getInstantMessengers", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getEmail(), "addEmailAddress", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "emailAdress", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getWebSite(), "addWebSite", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "url", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getInformationObject(), "getInformationObjectsWithCommonTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getWebAccount(), "addWebAccount", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "username", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, ecorePackage.getEBooleanObject(), "hasImages", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getInformationObject(), "getInformationObjectsConnectedTo", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getInformationObject(), "getInformationObjectsConnectedFrom", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(informationObjectEClass, this.getInformationObject(), "getInformationObjectsConnected", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getConnection(), "connectTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getConnection(), "connectToWithMetaTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getInformationObject(), "getInformationObjectsConnectedToWithMetaTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getInformationObject(), "getInformationObjectsConnectedFromWithMetaTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getInformationObject(), "getInformationObjectsConnectedWithMetaTag", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getConnection(), "getConnectionsFrom", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getConnection(), "getConnectionsTo", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getConnection(), "connectToWithValueAndMetaTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getConnection(), "getConnectionTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getConnection(), "getConnectionFrom", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInformationObject(), "informationObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getAttachment(), "getAttachmentWithUrl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "url", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getImage(), "getAttachedImageWithUrl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "url", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(informationObjectEClass, this.getPhone(), "addPhone", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phoneNumber", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(contentEClass, Content.class, "Content", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContent_Contents(), this.getContent(), this.getContent_ParentContent(), "contents", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Contributors(), this.getPerson(), this.getPerson_Contributed(), "contributors", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Author(), this.getPerson(), this.getPerson_Authored(), "author", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Documents(), this.getDocument(), null, "documents", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_ParentContent(), this.getContent(), this.getContent_Contents(), "parentContent", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_Locale(), ecorePackage.getEString(), "locale", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Transformations(), this.getTransformation(), this.getTransformation_Transformed(), "transformations", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Videos(), this.getVideo(), null, "videos", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(contentEClass, this.getOrganisation(), "getOrganisations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(contentEClass, this.getPerson(), "getPersons", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contentEClass, this.getContent(), "comment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "comment", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contentEClass, this.getPerson(), "addContributor", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPerson(), "contributor", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(contentEClass, this.getDocument(), "attachDocument", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "fileUrl", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataSetEClass, DataSet.class, "DataSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSet_Items(), this.getItem(), this.getItem_DataSet(), "items", null, 0, -1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_CacheFolder(), ecorePackage.getEString(), "cacheFolder", null, 0, 1, DataSet.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_CacheFileAttachements(), ecorePackage.getEBooleanObject(), "cacheFileAttachements", "false", 1, 1, DataSet.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataSet_SetUp(), theApplicationPackage.getMashup(), null, "setUp", null, 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_LastModified(), ecorePackage.getEDate(), "lastModified", null, 0, 1, DataSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataSet_LogLevel(), ecorePackage.getEIntegerObject(), "logLevel", null, 0, 1, DataSet.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getItem(), "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getItem(), "getItemsWithStringValue", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "stringValue", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getPerson(), "getPersonsWithName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getPerson(), "getPersonsWithLastname", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastname", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getPerson(), "getPersonsWithFirstName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstname", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getTag(), "getTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getMetaTag(), "getMetaTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getPerson(), "getAllPersons", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getContent(), "getAllContents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getOrganisation(), "getAllOrganisations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getCategory(), "getAllCategories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getCategory(), "getCategory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getTag(), "getAllTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getItem(), "getItemsModifiedSince", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getMetaTag(), "getAllMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getConnection(), "getAllConnections", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, null, "log", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, null, "log", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getContent(), "getContentWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getPerson(), "getPersonWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getOrganisation(), "getOrganisationWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getAttachment(), "getAttachmentWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getInformationObject(), "getInformationObjectsWithAllCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getInformationObject(), "getInformationObjectsWithOneOfCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getContent(), "getContentsWithAllCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getContent(), "getContentsWithOneOfCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getPerson(), "getPersonsWithAllCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getPerson(), "getPersonsWithOneOfCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getOrganisation(), "getOrganisationsWithAllCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getOrganisation(), "getOrganisationsWithOneOfCategories", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCategory(), "categories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getInformationObject(), "getInformationObjectsWithAllTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getInformationObject(), "getInformationObjectsWithOneOfTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getOrganisation(), "getOrganisationsWithAllTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getOrganisation(), "getOrganisationsWithOneOfTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getPerson(), "getPersonsWithAllTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getPerson(), "getPersonsWithOneOfTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getContent(), "getContentsWithAllTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getContent(), "getContentsWithOneOfTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getContent(), "getContentsWithName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getOrganisation(), "getOrganisationsWithName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getItem(), "getItemsWithAllMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getItem(), "getItemsWithOneOfMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getPerson(), "getPersons", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getOrganisation(), "getOrganisations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getContent(), "getContents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getInformationObject(), "getInformationObjects", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getTag(), "getTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getMetaTag(), "getMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getAttachment(), "getAttachments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getBinary(), "getBinaries", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getCategory(), "getCategories", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getClassification(), "getClassifications", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getConnection(), "getConnections", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getDocument(), "getDocuments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getEmail(), "getEmails", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getExtension(), "getExtensions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getImage(), "getImages", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getInstantMessenger(), "getInstantMessengers", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getLocation(), "getLocations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getMetaInformation(), "getMetaInformations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getPhone(), "getPhones", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getRanking(), "getRankings", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getStarRanking(), "getStarRankings", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getThumbRanking(), "getThumbRankings", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getTransformation(), "getTransformations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getVideo(), "getVideos", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getViewRanking(), "getViewRankings", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getWebAccount(), "getWebAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getWebSite(), "getWebSites", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getInformationObject(), "getInformationObjectsWithAllMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getInformationObject(), "getInformationObjectsWithOneOfMetaTags", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMetaTag(), "tags", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getIdentifier(), "getIdentifiers", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getIdentifier(), "getIdentifiersWithKey", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getIdentifier(), "getIdentifierWithKeyValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getItem(), "getItemWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getPerson(), "getPersonWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getContent(), "getContentWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getOrganisation(), "getOrganisationWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getLocation(), "getLocationWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getIndoorLocation(), "getIndoorLocationWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getImage(), "getImageWithIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getItem(), "getEmptyItemWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getTag(), "getTagsWithMoreThanXInformationObjects", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "x", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getItem(), "getItemsCreatedSince", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getItem(), "searchItems", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getInformationObject(), "searchInformationObjects", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getInformationObject(), "getInformationObjectsWithAttachment", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttachment(), "attachment", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getPerson(), "getPersonsWithAttachment", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttachment(), "attachment", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getOrganisation(), "getOrganisationsWithAttachment", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttachment(), "attachment", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getContent(), "getContentsWithAttachment", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAttachment(), "attachment", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getItem(), "getEqualItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, ecorePackage.getEBooleanObject(), "hasEqualItem", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getItem(), "getItemsWithIdent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "ident", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getAttachment(), "getAttachmentsWithCachedFileName", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cachedFileName", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getEvent(), "getEventsAfter", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getEvent(), "getEventsBefore", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getEvent(), "getEventsBetweenDates", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "after", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "before", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, ecorePackage.getEString(), "getSpicynodesRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(dataSetEClass, this.getConnection(), "getConnectionsBetweenInformationObjectsOfDifferentCategories", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(dataSetEClass, this.getInformationObject(), "getInformationObjectsModifiedSince", 0, -1, IS_UNIQUE, IS_ORDERED);
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

		addEOperation(itemEClass, ecorePackage.getEString(), "toAttributeMapString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(itemEClass, null, "log", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(itemEClass, null, "log", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "message", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEIntegerObject(), "level", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(itemEClass, this.getMetaTag(), "metaTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(itemEClass, this.getIdentifier(), "identifyBy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(itemEClass, this.getIdentifier(), "getIdentifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "key", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(itemEClass, ecorePackage.getEBooleanObject(), "hasMetaTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "tag", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(itemEClass, ecorePackage.getEBooleanObject(), "matchesSearch", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "term", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(itemEClass, null, "delete", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(itemEClass, ecorePackage.getEBooleanObject(), "isEqualItem", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(itemEClass, ecorePackage.getEString(), "getCreatedPrettyInLanguage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(itemEClass, ecorePackage.getEString(), "getCreatedPretty", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(itemEClass, ecorePackage.getEString(), "getLastModifiedPrettyInLanguage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(itemEClass, ecorePackage.getEString(), "getLastModifiedPretty", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(itemEClass, this.getItem(), "deleteOnDeleteOf", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItem(), "item", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(itemEClass, null, "deleteIfEmptyOnDelete", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(extensionEClass, this.getMetaTag(), "tag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(classificationEClass, Classification.class, "Classification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassification_Name(), ecorePackage.getEString(), "name", null, 1, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(classificationEClass, this.getPerson(), "getPersons", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classificationEClass, this.getContent(), "getContents", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classificationEClass, this.getOrganisation(), "getOrganisations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classificationEClass, ecorePackage.getEIntegerObject(), "getCount", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classificationEClass, ecorePackage.getEIntegerObject(), "getPersonsCount", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classificationEClass, ecorePackage.getEIntegerObject(), "getContentsCount", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classificationEClass, ecorePackage.getEIntegerObject(), "getOrganisationsCount", 1, 1, IS_UNIQUE, IS_ORDERED);

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
		initEReference(getOrganisation_Phones(), this.getPhone(), null, "phones", null, 0, -1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisation_Emails(), this.getEmail(), null, "emails", null, 0, -1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisation_WebAccounts(), this.getWebAccount(), null, "webAccounts", null, 0, -1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisation_Locations(), this.getLocation(), null, "locations", null, 0, -1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganisation_Organisations(), this.getOrganisation(), this.getOrganisation_ParentOrganisation(), "organisations", null, 0, -1, Organisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(organisationEClass, this.getPerson(), "getPersons", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(organisationEClass, this.getContent(), "getContents", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(organisationEClass, this.getPerson(), "addParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPerson(), "participant", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(metaTagEClass, MetaTag.class, "MetaTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetaTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaTag_MetaTagged(), this.getItem(), this.getItem_MetaTags(), "metaTagged", null, 0, -1, MetaTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(metaTagEClass, this.getWebAccount(), "getWebAccounts", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(metaTagEClass, this.getInformationObject(), "getInformationObjects", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(metaTagEClass, this.getExtension(), "getExtensions", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(metaTagEClass, ecorePackage.getEIntegerObject(), "getCount", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(metaTagEClass, ecorePackage.getEIntegerObject(), "getInformationObjectsCount", 1, 1, IS_UNIQUE, IS_ORDERED);

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
		initEAttribute(getAttachment_CachedFileUrl(), ecorePackage.getEString(), "cachedFileUrl", null, 0, 1, Attachment.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_CachedOnly(), ecorePackage.getEBooleanObject(), "cachedOnly", "false", 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_FileExtension(), ecorePackage.getEString(), "fileExtension", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_FileIdentifier(), ecorePackage.getEString(), "fileIdentifier", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachment_CachedFileName(), ecorePackage.getEString(), "cachedFileName", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(attachmentEClass, ecorePackage.getEString(), "getOriginalFileUrl", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(starRankingEClass, StarRanking.class, "StarRanking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStarRanking_RankedInformationObject(), this.getInformationObject(), this.getInformationObject_StarRankings(), "rankedInformationObject", null, 0, 1, StarRanking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStarRanking_NormalizedValue(), ecorePackage.getEDoubleObject(), "normalizedValue", null, 1, 1, StarRanking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewRankingEClass, ViewRanking.class, "ViewRanking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewRanking_RankedInformationObject(), this.getInformationObject(), this.getInformationObject_ViewRankings(), "rankedInformationObject", null, 0, 1, ViewRanking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thumbRankingEClass, ThumbRanking.class, "ThumbRanking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThumbRanking_RankedInformationObject(), this.getInformationObject(), this.getInformationObject_ThumbRankings(), "rankedInformationObject", null, 0, 1, ThumbRanking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(thumbRankingEClass, ecorePackage.getEBooleanObject(), "isThumbUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(thumbRankingEClass, ecorePackage.getEBooleanObject(), "isThumbDown", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		op = addEOperation(eventEClass, ecorePackage.getEString(), "getDatePrettyInLanguage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eventEClass, ecorePackage.getEString(), "getDatePretty", 0, 1, IS_UNIQUE, IS_ORDERED);

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
