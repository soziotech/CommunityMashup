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
 * A representation of the model object '<em><b>Mashup Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.MashupAdmin#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupAdmin#getId <em>Id</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupAdmin#getConfigurableMashups <em>Configurable Mashups</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupAdmin#getName <em>Name</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupAdmin#getLocalIdent <em>Local Ident</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupAdmin#getIsConfigurationAdmin <em>Is Configuration Admin</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupAdmin#getProfileImage <em>Profile Image</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.MashupAdmin#getEmail <em>Email</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupAdmin()
 * @model
 * @generated
 */
public interface MashupAdmin extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see #setProvider(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupAdmin_Provider()
	 * @model
	 * @generated
	 */
	String getProvider();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.MashupAdmin#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupAdmin_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.MashupAdmin#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Configurable Mashups</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.application.Mashup}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.application.Mashup#getMashupAdmins <em>Mashup Admins</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurable Mashups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurable Mashups</em>' reference list.
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupAdmin_ConfigurableMashups()
	 * @see org.sociotech.communitymashup.application.Mashup#getMashupAdmins
	 * @model opposite="mashupAdmins"
	 * @generated
	 */
	EList<Mashup> getConfigurableMashups();

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
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupAdmin_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.MashupAdmin#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Local Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Ident</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Ident</em>' attribute.
	 * @see #setLocalIdent(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupAdmin_LocalIdent()
	 * @model id="true"
	 * @generated
	 */
	String getLocalIdent();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.MashupAdmin#getLocalIdent <em>Local Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Ident</em>' attribute.
	 * @see #getLocalIdent()
	 * @generated
	 */
	void setLocalIdent(String value);

	/**
	 * Returns the value of the '<em><b>Is Configuration Admin</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Configuration Admin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Configuration Admin</em>' attribute.
	 * @see #setIsConfigurationAdmin(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupAdmin_IsConfigurationAdmin()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIsConfigurationAdmin();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.MashupAdmin#getIsConfigurationAdmin <em>Is Configuration Admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Configuration Admin</em>' attribute.
	 * @see #getIsConfigurationAdmin()
	 * @generated
	 */
	void setIsConfigurationAdmin(Boolean value);



	/**
	 * Returns the value of the '<em><b>Profile Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Image</em>' attribute.
	 * @see #setProfileImage(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupAdmin_ProfileImage()
	 * @model
	 * @generated
	 */
	String getProfileImage();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.MashupAdmin#getProfileImage <em>Profile Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Image</em>' attribute.
	 * @see #getProfileImage()
	 * @generated
	 */
	void setProfileImage(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getMashupAdmin_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.MashupAdmin#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);



	/**
	 * An EObjectCondition to check whether an Object is of the type MashupAdmin.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.application.impl.MashupAdminImpl.generateIsTypeCondition();


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
} // MashupAdmin
