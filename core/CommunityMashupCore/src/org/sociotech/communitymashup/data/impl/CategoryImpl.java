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

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.ocl.conditions.BooleanOCLCondition;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.ocl.ParserException;
import org.sociotech.communitymashup.data.Attachment;
import org.sociotech.communitymashup.data.Binary;
import org.sociotech.communitymashup.data.Category;
import org.sociotech.communitymashup.data.Classification;
import org.sociotech.communitymashup.data.Connection;
import org.sociotech.communitymashup.data.Content;
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
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.impl.CategoryImpl#getCategorized <em>Categorized</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.CategoryImpl#getParentCategory <em>Parent Category</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.CategoryImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.CategoryImpl#getMainCategorized <em>Main Categorized</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends ClassificationImpl implements Category {
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";
	/**
	 * The cached value of the '{@link #getCategorized() <em>Categorized</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorized()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationObject> categorized;
	/**
	 * The cached value of the '{@link #getParentCategory() <em>Parent Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentCategory()
	 * @generated
	 * @ordered
	 */
	protected Category parentCategory;
	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	
	/**
	 * Reference to Singleton <b>is main category</b> condition. 
	 */
	private static EObjectCondition isMainCategoryCondition = null;
	
	protected EList<Category> categories;
	/**
	 * The cached value of the '{@link #getMainCategorized() <em>Main Categorized</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainCategorized()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationObject> mainCategorized;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationObject> getCategorized() {
		if (categorized == null) {
			categorized = new EObjectWithInverseResolvingEList.ManyInverse<InformationObject>(InformationObject.class, this, DataPackage.CATEGORY__CATEGORIZED, DataPackage.INFORMATION_OBJECT__CATEGORIES);
		}
		return categorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getParentCategory() {
		if (parentCategory != null && parentCategory.eIsProxy()) {
			InternalEObject oldParentCategory = (InternalEObject)parentCategory;
			parentCategory = (Category)eResolveProxy(oldParentCategory);
			if (parentCategory != oldParentCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.CATEGORY__PARENT_CATEGORY, oldParentCategory, parentCategory));
			}
		}
		return parentCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetParentCategory() {
		return parentCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentCategory(Category newParentCategory, NotificationChain msgs) {
		Category oldParentCategory = parentCategory;
		parentCategory = newParentCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY__PARENT_CATEGORY, oldParentCategory, newParentCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentCategory(Category newParentCategory) {
		if (newParentCategory != parentCategory) {
			NotificationChain msgs = null;
			if (parentCategory != null)
				msgs = ((InternalEObject)parentCategory).eInverseRemove(this, DataPackage.CATEGORY__CATEGORIES, Category.class, msgs);
			if (newParentCategory != null)
				msgs = ((InternalEObject)newParentCategory).eInverseAdd(this, DataPackage.CATEGORY__CATEGORIES, Category.class, msgs);
			msgs = basicSetParentCategory(newParentCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CATEGORY__PARENT_CATEGORY, newParentCategory, newParentCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectWithInverseResolvingEList<Category>(Category.class, this, DataPackage.CATEGORY__CATEGORIES, DataPackage.CATEGORY__PARENT_CATEGORY);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationObject> getMainCategorized() {
		if (mainCategorized == null) {
			mainCategorized = new EObjectWithInverseResolvingEList<InformationObject>(InformationObject.class, this, DataPackage.CATEGORY__MAIN_CATEGORIZED, DataPackage.INFORMATION_OBJECT__MAIN_CATEGORY);
		}
		return mainCategorized;
	}

	@Override
	public Integer getCount() {
		return this.getCategorized().size();
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
			case DataPackage.CATEGORY__CATEGORIZED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategorized()).basicAdd(otherEnd, msgs);
			case DataPackage.CATEGORY__PARENT_CATEGORY:
				if (parentCategory != null)
					msgs = ((InternalEObject)parentCategory).eInverseRemove(this, DataPackage.CATEGORY__CATEGORIES, Category.class, msgs);
				return basicSetParentCategory((Category)otherEnd, msgs);
			case DataPackage.CATEGORY__CATEGORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategories()).basicAdd(otherEnd, msgs);
			case DataPackage.CATEGORY__MAIN_CATEGORIZED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMainCategorized()).basicAdd(otherEnd, msgs);
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
			case DataPackage.CATEGORY__CATEGORIZED:
				return ((InternalEList<?>)getCategorized()).basicRemove(otherEnd, msgs);
			case DataPackage.CATEGORY__PARENT_CATEGORY:
				return basicSetParentCategory(null, msgs);
			case DataPackage.CATEGORY__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case DataPackage.CATEGORY__MAIN_CATEGORIZED:
				return ((InternalEList<?>)getMainCategorized()).basicRemove(otherEnd, msgs);
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
			case DataPackage.CATEGORY__CATEGORIZED:
				return getCategorized();
			case DataPackage.CATEGORY__PARENT_CATEGORY:
				if (resolve) return getParentCategory();
				return basicGetParentCategory();
			case DataPackage.CATEGORY__CATEGORIES:
				return getCategories();
			case DataPackage.CATEGORY__MAIN_CATEGORIZED:
				return getMainCategorized();
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
			case DataPackage.CATEGORY__CATEGORIZED:
				getCategorized().clear();
				getCategorized().addAll((Collection<? extends InformationObject>)newValue);
				return;
			case DataPackage.CATEGORY__PARENT_CATEGORY:
				setParentCategory((Category)newValue);
				return;
			case DataPackage.CATEGORY__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case DataPackage.CATEGORY__MAIN_CATEGORIZED:
				getMainCategorized().clear();
				getMainCategorized().addAll((Collection<? extends InformationObject>)newValue);
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
			case DataPackage.CATEGORY__CATEGORIZED:
				getCategorized().clear();
				return;
			case DataPackage.CATEGORY__PARENT_CATEGORY:
				setParentCategory((Category)null);
				return;
			case DataPackage.CATEGORY__CATEGORIES:
				getCategories().clear();
				return;
			case DataPackage.CATEGORY__MAIN_CATEGORIZED:
				getMainCategorized().clear();
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
			case DataPackage.CATEGORY__CATEGORIZED:
				return categorized != null && !categorized.isEmpty();
			case DataPackage.CATEGORY__PARENT_CATEGORY:
				return parentCategory != null;
			case DataPackage.CATEGORY__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case DataPackage.CATEGORY__MAIN_CATEGORIZED:
				return mainCategorized != null && !mainCategorized.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type Category.
	 * 
	 * @return An EObjectCondition whether the Object is of the type Category.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(DataPackageImpl.eINSTANCE.getCategory());
	}

	/**
	 * REST
	 * @generated
	 */
	@Override
	protected Object getFeature(String featureName) throws UnknownOperationException {
		if ( featureName.equalsIgnoreCase("categorized") )
			return this.getCategorized();		
		if ( featureName.equalsIgnoreCase("parentCategory") )
			return this.getParentCategory();		
		if ( featureName.equalsIgnoreCase("categories") )
			return this.getCategories();		
		if ( featureName.equalsIgnoreCase("mainCategorized") )
			return this.getMainCategorized();			
		return super.getFeature(featureName); 
	}

	/**
	 * REST
	 * @generated
	 */
	@Override
	protected Object setFeature(String featureName, Object value) throws WrongArgException, UnknownOperationException {
		if ( featureName.equalsIgnoreCase("parentCategory") ) {
				org.sociotech.communitymashup.data.Category fparentCategory = null;
				try {
					try {
						fparentCategory = (org.sociotech.communitymashup.data.Category)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fparentCategory = (org.sociotech.communitymashup.data.Category)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Category.setFeature", "org.sociotech.communitymashup.data.Category",value.getClass().getName());
				}
				this.setParentCategory(fparentCategory);
			return this;
			}			
		super.setFeature(featureName, value);
		return this; 
	}

	/**
	 * REST
	 * @generated
	 */
	@Override 
	protected Object doOperation(RestCommand command) throws WrongArgException, WrongArgCountException, UnknownOperationException, ArgNotFoundException {	
		return super.doOperation(command);
	}

	/**
	 * This method can be used to recursively and generically call the Getter, Setters and Operations of the generated classes.
	 * 
	 * @param input The commands to be processed.
	 * @param requestType The HTTP-Request method.
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

	@SuppressWarnings("unchecked")
	@Override
	public EList<Content> getContents() {
		// cast is allowed cause of type condition
		return (EList<Content>)getCategorizedObjectsMatchingCondition(Content.isTypeCondition);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getPersons() {
		// cast is allowed cause of type condition
		return (EList<Person>)getCategorizedObjectsMatchingCondition(Person.isTypeCondition);
	}

	@SuppressWarnings("unchecked")
	@Override
	public EList<Organisation> getOrganisations() {
		// cast is allowed cause of type condition
		return (EList<Organisation>)getCategorizedObjectsMatchingCondition(Organisation.isTypeCondition);
	}
	
	@SuppressWarnings("unchecked")
	private EList<? extends InformationObject> getCategorizedObjectsMatchingCondition(EObjectCondition condition)
	{
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getCategorized(), condition);
		
		if(result == null)
		{
			return null;
		}
		
		// results are only information objects
		return new BasicEList<InformationObject>((Collection<? extends InformationObject>) result.getEObjects());
	}
	
	/**
	 * Returns the condition to evaluate if a classification is a main classification.
	 * 
	 * @return The condition to evaluate if a classification is a main classification, null in error case.
	 */
	public static EObjectCondition isMainCategoryCondition()
	{
		if(isMainCategoryCondition == null)
		{
			// condition will be created at first use
			try
			{
				// main category has no parent category
				String oclStatement = "self." + DataPackage.eINSTANCE.getCategory_ParentCategory().getName() + ".oclIsUndefined()";
				
				//System.out.println("OCL Statement: " + oclStatement);
				
				isMainCategoryCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( getOclEnvironment(),
																								oclStatement,
																							    DataPackage.eINSTANCE.getCategory());
				
			}
			catch (ParserException e)
			{
				e.printStackTrace();
				return null;
			}
		}
		
		return isMainCategoryCondition;
	}
	
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#isEqualItem(org.sociotech.communitymashup.data.Item)
	 */
	@Override
	public Boolean isEqualItem(Item item) {
		if(!(item instanceof CategoryImpl))
		{
			return false;
		}
		
		return this.getName().equals(((CategoryImpl)item).getName());
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.Item#canHaveEqualItem()
	 */
	@Override
	public boolean canHaveEqualItem() {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#deleteIfUnused()
	 */
	@Override
	protected void deleteIfUnused() {
		// check if no more objects are categorize, main categorized or this category is in a hierarchy
		if(this.getCategorized().isEmpty() && this.getMainCategorized().isEmpty() && this.getParentCategory() == null && this.getCategories().isEmpty())
		{
			this.delete();
		}
	}
	
	
} //CategoryImpl
