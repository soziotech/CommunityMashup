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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 * An implementation of the model object '<em><b>FEED Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl#getAllowPersonFiltering <em>Allow Person Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl#getAllowOrganisationFiltering <em>Allow Organisation Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl#getAllowTypeFiltering <em>Allow Type Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl#getAllowTagFiltering <em>Allow Tag Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl#getAllowMetaTagFiltering <em>Allow Meta Tag Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl#getAllowCategoryFiltering <em>Allow Category Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl#getFeedType <em>Feed Type</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl#getFeedTitle <em>Feed Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FEEDInterfaceImpl extends InterfaceImpl implements FEEDInterface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The default value of the '{@link #getAllowPersonFiltering() <em>Allow Person Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowPersonFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_PERSON_FILTERING_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowPersonFiltering() <em>Allow Person Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowPersonFiltering()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowPersonFiltering = ALLOW_PERSON_FILTERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowOrganisationFiltering() <em>Allow Organisation Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowOrganisationFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_ORGANISATION_FILTERING_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowOrganisationFiltering() <em>Allow Organisation Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowOrganisationFiltering()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowOrganisationFiltering = ALLOW_ORGANISATION_FILTERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowTypeFiltering() <em>Allow Type Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowTypeFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_TYPE_FILTERING_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowTypeFiltering() <em>Allow Type Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowTypeFiltering()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowTypeFiltering = ALLOW_TYPE_FILTERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowTagFiltering() <em>Allow Tag Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowTagFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_TAG_FILTERING_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowTagFiltering() <em>Allow Tag Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowTagFiltering()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowTagFiltering = ALLOW_TAG_FILTERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowMetaTagFiltering() <em>Allow Meta Tag Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMetaTagFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_META_TAG_FILTERING_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowMetaTagFiltering() <em>Allow Meta Tag Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMetaTagFiltering()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowMetaTagFiltering = ALLOW_META_TAG_FILTERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowCategoryFiltering() <em>Allow Category Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowCategoryFiltering()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_CATEGORY_FILTERING_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowCategoryFiltering() <em>Allow Category Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowCategoryFiltering()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowCategoryFiltering = ALLOW_CATEGORY_FILTERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = "de";

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeedType() <em>Feed Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedType()
	 * @generated
	 * @ordered
	 */
	protected static final String FEED_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeedType() <em>Feed Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedType()
	 * @generated
	 * @ordered
	 */
	protected String feedType = FEED_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeedTitle() <em>Feed Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String FEED_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeedTitle() <em>Feed Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedTitle()
	 * @generated
	 * @ordered
	 */
	protected String feedTitle = FEED_TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FEEDInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.FEED_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowPersonFiltering() {
		return allowPersonFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowPersonFiltering(Boolean newAllowPersonFiltering) {
		Boolean oldAllowPersonFiltering = allowPersonFiltering;
		allowPersonFiltering = newAllowPersonFiltering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.FEED_INTERFACE__ALLOW_PERSON_FILTERING, oldAllowPersonFiltering, allowPersonFiltering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowOrganisationFiltering() {
		return allowOrganisationFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowOrganisationFiltering(Boolean newAllowOrganisationFiltering) {
		Boolean oldAllowOrganisationFiltering = allowOrganisationFiltering;
		allowOrganisationFiltering = newAllowOrganisationFiltering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.FEED_INTERFACE__ALLOW_ORGANISATION_FILTERING, oldAllowOrganisationFiltering, allowOrganisationFiltering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowTypeFiltering() {
		return allowTypeFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowTypeFiltering(Boolean newAllowTypeFiltering) {
		Boolean oldAllowTypeFiltering = allowTypeFiltering;
		allowTypeFiltering = newAllowTypeFiltering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.FEED_INTERFACE__ALLOW_TYPE_FILTERING, oldAllowTypeFiltering, allowTypeFiltering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowTagFiltering() {
		return allowTagFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowTagFiltering(Boolean newAllowTagFiltering) {
		Boolean oldAllowTagFiltering = allowTagFiltering;
		allowTagFiltering = newAllowTagFiltering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.FEED_INTERFACE__ALLOW_TAG_FILTERING, oldAllowTagFiltering, allowTagFiltering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowMetaTagFiltering() {
		return allowMetaTagFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowMetaTagFiltering(Boolean newAllowMetaTagFiltering) {
		Boolean oldAllowMetaTagFiltering = allowMetaTagFiltering;
		allowMetaTagFiltering = newAllowMetaTagFiltering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.FEED_INTERFACE__ALLOW_META_TAG_FILTERING, oldAllowMetaTagFiltering, allowMetaTagFiltering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowCategoryFiltering() {
		return allowCategoryFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowCategoryFiltering(Boolean newAllowCategoryFiltering) {
		Boolean oldAllowCategoryFiltering = allowCategoryFiltering;
		allowCategoryFiltering = newAllowCategoryFiltering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.FEED_INTERFACE__ALLOW_CATEGORY_FILTERING, oldAllowCategoryFiltering, allowCategoryFiltering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.FEED_INTERFACE__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeedType() {
		return feedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedType(String newFeedType) {
		String oldFeedType = feedType;
		feedType = newFeedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.FEED_INTERFACE__FEED_TYPE, oldFeedType, feedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeedTitle() {
		return feedTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedTitle(String newFeedTitle) {
		String oldFeedTitle = feedTitle;
		feedTitle = newFeedTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.FEED_INTERFACE__FEED_TITLE, oldFeedTitle, feedTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.FEED_INTERFACE__ALLOW_PERSON_FILTERING:
				return getAllowPersonFiltering();
			case ApplicationPackage.FEED_INTERFACE__ALLOW_ORGANISATION_FILTERING:
				return getAllowOrganisationFiltering();
			case ApplicationPackage.FEED_INTERFACE__ALLOW_TYPE_FILTERING:
				return getAllowTypeFiltering();
			case ApplicationPackage.FEED_INTERFACE__ALLOW_TAG_FILTERING:
				return getAllowTagFiltering();
			case ApplicationPackage.FEED_INTERFACE__ALLOW_META_TAG_FILTERING:
				return getAllowMetaTagFiltering();
			case ApplicationPackage.FEED_INTERFACE__ALLOW_CATEGORY_FILTERING:
				return getAllowCategoryFiltering();
			case ApplicationPackage.FEED_INTERFACE__LANGUAGE:
				return getLanguage();
			case ApplicationPackage.FEED_INTERFACE__FEED_TYPE:
				return getFeedType();
			case ApplicationPackage.FEED_INTERFACE__FEED_TITLE:
				return getFeedTitle();
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
			case ApplicationPackage.FEED_INTERFACE__ALLOW_PERSON_FILTERING:
				setAllowPersonFiltering((Boolean)newValue);
				return;
			case ApplicationPackage.FEED_INTERFACE__ALLOW_ORGANISATION_FILTERING:
				setAllowOrganisationFiltering((Boolean)newValue);
				return;
			case ApplicationPackage.FEED_INTERFACE__ALLOW_TYPE_FILTERING:
				setAllowTypeFiltering((Boolean)newValue);
				return;
			case ApplicationPackage.FEED_INTERFACE__ALLOW_TAG_FILTERING:
				setAllowTagFiltering((Boolean)newValue);
				return;
			case ApplicationPackage.FEED_INTERFACE__ALLOW_META_TAG_FILTERING:
				setAllowMetaTagFiltering((Boolean)newValue);
				return;
			case ApplicationPackage.FEED_INTERFACE__ALLOW_CATEGORY_FILTERING:
				setAllowCategoryFiltering((Boolean)newValue);
				return;
			case ApplicationPackage.FEED_INTERFACE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case ApplicationPackage.FEED_INTERFACE__FEED_TYPE:
				setFeedType((String)newValue);
				return;
			case ApplicationPackage.FEED_INTERFACE__FEED_TITLE:
				setFeedTitle((String)newValue);
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
			case ApplicationPackage.FEED_INTERFACE__ALLOW_PERSON_FILTERING:
				setAllowPersonFiltering(ALLOW_PERSON_FILTERING_EDEFAULT);
				return;
			case ApplicationPackage.FEED_INTERFACE__ALLOW_ORGANISATION_FILTERING:
				setAllowOrganisationFiltering(ALLOW_ORGANISATION_FILTERING_EDEFAULT);
				return;
			case ApplicationPackage.FEED_INTERFACE__ALLOW_TYPE_FILTERING:
				setAllowTypeFiltering(ALLOW_TYPE_FILTERING_EDEFAULT);
				return;
			case ApplicationPackage.FEED_INTERFACE__ALLOW_TAG_FILTERING:
				setAllowTagFiltering(ALLOW_TAG_FILTERING_EDEFAULT);
				return;
			case ApplicationPackage.FEED_INTERFACE__ALLOW_META_TAG_FILTERING:
				setAllowMetaTagFiltering(ALLOW_META_TAG_FILTERING_EDEFAULT);
				return;
			case ApplicationPackage.FEED_INTERFACE__ALLOW_CATEGORY_FILTERING:
				setAllowCategoryFiltering(ALLOW_CATEGORY_FILTERING_EDEFAULT);
				return;
			case ApplicationPackage.FEED_INTERFACE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case ApplicationPackage.FEED_INTERFACE__FEED_TYPE:
				setFeedType(FEED_TYPE_EDEFAULT);
				return;
			case ApplicationPackage.FEED_INTERFACE__FEED_TITLE:
				setFeedTitle(FEED_TITLE_EDEFAULT);
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
			case ApplicationPackage.FEED_INTERFACE__ALLOW_PERSON_FILTERING:
				return ALLOW_PERSON_FILTERING_EDEFAULT == null ? allowPersonFiltering != null : !ALLOW_PERSON_FILTERING_EDEFAULT.equals(allowPersonFiltering);
			case ApplicationPackage.FEED_INTERFACE__ALLOW_ORGANISATION_FILTERING:
				return ALLOW_ORGANISATION_FILTERING_EDEFAULT == null ? allowOrganisationFiltering != null : !ALLOW_ORGANISATION_FILTERING_EDEFAULT.equals(allowOrganisationFiltering);
			case ApplicationPackage.FEED_INTERFACE__ALLOW_TYPE_FILTERING:
				return ALLOW_TYPE_FILTERING_EDEFAULT == null ? allowTypeFiltering != null : !ALLOW_TYPE_FILTERING_EDEFAULT.equals(allowTypeFiltering);
			case ApplicationPackage.FEED_INTERFACE__ALLOW_TAG_FILTERING:
				return ALLOW_TAG_FILTERING_EDEFAULT == null ? allowTagFiltering != null : !ALLOW_TAG_FILTERING_EDEFAULT.equals(allowTagFiltering);
			case ApplicationPackage.FEED_INTERFACE__ALLOW_META_TAG_FILTERING:
				return ALLOW_META_TAG_FILTERING_EDEFAULT == null ? allowMetaTagFiltering != null : !ALLOW_META_TAG_FILTERING_EDEFAULT.equals(allowMetaTagFiltering);
			case ApplicationPackage.FEED_INTERFACE__ALLOW_CATEGORY_FILTERING:
				return ALLOW_CATEGORY_FILTERING_EDEFAULT == null ? allowCategoryFiltering != null : !ALLOW_CATEGORY_FILTERING_EDEFAULT.equals(allowCategoryFiltering);
			case ApplicationPackage.FEED_INTERFACE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case ApplicationPackage.FEED_INTERFACE__FEED_TYPE:
				return FEED_TYPE_EDEFAULT == null ? feedType != null : !FEED_TYPE_EDEFAULT.equals(feedType);
			case ApplicationPackage.FEED_INTERFACE__FEED_TITLE:
				return FEED_TITLE_EDEFAULT == null ? feedTitle != null : !FEED_TITLE_EDEFAULT.equals(feedTitle);
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
		result.append(" (allowPersonFiltering: ");
		result.append(allowPersonFiltering);
		result.append(", allowOrganisationFiltering: ");
		result.append(allowOrganisationFiltering);
		result.append(", allowTypeFiltering: ");
		result.append(allowTypeFiltering);
		result.append(", allowTagFiltering: ");
		result.append(allowTagFiltering);
		result.append(", allowMetaTagFiltering: ");
		result.append(allowMetaTagFiltering);
		result.append(", allowCategoryFiltering: ");
		result.append(allowCategoryFiltering);
		result.append(", language: ");
		result.append(language);
		result.append(", feedType: ");
		result.append(feedType);
		result.append(", feedTitle: ");
		result.append(feedTitle);
		result.append(')');
		return result.toString();
	}


	/**
	 * Generates an EObjectCondition to check whether an Object is of the type FEEDInterface.
	 * 
	 * @return An EObjectCondition whether the Object is of the type FEEDInterface.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(ApplicationPackageImpl.eINSTANCE.getFEEDInterface());
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
		if ( featureName.equalsIgnoreCase("allowPersonFiltering") )
			return this.getAllowPersonFiltering();		
		if ( featureName.equalsIgnoreCase("allowOrganisationFiltering") )
			return this.getAllowOrganisationFiltering();		
		if ( featureName.equalsIgnoreCase("allowTypeFiltering") )
			return this.getAllowTypeFiltering();		
		if ( featureName.equalsIgnoreCase("allowTagFiltering") )
			return this.getAllowTagFiltering();		
		if ( featureName.equalsIgnoreCase("allowMetaTagFiltering") )
			return this.getAllowMetaTagFiltering();		
		if ( featureName.equalsIgnoreCase("allowCategoryFiltering") )
			return this.getAllowCategoryFiltering();		
		if ( featureName.equalsIgnoreCase("language") )
			return this.getLanguage();		
		if ( featureName.equalsIgnoreCase("feedType") )
			return this.getFeedType();		
		if ( featureName.equalsIgnoreCase("feedTitle") )
			return this.getFeedTitle();			
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
		if ( featureName.equalsIgnoreCase("allowPersonFiltering") ) {
				java.lang.Boolean fallowPersonFiltering = null;
				try {
					try {
						fallowPersonFiltering = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fallowPersonFiltering = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("FEEDInterface.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setAllowPersonFiltering(fallowPersonFiltering);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("allowOrganisationFiltering") ) {
				java.lang.Boolean fallowOrganisationFiltering = null;
				try {
					try {
						fallowOrganisationFiltering = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fallowOrganisationFiltering = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("FEEDInterface.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setAllowOrganisationFiltering(fallowOrganisationFiltering);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("allowTypeFiltering") ) {
				java.lang.Boolean fallowTypeFiltering = null;
				try {
					try {
						fallowTypeFiltering = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fallowTypeFiltering = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("FEEDInterface.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setAllowTypeFiltering(fallowTypeFiltering);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("allowTagFiltering") ) {
				java.lang.Boolean fallowTagFiltering = null;
				try {
					try {
						fallowTagFiltering = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fallowTagFiltering = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("FEEDInterface.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setAllowTagFiltering(fallowTagFiltering);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("allowMetaTagFiltering") ) {
				java.lang.Boolean fallowMetaTagFiltering = null;
				try {
					try {
						fallowMetaTagFiltering = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fallowMetaTagFiltering = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("FEEDInterface.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setAllowMetaTagFiltering(fallowMetaTagFiltering);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("allowCategoryFiltering") ) {
				java.lang.Boolean fallowCategoryFiltering = null;
				try {
					try {
						fallowCategoryFiltering = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fallowCategoryFiltering = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("FEEDInterface.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setAllowCategoryFiltering(fallowCategoryFiltering);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("language") ) {
				java.lang.String flanguage = null;
				try {
					flanguage = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("FEEDInterface.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setLanguage(flanguage);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("feedType") ) {
				java.lang.String ffeedType = null;
				try {
					ffeedType = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("FEEDInterface.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setFeedType(ffeedType);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("feedTitle") ) {
				java.lang.String ffeedTitle = null;
				try {
					ffeedTitle = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("FEEDInterface.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setFeedTitle(ffeedTitle);
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
} //FEEDInterfaceImpl
