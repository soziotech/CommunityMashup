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
package org.sociotech.communitymashup.data;

import java.util.Date;
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
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Person is an @link InformationObject Information Object@endlink representing a human being. It acts as a collection of personal data associated with this specific Person.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.Person#getLastname <em>Lastname</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Person#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Person#getLeaderOf <em>Leader Of</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Person#getParticipates <em>Participates</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Person#getAuthored <em>Authored</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Person#getContributed <em>Contributed</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Person#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Person#getPersons <em>Persons</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Person#getTitle <em>Title</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Person#getRanked <em>Ranked</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends InformationObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lastname</em>' attribute.
	 * @see #setLastname(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getPerson_Lastname()
	 * @model unique="false"
	 * @generated
	 */
	String getLastname();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Person#getLastname <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lastname</em>' attribute.
	 * @see #getLastname()
	 * @generated
	 */
	void setLastname(String value);

	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' attribute.
	 * @see #setFirstname(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getPerson_Firstname()
	 * @model unique="false"
	 * @generated
	 */
	String getFirstname();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Person#getFirstname <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' attribute.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(String value);

	/**
	 * Returns the value of the '<em><b>Leader Of</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Organisation}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Organisation#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader Of</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getPerson_LeaderOf()
	 * @see org.sociotech.communitymashup.data.Organisation#getLeader
	 * @model opposite="leader"
	 * @generated
	 */
	EList<Organisation> getLeaderOf();

	/**
	 * Returns the value of the '<em><b>Participates</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Organisation}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Organisation#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participates</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getPerson_Participates()
	 * @see org.sociotech.communitymashup.data.Organisation#getParticipants
	 * @model opposite="participants"
	 * @generated
	 */
	EList<Organisation> getParticipates();

	/**
	 * Returns the value of the '<em><b>Authored</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Content}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Content#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authored</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authored</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getPerson_Authored()
	 * @see org.sociotech.communitymashup.data.Content#getAuthor
	 * @model opposite="author"
	 * @generated
	 */
	EList<Content> getAuthored();

	/**
	 * Returns the value of the '<em><b>Contributed</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Content}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Content#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributed</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getPerson_Contributed()
	 * @see org.sociotech.communitymashup.data.Content#getContributors
	 * @model opposite="contributors"
	 * @generated
	 */
	EList<Content> getContributed();

	/**
	 * Returns the value of the '<em><b>Date Of Birth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Birth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Birth</em>' attribute.
	 * @see #setDateOfBirth(Date)
	 * @see org.sociotech.communitymashup.data.DataPackage#getPerson_DateOfBirth()
	 * @model
	 * @generated
	 */
	Date getDateOfBirth();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Person#getDateOfBirth <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Birth</em>' attribute.
	 * @see #getDateOfBirth()
	 * @generated
	 */
	void setDateOfBirth(Date value);

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getPerson_Persons()
	 * @model
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getPerson_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Person#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Ranked</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Ranking}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Ranking#getRanker <em>Ranker</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranked</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranked</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getPerson_Ranked()
	 * @see org.sociotech.communitymashup.data.Ranking#getRanker
	 * @model opposite="ranker"
	 * @generated
	 */
	EList<Ranking> getRanked();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Content> getContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Organisation> getOrganisations();


/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" contributedContentRequired="true"
	 * @generated
	 */
	Content addContributedContent(Content contributedContent);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" authoredContentRequired="true"
	 * @generated
	 */
	Content addAuthoredContent(Content authoredContent);


/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String parseFirstName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String parseLastName();


/**
	 * An EObjectCondition to check whether an Object is of the type Person.
	 * 
	 * @generated
	 */
public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.PersonImpl.generateIsTypeCondition();

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
} // Person
