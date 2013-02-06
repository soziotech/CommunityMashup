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

import java.util.Date;
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
 * An implementation of the model object '<em><b>OAuth Client Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getRedirectionURL <em>Redirection URL</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getClientID <em>Client ID</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getClientSecret <em>Client Secret</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getGrantType <em>Grant Type</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getRefreshToken <em>Refresh Token</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getAccessTokenCreationDate <em>Access Token Creation Date</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getAccessTokenExpirationDate <em>Access Token Expiration Date</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getForbiddenMetaTags <em>Forbidden Meta Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getAllowedMetaTags <em>Allowed Meta Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getClientScope <em>Client Scope</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl#getOAuthScopeLevel <em>OAuth Scope Level</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OAuthClientConfigImpl extends EObjectImpl implements OAuthClientConfig {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRedirectionURL() <em>Redirection URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectionURL()
	 * @generated
	 * @ordered
	 */
	protected static final String REDIRECTION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRedirectionURL() <em>Redirection URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedirectionURL()
	 * @generated
	 * @ordered
	 */
	protected String redirectionURL = REDIRECTION_URL_EDEFAULT;

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
	 * The default value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientID()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientID() <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientID()
	 * @generated
	 * @ordered
	 */
	protected String clientID = CLIENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClientSecret() <em>Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSecret()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_SECRET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientSecret() <em>Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientSecret()
	 * @generated
	 * @ordered
	 */
	protected String clientSecret = CLIENT_SECRET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrantType() <em>Grant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrantType()
	 * @generated
	 * @ordered
	 */
	protected static final String GRANT_TYPE_EDEFAULT = "AuthorizationCode";

	/**
	 * The cached value of the '{@link #getGrantType() <em>Grant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrantType()
	 * @generated
	 * @ordered
	 */
	protected String grantType = GRANT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshToken() <em>Refresh Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshToken()
	 * @generated
	 * @ordered
	 */
	protected static final String REFRESH_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefreshToken() <em>Refresh Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshToken()
	 * @generated
	 * @ordered
	 */
	protected String refreshToken = REFRESH_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessToken() <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessToken()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessToken() <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessToken()
	 * @generated
	 * @ordered
	 */
	protected String accessToken = ACCESS_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessTokenCreationDate() <em>Access Token Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTokenCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACCESS_TOKEN_CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessTokenCreationDate() <em>Access Token Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTokenCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date accessTokenCreationDate = ACCESS_TOKEN_CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessTokenExpirationDate() <em>Access Token Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTokenExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACCESS_TOKEN_EXPIRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessTokenExpirationDate() <em>Access Token Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTokenExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected Date accessTokenExpirationDate = ACCESS_TOKEN_EXPIRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getForbiddenMetaTags() <em>Forbidden Meta Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForbiddenMetaTags()
	 * @generated
	 * @ordered
	 */
	protected static final String FORBIDDEN_META_TAGS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getForbiddenMetaTags() <em>Forbidden Meta Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForbiddenMetaTags()
	 * @generated
	 * @ordered
	 */
	protected String forbiddenMetaTags = FORBIDDEN_META_TAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowedMetaTags() <em>Allowed Meta Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedMetaTags()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_META_TAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedMetaTags() <em>Allowed Meta Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedMetaTags()
	 * @generated
	 * @ordered
	 */
	protected String allowedMetaTags = ALLOWED_META_TAGS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClientScope() <em>Client Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientScope()
	 * @generated
	 * @ordered
	 */
	protected OAuthClientScope clientScope;

	/**
	 * The default value of the '{@link #getOAuthScopeLevel() <em>OAuth Scope Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOAuthScopeLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OAUTH_SCOPE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOAuthScopeLevel() <em>OAuth Scope Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOAuthScopeLevel()
	 * @generated
	 * @ordered
	 */
	protected Integer oAuthScopeLevel = OAUTH_SCOPE_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OAuthClientConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.OAUTH_CLIENT_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRedirectionURL() {
		return redirectionURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedirectionURL(String newRedirectionURL) {
		String oldRedirectionURL = redirectionURL;
		redirectionURL = newRedirectionURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__REDIRECTION_URL, oldRedirectionURL, redirectionURL));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientID() {
		return clientID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientID(String newClientID) {
		String oldClientID = clientID;
		clientID = newClientID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_ID, oldClientID, clientID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClientSecret() {
		return clientSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientSecret(String newClientSecret) {
		String oldClientSecret = clientSecret;
		clientSecret = newClientSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SECRET, oldClientSecret, clientSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrantType() {
		return grantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrantType(String newGrantType) {
		String oldGrantType = grantType;
		grantType = newGrantType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__GRANT_TYPE, oldGrantType, grantType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefreshToken() {
		return refreshToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshToken(String newRefreshToken) {
		String oldRefreshToken = refreshToken;
		refreshToken = newRefreshToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__REFRESH_TOKEN, oldRefreshToken, refreshToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessToken(String newAccessToken) {
		String oldAccessToken = accessToken;
		accessToken = newAccessToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN, oldAccessToken, accessToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAccessTokenCreationDate() {
		return accessTokenCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessTokenCreationDate(Date newAccessTokenCreationDate) {
		Date oldAccessTokenCreationDate = accessTokenCreationDate;
		accessTokenCreationDate = newAccessTokenCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_CREATION_DATE, oldAccessTokenCreationDate, accessTokenCreationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAccessTokenExpirationDate() {
		return accessTokenExpirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessTokenExpirationDate(Date newAccessTokenExpirationDate) {
		Date oldAccessTokenExpirationDate = accessTokenExpirationDate;
		accessTokenExpirationDate = newAccessTokenExpirationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_EXPIRATION_DATE, oldAccessTokenExpirationDate, accessTokenExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForbiddenMetaTags() {
		return forbiddenMetaTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForbiddenMetaTags(String newForbiddenMetaTags) {
		String oldForbiddenMetaTags = forbiddenMetaTags;
		forbiddenMetaTags = newForbiddenMetaTags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__FORBIDDEN_META_TAGS, oldForbiddenMetaTags, forbiddenMetaTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedMetaTags() {
		return allowedMetaTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedMetaTags(String newAllowedMetaTags) {
		String oldAllowedMetaTags = allowedMetaTags;
		allowedMetaTags = newAllowedMetaTags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__ALLOWED_META_TAGS, oldAllowedMetaTags, allowedMetaTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuthClientScope getClientScope() {
		return clientScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClientScope(OAuthClientScope newClientScope, NotificationChain msgs) {
		OAuthClientScope oldClientScope = clientScope;
		clientScope = newClientScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SCOPE, oldClientScope, newClientScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientScope(OAuthClientScope newClientScope) {
		if (newClientScope != clientScope) {
			NotificationChain msgs = null;
			if (clientScope != null)
				msgs = ((InternalEObject)clientScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SCOPE, null, msgs);
			if (newClientScope != null)
				msgs = ((InternalEObject)newClientScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SCOPE, null, msgs);
			msgs = basicSetClientScope(newClientScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SCOPE, newClientScope, newClientScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOAuthScopeLevel() {
		return oAuthScopeLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOAuthScopeLevel(Integer newOAuthScopeLevel) {
		Integer oldOAuthScopeLevel = oAuthScopeLevel;
		oAuthScopeLevel = newOAuthScopeLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.OAUTH_CLIENT_CONFIG__OAUTH_SCOPE_LEVEL, oldOAuthScopeLevel, oAuthScopeLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SCOPE:
				return basicSetClientScope(null, msgs);
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
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__TYPE:
				return getType();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__REDIRECTION_URL:
				return getRedirectionURL();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__NAME:
				return getName();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__DESCRIPTION:
				return getDescription();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_ID:
				return getClientID();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SECRET:
				return getClientSecret();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CODE:
				return getCode();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__GRANT_TYPE:
				return getGrantType();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__REFRESH_TOKEN:
				return getRefreshToken();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN:
				return getAccessToken();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_CREATION_DATE:
				return getAccessTokenCreationDate();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_EXPIRATION_DATE:
				return getAccessTokenExpirationDate();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__FORBIDDEN_META_TAGS:
				return getForbiddenMetaTags();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ALLOWED_META_TAGS:
				return getAllowedMetaTags();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SCOPE:
				return getClientScope();
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__OAUTH_SCOPE_LEVEL:
				return getOAuthScopeLevel();
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
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__TYPE:
				setType((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__REDIRECTION_URL:
				setRedirectionURL((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__NAME:
				setName((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_ID:
				setClientID((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SECRET:
				setClientSecret((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CODE:
				setCode((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__GRANT_TYPE:
				setGrantType((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__REFRESH_TOKEN:
				setRefreshToken((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN:
				setAccessToken((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_CREATION_DATE:
				setAccessTokenCreationDate((Date)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_EXPIRATION_DATE:
				setAccessTokenExpirationDate((Date)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__FORBIDDEN_META_TAGS:
				setForbiddenMetaTags((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ALLOWED_META_TAGS:
				setAllowedMetaTags((String)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SCOPE:
				setClientScope((OAuthClientScope)newValue);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__OAUTH_SCOPE_LEVEL:
				setOAuthScopeLevel((Integer)newValue);
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
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__REDIRECTION_URL:
				setRedirectionURL(REDIRECTION_URL_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_ID:
				setClientID(CLIENT_ID_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SECRET:
				setClientSecret(CLIENT_SECRET_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__GRANT_TYPE:
				setGrantType(GRANT_TYPE_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__REFRESH_TOKEN:
				setRefreshToken(REFRESH_TOKEN_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN:
				setAccessToken(ACCESS_TOKEN_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_CREATION_DATE:
				setAccessTokenCreationDate(ACCESS_TOKEN_CREATION_DATE_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_EXPIRATION_DATE:
				setAccessTokenExpirationDate(ACCESS_TOKEN_EXPIRATION_DATE_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__FORBIDDEN_META_TAGS:
				setForbiddenMetaTags(FORBIDDEN_META_TAGS_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ALLOWED_META_TAGS:
				setAllowedMetaTags(ALLOWED_META_TAGS_EDEFAULT);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SCOPE:
				setClientScope((OAuthClientScope)null);
				return;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__OAUTH_SCOPE_LEVEL:
				setOAuthScopeLevel(OAUTH_SCOPE_LEVEL_EDEFAULT);
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
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__REDIRECTION_URL:
				return REDIRECTION_URL_EDEFAULT == null ? redirectionURL != null : !REDIRECTION_URL_EDEFAULT.equals(redirectionURL);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_ID:
				return CLIENT_ID_EDEFAULT == null ? clientID != null : !CLIENT_ID_EDEFAULT.equals(clientID);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SECRET:
				return CLIENT_SECRET_EDEFAULT == null ? clientSecret != null : !CLIENT_SECRET_EDEFAULT.equals(clientSecret);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__GRANT_TYPE:
				return GRANT_TYPE_EDEFAULT == null ? grantType != null : !GRANT_TYPE_EDEFAULT.equals(grantType);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__REFRESH_TOKEN:
				return REFRESH_TOKEN_EDEFAULT == null ? refreshToken != null : !REFRESH_TOKEN_EDEFAULT.equals(refreshToken);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN:
				return ACCESS_TOKEN_EDEFAULT == null ? accessToken != null : !ACCESS_TOKEN_EDEFAULT.equals(accessToken);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_CREATION_DATE:
				return ACCESS_TOKEN_CREATION_DATE_EDEFAULT == null ? accessTokenCreationDate != null : !ACCESS_TOKEN_CREATION_DATE_EDEFAULT.equals(accessTokenCreationDate);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ACCESS_TOKEN_EXPIRATION_DATE:
				return ACCESS_TOKEN_EXPIRATION_DATE_EDEFAULT == null ? accessTokenExpirationDate != null : !ACCESS_TOKEN_EXPIRATION_DATE_EDEFAULT.equals(accessTokenExpirationDate);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__FORBIDDEN_META_TAGS:
				return FORBIDDEN_META_TAGS_EDEFAULT == null ? forbiddenMetaTags != null : !FORBIDDEN_META_TAGS_EDEFAULT.equals(forbiddenMetaTags);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__ALLOWED_META_TAGS:
				return ALLOWED_META_TAGS_EDEFAULT == null ? allowedMetaTags != null : !ALLOWED_META_TAGS_EDEFAULT.equals(allowedMetaTags);
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__CLIENT_SCOPE:
				return clientScope != null;
			case ApplicationPackage.OAUTH_CLIENT_CONFIG__OAUTH_SCOPE_LEVEL:
				return OAUTH_SCOPE_LEVEL_EDEFAULT == null ? oAuthScopeLevel != null : !OAUTH_SCOPE_LEVEL_EDEFAULT.equals(oAuthScopeLevel);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", redirectionURL: ");
		result.append(redirectionURL);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", clientID: ");
		result.append(clientID);
		result.append(", clientSecret: ");
		result.append(clientSecret);
		result.append(", code: ");
		result.append(code);
		result.append(", grantType: ");
		result.append(grantType);
		result.append(", refreshToken: ");
		result.append(refreshToken);
		result.append(", accessToken: ");
		result.append(accessToken);
		result.append(", accessTokenCreationDate: ");
		result.append(accessTokenCreationDate);
		result.append(", accessTokenExpirationDate: ");
		result.append(accessTokenExpirationDate);
		result.append(", forbiddenMetaTags: ");
		result.append(forbiddenMetaTags);
		result.append(", allowedMetaTags: ");
		result.append(allowedMetaTags);
		result.append(", oAuthScopeLevel: ");
		result.append(oAuthScopeLevel);
		result.append(')');
		return result.toString();
	}


	/**
	 * Generates an EObjectCondition to check whether an Object is of the type OAuthClientConfig.
	 * 
	 * @return An EObjectCondition whether the Object is of the type OAuthClientConfig.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(ApplicationPackageImpl.eINSTANCE.getOAuthClientConfig());
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
		if ( featureName.equalsIgnoreCase("type") )
			return this.getType();		
		if ( featureName.equalsIgnoreCase("redirectionURL") )
			return this.getRedirectionURL();		
		if ( featureName.equalsIgnoreCase("name") )
			return this.getName();		
		if ( featureName.equalsIgnoreCase("description") )
			return this.getDescription();		
		if ( featureName.equalsIgnoreCase("clientID") )
			return this.getClientID();		
		if ( featureName.equalsIgnoreCase("clientSecret") )
			return this.getClientSecret();		
		if ( featureName.equalsIgnoreCase("code") )
			return this.getCode();		
		if ( featureName.equalsIgnoreCase("grantType") )
			return this.getGrantType();		
		if ( featureName.equalsIgnoreCase("refreshToken") )
			return this.getRefreshToken();		
		if ( featureName.equalsIgnoreCase("accessToken") )
			return this.getAccessToken();		
		if ( featureName.equalsIgnoreCase("accessTokenCreationDate") )
			return this.getAccessTokenCreationDate();		
		if ( featureName.equalsIgnoreCase("accessTokenExpirationDate") )
			return this.getAccessTokenExpirationDate();		
		if ( featureName.equalsIgnoreCase("forbiddenMetaTags") )
			return this.getForbiddenMetaTags();		
		if ( featureName.equalsIgnoreCase("allowedMetaTags") )
			return this.getAllowedMetaTags();		
		if ( featureName.equalsIgnoreCase("clientScope") )
			return this.getClientScope();		
		if ( featureName.equalsIgnoreCase("oAuthScopeLevel") )
			return this.getOAuthScopeLevel();		
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
		if ( featureName.equalsIgnoreCase("type") ) {
				java.lang.String ftype = null;
				try {
					ftype = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setType(ftype);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("redirectionURL") ) {
				java.lang.String fredirectionURL = null;
				try {
					fredirectionURL = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setRedirectionURL(fredirectionURL);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("name") ) {
				java.lang.String fname = null;
				try {
					fname = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setName(fname);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("description") ) {
				java.lang.String fdescription = null;
				try {
					fdescription = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setDescription(fdescription);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("clientID") ) {
				java.lang.String fclientID = null;
				try {
					fclientID = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setClientID(fclientID);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("clientSecret") ) {
				java.lang.String fclientSecret = null;
				try {
					fclientSecret = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setClientSecret(fclientSecret);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("code") ) {
				java.lang.String fcode = null;
				try {
					fcode = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setCode(fcode);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("grantType") ) {
				java.lang.String fgrantType = null;
				try {
					fgrantType = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setGrantType(fgrantType);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("refreshToken") ) {
				java.lang.String frefreshToken = null;
				try {
					frefreshToken = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setRefreshToken(frefreshToken);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("accessToken") ) {
				java.lang.String faccessToken = null;
				try {
					faccessToken = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setAccessToken(faccessToken);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("accessTokenCreationDate") ) {
				java.util.Date faccessTokenCreationDate = null;
				try {
					try {
						faccessTokenCreationDate = RestUtil.fromDateString((String) value);
						if(faccessTokenCreationDate == null) {
							faccessTokenCreationDate = (java.util.Date)(RestUtil.fromInput(value));
						}
					} catch (ClassNotFoundException e) {
						faccessTokenCreationDate = (java.util.Date)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.util.Date",value.getClass().getName());
				}
				this.setAccessTokenCreationDate(faccessTokenCreationDate);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("accessTokenExpirationDate") ) {
				java.util.Date faccessTokenExpirationDate = null;
				try {
					try {
						faccessTokenExpirationDate = RestUtil.fromDateString((String) value);
						if(faccessTokenExpirationDate == null) {
							faccessTokenExpirationDate = (java.util.Date)(RestUtil.fromInput(value));
						}
					} catch (ClassNotFoundException e) {
						faccessTokenExpirationDate = (java.util.Date)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.util.Date",value.getClass().getName());
				}
				this.setAccessTokenExpirationDate(faccessTokenExpirationDate);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("forbiddenMetaTags") ) {
				java.lang.String fforbiddenMetaTags = null;
				try {
					fforbiddenMetaTags = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setForbiddenMetaTags(fforbiddenMetaTags);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("allowedMetaTags") ) {
				java.lang.String fallowedMetaTags = null;
				try {
					fallowedMetaTags = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setAllowedMetaTags(fallowedMetaTags);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("clientScope") ) {
				org.sociotech.communitymashup.application.OAuthClientScope fclientScope = null;
				try {
					try {
						fclientScope = (org.sociotech.communitymashup.application.OAuthClientScope)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fclientScope = (org.sociotech.communitymashup.application.OAuthClientScope)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "org.sociotech.communitymashup.application.OAuthClientScope",value.getClass().getName());
				}
				this.setClientScope(fclientScope);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("oAuthScopeLevel") ) {
				java.lang.Integer foAuthScopeLevel = null;
				try {
				try {
					foAuthScopeLevel = RestUtil.fromIntegerString((String) value);
					if(foAuthScopeLevel == null) {
						foAuthScopeLevel = (java.lang.Integer)(RestUtil.fromInput(value));
					}
				} catch (ClassNotFoundException e) {
					foAuthScopeLevel = (java.lang.Integer)value;
				}
				} catch (ClassCastException e) {
					throw new WrongArgException("OAuthClientConfig.setFeature", "java.lang.Integer",value.getClass().getName());
				}
				this.setOAuthScopeLevel(foAuthScopeLevel);
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
} //OAuthClientConfigImpl
