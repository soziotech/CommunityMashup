package org.sociotech.communitymashup.source.excelinformation.loader;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.POIXMLProperties;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelContent;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelMetaTag;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelOrganization;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelPerson;
import org.sociotech.communitymashup.source.excelinformation.loader.elements.ExcelConnection;
import org.sociotech.communitymashup.source.impl.SourceServiceFacadeImpl;

/**
 * Class that loads excel based information from a remote excel file
 * 
 * @author Peter Lachenmaier
 */
public class ExcelInformationLoader {

	/**
	 * Local reference to the source service, used for logging and adding.
	 */
	private SourceServiceFacadeImpl source;
	
	/**
	 * The url to load the file from
	 */
	private String fileUrl;

	/**
	 * Creates a excel information loader from the file located at the given
	 * url.
	 * 
	 * @param fileUrl
	 *            Url of the excel file to load from.
	 */
	public ExcelInformationLoader(SourceServiceFacadeImpl source, String fileUrl) {
		this.source = source;
		this.fileUrl = fileUrl;
	}

	/**
	 * Load all organizations from the remote excel file.
	 * 
	 * @return The list of loaded organizations.
	 */
	public List<ExcelOrganization> loadOrganizations() {
		return loadSheetWithNameAsList("organizations", ExcelOrganization.class);
	}

	/**
	 * Load all persons from the remote excel file.
	 * 
	 * @return The list of loaded persons.
	 */
	public List<ExcelPerson> loadPersons() {
		return loadSheetWithNameAsList("persons", ExcelPerson.class);
	}
	
	/**
	 * Load all contents from the remote excel file.
	 * 
	 * @return The list of loaded contents.
	 */
	public List<ExcelContent> loadContents() {
		return loadSheetWithNameAsList("contents", ExcelContent.class);
	}
	
	/**
	 * Load all connections from the remote excel file.
	 * 
	 * @return The list of loaded connections.
	 */
	public List<ExcelConnection> loadConnections() {
		return loadSheetWithNameAsList("connections", ExcelConnection.class);
	}
	
	/**
	 * Load all meta tags from the remote excel file.
	 * 
	 * @return The list of loaded meta tags.
	 */
	public List<ExcelMetaTag> loadMetaTags() {
		return loadSheetWithNameAsList("metatags", ExcelMetaTag.class);
	}
	
	/**
	 * Loads the sheet with the given name and returns every row as object. This
	 * mehtod assumes a header line with the names of the classes attributes.
	 * 
	 * @param clazz Class of the row objects 
	 * @param sheetName Name of the excel sheet
	 * @return A list of objects for the rows of the sheet
	 */
	private <T> List<T> loadSheetWithNameAsList(String sheetName, Class<T> clazz) {
		// Get Workbook
		Workbook workbook;
		try {
			workbook = WorkbookFactory.create(new URL(fileUrl).openStream());
			//workbook = WorkbookFactory.create(tmpFile);
		} catch (Exception e) {
			source.log("Could not load excel file " + fileUrl + " ("+e.getMessage()+")", LogService.LOG_ERROR);
			// do nothing
			return null;
		}
		
		Sheet excelSheet = workbook.getSheet(sheetName);

		if(excelSheet == null) {
			return null;
		}
		
		// get all headers for naming
		Row headers = excelSheet.getRow(excelSheet.getFirstRowNum());
		
		List<T> result = new LinkedList<T>();
		
		// iterate over all rows
		for(int i = excelSheet.getFirstRowNum() + 1; i <= excelSheet.getLastRowNum(); i++) {
			try {
				// get current row
				Row currentRow = excelSheet.getRow(i);
				
				// create a result object for every row
				T rowObject = clazz.newInstance();
				// iterate over all cells in the row
				for(int j = headers.getFirstCellNum(); j < headers.getLastCellNum(); j++) {
					// skip undefined cells
					Cell rowCell = currentRow.getCell(j);
					if(rowCell == null) continue;
					String cellValue = null;
					
					if(rowCell.getCellType() == Cell.CELL_TYPE_NUMERIC)
						cellValue = "" + (int)rowCell.getNumericCellValue();
					else if(rowCell.getCellType() == Cell.CELL_TYPE_STRING)
						cellValue = rowCell.getStringCellValue();
					
					if(cellValue == null) continue;
					
					Cell headerCell = headers.getCell(j);
					String headerName = headerCell.getStringCellValue();
					// skip undefined columns
					if(headerName == null || headerName.isEmpty()) continue;
					
					// create setter name
					String setterName = "set" + headerName.substring(0, 1).toUpperCase() + headerName.substring(1);
					try {
					   clazz.getMethod(setterName, String.class).invoke(rowObject, cellValue);
					} catch (Exception e) {
						// ignore not supported attributes
						source.log("Attribute name " + headerName.substring(0, 1).toUpperCase() + headerName.substring(1) + " is not supported", LogService.LOG_WARNING); 
					}
				}
				
				// add the row object to the result list
				result.add(rowObject);
			} catch (Exception e) {
				// continue with next row
				continue;
			}
		}
		
		// finally return the result
		return result;
	}
	
	public Long getLastModified() {
		/*
		 * does not work with Dropbox downloads ...
		try {
			URL url = new URL(fileUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			Long dateTime = connection.getLastModified();
			connection.disconnect();
			return dateTime;
		} catch (Exception e) { }
		*/
		
		Workbook workbook;
		try {
			workbook = WorkbookFactory.create(new URL(fileUrl).openStream());
			if (workbook instanceof XSSFWorkbook) {
				POIXMLProperties properties = ((XSSFWorkbook)workbook).getProperties();
				return properties.getCoreProperties().getModified().getTime();
			} else {
				source.log("getLastModified - wrong workbook instance "+workbook.getClass().toString(), LogService.LOG_WARNING);
			}
		} catch (Exception e) {
			source.log("Could not load excel file " + fileUrl + " ("+e.getMessage()+")", LogService.LOG_ERROR);
			// do nothing
			return null;
		}
		
		return null;
	}
	
}
