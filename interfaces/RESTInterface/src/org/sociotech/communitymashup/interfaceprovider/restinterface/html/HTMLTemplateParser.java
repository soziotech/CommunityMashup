/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christopher Rohde - Design and initial implementation
 *     Peter Lachenmaier
 ******************************************************************************/
/**
 * 
 */
package org.sociotech.communitymashup.interfaceprovider.restinterface.html;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.log.LogService;
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Item;
import org.sociotech.communitymashup.interfaceprovider.restinterface.RESTInterfaceService;
import org.sociotech.communitymashup.interfaceprovider.restinterface.properties.HTMLProperties;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * A Template Parser for generating html-output for objects of the CommunityMashup.
 * 
 * @author Christopher Rohde
 *
 */
public class HTMLTemplateParser {
	
	/**
	 * Custom style path
	 */
	private String stylePath = "";
	
	/**
	 * Set to true if the usage of custom templates is allowed
	 */
	private Boolean useCustomTemplates = false;
	
	/**
	 * Configuration for the Freemarker-Parser
	 */
	private Configuration cfg = new Configuration();
	
	/**
	 * Standard directory for a custom template
	 */
	private String customTemplateDirectory = "";
	
	/**
	 * Root template directory
	 */
	private String templateDirectory = "";	
	
	/**
	 * Set to true to activate wrapping per default
	 */
	private Boolean defaultWrap = true;
	
	/**
	 * Rest interface service used for logging 
	 */
	private RESTInterfaceService logger;
	
	private Boolean wrap = null;
	
	
	/**
	 * Instantiates a new html template parser
	 *  
	 * @param restInterfaceService The RestInterfaceService-Instance needed for logging
	 */
	public HTMLTemplateParser(RESTInterfaceService restInterfaceService) {
		this.logger = restInterfaceService;
	}
	
	/**
	 * Generates the html output for an object
	 * 
	 * @param obj The target object
	 * @param baseurl The baseurl of the request
	 * @return The html output
	 */
	@SuppressWarnings("unchecked")
	public String generate(Object obj, String baseurl) {
		String tplname = "";
		
		// Create a data-model for the freemarker-template
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("stylepath", stylePath);
        root.put("baseurl", baseurl);
        root.put("resourcepath", HTMLProperties.HTML_RESOURCE_PATH);
        
        // dataset
        if(obj instanceof DataSet) {
        	root.put("dataset",obj);
        	EList<Item> elist = ((DataSet)obj).getItems();
        	EList<String> subclasses = new BasicEList<String>();
        	Iterator<? extends EObject> it = elist.iterator();
			while(it.hasNext()) {
				EObject e = it.next();
				if(!subclasses.contains(e.eClass().getName()))
					subclasses.add(e.eClass().getName());
			}
			root.put("classes", subclasses);
        	
        }
        
        // elist
		if(obj instanceof EList) {
			List<EObject> items = new ArrayList<EObject>();
			// put items into freemarker-object
			root.put("items",items);
			EList<? extends EObject> elist = (EList<? extends EObject>) obj;
			
			
			// collect classes within the items
			EClass ctype = null;
			Boolean multi = false;
			EList<EClass> classes = new BasicEList<EClass>();
			EList<String> subclasses = new BasicEList<String>();
			Iterator<? extends EObject> it = elist.iterator();
			while(it.hasNext()) {
				EObject e = it.next();
				items.add(e);
				if(!subclasses.contains(e.eClass().getName()))
					subclasses.add(e.eClass().getName());
				
				if(ctype == null) {
					ctype = e.eClass();
					classes.addAll(ctype.getEAllSuperTypes());
				}	
				if(!(ctype.equals(e.eClass())))
					multi = true;
				classes.retainAll(e.eClass().getEAllSuperTypes());
			}
			
			// select the correct template file (typ related)
			if(elist.size() == 1) {
				tplname = "tpl_" + ctype.getName() + ".html";
				root.put("item", elist.get(0));
			}
			else if(multi.equals(true)) {
				tplname = "tpl_" + classes.get(classes.size()-1).getName() + "_list.html";
				root.put("classes", subclasses);
			}
			else if(ctype != null)
				tplname = "tpl_" + ctype.getName() + "_list.html";
			else {
				return HTMLProperties.STRING_NO_OBJECTS;
			}
		} // normal object
		else if(obj instanceof EObject) {
			root.put("item", ((EObject) obj));
			tplname = "tpl_" + ((EObject)obj).eClass().getName() + ".html";
		}
		else {
			logger.log("[HTMLTemplateParser]: Unsupported type, can not serialize to html", LogService.LOG_WARNING);
			return HTMLProperties.STRING_UNSUPPORTED;
		}
		
		root.put("templateName", tplname);
		if(wrap != null) {
			if(wrap) {
				tplname = "tpl_Wrapper.html";
			}
		}
		else if(defaultWrap) {
			tplname = "tpl_Wrapper.html";	
		}
		wrap = null;
		
		Template temp = null;
		String customTemplate = customTemplateDirectory;

		try {
			if(useCustomTemplates) {
				temp = cfg.getTemplate("./custom/" + customTemplateDirectory + "/" + tplname);
			}				
			else {
				temp = cfg.getTemplate(templateDirectory + tplname);
			}
				
		} catch (IOException e1) {
			try {
				temp = cfg.getTemplate(templateDirectory + tplname);
			} catch (IOException e2) {
				logger.log("[HTMLTemplateParser]: Template directory may be wrong - check the configuration", LogService.LOG_ERROR);
			}
		}
		
		
		root.put("customTemplate", customTemplate);

        // Merge data-model with template
        Writer out = new StringWriter();
        try {
			temp.process(root, out);
		} catch (TemplateException e) {
			logger.log("[HTMLTemplateParser]: TemplateException ("+e.getMessage()+")", LogService.LOG_ERROR);
		} catch (IOException e) {
			logger.log("[HTMLTemplateParser]: IOException ("+e.getMessage()+")", LogService.LOG_ERROR);
		}
        
        return out.toString();
	}

