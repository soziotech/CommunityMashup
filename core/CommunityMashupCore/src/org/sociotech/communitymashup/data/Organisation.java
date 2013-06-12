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
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Organisation is a social group of Person instances, e.g. corporations, governments. A Organisation supports an hierarchical structure of parent and child Organisation elements. In addition optional Extensions of Type Phone, @link Email E-Mail@endlink, @link WebAccount Web Account@endlink and/or Location can be attached.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.Organisation#getParentOrganisation <em>Parent Organisation</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Organisation#getLeader <em>Leader</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Organisation#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Organisation#getOrganisations <em>Organisations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getOrganisation()
 * @model
 * @generated
 */
public interface Organisation extends InformationObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Parent Organisation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Organisation#getOrganisations <em>Organisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Organisation</em>' reference.
	 * @see #setParentOrganisation(Organisation)
	 * @see org.sociotech.communitymashup.data.DataPackage#getOrganisation_ParentOrganisation()
	 * @see org.sociotech.communitymashup.data.Organisation#getOrganisations
	 * @model opposite="organisations"
	 * @generated
	 */
	Organisation getParentOrganisation();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Organisation#getParentOrganisation <em>Parent Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Organisation</em>' reference.
	 * @see #getParentOrganisation()
	 * @generated
	 */
	void setParentOrganisation(Organisation value);

	/**
	 * Returns the value of the '<em><b>Leader</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Person#getLeaderOf <em>Leader Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leader</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader</em>' reference.
	 * @see #setLeader(Person)
	 * @see org.sociotech.communitymashup.data.DataPackage#getOrganisation_Leader()
	 * @see org.sociotech.communitymashup.data.Person#getLeaderOf
	 * @model opposite="leaderOf"
	 * @generated
	 */
	Person getLeader();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Organisation#getLeader <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader</em>' reference.
	 * @see #getLeader()
	 * @generated
	 */
	void setLeader(Person value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Person}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Person#getParticipates <em>Participates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getOrganisation_Participants()
	 * @see org.sociotech.communitymashup.data.Person#getParticipates
	 * @model opposite="participates"
	 * @generated
	 */
	EList<Person> getParticipants();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list with the leader and all participants.
	 * 
	 * @return List of Persons with the leader and all participants of this organisation.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * <!-- begin-user-doc -->
	  * Returns a list of all contents created by the leader or one of the participants of this organisation.
	 * 
	 * @return List of all contents created by the leader or one of the participants of this organisation.
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Content> getContents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Person addParticipant(Person participant);

	/**
	 * An EObjectCondition to check whether an Object is of the type Organisation.
	 * 
	 * @generated
	 */
public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.OrganisationImpl.generateIsTypeCondition();

	/**
	 * This method can be used to recursively and generically call the Getter, Setters and Operations of the generated classes.
	 * 
	 * @param input The commands to be processed.
	 * @param requestType The HTTP-Method of the request.
	 * 
	 * @return The result of the Getter/Operation or null.
	 * 
	 * @generated
	 */
	public Object process(LinkedList<RestCommand> input, RequestType requestType) throws ArgNotFoundException, WrongArgException, WrongArgCountException, UnknownOperationException;

	/**
	 * Returns the value of the '<em><b>Organisations</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Organisation}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Organisation#getParentOrganisation <em>Parent Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisations</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getOrganisation_Organisations()
	 * @see org.sociotech.communitymashup.data.Organisation#getParentOrganisation
	 * @model opposite="parentOrganisation"
	 * @generated
	 */
	EList<Organisation> getOrganisations();

} // Organisation
