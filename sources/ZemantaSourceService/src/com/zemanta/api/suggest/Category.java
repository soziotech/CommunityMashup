package com.zemanta.api.suggest;

/**
 * Class representing suggested categories
 * 
 * @author Mateja Verlic
 * @since November 2011
 */
public class Category extends Item {
	
	/** Category name */
	public String name; 
	
	/** Confidence on 0.0 to 1.0 scale */
	public float confidence; 
	
	/** Categorization scheme (default scheme is dmoz)*/
	public String categorization; 
	
	/**
	 * Default constructor for category
	 * @param name Name of the category
	 * @param confidence Confidence of the category
	 * @param categorization Categorization scheme of the category
	 */
	public Category(String name, String confidence, String categorization) {
		this.name = name;
		this.confidence = Float.parseFloat(confidence);
		this.categorization = categorization;
	}
	
	@Override
	  public String toString() {
	    return new StringBuilder()
	        .append("Category:\n")
	        .append("  name=").append(name).append("\n")
	        .append("  confidence=").append(confidence).append("\n")
	        .append("  categorization=").append(categorization).toString();
	  }

}
