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

// pseudoimports
// Imports required by REST methods:
import java.util.LinkedList;

import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FEED Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowPersonFiltering <em>Allow Person Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowOrganisationFiltering <em>Allow Organisation Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowTypeFiltering <em>Allow Type Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowTagFiltering <em>Allow Tag Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowMetaTagFiltering <em>Allow Meta Tag Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowCategoryFiltering <em>Allow Category Filtering</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.FEEDInterface#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.FEEDInterface#getFeedType <em>Feed Type</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.application.FEEDInterface#getFeedTitle <em>Feed Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.application.ApplicationPackage#getFEEDInterface()
 * @model
 * @generated
 */
public interface FEEDInterface extends Interface {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Allow Person Filtering</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Person Filtering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Person Filtering</em>' attribute.
	 * @see #setAllowPersonFiltering(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getFEEDInterface_AllowPersonFiltering()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowPersonFiltering();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowPersonFiltering <em>Allow Person Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Person Filtering</em>' attribute.
	 * @see #getAllowPersonFiltering()
	 * @generated
	 */
	void setAllowPersonFiltering(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Organisation Filtering</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Organisation Filtering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Organisation Filtering</em>' attribute.
	 * @see #setAllowOrganisationFiltering(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getFEEDInterface_AllowOrganisationFiltering()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowOrganisationFiltering();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowOrganisationFiltering <em>Allow Organisation Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Organisation Filtering</em>' attribute.
	 * @see #getAllowOrganisationFiltering()
	 * @generated
	 */
	void setAllowOrganisationFiltering(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Type Filtering</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Type Filtering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Type Filtering</em>' attribute.
	 * @see #setAllowTypeFiltering(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getFEEDInterface_AllowTypeFiltering()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowTypeFiltering();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowTypeFiltering <em>Allow Type Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Type Filtering</em>' attribute.
	 * @see #getAllowTypeFiltering()
	 * @generated
	 */
	void setAllowTypeFiltering(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Tag Filtering</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Tag Filtering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Tag Filtering</em>' attribute.
	 * @see #setAllowTagFiltering(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getFEEDInterface_AllowTagFiltering()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowTagFiltering();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowTagFiltering <em>Allow Tag Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Tag Filtering</em>' attribute.
	 * @see #getAllowTagFiltering()
	 * @generated
	 */
	void setAllowTagFiltering(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Meta Tag Filtering</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Meta Tag Filtering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Meta Tag Filtering</em>' attribute.
	 * @see #setAllowMetaTagFiltering(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getFEEDInterface_AllowMetaTagFiltering()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowMetaTagFiltering();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowMetaTagFiltering <em>Allow Meta Tag Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Meta Tag Filtering</em>' attribute.
	 * @see #getAllowMetaTagFiltering()
	 * @generated
	 */
	void setAllowMetaTagFiltering(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Category Filtering</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Category Filtering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Category Filtering</em>' attribute.
	 * @see #setAllowCategoryFiltering(Boolean)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getFEEDInterface_AllowCategoryFiltering()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowCategoryFiltering();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.FEEDInterface#getAllowCategoryFiltering <em>Allow Category Filtering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Category Filtering</em>' attribute.
	 * @see #getAllowCategoryFiltering()
	 * @generated
	 */
	void setAllowCategoryFiltering(Boolean value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>"de"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getFEEDInterface_Language()
	 * @model default="de"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.FEEDInterface#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Feed Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Type</em>' attribute.
	 * @see #setFeedType(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getFEEDInterface_FeedType()
	 * @model
	 * @generated
	 */
	String getFeedType();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.FEEDInterface#getFeedType <em>Feed Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Type</em>' attribute.
	 * @see #getFeedType()
	 * @generated
	 */
	void setFeedType(String value);



	/**
	 * Returns the value of the '<em><b>Feed Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed Title</em>' attribute.
	 * @see #setFeedTitle(String)
	 * @see org.sociotech.communitymashup.application.ApplicationPackage#getFEEDInterface_FeedTitle()
	 * @model
	 * @generated
	 */
	String getFeedTitle();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.application.FEEDInterface#getFeedTitle <em>Feed Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed Title</em>' attribute.
	 * @see #getFeedTitle()
	 * @generated
	 */
	void setFeedTitle(String value);



	/**
	 * An EObjectCondition to check whether an Object is of the type FEEDInterface.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.application.impl.FEEDInterfaceImpl.generateIsTypeCondition();


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
} // FEEDInterface
