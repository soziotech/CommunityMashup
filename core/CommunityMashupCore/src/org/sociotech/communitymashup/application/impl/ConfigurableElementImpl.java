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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
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
 * An implementation of the model object '<em><b>Configurable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.impl.ConfigurableElementImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.ConfigurableElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.ConfigurableElementImpl#getConfigurationImage <em>Configuration Image</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.ConfigurableElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.ConfigurableElementImpl#getChangeable <em>Changeable</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.ConfigurableElementImpl#getHidden <em>Hidden</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.ConfigurableElementImpl#getIdent <em>Ident</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConfigurableElementImpl extends EObjectImpl implements ConfigurableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

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
	 * The default value of the '{@link #getConfigurationImage() <em>Configuration Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationImage()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIGURATION_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigurationImage() <em>Configuration Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationImage()
	 * @generated
	 * @ordered
	 */
	protected String configurationImage = CONFIGURATION_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getIdent() <em>Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdent()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdent() <em>Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdent()
	 * @generated
	 * @ordered
	 */
	protected String ident = IDENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.CONFIGURABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Configuration getConfiguration() {
		if(configuration == null)
		{
			// create new configuration
			ApplicationFactory applicationFactory = ApplicationPackage.eINSTANCE.getApplicationFactory();
			this.setConfiguration(applicationFactory.createConfiguration());
		}
		
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Configuration newConfiguration, NotificationChain msgs) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION, newConfiguration, newConfiguration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIGURABLE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigurationImage() {
		return configurationImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationImage(String newConfigurationImage) {
		String oldConfigurationImage = configurationImage;
		configurationImage = newConfigurationImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION_IMAGE, oldConfigurationImage, configurationImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIGURABLE_ELEMENT__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIGURABLE_ELEMENT__CHANGEABLE, oldChangeable, changeable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIGURABLE_ELEMENT__HIDDEN, oldHidden, hidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdent() {
		return ident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdent(String newIdent) {
		String oldIdent = ident;
		ident = newIdent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.CONFIGURABLE_ELEMENT__IDENT, oldIdent, ident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Get configuration property by key. Returns null if Property with key does not exist
	 * <!-- end-user-doc -->
	 */
	public Property getProperty(String key) {
		
		if(key == null)
		{
			return null;
		}
		
		// TODO search with OCL statement
		for(Property p: getConfiguration().getProperties()) {
			if(p.getKey().equals(key))
				return p;
		}			
		
		// Return null if property does not exist
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Adds a new property to the configuration.
	 * <!-- end-user-doc -->
	 */
	public void addProperty(String key, String value) {
		
		// check parameters
		if(key == null || key.isEmpty() || value == null)
		{
			return;
		}
		
		// check if property with key dont exists
		Property property = this.getProperty(key);
		
		if(property == null)
		{
			
			// create new property
			ApplicationFactory applicationFactory = ApplicationPackage.eINSTANCE.getApplicationFactory();
			property = applicationFactory.createProperty();
			property.setKey(key);
			property.setValue(value);
			
			this.getConfiguration().getProperties().add(property);
		}
		else
		{
			// set the value if property already exists 
			property.setValue(value);
		}
	}

	/**
	* <!-- begin-user-doc -->
	 * Adds the given property to the configuration of this source.
	 * <!-- end-user-doc -->
	 */
	public void addProperty(Property property) {
		this.getConfiguration().getProperties().add(property);
	}


	/**
	 * <!-- begin-user-doc -->
	 * 
	 * Calls {@link ConfigurableElementImpl#getProperty(String)} and return value of it.
	 * 
	 * <!-- end-user-doc -->
	 */
	public String getPropertyValue(String key) {
		
		if(getProperty(key) != null)
		{
			return getProperty(key).getValue();
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isPropertyTrue(String key) {
		Property property = this.getProperty(key);
		
		if(property == null || property.getValue() == null)
		{
			// false if property not set
			return false;
		}
		
		if(property.getValue().equalsIgnoreCase("true"))
		{
			// true if property set and is true ignoring the case
			return true;
		}
	
		return false;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	  */
	public String getPropertyValueElseDefault(String key, String defaultValue) {
		String value = this.getPropertyValue(key);
		
		if(value == null)
		{
			// set default if not set
			value = defaultValue;
		}
		
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public boolean isPropertyTrueElseDefault(String key, String defaultValue) {
		Property property = this.getProperty(key);
		String value = defaultValue;
		
		if(property != null && property.getValue() != null)
		{
			// set value
			value = property.getValue();
		}
		
		if(value == null)
		{
			// default null and not set
			return false;
		}
		
		// true if property set and is true ignoring the case
		return value.equalsIgnoreCase("true");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeProperty(String key) {
		Property propertyToRemove = this.getProperty(key);
		
		if(propertyToRemove == null)
		{
			// no property
			return;
		}
		
		// remove property
		this.getConfiguration().getProperties().remove(propertyToRemove);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
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
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION:
				return getConfiguration();
			case ApplicationPackage.CONFIGURABLE_ELEMENT__NAME:
				return getName();
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION_IMAGE:
				return getConfigurationImage();
			case ApplicationPackage.CONFIGURABLE_ELEMENT__DESCRIPTION:
				return getDescription();
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CHANGEABLE:
				return getChangeable();
			case ApplicationPackage.CONFIGURABLE_ELEMENT__HIDDEN:
				return getHidden();
			case ApplicationPackage.CONFIGURABLE_ELEMENT__IDENT:
				return getIdent();
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
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION:
				setConfiguration((Configuration)newValue);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION_IMAGE:
				setConfigurationImage((String)newValue);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CHANGEABLE:
				setChangeable((Boolean)newValue);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__HIDDEN:
				setHidden((Boolean)newValue);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__IDENT:
				setIdent((String)newValue);
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
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION:
				setConfiguration((Configuration)null);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION_IMAGE:
				setConfigurationImage(CONFIGURATION_IMAGE_EDEFAULT);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CHANGEABLE:
				setChangeable(CHANGEABLE_EDEFAULT);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__HIDDEN:
				setHidden(HIDDEN_EDEFAULT);
				return;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__IDENT:
				setIdent(IDENT_EDEFAULT);
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
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION:
				return configuration != null;
			case ApplicationPackage.CONFIGURABLE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CONFIGURATION_IMAGE:
				return CONFIGURATION_IMAGE_EDEFAULT == null ? configurationImage != null : !CONFIGURATION_IMAGE_EDEFAULT.equals(configurationImage);
			case ApplicationPackage.CONFIGURABLE_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApplicationPackage.CONFIGURABLE_ELEMENT__CHANGEABLE:
				return CHANGEABLE_EDEFAULT == null ? changeable != null : !CHANGEABLE_EDEFAULT.equals(changeable);
			case ApplicationPackage.CONFIGURABLE_ELEMENT__HIDDEN:
				return HIDDEN_EDEFAULT == null ? hidden != null : !HIDDEN_EDEFAULT.equals(hidden);
			case ApplicationPackage.CONFIGURABLE_ELEMENT__IDENT:
				return IDENT_EDEFAULT == null ? ident != null : !IDENT_EDEFAULT.equals(ident);
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
		result.append(", configurationImage: ");
		result.append(configurationImage);
		result.append(", description: ");
		result.append(description);
		result.append(", changeable: ");
		result.append(changeable);
		result.append(", hidden: ");
		result.append(hidden);
		result.append(", ident: ");
		result.append(ident);
		result.append(')');
		return result.toString();
	}


	/**
	 * Generates an EObjectCondition to check whether an Object is of the type ConfigurableElement.
	 * 
	 * @return An EObjectCondition whether the Object is of the type ConfigurableElement.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		EObjectCondition result = new EObjectTypeRelationCondition(ApplicationPackageImpl.eINSTANCE.getConfigurableElement());
		return result.OR(Source.isTypeCondition).OR(Interface.isTypeCondition);
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
		if ( featureName.equalsIgnoreCase("configuration") )
			return this.getConfiguration();		
		if ( featureName.equalsIgnoreCase("name") )
			return this.getName();		
		if ( featureName.equalsIgnoreCase("configurationImage") )
			return this.getConfigurationImage();		
		if ( featureName.equalsIgnoreCase("description") )
			return this.getDescription();		
		if ( featureName.equalsIgnoreCase("changeable") )
			return this.getChangeable();		
		if ( featureName.equalsIgnoreCase("hidden") )
			return this.getHidden();		
		if ( featureName.equalsIgnoreCase("ident") )
			return this.getIdent();		
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
		if ( featureName.equalsIgnoreCase("configuration") ) {
				org.sociotech.communitymashup.application.Configuration fconfiguration = null;
				try {
					try {
						fconfiguration = (org.sociotech.communitymashup.application.Configuration)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fconfiguration = (org.sociotech.communitymashup.application.Configuration)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("ConfigurableElement.setFeature", "org.sociotech.communitymashup.application.Configuration",value.getClass().getName());
				}
				this.setConfiguration(fconfiguration);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("name") ) {
				java.lang.String fname = null;
				try {
					fname = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("ConfigurableElement.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setName(fname);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("configurationImage") ) {
				java.lang.String fconfigurationImage = null;
				try {
					fconfigurationImage = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("ConfigurableElement.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setConfigurationImage(fconfigurationImage);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("description") ) {
				java.lang.String fdescription = null;
				try {
					fdescription = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("ConfigurableElement.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setDescription(fdescription);
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
					throw new WrongArgException("ConfigurableElement.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setChangeable(fchangeable);
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
					throw new WrongArgException("ConfigurableElement.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setHidden(fhidden);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("ident") ) {
				java.lang.String fident = null;
				try {
					fident = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("ConfigurableElement.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setIdent(fident);
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
		if ( command.getCommand().equalsIgnoreCase("getProperty")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("ConfigurableElement.doOperation", 1, command.getArgCount()); 
			java.lang.String key = null;
			try {
				key = (java.lang.String)command.getArg("key");
			} catch (ClassCastException e) {
				throw new WrongArgException("ConfigurableElement.doOperation", "java.lang.String", command.getArg("key").getClass().getName());
			}
			return this.getProperty(key);
		}
		if ( command.getCommand().equalsIgnoreCase("addProperty")) {
			if (command.getArgCount() != 2) throw new WrongArgCountException("ConfigurableElement.doOperation", 2, command.getArgCount()); 
			java.lang.String key = null;
			try {
				key = (java.lang.String)command.getArg("key");
			} catch (ClassCastException e) {
				throw new WrongArgException("ConfigurableElement.doOperation", "java.lang.String", command.getArg("key").getClass().getName());
			}
			java.lang.String value = null;
			try {
				value = (java.lang.String)command.getArg("value");
			} catch (ClassCastException e) {
				throw new WrongArgException("ConfigurableElement.doOperation", "java.lang.String", command.getArg("value").getClass().getName());
			}
				this.addProperty(key, value);
				return this;
				}
		if ( command.getCommand().equalsIgnoreCase("addProperty")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("ConfigurableElement.doOperation", 1, command.getArgCount()); 
			Property property = null;
			try {
				try {
					property = (Property)(RestUtil.fromInput(command.getArg("property")));
				} catch (ClassNotFoundException e) {
					property = (Property)command.getArg("property");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("ConfigurableElement.doOperation", "Property", command.getArg("property").getClass().getName());
			}
				this.addProperty(property);
				return this;
				}
		if ( command.getCommand().equalsIgnoreCase("getPropertyValue")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("ConfigurableElement.doOperation", 1, command.getArgCount()); 
			java.lang.String key = null;
			try {
				key = (java.lang.String)command.getArg("key");
			} catch (ClassCastException e) {
				throw new WrongArgException("ConfigurableElement.doOperation", "java.lang.String", command.getArg("key").getClass().getName());
			}
			return this.getPropertyValue(key);
		}
		if ( command.getCommand().equalsIgnoreCase("isPropertyTrue")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("ConfigurableElement.doOperation", 1, command.getArgCount()); 
			java.lang.String key = null;
			try {
				key = (java.lang.String)command.getArg("key");
			} catch (ClassCastException e) {
				throw new WrongArgException("ConfigurableElement.doOperation", "java.lang.String", command.getArg("key").getClass().getName());
			}
			return this.isPropertyTrue(key);
		}
		if ( command.getCommand().equalsIgnoreCase("getPropertyValueElseDefault")) {
			if (command.getArgCount() != 2) throw new WrongArgCountException("ConfigurableElement.doOperation", 2, command.getArgCount()); 
			java.lang.String key = null;
			try {
				key = (java.lang.String)command.getArg("key");
			} catch (ClassCastException e) {
				throw new WrongArgException("ConfigurableElement.doOperation", "java.lang.String", command.getArg("key").getClass().getName());
			}
			java.lang.String defaultValue = null;
			try {
				defaultValue = (java.lang.String)command.getArg("defaultValue");
			} catch (ClassCastException e) {
				throw new WrongArgException("ConfigurableElement.doOperation", "java.lang.String", command.getArg("defaultValue").getClass().getName());
			}
			return this.getPropertyValueElseDefault(key, defaultValue);
		}
		if ( command.getCommand().equalsIgnoreCase("isPropertyTrueElseDefault")) {
			if (command.getArgCount() != 2) throw new WrongArgCountException("ConfigurableElement.doOperation", 2, command.getArgCount()); 
			java.lang.String key = null;
			try {
				key = (java.lang.String)command.getArg("key");
			} catch (ClassCastException e) {
				throw new WrongArgException("ConfigurableElement.doOperation", "java.lang.String", command.getArg("key").getClass().getName());
			}
			java.lang.String defaultValue = null;
			try {
				defaultValue = (java.lang.String)command.getArg("defaultValue");
			} catch (ClassCastException e) {
				throw new WrongArgException("ConfigurableElement.doOperation", "java.lang.String", command.getArg("defaultValue").getClass().getName());
			}
			return this.isPropertyTrueElseDefault(key, defaultValue);
		}
		if ( command.getCommand().equalsIgnoreCase("removeProperty")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("ConfigurableElement.doOperation", 1, command.getArgCount()); 
			java.lang.String key = null;
			try {
				key = (java.lang.String)command.getArg("key");
			} catch (ClassCastException e) {
				throw new WrongArgException("ConfigurableElement.doOperation", "java.lang.String", command.getArg("key").getClass().getName());
			}
				this.removeProperty(key);
				return this;
				}
		throw new UnknownOperationException(this, command);
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
} //ConfigurableElementImpl
