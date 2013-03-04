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
package org.sociotech.communitymashup.rest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.sociotech.communitymashup.data.Item;


/**
 * A Class providing static methods to support the development of java applications using the REST-Interface.
 * 
 * @author Jan Philipp Fiedler (Jan.Fiedler@unibw.de)
 *
 */
public class RestUtil {


	/**
	 * Reads a serialized Object from a String.
	 * 
	 * The Object must have been serialized using the Java Serialization 
	 * and it must have been encoded using Base64.
	 * 
	 * @param s The String to be read from.
	 * @return The Object or null if the reading failed.
	 * @throws ClassNotFoundException 
	 */
	public static Object fromInput( String s ) throws ClassNotFoundException {
		try {
			// convert it from Base64url to Base64 if required
			s = s.replace('-', '+')
				 .replace('_', '/');	 
			while(s.length() % 4 != 0) {
				s += "=";
			}
			byte [] data = Base64Coder.decode(s);
			ObjectInputStream is = new ObjectInputStream(new ByteArrayInputStream(data));
			Object o  = is.readObject();
			is.close();
			return o;
		} catch (Exception e) {
			// I want it to be silent.
		}
		return null;
	}

	public static Object fromInput(Object input) throws ClassNotFoundException
	{
		if(input instanceof String)
		{
			return fromInput((String) input);
		}
		
		return input;
	}
	
	
	/**
	 * Deserializes an Date from a ISO 8601 String 
	 * 
	 * The Date must be in ISO 8601 format 
	 * 
	 * @param dateString The date as string.
	 * @return The Date object or null if the parsing failed.
	 */
	public static Date fromDateString( String dateString ) {
		
		if(dateString == null)
		{
			return null;
		}
		
		// ISO 8601 date format
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		
		dateString = dateString.replace(' ', '+');
				
		//try {
			ParsePosition pp = new ParsePosition(0);
			sdf.setLenient(true);
			Date d = sdf.parse(dateString, pp);
			return d;
		//} catch (ParseException e) {
			// no output
		//}
		
		// error case
		//return null;
		
		
	}
	
	/**
	 * Deserializes an Integer from a given string. 
	 * 
	 * @param integerString The Integer as string.
	 * @return The Integer object or null if the parsing failed.
	 */
	public static Integer fromIntegerString( String integerString ) {
		
		if(integerString == null)
		{
			return null;
		}
				
		try {
			Integer i = new Integer(integerString);
			return i;
		} catch (Exception e) {
			// no output
		}
		
		// error case
		return null;
		
		
	}
	
	/**
	 * Deserializes an Float from a given string. 
	 * 
	 * @param floatString The Float as string.
	 * @return The Float object or null if the parsing failed.
	 */
	public static Float fromFloatString( String floatString ) {
		
		if(floatString == null)
		{
			return null;
		}
				
		try {
			Float f = new Float(floatString);
			return f;
		} catch (Exception e) {
			// no output
		}
		
		// error case
		return null;
		
		
	}
	
	/**
	 * Deserializes an Double from a given string. 
	 * 
	 * @param doubleString The Integer as string.
	 * @return The Double object or null if the parsing failed.
	 */
	public static Double fromDoubleString( String doubleString ) {
		
		if(doubleString == null)
		{
			return null;
		}
				
		try {
			Double d = new Double(doubleString);
			return d;
		} catch (Exception e) {
			// no output
		}
		
		// error case
		return null;
		
		
	}
	/**
	 * Writes an Object to a String using the Java Serialization.
	 * 
	 * The Object has to implement Serializable.
	 * 
	 * @param o The Object to be serialized.
	 * @return A Base64url encoded String representation of the Object or null if the writing failed.
	 */
	public static String toString( Serializable o ) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream( baos );
			oos.writeObject( o );
			oos.close();
			// Base64 encode
			String s = new String(Base64Coder.encode(baos.toByteArray()));
			// convert to Base64url
			s = s.replace('+', '-')
				 .replace('/', '_')
				 .replaceAll("=", "");
			//return result
			return s;
		} catch (IOException e) {
			// I want it to be silent.
		}
		return null;
	}
	
	/**
	 * A utility class to let the RESTInterface process list commands.
	 * 
	 * @param list The List to be processed.
	 * @param input The RestCommands to be processed.
	 * @param requestType The HTTP-Request method.
	 * @return Either the resulting Object or null.
	 * @throws WrongArgException 
	 * @throws WrongArgCountException 
	 * @throws UnknownOperationException 
	 * @throws ArgNotFoundException 
	 */
	public static Object listProcess(List<?> list, LinkedList<RestCommand> input, RequestType requestType) throws WrongArgException, ArgNotFoundException, UnknownOperationException, WrongArgCountException {
		RestCommand rc = input.poll();
		Object o = null;
		if (rc.getCommand().equalsIgnoreCase("get")) {
			try {
				Integer index;
				try {
					index = Integer.parseInt((String) rc.getArg("index"));
				} catch (NumberFormatException e){
					index = (Integer) fromInput((String) rc.getArg("index")); 
				}		
				o = list.get(index);
			} catch (IndexOutOfBoundsException e) {
				return null;
			} catch (Exception e) {
				throw new WrongArgException("listProcess", "Integer");
			}
		}
		
		if (o != null && !input.isEmpty()) {
			
			// TODO add support for application model if needed
			
			if (o instanceof Item) {
				return ((Item) o).process(input, requestType);
			}
			return o;
		}
		
		if(rc.getCommand().equalsIgnoreCase("clear")) {
				list.clear();
				return null;	
		}
		else if(rc.getCommand().equalsIgnoreCase("size")) {
			// return size of list
			return list.size();
		}
		
		// TODO add list operations here (like put ....)
		
		return o;
	}
}
