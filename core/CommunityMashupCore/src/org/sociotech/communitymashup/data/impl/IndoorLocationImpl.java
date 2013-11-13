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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
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
 * An implementation of the model object '<em><b>Indoor Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.impl.IndoorLocationImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.IndoorLocationImpl#getParentIndoorLocation <em>Parent Indoor Location</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.IndoorLocationImpl#getIndoorLocations <em>Indoor Locations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.IndoorLocationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndoorLocationImpl extends MetaInformationImpl implements IndoorLocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getParentIndoorLocation() <em>Parent Indoor Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentIndoorLocation()
	 * @generated
	 * @ordered
	 */
	protected IndoorLocation parentIndoorLocation;

	/**
	 * The cached value of the '{@link #getIndoorLocations() <em>Indoor Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndoorLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<IndoorLocation> indoorLocations;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndoorLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.INDOOR_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.INDOOR_LOCATION__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.INDOOR_LOCATION__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, DataPackage.LOCATION__INDOOR_LOCATIONS, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, DataPackage.LOCATION__INDOOR_LOCATIONS, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.INDOOR_LOCATION__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndoorLocation getParentIndoorLocation() {
		if (parentIndoorLocation != null && parentIndoorLocation.eIsProxy()) {
			InternalEObject oldParentIndoorLocation = (InternalEObject)parentIndoorLocation;
			parentIndoorLocation = (IndoorLocation)eResolveProxy(oldParentIndoorLocation);
			if (parentIndoorLocation != oldParentIndoorLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.INDOOR_LOCATION__PARENT_INDOOR_LOCATION, oldParentIndoorLocation, parentIndoorLocation));
			}
		}
		return parentIndoorLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndoorLocation basicGetParentIndoorLocation() {
		return parentIndoorLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentIndoorLocation(IndoorLocation newParentIndoorLocation, NotificationChain msgs) {
		IndoorLocation oldParentIndoorLocation = parentIndoorLocation;
		parentIndoorLocation = newParentIndoorLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.INDOOR_LOCATION__PARENT_INDOOR_LOCATION, oldParentIndoorLocation, newParentIndoorLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentIndoorLocation(IndoorLocation newParentIndoorLocation) {
		if (newParentIndoorLocation != parentIndoorLocation) {
			NotificationChain msgs = null;
			if (parentIndoorLocation != null)
				msgs = ((InternalEObject)parentIndoorLocation).eInverseRemove(this, DataPackage.INDOOR_LOCATION__INDOOR_LOCATIONS, IndoorLocation.class, msgs);
			if (newParentIndoorLocation != null)
				msgs = ((InternalEObject)newParentIndoorLocation).eInverseAdd(this, DataPackage.INDOOR_LOCATION__INDOOR_LOCATIONS, IndoorLocation.class, msgs);
			msgs = basicSetParentIndoorLocation(newParentIndoorLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.INDOOR_LOCATION__PARENT_INDOOR_LOCATION, newParentIndoorLocation, newParentIndoorLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndoorLocation> getIndoorLocations() {
		if (indoorLocations == null) {
			indoorLocations = new EObjectWithInverseResolvingEList<IndoorLocation>(IndoorLocation.class, this, DataPackage.INDOOR_LOCATION__INDOOR_LOCATIONS, DataPackage.INDOOR_LOCATION__PARENT_INDOOR_LOCATION);
		}
		return indoorLocations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.INDOOR_LOCATION__NAME, oldName, name));
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
			case DataPackage.INDOOR_LOCATION__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, DataPackage.LOCATION__INDOOR_LOCATIONS, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
			case DataPackage.INDOOR_LOCATION__PARENT_INDOOR_LOCATION:
				if (parentIndoorLocation != null)
					msgs = ((InternalEObject)parentIndoorLocation).eInverseRemove(this, DataPackage.INDOOR_LOCATION__INDOOR_LOCATIONS, IndoorLocation.class, msgs);
				return basicSetParentIndoorLocation((IndoorLocation)otherEnd, msgs);
			case DataPackage.INDOOR_LOCATION__INDOOR_LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIndoorLocations()).basicAdd(otherEnd, msgs);
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
			case DataPackage.INDOOR_LOCATION__LOCATION:
				return basicSetLocation(null, msgs);
			case DataPackage.INDOOR_LOCATION__PARENT_INDOOR_LOCATION:
				return basicSetParentIndoorLocation(null, msgs);
			case DataPackage.INDOOR_LOCATION__INDOOR_LOCATIONS:
				return ((InternalEList<?>)getIndoorLocations()).basicRemove(otherEnd, msgs);
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
			case DataPackage.INDOOR_LOCATION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case DataPackage.INDOOR_LOCATION__PARENT_INDOOR_LOCATION:
				if (resolve) return getParentIndoorLocation();
				return basicGetParentIndoorLocation();
			case DataPackage.INDOOR_LOCATION__INDOOR_LOCATIONS:
				return getIndoorLocations();
			case DataPackage.INDOOR_LOCATION__NAME:
				return getName();
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
			case DataPackage.INDOOR_LOCATION__LOCATION:
				setLocation((Location)newValue);
				return;
			case DataPackage.INDOOR_LOCATION__PARENT_INDOOR_LOCATION:
				setParentIndoorLocation((IndoorLocation)newValue);
				return;
			case DataPackage.INDOOR_LOCATION__INDOOR_LOCATIONS:
				getIndoorLocations().clear();
				getIndoorLocations().addAll((Collection<? extends IndoorLocation>)newValue);
				return;
			case DataPackage.INDOOR_LOCATION__NAME:
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
			case DataPackage.INDOOR_LOCATION__LOCATION:
				setLocation((Location)null);
				return;
			case DataPackage.INDOOR_LOCATION__PARENT_INDOOR_LOCATION:
				setParentIndoorLocation((IndoorLocation)null);
				return;
			case DataPackage.INDOOR_LOCATION__INDOOR_LOCATIONS:
				getIndoorLocations().clear();
				return;
			case DataPackage.INDOOR_LOCATION__NAME:
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
			case DataPackage.INDOOR_LOCATION__LOCATION:
				return location != null;
			case DataPackage.INDOOR_LOCATION__PARENT_INDOOR_LOCATION:
				return parentIndoorLocation != null;
			case DataPackage.INDOOR_LOCATION__INDOOR_LOCATIONS:
				return indoorLocations != null && !indoorLocations.isEmpty();
			case DataPackage.INDOOR_LOCATION__NAME:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type IndoorLocation.
	 * 
	 * @return An EObjectCondition whether the Object is of the type IndoorLocation.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(DataPackageImpl.eINSTANCE.getIndoorLocation());
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
		if ( featureName.equalsIgnoreCase("location") )
			return this.getLocation();		
		if ( featureName.equalsIgnoreCase("parentIndoorLocation") )
			return this.getParentIndoorLocation();		
		if ( featureName.equalsIgnoreCase("indoorLocations") )
			return this.getIndoorLocations();		
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
		if ( featureName.equalsIgnoreCase("location") ) {
				org.sociotech.communitymashup.data.Location flocation = null;
				try {
					try {
						flocation = (org.sociotech.communitymashup.data.Location)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						flocation = (org.sociotech.communitymashup.data.Location)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("IndoorLocation.setFeature", "org.sociotech.communitymashup.data.Location",value.getClass().getName());
				}
				this.setLocation(flocation);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("parentIndoorLocation") ) {
				org.sociotech.communitymashup.data.IndoorLocation fparentIndoorLocation = null;
				try {
					try {
						fparentIndoorLocation = (org.sociotech.communitymashup.data.IndoorLocation)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fparentIndoorLocation = (org.sociotech.communitymashup.data.IndoorLocation)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("IndoorLocation.setFeature", "org.sociotech.communitymashup.data.IndoorLocation",value.getClass().getName());
				}
				this.setParentIndoorLocation(fparentIndoorLocation);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("name") ) {
				java.lang.String fname = null;
				try {
					fname = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("IndoorLocation.setFeature", "java.lang.String",value.getClass().getName());
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
	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.MetaInformationImpl#deleteIfUnused()
	 */
	@Override
	protected void deleteIfUnused() {
		if(getInformationObjects().isEmpty() && getIndoorLocations().isEmpty() && getLocation() == null)
		{
			// delete if no more information objects are extended and no location connected and not in an hierarchy
			this.delete();
		}
	}
} //IndoorLocationImpl
