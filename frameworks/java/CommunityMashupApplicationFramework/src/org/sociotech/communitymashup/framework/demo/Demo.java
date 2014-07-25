package org.sociotech.communitymashup.framework.demo;

import org.eclipse.emf.common.util.EList;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.InformationObject;
import org.sociotech.communitymashup.framework.java.MashupConnector;
import org.sociotech.communitymashup.framework.java.exceptions.MashupConnectionException;

public class Demo {

	public static void main(String[] args) {
		//String mashupUrl = "http://localhost:8080/mashup";
		String mashupUrl = "file:///Users/lachenma/Desktop/dataSet.xml";
		
		// create new mashup connector
		MashupConnector connector = new MashupConnector(mashupUrl, 600, false);
		connector.setAsynchronous(true);
		
		DataSet dataSet;
		try {
			dataSet = connector.getDataSet();
		} catch (MashupConnectionException e) {
			System.out.println("Error while creating data set from url " + mashupUrl + ".");
			return;
		}
		
		if(dataSet == null) {
			System.out.println("DataSet is null. Aborting startup.");
			return;
		}
		
		dataSet.setCacheFolder(null);
		
		// switch on caching
		dataSet.setCacheFileAttachements(true);
		dataSet.setLogLevel(LogService.LOG_DEBUG);

		// load all attachements
		connector.setPreLoadAttachedFiles(true);
				
		EList<InformationObject> allInformationObjects = dataSet.getInformationObjects();
		System.out.println("Data set has " + allInformationObjects.size() + " information objects.");
		
		
	}

}
