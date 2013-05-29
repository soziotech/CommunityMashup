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
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.Attachment;
import org.sociotech.communitymashup.data.Binary;
import org.sociotech.communitymashup.data.Category;
import org.sociotech.communitymashup.data.Classification;
import org.sociotech.communitymashup.data.Connection;
import org.sociotech.communitymashup.data.Content;
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
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.RestUtil;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.impl.MetaTagImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.MetaTagImpl#getMetaTagged <em>Meta Tagged</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaTagImpl extends ItemImpl implements MetaTag {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";
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
	 * The cached value of the '{@link #getMetaTagged() <em>Meta Tagged</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaTagged()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> metaTagged;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaTagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.META_TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getMetaTagged() {
		if (metaTagged == null) {
			metaTagged = new EObjectWithInverseResolvingEList.ManyInverse<Item>(Item.class, this, DataPackage.META_TAG__META_TAGGED, DataPackage.ITEM__META_TAGS);
		}
		return metaTagged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebAccount> getWebAccounts() {
		// Check if input is defined
		if(getMetaTagged() == null) {
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
	
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getMetaTagged(), oclCondition.AND(WebAccount.isTypeCondition));

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
	public EList<InformationObject> getInformationObjects() {
		// Check if input is defined
		if(getMetaTagged() == null) {
			return null;
		}
		
		EObjectCondition oclCondition = null;
		String oclStatement = "true";
		try {
			oclCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( 	getOclEnvironment(),
																					oclStatement,
																					DataPackageImpl.eINSTANCE.getInformationObject());		
		}
		catch (ParserException e) {
			log("Malformed ocl statement: " + oclStatement + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return null;
		}
	
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getMetaTagged(), oclCondition.AND(InformationObject.isTypeCondition));

		if(result == null) {
			return new BasicEList<InformationObject>();
		}
		
		// results are only InformationObjects
		@SuppressWarnings("unchecked")
		EList<InformationObject> objects = new BasicEList<InformationObject>((Collection<? extends InformationObject>) result.getEObjects());
		
		return objects;	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		// Check if input is defined
		if(getMetaTagged() == null) {
			return null;
		}
		
		EObjectCondition oclCondition = null;
		String oclStatement = "true";
		try {
			oclCondition = new BooleanOCLCondition<EClassifier, EClass, EObject>( 	getOclEnvironment(),
																					oclStatement,
																					DataPackageImpl.eINSTANCE.getExtension());		
		}
		catch (ParserException e) {
			log("Malformed ocl statement: " + oclStatement + " (" + e.getMessage() + ")", LogService.LOG_ERROR);
			return null;
		}
	
		IQueryResult result = DataPackageImpl.filterItemsMatchingCondition(getMetaTagged(), oclCondition.AND(Extension.isTypeCondition));

		if(result == null) {
			return new BasicEList<Extension>();
		}
		
		// results are only Extensions
		@SuppressWarnings("unchecked")
		EList<Extension> objects = new BasicEList<Extension>((Collection<? extends Extension>) result.getEObjects());
		
		return objects;	
	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Integer getCount() {
		return this.getMetaTagged().size();				
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Integer getInformationObjectsCount() {
		
		EList<InformationObject> iOs = getInformationObjects();
		
		if(iOs != null)
		{
			return iOs.size();
		}
		
		return 0;
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
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.META_TAG__NAME, oldName, name));
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
			case DataPackage.META_TAG__META_TAGGED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMetaTagged()).basicAdd(otherEnd, msgs);
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
			case DataPackage.META_TAG__META_TAGGED:
				return ((InternalEList<?>)getMetaTagged()).basicRemove(otherEnd, msgs);
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
			case DataPackage.META_TAG__NAME:
				return getName();
			case DataPackage.META_TAG__META_TAGGED:
				return getMetaTagged();
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
			case DataPackage.META_TAG__NAME:
				setName((String)newValue);
				return;
			case DataPackage.META_TAG__META_TAGGED:
				getMetaTagged().clear();
				getMetaTagged().addAll((Collection<? extends Item>)newValue);
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
			case DataPackage.META_TAG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.META_TAG__META_TAGGED:
				getMetaTagged().clear();
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
			case DataPackage.META_TAG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.META_TAG__META_TAGGED:
				return metaTagged != null && !metaTagged.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type MetaTag.
	 * 
	 * @return An EObjectCondition whether the Object is of the type MetaTag.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(DataPackageImpl.eINSTANCE.getMetaTag());
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
		if ( featureName.equalsIgnoreCase("name") )
			return this.getName();		
		if ( featureName.equalsIgnoreCase("metaTagged") )
			return this.getMetaTagged();			
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
					throw new WrongArgException("MetaTag.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setName(fname);
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
		if ( command.getCommand().equalsIgnoreCase("getWebAccounts")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("MetaTag.doOperation", 0, command.getArgCount()); 
			return this.getWebAccounts();
		}
		if ( command.getCommand().equalsIgnoreCase("getInformationObjects")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("MetaTag.doOperation", 0, command.getArgCount()); 
			return this.getInformationObjects();
		}
		if ( command.getCommand().equalsIgnoreCase("getExtensions")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("MetaTag.doOperation", 0, command.getArgCount()); 
			return this.getExtensions();
		}
		if ( command.getCommand().equalsIgnoreCase("getCount")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("MetaTag.doOperation", 0, command.getArgCount()); 
			return this.getCount();
		}
		if ( command.getCommand().equalsIgnoreCase("getInformationObjectsCount")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("MetaTag.doOperation", 0, command.getArgCount()); 
			return this.getInformationObjectsCount();
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
			if (o instanceof List) {
				return RestUtil.listProcess((List<?>) o, input, requestType);
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#deleteIfUnused()
	 */
	@Override
	protected void deleteIfUnused() {
		// check if no more objects are meta-tagged and then delete this tag
		if(this.getMetaTagged().isEmpty())
		{
			this.delete();
		}
	}
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#isEqualItem(org.sociotech.communitymashup.data.Item)
	 */
	@Override
	public Boolean isEqualItem(Item item) {
		if(super.isEqualItem(item))
		{
			return true;
		}
		
		if(this == item)
		{
			return true;
		}
		else if (item == null)
		{
			return false;
		}
		else if (this.eClass() != item.eClass())
		{
			return false;
		}
		
		// given item is a meta tag
		MetaTag metaTag = (MetaTag) item;
		
		if(this.getName() == null)
		{
			// name must be defined
			return false;
		}
		
		return this.getName().equalsIgnoreCase(metaTag.getName());
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#canHaveEqualItem()
	 */
	@Override
	public boolean canHaveEqualItem() {
		return true;
	}
	
} //MetaTagImpl
