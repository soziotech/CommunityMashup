package org.sociotech.communitymashup.source.excelinformation.loader.elements;

import java.util.LinkedList;
import java.util.List;

public abstract class ExcelInformationObject extends ExcelEntry {
	private String id;
	private String name;
	private String location; // indoor location - for content objects
	private String zip;
	private String town;
	private String country;
	private String street;
	private String longitude;
	private String latitude;
	private String website;
	private String secondaryWebsite;
	private String mainimage;
	private String teaserimage;
	private String secondaryimage;
	private String tags;
	private String metatags;
	private String housenumber;
	private String alternativeNames;
	private String org;   // list of organizations
	private String pers;  // list of persons
	private String abstr;
	private String xmlString;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getWebsite() {
		return website;
	}
	public void setSecondaryWebsite(String secondaryWebsite) {
		this.secondaryWebsite = secondaryWebsite;
	}
	public String getSecondaryWebsite() {
		return secondaryWebsite;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getMainimage() {
		return mainimage;
	}
	public void setMainimage(String mainimage) {
		this.mainimage = mainimage;
	}
	public String getSecondaryimage() {
		return secondaryimage;
	}
	public void setSecondaryimage(String secondaryimage) {
		this.secondaryimage = secondaryimage;
	}
	public String getTeaserimage() {
		return teaserimage;
	}
	public void setTeaserimage(String teaserimage) {
		this.teaserimage = teaserimage;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getMetatags() {
		return metatags;
	}
	public void setMetatags(String metatags) {
		this.metatags = metatags;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getPers() {
		return pers;
	}
	public void setPers(String pers) {
		this.pers = pers;
	}
	public String getAbstract() {
		return abstr;
	}
	public void setAbstract(String abstr) {
		this.abstr = abstr;
	}
	public String getDescription() {
		return abstr;
	}
	public void setDescription(String abstr) {
		this.abstr = abstr;
	}
	public String getXmlString() {
		return xmlString;
	}
	public void setXmlString(String xmlString) {
		this.xmlString = xmlString;
	}
	
	// extended getters
	
	public List<String > getTagsAsList() {
		List<String> result = new LinkedList<String>();
		if(tags == null || tags.isEmpty()) {
			return result;
		}
		String[] splitted = tags.split(",");
		for(String tag : splitted) {
			result.add(tag.trim());
		}
		return result;
	}
	
	public List<String > getMetaTagsAsList() {
		List<String> result = new LinkedList<String>();
		if(metatags == null || metatags.isEmpty()) {
			return result;
		}
		String[] splitted = metatags.split(",");
		for(String tag : splitted) {
			result.add(tag.trim());
		}
		return result;
	}
	
	/**
	 * Returns whether one of the location attributes is set or not.
	 * 
	 * @return Whether one of the location attributes is set or not.
	 */
	public boolean hasLocationInfo() {
		return (country != null 	 && !country.isEmpty()) || 
				(housenumber != null && !housenumber.isEmpty()) ||
				(street != null 	 && !street.isEmpty()) ||
				(town != null		 && !town.isEmpty()) ||
				(zip != null 		 && !zip.isEmpty()) ||
		(longitude != null 		 && !longitude.isEmpty()) ||
		(latitude != null 		 && !latitude.isEmpty());
	}
	
	public String getAlternativeNames() {
		return alternativeNames;
	}
	
	public void setAlternativeNames(String alternativeNames) {
		this.alternativeNames = alternativeNames;
	}
	
	public List<String > getAlternativeNamesAsList() {
		List<String> result = new LinkedList<String>();
		if(alternativeNames == null || alternativeNames.isEmpty()) {
			return result;
		}
		String[] splitted = alternativeNames.split(",");
		for(String name : splitted) {
			result.add(name.trim());
		}
		return result;
	}
}
