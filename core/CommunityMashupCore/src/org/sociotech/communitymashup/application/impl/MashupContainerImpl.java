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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 * An implementation of the model object '<em><b>Mashup Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupContainerImpl#getMashups <em>Mashups</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupContainerImpl#getAllMashupAdmins <em>All Mashup Admins</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupContainerImpl#getBackupConfiguration <em>Backup Configuration</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupContainerImpl#getBackupIntervall <em>Backup Intervall</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupContainerImpl#getDefaultMashups <em>Default Mashups</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupContainerImpl#getSourceConfigurations <em>Source Configurations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupContainerImpl#getInterfaceConfigurations <em>Interface Configurations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupContainerImpl#getImmediateSave <em>Immediate Save</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MashupContainerImpl extends EObjectImpl implements MashupContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";
	/**
	 * The cached value of the '{@link #getMashups() <em>Mashups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMashups()
	 * @generated
	 * @ordered
	 */
	protected EList<Mashup> mashups;

	/**
	 * The cached value of the '{@link #getAllMashupAdmins() <em>All Mashup Admins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMashupAdmins()
	 * @generated
	 * @ordered
	 */
	protected EList<MashupAdmin> allMashupAdmins;

	/**
	 * The default value of the '{@link #getBackupConfiguration() <em>Backup Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BACKUP_CONFIGURATION_EDEFAULT = Boolean.FALSE;
	/**
	 * The cached value of the '{@link #getBackupConfiguration() <em>Backup Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Boolean backupConfiguration = BACKUP_CONFIGURATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getBackupIntervall() <em>Backup Intervall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupIntervall()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BACKUP_INTERVALL_EDEFAULT = new Integer(600);
	/**
	 * The cached value of the '{@link #getBackupIntervall() <em>Backup Intervall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupIntervall()
	 * @generated
	 * @ordered
	 */
	protected Integer backupIntervall = BACKUP_INTERVALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultMashups() <em>Default Mashups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMashups()
	 * @generated
	 * @ordered
	 */
	protected EList<Mashup> defaultMashups;
	/**
	 * The cached value of the '{@link #getSourceConfigurations() <em>Source Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Mashup> sourceConfigurations;
	/**
	 * The cached value of the '{@link #getInterfaceConfigurations() <em>Interface Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaceConfigurations;

	/**
	 * The default value of the '{@link #getImmediateSave() <em>Immediate Save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediateSave()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IMMEDIATE_SAVE_EDEFAULT = Boolean.FALSE;
	/**
	 * The cached value of the '{@link #getImmediateSave() <em>Immediate Save</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediateSave()
	 * @generated
	 * @ordered
	 */
	protected Boolean immediateSave = IMMEDIATE_SAVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MashupContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.MASHUP_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mashup> getMashups() {
		if (mashups == null) {
			mashups = new EObjectContainmentEList<Mashup>(Mashup.class, this, ApplicationPackage.MASHUP_CONTAINER__MASHUPS);
		}
		return mashups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MashupAdmin> getAllMashupAdmins() {
		if (allMashupAdmins == null) {
			allMashupAdmins = new EObjectContainmentEList<MashupAdmin>(MashupAdmin.class, this, ApplicationPackage.MASHUP_CONTAINER__ALL_MASHUP_ADMINS);
		}
		return allMashupAdmins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBackupConfiguration() {
		return backupConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackupConfiguration(Boolean newBackupConfiguration) {
		Boolean oldBackupConfiguration = backupConfiguration;
		backupConfiguration = newBackupConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP_CONTAINER__BACKUP_CONFIGURATION, oldBackupConfiguration, backupConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBackupIntervall() {
		return backupIntervall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackupIntervall(Integer newBackupIntervall) {
		Integer oldBackupIntervall = backupIntervall;
		backupIntervall = newBackupIntervall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP_CONTAINER__BACKUP_INTERVALL, oldBackupIntervall, backupIntervall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mashup> getDefaultMashups() {
		if (defaultMashups == null) {
			defaultMashups = new EObjectContainmentEList<Mashup>(Mashup.class, this, ApplicationPackage.MASHUP_CONTAINER__DEFAULT_MASHUPS);
		}
		return defaultMashups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mashup> getSourceConfigurations() {
		if (sourceConfigurations == null) {
			sourceConfigurations = new EObjectContainmentEList<Mashup>(Mashup.class, this, ApplicationPackage.MASHUP_CONTAINER__SOURCE_CONFIGURATIONS);
		}
		return sourceConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaceConfigurations() {
		if (interfaceConfigurations == null) {
			interfaceConfigurations = new EObjectContainmentEList<Interface>(Interface.class, this, ApplicationPackage.MASHUP_CONTAINER__INTERFACE_CONFIGURATIONS);
		}
		return interfaceConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getImmediateSave() {
		return immediateSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmediateSave(Boolean newImmediateSave) {
		Boolean oldImmediateSave = immediateSave;
		immediateSave = newImmediateSave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP_CONTAINER__IMMEDIATE_SAVE, oldImmediateSave, immediateSave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public EList<MashupAdmin> getConfigurationAdmins() {
		EList<MashupAdmin> configurationAdmins = new BasicEList<MashupAdmin>();
		
		EList<MashupAdmin> allMashupAdmins = getAllMashupAdmins();
		// find all configuration admins
		for(MashupAdmin admin : allMashupAdmins)
		{
			if(admin.getIsConfigurationAdmin())
			{
				configurationAdmins.add(admin);
			}
		}
		
		return configurationAdmins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.MASHUP_CONTAINER__MASHUPS:
				return ((InternalEList<?>)getMashups()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.MASHUP_CONTAINER__ALL_MASHUP_ADMINS:
				return ((InternalEList<?>)getAllMashupAdmins()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.MASHUP_CONTAINER__DEFAULT_MASHUPS:
				return ((InternalEList<?>)getDefaultMashups()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.MASHUP_CONTAINER__SOURCE_CONFIGURATIONS:
				return ((InternalEList<?>)getSourceConfigurations()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.MASHUP_CONTAINER__INTERFACE_CONFIGURATIONS:
				return ((InternalEList<?>)getInterfaceConfigurations()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.MASHUP_CONTAINER__MASHUPS:
				return getMashups();
			case ApplicationPackage.MASHUP_CONTAINER__ALL_MASHUP_ADMINS:
				return getAllMashupAdmins();
			case ApplicationPackage.MASHUP_CONTAINER__BACKUP_CONFIGURATION:
				return getBackupConfiguration();
			case ApplicationPackage.MASHUP_CONTAINER__BACKUP_INTERVALL:
				return getBackupIntervall();
			case ApplicationPackage.MASHUP_CONTAINER__DEFAULT_MASHUPS:
				return getDefaultMashups();
			case ApplicationPackage.MASHUP_CONTAINER__SOURCE_CONFIGURATIONS:
				return getSourceConfigurations();
			case ApplicationPackage.MASHUP_CONTAINER__INTERFACE_CONFIGURATIONS:
				return getInterfaceConfigurations();
			case ApplicationPackage.MASHUP_CONTAINER__IMMEDIATE_SAVE:
				return getImmediateSave();
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
			case ApplicationPackage.MASHUP_CONTAINER__MASHUPS:
				getMashups().clear();
				getMashups().addAll((Collection<? extends Mashup>)newValue);
				return;
			case ApplicationPackage.MASHUP_CONTAINER__ALL_MASHUP_ADMINS:
				getAllMashupAdmins().clear();
				getAllMashupAdmins().addAll((Collection<? extends MashupAdmin>)newValue);
				return;
			case ApplicationPackage.MASHUP_CONTAINER__BACKUP_CONFIGURATION:
				setBackupConfiguration((Boolean)newValue);
				return;
			case ApplicationPackage.MASHUP_CONTAINER__BACKUP_INTERVALL:
				setBackupIntervall((Integer)newValue);
				return;
			case ApplicationPackage.MASHUP_CONTAINER__DEFAULT_MASHUPS:
				getDefaultMashups().clear();
				getDefaultMashups().addAll((Collection<? extends Mashup>)newValue);
				return;
			case ApplicationPackage.MASHUP_CONTAINER__SOURCE_CONFIGURATIONS:
				getSourceConfigurations().clear();
				getSourceConfigurations().addAll((Collection<? extends Mashup>)newValue);
				return;
			case ApplicationPackage.MASHUP_CONTAINER__INTERFACE_CONFIGURATIONS:
				getInterfaceConfigurations().clear();
				getInterfaceConfigurations().addAll((Collection<? extends Interface>)newValue);
				return;
			case ApplicationPackage.MASHUP_CONTAINER__IMMEDIATE_SAVE:
				setImmediateSave((Boolean)newValue);
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
			case ApplicationPackage.MASHUP_CONTAINER__MASHUPS:
				getMashups().clear();
				return;
			case ApplicationPackage.MASHUP_CONTAINER__ALL_MASHUP_ADMINS:
				getAllMashupAdmins().clear();
				return;
			case ApplicationPackage.MASHUP_CONTAINER__BACKUP_CONFIGURATION:
				setBackupConfiguration(BACKUP_CONFIGURATION_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP_CONTAINER__BACKUP_INTERVALL:
				setBackupIntervall(BACKUP_INTERVALL_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP_CONTAINER__DEFAULT_MASHUPS:
				getDefaultMashups().clear();
				return;
			case ApplicationPackage.MASHUP_CONTAINER__SOURCE_CONFIGURATIONS:
				getSourceConfigurations().clear();
				return;
			case ApplicationPackage.MASHUP_CONTAINER__INTERFACE_CONFIGURATIONS:
				getInterfaceConfigurations().clear();
				return;
			case ApplicationPackage.MASHUP_CONTAINER__IMMEDIATE_SAVE:
				setImmediateSave(IMMEDIATE_SAVE_EDEFAULT);
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
			case ApplicationPackage.MASHUP_CONTAINER__MASHUPS:
				return mashups != null && !mashups.isEmpty();
			case ApplicationPackage.MASHUP_CONTAINER__ALL_MASHUP_ADMINS:
				return allMashupAdmins != null && !allMashupAdmins.isEmpty();
			case ApplicationPackage.MASHUP_CONTAINER__BACKUP_CONFIGURATION:
				return BACKUP_CONFIGURATION_EDEFAULT == null ? backupConfiguration != null : !BACKUP_CONFIGURATION_EDEFAULT.equals(backupConfiguration);
			case ApplicationPackage.MASHUP_CONTAINER__BACKUP_INTERVALL:
				return BACKUP_INTERVALL_EDEFAULT == null ? backupIntervall != null : !BACKUP_INTERVALL_EDEFAULT.equals(backupIntervall);
			case ApplicationPackage.MASHUP_CONTAINER__DEFAULT_MASHUPS:
				return defaultMashups != null && !defaultMashups.isEmpty();
			case ApplicationPackage.MASHUP_CONTAINER__SOURCE_CONFIGURATIONS:
				return sourceConfigurations != null && !sourceConfigurations.isEmpty();
			case ApplicationPackage.MASHUP_CONTAINER__INTERFACE_CONFIGURATIONS:
				return interfaceConfigurations != null && !interfaceConfigurations.isEmpty();
			case ApplicationPackage.MASHUP_CONTAINER__IMMEDIATE_SAVE:
				return IMMEDIATE_SAVE_EDEFAULT == null ? immediateSave != null : !IMMEDIATE_SAVE_EDEFAULT.equals(immediateSave);
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
		result.append(" (backupConfiguration: ");
		result.append(backupConfiguration);
		result.append(", backupIntervall: ");
		result.append(backupIntervall);
		result.append(", immediateSave: ");
		result.append(immediateSave);
		result.append(')');
		return result.toString();
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type MashupContainer.
	 * 
	 * @return An EObjectCondition whether the Object is of the type MashupContainer.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(ApplicationPackageImpl.eINSTANCE.getMashupContainer());
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
		if ( featureName.equalsIgnoreCase("mashups") )
			return this.getMashups();		
		if ( featureName.equalsIgnoreCase("allMashupAdmins") )
			return this.getAllMashupAdmins();		
		if ( featureName.equalsIgnoreCase("backupConfiguration") )
			return this.getBackupConfiguration();		
		if ( featureName.equalsIgnoreCase("backupIntervall") )
			return this.getBackupIntervall();		
		if ( featureName.equalsIgnoreCase("defaultMashups") )
			return this.getDefaultMashups();		
		if ( featureName.equalsIgnoreCase("sourceConfigurations") )
			return this.getSourceConfigurations();		
		if ( featureName.equalsIgnoreCase("interfaceConfigurations") )
			return this.getInterfaceConfigurations();		
		if ( featureName.equalsIgnoreCase("immediateSave") )
			return this.getImmediateSave();		
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
		if ( featureName.equalsIgnoreCase("backupConfiguration") ) {
				java.lang.Boolean fbackupConfiguration = null;
				try {
					try {
						fbackupConfiguration = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fbackupConfiguration = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("MashupContainer.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setBackupConfiguration(fbackupConfiguration);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("backupIntervall") ) {
				java.lang.Integer fbackupIntervall = null;
				try {
				try {
					fbackupIntervall = RestUtil.fromIntegerString((String) value);
					if(fbackupIntervall == null) {
						fbackupIntervall = (java.lang.Integer)(RestUtil.fromInput(value));
					}
				} catch (ClassNotFoundException e) {
					fbackupIntervall = (java.lang.Integer)value;
				}
				} catch (ClassCastException e) {
					throw new WrongArgException("MashupContainer.setFeature", "java.lang.Integer",value.getClass().getName());
				}
				this.setBackupIntervall(fbackupIntervall);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("immediateSave") ) {
				java.lang.Boolean fimmediateSave = null;
				try {
					try {
						fimmediateSave = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fimmediateSave = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("MashupContainer.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setImmediateSave(fimmediateSave);
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
		if ( command.getCommand().equalsIgnoreCase("getConfigurationAdmins")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("MashupContainer.doOperation", 0, command.getArgCount()); 
			return this.getConfigurationAdmins();
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
} //MashupContainerImpl
