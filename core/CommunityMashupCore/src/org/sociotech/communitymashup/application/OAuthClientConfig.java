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
package org.sociotech.communitymashup.application;

import java.util.Date;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth Client Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getType <em>Type</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getRedirectionURL <em>Redirection URL</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getName <em>Name</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getClientID <em>Client ID</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getClientSecret <em>Client Secret</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getCode <em>Code</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getGrantType <em>Grant Type</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getRefreshToken <em>Refresh Token</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAccessToken <em>Access Token</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAccessTokenCreationDate <em>Access Token Creation Date</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAccessTokenExpirationDate <em>Access Token Expiration Date</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getForbiddenMetaTags <em>Forbidden Meta Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAllowedMetaTags <em>Allowed Meta Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getClientScope <em>Client Scope</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientConfig#getOAuthScopeLevel <em>OAuth Scope Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig()
 * @model
 * @generated
 */
public interface OAuthClientConfig extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Redirection URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Redirection URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Redirection URL</em>' attribute.
	 * @see #setRedirectionURL(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_RedirectionURL()
	 * @model required="true"
	 * @generated
	 */
	String getRedirectionURL();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getRedirectionURL <em>Redirection URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redirection URL</em>' attribute.
	 * @see #getRedirectionURL()
	 * @generated
	 */
	void setRedirectionURL(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Client ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client ID</em>' attribute.
	 * @see #setClientID(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_ClientID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getClientID();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getClientID <em>Client ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client ID</em>' attribute.
	 * @see #getClientID()
	 * @generated
	 */
	void setClientID(String value);

	/**
	 * Returns the value of the '<em><b>Client Secret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Secret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Secret</em>' attribute.
	 * @see #setClientSecret(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_ClientSecret()
	 * @model required="true"
	 * @generated
	 */
	String getClientSecret();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getClientSecret <em>Client Secret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Secret</em>' attribute.
	 * @see #getClientSecret()
	 * @generated
	 */
	void setClientSecret(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Grant Type</b></em>' attribute.
	 * The default value is <code>"AuthorizationCode"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grant Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grant Type</em>' attribute.
	 * @see #setGrantType(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_GrantType()
	 * @model default="AuthorizationCode" required="true"
	 * @generated
	 */
	String getGrantType();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getGrantType <em>Grant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grant Type</em>' attribute.
	 * @see #getGrantType()
	 * @generated
	 */
	void setGrantType(String value);

	/**
	 * Returns the value of the '<em><b>Refresh Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Token</em>' attribute.
	 * @see #setRefreshToken(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_RefreshToken()
	 * @model
	 * @generated
	 */
	String getRefreshToken();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getRefreshToken <em>Refresh Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Token</em>' attribute.
	 * @see #getRefreshToken()
	 * @generated
	 */
	void setRefreshToken(String value);

	/**
	 * Returns the value of the '<em><b>Access Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Token</em>' attribute.
	 * @see #setAccessToken(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_AccessToken()
	 * @model
	 * @generated
	 */
	String getAccessToken();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAccessToken <em>Access Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Token</em>' attribute.
	 * @see #getAccessToken()
	 * @generated
	 */
	void setAccessToken(String value);

	/**
	 * Returns the value of the '<em><b>Access Token Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Token Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Token Creation Date</em>' attribute.
	 * @see #setAccessTokenCreationDate(Date)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_AccessTokenCreationDate()
	 * @model
	 * @generated
	 */
	Date getAccessTokenCreationDate();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAccessTokenCreationDate <em>Access Token Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Token Creation Date</em>' attribute.
	 * @see #getAccessTokenCreationDate()
	 * @generated
	 */
	void setAccessTokenCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Access Token Expiration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Token Expiration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Token Expiration Date</em>' attribute.
	 * @see #setAccessTokenExpirationDate(Date)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_AccessTokenExpirationDate()
	 * @model
	 * @generated
	 */
	Date getAccessTokenExpirationDate();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAccessTokenExpirationDate <em>Access Token Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Token Expiration Date</em>' attribute.
	 * @see #getAccessTokenExpirationDate()
	 * @generated
	 */
	void setAccessTokenExpirationDate(Date value);



	/**
	 * Returns the value of the '<em><b>Forbidden Meta Tags</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forbidden Meta Tags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forbidden Meta Tags</em>' attribute.
	 * @see #setForbiddenMetaTags(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_ForbiddenMetaTags()
	 * @model default=""
	 * @generated
	 */
	String getForbiddenMetaTags();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getForbiddenMetaTags <em>Forbidden Meta Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forbidden Meta Tags</em>' attribute.
	 * @see #getForbiddenMetaTags()
	 * @generated
	 */
	void setForbiddenMetaTags(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Meta Tags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Meta Tags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Meta Tags</em>' attribute.
	 * @see #setAllowedMetaTags(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_AllowedMetaTags()
	 * @model
	 * @generated
	 */
	String getAllowedMetaTags();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getAllowedMetaTags <em>Allowed Meta Tags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Meta Tags</em>' attribute.
	 * @see #getAllowedMetaTags()
	 * @generated
	 */
	void setAllowedMetaTags(String value);



	/**
	 * Returns the value of the '<em><b>Client Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Scope</em>' containment reference.
	 * @see #setClientScope(OAuthClientScope)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_ClientScope()
	 * @model containment="true"
	 * @generated
	 */
	OAuthClientScope getClientScope();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getClientScope <em>Client Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Scope</em>' containment reference.
	 * @see #getClientScope()
	 * @generated
	 */
	void setClientScope(OAuthClientScope value);



	/**
	 * Returns the value of the '<em><b>OAuth Scope Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OAuth Scope Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OAuth Scope Level</em>' attribute.
	 * @see #setOAuthScopeLevel(Integer)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientConfig_OAuthScopeLevel()
	 * @model
	 * @generated
	 */
	Integer getOAuthScopeLevel();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientConfig#getOAuthScopeLevel <em>OAuth Scope Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OAuth Scope Level</em>' attribute.
	 * @see #getOAuthScopeLevel()
	 * @generated
	 */
	void setOAuthScopeLevel(Integer value);



	/**
	 * An EObjectCondition to check whether an Object is of the type OAuthClientConfig.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.application.impl.OAuthClientConfigImpl.generateIsTypeCondition();


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
	public Object process(LinkedList<RestCommand> input, RequestType requestType) throws ArgNotFoundException, WrongArgException, WrongArgCountException, UnknownOperationException;
} // OAuthClientConfig
