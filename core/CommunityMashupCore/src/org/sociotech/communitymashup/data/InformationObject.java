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

import java.io.InputStream;
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
 * A representation of the model object '<em><b>Information Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An @link InformationObject Information Object@endlink is an abstract superclass of Content, Organisation and Person. Every @link InformationObject Information Object@endlink can be classified by Category and Tag instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getTags <em>Tags</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getImages <em>Images</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getStarRankings <em>Star Rankings</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getThumbRankings <em>Thumb Rankings</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getViewRankings <em>View Rankings</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getName <em>Name</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getConnectedTo <em>Connected To</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getConnectedBy <em>Connected By</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getBinaries <em>Binaries</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getMainCategory <em>Main Category</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getMetaInformations <em>Meta Informations</em>}</li>
 *   <li>{@link org.sociotech.communitymashup.data.InformationObject#getAlternativeNames <em>Alternative Names</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject()
 * @model abstract="true"
 * @generated
 */
public interface InformationObject extends Item {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Category}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Category#getCategorized <em>Categorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_Categories()
	 * @see org.sociotech.communitymashup.data.Category#getCategorized
	 * @model opposite="categorized"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Tag}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Tag#getTagged <em>Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_Tags()
	 * @see org.sociotech.communitymashup.data.Tag#getTagged
	 * @model opposite="tagged"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_Images()
	 * @model
	 * @generated
	 */
	EList<Image> getImages();

	/**
	 * Returns the value of the '<em><b>Star Rankings</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.StarRanking}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.StarRanking#getRankedInformationObject <em>Ranked Information Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Star Rankings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Star Rankings</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_StarRankings()
	 * @see org.sociotech.communitymashup.data.StarRanking#getRankedInformationObject
	 * @model opposite="rankedInformationObject"
	 * @generated
	 */
	EList<StarRanking> getStarRankings();

	/**
	 * Returns the value of the '<em><b>Thumb Rankings</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.ThumbRanking}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.ThumbRanking#getRankedInformationObject <em>Ranked Information Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thumb Rankings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumb Rankings</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_ThumbRankings()
	 * @see org.sociotech.communitymashup.data.ThumbRanking#getRankedInformationObject
	 * @model opposite="rankedInformationObject"
	 * @generated
	 */
	EList<ThumbRanking> getThumbRankings();

	/**
	 * Returns the value of the '<em><b>View Rankings</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.ViewRanking}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.ViewRanking#getRankedInformationObject <em>Ranked Information Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Rankings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Rankings</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_ViewRankings()
	 * @see org.sociotech.communitymashup.data.ViewRanking#getRankedInformationObject
	 * @model opposite="rankedInformationObject"
	 * @generated
	 */
	EList<ViewRanking> getViewRankings();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returns the name of the information object. If the name is not explicitly set, then this methods return an generated name value depending
	 * on the information objects data type.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.InformationObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Connection}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Connection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_ConnectedTo()
	 * @see org.sociotech.communitymashup.data.Connection#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Connection> getConnectedTo();

	/**
	 * Returns the value of the '<em><b>Connected By</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Connection}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Connection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected By</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_ConnectedBy()
	 * @see org.sociotech.communitymashup.data.Connection#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Connection> getConnectedBy();

	/**
	 * Returns the value of the '<em><b>Binaries</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.Binary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binaries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binaries</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_Binaries()
	 * @model
	 * @generated
	 */
	EList<Binary> getBinaries();

	/**
	 * Returns the value of the '<em><b>Main Category</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.Category#getMainCategorized <em>Main Categorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Category</em>' reference.
	 * @see #setMainCategory(Category)
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_MainCategory()
	 * @see org.sociotech.communitymashup.data.Category#getMainCategorized
	 * @model opposite="mainCategorized"
	 * @generated
	 */
	Category getMainCategory();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.InformationObject#getMainCategory <em>Main Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Category</em>' reference.
	 * @see #getMainCategory()
	 * @generated
	 */
	void setMainCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Meta Informations</b></em>' reference list.
	 * The list contents are of type {@link org.sociotech.communitymashup.data.MetaInformation}.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.MetaInformation#getInformationObjects <em>Information Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Informations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Informations</em>' reference list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_MetaInformations()
	 * @see org.sociotech.communitymashup.data.MetaInformation#getInformationObjects
	 * @model opposite="informationObjects"
	 * @generated
	 */
	EList<MetaInformation> getMetaInformations();

	/**
	 * Returns the value of the '<em><b>Alternative Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Names</em>' attribute list.
	 * @see org.sociotech.communitymashup.data.DataPackage#getInformationObject_AlternativeNames()
	 * @model
	 * @generated
	 */
	EList<String> getAlternativeNames();

	/**
	 * <!-- begin-user-doc -->
	 * Searches for the Tag with the given string value using {@link DataSet#findTag(String)}. If the Tag doesn't exist in the data
	 * set it will be created. The Information object will then be added to the tagged objects of the new or existing Tag. A new 
	 * Tag will automatically be added to the same data set as this information object. This method will only work, if this information
	 * object is already contained in a data set.
	 * 
	 * @return The found or the newly created tag. Null in error case.
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	Tag tag(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Searches for the Category with the given string value using {@link DataSet#findCategory(String)}. If the Category doesn't exist in the data
	 * set it will be created. The Information object will then be added to the categorized objects of the new or existing category. A new 
	 * Category will bed automatically added to the same data set as this information object. This method will only work, if this information
	 * object is already contained in a data set.
	 * 
	 * @return The found or the newly created tag. Null in error case.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Category categorize(String name);

	/**
	 * <!-- begin-user-doc -->
	 * Creates an new {@link Image} object and adds it to the information objects images. This method will only work, if this information
	 * object is already contained in a data set.
	 * 
	 * @return Returns the newly created Image or null in error case.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Image attachImage(String imageUrl);

	/**
	 * Creates an new {@link Image} object from the given input stream and adds it to the information objects images. This method will only work, if this information
	 * object is already contained in a data set. The newly created object is only valid locally as long as the cache exists ({@link Attachment#getCachedOnly()}).
	 *
	 * @param imageUrl Url that addresses the file
	 * @param stream Stream providing the image data
	 * @return The attached Image object
	 */
	Image attachImage(String imageUrl, InputStream stream);

	/**
	 * <!-- begin-user-doc -->
	 * Returns all Attachments of this Information Object.
	 * 
	 * @return List of {@link Attachment}
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Attachment> getAttachments();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	StarRanking starRank(Integer stars, Integer ofStars);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ViewRanking view();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ThumbRanking thumbsUp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ThumbRanking thumbsDown();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link ThumbRanking Thumb Ranking@endlink instances of this @link InformationObject Information Object@endlink which imply thumbs up.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"self.stringValue=\'\" + ThumbRanking.THUMBS_UP_VALUE + \"\'\"' input='getThumbRankings()'"
	 * @generated
	 */
	EList<ThumbRanking> getThumbsUp();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link ThumbRanking Thumb Ranking@endlink instances of this @link InformationObject Information Object@endlink which imply thumbs up.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"self.stringValue=\'\" + ThumbRanking.THUMBS_DOWN_VALUE + \"\'\"' input='getThumbRankings()'"
	 * @generated
	 */
	EList<ThumbRanking> getThumbsDown();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the amount of given thumbs ups for this @link InformationObject Information Object@endlink.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Integer getThumbsUpCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the amount of given thumbs down for this @link InformationObject Information Object@endlink.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Integer getThumbsDownCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the amount of given thumbs up minus thumbs down.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Integer getThumbsCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the amount of views for this @link InformationObject Information Object@endlink.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Integer getViewsCount();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the average star ranking for this @link InformationObject Information Object@endlink normalized between 0 and 1. Null if it is not yet ranked.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Double getStarRanking();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MetaInformation extend(MetaInformation metaInformation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link WebAccount Web Account@endlink instances that are @link MetaInformation Meta Informations@endlink for this @link InformationObject Information Object@endlink.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getMetaInformations()'"
	 * @generated
	 */
	EList<WebAccount> getWebAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link WebSite Web Site@endlink instances that are @link MetaInformation Meta Informations@endlink for this @link InformationObject Information Object@endlink.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getMetaInformations()'"
	 * @generated
	 */
	EList<WebSite> getWebSites();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all Phone instances that are @link MetaInformation Meta Informations@endlink for this @link InformationObject Information Object@endlink.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getMetaInformations()'"
	 * @generated
	 */
	EList<Phone> getPhones();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all Location instances that are @link MetaInformation Meta Informations@endlink for this @link InformationObject Information Object@endlink.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getMetaInformations()'"
	 * @generated
	 */
	EList<Location> getLocations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link EMail E-Mail@endlink instances that are @link MetaInformation Meta Informations@endlink for this @link InformationObject Information Object@endlink.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getMetaInformations()'"
	 * @generated
	 */
	EList<Email> getEmails();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all @link InstantMessenger Instant Messenger@endlink instances that are @link MetaInformation Meta Informations@endlink for this @link InformationObject Information Object@endlink.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel OCLCondition='\"true\"' input='getMetaInformations()'"
	 * @generated
	 */
	EList<InstantMessenger> getInstantMessengers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" emailAdressRequired="true"
	 * @generated
	 */
	Email addEmailAddress(String emailAdress);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" urlRequired="true"
	 * @generated
	 */
	WebSite addWebSite(String url);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all Information Objects that have at least one tag in common.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsWithCommonTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" usernameRequired="true"
	 * @generated
	 */
	WebAccount addWebAccount(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean hasImages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all information objects with a @link Connection connection@endlink from this information object to the other.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsConnectedTo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all information objects with a @link Connection connection@endlink from the other information object to this one.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsConnectedFrom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all information objects with a @link Connection connection@endlink from this information object to the other or in the inverse direction.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsConnected();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connects this information object to the given other information object if it not already connected and returns the created or exiting connection.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Connection connectTo(InformationObject informationObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connects this information object to the given other information object if it not already connected and returns the created or exiting connection. Adds the given meta tag to the connection.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Connection connectToWithMetaTag(InformationObject informationObject, String metaTag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all information objecst with a @link Connection connection@endlink, taggeg by the given meta tag, from this information object to the other.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsConnectedToWithMetaTag(String metaTag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all information objects with a @link Connection connection@endlink, taggeg by the given meta tag, from the other information object to this one.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsConnectedFromWithMetaTag(String metaTag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all information objects with a @link Connection connection@endlink, taggeg by the given meta tag, from this information object to the other or in the inverse direction.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<InformationObject> getInformationObjectsConnectedWithMetaTag(String metaTag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns, if it exists, the @link Connection connection@endlink from this information object to the given information object.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Connection> getConnectionsFrom(InformationObject informationObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns, if it exists, the @link Connection connection@endlink from the given information object to this information object.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Connection> getConnectionsTo(InformationObject informationObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connects this information object to the given other information object and sets the value as stringValue of the connection if it not already connected and returns the created or exiting connection. Adds the given meta tag to the connection.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Connection connectToWithValueAndMetaTag(InformationObject informationObject, String value, String metaTag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns, if it exists, the @link Connection connection@endlink from this to the given information object to this information object that has the given value.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Connection getConnectionTo(InformationObject informationObject, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns, if it exists, the @link Connection connection@endlink from the given information object to this information object that has the given value.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Connection getConnectionFrom(InformationObject informationObject, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns, if it exists, the @link Attachment attachment@endlink of this information object with the given url.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Attachment getAttachmentWithUrl(String url);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns, if it exists, the @link Attachment attachment@endlink of this information object with the given url.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Image getAttachedImageWithUrl(String url);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" phoneNumberRequired="true"
	 * @generated
	 */
	Phone addPhone(String phoneNumber);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all Persons that have at least one tag in common.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Person> getPersonsWithCommonTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all Organisations that have at least one tag in common.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Organisation> getOrganisationsWithCommonTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all Contents that have at least one tag in common.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Content> getContentsWithCommonTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	Tag unTag(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Category unCategorize(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a lowercase name without any non word characters.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSlugName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns, if it exists, the @link Connection connection@endlink from this to the given information object to this information object that has the given value.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Connection> getConnectionsToWithMetaTag(InformationObject informationObject, String metaTag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns, if it exists, the @link Connection connection@endlink from this to the given information object to this information object that has the given value.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<Connection> getConnectionsFromWithMetaTag(InformationObject informationObject, String metaTag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	StarRanking starRankWithMetaTag(Integer stars, Integer ofStars, String metaTag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" nameRequired="true"
	 * @generated
	 */
	String addAlternativeName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns, if it exists, the first @link Image image@endlink of this information object with the given MetaTag
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Image getAttachedImageWithMetaTag(MetaTag metaTag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns, if it exists, the first @link Image image@endlink of this information object with the given MetaTag
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Image getAttachedImageWithMetaTagName(String metaTagName);

	/**
	 * An EObjectCondition to check whether an Object is of the type InformationObject.
	 * 
	 * @generated
	 */
public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.InformationObjectImpl.generateIsTypeCondition();

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

} // InformationObject
