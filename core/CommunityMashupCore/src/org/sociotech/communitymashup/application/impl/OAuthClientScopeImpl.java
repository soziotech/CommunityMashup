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
 * An implementation of the model object '<em><b>OAuth Client Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getPositiveTag <em>Positive Tag</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getNegativeTag <em>Negative Tag</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getPositiveMetaTag <em>Positive Meta Tag</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getNegativeMetaTag <em>Negative Meta Tag</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getPositiveCategory <em>Positive Category</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getNegativeCategory <em>Negative Category</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getPositivePerson <em>Positive Person</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getNegativePerson <em>Negative Person</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getPositiveOrganisation <em>Positive Organisation</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getNegativeOrganisation <em>Negative Organisation</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getIdentSpecification <em>Ident Specification</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getAllowPersons <em>Allow Persons</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getAllowContents <em>Allow Contents</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getAllowOrganisations <em>Allow Organisations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl#getMaximumAge <em>Maximum Age</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OAuthClientScopeImpl extends EObjectImpl implements OAuthClientScope {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The default value of the '{@link #getPositiveTag() <em>Positive Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveTag()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIVE_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositiveTag() <em>Positive Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveTag()
	 * @generated
	 * @ordered
	 */
	protected String positiveTag = POSITIVE_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegativeTag() <em>Negative Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeTag()
	 * @generated
	 * @ordered
	 */
	protected static final String NEGATIVE_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegativeTag() <em>Negative Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeTag()
	 * @generated
	 * @ordered
	 */
	protected String negativeTag = NEGATIVE_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositiveMetaTag() <em>Positive Meta Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveMetaTag()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIVE_META_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositiveMetaTag() <em>Positive Meta Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveMetaTag()
	 * @generated
	 * @ordered
	 */
	protected String positiveMetaTag = POSITIVE_META_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegativeMetaTag() <em>Negative Meta Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeMetaTag()
	 * @generated
	 * @ordered
	 */
	protected static final String NEGATIVE_META_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegativeMetaTag() <em>Negative Meta Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeMetaTag()
	 * @generated
	 * @ordered
	 */
	protected String negativeMetaTag = NEGATIVE_META_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositiveCategory() <em>Positive Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIVE_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositiveCategory() <em>Positive Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveCategory()
	 * @generated
	 * @ordered
	 */
	protected String positiveCategory = POSITIVE_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegativeCategory() <em>Negative Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String NEGATIVE_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegativeCategory() <em>Negative Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeCategory()
	 * @generated
	 * @ordered
	 */
	protected String negativeCategory = NEGATIVE_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositivePerson() <em>Positive Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositivePerson()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIVE_PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositivePerson() <em>Positive Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositivePerson()
	 * @generated
	 * @ordered
	 */
	protected String positivePerson = POSITIVE_PERSON_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegativePerson() <em>Negative Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativePerson()
	 * @generated
	 * @ordered
	 */
	protected static final String NEGATIVE_PERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegativePerson() <em>Negative Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativePerson()
	 * @generated
	 * @ordered
	 */
	protected String negativePerson = NEGATIVE_PERSON_EDEFAULT;

	/**
	 * The default value of the '{@link #getPositiveOrganisation() <em>Positive Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveOrganisation()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITIVE_ORGANISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPositiveOrganisation() <em>Positive Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositiveOrganisation()
	 * @generated
	 * @ordered
	 */
	protected String positiveOrganisation = POSITIVE_ORGANISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNegativeOrganisation() <em>Negative Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeOrganisation()
	 * @generated
	 * @ordered
	 */
	protected static final String NEGATIVE_ORGANISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNegativeOrganisation() <em>Negative Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegativeOrganisation()
	 * @generated
	 * @ordered
	 */
	protected String negativeOrganisation = NEGATIVE_ORGANISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentSpecification() <em>Ident Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IDENT_SPECIFICATION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIdentSpecification() <em>Ident Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentSpecification()
	 * @generated
	 * @ordered
	 */
	protected Boolean identSpecification = IDENT_SPECIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowPersons() <em>Allow Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowPersons()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_PERSONS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowPersons() <em>Allow Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowPersons()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowPersons = ALLOW_PERSONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowContents() <em>Allow Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowContents()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_CONTENTS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowContents() <em>Allow Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowContents()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowContents = ALLOW_CONTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowOrganisations() <em>Allow Organisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowOrganisations()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_ORGANISATIONS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAllowOrganisations() <em>Allow Organisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowOrganisations()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowOrganisations = ALLOW_ORGANISATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumAge() <em>Maximum Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAge()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_AGE_EDEFAULT = "true";

	/**
	 * The cached value of the '{@link #getMaximumAge() <em>Maximum Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumAge()
	 * @generated
	 * @ordered
	 */
	protected String maximumAge = MAXIMUM_AGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OAuthClientScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.OAUTH_CLIENT_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositiveTag() {
		return positiveTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveTag(String newPositiveTag) {
		String oldPositiveTag = positiveTag;
		positiveTag = newPositiveTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_TAG, oldPositiveTag, positiveTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNegativeTag() {
		return negativeTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegativeTag(String newNegativeTag) {
		String oldNegativeTag = negativeTag;
		negativeTag = newNegativeTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_TAG, oldNegativeTag, negativeTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositiveMetaTag() {
		return positiveMetaTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveMetaTag(String newPositiveMetaTag) {
		String oldPositiveMetaTag = positiveMetaTag;
		positiveMetaTag = newPositiveMetaTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_META_TAG, oldPositiveMetaTag, positiveMetaTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNegativeMetaTag() {
		return negativeMetaTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegativeMetaTag(String newNegativeMetaTag) {
		String oldNegativeMetaTag = negativeMetaTag;
		negativeMetaTag = newNegativeMetaTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_META_TAG, oldNegativeMetaTag, negativeMetaTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositiveCategory() {
		return positiveCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveCategory(String newPositiveCategory) {
		String oldPositiveCategory = positiveCategory;
		positiveCategory = newPositiveCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_CATEGORY, oldPositiveCategory, positiveCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNegativeCategory() {
		return negativeCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegativeCategory(String newNegativeCategory) {
		String oldNegativeCategory = negativeCategory;
		negativeCategory = newNegativeCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_CATEGORY, oldNegativeCategory, negativeCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositivePerson() {
		return positivePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositivePerson(String newPositivePerson) {
		String oldPositivePerson = positivePerson;
		positivePerson = newPositivePerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_PERSON, oldPositivePerson, positivePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNegativePerson() {
		return negativePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegativePerson(String newNegativePerson) {
		String oldNegativePerson = negativePerson;
		negativePerson = newNegativePerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_PERSON, oldNegativePerson, negativePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPositiveOrganisation() {
		return positiveOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositiveOrganisation(String newPositiveOrganisation) {
		String oldPositiveOrganisation = positiveOrganisation;
		positiveOrganisation = newPositiveOrganisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_ORGANISATION, oldPositiveOrganisation, positiveOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNegativeOrganisation() {
		return negativeOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegativeOrganisation(String newNegativeOrganisation) {
		String oldNegativeOrganisation = negativeOrganisation;
		negativeOrganisation = newNegativeOrganisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_ORGANISATION, oldNegativeOrganisation, negativeOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIdentSpecification() {
		return identSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentSpecification(Boolean newIdentSpecification) {
		Boolean oldIdentSpecification = identSpecification;
		identSpecification = newIdentSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__IDENT_SPECIFICATION, oldIdentSpecification, identSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowPersons() {
		return allowPersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowPersons(Boolean newAllowPersons) {
		Boolean oldAllowPersons = allowPersons;
		allowPersons = newAllowPersons;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_PERSONS, oldAllowPersons, allowPersons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowContents() {
		return allowContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowContents(Boolean newAllowContents) {
		Boolean oldAllowContents = allowContents;
		allowContents = newAllowContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_CONTENTS, oldAllowContents, allowContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowOrganisations() {
		return allowOrganisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowOrganisations(Boolean newAllowOrganisations) {
		Boolean oldAllowOrganisations = allowOrganisations;
		allowOrganisations = newAllowOrganisations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_ORGANISATIONS, oldAllowOrganisations, allowOrganisations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumAge() {
		return maximumAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumAge(String newMaximumAge) {
		String oldMaximumAge = maximumAge;
		maximumAge = newMaximumAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_SCOPE__MAXIMUM_AGE, oldMaximumAge, maximumAge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_TAG:
				return getPositiveTag();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_TAG:
				return getNegativeTag();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_META_TAG:
				return getPositiveMetaTag();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_META_TAG:
				return getNegativeMetaTag();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_CATEGORY:
				return getPositiveCategory();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_CATEGORY:
				return getNegativeCategory();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_PERSON:
				return getPositivePerson();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_PERSON:
				return getNegativePerson();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_ORGANISATION:
				return getPositiveOrganisation();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_ORGANISATION:
				return getNegativeOrganisation();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__IDENT_SPECIFICATION:
				return getIdentSpecification();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_PERSONS:
				return getAllowPersons();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_CONTENTS:
				return getAllowContents();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_ORGANISATIONS:
				return getAllowOrganisations();
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__MAXIMUM_AGE:
				return getMaximumAge();
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
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_TAG:
				setPositiveTag((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_TAG:
				setNegativeTag((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_META_TAG:
				setPositiveMetaTag((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_META_TAG:
				setNegativeMetaTag((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_CATEGORY:
				setPositiveCategory((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_CATEGORY:
				setNegativeCategory((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_PERSON:
				setPositivePerson((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_PERSON:
				setNegativePerson((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_ORGANISATION:
				setPositiveOrganisation((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_ORGANISATION:
				setNegativeOrganisation((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__IDENT_SPECIFICATION:
				setIdentSpecification((Boolean)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_PERSONS:
				setAllowPersons((Boolean)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_CONTENTS:
				setAllowContents((Boolean)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_ORGANISATIONS:
				setAllowOrganisations((Boolean)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__MAXIMUM_AGE:
				setMaximumAge((String)newValue);
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
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_TAG:
				setPositiveTag(POSITIVE_TAG_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_TAG:
				setNegativeTag(NEGATIVE_TAG_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_META_TAG:
				setPositiveMetaTag(POSITIVE_META_TAG_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_META_TAG:
				setNegativeMetaTag(NEGATIVE_META_TAG_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_CATEGORY:
				setPositiveCategory(POSITIVE_CATEGORY_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_CATEGORY:
				setNegativeCategory(NEGATIVE_CATEGORY_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_PERSON:
				setPositivePerson(POSITIVE_PERSON_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_PERSON:
				setNegativePerson(NEGATIVE_PERSON_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_ORGANISATION:
				setPositiveOrganisation(POSITIVE_ORGANISATION_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_ORGANISATION:
				setNegativeOrganisation(NEGATIVE_ORGANISATION_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__IDENT_SPECIFICATION:
				setIdentSpecification(IDENT_SPECIFICATION_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_PERSONS:
				setAllowPersons(ALLOW_PERSONS_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_CONTENTS:
				setAllowContents(ALLOW_CONTENTS_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_ORGANISATIONS:
				setAllowOrganisations(ALLOW_ORGANISATIONS_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__MAXIMUM_AGE:
				setMaximumAge(MAXIMUM_AGE_EDEFAULT);
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
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_TAG:
				return POSITIVE_TAG_EDEFAULT == null ? positiveTag != null : !POSITIVE_TAG_EDEFAULT.equals(positiveTag);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_TAG:
				return NEGATIVE_TAG_EDEFAULT == null ? negativeTag != null : !NEGATIVE_TAG_EDEFAULT.equals(negativeTag);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_META_TAG:
				return POSITIVE_META_TAG_EDEFAULT == null ? positiveMetaTag != null : !POSITIVE_META_TAG_EDEFAULT.equals(positiveMetaTag);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_META_TAG:
				return NEGATIVE_META_TAG_EDEFAULT == null ? negativeMetaTag != null : !NEGATIVE_META_TAG_EDEFAULT.equals(negativeMetaTag);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_CATEGORY:
				return POSITIVE_CATEGORY_EDEFAULT == null ? positiveCategory != null : !POSITIVE_CATEGORY_EDEFAULT.equals(positiveCategory);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_CATEGORY:
				return NEGATIVE_CATEGORY_EDEFAULT == null ? negativeCategory != null : !NEGATIVE_CATEGORY_EDEFAULT.equals(negativeCategory);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_PERSON:
				return POSITIVE_PERSON_EDEFAULT == null ? positivePerson != null : !POSITIVE_PERSON_EDEFAULT.equals(positivePerson);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_PERSON:
				return NEGATIVE_PERSON_EDEFAULT == null ? negativePerson != null : !NEGATIVE_PERSON_EDEFAULT.equals(negativePerson);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__POSITIVE_ORGANISATION:
				return POSITIVE_ORGANISATION_EDEFAULT == null ? positiveOrganisation != null : !POSITIVE_ORGANISATION_EDEFAULT.equals(positiveOrganisation);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__NEGATIVE_ORGANISATION:
				return NEGATIVE_ORGANISATION_EDEFAULT == null ? negativeOrganisation != null : !NEGATIVE_ORGANISATION_EDEFAULT.equals(negativeOrganisation);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__IDENT_SPECIFICATION:
				return IDENT_SPECIFICATION_EDEFAULT == null ? identSpecification != null : !IDENT_SPECIFICATION_EDEFAULT.equals(identSpecification);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_PERSONS:
				return ALLOW_PERSONS_EDEFAULT == null ? allowPersons != null : !ALLOW_PERSONS_EDEFAULT.equals(allowPersons);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_CONTENTS:
				return ALLOW_CONTENTS_EDEFAULT == null ? allowContents != null : !ALLOW_CONTENTS_EDEFAULT.equals(allowContents);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__ALLOW_ORGANISATIONS:
				return ALLOW_ORGANISATIONS_EDEFAULT == null ? allowOrganisations != null : !ALLOW_ORGANISATIONS_EDEFAULT.equals(allowOrganisations);
			case ApplicationPackage.OAUTH_CLIENT_SCOPE__MAXIMUM_AGE:
				return MAXIMUM_AGE_EDEFAULT == null ? maximumAge != null : !MAXIMUM_AGE_EDEFAULT.equals(maximumAge);
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
		result.append(" (positiveTag: ");
		result.append(positiveTag);
		result.append(", negativeTag: ");
		result.append(negativeTag);
		result.append(", positiveMetaTag: ");
		result.append(positiveMetaTag);
		result.append(", negativeMetaTag: ");
		result.append(negativeMetaTag);
		result.append(", positiveCategory: ");
		result.append(positiveCategory);
		result.append(", negativeCategory: ");
		result.append(negativeCategory);
		result.append(", positivePerson: ");
		result.append(positivePerson);
		result.append(", negativePerson: ");
		result.append(negativePerson);
		result.append(", positiveOrganisation: ");
		result.append(positiveOrganisation);
		result.append(", negativeOrganisation: ");
		result.append(negativeOrganisation);
		result.append(", identSpecification: ");
		result.append(identSpecification);
		result.append(", allowPersons: ");
		result.append(allowPersons);
		result.append(", allowContents: ");
		result.append(allowContents);
		result.append(", allowOrganisations: ");
		result.append(allowOrganisations);
		result.append(", maximumAge: ");
		result.append(maximumAge);
		result.append(')');
		return result.toString();
	}


	/**
	 * Generates an EObjectCondition to check whether an Object is of the type OAuthClientScope.
	 * 
	 * @return An EObjectCondition whether the Object is of the type OAuthClientScope.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(ApplicationPackageImpl.eINSTANCE.getOAuthClientScope());
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
		if ( featureName.equalsIgnoreCase("positiveTag") )
			return this.getPositiveTag();		
		if ( featureName.equalsIgnoreCase("negativeTag") )
			return this.getNegativeTag();		
		if ( featureName.equalsIgnoreCase("positiveMetaTag") )
			return this.getPositiveMetaTag();		
		if ( featureName.equalsIgnoreCase("negativeMetaTag") )
			return this.getNegativeMetaTag();		
		if ( featureName.equalsIgnoreCase("positiveCategory") )
			return this.getPositiveCategory();		
		if ( featureName.equalsIgnoreCase("negativeCategory") )
			return this.getNegativeCategory();		
		if ( featureName.equalsIgnoreCase("positivePerson") )
			return this.getPositivePerson();		
		if ( featureName.equalsIgnoreCase("negativePerson") )
			return this.getNegativePerson();		
		if ( featureName.equalsIgnoreCase("positiveOrganisation") )
			return this.getPositiveOrganisation();		
		if ( featureName.equalsIgnoreCase("negativeOrganisation") )
			return this.getNegativeOrganisation();		
		if ( featureName.equalsIgnoreCase("identSpecification") )
			return this.getIdentSpecification();		
		if ( featureName.equalsIgnoreCase("allowPersons") )
			return this.getAllowPersons();		
		if ( featureName.equalsIgnoreCase("allowContents") )
			return this.getAllowContents();		
		if ( featureName.equalsIgnoreCase("allowOrganisations") )
			return this.getAllowOrganisations();		
		if ( featureName.equalsIgnoreCase("maximumAge") )
			return this.getMaximumAge();		
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
		if ( featureName.equalsIgnoreCase("positiveTag") ) {
				java.lang.String fpositiveTag = null;
				try {
					fpositiveTag = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setPositiveTag(fpositiveTag);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("negativeTag") ) {
				java.lang.String fnegativeTag = null;
				try {
					fnegativeTag = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setNegativeTag(fnegativeTag);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("positiveMetaTag") ) {
				java.lang.String fpositiveMetaTag = null;
				try {
					fpositiveMetaTag = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setPositiveMetaTag(fpositiveMetaTag);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("negativeMetaTag") ) {
				java.lang.String fnegativeMetaTag = null;
				try {
					fnegativeMetaTag = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setNegativeMetaTag(fnegativeMetaTag);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("positiveCategory") ) {
				java.lang.String fpositiveCategory = null;
				try {
					fpositiveCategory = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setPositiveCategory(fpositiveCategory);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("negativeCategory") ) {
				java.lang.String fnegativeCategory = null;
				try {
					fnegativeCategory = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setNegativeCategory(fnegativeCategory);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("positivePerson") ) {
				java.lang.String fpositivePerson = null;
				try {
					fpositivePerson = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setPositivePerson(fpositivePerson);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("negativePerson") ) {
				java.lang.String fnegativePerson = null;
				try {
					fnegativePerson = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setNegativePerson(fnegativePerson);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("positiveOrganisation") ) {
				java.lang.String fpositiveOrganisation = null;
				try {
					fpositiveOrganisation = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setPositiveOrganisation(fpositiveOrganisation);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("negativeOrganisation") ) {
				java.lang.String fnegativeOrganisation = null;
				try {
					fnegativeOrganisation = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setNegativeOrganisation(fnegativeOrganisation);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("identSpecification") ) {
				java.lang.Boolean fidentSpecification = null;
				try {
					try {
						fidentSpecification = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fidentSpecification = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setIdentSpecification(fidentSpecification);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("allowPersons") ) {
				java.lang.Boolean fallowPersons = null;
				try {
					try {
						fallowPersons = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fallowPersons = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setAllowPersons(fallowPersons);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("allowContents") ) {
				java.lang.Boolean fallowContents = null;
				try {
					try {
						fallowContents = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fallowContents = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setAllowContents(fallowContents);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("allowOrganisations") ) {
				java.lang.Boolean fallowOrganisations = null;
				try {
					try {
						fallowOrganisations = (java.lang.Boolean)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fallowOrganisations = (java.lang.Boolean)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.Boolean",value.getClass().getName());
				}
				this.setAllowOrganisations(fallowOrganisations);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("maximumAge") ) {
				java.lang.String fmaximumAge = null;
				try {
					fmaximumAge = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientScope.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setMaximumAge(fmaximumAge);
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
} //OAuthClientScopeImpl
