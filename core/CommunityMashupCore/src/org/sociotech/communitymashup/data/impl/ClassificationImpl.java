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

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
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
 * An implementation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.impl.ClassificationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassificationImpl extends ItemImpl implements Classification {
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

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#getStringValue()
	 */
	@Override
	public String getStringValue()
	{
		
		if(super.getStringValue() != null)
		{
			return super.getStringValue();
		}
		
		if(name == null)
		{
			return null;
		}
		
		// make name to lower case and return it
		return name.toLowerCase();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.CLASSIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.CLASSIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the classified content.
	 * 
	 * @return A list of the classified content, null in error case.
	 * <!-- end-user-doc -->
	 */
	public abstract EList<Content> getContents();
		
	/**
	 * <!-- begin-user-doc -->
	 * Returns the classified persons.
	 * 
	 * @return A list of the classified persons, null in error case.
	 * <!-- end-user-doc -->
	 */
	public abstract EList<Person> getPersons();
	
	/**
	 * <!-- begin-user-doc -->
	 * Returns the classified organisations.
	 * 
	 * @return A list of the classified organisations, null in error case.
	 * <!-- end-user-doc -->
	 */
	public abstract EList<Organisation> getOrganisations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public abstract Integer getCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Integer getPersonsCount() {
		EList<Person> persons = this.getPersons();
		
		if(persons == null)
		{
			return 0;
		}
		return persons.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Integer getContentsCount() {
		EList<Content> contents = this.getContents();
		
		if(contents == null)
		{
			return 0;
		}
		return contents.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Integer getOrganisationsCount() {
		EList<Organisation> organisations = this.getOrganisations();
		
		if(organisations == null)
		{
			return 0;
		}
		return organisations.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getSlug() {
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
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.CLASSIFICATION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.CLASSIFICATION__NAME:
				setName((String)newValue);
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
			case DataPackage.CLASSIFICATION__NAME:
				setName(NAME_EDEFAULT);
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
			case DataPackage.CLASSIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
			case DataPackage.CLASSIFICATION___GET_PERSONS:
				return getPersons();
			case DataPackage.CLASSIFICATION___GET_CONTENTS:
				return getContents();
			case DataPackage.CLASSIFICATION___GET_ORGANISATIONS:
				return getOrganisations();
			case DataPackage.CLASSIFICATION___GET_COUNT:
				return getCount();
			case DataPackage.CLASSIFICATION___GET_PERSONS_COUNT:
				return getPersonsCount();
			case DataPackage.CLASSIFICATION___GET_CONTENTS_COUNT:
				return getContentsCount();
			case DataPackage.CLASSIFICATION___GET_ORGANISATIONS_COUNT:
				return getOrganisationsCount();
			case DataPackage.CLASSIFICATION___GET_SLUG:
				return getSlug();
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
		result.append(')');
		return result.toString();
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type Classification.
	 * 
	 * @return An EObjectCondition whether the Object is of the type Classification.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		EObjectCondition result = new EObjectTypeRelationCondition(DataPackageImpl.eINSTANCE.getClassification());
		return result.OR(Category.isTypeCondition).OR(Tag.isTypeCondition);
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
					throw new WrongArgException("Classification.setFeature", "java.lang.String",value.getClass().getName());
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
		if ( command.getCommand().equalsIgnoreCase("getPersons")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Classification.doOperation", 0, command.getArgCount()); 
			return this.getPersons();
		}
		if ( command.getCommand().equalsIgnoreCase("getContents")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Classification.doOperation", 0, command.getArgCount()); 
			return this.getContents();
		}
		if ( command.getCommand().equalsIgnoreCase("getOrganisations")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Classification.doOperation", 0, command.getArgCount()); 
			return this.getOrganisations();
		}
		if ( command.getCommand().equalsIgnoreCase("getCount")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Classification.doOperation", 0, command.getArgCount()); 
			return this.getCount();
		}
		if ( command.getCommand().equalsIgnoreCase("getPersonsCount")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Classification.doOperation", 0, command.getArgCount()); 
			return this.getPersonsCount();
		}
		if ( command.getCommand().equalsIgnoreCase("getContentsCount")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Classification.doOperation", 0, command.getArgCount()); 
			return this.getContentsCount();
		}
		if ( command.getCommand().equalsIgnoreCase("getOrganisationsCount")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Classification.doOperation", 0, command.getArgCount()); 
			return this.getOrganisationsCount();
		}
		if ( command.getCommand().equalsIgnoreCase("getSlug")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Classification.doOperation", 0, command.getArgCount()); 
			return this.getSlug();
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
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Item compareItem) {
		
		if (!(compareItem instanceof Classification)) {
			return super.compareTo(compareItem);
		}
		
		Classification compareClassification = (Classification) compareItem;
		
		if(this.getName() == null && compareClassification.getName() == null)
		{
			return 0;
		}
		if(this.getName() != null && compareClassification.getName() == null)
		{
			return 1;
		}
		if(this.getName() == null && compareClassification.getName() != null)
		{
			return -1;
		}
		return this.getName().compareTo(compareClassification.getName());
	}
	
} //ClassificationImpl
