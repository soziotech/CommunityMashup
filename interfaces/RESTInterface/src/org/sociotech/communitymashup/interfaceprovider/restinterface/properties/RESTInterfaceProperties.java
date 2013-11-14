package org.sociotech.communitymashup.interfaceprovider.restinterface.properties;

/**
 * Constants for configuration keys and default configuration values for all REST types.
 * 
 * @author Peter Lachenmaier
 */
public class RESTInterfaceProperties {
	/**
	 * If short references is set to true, only short references (idents) will be provided instead of the
	 * complete urls.
	 */
	public static final String SHORT_REFERENCES_PROPERTY = "shortReferences";
	public static final String SHORT_REFERENCES_DEFAULT  = "false";

	/**
	 * If set to true, formating is switched of.
	 */
	public static final String NO_FORMATTING_PROPERTY = "noFormatting";
	public static final String NO_FORMATTING_DEFAULT  = "false";

	/**
	 * If set to true, the output will be zip compressed.
	 */
	public static final String ZIP_OUTPUT_PROPERTY = "zipOutput";
	public static final String ZIP_OUTPUT_DEFAULT  = "false";

}
