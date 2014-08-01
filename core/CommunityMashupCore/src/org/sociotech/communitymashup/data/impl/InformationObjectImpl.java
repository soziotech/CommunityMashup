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

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.ocl.conditions.BooleanOCLCondition;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.ocl.ParserException;
import org.osgi.service.log.LogService;
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
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.RestUtil;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getImages <em>Images</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getStarRankings <em>Star Rankings</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getThumbRankings <em>Thumb Rankings</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getViewRankings <em>View Rankings</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getConnectedBy <em>Connected By</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getBinaries <em>Binaries</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getMainCategory <em>Main Category</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getMetaInformations <em>Meta Informations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getAlternativeNames <em>Alternative Names</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.InformationObjectImpl#getVerifiedName <em>Verified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InformationObjectImpl extends ItemImpl implements InformationObject {
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Image> images;

	/**
	 * The cached value of the '{@link #getStarRankings() <em>Star Rankings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarRankings()
	 * @generated
	 * @ordered
	 */
	protected EList<StarRanking> starRankings;

	/**
	 * The cached value of the '{@link #getThumbRankings() <em>Thumb Rankings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbRankings()
	 * @generated
	 * @ordered
	 */
	protected EList<ThumbRanking> thumbRankings;

	/**
	 * The cached value of the '{@link #getViewRankings() <em>View Rankings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRankings()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewRanking> viewRankings;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnectedTo() <em>Connected To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connectedTo;

	/**
	 * The cached value of the '{@link #getConnectedBy() <em>Connected By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connectedBy;

	/**
	 * The cached value of the '{@link #getBinaries() <em>Binaries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaries()
	 * @generated
	 * @ordered
	 */
	protected EList<Binary> binaries;

	/**
	 * The cached value of the '{@link #getMainCategory() <em>Main Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainCategory()
	 * @generated
	 * @ordered
	 */
	protected Category mainCategory;

	/**
	 * The cached value of the '{@link #getMetaInformations() <em>Meta Informations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaInformation> metaInformations;

	/**
	 * The default value of the '{@link #getAlternativeNames() <em>Alternative Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeNames()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTERNATIVE_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlternativeNames() <em>Alternative Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeNames()
	 * @generated
	 * @ordered
	 */
	protected String alternativeNames = ALTERNATIVE_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerifiedName() <em>Verified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VERIFIED_NAME_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getVerifiedName() <em>Verified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedName()
	 * @generated
	 * @ordered
	 */
	protected Boolean verifiedName = VERIFIED_NAME_EDEFAULT;

	/**
	 * Factory for creating items
	 */
	private static DataFactory dataFactory = DataPackage.eINSTANCE.getDataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.INFORMATION_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectWithInverseResolvingEList.ManyInverse<Category>(Category.class, this, DataPackage.INFORMATION_OBJECT__CATEGORIES, DataPackage.CATEGORY__CATEGORIZED);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectWithInverseResolvingEList.ManyInverse<Tag>(Tag.class, this, DataPackage.INFORMATION_OBJECT__TAGS, DataPackage.TAG__TAGGED);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Image> getImages() {
		if (images == null) {
			images = new EObjectResolvingEList<Image>(Image.class, this, DataPackage.INFORMATION_OBJECT__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StarRanking> getStarRankings() {
		if (starRankings == null) {
			starRankings = new EObjectWithInverseResolvingEList<StarRanking>(StarRanking.class, this, DataPackage.INFORMATION_OBJECT__STAR_RANKINGS, DataPackage.STAR_RANKING__RANKED_INFORMATION_OBJECT);
		}
		return starRankings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThumbRanking> getThumbRankings() {
		if (thumbRankings == null) {
			thumbRankings = new EObjectWithInverseResolvingEList<ThumbRanking>(ThumbRanking.class, this, DataPackage.INFORMATION_OBJECT__THUMB_RANKINGS, DataPackage.THUMB_RANKING__RANKED_INFORMATION_OBJECT);
		}
		return thumbRankings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewRanking> getViewRankings() {
		if (viewRankings == null) {
			viewRankings = new EObjectWithInverseResolvingEList<ViewRanking>(ViewRanking.class, this, DataPackage.INFORMATION_OBJECT__VIEW_RANKINGS, DataPackage.VIEW_RANKING__RANKED_INFORMATION_OBJECT);
		}
		return viewRankings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void setName(String newName) {
		if(getName() != null && !getName().isEmpty() && getVerifiedName()) {
			// do not change verified names
			return;
		}
		
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.INFORMATION_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnectedTo() {
		if (connectedTo == null) {
			connectedTo = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this, DataPackage.INFORMATION_OBJECT__CONNECTED_TO, DataPackage.CONNECTION__FROM);
		}
		return connectedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnectedBy() {
		if (connectedBy == null) {
			connectedBy = new EObjectWithInverseResolvingEList<Connection>(Connection.class, this, DataPackage.INFORMATION_OBJECT__CONNECTED_BY, DataPackage.CONNECTION__TO);
		}
		return connectedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binary> getBinaries() {
		if (binaries == null) {
			binaries = new EObjectResolvingEList<Binary>(Binary.class, this, DataPackage.INFORMATION_OBJECT__BINARIES);
		}
		return binaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getMainCategory() {
		if (mainCategory != null && mainCategory.eIsProxy()) {
			InternalEObject oldMainCategory = (InternalEObject)mainCategory;
			mainCategory = (Category)eResolveProxy(oldMainCategory);
			if (mainCategory != oldMainCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.INFORMATION_OBJECT__MAIN_CATEGORY, oldMainCategory, mainCategory));
			}
		}
		return mainCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetMainCategory() {
		return mainCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainCategory(Category newMainCategory, NotificationChain msgs) {
		Category oldMainCategory = mainCategory;
		mainCategory = newMainCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.INFORMATION_OBJECT__MAIN_CATEGORY, oldMainCategory, newMainCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainCategory(Category newMainCategory) {
		if (newMainCategory != mainCategory) {
			NotificationChain msgs = null;
			if (mainCategory != null)
				msgs = ((InternalEObject)mainCategory).eInverseRemove(this, DataPackage.CATEGORY__MAIN_CATEGORIZED, Category.class, msgs);
			if (newMainCategory != null)
				msgs = ((InternalEObject)newMainCategory).eInverseAdd(this, DataPackage.CATEGORY__MAIN_CATEGORIZED, Category.class, msgs);
			msgs = basicSetMainCategory(newMainCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.INFORMATION_OBJECT__MAIN_CATEGORY, newMainCategory, newMainCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaInformation> getMetaInformations() {
		if (metaInformations == null) {
			metaInformations = new EObjectWithInverseResolvingEList.ManyInverse<MetaInformation>(MetaInformation.class, this, DataPackage.INFORMATION_OBJECT__META_INFORMATIONS, DataPackage.META_INFORMATION__INFORMATION_OBJECTS);
		}
		return metaInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlternativeNames() {
		return alternativeNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeNames(String newAlternativeNames) {
		String oldAlternativeNames = alternativeNames;
		alternativeNames = newAlternativeNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.INFORMATION_OBJECT__ALTERNATIVE_NAMES, oldAlternativeNames, alternativeNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVerifiedName() {
		return verifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifiedName(Boolean newVerifiedName) {
		Boolean oldVerifiedName = verifiedName;
		verifiedName = newVerifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.INFORMATION_OBJECT__VERIFIED_NAME, oldVerifiedName, verifiedName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Searches for the Tag with the given name using {@link DataSet#getTag(String)}. If the Tag doesn't exist
	 * it will be created. The Information object will then be added to the tagged objects of the new or existing Tag. A new 
	 * Tag will automatically be added to the same data set as this information object.
	 * 
	 * @return The found or the newly created tag. Null in error case.
	 * <!-- end-user-doc -->
	 */
	public Tag tag(String name) {
		// ckeck if data set exists
		DataSet dataSet = this.getDataSet();
		if(dataSet == null || name == null || name.isEmpty())
		{
			return null;
		}
			
		Tag tag = dataFactory.createTag();
		tag.setName(name);
			
		// add the new Tag to the data set
		tag = (Tag) dataSet.add(tag);
		
		if(tag != null)
		{
			// tag this information object
			this.getTags().add(tag);
		}
		
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Searches for the Category with the given name using {@link DataSet#getCategory(String)}. If the Category doesn't exist
	 * it will be created. The Information object will then be added to the categorized objects of the new or existing category. A new 
	 * Category will automatically add to the same data set as this information object.
	 * 
	 * @return The found or the newly created tag. Null in error case.
	 * <!-- end-user-doc -->
	 */
	public Category categorize(String name) {
		// ckeck if data set exists
		DataSet dataSet = this.getDataSet();
		if(dataSet == null)
		{
			return null;
		}
		
		Category category = dataFactory.createCategory();
		category.setName(name);
		
		// add the new Category to the data set
		category = (Category) dataSet.add(category);
		
		if(category != null)
		{
			// categorize this information object
			this.getCategories().add(category);
		}
		
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Creates an new {@link Image} object and adds it to the information objects images.
	 * 
	 * @return Returns the newly created Image or null in error case.
	 * <!-- end-user-doc -->
	 */
	public Image attachImage(String imageUrl) {
		if(imageUrl == null || imageUrl.equals(""))
		{
			return null;
		}
		
		// check if this image is already attached
		Image image = this.getAttachedImageWithUrl(imageUrl);
		if(image != null)
		{
			return image;
		}
		
		// create image object
		image = dataFactory.createImage();
		
		// set the url
		image.setFileUrl(imageUrl);
		
		// add it to the data set
		DataSet dataSet = this.getDataSet();
		if(dataSet != null)
		{
			image = (Image) dataSet.add(image);
		}
		
		if(image != null)
		{
			// attach it to this information object
			this.getImages().add(image);
		}
		
		return image;
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.InformationObject#attachImage(java.lang.String, java.io.InputStream)
	 */
	@Override
	public Image attachImage(String imageUrl, InputStream stream) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Creates a new list of all attached images and returns it.
	 * 
	 * @return List of all {@link Attachments} of this information object. Currently only images.
	 * <!-- end-user-doc -->
	 */
	public EList<Attachment> getAttachments() {
		// TODO check 
		// only images can directly attached to information objects
		return new BasicEList<Attachment>(this.getImages());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public StarRanking starRank(Integer stars, Integer ofStars) {
		
		if(stars == null || ofStars == null || this.getDataSet() == null)
		{
			return null;
		}
		
		double normalizedValue = stars.doubleValue()/ofStars.doubleValue();
		
		// create new star Ranking
		StarRanking starRanking = dataFactory.createStarRanking();
		starRanking.setRankedInformationObject(this);
		
		starRanking.setNormalizedValue(normalizedValue);
		
		// add ranking to data set
		if(this.getDataSet() != null)
		{
			starRanking = (StarRanking) this.getDataSet().add(starRanking);
		}
		
		return starRanking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ViewRanking view() {
		
		// create new view ranking
		ViewRanking viewRanking = dataFactory.createViewRanking();
		
		// add ranking to data set
		if(this.getDataSet() != null)
		{
			viewRanking = (ViewRanking) this.getDataSet().add(viewRanking);
		}
		
		if(viewRanking != null)
		{
			viewRanking.setRankedInformationObject(this);
		}
		
		return viewRanking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ThumbRanking thumbsUp() {
		
		// create new thumb ranking
		ThumbRanking thumbRanking = dataFactory.createThumbRanking();
		thumbRanking.setStringValue(ThumbRanking.THUMBS_UP_VALUE);
		
		// add ranking to data set
		if(this.getDataSet() != null)
		{
			thumbRanking = (ThumbRanking) this.getDataSet().add(thumbRanking);
		}
		
		if(thumbRanking != null)
		{
			thumbRanking.setRankedInformationObject(this);
		}
		
		return thumbRanking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ThumbRanking thumbsDown() {
		
		// create new thumb ranking
		ThumbRanking thumbRanking = dataFactory.createThumbRanking();
		thumbRanking.setStringValue(ThumbRanking.THUMBS_DOWN_VALUE);
		
		// add ranking to data set
		if(this.getDataSet() != null)
		{
			thumbRanking = (ThumbRanking) this.getDataSet().add(thumbRanking);
		}
		
		if(thumbRanking != null)
		{
			thumbRanking.setRankedInformationObject(this);
		}
		
		return thumbRanking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThumbRanking> getThumbsUp() {
		// Check if input is defined
		if(getThumbRankings() == null) {
			return null;
		}
		
		EObjectCondition oclCondition = null;
		String oclStatement = "self.stringValue='" + ThumbRanking.THUMBS_UP_VALUE + "'";
		try {
			oclCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( 	getOclEnvironment(),
																					oclStatement,
																					DataPackageImpl.eINSTANCE.getThumbRanking());		
		}
		catch (ParserException e) {
			log("Malformed ocl statement: " + oclStatement + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return null;
		}
	
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getThumbRankings(), oclCondition.AND(ThumbRanking.isTypeCondition));

		if(result == null) {
			return new BasicEList<ThumbRanking>();
		}
		
		// results are only ThumbRankings
		@SuppressWarnings("unchecked")
		EList<ThumbRanking> objects = new BasicEList<ThumbRanking>((Collection<? extends ThumbRanking>) result.getEObjects());
		
		return objects;	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ThumbRanking> getThumbsDown() {
		// Check if input is defined
		if(getThumbRankings() == null) {
			return null;
		}
		
		EObjectCondition oclCondition = null;
		String oclStatement = "self.stringValue='" + ThumbRanking.THUMBS_DOWN_VALUE + "'";
		try {
			oclCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( 	getOclEnvironment(),
																					oclStatement,
																					DataPackageImpl.eINSTANCE.getThumbRanking());		
		}
		catch (ParserException e) {
			log("Malformed ocl statement: " + oclStatement + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return null;
		}
	
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getThumbRankings(), oclCondition.AND(ThumbRanking.isTypeCondition));

		if(result == null) {
			return new BasicEList<ThumbRanking>();
		}
		
		// results are only ThumbRankings
		@SuppressWarnings("unchecked")
		EList<ThumbRanking> objects = new BasicEList<ThumbRanking>((Collection<? extends ThumbRanking>) result.getEObjects());
		
		return objects;	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Integer getThumbsUpCount() {
		if(this.getThumbsUp() == null)
		{
			return 0;
		}
		return this.getThumbsUp().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Integer getThumbsDownCount() {
		if(this.getThumbsDown() == null)
		{
			return 0;
		}
		return this.getThumbsDown().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Integer getThumbsCount() {
		return this.getThumbsUpCount() - this.getThumbsDownCount();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Integer getViewsCount() {
		if(this.getViewRankings() == null)
		{
			return 0;
		}
		return this.getViewRankings().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Double getStarRanking() {
		
		EList<StarRanking> rankings = this.getStarRankings();
		
		if(rankings == null || rankings.size()==0)
		{
			return null;
		}
		
		double sum = 0;
	
		// calculate average
		for(StarRanking ranking : rankings)
		{
			sum += ranking.getNormalizedValue();
		}
		
		return new Double(sum/rankings.size());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public MetaInformation extend(MetaInformation metaInformation) {
		if(metaInformation == null)
		{
			return null;
		}
		
		// add it to data set
		if(this.getDataSet() != null)
		{
			metaInformation = (MetaInformation) this.getDataSet().add(metaInformation);
		}
		
		EList<MetaInformation> metaInformations = this.getMetaInformations();
		
		if(metaInformation != null && !metaInformations.contains(metaInformation))
		{
			metaInformations.add(metaInformation);
		}
		
		return metaInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebAccount> getWebAccounts() {
		// Check if input is defined
		if(getMetaInformations() == null) {
			return null;
		}
		
		EObjectCondition oclCondition = null;
		String oclStatement = "true";
		try {
			oclCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( 	getOclEnvironment(),
																					oclStatement,
																					DataPackageImpl.eINSTANCE.getWebAccount());		
		}
		catch (ParserException e) {
			log("Malformed ocl statement: " + oclStatement + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return null;
		}
	
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getMetaInformations(), oclCondition.AND(WebAccount.isTypeCondition));

		if(result == null) {
			return new BasicEList<WebAccount>();
		}
		
		// results are only WebAccounts
		@SuppressWarnings("unchecked")
		EList<WebAccount> objects = new BasicEList<WebAccount>((Collection<? extends WebAccount>) result.getEObjects());
		
		return objects;	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebSite> getWebSites() {
		// Check if input is defined
		if(getMetaInformations() == null) {
			return null;
		}
		
		EObjectCondition oclCondition = null;
		String oclStatement = "true";
		try {
			oclCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( 	getOclEnvironment(),
																					oclStatement,
																					DataPackageImpl.eINSTANCE.getWebSite());		
		}
		catch (ParserException e) {
			log("Malformed ocl statement: " + oclStatement + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return null;
		}
	
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getMetaInformations(), oclCondition.AND(WebSite.isTypeCondition));

		if(result == null) {
			return new BasicEList<WebSite>();
		}
		
		// results are only WebSites
		@SuppressWarnings("unchecked")
		EList<WebSite> objects = new BasicEList<WebSite>((Collection<? extends WebSite>) result.getEObjects());
		
		return objects;	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Phone> getPhones() {
		// Check if input is defined
		if(getMetaInformations() == null) {
			return null;
		}
		
		EObjectCondition oclCondition = null;
		String oclStatement = "true";
		try {
			oclCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( 	getOclEnvironment(),
																					oclStatement,
																					DataPackageImpl.eINSTANCE.getPhone());		
		}
		catch (ParserException e) {
			log("Malformed ocl statement: " + oclStatement + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return null;
		}
	
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getMetaInformations(), oclCondition.AND(Phone.isTypeCondition));

		if(result == null) {
			return new BasicEList<Phone>();
		}
		
		// results are only Phones
		@SuppressWarnings("unchecked")
		EList<Phone> objects = new BasicEList<Phone>((Collection<? extends Phone>) result.getEObjects());
		
		return objects;	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		// Check if input is defined
		if(getMetaInformations() == null) {
			return null;
		}
		
		EObjectCondition oclCondition = null;
		String oclStatement = "true";
		try {
			oclCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( 	getOclEnvironment(),
																					oclStatement,
																					DataPackageImpl.eINSTANCE.getLocation());		
		}
		catch (ParserException e) {
			log("Malformed ocl statement: " + oclStatement + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return null;
		}
	
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getMetaInformations(), oclCondition.AND(Location.isTypeCondition));

		if(result == null) {
			return new BasicEList<Location>();
		}
		
		// results are only Locations
		@SuppressWarnings("unchecked")
		EList<Location> objects = new BasicEList<Location>((Collection<? extends Location>) result.getEObjects());
		
		return objects;	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Email> getEmails() {
		// Check if input is defined
		if(getMetaInformations() == null) {
			return null;
		}
		
		EObjectCondition oclCondition = null;
		String oclStatement = "true";
		try {
			oclCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( 	getOclEnvironment(),
																					oclStatement,
																					DataPackageImpl.eINSTANCE.getEmail());		
		}
		catch (ParserException e) {
			log("Malformed ocl statement: " + oclStatement + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return null;
		}
	
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getMetaInformations(), oclCondition.AND(Email.isTypeCondition));

		if(result == null) {
			return new BasicEList<Email>();
		}
		
		// results are only Emails
		@SuppressWarnings("unchecked")
		EList<Email> objects = new BasicEList<Email>((Collection<? extends Email>) result.getEObjects());
		
		return objects;	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstantMessenger> getInstantMessengers() {
		// Check if input is defined
		if(getMetaInformations() == null) {
			return null;
		}
		
		EObjectCondition oclCondition = null;
		String oclStatement = "true";
		try {
			oclCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( 	getOclEnvironment(),
																					oclStatement,
																					DataPackageImpl.eINSTANCE.getInstantMessenger());		
		}
		catch (ParserException e) {
			log("Malformed ocl statement: " + oclStatement + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return null;
		}
	
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getMetaInformations(), oclCondition.AND(InstantMessenger.isTypeCondition));

		if(result == null) {
			return new BasicEList<InstantMessenger>();
		}
		
		// results are only InstantMessengers
		@SuppressWarnings("unchecked")
		EList<InstantMessenger> objects = new BasicEList<InstantMessenger>((Collection<? extends InstantMessenger>) result.getEObjects());
		
		return objects;	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Email addEmailAddress(String emailAdress) {
		
		if(emailAdress == null || emailAdress.equals("")) {
			return null;
		}
		
		// quick check for existing to avoid more expensive later merge
		EList<Email> existingEmails = this.getEmails();
		if(existingEmails != null) {
			for(Email existing : existingEmails) {
				if(emailAdress.equalsIgnoreCase(existing.getAdress())) {
					// return already existing
					return existing;
				}
			}
		
		}
		// create email object
		Email email = dataFactory.createEmail();
		
		// set the address
		email.setAdress(emailAdress);
		
		// attach it to this information object
		return (Email) this.extend(email);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WebSite addWebSite(String url) {
		if(url == null || url.equals("")) {
			return null;
		}
		
		// quick check for existing to avoid more expensive later merge
		EList<WebSite> existingWebSites = this.getWebSites();
		if(existingWebSites != null) {
			for(WebSite existing : existingWebSites) {
				if(url.equalsIgnoreCase(existing.getAdress())) {
					// return already existing
					return existing;
				}
			}
		
		}
		
		// create web site object
		WebSite webSite = dataFactory.createWebSite();
		
		// set the address
		webSite.setAdress(url);
				
		// attach it to this information object
		return (WebSite) this.extend(webSite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<InformationObject> getInformationObjectsWithCommonTags() {
		DataSet dataSet = this.getDataSet();
		
		if(dataSet == null)
		{
			return null;
		}
		
		EList<Tag> allTags = this.getTags();
		
		if(allTags == null || allTags.isEmpty())
		{
			// stop if no tags attached
			return null;
		}
		
		// return all information objects that have at least one tag in common
		return dataSet.getInformationObjectsWithOneOfTags(allTags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WebAccount addWebAccount(String username) {
		if(username == null || username.equals(""))
		{
			return null;
		}
	
		// create web account object
		WebAccount webAccount = dataFactory.createWebAccount();
		
		// set the username
		webAccount.setUsername(username);
		
		// attach it to this information object
		return (WebAccount) this.extend(webAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Boolean hasImages() {
		return !getImages().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<InformationObject> getInformationObjectsConnectedTo() {
		BasicEList<InformationObject> connectedToList = new UniqueEList<InformationObject>();
		
		// look at all to connections and collect information objects
		for(Connection connectionTo : getConnectedTo())
		{
			connectedToList.add(connectionTo.getTo());
		}
		
		return connectedToList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<InformationObject> getInformationObjectsConnectedFrom() {
		BasicEList<InformationObject> connectedFromList = new UniqueEList<InformationObject>();
		
		// look at all from connections and collect information objects
		for(Connection connectionFrom : getConnectedBy())
		{
			connectedFromList.add(connectionFrom.getFrom());
		}
		
		return connectedFromList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<InformationObject> getInformationObjectsConnected() {
		BasicEList<InformationObject> connectedList = new UniqueEList<InformationObject>();
		
		// connected information objects can be connected to or from
		connectedList.addAll(this.getInformationObjectsConnectedFrom());
		connectedList.addAll(this.getInformationObjectsConnectedTo());
		
		return connectedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Connection connectTo(InformationObject informationObject) {
		return this.connectToWithMetaTag(informationObject, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Connection connectToWithMetaTag(InformationObject informationObject, String metaTag) {
		return this.connectToWithValueAndMetaTag(informationObject, null, metaTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<InformationObject> getInformationObjectsConnectedToWithMetaTag(String metaTag) {
		EList<InformationObject> connectedToList = new UniqueEList<InformationObject>();
		
		// look at all to connections and collect information objects
		for(Connection connectionTo : getConnectedTo())
		{
			// check meta tag
			if(connectionTo.hasMetaTag(metaTag))
			{
				connectedToList.add(connectionTo.getTo());
			}
		}
		
		return connectedToList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<InformationObject> getInformationObjectsConnectedFromWithMetaTag(String metaTag) {
		EList<InformationObject> connectedFromList = new UniqueEList<InformationObject>();
		
		// look at all from connections and collect information objects
		for(Connection connectionFrom : getConnectedBy())
		{
			// check meta tag
			if(connectionFrom.hasMetaTag(metaTag))
			{
				connectedFromList.add(connectionFrom.getFrom());
			}
		}
		
		return connectedFromList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<InformationObject> getInformationObjectsConnectedWithMetaTag(String metaTag) {
		EList<InformationObject> connectedList = new UniqueEList<InformationObject>();
		
		// connected information objects can be connected to or from
		connectedList.addAll(this.getInformationObjectsConnectedFromWithMetaTag(metaTag));
		connectedList.addAll(this.getInformationObjectsConnectedToWithMetaTag(metaTag));
		
		return connectedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Connection> getConnectionsFrom(InformationObject informationObject) {
		if(informationObject == null)
		{
			return null;
		}
		
		// return from given to this
		return informationObject.getConnectionsTo(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Connection> getConnectionsTo(InformationObject informationObject) {
		if(informationObject == null)
		{
			return null;
		}
		
		BasicEList<Connection> connectionList = new BasicEList<Connection>();
		
		// look at all connection to find the matching
		for(Connection connectionTo : getConnectedTo())
		{
			if(connectionTo.getTo() == informationObject)
			{
				connectionList.add(connectionTo);
			}
		}
		
		return connectionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Connection connectToWithValueAndMetaTag(InformationObject informationObject, String value, String metaTag) {
		if(informationObject == null)
		{
			return null;
		}
		
		// get possible existing connection
		Connection connection = this.getConnectionTo(informationObject, value);
		
		if(connection == null)
		{
			// create new connection object
			connection = dataFactory.createConnection();
			if(this.getDataSet() != null)
			{
				connection = (Connection) this.getDataSet().add(connection);
			}
			connection.setTo(informationObject);
			connection.setFrom(this);
			
			// set string value
			connection.setStringValue(value);
		}
		
		// add meta tag
		connection.metaTag(metaTag);
		
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Connection getConnectionTo(InformationObject informationObject, String value) {
		if(informationObject == null)
		{
			return null;
		}
		
		EList<Connection> connections = this.getConnectionsTo(informationObject);
		
		for(Connection connectionTo : connections)
		{
			// connection math if both are null or have the same value
			if((value == null && connectionTo.getStringValue() == null) || 
			   (value != null && value.equals(connectionTo.getStringValue())))
			   {
					return connectionTo;
			   }
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Connection getConnectionFrom(InformationObject informationObject, String value) {
		if(informationObject == null)
		{
			return null;
		}
		
		// return from given to this
		return informationObject.getConnectionTo(this, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Attachment getAttachmentWithUrl(String url) {
		if(url == null || url.isEmpty())
		{
			return null;
		}
		
		EList<Attachment> attachments = this.getAttachments();
		for(Attachment attachment : attachments)
		{
			if(url.equalsIgnoreCase(attachment.getOriginalFileUrl()) ||
			   url.equalsIgnoreCase(attachment.getCachedFileUrl()))
			{
				// if original or cached file url matches than return
				return attachment;
			}
		}
		
		// nothing found
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Image getAttachedImageWithUrl(String url) {
		Attachment attachmentWithUrl = this.getAttachmentWithUrl(url);
		
		// if there is an attachment of type image then return it
		if(attachmentWithUrl != null && attachmentWithUrl instanceof Image)
		{
			return (Image) attachmentWithUrl;
		}
				
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Phone addPhone(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.equals(""))
		{
			return null;
		}
	
		// create phone object
		Phone phone = dataFactory.createPhone();
		
		// set the phonenumber
		phone.setNumber(phoneNumber);
		
		// attach it to this information object
		return (Phone) this.extend(phone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Person> getPersonsWithCommonTags() {
		DataSet dataSet = this.getDataSet();
		
		if(dataSet == null)
		{
			return null;
		}
		
		EList<Tag> allTags = this.getTags();
		
		if(allTags == null || allTags.isEmpty())
		{
			// stop if no tags attached
			return null;
		}
		
		// return all persons that have at least one tag in common
		return dataSet.getPersonsWithOneOfTags(allTags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Organisation> getOrganisationsWithCommonTags() {
		DataSet dataSet = this.getDataSet();
		
		if(dataSet == null)
		{
			return null;
		}
		
		EList<Tag> allTags = this.getTags();
		
		if(allTags == null || allTags.isEmpty())
		{
			// stop if no tags attached
			return null;
		}
		
		// return all organisations that have at least one tag in common
		return dataSet.getOrganisationsWithOneOfTags(allTags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Content> getContentsWithCommonTags() {
		DataSet dataSet = this.getDataSet();
		
		if(dataSet == null)
		{
			return null;
		}
		
		EList<Tag> allTags = this.getTags();
		
		if(allTags == null || allTags.isEmpty())
		{
			// stop if no tags attached
			return null;
		}
		
		// return all contents that have at least one tag in common
		return dataSet.getContentsWithOneOfTags(allTags);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Tag unTag(String name) {
		EList<Tag> thisTags = this.getTags();
		if(name == null || name.isEmpty() || thisTags == null || thisTags.isEmpty())
		{
			return null;
		}
		
		// find tag
		for(Tag current : thisTags)
		{
			if(name.equalsIgnoreCase(current.getName()))
			{
				// found -> remove and return
				thisTags.remove(current);
				return current;
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Category unCategorize(String name) {
		EList<Category> thisCategories = this.getCategories();
		if(name == null || name.isEmpty() || thisCategories == null || thisCategories.isEmpty())
		{
			return null;
		}
		
		// find category
		for(Category current : thisCategories)
		{
			if(name.equalsIgnoreCase(current.getName()))
			{
				// found -> remove and return
				thisCategories.remove(current);
				return current;
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getSlugName() {
		String slug = getName();
		if(slug == null || slug.isEmpty())
		{
			slug = getIdent();
		}
		
		if(slug == null || slug.isEmpty())
		{
			// fallback if no ident or name set
			return "slug";
		}
		
		// return lowercase without non word characters
		return slug.toLowerCase().replaceAll("\\W", "");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Connection> getConnectionsToWithMetaTag(InformationObject informationObject, String metaTag) {
		EList<Connection> allConectionsTo = getConnectionsTo(informationObject);
		if(allConectionsTo == null)
		{
			return null;
		}
		
		BasicEList<Connection> connectionList = new BasicEList<Connection>();
		
		// look at all connection to find the matching
		for(Connection connectionTo : getConnectedTo())
		{
			if(connectionTo.hasMetaTag(metaTag))
			{
				connectionList.add(connectionTo);
			}
		}
		
		return connectionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<Connection> getConnectionsFromWithMetaTag(InformationObject informationObject, String metaTag) {
		EList<Connection> allConectionsTo = getConnectionsTo(informationObject);
		if(allConectionsTo == null)
		{
			return null;
		}
		
		BasicEList<Connection> connectionList = new BasicEList<Connection>();
		
		// look at all connection to find the matching
		for(Connection connectionTo : getConnectedTo())
		{
			if(connectionTo.hasMetaTag(metaTag))
			{
				connectionList.add(connectionTo);
			}
		}
		
		return connectionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public StarRanking starRankWithMetaTag(Integer stars, Integer ofStars, String metaTag) {
		StarRanking ranking = this.starRank(stars, ofStars);
		if(ranking != null) {
			ranking.metaTag(metaTag);
		}
		return ranking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String addAlternativeName(String name) {
		if(name == null) {
			return null;
		}
		
		// trim name and add it if it is valid
		String trimmedName = name.trim();
		
		if(trimmedName.isEmpty()) {
			return null;
		}
		
		Set<String> allNames = this.getAlternativeNamesSet();
		if(!allNames.contains(trimmedName)) {
			allNames.add(trimmedName);
			this.setAlternativeNamesBySet(allNames);
		}
		
		// TODO check for merge due to new name
		
		return trimmedName;
	}

	/**
	 * Returns the alternative names as set.
	 * 
	 * @return The alternative names as set.
	 */
	protected Set<String> getAlternativeNamesSet() {
		
		HashSet<String> alternativeNamesSet = new HashSet<String>();
		
		if(alternativeNames != null) {
			String[] allNames = alternativeNames.split(",");
			for(String name : allNames) {
				alternativeNamesSet.add(name);
			}
		}
		
		return alternativeNamesSet;
	}
	
	/**
	 * Returns a set with all names including alternative names.
	 * 
	 * @return The set with all names including alternative names.
	 */
	protected Set<String> getAllNamesSet() {
		
		Set<String> allNamesSet = getAlternativeNamesSet();
		allNamesSet.add(this.getName());
		
		return allNamesSet;
	}
	
	/**
	 * Creates a comma separated list from the set of alternative names.
	 * 
	 * @param alternativeNamesSet Set of alternative names
	 */
	private void setAlternativeNamesBySet(Set<String> alternativeNamesSet) {
		String alternativeNamesCommaList = "";
		for(String altName : alternativeNamesSet) {
			alternativeNamesCommaList += altName + ",";
		}
		
		// remove last comma
		if(!alternativeNamesCommaList.isEmpty()) {
			alternativeNamesCommaList = alternativeNamesCommaList.substring(0, alternativeNamesCommaList.length()-1);
		}
		
		// update only if changed
		if(this.getAlternativeNames() == null || !this.getAlternativeNames().equals(alternativeNamesCommaList)) {
			this.setAlternativeNames(alternativeNamesCommaList);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#update(org.sociotech.communitymashup.data.Item)
	 */
	@Override
	public Item update(Item item) {
		if(item instanceof InformationObjectImpl) {
			InformationObjectImpl io = (InformationObjectImpl) item;

			// ensure to keep verified name flag, merge should not overwrite name but maybe flag
			if(this.getVerifiedName() && !io.getVerifiedName()){
				io.setVerifiedName(true);
			}
			
			// merge alternative names if set
			if(this.alternativeNames != null || io.alternativeNames != null) {
				Set<String> allNames = this.getAlternativeNamesSet();
				// add all other names
				allNames.addAll(io.getAlternativeNamesSet());
				// if different then also add main name
				if(this.getName() != io.getName()) {
					allNames.add(this.getName());
				}
				
				// set new list at both items to keep at merge
				this.setAlternativeNamesBySet(allNames);
				io.setAlternativeNamesBySet(allNames);
			}
		}
		
		// continue with base update implementation
		return super.update(item);
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Image getAttachedImageWithMetaTag(MetaTag metaTag) {
		images = getImages();
		
		if(images == null || images.isEmpty()) return null;
		
		// find first image with metatag and return it
		for(Image image : images) {
			if(image.getMetaTags().contains(metaTag)) return image;
		}
				
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Image getAttachedImageWithMetaTagName(String metaTagName) {
		if(getDataSet() == null) return null;
		return getAttachedImageWithMetaTag(getDataSet().getMetaTag(metaTagName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public StarRanking starRankWithMetaTagList(Integer stars, Integer ofStars, String metaTagList) {
		StarRanking ranking = this.starRank(stars, ofStars);
		if(ranking != null && metaTagList != null) {
			// split comma separated list
			String[] metaTagArray = metaTagList.split(",");
			// add all meta tags
			for(String metaTag : metaTagArray) {
				ranking.metaTag(metaTag);
			}
		}
		return ranking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public WebAccount addWebAccountForService(String username, String service) {
		if(username == null || username.equals("")) {
			return null;
		}
	
		// quick check for existing to avoid more expensive later merge
		EList<WebAccount> existingWebAccounts = this.getWebAccounts();
		if(existingWebAccounts != null) {
			for(WebAccount existing : existingWebAccounts) {
				if(existing.getUsername() == null || existing.getService() == null || service == null) {
					// must be set for match
					continue;
				}
				if(username.equalsIgnoreCase(existing.getUsername()) && service.equalsIgnoreCase(existing.getService()) ) {
					// return already existing
					return existing;
				}
			}

		}
		
		// create web account object
		WebAccount webAccount = dataFactory.createWebAccount();
		
		// set the username
		webAccount.setUsername(username);
		// and the service
		webAccount.setService(service);
		
		// attach it to this information object
		return (WebAccount) this.extend(webAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.INFORMATION_OBJECT__CATEGORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategories()).basicAdd(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__TAGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTags()).basicAdd(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__STAR_RANKINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStarRankings()).basicAdd(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__THUMB_RANKINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThumbRankings()).basicAdd(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__VIEW_RANKINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getViewRankings()).basicAdd(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__CONNECTED_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedTo()).basicAdd(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__CONNECTED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectedBy()).basicAdd(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__MAIN_CATEGORY:
				if (mainCategory != null)
					msgs = ((InternalEObject)mainCategory).eInverseRemove(this, DataPackage.CATEGORY__MAIN_CATEGORIZED, Category.class, msgs);
				return basicSetMainCategory((Category)otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__META_INFORMATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetaInformations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.INFORMATION_OBJECT__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__STAR_RANKINGS:
				return ((InternalEList<?>)getStarRankings()).basicRemove(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__THUMB_RANKINGS:
				return ((InternalEList<?>)getThumbRankings()).basicRemove(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__VIEW_RANKINGS:
				return ((InternalEList<?>)getViewRankings()).basicRemove(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__CONNECTED_TO:
				return ((InternalEList<?>)getConnectedTo()).basicRemove(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__CONNECTED_BY:
				return ((InternalEList<?>)getConnectedBy()).basicRemove(otherEnd, msgs);
			case DataPackage.INFORMATION_OBJECT__MAIN_CATEGORY:
				return basicSetMainCategory(null, msgs);
			case DataPackage.INFORMATION_OBJECT__META_INFORMATIONS:
				return ((InternalEList<?>)getMetaInformations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.INFORMATION_OBJECT__CATEGORIES:
				return getCategories();
			case DataPackage.INFORMATION_OBJECT__TAGS:
				return getTags();
			case DataPackage.INFORMATION_OBJECT__IMAGES:
				return getImages();
			case DataPackage.INFORMATION_OBJECT__STAR_RANKINGS:
				return getStarRankings();
			case DataPackage.INFORMATION_OBJECT__THUMB_RANKINGS:
				return getThumbRankings();
			case DataPackage.INFORMATION_OBJECT__VIEW_RANKINGS:
				return getViewRankings();
			case DataPackage.INFORMATION_OBJECT__NAME:
				return getName();
			case DataPackage.INFORMATION_OBJECT__CONNECTED_TO:
				return getConnectedTo();
			case DataPackage.INFORMATION_OBJECT__CONNECTED_BY:
				return getConnectedBy();
			case DataPackage.INFORMATION_OBJECT__BINARIES:
				return getBinaries();
			case DataPackage.INFORMATION_OBJECT__MAIN_CATEGORY:
				if (resolve) return getMainCategory();
				return basicGetMainCategory();
			case DataPackage.INFORMATION_OBJECT__META_INFORMATIONS:
				return getMetaInformations();
			case DataPackage.INFORMATION_OBJECT__ALTERNATIVE_NAMES:
				return getAlternativeNames();
			case DataPackage.INFORMATION_OBJECT__VERIFIED_NAME:
				return getVerifiedName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.INFORMATION_OBJECT__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends Image>)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__STAR_RANKINGS:
				getStarRankings().clear();
				getStarRankings().addAll((Collection<? extends StarRanking>)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__THUMB_RANKINGS:
				getThumbRankings().clear();
				getThumbRankings().addAll((Collection<? extends ThumbRanking>)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__VIEW_RANKINGS:
				getViewRankings().clear();
				getViewRankings().addAll((Collection<? extends ViewRanking>)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__NAME:
				setName((String)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__CONNECTED_TO:
				getConnectedTo().clear();
				getConnectedTo().addAll((Collection<? extends Connection>)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__CONNECTED_BY:
				getConnectedBy().clear();
				getConnectedBy().addAll((Collection<? extends Connection>)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__BINARIES:
				getBinaries().clear();
				getBinaries().addAll((Collection<? extends Binary>)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__MAIN_CATEGORY:
				setMainCategory((Category)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__META_INFORMATIONS:
				getMetaInformations().clear();
				getMetaInformations().addAll((Collection<? extends MetaInformation>)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__ALTERNATIVE_NAMES:
				setAlternativeNames((String)newValue);
				return;
			case DataPackage.INFORMATION_OBJECT__VERIFIED_NAME:
				setVerifiedName((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DataPackage.INFORMATION_OBJECT__CATEGORIES:
				getCategories().clear();
				return;
			case DataPackage.INFORMATION_OBJECT__TAGS:
				getTags().clear();
				return;
			case DataPackage.INFORMATION_OBJECT__IMAGES:
				getImages().clear();
				return;
			case DataPackage.INFORMATION_OBJECT__STAR_RANKINGS:
				getStarRankings().clear();
				return;
			case DataPackage.INFORMATION_OBJECT__THUMB_RANKINGS:
				getThumbRankings().clear();
				return;
			case DataPackage.INFORMATION_OBJECT__VIEW_RANKINGS:
				getViewRankings().clear();
				return;
			case DataPackage.INFORMATION_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.INFORMATION_OBJECT__CONNECTED_TO:
				getConnectedTo().clear();
				return;
			case DataPackage.INFORMATION_OBJECT__CONNECTED_BY:
				getConnectedBy().clear();
				return;
			case DataPackage.INFORMATION_OBJECT__BINARIES:
				getBinaries().clear();
				return;
			case DataPackage.INFORMATION_OBJECT__MAIN_CATEGORY:
				setMainCategory((Category)null);
				return;
			case DataPackage.INFORMATION_OBJECT__META_INFORMATIONS:
				getMetaInformations().clear();
				return;
			case DataPackage.INFORMATION_OBJECT__ALTERNATIVE_NAMES:
				setAlternativeNames(ALTERNATIVE_NAMES_EDEFAULT);
				return;
			case DataPackage.INFORMATION_OBJECT__VERIFIED_NAME:
				setVerifiedName(VERIFIED_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DataPackage.INFORMATION_OBJECT__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case DataPackage.INFORMATION_OBJECT__TAGS:
				return tags != null && !tags.isEmpty();
			case DataPackage.INFORMATION_OBJECT__IMAGES:
				return images != null && !images.isEmpty();
			case DataPackage.INFORMATION_OBJECT__STAR_RANKINGS:
				return starRankings != null && !starRankings.isEmpty();
			case DataPackage.INFORMATION_OBJECT__THUMB_RANKINGS:
				return thumbRankings != null && !thumbRankings.isEmpty();
			case DataPackage.INFORMATION_OBJECT__VIEW_RANKINGS:
				return viewRankings != null && !viewRankings.isEmpty();
			case DataPackage.INFORMATION_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.INFORMATION_OBJECT__CONNECTED_TO:
				return connectedTo != null && !connectedTo.isEmpty();
			case DataPackage.INFORMATION_OBJECT__CONNECTED_BY:
				return connectedBy != null && !connectedBy.isEmpty();
			case DataPackage.INFORMATION_OBJECT__BINARIES:
				return binaries != null && !binaries.isEmpty();
			case DataPackage.INFORMATION_OBJECT__MAIN_CATEGORY:
				return mainCategory != null;
			case DataPackage.INFORMATION_OBJECT__META_INFORMATIONS:
				return metaInformations != null && !metaInformations.isEmpty();
			case DataPackage.INFORMATION_OBJECT__ALTERNATIVE_NAMES:
				return ALTERNATIVE_NAMES_EDEFAULT == null ? alternativeNames != null : !ALTERNATIVE_NAMES_EDEFAULT.equals(alternativeNames);
			case DataPackage.INFORMATION_OBJECT__VERIFIED_NAME:
				return VERIFIED_NAME_EDEFAULT == null ? verifiedName != null : !VERIFIED_NAME_EDEFAULT.equals(verifiedName);
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DataPackage.INFORMATION_OBJECT___TAG__STRING:
				return tag((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___CATEGORIZE__STRING:
				return categorize((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___ATTACH_IMAGE__STRING:
				return attachImage((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_ATTACHMENTS:
				return getAttachments();
			case DataPackage.INFORMATION_OBJECT___STAR_RANK__INTEGER_INTEGER:
				return starRank((Integer)arguments.get(0), (Integer)arguments.get(1));
			case DataPackage.INFORMATION_OBJECT___VIEW:
				return view();
			case DataPackage.INFORMATION_OBJECT___THUMBS_UP:
				return thumbsUp();
			case DataPackage.INFORMATION_OBJECT___THUMBS_DOWN:
				return thumbsDown();
			case DataPackage.INFORMATION_OBJECT___GET_THUMBS_UP:
				return getThumbsUp();
			case DataPackage.INFORMATION_OBJECT___GET_THUMBS_DOWN:
				return getThumbsDown();
			case DataPackage.INFORMATION_OBJECT___GET_THUMBS_UP_COUNT:
				return getThumbsUpCount();
			case DataPackage.INFORMATION_OBJECT___GET_THUMBS_DOWN_COUNT:
				return getThumbsDownCount();
			case DataPackage.INFORMATION_OBJECT___GET_THUMBS_COUNT:
				return getThumbsCount();
			case DataPackage.INFORMATION_OBJECT___GET_VIEWS_COUNT:
				return getViewsCount();
			case DataPackage.INFORMATION_OBJECT___GET_STAR_RANKING:
				return getStarRanking();
			case DataPackage.INFORMATION_OBJECT___EXTEND__METAINFORMATION:
				return extend((MetaInformation)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_WEB_ACCOUNTS:
				return getWebAccounts();
			case DataPackage.INFORMATION_OBJECT___GET_WEB_SITES:
				return getWebSites();
			case DataPackage.INFORMATION_OBJECT___GET_PHONES:
				return getPhones();
			case DataPackage.INFORMATION_OBJECT___GET_LOCATIONS:
				return getLocations();
			case DataPackage.INFORMATION_OBJECT___GET_EMAILS:
				return getEmails();
			case DataPackage.INFORMATION_OBJECT___GET_INSTANT_MESSENGERS:
				return getInstantMessengers();
			case DataPackage.INFORMATION_OBJECT___ADD_EMAIL_ADDRESS__STRING:
				return addEmailAddress((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___ADD_WEB_SITE__STRING:
				return addWebSite((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_WITH_COMMON_TAGS:
				return getInformationObjectsWithCommonTags();
			case DataPackage.INFORMATION_OBJECT___ADD_WEB_ACCOUNT__STRING:
				return addWebAccount((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___HAS_IMAGES:
				return hasImages();
			case DataPackage.INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO:
				return getInformationObjectsConnectedTo();
			case DataPackage.INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM:
				return getInformationObjectsConnectedFrom();
			case DataPackage.INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED:
				return getInformationObjectsConnected();
			case DataPackage.INFORMATION_OBJECT___CONNECT_TO__INFORMATIONOBJECT:
				return connectTo((InformationObject)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___CONNECT_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING:
				return connectToWithMetaTag((InformationObject)arguments.get(0), (String)arguments.get(1));
			case DataPackage.INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_TO_WITH_META_TAG__STRING:
				return getInformationObjectsConnectedToWithMetaTag((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_FROM_WITH_META_TAG__STRING:
				return getInformationObjectsConnectedFromWithMetaTag((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_INFORMATION_OBJECTS_CONNECTED_WITH_META_TAG__STRING:
				return getInformationObjectsConnectedWithMetaTag((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_CONNECTIONS_FROM__INFORMATIONOBJECT:
				return getConnectionsFrom((InformationObject)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_CONNECTIONS_TO__INFORMATIONOBJECT:
				return getConnectionsTo((InformationObject)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___CONNECT_TO_WITH_VALUE_AND_META_TAG__INFORMATIONOBJECT_STRING_STRING:
				return connectToWithValueAndMetaTag((InformationObject)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case DataPackage.INFORMATION_OBJECT___GET_CONNECTION_TO__INFORMATIONOBJECT_STRING:
				return getConnectionTo((InformationObject)arguments.get(0), (String)arguments.get(1));
			case DataPackage.INFORMATION_OBJECT___GET_CONNECTION_FROM__INFORMATIONOBJECT_STRING:
				return getConnectionFrom((InformationObject)arguments.get(0), (String)arguments.get(1));
			case DataPackage.INFORMATION_OBJECT___GET_ATTACHMENT_WITH_URL__STRING:
				return getAttachmentWithUrl((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_URL__STRING:
				return getAttachedImageWithUrl((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___ADD_PHONE__STRING:
				return addPhone((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_PERSONS_WITH_COMMON_TAGS:
				return getPersonsWithCommonTags();
			case DataPackage.INFORMATION_OBJECT___GET_ORGANISATIONS_WITH_COMMON_TAGS:
				return getOrganisationsWithCommonTags();
			case DataPackage.INFORMATION_OBJECT___GET_CONTENTS_WITH_COMMON_TAGS:
				return getContentsWithCommonTags();
			case DataPackage.INFORMATION_OBJECT___UN_TAG__STRING:
				return unTag((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___UN_CATEGORIZE__STRING:
				return unCategorize((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_SLUG_NAME:
				return getSlugName();
			case DataPackage.INFORMATION_OBJECT___GET_CONNECTIONS_TO_WITH_META_TAG__INFORMATIONOBJECT_STRING:
				return getConnectionsToWithMetaTag((InformationObject)arguments.get(0), (String)arguments.get(1));
			case DataPackage.INFORMATION_OBJECT___GET_CONNECTIONS_FROM_WITH_META_TAG__INFORMATIONOBJECT_STRING:
				return getConnectionsFromWithMetaTag((InformationObject)arguments.get(0), (String)arguments.get(1));
			case DataPackage.INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG__INTEGER_INTEGER_STRING:
				return starRankWithMetaTag((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2));
			case DataPackage.INFORMATION_OBJECT___ADD_ALTERNATIVE_NAME__STRING:
				return addAlternativeName((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG__METATAG:
				return getAttachedImageWithMetaTag((MetaTag)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___GET_ATTACHED_IMAGE_WITH_META_TAG_NAME__STRING:
				return getAttachedImageWithMetaTagName((String)arguments.get(0));
			case DataPackage.INFORMATION_OBJECT___STAR_RANK_WITH_META_TAG_LIST__INTEGER_INTEGER_STRING:
				return starRankWithMetaTagList((Integer)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2));
			case DataPackage.INFORMATION_OBJECT___ADD_WEB_ACCOUNT_FOR_SERVICE__STRING_STRING:
				return addWebAccountForService((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", alternativeNames: ");
		result.append(alternativeNames);
		result.append(", verifiedName: ");
		result.append(verifiedName);
		result.append(')');
		return result.toString();
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type InformationObject.
	 * 
	 * @return An EObjectCondition whether the Object is of the type InformationObject.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		EObjectCondition result = new EObjectTypeRelationCondition(DataPackageImpl.eINSTANCE.getInformationObject());
		return result.OR(Person.isTypeCondition).OR(Content.isTypeCondition).OR(Organisation.isTypeCondition);
	}

	/**
	 * This method provides a generic access to the Getters of this class.
 	 * 
 	 * @param opName The name of the Feature to be gotten.
 	 *
 	 * @return The value of the Feature or null.
 	 * 
	 * @generated
	 */
	protected Object getFeature(String featureName) throws UnknownOperationException {
		if ( featureName.equalsIgnoreCase("categories") )
			return this.getCategories();		
		if ( featureName.equalsIgnoreCase("tags") )
			return this.getTags();		
		if ( featureName.equalsIgnoreCase("images") )
			return this.getImages();		
		if ( featureName.equalsIgnoreCase("starRankings") )
			return this.getStarRankings();		
		if ( featureName.equalsIgnoreCase("thumbRankings") )
			return this.getThumbRankings();		
		if ( featureName.equalsIgnoreCase("viewRankings") )
			return this.getViewRankings();		
		if ( featureName.equalsIgnoreCase("name") )
			return this.getName();		
		if ( featureName.equalsIgnoreCase("connectedTo") )
			return this.getConnectedTo();		
		if ( featureName.equalsIgnoreCase("connectedBy") )
			return this.getConnectedBy();		
		if ( featureName.equalsIgnoreCase("binaries") )
			return this.getBinaries();		
		if ( featureName.equalsIgnoreCase("mainCategory") )
			return this.getMainCategory();		
		if ( featureName.equalsIgnoreCase("metaInformations") )
			return this.getMetaInformations();		
		if ( featureName.equalsIgnoreCase("alternativeNames") )
			return this.getAlternativeNames();		
		if ( featureName.equalsIgnoreCase("verifiedName") )
			return this.getVerifiedName();			
		return super.getFeature(featureName); 
	}

	/**
	 * This method provides a generic access to the Setters of this class.
 	 * 
 	 * @param opName The name of the Feature to be set.
 	 * @param value The new value of the feature.
 	 * 
	 * @generated
	 */
	protected Object setFeature(String featureName, Object value) throws WrongArgException, UnknownOperationException {
		if ( featureName.equalsIgnoreCase("name") ) {
				java.lang.String fname = null;
				try {
					fname = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("InformationObject.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setName(fname);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("mainCategory") ) {
				org.sociotech.communitymashup.data.Category fmainCategory = null;
				try {
					try {
						fmainCategory = (org.sociotech.communitymashup.data.Category)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fmainCategory = (org.sociotech.communitymashup.data.Category)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("InformationObject.setFeature", "org.sociotech.communitymashup.data.Category",value.getClass().getName());
				}
				this.setMainCategory(fmainCategory);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("alternativeNames") ) {
				java.lang.String falternativeNames = null;
				try {
					falternativeNames = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("InformationObject.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setAlternativeNames(falternativeNames);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("verifiedName") ) {
				java.lang.Boolean fverifiedName = null;
				try {
					try {
						fverifiedName = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fverifiedName = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("InformationObject.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setVerifiedName(fverifiedName);
			return this;
			}			
		super.setFeature(featureName, value);
		return this; 
	}

	/**
	 * This method provides a generic access to the Operations of this class.
 	 * 
 	 * @param opName The name of the requested Operation.
 	 * @param values The arguments to be used.
 	 * 
 	 * @return The result of the Operation or null.
 	 * 
	 * @generated
	 */
	protected Object doOperation(RestCommand command) throws ArgNotFoundException, WrongArgException, WrongArgCountException, UnknownOperationException {
		if ( command.getCommand().equalsIgnoreCase("tag")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String name = null;
			try {
				name = (java.lang.String)command.getArg("name");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("name").getClass().getName());
			}
			return this.tag(name);
		}
		if ( command.getCommand().equalsIgnoreCase("categorize")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String name = null;
			try {
				name = (java.lang.String)command.getArg("name");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("name").getClass().getName());
			}
			return this.categorize(name);
		}
		if ( command.getCommand().equalsIgnoreCase("attachImage")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String imageUrl = null;
			try {
				imageUrl = (java.lang.String)command.getArg("imageUrl");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("imageUrl").getClass().getName());
			}
			return this.attachImage(imageUrl);
		}
		if ( command.getCommand().equalsIgnoreCase("getAttachments")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getAttachments();
		}
		if ( command.getCommand().equalsIgnoreCase("starRank")) {
			if (command.getArgCount() != 2) throw new WrongArgCountException("InformationObject.doOperation", 2, command.getArgCount()); 
			java.lang.Integer stars = null;
			try {
				stars = (java.lang.Integer)(RestUtil.fromIntegerString((String)command.getArg("stars")));
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.Integer", command.getArg("stars").getClass().getName());
			}
			java.lang.Integer ofStars = null;
			try {
				ofStars = (java.lang.Integer)(RestUtil.fromIntegerString((String)command.getArg("ofStars")));
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.Integer", command.getArg("ofStars").getClass().getName());
			}
			return this.starRank(stars, ofStars);
		}
		if ( command.getCommand().equalsIgnoreCase("view")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.view();
		}
		if ( command.getCommand().equalsIgnoreCase("thumbsUp")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.thumbsUp();
		}
		if ( command.getCommand().equalsIgnoreCase("thumbsDown")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.thumbsDown();
		}
		if ( command.getCommand().equalsIgnoreCase("getThumbsUp")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getThumbsUp();
		}
		if ( command.getCommand().equalsIgnoreCase("getThumbsDown")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getThumbsDown();
		}
		if ( command.getCommand().equalsIgnoreCase("getThumbsUpCount")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getThumbsUpCount();
		}
		if ( command.getCommand().equalsIgnoreCase("getThumbsDownCount")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getThumbsDownCount();
		}
		if ( command.getCommand().equalsIgnoreCase("getThumbsCount")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getThumbsCount();
		}
		if ( command.getCommand().equalsIgnoreCase("getViewsCount")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getViewsCount();
		}
		if ( command.getCommand().equalsIgnoreCase("getStarRanking")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getStarRanking();
		}
		if ( command.getCommand().equalsIgnoreCase("extend")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			MetaInformation metaInformation = null;
			try {
				try {
					metaInformation = (MetaInformation)(RestUtil.fromInput(command.getArg("metaInformation")));
				} catch (ClassNotFoundException e) {
					metaInformation = (MetaInformation)command.getArg("metaInformation");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "MetaInformation", command.getArg("metaInformation").getClass().getName());
			}
			return this.extend(metaInformation);
		}
		if ( command.getCommand().equalsIgnoreCase("getWebAccounts")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getWebAccounts();
		}
		if ( command.getCommand().equalsIgnoreCase("getWebSites")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getWebSites();
		}
		if ( command.getCommand().equalsIgnoreCase("getPhones")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getPhones();
		}
		if ( command.getCommand().equalsIgnoreCase("getLocations")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getLocations();
		}
		if ( command.getCommand().equalsIgnoreCase("getEmails")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getEmails();
		}
		if ( command.getCommand().equalsIgnoreCase("getInstantMessengers")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getInstantMessengers();
		}
		if ( command.getCommand().equalsIgnoreCase("addEmailAddress")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String emailAdress = null;
			try {
				emailAdress = (java.lang.String)command.getArg("emailAdress");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("emailAdress").getClass().getName());
			}
			return this.addEmailAddress(emailAdress);
		}
		if ( command.getCommand().equalsIgnoreCase("addWebSite")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String url = null;
			try {
				url = (java.lang.String)command.getArg("url");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("url").getClass().getName());
			}
			return this.addWebSite(url);
		}
		if ( command.getCommand().equalsIgnoreCase("getInformationObjectsWithCommonTags")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getInformationObjectsWithCommonTags();
		}
		if ( command.getCommand().equalsIgnoreCase("addWebAccount")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String username = null;
			try {
				username = (java.lang.String)command.getArg("username");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("username").getClass().getName());
			}
			return this.addWebAccount(username);
		}
		if ( command.getCommand().equalsIgnoreCase("hasImages")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.hasImages();
		}
		if ( command.getCommand().equalsIgnoreCase("getInformationObjectsConnectedTo")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getInformationObjectsConnectedTo();
		}
		if ( command.getCommand().equalsIgnoreCase("getInformationObjectsConnectedFrom")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getInformationObjectsConnectedFrom();
		}
		if ( command.getCommand().equalsIgnoreCase("getInformationObjectsConnected")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getInformationObjectsConnected();
		}
		if ( command.getCommand().equalsIgnoreCase("connectTo")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			InformationObject informationObject = null;
			try {
				try {
					informationObject = (InformationObject)(RestUtil.fromInput(command.getArg("informationObject")));
				} catch (ClassNotFoundException e) {
					informationObject = (InformationObject)command.getArg("informationObject");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "InformationObject", command.getArg("informationObject").getClass().getName());
			}
			return this.connectTo(informationObject);
		}
		if ( command.getCommand().equalsIgnoreCase("connectToWithMetaTag")) {
			if (command.getArgCount() != 2) throw new WrongArgCountException("InformationObject.doOperation", 2, command.getArgCount()); 
			InformationObject informationObject = null;
			try {
				try {
					informationObject = (InformationObject)(RestUtil.fromInput(command.getArg("informationObject")));
				} catch (ClassNotFoundException e) {
					informationObject = (InformationObject)command.getArg("informationObject");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "InformationObject", command.getArg("informationObject").getClass().getName());
			}
			java.lang.String metaTag = null;
			try {
				metaTag = (java.lang.String)command.getArg("metaTag");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("metaTag").getClass().getName());
			}
			return this.connectToWithMetaTag(informationObject, metaTag);
		}
		if ( command.getCommand().equalsIgnoreCase("getInformationObjectsConnectedToWithMetaTag")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String metaTag = null;
			try {
				metaTag = (java.lang.String)command.getArg("metaTag");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("metaTag").getClass().getName());
			}
			return this.getInformationObjectsConnectedToWithMetaTag(metaTag);
		}
		if ( command.getCommand().equalsIgnoreCase("getInformationObjectsConnectedFromWithMetaTag")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String metaTag = null;
			try {
				metaTag = (java.lang.String)command.getArg("metaTag");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("metaTag").getClass().getName());
			}
			return this.getInformationObjectsConnectedFromWithMetaTag(metaTag);
		}
		if ( command.getCommand().equalsIgnoreCase("getInformationObjectsConnectedWithMetaTag")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String metaTag = null;
			try {
				metaTag = (java.lang.String)command.getArg("metaTag");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("metaTag").getClass().getName());
			}
			return this.getInformationObjectsConnectedWithMetaTag(metaTag);
		}
		if ( command.getCommand().equalsIgnoreCase("getConnectionsFrom")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			InformationObject informationObject = null;
			try {
				try {
					informationObject = (InformationObject)(RestUtil.fromInput(command.getArg("informationObject")));
				} catch (ClassNotFoundException e) {
					informationObject = (InformationObject)command.getArg("informationObject");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "InformationObject", command.getArg("informationObject").getClass().getName());
			}
			return this.getConnectionsFrom(informationObject);
		}
		if ( command.getCommand().equalsIgnoreCase("getConnectionsTo")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			InformationObject informationObject = null;
			try {
				try {
					informationObject = (InformationObject)(RestUtil.fromInput(command.getArg("informationObject")));
				} catch (ClassNotFoundException e) {
					informationObject = (InformationObject)command.getArg("informationObject");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "InformationObject", command.getArg("informationObject").getClass().getName());
			}
			return this.getConnectionsTo(informationObject);
		}
		if ( command.getCommand().equalsIgnoreCase("connectToWithValueAndMetaTag")) {
			if (command.getArgCount() != 3) throw new WrongArgCountException("InformationObject.doOperation", 3, command.getArgCount()); 
			InformationObject informationObject = null;
			try {
				try {
					informationObject = (InformationObject)(RestUtil.fromInput(command.getArg("informationObject")));
				} catch (ClassNotFoundException e) {
					informationObject = (InformationObject)command.getArg("informationObject");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "InformationObject", command.getArg("informationObject").getClass().getName());
			}
			java.lang.String value = null;
			try {
				value = (java.lang.String)command.getArg("value");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("value").getClass().getName());
			}
			java.lang.String metaTag = null;
			try {
				metaTag = (java.lang.String)command.getArg("metaTag");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("metaTag").getClass().getName());
			}
			return this.connectToWithValueAndMetaTag(informationObject, value, metaTag);
		}
		if ( command.getCommand().equalsIgnoreCase("getConnectionTo")) {
			if (command.getArgCount() != 2) throw new WrongArgCountException("InformationObject.doOperation", 2, command.getArgCount()); 
			InformationObject informationObject = null;
			try {
				try {
					informationObject = (InformationObject)(RestUtil.fromInput(command.getArg("informationObject")));
				} catch (ClassNotFoundException e) {
					informationObject = (InformationObject)command.getArg("informationObject");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "InformationObject", command.getArg("informationObject").getClass().getName());
			}
			java.lang.String value = null;
			try {
				value = (java.lang.String)command.getArg("value");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("value").getClass().getName());
			}
			return this.getConnectionTo(informationObject, value);
		}
		if ( command.getCommand().equalsIgnoreCase("getConnectionFrom")) {
			if (command.getArgCount() != 2) throw new WrongArgCountException("InformationObject.doOperation", 2, command.getArgCount()); 
			InformationObject informationObject = null;
			try {
				try {
					informationObject = (InformationObject)(RestUtil.fromInput(command.getArg("informationObject")));
				} catch (ClassNotFoundException e) {
					informationObject = (InformationObject)command.getArg("informationObject");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "InformationObject", command.getArg("informationObject").getClass().getName());
			}
			java.lang.String value = null;
			try {
				value = (java.lang.String)command.getArg("value");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("value").getClass().getName());
			}
			return this.getConnectionFrom(informationObject, value);
		}
		if ( command.getCommand().equalsIgnoreCase("getAttachmentWithUrl")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String url = null;
			try {
				url = (java.lang.String)command.getArg("url");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("url").getClass().getName());
			}
			return this.getAttachmentWithUrl(url);
		}
		if ( command.getCommand().equalsIgnoreCase("getAttachedImageWithUrl")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String url = null;
			try {
				url = (java.lang.String)command.getArg("url");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("url").getClass().getName());
			}
			return this.getAttachedImageWithUrl(url);
		}
		if ( command.getCommand().equalsIgnoreCase("addPhone")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String phoneNumber = null;
			try {
				phoneNumber = (java.lang.String)command.getArg("phoneNumber");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("phoneNumber").getClass().getName());
			}
			return this.addPhone(phoneNumber);
		}
		if ( command.getCommand().equalsIgnoreCase("getPersonsWithCommonTags")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getPersonsWithCommonTags();
		}
		if ( command.getCommand().equalsIgnoreCase("getOrganisationsWithCommonTags")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getOrganisationsWithCommonTags();
		}
		if ( command.getCommand().equalsIgnoreCase("getContentsWithCommonTags")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getContentsWithCommonTags();
		}
		if ( command.getCommand().equalsIgnoreCase("unTag")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String name = null;
			try {
				name = (java.lang.String)command.getArg("name");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("name").getClass().getName());
			}
			return this.unTag(name);
		}
		if ( command.getCommand().equalsIgnoreCase("unCategorize")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String name = null;
			try {
				name = (java.lang.String)command.getArg("name");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("name").getClass().getName());
			}
			return this.unCategorize(name);
		}
		if ( command.getCommand().equalsIgnoreCase("getSlugName")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("InformationObject.doOperation", 0, command.getArgCount()); 
			return this.getSlugName();
		}
		if ( command.getCommand().equalsIgnoreCase("getConnectionsToWithMetaTag")) {
			if (command.getArgCount() != 2) throw new WrongArgCountException("InformationObject.doOperation", 2, command.getArgCount()); 
			InformationObject informationObject = null;
			try {
				try {
					informationObject = (InformationObject)(RestUtil.fromInput(command.getArg("informationObject")));
				} catch (ClassNotFoundException e) {
					informationObject = (InformationObject)command.getArg("informationObject");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "InformationObject", command.getArg("informationObject").getClass().getName());
			}
			java.lang.String metaTag = null;
			try {
				metaTag = (java.lang.String)command.getArg("metaTag");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("metaTag").getClass().getName());
			}
			return this.getConnectionsToWithMetaTag(informationObject, metaTag);
		}
		if ( command.getCommand().equalsIgnoreCase("getConnectionsFromWithMetaTag")) {
			if (command.getArgCount() != 2) throw new WrongArgCountException("InformationObject.doOperation", 2, command.getArgCount()); 
			InformationObject informationObject = null;
			try {
				try {
					informationObject = (InformationObject)(RestUtil.fromInput(command.getArg("informationObject")));
				} catch (ClassNotFoundException e) {
					informationObject = (InformationObject)command.getArg("informationObject");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "InformationObject", command.getArg("informationObject").getClass().getName());
			}
			java.lang.String metaTag = null;
			try {
				metaTag = (java.lang.String)command.getArg("metaTag");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("metaTag").getClass().getName());
			}
			return this.getConnectionsFromWithMetaTag(informationObject, metaTag);
		}
		if ( command.getCommand().equalsIgnoreCase("starRankWithMetaTag")) {
			if (command.getArgCount() != 3) throw new WrongArgCountException("InformationObject.doOperation", 3, command.getArgCount()); 
			java.lang.Integer stars = null;
			try {
				stars = (java.lang.Integer)(RestUtil.fromIntegerString((String)command.getArg("stars")));
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.Integer", command.getArg("stars").getClass().getName());
			}
			java.lang.Integer ofStars = null;
			try {
				ofStars = (java.lang.Integer)(RestUtil.fromIntegerString((String)command.getArg("ofStars")));
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.Integer", command.getArg("ofStars").getClass().getName());
			}
			java.lang.String metaTag = null;
			try {
				metaTag = (java.lang.String)command.getArg("metaTag");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("metaTag").getClass().getName());
			}
			return this.starRankWithMetaTag(stars, ofStars, metaTag);
		}
		if ( command.getCommand().equalsIgnoreCase("addAlternativeName")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String name = null;
			try {
				name = (java.lang.String)command.getArg("name");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("name").getClass().getName());
			}
			return this.addAlternativeName(name);
		}
		if ( command.getCommand().equalsIgnoreCase("getAttachedImageWithMetaTag")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			MetaTag metaTag = null;
			try {
				try {
					metaTag = (MetaTag)(RestUtil.fromInput(command.getArg("metaTag")));
				} catch (ClassNotFoundException e) {
					metaTag = (MetaTag)command.getArg("metaTag");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "MetaTag", command.getArg("metaTag").getClass().getName());
			}
			return this.getAttachedImageWithMetaTag(metaTag);
		}
		if ( command.getCommand().equalsIgnoreCase("getAttachedImageWithMetaTagName")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("InformationObject.doOperation", 1, command.getArgCount()); 
			java.lang.String metaTagName = null;
			try {
				metaTagName = (java.lang.String)command.getArg("metaTagName");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("metaTagName").getClass().getName());
			}
			return this.getAttachedImageWithMetaTagName(metaTagName);
		}
		if ( command.getCommand().equalsIgnoreCase("starRankWithMetaTagList")) {
			if (command.getArgCount() != 3) throw new WrongArgCountException("InformationObject.doOperation", 3, command.getArgCount()); 
			java.lang.Integer stars = null;
			try {
				stars = (java.lang.Integer)(RestUtil.fromIntegerString((String)command.getArg("stars")));
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.Integer", command.getArg("stars").getClass().getName());
			}
			java.lang.Integer ofStars = null;
			try {
				ofStars = (java.lang.Integer)(RestUtil.fromIntegerString((String)command.getArg("ofStars")));
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.Integer", command.getArg("ofStars").getClass().getName());
			}
			java.lang.String metaTagList = null;
			try {
				metaTagList = (java.lang.String)command.getArg("metaTagList");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("metaTagList").getClass().getName());
			}
			return this.starRankWithMetaTagList(stars, ofStars, metaTagList);
		}
		if ( command.getCommand().equalsIgnoreCase("addWebAccountForService")) {
			if (command.getArgCount() != 2) throw new WrongArgCountException("InformationObject.doOperation", 2, command.getArgCount()); 
			java.lang.String username = null;
			try {
				username = (java.lang.String)command.getArg("username");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("username").getClass().getName());
			}
			java.lang.String service = null;
			try {
				service = (java.lang.String)command.getArg("service");
			} catch (ClassCastException e) {
				throw new WrongArgException("InformationObject.doOperation", "java.lang.String", command.getArg("service").getClass().getName());
			}
			return this.addWebAccountForService(username, service);
		}	
		return super.doOperation(command);
	}

	/**
	 * This method can be used to recursively and generically call the Getter, Setters and Operations of the generated classes.
	 * 
	 * @param input The commands to be processed.
	 * @param requestType The HTTP-Method of the request.
	 * 
	 * @return The result of the Getter/Operation or null.
	 * 
	 * @generated
	 */
	@Override
	public Object process(LinkedList<RestCommand> input, RequestType requestType) throws ArgNotFoundException, WrongArgException, WrongArgCountException, UnknownOperationException {
		Object o = null;
		RestCommand c = input.poll();
		// check for HTTP-Request method
		if (requestType == RequestType.rtGet) {
			// only Getters are allowed -> side-effects...
			if (c.getCommand().startsWith("get")) {
				if (c.getArgCount() != 0) throw new WrongArgCountException(c.getCommand(), 0, c.getArgCount());
				o = this.getFeature(c.getCommand().substring(3));
			}
		} else {
			// everything is allowed - at least for now
			try {
				o = this.doOperation(c);
			} catch(Exception e) {
				if (c.getCommand().startsWith("get")) {
					if (c.getArgCount() != 0) throw new WrongArgCountException(c.getCommand(), 0, c.getArgCount());
					o = this.getFeature(c.getCommand().substring(3));
				} else if (c.getCommand().startsWith("set")) {
					if (c.getArgCount() != 1) throw new WrongArgCountException(c.getCommand(), 1, c.getArgCount());
					Object so = c.getArg("new" + c.getCommand().substring(3));
					o = this.setFeature(c.getCommand().substring(3), so);
				} else {
					if (e instanceof ArgNotFoundException)
						throw (ArgNotFoundException)e;
					if (e instanceof WrongArgException)
						throw (WrongArgException)e;
					if (e instanceof WrongArgCountException)
						throw (WrongArgCountException)e;
					if (e instanceof UnknownOperationException)
						throw (UnknownOperationException)e;
				}
			}
		}
		if (input.isEmpty()) {
			return o;
		} else { 
			if (o instanceof PersonImpl) {
				return ((Person) o).process(input, requestType);
			}
			if (o instanceof InformationObjectImpl) {
				return ((InformationObject) o).process(input, requestType);
			}
			if (o instanceof ContentImpl) {
				return ((Content) o).process(input, requestType);
			}
			if (o instanceof DataSetImpl) {
				return ((DataSet) o).process(input, requestType);
			}
			if (o instanceof ItemImpl) {
				return ((Item) o).process(input, requestType);
			}
			if (o instanceof ExtensionImpl) {
				return ((Extension) o).process(input, requestType);
			}
			if (o instanceof ClassificationImpl) {
				return ((Classification) o).process(input, requestType);
			}
			if (o instanceof CategoryImpl) {
				return ((Category) o).process(input, requestType);
			}
			if (o instanceof TagImpl) {
				return ((Tag) o).process(input, requestType);
			}
			if (o instanceof OrganisationImpl) {
				return ((Organisation) o).process(input, requestType);
			}
			if (o instanceof MetaTagImpl) {
				return ((MetaTag) o).process(input, requestType);
			}
			if (o instanceof PhoneImpl) {
				return ((Phone) o).process(input, requestType);
			}
			if (o instanceof InstantMessengerImpl) {
				return ((InstantMessenger) o).process(input, requestType);
			}
			if (o instanceof EmailImpl) {
				return ((Email) o).process(input, requestType);
			}
			if (o instanceof WebAccountImpl) {
				return ((WebAccount) o).process(input, requestType);
			}
			if (o instanceof WebSiteImpl) {
				return ((WebSite) o).process(input, requestType);
			}
			if (o instanceof RankingImpl) {
				return ((Ranking) o).process(input, requestType);
			}
			if (o instanceof AttachmentImpl) {
				return ((Attachment) o).process(input, requestType);
			}
			if (o instanceof LocationImpl) {
				return ((Location) o).process(input, requestType);
			}
			if (o instanceof ImageImpl) {
				return ((Image) o).process(input, requestType);
			}
			if (o instanceof DocumentImpl) {
				return ((Document) o).process(input, requestType);
			}
			if (o instanceof StarRankingImpl) {
				return ((StarRanking) o).process(input, requestType);
			}
			if (o instanceof ViewRankingImpl) {
				return ((ViewRanking) o).process(input, requestType);
			}
			if (o instanceof ThumbRankingImpl) {
				return ((ThumbRanking) o).process(input, requestType);
			}
			if (o instanceof TransformationImpl) {
				return ((Transformation) o).process(input, requestType);
			}
			if (o instanceof VideoImpl) {
				return ((Video) o).process(input, requestType);
			}
			if (o instanceof ConnectionImpl) {
				return ((Connection) o).process(input, requestType);
			}
			if (o instanceof BinaryImpl) {
				return ((Binary) o).process(input, requestType);
			}
			if (o instanceof MetaInformationImpl) {
				return ((MetaInformation) o).process(input, requestType);
			}
			if (o instanceof IndoorLocationImpl) {
				return ((IndoorLocation) o).process(input, requestType);
			}
			if (o instanceof IdentifierImpl) {
				return ((Identifier) o).process(input, requestType);
			}
			if (o instanceof EventImpl) {
				return ((Event) o).process(input, requestType);
			}
			if (o instanceof DeletedItemImpl) {
				return ((DeletedItem) o).process(input, requestType);
			}
			if (o instanceof List) {
				return RestUtil.listProcess((List<?>) o, input, requestType);
			}
		}
		return null;
	}

	/**
	 * Returns the condition to evaluate if a information object has the given name.
	 * 
	 * @return The condition to evaluate if a information object has the given name, null in error case.
	 */
	public static EObjectCondition hasEqualNameCondition(String name)
	{
		//TODO: This should be extended to call the getName method instead of just checking the name attribute
		EObjectCondition equalNameCondition = null;
		try
		{
			String oclStatement = "self." + DataPackage.eINSTANCE.getInformationObject_Name().getName()  + " = '" + name + "'";
			
			equalNameCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( getOclEnvironment(),
																						oclStatement,
																						DataPackage.eINSTANCE.getInformationObject());
			
		}
		catch (ParserException e)
		{
			//e.printStackTrace();
			//log("Exception while creating equal name condition for name " + name + " (" + e.getMessage() + ")", LogService.LOG_WARNING);
			return null;
		}
	
		return equalNameCondition;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#delete()
	 */
	@Override
	public void delete() {
		
		// now delete depending referenced objects
		EList<EReference> references = this.eClass().getEAllReferences();
		
		Set<Object> allReferencedObjects = new HashSet<Object>();
		
		for(EReference reference : references)
		{
			Object referencedObject = this.eGet(reference);
		
			if(referencedObject == null)
			{
				continue;
			}
			
			deleteReferencedObject(referencedObject);
			
			
			if(referencedObject instanceof EList<?>)
			{
				EList<?> listReference = (EList<?>) referencedObject;
				
				// keep objects in the list for later deletion
				for(Object object : listReference)
				{
					allReferencedObjects.add(object);
				}
				
			}
		}	
		
		for(Object object : allReferencedObjects)
		{
			deleteReferencedObject(object);
		}
		
		// delete this
		super.delete();
				
		
	}
	
	/**
	 * Used for recursive delete, if the referenced object is from an type that
	 * could not exist without this object it will also be deleted.
	 * 
	 * @param referencedObject Referenced object
	 */
	private void deleteReferencedObject(Object referencedObject)
	{
		if(referencedObject instanceof Identifier)
		{
			// delete all identifiers
			((Identifier)referencedObject).delete();
		}
		else if(referencedObject instanceof Attachment)
		{
			// delete all attachements
			((Attachment)referencedObject).delete();
		}
		else if(referencedObject instanceof Connection)
		{
			// delete all connections
			((Connection)referencedObject).delete();
		}
		else if(referencedObject instanceof Ranking)
		{
			// delete all rankings
			((Ranking)referencedObject).delete();
		}
		
		// Classifications are expilcitly not deleted
		// Metainformations are explicitly not deleted
		// Information Objects are explicitly not deleted
	}
	
} //InformationObjectImpl
