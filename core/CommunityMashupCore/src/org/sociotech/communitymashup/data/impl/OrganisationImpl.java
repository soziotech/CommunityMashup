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
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.impl.OrganisationImpl#getParentOrganisation <em>Parent Organisation</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.OrganisationImpl#getLeader <em>Leader</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.OrganisationImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.impl.OrganisationImpl#getOrganisations <em>Organisations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganisationImpl extends InformationObjectImpl implements Organisation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * The cached value of the '{@link #getParentOrganisation() <em>Parent Organisation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentOrganisation()
	 * @generated
	 * @ordered
	 */
	protected Organisation parentOrganisation;

	/**
	 * The cached value of the '{@link #getLeader() <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeader()
	 * @generated
	 * @ordered
	 */
	protected Person leader;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> participants;

	/**
	 * The cached value of the '{@link #getOrganisations() <em>Organisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Organisation> organisations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.ORGANISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation getParentOrganisation() {
		if (parentOrganisation != null && parentOrganisation.eIsProxy()) {
			InternalEObject oldParentOrganisation = (InternalEObject)parentOrganisation;
			parentOrganisation = (Organisation)eResolveProxy(oldParentOrganisation);
			if (parentOrganisation != oldParentOrganisation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.ORGANISATION__PARENT_ORGANISATION, oldParentOrganisation, parentOrganisation));
			}
		}
		return parentOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organisation basicGetParentOrganisation() {
		return parentOrganisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentOrganisation(Organisation newParentOrganisation, NotificationChain msgs) {
		Organisation oldParentOrganisation = parentOrganisation;
		parentOrganisation = newParentOrganisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.ORGANISATION__PARENT_ORGANISATION, oldParentOrganisation, newParentOrganisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentOrganisation(Organisation newParentOrganisation) {
		if (newParentOrganisation != parentOrganisation) {
			NotificationChain msgs = null;
			if (parentOrganisation != null)
				msgs = ((InternalEObject)parentOrganisation).eInverseRemove(this, DataPackage.ORGANISATION__ORGANISATIONS, Organisation.class, msgs);
			if (newParentOrganisation != null)
				msgs = ((InternalEObject)newParentOrganisation).eInverseAdd(this, DataPackage.ORGANISATION__ORGANISATIONS, Organisation.class, msgs);
			msgs = basicSetParentOrganisation(newParentOrganisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ORGANISATION__PARENT_ORGANISATION, newParentOrganisation, newParentOrganisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getLeader() {
		if (leader != null && leader.eIsProxy()) {
			InternalEObject oldLeader = (InternalEObject)leader;
			leader = (Person)eResolveProxy(oldLeader);
			if (leader != oldLeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.ORGANISATION__LEADER, oldLeader, leader));
			}
		}
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetLeader() {
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeader(Person newLeader, NotificationChain msgs) {
		Person oldLeader = leader;
		leader = newLeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.ORGANISATION__LEADER, oldLeader, newLeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeader(Person newLeader) {
		if (newLeader != leader) {
			NotificationChain msgs = null;
			if (leader != null)
				msgs = ((InternalEObject)leader).eInverseRemove(this, DataPackage.PERSON__LEADER_OF, Person.class, msgs);
			if (newLeader != null)
				msgs = ((InternalEObject)newLeader).eInverseAdd(this, DataPackage.PERSON__LEADER_OF, Person.class, msgs);
			msgs = basicSetLeader(newLeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ORGANISATION__LEADER, newLeader, newLeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getParticipants() {
		if (participants == null) {
			participants = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, DataPackage.ORGANISATION__PARTICIPANTS, DataPackage.PERSON__PARTICIPATES);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Creates a new list with the leaders and all participants.
	 * 
	 * @return List of Persons with the leader and all participants of this organisation.
	 * <!-- end-user-doc -->
	 */
	public EList<Person> getPersons() {
		// create list with all participants
		EList<Person> persons = new BasicEList<Person>(this.getParticipants());
		
		// add all leaders
		Person leader = this.getLeader();
		if(leader != null)
		{
			persons.add(this.getLeader());
		}
		
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Aggregates all contents of persons of this organisation.
	 * 
	 * @return A list of contents, null in error case.
	 * <!-- end-user-doc -->
	 */
	public EList<Content> getContents() {
		
		EList<Content> organisationContents = new UniqueEList<Content>();
		
		EList<Person> orgPersons = this.getPersons();
		
		for(Person person : orgPersons) {
			// add contents of all organisation persons
			organisationContents.addAll(person.getContents());
		}
		
		return organisationContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Person addParticipant(Person participant) {
		if(participant == null)
		{
			return null;
		}
		
		EList<Person> participants = this.getParticipants();
		
		// TODO adapt if getParticipants returns a copy
		if(participants != null && !participants.contains(participant))
		{
			participants.add(participant);
		}
		
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organisation> getOrganisations() {
		if (organisations == null) {
			organisations = new EObjectWithInverseResolvingEList<Organisation>(Organisation.class, this, DataPackage.ORGANISATION__ORGANISATIONS, DataPackage.ORGANISATION__PARENT_ORGANISATION);
		}
		return organisations;
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
			case DataPackage.ORGANISATION__PARENT_ORGANISATION:
				if (parentOrganisation != null)
					msgs = ((InternalEObject)parentOrganisation).eInverseRemove(this, DataPackage.ORGANISATION__ORGANISATIONS, Organisation.class, msgs);
				return basicSetParentOrganisation((Organisation)otherEnd, msgs);
			case DataPackage.ORGANISATION__LEADER:
				if (leader != null)
					msgs = ((InternalEObject)leader).eInverseRemove(this, DataPackage.PERSON__LEADER_OF, Person.class, msgs);
				return basicSetLeader((Person)otherEnd, msgs);
			case DataPackage.ORGANISATION__PARTICIPANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipants()).basicAdd(otherEnd, msgs);
			case DataPackage.ORGANISATION__ORGANISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOrganisations()).basicAdd(otherEnd, msgs);
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
			case DataPackage.ORGANISATION__PARENT_ORGANISATION:
				return basicSetParentOrganisation(null, msgs);
			case DataPackage.ORGANISATION__LEADER:
				return basicSetLeader(null, msgs);
			case DataPackage.ORGANISATION__PARTICIPANTS:
				return ((InternalEList<?>)getParticipants()).basicRemove(otherEnd, msgs);
			case DataPackage.ORGANISATION__ORGANISATIONS:
				return ((InternalEList<?>)getOrganisations()).basicRemove(otherEnd, msgs);
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
			case DataPackage.ORGANISATION__PARENT_ORGANISATION:
				if (resolve) return getParentOrganisation();
				return basicGetParentOrganisation();
			case DataPackage.ORGANISATION__LEADER:
				if (resolve) return getLeader();
				return basicGetLeader();
			case DataPackage.ORGANISATION__PARTICIPANTS:
				return getParticipants();
			case DataPackage.ORGANISATION__ORGANISATIONS:
				return getOrganisations();
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
			case DataPackage.ORGANISATION__PARENT_ORGANISATION:
				setParentOrganisation((Organisation)newValue);
				return;
			case DataPackage.ORGANISATION__LEADER:
				setLeader((Person)newValue);
				return;
			case DataPackage.ORGANISATION__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Person>)newValue);
				return;
			case DataPackage.ORGANISATION__ORGANISATIONS:
				getOrganisations().clear();
				getOrganisations().addAll((Collection<? extends Organisation>)newValue);
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
			case DataPackage.ORGANISATION__PARENT_ORGANISATION:
				setParentOrganisation((Organisation)null);
				return;
			case DataPackage.ORGANISATION__LEADER:
				setLeader((Person)null);
				return;
			case DataPackage.ORGANISATION__PARTICIPANTS:
				getParticipants().clear();
				return;
			case DataPackage.ORGANISATION__ORGANISATIONS:
				getOrganisations().clear();
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
			case DataPackage.ORGANISATION__PARENT_ORGANISATION:
				return parentOrganisation != null;
			case DataPackage.ORGANISATION__LEADER:
				return leader != null;
			case DataPackage.ORGANISATION__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
			case DataPackage.ORGANISATION__ORGANISATIONS:
				return organisations != null && !organisations.isEmpty();
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
			case DataPackage.ORGANISATION___GET_PERSONS:
				return getPersons();
			case DataPackage.ORGANISATION___GET_CONTENTS:
				return getContents();
			case DataPackage.ORGANISATION___ADD_PARTICIPANT__PERSON:
				return addParticipant((Person)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * Generates an EObjectCondition to check whether an Object is of the type Organisation.
	 * 
	 * @return An EObjectCondition whether the Object is of the type Organisation.
	 * @generated
	 */
	public static EObjectCondition generateIsTypeCondition() {
		return new EObjectTypeRelationCondition(DataPackageImpl.eINSTANCE.getOrganisation());
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
		if ( featureName.equalsIgnoreCase("parentOrganisation") )
			return this.getParentOrganisation();		
		if ( featureName.equalsIgnoreCase("leader") )
			return this.getLeader();		
		if ( featureName.equalsIgnoreCase("participants") )
			return this.getParticipants();		
		if ( featureName.equalsIgnoreCase("organisations") )
			return this.getOrganisations();			
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
		if ( featureName.equalsIgnoreCase("parentOrganisation") ) {
				org.sociotech.communitymashup.data.Organisation fparentOrganisation = null;
				try {
					try {
						fparentOrganisation = (org.sociotech.communitymashup.data.Organisation)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fparentOrganisation = (org.sociotech.communitymashup.data.Organisation)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Organisation.setFeature", "org.sociotech.communitymashup.data.Organisation",value.getClass().getName());
				}
				this.setParentOrganisation(fparentOrganisation);
			return this;
			}		
		if ( featureName.equalsIgnoreCase("leader") ) {
				org.sociotech.communitymashup.data.Person fleader = null;
				try {
					try {
						fleader = (org.sociotech.communitymashup.data.Person)(RestUtil.fromInput(value));
					} catch (ClassNotFoundException e) {
						fleader = (org.sociotech.communitymashup.data.Person)value;
					}
				} catch (ClassCastException e) {
					throw new WrongArgException("Organisation.setFeature", "org.sociotech.communitymashup.data.Person",value.getClass().getName());
				}
				this.setLeader(fleader);
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
		if ( command.getCommand().equalsIgnoreCase("getPersons")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Organisation.doOperation", 0, command.getArgCount()); 
			return this.getPersons();
		}
		if ( command.getCommand().equalsIgnoreCase("getContents")) {
			if (command.getArgCount() != 0) throw new WrongArgCountException("Organisation.doOperation", 0, command.getArgCount()); 
			return this.getContents();
		}
		if ( command.getCommand().equalsIgnoreCase("addParticipant")) {
			if (command.getArgCount() != 1) throw new WrongArgCountException("Organisation.doOperation", 1, command.getArgCount()); 
			Person participant = null;
			try {
				try {
					participant = (Person)(RestUtil.fromInput(command.getArg("participant")));
				} catch (ClassNotFoundException e) {
					participant = (Person)command.getArg("participant");
				}
			} catch (ClassCastException e) {
				throw new WrongArgException("Organisation.doOperation", "Person", command.getArg("participant").getClass().getName());
			}
			return this.addParticipant(participant);
		}	
		return super.doOperation(command);
	}

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
		
		// given item is a organisation
		OrganisationImpl organisation = (OrganisationImpl) item;
		
		if(this.getName() == null || this.getName().isEmpty())
		{
			// name must be defined
			return false;
		}
		
		// look if any alternative name is defined to not always create new sets and parse name strings
		if(this.alternativeNames != null || organisation.alternativeNames != null) {
			Set<String> set1 = this.getAllNamesSet();
			Set<String> set2 = organisation.getAllNamesSet();
			for(String name1 : set1) {
				for(String name2: set2) {
					if(name1.equalsIgnoreCase(name2)) {
						return true;
					}
				}
			}
		}
				
		return this.getName().equalsIgnoreCase(organisation.getName());
	}

	/* (non-Javadoc)
	 * @see org.sociotech.communitymashup.data.impl.ItemImpl#canHaveEqualItem()
	 */
	@Override
	public boolean canHaveEqualItem() {
		return true;
	}
	
} //OrganisationImpl