	/**
	 * Sets a new template-path
	 * 
	 * @param tplPath The new template-path
	 */
	public void setTplPath(String tplPath) {
		try {
			cfg.setDirectoryForTemplateLoading(new File(tplPath));
		} catch (IOException e) {
			logger.log("[HTMLTemplateParser]: IOException ("+e.getMessage()+")", LogService.LOG_ERROR);
		}
		cfg.setObjectWrapper(new DefaultObjectWrapper());
	}

	/**
	 * Sets a new style-path
	 * 
	 * @param stylePath The new style-path
	 */
	public void setStylePath(String stylePath) {
		this.stylePath = stylePath;
	}

	/**
	 * Getter for the activation status of custom template usage
	 * 
	 * @return True if custom templates are activated
	 */
	public Boolean getUseCustomTemplates() {
		return useCustomTemplates;
	}

	/**
	 * Sets the usage of custom templates to a new status (true | false)
	 * 
	 * @param useCustomTemplates The new status
	 */
	public void setUseCustomTemplates(Boolean useCustomTemplates) {
		this.useCustomTemplates = useCustomTemplates;
	}

	/**
	 * Sets a new custom template
	 * 
	 * @param string The new custom template name
	 */
	public void setCustomTemplate(String string) {
		customTemplateDirectory = string;
	}

	/**
	 * Enables (true) or disables (false) wrapping for templates
	 * 
	 * @param wrapBoolean The new status for wrapping
	 */
	public void setWrapping(Boolean wrapBoolean) {
		wrap = wrapBoolean;
	}

	/**
	 * Enables (true) or disables (false) default wrapping for templates
	 * 
	 * @param defaultWrap The new status for default wrapping
	 */
	public void setDefaultWrap(Boolean defaultWrap) {
		this.defaultWrap = defaultWrap;		
	}
}
