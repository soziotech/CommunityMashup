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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
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
 * An implementation of the model object '<em><b>Phone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PhoneImpl#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PhoneImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PhoneImpl#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhoneImpl extends MetaInformationImpl implements Phone {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";
	/**
	 * The default value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected String areaCode = AREA_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected String countryCode = COUNTRY_CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.PHONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAreaCode() {
		return areaCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAreaCode(String newAreaCode) {
		String oldAreaCode = areaCode;
		areaCode = newAreaCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PHONE__AREA_CODE, oldAreaCode, areaCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryCode(String newCountryCode) {
		String oldCountryCode = countryCode;
		countryCode = newCountryCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PHONE__COUNTRY_CODE, oldCountryCode, countryCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PHONE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataPackage.PHONE__AREA_CODE:
				return getAreaCode();
			case DataPackage.PHONE__COUNTRY_CODE:
				return getCountryCode();
			case DataPackage.PHONE__NUMBER:
				return getNumber();
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
			case DataPackage.PHONE__AREA_CODE:
				setAreaCode((String)newValue);
				return;
			case DataPackage.PHONE__COUNTRY_CODE:
				setCountryCode((String)newValue);
				return;
			case DataPackage.PHONE__NUMBER:
				setNumber((String)newValue);
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
			case DataPackage.PHONE__AREA_CODE:
				setAreaCode(AREA_CODE_EDEFAULT);
				return;
			case DataPackage.PHONE__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
				return;
			case DataPackage.PHONE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
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
			case DataPackage.PHONE__AREA_CODE:
				return AREA_CODE_EDEFAULT == null ? areaCode != null : !AREA_CODE_EDEFAULT.equals(areaCode);
			case DataPackage.PHONE__COUNTRY_CODE:
				return COUNTRY_CODE_EDEFAULT == null ? countryCode != null : !COUNTRY_CODE_EDEFAULT.equals(countryCode);
			case DataPackage.PHONE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
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
		result.append(" (areaCode: ");
		result.append(areaCode);
		result.append(", countryCode: ");
		result.append(countryCode);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type Phone.
	 * 
	 * @return An EObjectCondition whether the Object is of the type Phone.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(DataPackageImpl.eINSTANCE.getPhone());
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
		if ( featureName.equalsIgnoreCase("areaCode") )
			return this.getAreaCode();		
		if ( featureName.equalsIgnoreCase("countryCode") )
			return this.getCountryCode();		
		if ( featureName.equalsIgnoreCase("number") )
			return this.getNumber();			
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
		if ( featureName.equalsIgnoreCase("areaCode") ) {
				java.lang.String fareaCode = null;
				try {
					fareaCode = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Phone.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setAreaCode(fareaCode);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("countryCode") ) {
				java.lang.String fcountryCode = null;
				try {
					fcountryCode = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Phone.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setCountryCode(fcountryCode);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("number") ) {
				java.lang.String fnumber = null;
				try {
					fnumber = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Phone.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setNumber(fnumber);
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
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#isEqualItem(org.sociotech.communitymashup.data.Item)
	 */
	@Override
	public Boolean isEqualItem(Item item) {

		if(!(item instanceof WebSiteImpl))
		{
			return false;
		}
		
		Phone comparePhone = (Phone) item;
		
		if(this.number == null && comparePhone.getNumber() == null)
		{
			// both are null
			return true;
		}
		
		if(this.number == null || comparePhone.getNumber() == null)
		{
			// only one of them is null
			return false;
		}
		
		// compare numbers ignoring case
		return this.number.equalsIgnoreCase(comparePhone.getNumber());
	}
} //PhoneImpl
