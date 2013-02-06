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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
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
import org.sociotech.communitymashup.application.XMLFile;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.RestUtil;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.impl.PropertyImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.PropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.PropertyImpl#getHidden <em>Hidden</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.PropertyImpl#getChangeable <em>Changeable</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.PropertyImpl#getPossibleValues <em>Possible Values</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.PropertyImpl#getHelpText <em>Help Text</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.PropertyImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.PropertyImpl#getPropertyType <em>Property Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property {
	private static final String VALUE_RANGE_SEPARATOR = "..";

	private static final String VALUE_LIST_SEPARATOR = ",";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHidden()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HIDDEN_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getHidden() <em>Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHidden()
	 * @generated
	 * @ordered
	 */
	protected Boolean hidden = HIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CHANGEABLE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeable()
	 * @generated
	 * @ordered
	 */
	protected Boolean changeable = CHANGEABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPossibleValues() <em>Possible Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleValues()
	 * @generated
	 * @ordered
	 */
	protected static final String POSSIBLE_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPossibleValues() <em>Possible Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibleValues()
	 * @generated
	 * @ordered
	 */
	protected String possibleValues = POSSIBLE_VALUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHelpText() <em>Help Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpText()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelpText() <em>Help Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpText()
	 * @generated
	 * @ordered
	 */
	protected String helpText = HELP_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected Boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyType() <em>Property Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyType()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyTypes PROPERTY_TYPE_EDEFAULT = PropertyTypes.STRING;

	/**
	 * The cached value of the '{@link #getPropertyType() <em>Property Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyType()
	 * @generated
	 * @ordered
	 */
	protected PropertyTypes propertyType = PROPERTY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PROPERTY__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PROPERTY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHidden() {
		return hidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHidden(Boolean newHidden) {
		Boolean oldHidden = hidden;
		hidden = newHidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PROPERTY__HIDDEN, oldHidden, hidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getChangeable() {
		return changeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeable(Boolean newChangeable) {
		Boolean oldChangeable = changeable;
		changeable = newChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PROPERTY__CHANGEABLE, oldChangeable, changeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPossibleValues() {
		return possibleValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPossibleValues(String newPossibleValues) {
		String oldPossibleValues = possibleValues;
		possibleValues = newPossibleValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PROPERTY__POSSIBLE_VALUES, oldPossibleValues, possibleValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHelpText() {
		return helpText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelpText(String newHelpText) {
		String oldHelpText = helpText;
		helpText = newHelpText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PROPERTY__HELP_TEXT, oldHelpText, helpText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(Boolean newRequired) {
		Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PROPERTY__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypes getPropertyType() {
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyType(PropertyTypes newPropertyType) {
		PropertyTypes oldPropertyType = propertyType;
		propertyType = newPropertyType == null ? PROPERTY_TYPE_EDEFAULT : newPropertyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.PROPERTY__PROPERTY_TYPE, oldPropertyType, propertyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValueList() {
		String possVal = getPossibleValues();
		
		if(possVal == null || possVal.isEmpty())
		{
			return false;
		}
		
		if(possVal.contains(VALUE_LIST_SEPARATOR))
		{
			// separated list
			return true;
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isValueRange() {
		String possVal = getPossibleValues();
		
		if(possVal == null || possVal.isEmpty())
		{
			return false;
		}
		
		if(possVal.contains(VALUE_RANGE_SEPARATOR))
		{
			// separated min max values
			return true;
		}
		
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<String> getListOfValues() {
		if(!isValueList())
		{
			return null;
		}
		
		BasicEList<String> valueList = new BasicEList<String>();

		// split values
		String[] singleValues = getPossibleValues().split(VALUE_LIST_SEPARATOR);
		
		// trim and add all values to result list
		for(int i = 0; i < singleValues.length; i++)
		{
			valueList.add(singleValues[i].trim());
		}
		
		return valueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getMinValue() {
		if(!isValueRange())
		{
			return null;
		}
		
		// split values
		String possVal = getPossibleValues();
		String[] singleValues = possVal.split(VALUE_RANGE_SEPARATOR);
		
		if(singleValues.length == 0)
		{
			return null;
		}
		
		if(singleValues.length == 1)
		{
			// only first value is set
			if(possVal.startsWith(singleValues[0]))
			{
				return singleValues[0].trim();
			}
			else
			{
				return null;
			}
		}
		
		// more than one, return the first
		return singleValues[0];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getMaxValue() {
		if(!isValueRange())
		{
			return null;
		}
		
		// split values
		String possVal = getPossibleValues();
		String[] singleValues = possVal.split(VALUE_RANGE_SEPARATOR);
		
		if(singleValues.length == 0)
		{
			return null;
		}
		
		if(singleValues.length == 1)
		{
			// only second value is set
			if(possVal.endsWith(singleValues[0]))
			{
				return singleValues[0].trim();
			}
			else
			{
				return null;
			}
		}
		
		// more than one, return the second
		return singleValues[1];
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.PROPERTY__KEY:
				return getKey();
			case ApplicationPackage.PROPERTY__VALUE:
				return getValue();
			case ApplicationPackage.PROPERTY__HIDDEN:
				return getHidden();
			case ApplicationPackage.PROPERTY__CHANGEABLE:
				return getChangeable();
			case ApplicationPackage.PROPERTY__POSSIBLE_VALUES:
				return getPossibleValues();
			case ApplicationPackage.PROPERTY__HELP_TEXT:
				return getHelpText();
			case ApplicationPackage.PROPERTY__REQUIRED:
				return getRequired();
			case ApplicationPackage.PROPERTY__PROPERTY_TYPE:
				return getPropertyType();
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
			case ApplicationPackage.PROPERTY__KEY:
				setKey((String)newValue);
				return;
			case ApplicationPackage.PROPERTY__VALUE:
				setValue((String)newValue);
				return;
			case ApplicationPackage.PROPERTY__HIDDEN:
				setHidden((Boolean)newValue);
				return;
			case ApplicationPackage.PROPERTY__CHANGEABLE:
				setChangeable((Boolean)newValue);
				return;
			case ApplicationPackage.PROPERTY__POSSIBLE_VALUES:
				setPossibleValues((String)newValue);
				return;
			case ApplicationPackage.PROPERTY__HELP_TEXT:
				setHelpText((String)newValue);
				return;
			case ApplicationPackage.PROPERTY__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case ApplicationPackage.PROPERTY__PROPERTY_TYPE:
				setPropertyType((PropertyTypes)newValue);
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
			case ApplicationPackage.PROPERTY__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case ApplicationPackage.PROPERTY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ApplicationPackage.PROPERTY__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
				return;
			case ApplicationPackage.PROPERTY__CHANGEABLE:
				setChangeable(CHANGEABLE_EDEFAULT);
				return;
			case ApplicationPackage.PROPERTY__POSSIBLE_VALUES:
				setPossibleValues(POSSIBLE_VALUES_EDEFAULT);
				return;
			case ApplicationPackage.PROPERTY__HELP_TEXT:
				setHelpText(HELP_TEXT_EDEFAULT);
				return;
			case ApplicationPackage.PROPERTY__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case ApplicationPackage.PROPERTY__PROPERTY_TYPE:
				setPropertyType(PROPERTY_TYPE_EDEFAULT);
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
			case ApplicationPackage.PROPERTY__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case ApplicationPackage.PROPERTY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ApplicationPackage.PROPERTY__HIDDEN:
				return HIDDEN_EDEFAULT == null ? hidden != null : !HIDDEN_EDEFAULT.equals(hidden);
			case ApplicationPackage.PROPERTY__CHANGEABLE:
				return CHANGEABLE_EDEFAULT == null ? changeable != null : !CHANGEABLE_EDEFAULT.equals(changeable);
			case ApplicationPackage.PROPERTY__POSSIBLE_VALUES:
				return POSSIBLE_VALUES_EDEFAULT == null ? possibleValues != null : !POSSIBLE_VALUES_EDEFAULT.equals(possibleValues);
			case ApplicationPackage.PROPERTY__HELP_TEXT:
				return HELP_TEXT_EDEFAULT == null ? helpText != null : !HELP_TEXT_EDEFAULT.equals(helpText);
			case ApplicationPackage.PROPERTY__REQUIRED:
				return REQUIRED_EDEFAULT == null ? required != null : !REQUIRED_EDEFAULT.equals(required);
			case ApplicationPackage.PROPERTY__PROPERTY_TYPE:
				return propertyType != PROPERTY_TYPE_EDEFAULT;
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
		result.append(" (Key: ");
		result.append(key);
		result.append(", Value: ");
		result.append(value);
		result.append(", hidden: ");
		result.append(hidden);
		result.append(", changeable: ");
		result.append(changeable);
		result.append(", possibleValues: ");
		result.append(possibleValues);
		result.append(", helpText: ");
		result.append(helpText);
		result.append(", required: ");
		result.append(required);
		result.append(", propertyType: ");
		result.append(propertyType);
		result.append(')');
		return result.toString();
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type Property.
	 * 
	 * @return An EObjectCondition whether the Object is of the type Property.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		EObjectCondition result = new EObjectTypeRelationCondition(ApplicationPackageImpl.eINSTANCE.getProperty());
		return result.OR(OCLRestrictedProperty.isTypeCondition);
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
		if ( featureName.equalsIgnoreCase("Key") )
			return this.getKey();		
		if ( featureName.equalsIgnoreCase("Value") )
			return this.getValue();		
		if ( featureName.equalsIgnoreCase("hidden") )
			return this.getHidden();		
		if ( featureName.equalsIgnoreCase("changeable") )
			return this.getChangeable();		
		if ( featureName.equalsIgnoreCase("possibleValues") )
			return this.getPossibleValues();		
		if ( featureName.equalsIgnoreCase("helpText") )
			return this.getHelpText();		
		if ( featureName.equalsIgnoreCase("required") )
			return this.getRequired();		
		if ( featureName.equalsIgnoreCase("propertyType") )
			return this.getPropertyType();		
		throw new UnknownOperationException(this, new RestCommand("get" + featureName)); 
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
		if ( featureName.equalsIgnoreCase("Key") ) {
				java.lang.String fKey = null;
				try {
					fKey = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Property.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setKey(fKey);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("Value") ) {
				java.lang.String fValue = null;
				try {
					fValue = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Property.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setValue(fValue);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("hidden") ) {
				java.lang.Boolean fhidden = null;
				try {
					try {
						fhidden = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fhidden = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Property.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setHidden(fhidden);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("changeable") ) {
				java.lang.Boolean fchangeable = null;
				try {
					try {
						fchangeable = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fchangeable = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Property.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setChangeable(fchangeable);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("possibleValues") ) {
				java.lang.String fpossibleValues = null;
				try {
					fpossibleValues = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Property.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setPossibleValues(fpossibleValues);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("helpText") ) {
				java.lang.String fhelpText = null;
				try {
					fhelpText = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Property.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setHelpText(fhelpText);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("required") ) {
				java.lang.Boolean frequired = null;
				try {
					try {
						frequired = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						frequired = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Property.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setRequired(frequired);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("propertyType") ) {
				org.sociotech.communitymashup.application.PropertyTypes fpropertyType = null;
				try {
					try {
						fpropertyType = (org.sociotech.communitymashup.application.PropertyTypes)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fpropertyType = (org.sociotech.communitymashup.application.PropertyTypes)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Property.setFeature", "org.sociotech.communitymashup.application.PropertyTypes",value.getClass().getName());
				}
				this.setPropertyType(fpropertyType);
			return this;
			}		
	throw new UnknownOperationException(this, new RestCommand("set" + featureName).addArg("value",value));
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
		if ( command.getCommand().equalsIgnoreCase("isValueList")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Property.doOperation", 0, command.getArgCount()); 
			return this.isValueList();
		}
		if ( command.getCommand().equalsIgnoreCase("isValueRange")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Property.doOperation", 0, command.getArgCount()); 
			return this.isValueRange();
		}
		if ( command.getCommand().equalsIgnoreCase("getListOfValues")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Property.doOperation", 0, command.getArgCount()); 
			return this.getListOfValues();
		}
		if ( command.getCommand().equalsIgnoreCase("getMinValue")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Property.doOperation", 0, command.getArgCount()); 
			return this.getMinValue();
		}
		if ( command.getCommand().equalsIgnoreCase("getMaxValue")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Property.doOperation", 0, command.getArgCount()); 
			return this.getMaxValue();
		}
		throw new UnknownOperationException(this, command);
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
			if (o instanceof SourceImpl) {
				return ((Source) o).process(input, requestType);
			}
			if (o instanceof MashupImpl) {
				return ((Mashup) o).process(input, requestType);
			}
			if (o instanceof MappingRuleImpl) {
				return ((MappingRule) o).process(input, requestType);
			}
			if (o instanceof ConfigurationImpl) {
				return ((Configuration) o).process(input, requestType);
			}
			if (o instanceof PersistencyImpl) {
				return ((Persistency) o).process(input, requestType);
			}
			if (o instanceof XMLFileImpl) {
				return ((XMLFile) o).process(input, requestType);
			}
			if (o instanceof DatabaseImpl) {
				return ((Database) o).process(input, requestType);
			}
			if (o instanceof PropertyImpl) {
				return ((Property) o).process(input, requestType);
			}
			if (o instanceof OCLRestrictedPropertyImpl) {
				return ((OCLRestrictedProperty) o).process(input, requestType);
			}
			if (o instanceof MashupContainerImpl) {
				return ((MashupContainer) o).process(input, requestType);
			}
			if (o instanceof InterfaceImpl) {
				return ((Interface) o).process(input, requestType);
			}
			if (o instanceof RESTInterfaceImpl) {
				return ((RESTInterface) o).process(input, requestType);
			}
			if (o instanceof FEEDInterfaceImpl) {
				return ((FEEDInterface) o).process(input, requestType);
			}
			if (o instanceof SecurityImpl) {
				return ((Security) o).process(input, requestType);
			}
			if (o instanceof OAuthConfigImpl) {
				return ((OAuthConfig) o).process(input, requestType);
			}
			if (o instanceof ApplicationKeyConfigImpl) {
				return ((ApplicationKeyConfig) o).process(input, requestType);
			}
			if (o instanceof OAuthClientConfigImpl) {
				return ((OAuthClientConfig) o).process(input, requestType);
			}
			if (o instanceof OAuthAdminImpl) {
				return ((OAuthAdmin) o).process(input, requestType);
			}
			if (o instanceof OAuthClientScopeImpl) {
				return ((OAuthClientScope) o).process(input, requestType);
			}
			if (o instanceof MashupAdminImpl) {
				return ((MashupAdmin) o).process(input, requestType);
			}
			if (o instanceof ConfigurableElementImpl) {
				return ((ConfigurableElement) o).process(input, requestType);
			}
			if (o instanceof List) {
				return RestUtil.listProcess((List<?>) o, input, requestType);
			}
		}
		return null;
	}


} //PropertyImpl
