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

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OAuth Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthConfig#getClients <em>Clients</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthConfig#getAdmins <em>Admins</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthConfig#getUseScopeInterfaceOnRedirect <em>Use Scope Interface On Redirect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthConfig()
 * @model
 * @generated
 */
public interface OAuthConfig extends Security {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Clients</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.OAuthClientConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clients</em>' containment reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthConfig_Clients()
	 * @model containment="true"
	 * @generated
	 */
	EList<OAuthClientConfig> getClients();



	/**
	 * Returns the value of the '<em><b>Admins</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.OAuthAdmin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admins</em>' containment reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthConfig_Admins()
	 * @model containment="true"
	 * @generated
	 */
	EList<OAuthAdmin> getAdmins();



	/**
	 * Returns the value of the '<em><b>Use Scope Interface On Redirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Scope Interface On Redirect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Scope Interface On Redirect</em>' attribute.
	 * @see #setUseScopeInterfaceOnRedirect(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthConfig_UseScopeInterfaceOnRedirect()
	 * @model
	 * @generated
	 */
	Boolean getUseScopeInterfaceOnRedirect();



	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthConfig#getUseScopeInterfaceOnRedirect <em>Use Scope Interface On Redirect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Scope Interface On Redirect</em>' attribute.
	 * @see #getUseScopeInterfaceOnRedirect()
	 * @generated
	 */
	void setUseScopeInterfaceOnRedirect(Boolean value);



	/**
	 * An EObjectCondition to check whether an Object is of the type OAuthConfig.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.application.impl.OAuthConfigImpl.generateIsTypeCondition();


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
} // OAuthConfig
