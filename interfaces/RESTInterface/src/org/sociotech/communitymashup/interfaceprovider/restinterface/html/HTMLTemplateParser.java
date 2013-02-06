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
import org.sociotech.communitymashup.data.DataSet;
import org.sociotech.communitymashup.data.Item;

import freemarker.core.Environment;
import freemarker.ext.beans.BeansWrapper;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

/**
 * @author Christopher Rohde
 *
 */
public class HTMLTemplateParser {
	
	private String tplPath = "";
	private String stylePath = "";
	private Boolean useCustomTemplates = false;
	private Configuration cfg = new Configuration();
	private String customTemplateDirectory = "";
	private String templateDirectory = "";
	private Boolean wrap = true;
	
	public HTMLTemplateParser() {}
	
	public HTMLTemplateParser(String tplPath) {
		this.tplPath = tplPath;
		try {
			cfg.setDirectoryForTemplateLoading(new File(tplPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// we want to make all properties and methods of dataItems available to
		// the template, so we use a freemarker BeansWrapper and set the
		// exposure level to all
		BeansWrapper beansWrapper = new BeansWrapper();
//				beansWrapper.setExposureLevel(BeansWrapper.EXPOSE_ALL);
//				beansWrapper.setSimpleMapWrapper(true); 

		// tell the configuration that it should use the BeansWrapper instead of
		// the DefaultObjectWrapper
		cfg.setObjectWrapper(beansWrapper);

		// by default the parsing will fail and not generate valid HTML output
		// if a exception within a marker occurs. With this own exception
		// handler, we tell freemarker to instead write an empty strin in the
		// output, the exception to the console and finish its generation.
		class MyTemplateExceptionHandler implements TemplateExceptionHandler {
			public void handleTemplateException(TemplateException te,
					Environment env, java.io.Writer out)
					throws TemplateException {
				try {
					/*logger.warning("Invalid marker in "
							+ env.getTemplate().getName() + ": "
							+ te.getMessage());*/
					out.write("");
				} catch (IOException e) {
					throw new TemplateException(
							"Failed to print error message. Cause: " + e, env);
				}
			}
		}
		cfg.setTemplateExceptionHandler(new MyTemplateExceptionHandler());
		//cfg.setObjectWrapper(new DefaultObjectWrapper());
	}
	
	public String generate(Object obj, String baseurl) {
		String tplname = "";
		
		/* Create a data-model */
        Map<String, Object> root = new HashMap<String, Object>();
        root.put("stylepath", stylePath);
        root.put("baseurl", baseurl);
        
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
		if(obj instanceof EList) {
			List<EObject> items = new ArrayList<EObject>();
			root.put("items",items);
			EList<? extends EObject> elist = (EList<? extends EObject>) obj;
			
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
			else
				return "Keine Objekte.";
		}
		else if(obj instanceof EObject) {
			root.put("item", ((EObject) obj));
			tplname = "tpl_" + ((EObject)obj).eClass().getName() + ".html";
		}
		else {
			return "Unsupported Type";
		}
		
		root.put("templateName", tplname);
		if(wrap) {
			tplname = "tpl_Wrapper.html";
		}
		else {
			wrap = true;
		}
		
		Template temp = null;
		String customTemplate = customTemplateDirectory;
		System.out.println("### " + customTemplate);
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
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
		
		
		root.put("customTemplate", customTemplate);

        /* Merge data-model with template */
        Writer out = new StringWriter();
        try {
			temp.process(root, out);
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return out.toString();
	}

	public void setTplPath(String tplPath) {
		this.tplPath = tplPath;
		try {
			cfg.setDirectoryForTemplateLoading(new File(tplPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cfg.setObjectWrapper(new DefaultObjectWrapper());
	}

	public void setStylePath(String stylePath) {
		this.stylePath = stylePath;
	}

	public Boolean getUseCustomTemplates() {
		return useCustomTemplates;
	}

	public void setUseCustomTemplates(Boolean useCustomTemplates) {
		this.useCustomTemplates = useCustomTemplates;
	}

	public void setCustomTemplate(String string) {
		customTemplateDirectory = string;
	}

	public void setWrapping(Boolean wrapBoolean) {
		wrap = wrapBoolean;
	}
}
