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
package org.sociotech.communitymashup.collection;

import java.util.Date;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.sociotech.communitymashup.data.Category;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.data.MetaTag;
import org.sociotech.communitymashup.data.Organisation;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.data.Tag;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Smart Collections maintaining a list of "Information Objects" depending on given meta informations (tags, meta tags, classifications)
 * or if they belong to a person or an organisation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveTags <em>Positive Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeTags <em>Negative Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveMetaTags <em>Positive Meta Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveCategories <em>Positive Categories</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositivePersons <em>Positive Persons</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeMetaTags <em>Negative Meta Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeCategories <em>Negative Categories</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativePersons <em>Negative Persons</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getPositiveOrganisations <em>Positive Organisations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getNegativeOrganisations <em>Negative Organisations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludePersons <em>Include Persons</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludeOrganisations <em>Include Organisations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludeContents <em>Include Contents</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getMinimumAge <em>Minimum Age</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection()
 * @model
 * @generated
 */
public interface SmartInformationObjectCollection extends ItemsCollection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Positive Tags</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Tags</em>' reference list.
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_PositiveTags()
	 * @model
	 * @generated
	 */
	EList<Tag> getPositiveTags();

	/**
	 * Returns the value of the '<em><b>Negative Tags</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Tags</em>' reference list.
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_NegativeTags()
	 * @model
	 * @generated
	 */
	EList<Tag> getNegativeTags();

	/**
	 * Returns the value of the '<em><b>Positive Meta Tags</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.MetaTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Meta Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Meta Tags</em>' reference list.
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_PositiveMetaTags()
	 * @model
	 * @generated
	 */
	EList<MetaTag> getPositiveMetaTags();

	/**
	 * Returns the value of the '<em><b>Positive Categories</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Categories</em>' reference list.
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_PositiveCategories()
	 * @model
	 * @generated
	 */
	EList<Category> getPositiveCategories();

	/**
	 * Returns the value of the '<em><b>Positive Persons</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Persons</em>' reference list.
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_PositivePersons()
	 * @model
	 * @generated
	 */
	EList<Person> getPositivePersons();

	/**
	 * Returns the value of the '<em><b>Negative Meta Tags</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.MetaTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Meta Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Meta Tags</em>' reference list.
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_NegativeMetaTags()
	 * @model
	 * @generated
	 */
	EList<MetaTag> getNegativeMetaTags();

	/**
	 * Returns the value of the '<em><b>Negative Categories</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Categories</em>' reference list.
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_NegativeCategories()
	 * @model
	 * @generated
	 */
	EList<Category> getNegativeCategories();

	/**
	 * Returns the value of the '<em><b>Negative Persons</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Persons</em>' reference list.
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_NegativePersons()
	 * @model
	 * @generated
	 */
	EList<Person> getNegativePersons();

	/**
	 * Returns the value of the '<em><b>Positive Organisations</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Organisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive Organisations</em>' reference list.
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_PositiveOrganisations()
	 * @model
	 * @generated
	 */
	EList<Organisation> getPositiveOrganisations();

	/**
	 * Returns the value of the '<em><b>Negative Organisations</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Organisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative Organisations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative Organisations</em>' reference list.
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_NegativeOrganisations()
	 * @model
	 * @generated
	 */
	EList<Organisation> getNegativeOrganisations();

	/**
	 * Returns the value of the '<em><b>Include Persons</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Persons</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Persons</em>' attribute.
	 * @see #setIncludePersons(Boolean)
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_IncludePersons()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIncludePersons();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludePersons <em>Include Persons</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Persons</em>' attribute.
	 * @see #getIncludePersons()
	 * @generated
	 */
	void setIncludePersons(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Organisations</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Organisations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Organisations</em>' attribute.
	 * @see #setIncludeOrganisations(Boolean)
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_IncludeOrganisations()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIncludeOrganisations();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludeOrganisations <em>Include Organisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Organisations</em>' attribute.
	 * @see #getIncludeOrganisations()
	 * @generated
	 */
	void setIncludeOrganisations(Boolean value);

	/**
	 * Returns the value of the '<em><b>Include Contents</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Contents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Contents</em>' attribute.
	 * @see #setIncludeContents(Boolean)
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_IncludeContents()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIncludeContents();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getIncludeContents <em>Include Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Contents</em>' attribute.
	 * @see #getIncludeContents()
	 * @generated
	 */
	void setIncludeContents(Boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Age</em>' attribute.
	 * @see #setMinimumAge(Date)
	 * @see org.sociotech.communitymashup.collection.CollectionPackage#getSmartInformationObjectCollection_MinimumAge()
	 * @model
	 * @generated
	 */
	Date getMinimumAge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds an item used as positive filter.
	 * <!-- end-model-doc -->
	 * @model itemRequired="true"
	 * @generated
	 */
	Item addPositive(Item item);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds an item used as negative filter.
	 * <!-- end-model-doc -->
	 * @model itemRequired="true"
	 * @generated
	 */
	Item addNegative(Item item);



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes an item used as filter.
	 * <!-- end-model-doc -->
	 * @model itemRequired="true"
	 * @generated
	 */
	Item remove(Item item);



	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.collection.SmartInformationObjectCollection#getMinimumAge <em>Minimum Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Age</em>' attribute.
	 * @see #getMinimumAge()
	 * @generated
	 */
	void setMinimumAge(Date value);



	/**
	 * An EObjectCondition to check whether an Object is of the type SmartInformationObjectCollection.
	 * 
	 * @generated
	 */
	public EObjectCondition isTypeCondition = org.sociotech.communitymashup.collection.impl.SmartInformationObjectCollectionImpl.generateIsTypeCondition();


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
} // SmartInformationObjectCollection
