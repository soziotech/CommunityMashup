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
package org.sociotech.communitymashup.source.mendeley.sdkadaption;

import java.util.HashMap;
import java.util.Map;

import com.mendeley.oapi.common.ValueEnum;
import com.mendeley.oapi.schema.Contact;
import com.mendeley.oapi.schema.SchemaEntity;
import com.mendeley.oapi.schema.User;

public class AdaptedProfile extends SchemaEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3484450630735705441L;
	
	/** The Constant ME. */
	public static final String ME = "me";
	
	/**
	 * The Enum Section.
	 */
	public enum Section implements ValueEnum {
		
		 /** The MAIN. */
		 MAIN("main"), 
		 /** The CONTACT. */
		 CONTACT("contact");
		
		
	    /** The Constant stringToEnum. */
		private static final Map<String, Section> stringToEnum = new HashMap<String, Section>();

		static { // Initialize map from constant name to enum constant
			for (Section op : values()) {
				stringToEnum.put(op.value(), op);
			}
		}
		
		/** The value. */
		private String value;

		/**
		 * Instantiates a new section.
		 * 
		 * @param value the value
		 */
		Section(String value) {
			this.value = value;
		}

		/* (non-Javadoc)
		 * @see com.mendeley.oapi.common.ValueEnum#value()
		 */
		@Override
		public String value() {
			return value;
		}

		/**
		 * From value.
		 * 
		 * @param value the value
		 * 
		 * @return the section
		 */
		public static Section fromValue(String value) {
			return stringToEnum.get(value);
		}
	}
	
	/** The main. */
	private User main;
	
	/** The contact. */
	private Contact contact;
	
	/**
	 * Gets the main.
	 * 
	 * @return the main
	 */
	public User getMain() {
		return main;
	}
	
	/**
	 * Sets the main.
	 * 
	 * @param main the new main
	 */
	public void setMain(User main) {
		this.main = main;
	}
	

	/**
	 * Gets the contact.
	 * 
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}
	
	/**
	 * Sets the contact.
	 * 
	 * @param contact the new contact
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
