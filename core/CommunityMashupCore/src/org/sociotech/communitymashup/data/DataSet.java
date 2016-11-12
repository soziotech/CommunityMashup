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

import java.util.Map;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.eclipse.emf.query.ocl.conditions.BooleanOCLCondition;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.ocl.ParserException;
import org.eclipse.emf.ecore.EClassifier;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.application.Mashup;
import org.sociotech.communitymashup.rest.*;
import java.io.Serializable;
import java.util.HashMap;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;
import org.sociotech.communitymashup.search.CoreSearchFacade;
import org.sociotech.communitymashup.search.ItemTermMatcher;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Set</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A @link DataSet Data Set@endlink acts as container for all data elements contained in an CommunityMashup configuration. The @link DataSet Data Set@endlink can be queried to retrieve special items. It is the main entry point for all access to mashed up data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.DataSet#getItems <em>Items</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.DataSet#getCacheFolder <em>Cache Folder</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.DataSet#getCacheFileAttachements <em>Cache File Attachements</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.DataSet#getSetUp <em>Set Up</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.DataSet#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.DataSet#getLogLevel <em>Log Level</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.DataSet#getIdentCounter <em>Ident Counter</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.DataSet#getIdentPrefix <em>Ident Prefix</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.DataSet#getCreated <em>Created</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.DataSet#getKeepDeletedItemsList <em>Keep Deleted Items List</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.DataSet#getItemsDeleted <em>Items Deleted</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet()
 * @model annotation="http://www.eclipse.org/emf/2002/GenModel restSuperClass='true'"
 * @generated
 */
