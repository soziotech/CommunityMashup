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
package org.sociotech.communitymashup.data.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.sociotech.communitymashup.data.Attachment;
import org.sociotech.communitymashup.data.Binary;
import org.sociotech.communitymashup.data.Category;
import org.sociotech.communitymashup.data.Classification;
import org.sociotech.communitymashup.data.Connection;
import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataPackage;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.DeletedItem;
import org.sociotech.communitymashup.data.Document;
import org.sociotech.communitymashup.data.Email;
import org.sociotech.communitymashup.data.Event;
import org.sociotech.communitymashup.data.Extension;
import org.sociotech.communitymashup.data.Identifier;
import org.sociotech.communitymashup.data.Image;
import org.sociotech.communitymashup.data.IndoorLocation;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.data.InstantMessenger;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.data.Location;
import org.sociotech.communitymashup.data.MetaInformation;
import org.sociotech.communitymashup.data.MetaTag;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.Phone;
import org.sociotech.communitymashup.data.Ranking;
import org.sociotech.communitymashup.data.StarRanking;
import org.sociotech.communitymashup.data.Tag;
import org.sociotech.communitymashup.data.ThumbRanking;
import org.sociotech.communitymashup.data.Transformation;
import org.sociotech.communitymashup.data.Video;
import org.sociotech.communitymashup.data.ViewRanking;
import org.sociotech.communitymashup.data.WebAccount;
import org.sociotech.communitymashup.data.WebSite;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.RestUtil;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PersonImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PersonImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PersonImpl#getLeaderOf <em>Leader Of</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PersonImpl#getParticipates <em>Participates</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PersonImpl#getAuthored <em>Authored</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PersonImpl#getContributed <em>Contributed</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PersonImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PersonImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PersonImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.PersonImpl#getRanked <em>Ranked</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends InformationObjectImpl implements Person {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeaderOf() <em>Leader Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeaderOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Organisation> leaderOf;

	/**
	 * The cached value of the '{@link #getParticipates() <em>Participates</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipates()
	 * @generated
	 * @ordered
	 */
	protected EList<Organisation> participates;

	/**
	 * The cached value of the '{@link #getAuthored() <em>Authored</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthored()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> authored;

	/**
	 * The cached value of the '{@link #getContributed() <em>Contributed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributed()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> contributed;

	/**
	 * The default value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_OF_BIRTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected Date dateOfBirth = DATE_OF_BIRTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRanked() <em>Ranked</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRanked()
	 * @generated
	 * @ordered
	 */
	protected EList<Ranking> ranked;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.PERSON;
	}

	
	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.InformationObjectImpl#getName()
	 */
	@Override
	public String getName() {
		if(name == null && firstname != null && lastname != null)
		{
			return firstname + " " + lastname;
		}
		// otherwise return behavior of super class
		return super.getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PERSON__LASTNAME, oldLastname, lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
 	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PERSON__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organisation> getLeaderOf() {
		if (leaderOf == null) {
			leaderOf = new EObjectWithInverseResolvingEList<Organisation>(Organisation.class, this, DataPackage.PERSON__LEADER_OF, DataPackage.ORGANISATION__LEADER);
		}
		return leaderOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organisation> getParticipates() {
		if (participates == null) {
			participates = new EObjectWithInverseResolvingEList.ManyInverse<Organisation>(Organisation.class, this, DataPackage.PERSON__PARTICIPATES, DataPackage.ORGANISATION__PARTICIPANTS);
		}
		return participates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> getAuthored() {
		if (authored == null) {
			authored = new EObjectWithInverseResolvingEList<Content>(Content.class, this, DataPackage.PERSON__AUTHORED, DataPackage.CONTENT__AUTHOR);
		}
		return authored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Content> getContributed() {
		if (contributed == null) {
			contributed = new EObjectWithInverseResolvingEList.ManyInverse<Content>(Content.class, this, DataPackage.PERSON__CONTRIBUTED, DataPackage.CONTENT__CONTRIBUTORS);
		}
		return contributed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfBirth(Date newDateOfBirth) {
		Date oldDateOfBirth = dateOfBirth;
		dateOfBirth = newDateOfBirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PERSON__DATE_OF_BIRTH, oldDateOfBirth, dateOfBirth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectResolvingEList<Person>(Person.class, this, DataPackage.PERSON__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PERSON__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ranking> getRanked() {
		if (ranked == null) {
			ranked = new EObjectWithInverseResolvingEList<Ranking>(Ranking.class, this, DataPackage.PERSON__RANKED, DataPackage.RANKING__RANKER);
		}
		return ranked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Creates a new list with all authored contents and the contents this person has contributed to.
	 * <!-- end-user-doc -->
	 */
	public EList<Content> getContents() {
		
		// create list with all authored contents
		EList<Content> contents = new BasicEList<Content>(this.getAuthored());
		
		// add contributed content
		contents.addAll(this.getContributed());
		
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Creates a new list with all organisations this person participates in or is the leader of.
	 * <!-- end-user-doc -->
	 */
	public EList<Organisation> getOrganisations() {
				
		// create list with all participating organisations
		EList<Organisation> organisations = new BasicEList<Organisation>(this.getParticipates());
				
		// add all leaded organisations
		organisations.addAll(this.getLeaderOf());
				
		return organisations;
 	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Content addContributedContent(Content contributedContent) {
		if(contributedContent == null)
		{
			return null;
		}

		List<Content> contributed = this.getContributed();
		
		if(!contributed.contains(contributedContent))
		{
			// if not already contributed add the content to the list of contributed contents
			contributed.add(contributedContent);
		}
		
		return contributedContent;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Content addAuthoredContent(Content authoredContent) {
		if(authoredContent == null)
		{
			return null;
		}
		
		// set this person as author of the content
		authoredContent.setAuthor(this);
		
		return authoredContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String parseFirstName() {
		if(firstname == null && name != null)
		{
			// try to parse it
			if(name.contains(" "))
			{
				// asume "firstname1 firstname2 firstname n lastname"
				
				// get last space
				int lastSpaceIndex = name.lastIndexOf(" ");
				return name.substring(0, lastSpaceIndex);
			}
			else
			{
				return name;
			}
		}
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String parseLastName() {
		if(lastname == null && name != null)
		{
			// try to parse it
			String[] nameparts = name.split(" ");
			if(nameparts.length >= 2)
			{
				// asume "firstname1 firstname2 firstname n lastname"
				return nameparts[nameparts.length -1];
			}
		}
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.PERSON__LEADER_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLeaderOf()).basicAdd(otherEnd, msgs);
			case DataPackage.PERSON__PARTICIPATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipates()).basicAdd(otherEnd, msgs);
			case DataPackage.PERSON__AUTHORED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAuthored()).basicAdd(otherEnd, msgs);
			case DataPackage.PERSON__CONTRIBUTED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributed()).basicAdd(otherEnd, msgs);
			case DataPackage.PERSON__RANKED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRanked()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.PERSON__LEADER_OF:
				return ((InternalEList<?>)getLeaderOf()).basicRemove(otherEnd, msgs);
			case DataPackage.PERSON__PARTICIPATES:
				return ((InternalEList<?>)getParticipates()).basicRemove(otherEnd, msgs);
			case DataPackage.PERSON__AUTHORED:
				return ((InternalEList<?>)getAuthored()).basicRemove(otherEnd, msgs);
			case DataPackage.PERSON__CONTRIBUTED:
				return ((InternalEList<?>)getContributed()).basicRemove(otherEnd, msgs);
			case DataPackage.PERSON__RANKED:
				return ((InternalEList<?>)getRanked()).basicRemove(otherEnd, msgs);
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
			case DataPackage.PERSON__LASTNAME:
				return getLastname();
			case DataPackage.PERSON__FIRSTNAME:
				return getFirstname();
			case DataPackage.PERSON__LEADER_OF:
				return getLeaderOf();
			case DataPackage.PERSON__PARTICIPATES:
				return getParticipates();
			case DataPackage.PERSON__AUTHORED:
				return getAuthored();
			case DataPackage.PERSON__CONTRIBUTED:
				return getContributed();
			case DataPackage.PERSON__DATE_OF_BIRTH:
				return getDateOfBirth();
			case DataPackage.PERSON__PERSONS:
				return getPersons();
			case DataPackage.PERSON__TITLE:
				return getTitle();
			case DataPackage.PERSON__RANKED:
				return getRanked();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DataPackage.PERSON__LASTNAME:
				setLastname((String)newValue);
				return;
			case DataPackage.PERSON__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case DataPackage.PERSON__LEADER_OF:
				getLeaderOf().clear();
				getLeaderOf().addAll((Collection<? extends Organisation>)newValue);
				return;
			case DataPackage.PERSON__PARTICIPATES:
				getParticipates().clear();
				getParticipates().addAll((Collection<? extends Organisation>)newValue);
				return;
			case DataPackage.PERSON__AUTHORED:
				getAuthored().clear();
				getAuthored().addAll((Collection<? extends Content>)newValue);
				return;
			case DataPackage.PERSON__CONTRIBUTED:
				getContributed().clear();
				getContributed().addAll((Collection<? extends Content>)newValue);
				return;
			case DataPackage.PERSON__DATE_OF_BIRTH:
				setDateOfBirth((Date)newValue);
				return;
			case DataPackage.PERSON__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case DataPackage.PERSON__TITLE:
				setTitle((String)newValue);
				return;
			case DataPackage.PERSON__RANKED:
				getRanked().clear();
				getRanked().addAll((Collection<? extends Ranking>)newValue);
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
			case DataPackage.PERSON__LASTNAME:
				setLastname(LASTNAME_EDEFAULT);
				return;
			case DataPackage.PERSON__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case DataPackage.PERSON__LEADER_OF:
				getLeaderOf().clear();
				return;
			case DataPackage.PERSON__PARTICIPATES:
				getParticipates().clear();
				return;
			case DataPackage.PERSON__AUTHORED:
				getAuthored().clear();
				return;
			case DataPackage.PERSON__CONTRIBUTED:
				getContributed().clear();
				return;
			case DataPackage.PERSON__DATE_OF_BIRTH:
				setDateOfBirth(DATE_OF_BIRTH_EDEFAULT);
				return;
			case DataPackage.PERSON__PERSONS:
				getPersons().clear();
				return;
			case DataPackage.PERSON__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case DataPackage.PERSON__RANKED:
				getRanked().clear();
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
			case DataPackage.PERSON__LASTNAME:
				return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
			case DataPackage.PERSON__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case DataPackage.PERSON__LEADER_OF:
				return leaderOf != null && !leaderOf.isEmpty();
			case DataPackage.PERSON__PARTICIPATES:
				return participates != null && !participates.isEmpty();
			case DataPackage.PERSON__AUTHORED:
				return authored != null && !authored.isEmpty();
			case DataPackage.PERSON__CONTRIBUTED:
				return contributed != null && !contributed.isEmpty();
			case DataPackage.PERSON__DATE_OF_BIRTH:
				return DATE_OF_BIRTH_EDEFAULT == null ? dateOfBirth != null : !DATE_OF_BIRTH_EDEFAULT.equals(dateOfBirth);
			case DataPackage.PERSON__PERSONS:
				return persons != null && !persons.isEmpty();
			case DataPackage.PERSON__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case DataPackage.PERSON__RANKED:
				return ranked != null && !ranked.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DataPackage.PERSON___GET_CONTENTS:
				return getContents();
			case DataPackage.PERSON___GET_ORGANISATIONS:
				return getOrganisations();
			case DataPackage.PERSON___ADD_CONTRIBUTED_CONTENT__CONTENT:
				return addContributedContent((Content)arguments.get(0));
			case DataPackage.PERSON___ADD_AUTHORED_CONTENT__CONTENT:
				return addAuthoredContent((Content)arguments.get(0));
			case DataPackage.PERSON___PARSE_FIRST_NAME:
				return parseFirstName();
			case DataPackage.PERSON___PARSE_LAST_NAME:
				return parseLastName();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (lastname: ");
		result.append(lastname);
		result.append(", firstname: ");
		result.append(firstname);
		result.append(", dateOfBirth: ");
		result.append(dateOfBirth);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}


/**
	 * Generates an EObjectCondition to check whether an Object is of the type Person.
	 * 
	 * @return An EObjectCondition whether the Object is of the type Person.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(DataPackageImpl.eINSTANCE.getPerson());
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
		if ( featureName.equalsIgnoreCase("lastname") )
			return this.getLastname();		
		if ( featureName.equalsIgnoreCase("firstname") )
			return this.getFirstname();		
		if ( featureName.equalsIgnoreCase("leaderOf") )
			return this.getLeaderOf();		
		if ( featureName.equalsIgnoreCase("participates") )
			return this.getParticipates();		
		if ( featureName.equalsIgnoreCase("authored") )
			return this.getAuthored();		
		if ( featureName.equalsIgnoreCase("contributed") )
			return this.getContributed();		
		if ( featureName.equalsIgnoreCase("dateOfBirth") )
			return this.getDateOfBirth();		
		if ( featureName.equalsIgnoreCase("persons") )
			return this.getPersons();		
		if ( featureName.equalsIgnoreCase("title") )
			return this.getTitle();		
		if ( featureName.equalsIgnoreCase("ranked") )
			return this.getRanked();			
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
		if ( featureName.equalsIgnoreCase("lastname") ) {
				java.lang.String flastname = null;
				try {
					flastname = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Person.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setLastname(flastname);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("firstname") ) {
				java.lang.String ffirstname = null;
				try {
					ffirstname = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Person.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setFirstname(ffirstname);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("dateOfBirth") ) {
				java.util.Date fdateOfBirth = null;
				try {
					try {
						fdateOfBirth = RestUtil.fromDateString((String) value);
						if(fdateOfBirth == null) {
							fdateOfBirth = (java.util.Date)(RestUtil.fromInput(value));
						}
					} catch (ClassNotFoundException e) {
						fdateOfBirth = (java.util.Date)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Person.setFeature", "java.util.Date",value.getClass().getName());
				}
				this.setDateOfBirth(fdateOfBirth);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("title") ) {
				java.lang.String ftitle = null;
				try {
					ftitle = (java.lang.String)value;
				} catch (ClassCastException e) {
					throw new WrongArgException("Person.setFeature", "java.lang.String",value.getClass().getName());
				}
				this.setTitle(ftitle);
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
		if ( command.getCommand().equalsIgnoreCase("getContents")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Person.doOperation", 0, command.getArgCount()); 
			return this.getContents();
		}
		if ( command.getCommand().equalsIgnoreCase("getOrganisations")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Person.doOperation", 0, command.getArgCount()); 
			return this.getOrganisations();
		}
		if ( command.getCommand().equalsIgnoreCase("addContributedContent")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("Person.doOperation", 1, command.getArgCount()); 
			Content contributedContent = null;
			try {
				try {
					contributedContent = (Content)(RestUtil.fromInput(command.getArg("contributedContent")));
				} catch (ClassNotFoundException e) {
					contributedContent = (Content)command.getArg("contributedContent");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("Person.doOperation", "Content", command.getArg("contributedContent").getClass().getName());
			}
			return this.addContributedContent(contributedContent);
		}
		if ( command.getCommand().equalsIgnoreCase("addAuthoredContent")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("Person.doOperation", 1, command.getArgCount()); 
			Content authoredContent = null;
			try {
				try {
					authoredContent = (Content)(RestUtil.fromInput(command.getArg("authoredContent")));
				} catch (ClassNotFoundException e) {
					authoredContent = (Content)command.getArg("authoredContent");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("Person.doOperation", "Content", command.getArg("authoredContent").getClass().getName());
			}
			return this.addAuthoredContent(authoredContent);
		}
		if ( command.getCommand().equalsIgnoreCase("parseFirstName")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Person.doOperation", 0, command.getArgCount()); 
			return this.parseFirstName();
		}
		if ( command.getCommand().equalsIgnoreCase("parseLastName")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Person.doOperation", 0, command.getArgCount()); 
			return this.parseLastName();
		}	
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
			if (o instanceof PersonImpl) {
				return ((Person) o).process(input, requestType);
			}
			if (o instanceof InformationObjectImpl) {
				return ((InformationObject) o).process(input, requestType);
			}
			if (o instanceof ContentImpl) {
				return ((Content) o).process(input, requestType);
			}
			if (o instanceof DataSetImpl) {
				return ((DataSet) o).process(input, requestType);
			}
			if (o instanceof ItemImpl) {
				return ((Item) o).process(input, requestType);
			}
			if (o instanceof ExtensionImpl) {
				return ((Extension) o).process(input, requestType);
			}
			if (o instanceof ClassificationImpl) {
				return ((Classification) o).process(input, requestType);
			}
			if (o instanceof CategoryImpl) {
				return ((Category) o).process(input, requestType);
			}
			if (o instanceof TagImpl) {
				return ((Tag) o).process(input, requestType);
			}
			if (o instanceof OrganisationImpl) {
				return ((Organisation) o).process(input, requestType);
			}
			if (o instanceof MetaTagImpl) {
				return ((MetaTag) o).process(input, requestType);
			}
			if (o instanceof PhoneImpl) {
				return ((Phone) o).process(input, requestType);
			}
			if (o instanceof InstantMessengerImpl) {
				return ((InstantMessenger) o).process(input, requestType);
			}
			if (o instanceof EmailImpl) {
				return ((Email) o).process(input, requestType);
			}
			if (o instanceof WebAccountImpl) {
				return ((WebAccount) o).process(input, requestType);
			}
			if (o instanceof WebSiteImpl) {
				return ((WebSite) o).process(input, requestType);
			}
			if (o instanceof RankingImpl) {
				return ((Ranking) o).process(input, requestType);
			}
			if (o instanceof AttachmentImpl) {
				return ((Attachment) o).process(input, requestType);
			}
			if (o instanceof LocationImpl) {
				return ((Location) o).process(input, requestType);
			}
			if (o instanceof ImageImpl) {
				return ((Image) o).process(input, requestType);
			}
			if (o instanceof DocumentImpl) {
				return ((Document) o).process(input, requestType);
			}
			if (o instanceof StarRankingImpl) {
				return ((StarRanking) o).process(input, requestType);
			}
			if (o instanceof ViewRankingImpl) {
				return ((ViewRanking) o).process(input, requestType);
			}
			if (o instanceof ThumbRankingImpl) {
				return ((ThumbRanking) o).process(input, requestType);
			}
			if (o instanceof TransformationImpl) {
				return ((Transformation) o).process(input, requestType);
			}
			if (o instanceof VideoImpl) {
				return ((Video) o).process(input, requestType);
			}
			if (o instanceof ConnectionImpl) {
				return ((Connection) o).process(input, requestType);
			}
			if (o instanceof BinaryImpl) {
				return ((Binary) o).process(input, requestType);
			}
			if (o instanceof MetaInformationImpl) {
				return ((MetaInformation) o).process(input, requestType);
			}
			if (o instanceof IndoorLocationImpl) {
				return ((IndoorLocation) o).process(input, requestType);
			}
			if (o instanceof IdentifierImpl) {
				return ((Identifier) o).process(input, requestType);
			}
			if (o instanceof EventImpl) {
				return ((Event) o).process(input, requestType);
			}
			if (o instanceof DeletedItemImpl) {
				return ((DeletedItem) o).process(input, requestType);
			}
			if (o instanceof List) {
				return RestUtil.listProcess((List<?>) o, input, requestType);
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#isEqualItem(org.sociotech.communitymashup.data.Item)
	 */
	@Override
	public Boolean isEqualItem(Item item) {
		if(super.isEqualItem(item))
		{
			return true;
		}
		
		if(this == item)
		{
			return true;
		}
		else if (item == null)
		{
			return false;
		}
		else if (this.eClass() != item.eClass())
		{
			return false;
		}
		
		// given item is a person
		Person person = (Person) item;
		
		if(this.getName() == null)
		{
			// name must be defined
			return false;
		}
		
		return this.getName().equalsIgnoreCase(person.getName());
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#canHaveEqualItem()
	 */
	@Override
	public boolean canHaveEqualItem() {
		return true;
	}
	
	
} //PersonImpl
