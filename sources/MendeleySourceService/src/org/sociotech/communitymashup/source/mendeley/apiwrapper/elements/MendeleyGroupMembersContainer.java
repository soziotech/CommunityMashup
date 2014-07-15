/*******************************************************************************
 * Copyright (c) 2014 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.mendeley.apiwrapper.elements;

import java.util.List;

/**
 * The container for mendeley group members divided by role.
 * 
 * @author Peter Lachenmaier
 */
public class MendeleyGroupMembersContainer extends MendeleyEntity {
	
	/**
	 * Generate serial version uid
	 */
	private static final long serialVersionUID = -4338733214606407596L;
	
	private List<MendeleyGroupMember> admins;
	private List<MendeleyGroupMember> members;
	private MendeleyGroupMember owner;
	
	public List<MendeleyGroupMember> getAdmins() {
		return admins;
	}
	public void setAdmins(List<MendeleyGroupMember> admins) {
		this.admins = admins;
	}
	public List<MendeleyGroupMember> getMembers() {
		return members;
	}
	public void setMembers(List<MendeleyGroupMember> members) {
		this.members = members;
	}
	public MendeleyGroupMember getOwner() {
		return owner;
	}
	public void setOwner(MendeleyGroupMember owner) {
		this.owner = owner;
	}
}
