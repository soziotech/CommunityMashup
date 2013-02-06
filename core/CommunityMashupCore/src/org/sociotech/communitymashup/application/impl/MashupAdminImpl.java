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

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
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
 * An implementation of the model object '<em><b>Mashup Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupAdminImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupAdminImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupAdminImpl#getConfigurableMashups <em>Configurable Mashups</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupAdminImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupAdminImpl#getLocalIdent <em>Local Ident</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupAdminImpl#getIsConfigurationAdmin <em>Is Configuration Admin</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupAdminImpl#getProfileImage <em>Profile Image</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupAdminImpl#getEmail <em>Email</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MashupAdminImpl extends EObjectImpl implements MashupAdmin {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected String provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigurableMashups() <em>Configurable Mashups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurableMashups()
	 * @generated
	 * @ordered
	 */
	protected EList<Mashup> configurableMashups;

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
	 * The default value of the '{@link #getLocalIdent() <em>Local Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIdent()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_IDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalIdent() <em>Local Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalIdent()
	 * @generated
	 * @ordered
	 */
	protected String localIdent = LOCAL_IDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsConfigurationAdmin() <em>Is Configuration Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConfigurationAdmin()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONFIGURATION_ADMIN_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsConfigurationAdmin() <em>Is Configuration Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConfigurationAdmin()
	 * @generated
	 * @ordered
	 */
	protected Boolean isConfigurationAdmin = IS_CONFIGURATION_ADMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfileImage() <em>Profile Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileImage()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfileImage() <em>Profile Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileImage()
	 * @generated
	 * @ordered
	 */
	protected String profileImage = PROFILE_IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MashupAdminImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.MASHUP_ADMIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(String newProvider) {
		String oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP_ADMIN__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP_ADMIN__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mashup> getConfigurableMashups() {
		if (configurableMashups == null) {
			configurableMashups = new EObjectWithInverseResolvingEList.ManyInverse<Mashup>(Mashup.class, this, ApplicationPackage.MASHUP_ADMIN__CONFIGURABLE_MASHUPS, ApplicationPackage.MASHUP__MASHUP_ADMINS);
		}
		return configurableMashups;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP_ADMIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalIdent() {
		return localIdent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalIdent(String newLocalIdent) {
		String oldLocalIdent = localIdent;
		localIdent = newLocalIdent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP_ADMIN__LOCAL_IDENT, oldLocalIdent, localIdent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsConfigurationAdmin() {
		return isConfigurationAdmin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConfigurationAdmin(Boolean newIsConfigurationAdmin) {
		Boolean oldIsConfigurationAdmin = isConfigurationAdmin;
		isConfigurationAdmin = newIsConfigurationAdmin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP_ADMIN__IS_CONFIGURATION_ADMIN, oldIsConfigurationAdmin, isConfigurationAdmin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfileImage() {
		return profileImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfileImage(String newProfileImage) {
		String oldProfileImage = profileImage;
		profileImage = newProfileImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP_ADMIN__PROFILE_IMAGE, oldProfileImage, profileImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP_ADMIN__EMAIL, oldEmail, email));
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
			case ApplicationPackage.MASHUP_ADMIN__CONFIGURABLE_MASHUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfigurableMashups()).basicAdd(otherEnd, msgs);
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
			case ApplicationPackage.MASHUP_ADMIN__CONFIGURABLE_MASHUPS:
				return ((InternalEList<?>)getConfigurableMashups()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.MASHUP_ADMIN__PROVIDER:
				return getProvider();
			case ApplicationPackage.MASHUP_ADMIN__ID:
				return getId();
			case ApplicationPackage.MASHUP_ADMIN__CONFIGURABLE_MASHUPS:
				return getConfigurableMashups();
			case ApplicationPackage.MASHUP_ADMIN__NAME:
				return getName();
			case ApplicationPackage.MASHUP_ADMIN__LOCAL_IDENT:
				return getLocalIdent();
			case ApplicationPackage.MASHUP_ADMIN__IS_CONFIGURATION_ADMIN:
				return getIsConfigurationAdmin();
			case ApplicationPackage.MASHUP_ADMIN__PROFILE_IMAGE:
				return getProfileImage();
			case ApplicationPackage.MASHUP_ADMIN__EMAIL:
				return getEmail();
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
			case ApplicationPackage.MASHUP_ADMIN__PROVIDER:
				setProvider((String)newValue);
				return;
			case ApplicationPackage.MASHUP_ADMIN__ID:
				setId((String)newValue);
				return;
			case ApplicationPackage.MASHUP_ADMIN__CONFIGURABLE_MASHUPS:
				getConfigurableMashups().clear();
				getConfigurableMashups().addAll((Collection<? extends Mashup>)newValue);
				return;
			case ApplicationPackage.MASHUP_ADMIN__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.MASHUP_ADMIN__LOCAL_IDENT:
				setLocalIdent((String)newValue);
				return;
			case ApplicationPackage.MASHUP_ADMIN__IS_CONFIGURATION_ADMIN:
				setIsConfigurationAdmin((Boolean)newValue);
				return;
			case ApplicationPackage.MASHUP_ADMIN__PROFILE_IMAGE:
				setProfileImage((String)newValue);
				return;
			case ApplicationPackage.MASHUP_ADMIN__EMAIL:
				setEmail((String)newValue);
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
			case ApplicationPackage.MASHUP_ADMIN__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP_ADMIN__ID:
				setId(ID_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP_ADMIN__CONFIGURABLE_MASHUPS:
				getConfigurableMashups().clear();
				return;
			case ApplicationPackage.MASHUP_ADMIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP_ADMIN__LOCAL_IDENT:
				setLocalIdent(LOCAL_IDENT_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP_ADMIN__IS_CONFIGURATION_ADMIN:
				setIsConfigurationAdmin(IS_CONFIGURATION_ADMIN_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP_ADMIN__PROFILE_IMAGE:
				setProfileImage(PROFILE_IMAGE_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP_ADMIN__EMAIL:
				setEmail(EMAIL_EDEFAULT);
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
			case ApplicationPackage.MASHUP_ADMIN__PROVIDER:
				return PROVIDER_EDEFAULT == null ? provider != null : !PROVIDER_EDEFAULT.equals(provider);
			case ApplicationPackage.MASHUP_ADMIN__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ApplicationPackage.MASHUP_ADMIN__CONFIGURABLE_MASHUPS:
				return configurableMashups != null && !configurableMashups.isEmpty();
			case ApplicationPackage.MASHUP_ADMIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.MASHUP_ADMIN__LOCAL_IDENT:
				return LOCAL_IDENT_EDEFAULT == null ? localIdent != null : !LOCAL_IDENT_EDEFAULT.equals(localIdent);
			case ApplicationPackage.MASHUP_ADMIN__IS_CONFIGURATION_ADMIN:
				return IS_CONFIGURATION_ADMIN_EDEFAULT == null ? isConfigurationAdmin != null : !IS_CONFIGURATION_ADMIN_EDEFAULT.equals(isConfigurationAdmin);
			case ApplicationPackage.MASHUP_ADMIN__PROFILE_IMAGE:
				return PROFILE_IMAGE_EDEFAULT == null ? profileImage != null : !PROFILE_IMAGE_EDEFAULT.equals(profileImage);
			case ApplicationPackage.MASHUP_ADMIN__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
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
		result.append(" (provider: ");
		result.append(provider);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", localIdent: ");
		result.append(localIdent);
		result.append(", isConfigurationAdmin: ");
		result.append(isConfigurationAdmin);
		result.append(", profileImage: ");
		result.append(profileImage);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}


	/**
	 * Generates an EObjectCondition to check whether an Object is of the type MashupAdmin.
	 * 
	 * @return An EObjectCondition whether the Object is of the type MashupAdmin.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(ApplicationPackageImpl.eINSTANCE.getMashupAdmin());
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
		if ( featureName.equalsIgnoreCase("provider") )
			return this.getProvider();		
		if ( featureName.equalsIgnoreCase("id") )
			return this.getId();		
		if ( featureName.equalsIgnoreCase("configurableMashups") )
			return this.getConfigurableMashups();		
		if ( featureName.equalsIgnoreCase("name") )
			return this.getName();		
		if ( featureName.equalsIgnoreCase("localIdent") )
			return this.getLocalIdent();		
		if ( featureName.equalsIgnoreCase("isConfigurationAdmin") )
			return this.getIsConfigurationAdmin();		
		if ( featureName.equalsIgnoreCase("profileImage") )
			return this.getProfileImage();		
		if ( featureName.equalsIgnoreCase("email") )
			return this.getEmail();		
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
		if ( featureName.equalsIgnoreCase("provider") ) {
				java.lang.String fprovider = null;
				try {
					fprovider = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("MashupAdmin.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setProvider(fprovider);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("id") ) {
				java.lang.String fid = null;
				try {
					fid = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("MashupAdmin.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setId(fid);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("name") ) {
				java.lang.String fname = null;
				try {
					fname = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("MashupAdmin.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setName(fname);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("localIdent") ) {
				java.lang.String flocalIdent = null;
				try {
					flocalIdent = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("MashupAdmin.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setLocalIdent(flocalIdent);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("isConfigurationAdmin") ) {
				java.lang.Boolean fisConfigurationAdmin = null;
				try {
					try {
						fisConfigurationAdmin = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fisConfigurationAdmin = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("MashupAdmin.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setIsConfigurationAdmin(fisConfigurationAdmin);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("profileImage") ) {
				java.lang.String fprofileImage = null;
				try {
					fprofileImage = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("MashupAdmin.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setProfileImage(fprofileImage);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("email") ) {
				java.lang.String femail = null;
				try {
					femail = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("MashupAdmin.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setEmail(femail);
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
} //MashupAdminImpl