public interface DataSet extends EObject {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Sets the service to be used for searching inside this data set.
	 * 
	 * @param searchService Service to be used for searching.
	 */
	public void setSearchService(CoreSearchFacade<Item> searchService);
	
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Item}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Item#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns all Items contained in this data set.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet_Items()
	 * @see org.sociotech.communitymashup.data.Item#getDataSet
	 * @model opposite="dataSet" containment="true"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Cache Folder</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * Returns the cache folder where attachment files will be cached when
	 * caching is enabled. If the cache folder is not set, the Systems directors
	 * for temporary files will be used.
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cache Folder</em>' attribute.
	 * @see #setCacheFolder(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet_CacheFolder()
	 * @model volatile="true"
	 * @generated
	 */
	String getCacheFolder();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.DataSet#getCacheFolder <em>Cache Folder</em>}' attribute.
	 * <!-- begin-user-doc --> Sets the cache
	 * folder, which is used for caching the attachment files. If the cache
	 * folder is not set, the Systems directors for temporary files will be
	 * used. <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Folder</em>' attribute.
	 * @see #getCacheFolder()
	 * @generated
	 */
	void setCacheFolder(String value);

	/**
	 * Returns the value of the '<em><b>Cache File Attachements</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Cache File Attachements</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache File Attachements</em>' attribute.
	 * @see #setCacheFileAttachements(Boolean)
	 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet_CacheFileAttachements()
	 * @model default="false" required="true" volatile="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel noREST='true'"
	 * @generated
	 */
	Boolean getCacheFileAttachements();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.DataSet#getCacheFileAttachements <em>Cache File Attachements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache File Attachements</em>' attribute.
	 * @see #getCacheFileAttachements()
	 * @generated
	 */
	void setCacheFileAttachements(Boolean value);

	/**
	 * Returns the value of the '<em><b>Set Up</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Up</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Set Up</em>' reference.
	 * @see #setSetUp(Mashup)
	 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet_SetUp()
	 * @model
	 * @generated
	 */
	Mashup getSetUp();

	/**
	 * Sets the value of the '
	 * {@link org.sociotech.communitymashup.data.DataSet#getSetUp
	 * <em>Set Up</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Set Up</em>' reference.
	 * @see #getSetUp()
	 * @generated
	 */
	void setSetUp(Mashup value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(Date)
	 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet_LastModified()
	 * @model
	 * @generated
	 */
	Date getLastModified();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.DataSet#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Date value);

	/**
	 * Returns the value of the '<em><b>Log Level</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Level</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Log Level</em>' attribute.
	 * @see #setLogLevel(Integer)
	 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet_LogLevel()
	 * @model volatile="true"
	 * @generated
	 */
	Integer getLogLevel();

	/**
	 * Sets the value of the '
	 * {@link org.sociotech.communitymashup.data.DataSet#getLogLevel
	 * <em>Log Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Log Level</em>' attribute.
	 * @see #getLogLevel()
	 * @generated
	 */
	void setLogLevel(Integer value);

	/**
	 * Returns the value of the '<em><b>Ident Counter</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ident Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident Counter</em>' attribute.
	 * @see #setIdentCounter(Long)
	 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet_IdentCounter()
	 * @model default="1"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel noREST='true'"
	 * @generated
	 */
	Long getIdentCounter();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.DataSet#getIdentCounter <em>Ident Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident Counter</em>' attribute.
	 * @see #getIdentCounter()
	 * @generated
	 */
	void setIdentCounter(Long value);

	/**
	 * Returns the value of the '<em><b>Ident Prefix</b></em>' attribute.
	 * The default value is <code>"a_"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ident Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident Prefix</em>' attribute.
	 * @see #setIdentPrefix(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet_IdentPrefix()
	 * @model default="a_"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel noREST='true'"
	 * @generated
	 */
	String getIdentPrefix();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.DataSet#getIdentPrefix <em>Ident Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident Prefix</em>' attribute.
	 * @see #getIdentPrefix()
	 * @generated
	 */
	void setIdentPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.DataSet#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Keep Deleted Items List</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Deleted Items List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Deleted Items List</em>' attribute.
	 * @see #setKeepDeletedItemsList(Boolean)
	 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet_KeepDeletedItemsList()
	 * @model default="false"
	 * @generated
	 */
	Boolean getKeepDeletedItemsList();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.DataSet#getKeepDeletedItemsList <em>Keep Deleted Items List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Deleted Items List</em>' attribute.
	 * @see #getKeepDeletedItemsList()
	 * @generated
	 */
	void setKeepDeletedItemsList(Boolean value);

	/**
	 * Returns the value of the '<em><b>Items Deleted</b></em>' containment reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.DeletedItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items Deleted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items Deleted</em>' containment reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getDataSet_ItemsDeleted()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<DeletedItem> getItemsDeleted();

	/**
	 * <!-- begin-user-doc --> Returns all items contained in this data set with
	 * the given string value.
	 * 
	 * @return List of items, null in error case. <!-- end-user-doc -->
	 * @model stringValueRequired="true"
	 * @generated
	 */
	EList<Item> getItemsWithStringValue(String stringValue);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances
	 * contained in this @link DataSet Data Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<InformationObject> getInformationObjects();

	/**
	 * <!-- begin-user-doc --> Returns a List of all Tags contained in this
	 * DataSet.
	 * 
	 * @return List of all Tags, null in error case. <!-- end-user-doc -->
	 * @model kind="operation"
	 */
	EList<Tag> getTags();

	/**
	 * <!-- begin-user-doc --> Returns all persons with the given name.
	 * 
	 * @return List of Persons, null in error case. <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Person> getPersonsWithName(String name);

	/**
	 * <!-- begin-user-doc --> Returns all persons with the given lastname.
	 * 
	 * @return List of Persons, null in error case. <!-- end-user-doc -->
	 * @model lastnameRequired="true"
	 * @generated
	 */
	EList<Person> getPersonsWithLastname(String lastname);

	/**
	 * <!-- begin-user-doc --> Returns all persons with the given firstname.
	 * 
	 * @return List of Persons, null in error case. <!-- end-user-doc -->
	 * @model firstnameRequired="true"
	 * @generated
	 */
	EList<Person> getPersonsWithFirstName(String firstname);

	/**
	 * <!-- begin-user-doc --> Returns a List of all top level Organizations
	 * contained in this DataSet. This means all organisations without a parent
	 * organisation.
	 * 
	 * @return List of Organizations, null in error case. <!-- end-user-doc -->
	 * @model kind="operation"
	 */
	EList<Organisation> getOrganisations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Searches for a Tag with the given name. <!-- end-model-doc -->
	 * 
	 * @model nameRequired="true"
	 * @generated
	 */
	Tag getTag(String name);

	/**
	 * <!-- begin-user-doc --> Returns a List of main Categories contained in
	 * this DataSet. This means all categories which don't have a parent
	 * category.
	 * 
	 * @return List of Categories, null in error case. <!-- end-user-doc -->
	 * @model kind="operation"
	 */
	EList<Category> getCategories();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Classification instances contained in this @link DataSet Data
	 * Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Classification> getClassifications();

	/**
	 * <!-- begin-user-doc --> Returns the meta tag with the given name.
	 * 
	 * @return The meta tag with the given name or null if it doesn't exist.
	 *         <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MetaTag getMetaTag(String name);

	/**
	 * <!-- begin-user-doc --> Returns a List of all Persons contained in this
	 * DataSet.
	 * 
	 * @return List of all Persons, null in error case. <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Person> getAllPersons();

	/**
	 * <!-- begin-user-doc --> Returns a List of all Contents contained in this
	 * DataSet.
	 * 
	 * @return List of all Contents, null in error case. <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Content> getAllContents();

	/**
	 * <!-- begin-user-doc --> Returns a List of all Organisations contained in
	 * this DataSet.
	 * 
	 * @return List of all Organisations, null in error case. <!-- end-user-doc
	 *         -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Organisation> getAllOrganisations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Category> getAllCategories();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Category getCategory(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Tag> getAllTags();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all items that are modified since the given date. <!--
	 * end-model-doc -->
	 * 
	 * @model dateRequired="true"
	 * @generated
	 */
	EList<Item> getItemsModifiedSince(Date date);

	/**
	 * <!-- begin-user-doc --> Returns a List of all MetaTags contained in this
	 * DataSet. The same like {@link DataSet#getAllMetaTags()}
	 * 
	 * @return List of all MetaTags, null in error case. <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link MetaTag Meta Tag@endlink instances contained in this @link DataSet Data Set@endlink.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<MetaTag> getMetaTags();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all binary Attachment instances contained in this @link DataSet
	 * Data Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Binary> getBinaries();

	/**
	 * <!-- begin-user-doc --> Returns a List of all Connections contained in
	 * this DataSet. The same like {@link DataSet#getAllConnections()}
	 * 
	 * @return List of all Connections, null in error case. <!-- end-user-doc
	 *         --> <!-- begin-model-doc --> Returns all Connection instances
	 *         contained in this @link DataSet Data Set@endlink. <!--
	 *         end-model-doc -->
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Document instances contained in this @link DataSet Data
	 * Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Document> getDocuments();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link EMail E-Mail@endlink instances contained in this @link
	 * DataSet Data Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Email> getEmails();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Extension instances contained in this @link DataSet Data
	 * Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Extension> getExtensions();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Image instances contained in this @link DataSet Data
	 * Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Image> getImages();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link InstantMessenger Instant Messenger@endlink instances
	 * contained in this @link DataSet Data Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<InstantMessenger> getInstantMessengers();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Location instances contained in this @link DataSet Data
	 * Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link MetaInformation Meta Information@endlink instances
	 * contained in this @link DataSet Data Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<MetaInformation> getMetaInformations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Phone instances contained in this @link DataSet Data
	 * Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Phone> getPhones();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Ranking instances contained in this @link DataSet Data
	 * Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Ranking> getRankings();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link StarRanking Star Ranking@endlink instances contained in
	 * this @link DataSet Data Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<StarRanking> getStarRankings();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link ThumbRanking Thumb Ranking@endlink instances contained
	 * in this @link DataSet Data Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<ThumbRanking> getThumbRankings();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Transformation instances contained in this @link DataSet Data
	 * Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Transformation> getTransformations();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Video instances contained in this @link DataSet Data
	 * Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Video> getVideos();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link ViewRanking View Ranking@endlink instances contained in
	 * this @link DataSet Data Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<ViewRanking> getViewRankings();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link WebAccount Web Account@endlink instances contained in
	 * this @link DataSet Data Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<WebAccount> getWebAccounts();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link WebSite Web Site@endlink instances contained in this @link
	 * DataSet Data Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<WebSite> getWebSites();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances
	 * which are tagged by all of the given @link MetaTag Meta Tags@endlink. If
	 * the list is empty or undefined then all @link InformationObject
	 * Information Object@endlink instances will be returned. <!-- end-model-doc
	 * -->
	 * 
	 * @model tagsMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemsWithOneOfMetaTags(tags)'"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsWithAllMetaTags(
			EList<MetaTag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances
	 * which are tagged by one of the given @link MetaTag Meta Tags@endlink. If
	 * the list is empty or undefined then all @link InformationObject
	 * Information Object@endlink instances will be returned. <!-- end-model-doc
	 * -->
	 * 
	 * @model tagsMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemsWithOneOfMetaTags(tags)'"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsWithOneOfMetaTags(
			EList<MetaTag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link Indentifier Identifier@endlink instances contained in
	 * this @link DataSet Data Set@endlink. <!-- end-model-doc -->
	 * 
	 * @model kind="operation" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link Indentifier Identifier@endlink instances contained in
	 * this @link DataSet Data Set@endlink having the given key. <!--
	 * end-model-doc -->
	 * 
	 * @model keyRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"self.key=\'\" + key + \"\'\"'"
	 * @generated
	 */
	EList<Identifier> getIdentifiersWithKey(String key);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the identifier with the unique key ident pair. <!-- end-model-doc
	 * -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"self.key=\'\" + key + \"\' and self.value=\'\" + value + \"\'\"'"
	 * @generated
	 */
	Identifier getIdentifierWithKeyValue(String key, String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the item identified by the identifier with the unique key ident
	 * pair. <!-- end-model-doc -->
	 * 
	 * @model
	 * @generated
	 */
	Item getItemWithIdentifier(String key, String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the person identified by the identifier with the unique key ident
	 * pair. <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemWithIdentifier(key, value)'"
	 * @generated
	 */
	Person getPersonWithIdentifier(String key, String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the content identified by the identifier with the unique key
	 * ident pair. <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemWithIdentifier(key, value)'"
	 * @generated
	 */
	Content getContentWithIdentifier(String key, String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the organisation identified by the identifier with the unique key
	 * ident pair. <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemWithIdentifier(key, value)'"
	 * @generated
	 */
	Organisation getOrganisationWithIdentifier(String key, String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the location identified by the identifier with the unique key
	 * ident pair. <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemWithIdentifier(key, value)'"
	 * @generated
	 */
	Location getLocationWithIdentifier(String key, String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the indoor location identified by the identifier with the unique
	 * key ident pair. <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemWithIdentifier(key, value)'"
	 * @generated
	 */
	IndoorLocation getIndoorLocationWithIdentifier(String key, String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the image identified by the identifier with the unique key ident
	 * pair. <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemWithIdentifier(key, value)'"
	 * @generated
	 */
	Image getImageWithIdentifier(String key, String value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns a empty item with the same type as the item identified by the
	 * given ident <!-- end-model-doc -->
	 * 
	 * @model
	 * @generated
	 */
	Item getEmptyItemWithIdent(String ident);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Tags which tagged more than the given x information objects
	 * <!-- end-model-doc -->
	 * 
	 * @model xRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"self.getCount() > \" + x'"
	 * @generated
	 */
	EList<Tag> getTagsWithMoreThanXInformationObjects(Integer x);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all items that are created since the given date. <!--
	 * end-model-doc -->
	 * 
	 * @model dateRequired="true"
	 * @generated
	 */
	EList<Item> getItemsCreatedSince(Date date);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Searches for Items matching the given search term. <!-- end-model-doc -->
	 * 
	 * @model termRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"self.matchesSearch(\'\" + term + \"\') = true\"'"
	 * @generated
	 */
	EList<Item> searchItems(String term);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Searches for Information Objects matching the given search term. <!--
	 * end-model-doc -->
	 * 
	 * @model termRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"self.matchesSearch(\'\" + term + \"\') = true\"'"
	 * @generated
	 */
	EList<InformationObject> searchInformationObjects(String term);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink having the
	 * given attachment. <!-- end-model-doc -->
	 * 
	 * @model attachmentRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"((self.getAttachments())->notEmpty()) and (self.getAttachments()->exists(a | a.ident = \'\" + attachment.getIdent()  + \"\'))\";' input='getInformationObjects()'"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsWithAttachment(
			Attachment attachment);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link Person Persons@endlink having the given attachment.
	 * <!-- end-model-doc -->
	 * 
	 * @model attachmentRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithAttachment(attachment)'"
	 * @generated
	 */
	EList<Person> getPersonsWithAttachment(Attachment attachment);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link Organisation Organisations@endlink having the given
	 * attachment. <!-- end-model-doc -->
	 * 
	 * @model attachmentRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithAttachment(attachment)'"
	 * @generated
	 */
	EList<Organisation> getOrganisationsWithAttachment(Attachment attachment);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link Content Contents@endlink having the given attachment.
	 * <!-- end-model-doc -->
	 * 
	 * @model attachmentRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithAttachment(attachment)'"
	 * @generated
	 */
	EList<Content> getContentsWithAttachment(Attachment attachment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the dataset already contains equal items, they will be returned. Otherwise null is returned. It can be a list, cause the given item can contain informations that unveil that two or more existing items are equal.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Item> getEqualItems(Item item);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * the dataset already contains an equal item true will be returned.
	 * Otherwise false is returned. <!-- end-model-doc -->
	 * 
	 * @model required="true"
	 * @generated
	 */
	Boolean hasEqualItem(Item item);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the item with the given ident, or null if it does not exist. <!--
	 * end-model-doc -->
	 * 
	 * @model identRequired="true"
	 * @generated
	 */
	Item getItemsWithIdent(String ident);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Attachments with the given cached file name <!--
	 * end-model-doc -->
	 * 
	 * @model cachedFileNameRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"self.cachedFileName = \'\" + cachedFileName + \"\'\"'"
	 * @generated
	 */
	EList<Attachment> getAttachmentsWithCachedFileName(String cachedFileName);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Events after the given date. <!-- end-model-doc -->
	 * 
	 * @model dateRequired="true"
	 * @generated
	 */
	EList<Event> getEventsAfter(Date date);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Events before the given date. <!-- end-model-doc -->
	 * 
	 * @model dateRequired="true"
	 * @generated
	 */
	EList<Event> getEventsBefore(Date date);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Events between the two given dates. <!-- end-model-doc -->
	 * 
	 * @model afterRequired="true" beforeRequired="true"
	 * @generated
	 */
	EList<Event> getEventsBetweenDates(Date after, Date before);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns the data set as spicynodes representation @see
	 * http://www.spicynodes.org/ <!-- end-model-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	String getSpicynodesRepresentation();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Connection instances that exist between information objects
	 * having different categories <!-- end-model-doc -->
	 * 
	 * @model kind="operation"
	 * @generated
	 */
	EList<Connection> getConnectionsBetweenInformationObjectsOfDifferentCategories();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Objects@endlink modified
	 * since the given date. <!-- end-model-doc -->
	 * 
	 * @model dateRequired="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemsModifiedSince(date)'"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsModifiedSince(Date date);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns x random information objects. <!-- end-model-doc -->
	 * 
	 * @model xRequired="true"
	 * @generated
	 */
	EList<InformationObject> getRandomXInformationObjects(Integer x);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns x random contents. <!-- end-model-doc -->
	 * 
	 * @model xRequired="true"
	 * @generated
	 */
	EList<Content> getRandomXContents(Integer x);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns x random persons. <!-- end-model-doc -->
	 * 
	 * @model xRequired="true"
	 * @generated
	 */
	EList<Person> getRandomXPersons(Integer x);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns x random organisations. <!-- end-model-doc -->
	 * 
	 * @model xRequired="true"
	 * @generated
	 */
	EList<Organisation> getRandomXOrganisations(Integer x);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds the given item without merging and ident changing.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel noREST='true'"
	 * @generated
	 */
	Item forceAdd(Item item);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a comma separated list of the idents of all existing items.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getIdentsOfExistingItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Category getCategoryWithSlug(String slug);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rebuilds all indexes used for performance.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel noREST='true'"
	 * @generated
	 */
	void rebuildIndexes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances which are tagged by all of the given @link MetaTag Meta Tags@endlink. If the list is empty or undefined then all @link InformationObject Information Object@endlink instances will be returned.
	 * <!-- end-model-doc -->
	 * @model tagsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemsWithOneOfMetaTags(tags)'"
	 * @generated
	 */
	EList<Content> getContentsWithAllMetaTags(EList<MetaTag> tags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances which are tagged by one of the given @link MetaTag Meta Tags@endlink. If the list is empty or undefined then all @link InformationObject Information Object@endlink instances will be returned.
	 * <!-- end-model-doc -->
	 * @model tagsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemsWithOneOfMetaTags(tags)'"
	 * @generated
	 */
	EList<Content> getContentsWithOneOfMetaTags(EList<MetaTag> tags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances which are tagged by all of the given @link MetaTag Meta Tags@endlink. If the list is empty or undefined then all @link InformationObject Information Object@endlink instances will be returned.
	 * <!-- end-model-doc -->
	 * @model tagsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemsWithOneOfMetaTags(tags)'"
	 * @generated
	 */
	EList<Person> getPersonsWithAllMetaTags(EList<MetaTag> tags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances which are tagged by one of the given @link MetaTag Meta Tags@endlink. If the list is empty or undefined then all @link InformationObject Information Object@endlink instances will be returned.
	 * <!-- end-model-doc -->
	 * @model tagsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemsWithOneOfMetaTags(tags)'"
	 * @generated
	 */
	EList<Person> getPersonsWithOneOfMetaTags(EList<MetaTag> tags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances which are tagged by all of the given @link MetaTag Meta Tags@endlink. If the list is empty or undefined then all @link InformationObject Information Object@endlink instances will be returned.
	 * <!-- end-model-doc -->
	 * @model tagsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemsWithOneOfMetaTags(tags)'"
	 * @generated
	 */
	EList<Organisation> getOrganisationsWithAllMetaTags(EList<MetaTag> tags);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances which are tagged by one of the given @link MetaTag Meta Tags@endlink. If the list is empty or undefined then all @link InformationObject Information Object@endlink instances will be returned.
	 * <!-- end-model-doc -->
	 * @model tagsMany="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getItemsWithOneOfMetaTags(tags)'"
	 * @generated
	 */
	EList<Organisation> getOrganisationsWithOneOfMetaTags(EList<MetaTag> tags);

	/**
	 * Returns all Attachments.
	 * 
	 * @return All Attachments of this DataSet.
	 * @generated
	 */
	EList<Attachment> getAttachments();

	/**
	 * Returns all IndoorLocations.
	 * 
	 * @return All IndoorLocations of this DataSet.
	 * @generated
	 */
	EList<IndoorLocation> getIndoorLocations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all items except the identifiers
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Item> getItemsExceptIdentifiers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a comma separated list of the idents of all deleted items.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getIdentsOfDeletedItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all items that are deleted since the given date.
	 * <!-- end-model-doc -->
	 * @model dateRequired="true"
	 * @generated
	 */
	EList<DeletedItem> getItemsDeletedSince(Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a comma separated list of the idents of all items that are deleted since the given date.
	 * <!-- end-model-doc -->
	 * @model dateRequired="true"
	 * @generated
	 */
	String getIdentsOfItemsDeletedSince(Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clears the list of deleted items.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<DeletedItem> clearDeletedItemsList();

	/**
	 * Returns all DeletedItems.
	 *
	 * @return All DeletedItems of this DataSet.
	 * @generated
	 */
	EList<DeletedItem> getDeletedItems();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all items except the identifiers which are created since the given date.
	 * <!-- end-model-doc -->
	 * @model dateRequired="true"
	 * @generated
	 */
	EList<Item> getItemsExceptIdentifiersCreatedSince(Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all items except the identifiers which are modiefied since the given date.
	 * <!-- end-model-doc -->
	 * @model dateRequired="true"
	 * @generated
	 */
	EList<Item> getItemsExceptIdentifiersModifiedSince(Date date);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reloads the files of all attachments and returns the attachments contained in this @link DataSet Data Set@endlink.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Attachment> reloadAllAttachmentFiles();

	/**
	 * Returns all Events.
	 * 
	 * @return All Events of this DataSet.
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Searches for Items matching the given search term.
	 * <!-- end-model-doc -->
	 * @model queryRequired="true"
	 * @generated
	 */
	EList<Item> searchByQuery(String query);

	/**
	 * <!-- begin-user-doc --> Returns a List of all MetaTags contained in this
	 * DataSet.
	 * 
	 * @return List of all MetaTags, null in error case. <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<MetaTag> getAllMetaTags();

	/**
	 * <!-- begin-user-doc --> Returns a List of all Connections contained in
	 * this DataSet.
	 * 
	 * @return List of all Connections, null in error case. <!-- end-user-doc
	 *         -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Connection> getAllConnections();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel noREST='true'"
	 * @generated
	 */
	void log(String message);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel noREST='true'"
	 * @generated
	 */
	void log(String message, Integer level);

	/**
	 * <!-- begin-user-doc --> Returns a List of all Persons contained in this
	 * DataSet. The same like {@link DataSet#getAllPersons()}
	 * 
	 * @return List of all Persons, null in error case. <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all Person instances contained in this @link DataSet Data Set@endlink.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"'"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Content instances which are in all of the given @link
	 * Category Categories@endlink. If the list is empty or undefined then all
	 * Content instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model categoriesMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithAllCategories(categories)'"
	 * @generated
	 */
	EList<Content> getContentsWithAllCategories(EList<Category> categories);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Content instances which are in only of the given @link
	 * Category Categories@endlink. If the list is empty or undefined then all
	 * Content instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model categoriesMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithOneOfCategories(categories)'"
	 * @generated
	 */
	EList<Content> getContentsWithOneOfCategories(EList<Category> categories);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Person instances which are in all of the given @link Category
	 * Categories@endlink. If the list is empty or undefined then all Person
	 * instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model categoriesMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithAllCategories(categories)'"
	 * @generated
	 */
	EList<Person> getPersonsWithAllCategories(EList<Category> categories);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Person instances which are in one of the given @link Category
	 * Categories@endlink. If the list is empty or undefined then all Person
	 * instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model categoriesMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithOneOfCategories(categories)'"
	 * @generated
	 */
	EList<Person> getPersonsWithOneOfCategories(EList<Category> categories);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Organisation instances which are in all of the given @link
	 * Category Categories@endlink. If the list is empty or undefined then all
	 * Organisation instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model categoriesMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithAllCategories(categories)'"
	 * @generated
	 */
	EList<Organisation> getOrganisationsWithAllCategories(
			EList<Category> categories);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Organisation instances which are in one of the given @link
	 * Category Categories@endlink. If the list is empty or undefined then all
	 * Organisation instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model categoriesMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithOneOfCategories(categories)'"
	 * @generated
	 */
	EList<Organisation> getOrganisationsWithOneOfCategories(
			EList<Category> categories);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances
	 * which are tagged by all of the given @link Tag Tags@endlink. If the list
	 * is empty or undefined then all @link InformationObject Information
	 * Object@endlink instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model tagsMany="true"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsWithAllTags(EList<Tag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances
	 * which are tagged by one of the given @link Tag Tags@endlink. If the list
	 * is empty or undefined then all @link InformationObject Information
	 * Object@endlink instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model tagsMany="true"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsWithOneOfTags(EList<Tag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Organisation instances which are tagged with all of the given @link
	 * Tag Tags@endlink. If the list is empty or undefined then all Organisation
	 * instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model tagsMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithAllTags(tags)'"
	 * @generated
	 */
	EList<Organisation> getOrganisationsWithAllTags(EList<Tag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Organisation instances which are tagged by one of the given @link
	 * Tag Tags@endlink. If the list is empty or undefined then all Organisation
	 * instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model tagsMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithOneOfTags(tags)'"
	 * @generated
	 */
	EList<Organisation> getOrganisationsWithOneOfTags(EList<Tag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Person instances which are tagged with all of the given @link
	 * Tag Tags@endlink. If the list is empty or undefined then all Person
	 * instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model tagsMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithAllTags(tags)'"
	 * @generated
	 */
	EList<Person> getPersonsWithAllTags(EList<Tag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Person instances which are tagged by one of the given @link
	 * Tag Tags@endlink. If the list is empty or undefined then all Organisation
	 * instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model tagsMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithOneOfTags(tags)'"
	 * @generated
	 */
	EList<Person> getPersonsWithOneOfTags(EList<Tag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Content instances which are tagged with all of the given @link
	 * Tag Tags@endlink. If the list is empty or undefined then all Organisation
	 * instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model tagsMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithAllTags(tags)'"
	 * @generated
	 */
	EList<Content> getContentsWithAllTags(EList<Tag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Content instances which are tagged with one of the given @link
	 * Tag Tags@endlink. If the list is empty or undefined then all Organisation
	 * instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model tagsMany="true" annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getInformationObjectsWithOneOfTags(tags)'"
	 * @generated
	 */
	EList<Content> getContentsWithOneOfTags(EList<Tag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Content instances with the given name. <!-- end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"self.name=\'\" + name + \"\'\"'"
	 * @generated
	 */
	EList<Content> getContentsWithName(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Organisation instances with the given name. <!--
	 * end-model-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"self.name=\'\" + name + \"\'\"'"
	 * @generated
	 */
	EList<Organisation> getOrganisationsWithName(String name);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all Extension instances which are tagged by all of the given @link
	 * MetaTag Meta Tags@endlink. If the list is empty or undefined then all
	 * item instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model tagsMany="true"
	 * @generated
	 */
	EList<Item> getItemsWithAllMetaTags(EList<MetaTag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all items instances which are tagged by one of the given @link
	 * MetaTag@endlink. If the list is empty or undefined then all item
	 * instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model tagsMany="true"
	 * @generated
	 */
	EList<Item> getItemsWithOneOfMetaTags(EList<MetaTag> tags);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Adds the given item to this @link DataSet Data Set@endlink. <!--
	 * end-model-doc -->
	 * 
	 * @model
	 * @generated
	 */
	Item add(Item item);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Content getContentWithIdent(String ident);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Person getPersonWithIdent(String ident);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Organisation getOrganisationWithIdent(String ident);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Attachment getAttachmentWithIdent(String ident);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances
	 * which are in all of the given @link Category Categories@endlink. If the
	 * list is empty or undefined then all @link InformationObject Information
	 * Object@endlink instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model categoriesMany="true"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsWithAllCategories(
			EList<Category> categories);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Returns all @link InformationObject Information Object@endlink instances
	 * which are in one of the given @link Category Categories@endlink. If the
	 * list is empty or undefined then all @link InformationObject Information
	 * Object@endlink instances will be returned. <!-- end-model-doc -->
	 * 
	 * @model categoriesMany="true"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsWithOneOfCategories(
			EList<Category> categories);

	/**
	 * An EObjectCondition to check whether an Object is of the type DataSet.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.DataSetImpl.generateIsTypeCondition();

	/**
	 * This method can be used to recursively and generically call the Getter,
	 * Setters and Operations of the generated classes.
	 * 
	 * @param input
	 *            The commands to be processed.
	 * @param requestType
	 *            The HTTP-Method of the request.
	 * 
	 * @return The result of the Getter/Operation or null.
	 * 
	 * @generated
	 */
	public Object process(LinkedList<RestCommand> input, RequestType requestType)
			throws ArgNotFoundException, WrongArgException,
			WrongArgCountException, UnknownOperationException;

	/**
	 * <!-- begin-user-doc --> Returns a List of all Contents contained in this
	 * DataSet.
	 * 
	 * @return List of all Contents, null in error case. <!-- end-user-doc -->
	 * @model kind="operation"
	 */
	EList<Content> getContents();

	/**
	 * Sets the log service to be used for data logging.
	 * 
	 * @param logService
	 *            LogService to be used for logging
	 */
	public void setLogService(LogService logService);

	/**
	 * If set to true the last modification date of the data set and all
	 * contained items will updated automatically.
	 * 
	 * @param automaticUpdate
	 *            True to enable automatic update
	 */
	public void setUpdateModificationDate(boolean automaticUpdate);

	/**
	 * Calculates the last modified date from the contained items.
	 * 
	 */
	public void calculateLastModificationDate();

	
	/**
	 * Returns true if the automatic update of the modification date is enabled.
	 * 
	 * @return True if the automatic update of the modification date is enabled.
	 */
	public boolean isUpdateModificationDate();
	
	/**
	 * Searches items that match the given term using the given term matcher.
	 * 
	 * @param term Search term to match
	 * @param matcher Matcher used for term matching
	 * @return Item matching the given term
	 */
	public EList<Item> searchItemsWithMatcher(String term, ItemTermMatcher matcher); 

} // DataSet
