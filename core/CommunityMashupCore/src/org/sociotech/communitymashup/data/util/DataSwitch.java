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
package org.sociotech.communitymashup.data.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.sociotech.communitymashup.data.*;
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


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.sociotech.communitymashup.data.DataPackage
 * @generated
 */
public class DataSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSwitch() {
		if (modelPackage == null) {
			modelPackage = DataPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DataPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseInformationObject(person);
				if (result == null) result = caseItem(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.INFORMATION_OBJECT: {
				InformationObject informationObject = (InformationObject)theEObject;
				T result = caseInformationObject(informationObject);
				if (result == null) result = caseItem(informationObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CONTENT: {
				Content content = (Content)theEObject;
				T result = caseContent(content);
				if (result == null) result = caseInformationObject(content);
				if (result == null) result = caseItem(content);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DATA_SET: {
				DataSet dataSet = (DataSet)theEObject;
				T result = caseDataSet(dataSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = caseItem(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CLASSIFICATION: {
				Classification classification = (Classification)theEObject;
				T result = caseClassification(classification);
				if (result == null) result = caseItem(classification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseClassification(category);
				if (result == null) result = caseItem(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseClassification(tag);
				if (result == null) result = caseItem(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.ORGANISATION: {
				Organisation organisation = (Organisation)theEObject;
				T result = caseOrganisation(organisation);
				if (result == null) result = caseInformationObject(organisation);
				if (result == null) result = caseItem(organisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.META_TAG: {
				MetaTag metaTag = (MetaTag)theEObject;
				T result = caseMetaTag(metaTag);
				if (result == null) result = caseItem(metaTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.PHONE: {
				Phone phone = (Phone)theEObject;
				T result = casePhone(phone);
				if (result == null) result = caseMetaInformation(phone);
				if (result == null) result = caseExtension(phone);
				if (result == null) result = caseItem(phone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.INSTANT_MESSENGER: {
				InstantMessenger instantMessenger = (InstantMessenger)theEObject;
				T result = caseInstantMessenger(instantMessenger);
				if (result == null) result = caseMetaInformation(instantMessenger);
				if (result == null) result = caseExtension(instantMessenger);
				if (result == null) result = caseItem(instantMessenger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.EMAIL: {
				Email email = (Email)theEObject;
				T result = caseEmail(email);
				if (result == null) result = caseMetaInformation(email);
				if (result == null) result = caseExtension(email);
				if (result == null) result = caseItem(email);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.WEB_ACCOUNT: {
				WebAccount webAccount = (WebAccount)theEObject;
				T result = caseWebAccount(webAccount);
				if (result == null) result = caseMetaInformation(webAccount);
				if (result == null) result = caseExtension(webAccount);
				if (result == null) result = caseItem(webAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.WEB_SITE: {
				WebSite webSite = (WebSite)theEObject;
				T result = caseWebSite(webSite);
				if (result == null) result = caseMetaInformation(webSite);
				if (result == null) result = caseExtension(webSite);
				if (result == null) result = caseItem(webSite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.RANKING: {
				Ranking ranking = (Ranking)theEObject;
				T result = caseRanking(ranking);
				if (result == null) result = caseExtension(ranking);
				if (result == null) result = caseItem(ranking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.ATTACHMENT: {
				Attachment attachment = (Attachment)theEObject;
				T result = caseAttachment(attachment);
				if (result == null) result = caseExtension(attachment);
				if (result == null) result = caseItem(attachment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseMetaInformation(location);
				if (result == null) result = caseExtension(location);
				if (result == null) result = caseItem(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseAttachment(image);
				if (result == null) result = caseExtension(image);
				if (result == null) result = caseItem(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseAttachment(document);
				if (result == null) result = caseExtension(document);
				if (result == null) result = caseItem(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.STAR_RANKING: {
				StarRanking starRanking = (StarRanking)theEObject;
				T result = caseStarRanking(starRanking);
				if (result == null) result = caseRanking(starRanking);
				if (result == null) result = caseExtension(starRanking);
				if (result == null) result = caseItem(starRanking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.VIEW_RANKING: {
				ViewRanking viewRanking = (ViewRanking)theEObject;
				T result = caseViewRanking(viewRanking);
				if (result == null) result = caseRanking(viewRanking);
				if (result == null) result = caseExtension(viewRanking);
				if (result == null) result = caseItem(viewRanking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.THUMB_RANKING: {
				ThumbRanking thumbRanking = (ThumbRanking)theEObject;
				T result = caseThumbRanking(thumbRanking);
				if (result == null) result = caseRanking(thumbRanking);
				if (result == null) result = caseExtension(thumbRanking);
				if (result == null) result = caseItem(thumbRanking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = caseAttachment(transformation);
				if (result == null) result = caseExtension(transformation);
				if (result == null) result = caseItem(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.VIDEO: {
				Video video = (Video)theEObject;
				T result = caseVideo(video);
				if (result == null) result = caseAttachment(video);
				if (result == null) result = caseExtension(video);
				if (result == null) result = caseItem(video);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseExtension(connection);
				if (result == null) result = caseItem(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseAttachment(binary);
				if (result == null) result = caseExtension(binary);
				if (result == null) result = caseItem(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.META_INFORMATION: {
				MetaInformation metaInformation = (MetaInformation)theEObject;
				T result = caseMetaInformation(metaInformation);
				if (result == null) result = caseExtension(metaInformation);
				if (result == null) result = caseItem(metaInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.INDOOR_LOCATION: {
				IndoorLocation indoorLocation = (IndoorLocation)theEObject;
				T result = caseIndoorLocation(indoorLocation);
				if (result == null) result = caseMetaInformation(indoorLocation);
				if (result == null) result = caseExtension(indoorLocation);
				if (result == null) result = caseItem(indoorLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = caseItem(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseMetaInformation(event);
				if (result == null) result = caseExtension(event);
				if (result == null) result = caseItem(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataPackage.DELETED_ITEM: {
				DeletedItem deletedItem = (DeletedItem)theEObject;
				T result = caseDeletedItem(deletedItem);
				if (result == null) result = caseItem(deletedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationObject(InformationObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContent(Content object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSet(DataSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassification(Classification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganisation(Organisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaTag(MetaTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhone(Phone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instant Messenger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instant Messenger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantMessenger(InstantMessenger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmail(Email object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebAccount(WebAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebSite(WebSite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ranking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ranking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRanking(Ranking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attachment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachment(Attachment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Star Ranking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Star Ranking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStarRanking(StarRanking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Ranking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Ranking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewRanking(ViewRanking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thumb Ranking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thumb Ranking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThumbRanking(ThumbRanking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideo(Video object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinary(Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaInformation(MetaInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indoor Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indoor Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndoorLocation(IndoorLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deleted Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deleted Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletedItem(DeletedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DataSwitch
