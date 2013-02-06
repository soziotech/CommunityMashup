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
 * A representation of the model object '<em><b>OAuth Client Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveTag <em>Positive Tag</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeTag <em>Negative Tag</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveMetaTag <em>Positive Meta Tag</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeMetaTag <em>Negative Meta Tag</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveCategory <em>Positive Category</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeCategory <em>Negative Category</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositivePerson <em>Positive Person</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativePerson <em>Negative Person</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveOrganisation <em>Positive Organisation</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeOrganisation <em>Negative Organisation</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getIdentSpecification <em>Ident Specification</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getAllowPersons <em>Allow Persons</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getAllowContents <em>Allow Contents</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getAllowOrganisations <em>Allow Organisations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.OAuthClientScope#getMaximumAge <em>Maximum Age</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope()
 * @model
 * @generated
 */
public interface OAuthClientScope extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Positive Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Tag</em>' attribute.
	 * @see #setPositiveTag(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_PositiveTag()
	 * @model
	 * @generated
	 */
	String getPositiveTag();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveTag <em>Positive Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Tag</em>' attribute.
	 * @see #getPositiveTag()
	 * @generated
	 */
	void setPositiveTag(String value);

	/**
	 * Returns the value of the '<em><b>Negative Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Tag</em>' attribute.
	 * @see #setNegativeTag(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_NegativeTag()
	 * @model
	 * @generated
	 */
	String getNegativeTag();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeTag <em>Negative Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative Tag</em>' attribute.
	 * @see #getNegativeTag()
	 * @generated
	 */
	void setNegativeTag(String value);

	/**
	 * Returns the value of the '<em><b>Positive Meta Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Meta Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Meta Tag</em>' attribute.
	 * @see #setPositiveMetaTag(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_PositiveMetaTag()
	 * @model
	 * @generated
	 */
	String getPositiveMetaTag();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveMetaTag <em>Positive Meta Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Meta Tag</em>' attribute.
	 * @see #getPositiveMetaTag()
	 * @generated
	 */
	void setPositiveMetaTag(String value);

	/**
	 * Returns the value of the '<em><b>Negative Meta Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Meta Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Meta Tag</em>' attribute.
	 * @see #setNegativeMetaTag(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_NegativeMetaTag()
	 * @model
	 * @generated
	 */
	String getNegativeMetaTag();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeMetaTag <em>Negative Meta Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative Meta Tag</em>' attribute.
	 * @see #getNegativeMetaTag()
	 * @generated
	 */
	void setNegativeMetaTag(String value);

	/**
	 * Returns the value of the '<em><b>Positive Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Category</em>' attribute.
	 * @see #setPositiveCategory(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_PositiveCategory()
	 * @model
	 * @generated
	 */
	String getPositiveCategory();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveCategory <em>Positive Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Category</em>' attribute.
	 * @see #getPositiveCategory()
	 * @generated
	 */
	void setPositiveCategory(String value);

	/**
	 * Returns the value of the '<em><b>Negative Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Category</em>' attribute.
	 * @see #setNegativeCategory(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_NegativeCategory()
	 * @model
	 * @generated
	 */
	String getNegativeCategory();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeCategory <em>Negative Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative Category</em>' attribute.
	 * @see #getNegativeCategory()
	 * @generated
	 */
	void setNegativeCategory(String value);

	/**
	 * Returns the value of the '<em><b>Positive Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Person</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Person</em>' attribute.
	 * @see #setPositivePerson(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_PositivePerson()
	 * @model
	 * @generated
	 */
	String getPositivePerson();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositivePerson <em>Positive Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Person</em>' attribute.
	 * @see #getPositivePerson()
	 * @generated
	 */
	void setPositivePerson(String value);

	/**
	 * Returns the value of the '<em><b>Negative Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Person</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Person</em>' attribute.
	 * @see #setNegativePerson(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_NegativePerson()
	 * @model
	 * @generated
	 */
	String getNegativePerson();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativePerson <em>Negative Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative Person</em>' attribute.
	 * @see #getNegativePerson()
	 * @generated
	 */
	void setNegativePerson(String value);

	/**
	 * Returns the value of the '<em><b>Positive Organisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Organisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Organisation</em>' attribute.
	 * @see #setPositiveOrganisation(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_PositiveOrganisation()
	 * @model
	 * @generated
	 */
	String getPositiveOrganisation();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getPositiveOrganisation <em>Positive Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive Organisation</em>' attribute.
	 * @see #getPositiveOrganisation()
	 * @generated
	 */
	void setPositiveOrganisation(String value);

	/**
	 * Returns the value of the '<em><b>Negative Organisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Organisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Organisation</em>' attribute.
	 * @see #setNegativeOrganisation(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_NegativeOrganisation()
	 * @model
	 * @generated
	 */
	String getNegativeOrganisation();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getNegativeOrganisation <em>Negative Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative Organisation</em>' attribute.
	 * @see #getNegativeOrganisation()
	 * @generated
	 */
	void setNegativeOrganisation(String value);

	/**
	 * Returns the value of the '<em><b>Ident Specification</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ident Specification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident Specification</em>' attribute.
	 * @see #setIdentSpecification(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_IdentSpecification()
	 * @model default="false"
	 * @generated
	 */
	Boolean getIdentSpecification();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getIdentSpecification <em>Ident Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident Specification</em>' attribute.
	 * @see #getIdentSpecification()
	 * @generated
	 */
	void setIdentSpecification(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Persons</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Persons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Persons</em>' attribute.
	 * @see #setAllowPersons(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_AllowPersons()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowPersons();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getAllowPersons <em>Allow Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Persons</em>' attribute.
	 * @see #getAllowPersons()
	 * @generated
	 */
	void setAllowPersons(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Contents</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Contents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Contents</em>' attribute.
	 * @see #setAllowContents(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_AllowContents()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowContents();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getAllowContents <em>Allow Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Contents</em>' attribute.
	 * @see #getAllowContents()
	 * @generated
	 */
	void setAllowContents(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Organisations</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Organisations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Organisations</em>' attribute.
	 * @see #setAllowOrganisations(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_AllowOrganisations()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowOrganisations();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getAllowOrganisations <em>Allow Organisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Organisations</em>' attribute.
	 * @see #getAllowOrganisations()
	 * @generated
	 */
	void setAllowOrganisations(Boolean value);

	/**
	 * Returns the value of the '<em><b>Maximum Age</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Age</em>' attribute.
	 * @see #setMaximumAge(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getOAuthClientScope_MaximumAge()
	 * @model default="true"
	 * @generated
	 */
	String getMaximumAge();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.OAuthClientScope#getMaximumAge <em>Maximum Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Age</em>' attribute.
	 * @see #getMaximumAge()
	 * @generated
	 */
	void setMaximumAge(String value);



	/**
	 * An EObjectCondition to check whether an Object is of the type OAuthClientScope.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.application.impl.OAuthClientScopeImpl.generateIsTypeCondition();


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
} // OAuthClientScope
