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

import org.eclipse.emf.query.conditions.eobjects.EObjectCondition;
import org.sociotech.communitymashup.rest.ArgNotFoundException;
import org.sociotech.communitymashup.rest.RequestType;
import org.sociotech.communitymashup.rest.RestCommand;
import org.sociotech.communitymashup.rest.UnknownOperationException;
import org.sociotech.communitymashup.rest.WrongArgCountException;
import org.sociotech.communitymashup.rest.WrongArgException;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Ranking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A @link ViewRanking View Ranking@endlink is used for counting the amount of views for a given @link InformationObject Information Object@endlink, also known as page ranking. The total amount is given by the sum of @link ViewRanking View Rankings@endlink for an @link InformationObject Information Object@endlink.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.sociotech.communitymashup.data.ViewRanking#getRankedInformationObject <em>Ranked Information Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.sociotech.communitymashup.data.DataPackage#getViewRanking()
 * @model
 * @generated
 */
public interface ViewRanking extends Ranking {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n \tPeter Lachenmaier - Design and initial implementation";

	/**
	 * Returns the value of the '<em><b>Ranked Information Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sociotech.communitymashup.data.InformationObject#getViewRankings <em>View Rankings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ranked Information Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranked Information Object</em>' reference.
	 * @see #setRankedInformationObject(InformationObject)
	 * @see org.sociotech.communitymashup.data.DataPackage#getViewRanking_RankedInformationObject()
	 * @see org.sociotech.communitymashup.data.InformationObject#getViewRankings
	 * @model opposite="viewRankings"
	 * @generated
	 */
	InformationObject getRankedInformationObject();

	/**
	 * Sets the value of the '{@link org.sociotech.communitymashup.data.ViewRanking#getRankedInformationObject <em>Ranked Information Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranked Information Object</em>' reference.
	 * @see #getRankedInformationObject()
	 * @generated
	 */
	void setRankedInformationObject(InformationObject value);

	/**
	 * An EObjectCondition to check whether an Object is of the type ViewRanking.
	 * 
	 * @generated
	 */
public EObjectCondition isTypeCondition = org.sociotech.communitymashup.data.impl.ViewRankingImpl.generateIsTypeCondition();

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
} // ViewRanking
