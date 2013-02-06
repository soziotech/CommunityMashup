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
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Item is an abstract superclass of @link InformationObject Information Object@endlink, Extension, Classification and @link MetaTag Meta Tag@endlink. Every Item can be classified by @link MetaTag Meta Tags@endlink.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.Item#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Item#getIdent <em>Ident</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Item#getUri <em>Uri</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Item#getStringValue <em>String Value</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Item#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Item#getCreated <em>Created</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Item#getMetaTags <em>Meta Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.Item#getIdentifiedBy <em>Identified By</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getItem()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel restSuperClass='true'"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Data Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.DataSet#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' container reference.
	 * @see #setDataSet(DataSet)
	 * @see org.sociotech.communitymashup.data.DataPackage#getItem_DataSet()
	 * @see org.sociotech.communitymashup.data.DataSet#getItems
	 * @model opposite="items" resolveProxies="false"
	 * @generated
	 */
	DataSet getDataSet();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Item#getDataSet <em>Data Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set</em>' container reference.
	 * @see #getDataSet()
	 * @generated
	 */
	void setDataSet(DataSet value);

	/**
	 * Returns the value of the '<em><b>Ident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ident</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident</em>' attribute.
	 * @see #setIdent(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getItem_Ident()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getIdent();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Item#getIdent <em>Ident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident</em>' attribute.
	 * @see #getIdent()
	 * @generated
	 */
	void setIdent(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getItem_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Item#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getItem_StringValue()
	 * @model unique="false"
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Item#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(Date)
	 * @see org.sociotech.communitymashup.data.DataPackage#getItem_LastModified()
	 * @model
	 * @generated
	 */
	Date getLastModified();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Item#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Date value);

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
	 * @see org.sociotech.communitymashup.data.DataPackage#getItem_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.Item#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Meta Tags</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.MetaTag}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.MetaTag#getMetaTagged <em>Meta Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Tags</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getItem_MetaTags()
	 * @see org.sociotech.communitymashup.data.MetaTag#getMetaTagged
	 * @model opposite="metaTagged"
	 * @generated
	 */
	EList<MetaTag> getMetaTags();

	/**
	 * Returns the value of the '<em><b>Identified By</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Identifier}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Identifier#getIdentified <em>Identified</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identified By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identified By</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getItem_IdentifiedBy()
	 * @see org.sociotech.communitymashup.data.Identifier#getIdentified
	 * @model opposite="identified"
	 * @generated
	 */
	EList<Identifier> getIdentifiedBy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel noREST='true'"
	 * @generated
	 */
	String toAttributeMapString();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel noREST='true'"
	 * @generated
	 */
	void log(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel noREST='true'"
	 * @generated
	 */
	void log(String message, Integer level);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tags this item with a @link MetaTag Meta Tag@endlink represented by the given name. If the @link MetaTag Meta Tag@endlink already exists, this item will be added to its tagged items. If it does not exist, it will be created. The new or updated @link MetaTag Meta Tag@endlink will be returned.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	MetaTag metaTag(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an identifierer with the given key value pair to identify this item.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Identifier identifyBy(String key, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the @link Identifier Identifier@endlink for the key. Returns null if no identifier exists for that key.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Identifier getIdentifier(String key);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns wether this item is meta tagged by the given tag or not.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Boolean hasMetaTag(String tag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this item fulfills the provided search.
	 * <!-- end-model-doc -->
	 * @model required="true" termRequired="true"
	 * @generated
	 */
	Boolean matchesSearch(String term);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deletes this item from the data set.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void delete();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns true, if the given item is equal to this item. Should be used like equals method for object. EMF does not allow to overwrite equals method.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 * @generated
	 */
	Boolean isEqualItem(Item item);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the created date with pretty formatting like "Two days ago". Language must be set in iso language code {@linkplain http://ftp.ics.uci.edu/pub/ietf/http/related/iso639.txt}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	String getCreatedPrettyInLanguage(String language);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the created date with pretty formatting like "Two days ago".
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCreatedPretty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the modified date with pretty formatting like "Two days ago". Language must be set in iso language code {@linkplain http://ftp.ics.uci.edu/pub/ietf/http/related/iso639.txt}
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	String getLastModifiedPrettyInLanguage(String language);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the modified date with pretty formatting like "Two days ago".
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLastModifiedPretty();

	/**
	 * An EObjectCondition to check whether an Object is of the type Item.
	 * 
	 * @generated
	 */
public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.ItemImpl.generateIsTypeCondition();

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

} // Item
