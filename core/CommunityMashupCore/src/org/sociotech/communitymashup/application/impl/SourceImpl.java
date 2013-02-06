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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.osgi.service.log.LogService;
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
import org.sociotech.communitymashup.application.SourceActiveStates;
import org.sociotech.communitymashup.application.SourceState;
import org.sociotech.communitymashup.application.XMLFile;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.ModificationAdapter;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.RestUtil;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.impl.SourceImpl#getPersistency <em>Persistency</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.SourceImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.SourceImpl#getBundleId <em>Bundle Id</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.SourceImpl#getUseModificationAdapter <em>Use Modification Adapter</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.SourceImpl#getState <em>State</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.SourceImpl#getActiveState <em>Active State</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.SourceImpl#getLogLevel <em>Log Level</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.SourceImpl#getMashup <em>Mashup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceImpl extends ConfigurableElementImpl implements Source {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The cached value of the '{@link #getPersistency() <em>Persistency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistency()
	 * @generated
	 * @ordered
	 */
	protected Persistency persistency;

	/**
	 * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSet()
	 * @generated
	 * @ordered
	 */
	protected DataSet dataSet;

	/**
	 * The default value of the '{@link #getBundleId() <em>Bundle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleId()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundleId() <em>Bundle Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundleId()
	 * @generated
	 * @ordered
	 */
	protected String bundleId = BUNDLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseModificationAdapter() <em>Use Modification Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseModificationAdapter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_MODIFICATION_ADAPTER_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getUseModificationAdapter() <em>Use Modification Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseModificationAdapter()
	 * @generated
	 * @ordered
	 */
	protected Boolean useModificationAdapter = USE_MODIFICATION_ADAPTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final SourceState STATE_EDEFAULT = SourceState.ACTIVE;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected SourceState state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActiveState() <em>Active State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveState()
	 * @generated
	 * @ordered
	 */
	protected static final SourceActiveStates ACTIVE_STATE_EDEFAULT = SourceActiveStates.INITIALIZING;

	/**
	 * The cached value of the '{@link #getActiveState() <em>Active State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveState()
	 * @generated
	 * @ordered
	 */
	protected SourceActiveStates activeState = ACTIVE_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogLevel() <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogLevel() <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected String logLevel = LOG_LEVEL_EDEFAULT;

	/**
	 * Default log level
	 * TODO: should be defined somewhere else (e.g. model)
	 */
	private Integer defaultLogLevel = LogService.LOG_DEBUG;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.SOURCE;
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
	public Persistency getPersistency() {
		return persistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistency(Persistency newPersistency, NotificationChain msgs) {
		Persistency oldPersistency = persistency;
		persistency = newPersistency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOURCE__PERSISTENCY, oldPersistency, newPersistency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistency(Persistency newPersistency) {
		if (newPersistency != persistency) {
			NotificationChain msgs = null;
			if (persistency != null)
				msgs = ((InternalEObject)persistency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.SOURCE__PERSISTENCY, null, msgs);
			if (newPersistency != null)
				msgs = ((InternalEObject)newPersistency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.SOURCE__PERSISTENCY, null, msgs);
			msgs = basicSetPersistency(newPersistency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOURCE__PERSISTENCY, newPersistency, newPersistency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet getDataSet() {
		if (dataSet != null && dataSet.eIsProxy()) {
			InternalEObject oldDataSet = (InternalEObject)dataSet;
			dataSet = (DataSet)eResolveProxy(oldDataSet);
			if (dataSet != oldDataSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApplicationPackage.SOURCE__DATA_SET, oldDataSet, dataSet));
			}
		}
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSet basicGetDataSet() {
		return dataSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDataSet(DataSet newDataSet) {
		DataSet oldDataSet = dataSet;
		dataSet = newDataSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOURCE__DATA_SET, oldDataSet, dataSet));
		ModificationAdapter modificationAdapter = new ModificationAdapter();
		// add ModificationAdapter if required
		if ((useModificationAdapter) && (dataSet.eResource() != null) && (!dataSet.eResource().eAdapters().contains(modificationAdapter))) {
			dataSet.eResource().eAdapters().add(modificationAdapter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBundleId() {
		return bundleId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundleId(String newBundleId) {
		String oldBundleId = bundleId;
		bundleId = newBundleId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOURCE__BUNDLE_ID, oldBundleId, bundleId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUseModificationAdapter() {
		return useModificationAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setUseModificationAdapter(Boolean newUseModificationAdapter) {
		Boolean oldUseModificationAdapter = useModificationAdapter;
		useModificationAdapter = newUseModificationAdapter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOURCE__USE_MODIFICATION_ADAPTER, oldUseModificationAdapter, useModificationAdapter));
		ModificationAdapter modificationAdapter = new ModificationAdapter();
		if (newUseModificationAdapter) {
			// add ModificationAdapter if not yet present
			if ((dataSet != null) && (dataSet.eResource() != null) &&(!dataSet.eResource().eAdapters().contains(modificationAdapter))) {
				dataSet.eResource().eAdapters().add(modificationAdapter);
			}
		} else {
			// remove ModificationAdapter
			if (dataSet != null && dataSet.eResource() != null) {
				dataSet.eResource().eAdapters().remove(modificationAdapter);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(SourceState newState) {
		SourceState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOURCE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceActiveStates getActiveState() {
		return activeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveState(SourceActiveStates newActiveState) {
		SourceActiveStates oldActiveState = activeState;
		activeState = newActiveState == null ? ACTIVE_STATE_EDEFAULT : newActiveState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOURCE__ACTIVE_STATE, oldActiveState, activeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getLogLevel() {
		
		// inherit log level from mashup
		if(logLevel == null && this.getMashup() != null)
		{
			return this.getMashup().getLogLevel();
		}
		
		return logLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogLevel(String newLogLevel) {
		String oldLogLevel = logLevel;
		logLevel = newLogLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOURCE__LOG_LEVEL, oldLogLevel, logLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mashup getMashup() {
		if (eContainerFeatureID() != ApplicationPackage.SOURCE__MASHUP) return null;
		return (Mashup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMashup(Mashup newMashup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMashup, ApplicationPackage.SOURCE__MASHUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMashup(Mashup newMashup) {
		if (newMashup != eInternalContainer() || (eContainerFeatureID() != ApplicationPackage.SOURCE__MASHUP && newMashup != null)) {
			if (EcoreUtil.isAncestor(this, newMashup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMashup != null)
				msgs = ((InternalEObject)newMashup).eInverseAdd(this, ApplicationPackage.MASHUP__SOURCES, Mashup.class, msgs);
			msgs = basicSetMashup(newMashup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.SOURCE__MASHUP, newMashup, newMashup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Integer getLogLevelIntValue() {
		String stringLogLevel = this.getLogLevel();
		
		if(stringLogLevel == null)
		{
			return defaultLogLevel;
		}
		
		// check cases
		if(stringLogLevel.equalsIgnoreCase("DEBUG"))
		{
			return LogService.LOG_DEBUG;
		}
		
		if(stringLogLevel.equalsIgnoreCase("INFO"))
		{
			return LogService.LOG_INFO;
		}
		
		if(stringLogLevel.equalsIgnoreCase("WARNING"))
		{
			return LogService.LOG_WARNING;
		}
		
		if(stringLogLevel.equalsIgnoreCase("ERROR"))
		{
			return LogService.LOG_ERROR;
		}
		
		// check if defined as int
		try {
			Integer intValue = new Integer(stringLogLevel);
			if(intValue.equals(LogService.LOG_DEBUG) || 
			   intValue.equals(LogService.LOG_DEBUG) ||
			   intValue.equals(LogService.LOG_DEBUG) ||
			   intValue.equals(LogService.LOG_DEBUG))
			{
				// return if valid
				return intValue;
			}
		} catch (Exception e) {
			// nothing to do
		}
		
		// return default
		return defaultLogLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void start() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pause() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.SOURCE__MASHUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMashup((Mashup)otherEnd, msgs);
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
			case ApplicationPackage.SOURCE__PERSISTENCY:
				return basicSetPersistency(null, msgs);
			case ApplicationPackage.SOURCE__MASHUP:
				return basicSetMashup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApplicationPackage.SOURCE__MASHUP:
				return eInternalContainer().eInverseRemove(this, ApplicationPackage.MASHUP__SOURCES, Mashup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.SOURCE__PERSISTENCY:
				return getPersistency();
			case ApplicationPackage.SOURCE__DATA_SET:
				if (resolve) return getDataSet();
				return basicGetDataSet();
			case ApplicationPackage.SOURCE__BUNDLE_ID:
				return getBundleId();
			case ApplicationPackage.SOURCE__USE_MODIFICATION_ADAPTER:
				return getUseModificationAdapter();
			case ApplicationPackage.SOURCE__STATE:
				return getState();
			case ApplicationPackage.SOURCE__ACTIVE_STATE:
				return getActiveState();
			case ApplicationPackage.SOURCE__LOG_LEVEL:
				return getLogLevel();
			case ApplicationPackage.SOURCE__MASHUP:
				return getMashup();
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
			case ApplicationPackage.SOURCE__PERSISTENCY:
				setPersistency((Persistency)newValue);
				return;
			case ApplicationPackage.SOURCE__DATA_SET:
				setDataSet((DataSet)newValue);
				return;
			case ApplicationPackage.SOURCE__BUNDLE_ID:
				setBundleId((String)newValue);
				return;
			case ApplicationPackage.SOURCE__USE_MODIFICATION_ADAPTER:
				setUseModificationAdapter((Boolean)newValue);
				return;
			case ApplicationPackage.SOURCE__STATE:
				setState((SourceState)newValue);
				return;
			case ApplicationPackage.SOURCE__ACTIVE_STATE:
				setActiveState((SourceActiveStates)newValue);
				return;
			case ApplicationPackage.SOURCE__LOG_LEVEL:
				setLogLevel((String)newValue);
				return;
			case ApplicationPackage.SOURCE__MASHUP:
				setMashup((Mashup)newValue);
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
			case ApplicationPackage.SOURCE__PERSISTENCY:
				setPersistency((Persistency)null);
				return;
			case ApplicationPackage.SOURCE__DATA_SET:
				setDataSet((DataSet)null);
				return;
			case ApplicationPackage.SOURCE__BUNDLE_ID:
				setBundleId(BUNDLE_ID_EDEFAULT);
				return;
			case ApplicationPackage.SOURCE__USE_MODIFICATION_ADAPTER:
				setUseModificationAdapter(USE_MODIFICATION_ADAPTER_EDEFAULT);
				return;
			case ApplicationPackage.SOURCE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ApplicationPackage.SOURCE__ACTIVE_STATE:
				setActiveState(ACTIVE_STATE_EDEFAULT);
				return;
			case ApplicationPackage.SOURCE__LOG_LEVEL:
				setLogLevel(LOG_LEVEL_EDEFAULT);
				return;
			case ApplicationPackage.SOURCE__MASHUP:
				setMashup((Mashup)null);
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
			case ApplicationPackage.SOURCE__PERSISTENCY:
				return persistency != null;
			case ApplicationPackage.SOURCE__DATA_SET:
				return dataSet != null;
			case ApplicationPackage.SOURCE__BUNDLE_ID:
				return BUNDLE_ID_EDEFAULT == null ? bundleId != null : !BUNDLE_ID_EDEFAULT.equals(bundleId);
			case ApplicationPackage.SOURCE__USE_MODIFICATION_ADAPTER:
				return USE_MODIFICATION_ADAPTER_EDEFAULT == null ? useModificationAdapter != null : !USE_MODIFICATION_ADAPTER_EDEFAULT.equals(useModificationAdapter);
			case ApplicationPackage.SOURCE__STATE:
				return state != STATE_EDEFAULT;
			case ApplicationPackage.SOURCE__ACTIVE_STATE:
				return activeState != ACTIVE_STATE_EDEFAULT;
			case ApplicationPackage.SOURCE__LOG_LEVEL:
				return LOG_LEVEL_EDEFAULT == null ? logLevel != null : !LOG_LEVEL_EDEFAULT.equals(logLevel);
			case ApplicationPackage.SOURCE__MASHUP:
				return getMashup() != null;
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
		result.append(" (bundleId: ");
		result.append(bundleId);
		result.append(", useModificationAdapter: ");
		result.append(useModificationAdapter);
		result.append(", state: ");
		result.append(state);
		result.append(", activeState: ");
		result.append(activeState);
		result.append(", logLevel: ");
		result.append(logLevel);
		result.append(')');
		return result.toString();
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type Source.
	 * 
	 * @return An EObjectCondition whether the Object is of the type Source.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		EObjectCondition result = new EObjectTypeRelationCondition(ApplicationPackageImpl.eINSTANCE.getSource());
		return result.OR(Mashup.isTypeCondition);
	}

	/**
	 * REST
	 * Generic Getter to access the properties of the underlying EMF Object.
	 *
	 * @generated
	 */
	protected Object getFeature(String featureName) throws UnknownOperationException {
		if ( featureName.equalsIgnoreCase("persistency") )
			return this.getPersistency();		
		if ( featureName.equalsIgnoreCase("dataSet") )
			return this.getDataSet();		
		if ( featureName.equalsIgnoreCase("bundleId") )
			return this.getBundleId();		
		if ( featureName.equalsIgnoreCase("useModificationAdapter") )
			return this.getUseModificationAdapter();		
		if ( featureName.equalsIgnoreCase("state") )
			return this.getState();		
		if ( featureName.equalsIgnoreCase("activeState") )
			return this.getActiveState();		
		if ( featureName.equalsIgnoreCase("logLevel") )
			return this.getLogLevel();		
		if ( featureName.equalsIgnoreCase("mashup") )
			return this.getMashup();			
		return super.getFeature(featureName); 
	}

	/**
	 * REST
	 * Generic Setter to access the properties of the underlying EMF Object.
	 *
	 * @generated
	 */
	protected Object setFeature(String featureName, Object value) throws WrongArgException, UnknownOperationException {
		if ( featureName.equalsIgnoreCase("persistency") ) {
				org.sociotech.communitymashup.application.Persistency fpersistency = null;
				try {
					try {
						fpersistency = (org.sociotech.communitymashup.application.Persistency)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fpersistency = (org.sociotech.communitymashup.application.Persistency)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Source.setFeature", "org.sociotech.communitymashup.application.Persistency",value.getClass().getName());
				}
				this.setPersistency(fpersistency);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("dataSet") ) {
				org.sociotech.communitymashup.data.DataSet fdataSet = null;
				try {
					try {
						fdataSet = (org.sociotech.communitymashup.data.DataSet)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fdataSet = (org.sociotech.communitymashup.data.DataSet)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Source.setFeature", "org.sociotech.communitymashup.data.DataSet",value.getClass().getName());
				}
				this.setDataSet(fdataSet);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("bundleId") ) {
				java.lang.String fbundleId = null;
				try {
					fbundleId = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Source.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setBundleId(fbundleId);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("useModificationAdapter") ) {
				java.lang.Boolean fuseModificationAdapter = null;
				try {
					try {
						fuseModificationAdapter = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fuseModificationAdapter = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Source.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setUseModificationAdapter(fuseModificationAdapter);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("state") ) {
				org.sociotech.communitymashup.application.SourceState fstate = null;
				try {
					try {
						fstate = (org.sociotech.communitymashup.application.SourceState)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fstate = (org.sociotech.communitymashup.application.SourceState)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Source.setFeature", "org.sociotech.communitymashup.application.SourceState",value.getClass().getName());
				}
				this.setState(fstate);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("activeState") ) {
				org.sociotech.communitymashup.application.SourceActiveStates factiveState = null;
				try {
					try {
						factiveState = (org.sociotech.communitymashup.application.SourceActiveStates)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						factiveState = (org.sociotech.communitymashup.application.SourceActiveStates)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Source.setFeature", "org.sociotech.communitymashup.application.SourceActiveStates",value.getClass().getName());
				}
				this.setActiveState(factiveState);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("logLevel") ) {
				java.lang.String flogLevel = null;
				try {
					flogLevel = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Source.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setLogLevel(flogLevel);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("mashup") ) {
				org.sociotech.communitymashup.application.Mashup fmashup = null;
				try {
					try {
						fmashup = (org.sociotech.communitymashup.application.Mashup)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fmashup = (org.sociotech.communitymashup.application.Mashup)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Source.setFeature", "org.sociotech.communitymashup.application.Mashup",value.getClass().getName());
				}
				this.setMashup(fmashup);
			return this;
			}			
		super.setFeature(featureName, value);
		return this; 
	}

	/**
	 * REST
	 * @generated
	 */
	protected Object doOperation(RestCommand command) throws WrongArgException, WrongArgCountException, UnknownOperationException, ArgNotFoundException {
		if ( command.getCommand().equalsIgnoreCase("getLogLevelIntValue")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Source.doOperation", 0, command.getArgCount()); 
			return this.getLogLevelIntValue();
		}
		if ( command.getCommand().equalsIgnoreCase("start")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Source.doOperation", 0, command.getArgCount()); 
				this.start();
				return this;
				}
		if ( command.getCommand().equalsIgnoreCase("stop")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Source.doOperation", 0, command.getArgCount()); 
				this.stop();
				return this;
				}
		if ( command.getCommand().equalsIgnoreCase("pause")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Source.doOperation", 0, command.getArgCount()); 
				this.pause();
				return this;
				}	
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

} //SourceImpl
