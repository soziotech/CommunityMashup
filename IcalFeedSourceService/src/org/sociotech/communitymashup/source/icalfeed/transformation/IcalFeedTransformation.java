/*******************************************************************************
 * Copyright (c) 2016 Michael Koch - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Koch - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.icalfeed.transformation;

import java.util.Date;
import java.util.List;

import org.sociotech.communitymashup.data.Content;
import org.sociotech.communitymashup.data.DataFactory;
import org.sociotech.communitymashup.data.Event;
import org.sociotech.communitymashup.data.Person;
import org.sociotech.communitymashup.source.icalfeed.meta.IcalFeedTags;
import org.sociotech.communitymashup.source.icalfeed.properties.IcalFeedProperties;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;
import org.osgi.service.log.LogService;
import net.fortuna.ical4j.model.Calendar;
import net.fortuna.ical4j.model.Component;
import net.fortuna.ical4j.model.ComponentList;
import net.fortuna.ical4j.model.component.CalendarComponent;
import net.fortuna.ical4j.model.component.VEvent;


/**
 * This class contains all methods to transform feed elements to CommunityMashup items.
 * 
 * @author Michael Koch
 */
public class IcalFeedTransformation {

	/**
	 * Local reference to the source service, used for logging and adding.
	 */
	private SourceServiceFacadeImpl sourceService;

	/**
	 * Factory for creating new CommunityMashup objects
	 */
	private DataFactory factory = DataFactory.eINSTANCE;

	
	/**
	 * Creates a new feed transformation using the give source service for adding items and logging.
	 * @param sourceService
	 */
	public IcalFeedTransformation(SourceServiceFacadeImpl sourceService) {
		this.sourceService = sourceService;
	}

	/**
	 * @param feed
	 */
	public void transformFeed(Calendar calendar, String contentMetaTag, boolean futureOnly)
	{
		// run through entry list
		for (CalendarComponent comp : (ComponentList<CalendarComponent>)calendar.getComponents()) {
		      if (comp instanceof VEvent) {
		        VEvent event = (VEvent) comp;
		        transformAndAddFeedEntry(event, contentMetaTag, futureOnly);        
		      }
		}
	}

	
	/**
	 * @param entry
	 * @param removeHtml
	 */
	private void transformAndAddFeedEntry(VEvent event, String contentMetaTag, boolean futureOnly) {
		
		if(event == null) {
			return;
		}
		
		if (event.getStartDate() == null) {
	       log("No start date found, ignoring. Event="+event, LogService.LOG_INFO);
	       return;            
	    }
	    Date eventStartDate = event.getStartDate().getDate();
	    if (event.getEndDate() == null) {
	       log("No end date found, using start date instead. Event="+event, LogService.LOG_INFO);
	       return;
	    }
	    Date eventEndDate = ((event.getEndDate() == null) ? null : event.getEndDate().getDate());
	    
	    if (futureOnly) {
	    	// check if event is in future
	    	Date checkDate = eventEndDate;
	    	if (checkDate == null) { checkDate = eventStartDate; }
	    	if (checkDate.getTime() < (new Date()).getTime()) {
	    		return;
	    	}
	    }
	    
	    String id = event.getUid().getValue();
	    String name = event.getSummary().getValue();
	    		
	    log("event: "+name+", "+eventStartDate+" - "+eventEndDate, LogService.LOG_INFO);
	    
	    // create new content
	 	Content content = factory.createContent();

	 	// set name
	 	content.setName(name);
	 		
	 	// add it
	 	Content tmpcont = content;
	 	content = sourceService.add(content, "ical_content_" + id);
	 	if(content == null) {
	 		sourceService.log("Could not add content", LogService.LOG_WARNING);
	 		return;
	 	}
	 	if (tmpcont == content) {
	 		sourceService.log("new content object added - "+content.getIdent(), LogService.LOG_INFO);
	 	} else {
	 		sourceService.log("content object merged - "+content.getIdent(), LogService.LOG_INFO);
	 	}
	 		
		if (eventStartDate != null) {
			// set event objects
			Event agendaItemStartEvent = factory.createEvent();
			agendaItemStartEvent.setDate(eventStartDate);
			agendaItemStartEvent = sourceService.add(agendaItemStartEvent, "ical_start_" + id);
			agendaItemStartEvent.metaTag(IcalFeedTags.EVENT_STARTDATE_METATAG);
			content.extend(agendaItemStartEvent);
		}
		if (eventEndDate != null) {
			Event agendaItemEndEvent = factory.createEvent();
			agendaItemEndEvent.setDate(eventEndDate);
			agendaItemEndEvent = sourceService.add(agendaItemEndEvent, "ical_end_" + id);
			agendaItemEndEvent.metaTag(IcalFeedTags.EVENT_ENDDATE_METATAG);
			content.extend(agendaItemEndEvent);
		}
	 	
	 	// set abstract
	 	if(event.getSummary()!=null) {
	 		content.setStringValue(event.getSummary().getValue());
	 	}
	 		
	 	// add source specific meta tags
	 	content.metaTag(contentMetaTag);
	 	content.metaTag(IcalFeedTags.ICAL_ELEMENT_METATAG);
	
	 	return;
	}


	private void log(String message, int logLevel)
	{
		sourceService.log(message, logLevel);
	}

}
