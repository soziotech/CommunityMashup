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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 * An implementation of the model object '<em><b>Mashup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupImpl#getMappingRules <em>Mapping Rules</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupImpl#getMashupAdmins <em>Mashup Admins</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupImpl#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupImpl#getCacheAttachments <em>Cache Attachments</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupImpl#getCacheDataSet <em>Cache Data Set</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupImpl#getBackupDataSet <em>Backup Data Set</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.MashupImpl#getBackupIntervall <em>Backup Intervall</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MashupImpl extends SourceImpl implements Mashup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The cached value of the '{@link #getMappingRules() <em>Mapping Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingRule> mappingRules;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Source> sources;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interfaces;

	/**
	 * The cached value of the '{@link #getMashupAdmins() <em>Mashup Admins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMashupAdmins()
	 * @generated
	 * @ordered
	 */
	protected EList<MashupAdmin> mashupAdmins;

	/**
	 * The default value of the '{@link #getWorkingDirectory() <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKING_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkingDirectory() <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectory()
	 * @generated
	 * @ordered
	 */
	protected String workingDirectory = WORKING_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheAttachments() <em>Cache Attachments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheAttachments()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CACHE_ATTACHMENTS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getCacheAttachments() <em>Cache Attachments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheAttachments()
	 * @generated
	 * @ordered
	 */
	protected Boolean cacheAttachments = CACHE_ATTACHMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCacheDataSet() <em>Cache Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheDataSet()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CACHE_DATA_SET_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getCacheDataSet() <em>Cache Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheDataSet()
	 * @generated
	 * @ordered
	 */
	protected Boolean cacheDataSet = CACHE_DATA_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackupDataSet() <em>Backup Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupDataSet()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BACKUP_DATA_SET_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getBackupDataSet() <em>Backup Data Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackupDataSet()
	 * @generated
	 * @ordered
	 */
	protected Boolean backupDataSet = BACKUP_DATA_SET_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MashupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.MASHUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingRule> getMappingRules() {
		if (mappingRules == null) {
			mappingRules = new EObjectContainmentEList<MappingRule>(MappingRule.class, this, ApplicationPackage.MASHUP__MAPPING_RULES);
		}
		return mappingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Source> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentWithInverseEList<Source>(Source.class, this, ApplicationPackage.MASHUP__SOURCES, ApplicationPackage.SOURCE__MASHUP);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentWithInverseEList<Interface>(Interface.class, this, ApplicationPackage.MASHUP__INTERFACES, ApplicationPackage.INTERFACE__MASHUP);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MashupAdmin> getMashupAdmins() {
		if (mashupAdmins == null) {
			mashupAdmins = new EObjectWithInverseResolvingEList.ManyInverse<MashupAdmin>(MashupAdmin.class, this, ApplicationPackage.MASHUP__MASHUP_ADMINS, ApplicationPackage.MASHUP_ADMIN__CONFIGURABLE_MASHUPS);
		}
		return mashupAdmins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkingDirectory() {
		return workingDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkingDirectory(String newWorkingDirectory) {
		String oldWorkingDirectory = workingDirectory;
		workingDirectory = newWorkingDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP__WORKING_DIRECTORY, oldWorkingDirectory, workingDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCacheAttachments() {
		return cacheAttachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheAttachments(Boolean newCacheAttachments) {
		Boolean oldCacheAttachments = cacheAttachments;
		cacheAttachments = newCacheAttachments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP__CACHE_ATTACHMENTS, oldCacheAttachments, cacheAttachments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCacheDataSet() {
		return cacheDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheDataSet(Boolean newCacheDataSet) {
		Boolean oldCacheDataSet = cacheDataSet;
		cacheDataSet = newCacheDataSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP__CACHE_DATA_SET, oldCacheDataSet, cacheDataSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBackupDataSet() {
		return backupDataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackupDataSet(Boolean newBackupDataSet) {
		Boolean oldBackupDataSet = backupDataSet;
		backupDataSet = newBackupDataSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP__BACKUP_DATA_SET, oldBackupDataSet, backupDataSet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.MASHUP__BACKUP_INTERVALL, oldBackupIntervall, backupIntervall));
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
			case ApplicationPackage.MASHUP__SOURCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSources()).basicAdd(otherEnd, msgs);
			case ApplicationPackage.MASHUP__INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaces()).basicAdd(otherEnd, msgs);
			case ApplicationPackage.MASHUP__MASHUP_ADMINS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMashupAdmins()).basicAdd(otherEnd, msgs);
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
			case ApplicationPackage.MASHUP__MAPPING_RULES:
				return ((InternalEList<?>)getMappingRules()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.MASHUP__SOURCES:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.MASHUP__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case ApplicationPackage.MASHUP__MASHUP_ADMINS:
				return ((InternalEList<?>)getMashupAdmins()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.MASHUP__MAPPING_RULES:
				return getMappingRules();
			case ApplicationPackage.MASHUP__SOURCES:
				return getSources();
			case ApplicationPackage.MASHUP__INTERFACES:
				return getInterfaces();
			case ApplicationPackage.MASHUP__MASHUP_ADMINS:
				return getMashupAdmins();
			case ApplicationPackage.MASHUP__WORKING_DIRECTORY:
				return getWorkingDirectory();
			case ApplicationPackage.MASHUP__CACHE_ATTACHMENTS:
				return getCacheAttachments();
			case ApplicationPackage.MASHUP__CACHE_DATA_SET:
				return getCacheDataSet();
			case ApplicationPackage.MASHUP__BACKUP_DATA_SET:
				return getBackupDataSet();
			case ApplicationPackage.MASHUP__BACKUP_INTERVALL:
				return getBackupIntervall();
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
			case ApplicationPackage.MASHUP__MAPPING_RULES:
				getMappingRules().clear();
				getMappingRules().addAll((Collection<? extends MappingRule>)newValue);
				return;
			case ApplicationPackage.MASHUP__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Source>)newValue);
				return;
			case ApplicationPackage.MASHUP__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case ApplicationPackage.MASHUP__MASHUP_ADMINS:
				getMashupAdmins().clear();
				getMashupAdmins().addAll((Collection<? extends MashupAdmin>)newValue);
				return;
			case ApplicationPackage.MASHUP__WORKING_DIRECTORY:
				setWorkingDirectory((String)newValue);
				return;
			case ApplicationPackage.MASHUP__CACHE_ATTACHMENTS:
				setCacheAttachments((Boolean)newValue);
				return;
			case ApplicationPackage.MASHUP__CACHE_DATA_SET:
				setCacheDataSet((Boolean)newValue);
				return;
			case ApplicationPackage.MASHUP__BACKUP_DATA_SET:
				setBackupDataSet((Boolean)newValue);
				return;
			case ApplicationPackage.MASHUP__BACKUP_INTERVALL:
				setBackupIntervall((Integer)newValue);
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
			case ApplicationPackage.MASHUP__MAPPING_RULES:
				getMappingRules().clear();
				return;
			case ApplicationPackage.MASHUP__SOURCES:
				getSources().clear();
				return;
			case ApplicationPackage.MASHUP__INTERFACES:
				getInterfaces().clear();
				return;
			case ApplicationPackage.MASHUP__MASHUP_ADMINS:
				getMashupAdmins().clear();
				return;
			case ApplicationPackage.MASHUP__WORKING_DIRECTORY:
				setWorkingDirectory(WORKING_DIRECTORY_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP__CACHE_ATTACHMENTS:
				setCacheAttachments(CACHE_ATTACHMENTS_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP__CACHE_DATA_SET:
				setCacheDataSet(CACHE_DATA_SET_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP__BACKUP_DATA_SET:
				setBackupDataSet(BACKUP_DATA_SET_EDEFAULT);
				return;
			case ApplicationPackage.MASHUP__BACKUP_INTERVALL:
				setBackupIntervall(BACKUP_INTERVALL_EDEFAULT);
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
			case ApplicationPackage.MASHUP__MAPPING_RULES:
				return mappingRules != null && !mappingRules.isEmpty();
			case ApplicationPackage.MASHUP__SOURCES:
				return sources != null && !sources.isEmpty();
			case ApplicationPackage.MASHUP__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case ApplicationPackage.MASHUP__MASHUP_ADMINS:
				return mashupAdmins != null && !mashupAdmins.isEmpty();
			case ApplicationPackage.MASHUP__WORKING_DIRECTORY:
				return WORKING_DIRECTORY_EDEFAULT == null ? workingDirectory != null : !WORKING_DIRECTORY_EDEFAULT.equals(workingDirectory);
			case ApplicationPackage.MASHUP__CACHE_ATTACHMENTS:
				return CACHE_ATTACHMENTS_EDEFAULT == null ? cacheAttachments != null : !CACHE_ATTACHMENTS_EDEFAULT.equals(cacheAttachments);
			case ApplicationPackage.MASHUP__CACHE_DATA_SET:
				return CACHE_DATA_SET_EDEFAULT == null ? cacheDataSet != null : !CACHE_DATA_SET_EDEFAULT.equals(cacheDataSet);
			case ApplicationPackage.MASHUP__BACKUP_DATA_SET:
				return BACKUP_DATA_SET_EDEFAULT == null ? backupDataSet != null : !BACKUP_DATA_SET_EDEFAULT.equals(backupDataSet);
			case ApplicationPackage.MASHUP__BACKUP_INTERVALL:
				return BACKUP_INTERVALL_EDEFAULT == null ? backupIntervall != null : !BACKUP_INTERVALL_EDEFAULT.equals(backupIntervall);
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
		result.append(" (workingDirectory: ");
		result.append(workingDirectory);
		result.append(", cacheAttachments: ");
		result.append(cacheAttachments);
		result.append(", cacheDataSet: ");
		result.append(cacheDataSet);
		result.append(", backupDataSet: ");
		result.append(backupDataSet);
		result.append(", backupIntervall: ");
		result.append(backupIntervall);
		result.append(')');
		return result.toString();
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type Mashup.
	 * 
	 * @return An EObjectCondition whether the Object is of the type Mashup.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(ApplicationPackageImpl.eINSTANCE.getMashup());
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
		if ( featureName.equalsIgnoreCase("mappingRules") )
			return this.getMappingRules();		
		if ( featureName.equalsIgnoreCase("sources") )
			return this.getSources();		
		if ( featureName.equalsIgnoreCase("interfaces") )
			return this.getInterfaces();		
		if ( featureName.equalsIgnoreCase("mashupAdmins") )
			return this.getMashupAdmins();		
		if ( featureName.equalsIgnoreCase("workingDirectory") )
			return this.getWorkingDirectory();		
		if ( featureName.equalsIgnoreCase("cacheAttachments") )
			return this.getCacheAttachments();		
		if ( featureName.equalsIgnoreCase("cacheDataSet") )
			return this.getCacheDataSet();		
		if ( featureName.equalsIgnoreCase("backupDataSet") )
			return this.getBackupDataSet();		
		if ( featureName.equalsIgnoreCase("backupIntervall") )
			return this.getBackupIntervall();			
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
		if ( featureName.equalsIgnoreCase("workingDirectory") ) {
				java.lang.String fworkingDirectory = null;
				try {
					fworkingDirectory = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Mashup.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setWorkingDirectory(fworkingDirectory);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("cacheAttachments") ) {
				java.lang.Boolean fcacheAttachments = null;
				try {
					try {
						fcacheAttachments = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fcacheAttachments = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Mashup.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setCacheAttachments(fcacheAttachments);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("cacheDataSet") ) {
				java.lang.Boolean fcacheDataSet = null;
				try {
					try {
						fcacheDataSet = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fcacheDataSet = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Mashup.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setCacheDataSet(fcacheDataSet);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("backupDataSet") ) {
				java.lang.Boolean fbackupDataSet = null;
				try {
					try {
						fbackupDataSet = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fbackupDataSet = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Mashup.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setBackupDataSet(fbackupDataSet);
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
					throw new WrongArgException("Mashup.setFeature", "java.lang.Integer",value.getClass().getName());
				}
				this.setBackupIntervall(fbackupIntervall);
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
} //MashupImpl
