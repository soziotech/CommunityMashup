/*
 * Copyright (C) 2008 Zemanta ltd.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.zemanta.api;


import java.io.IOException;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.zemanta.api.suggest.Article;
import com.zemanta.api.suggest.Category;
import com.zemanta.api.suggest.Image;
import com.zemanta.api.suggest.Keyword;
import com.zemanta.api.suggest.Markup;
import com.zemanta.api.suggest.Markup.Link;

/**
 * Class representing suggestion request.
 * 
 * @author Matej Usaj
 */
public class Suggest extends Request {
  	
	/**
	 * Parses XML document and maps it to Zemanta object model
	 * @param root Root node of XML document
	 * @param parseArticles True to parse articles node
	 * @param parseKeywords True to parse keywords node
	 * @param parseImages True to parse images node
	 * @param parseMarkup True to parse markup node
	 * @return {@link ZemantaResult} containing suggested articles, keywords, images, markup or categories
	 */
	private static ZemantaResult parseXMLToModel(Element root, boolean parseArticles, boolean parseKeywords, boolean parseImages, boolean parseMarkup) {
		
		ZemantaResult res = new ZemantaResult();
		
		/* Parse BASIC response data */
		String status = getElementText(root, "status");
		if (status == null || !status.equals("ok")) {
			res.isError = true;
		    res.errorString = "Bad status";
		    res.status = status;
		    return res;
		}  
	    res.rid = getElementText(root, "rid");
	    res.signature = getElementText(root, "signature");
	    
	    NodeList list;
	      
	    /* Parse suggested ARTICLES */
	    if(parseArticles) { 
		    list = root.getElementsByTagName("articles");
		    if (list.getLength() == 1) {
		      Element n = (Element)list.item(0);
		      NodeList nl = n.getElementsByTagName("article");
		      for (int i = 0; i < nl.getLength(); i++) {
		    	  Element articleNode = (Element)nl.item(i);
		          res.articles.add(new Article(
		              getElementText(articleNode, "url"),
		              getElementText(articleNode, "title"),
		              getElementText(articleNode, "published_datetime"),
		              getElementText(articleNode, "confidence"),
		              getElementText(articleNode, "zemified")));
		        }
		    }
	    }

	    /* Parse suggested KEYWORDS */
	    if(parseKeywords) {
	      list = root.getElementsByTagName("keywords");
	      if (list.getLength() == 1) {
	        Element n = (Element)list.item(0);
	        NodeList nl = n.getElementsByTagName("keyword");
	        for (int i = 0; i < nl.getLength(); i++) {
	          Element articleNode = (Element)nl.item(i);
	          res.keywords.add(new Keyword(
	              getElementText(articleNode,"name"),
	              getElementText(articleNode, "confidence"),
	              getElementText(articleNode, "schema")));
	        }
	      }
	    }
	    
	    /* Parse suggested IMAGES */
	    if(parseImages) {
	      list = root.getElementsByTagName("images");
	      if (list.getLength() == 1) {
	        Element n = (Element)list.item(0);
	        NodeList nl = n.getElementsByTagName("image");
	        for (int i = 0; i < nl.getLength(); i++) {
	          Element articleNode = (Element)nl.item(i);
	          res.images.add(new Image(
	              getElementText(articleNode, "url_l"),
	              getElementText(articleNode, "url_l_w"),
	              getElementText(articleNode, "url_l_h"),
	              getElementText(articleNode, "url_m"),
	              getElementText(articleNode, "url_m_w"),
	              getElementText(articleNode, "url_m_h"),
	              getElementText(articleNode, "url_s"),
	              getElementText(articleNode, "url_s_w"),
	              getElementText(articleNode, "url_s_h"),
	              getElementText(articleNode, "source_url"),
	              getElementText(articleNode, "license"),
	              getElementText(articleNode, "description"),
	              getElementText(articleNode, "attribution"),
	              getElementText(articleNode, "confidence")));
	        }
	      }
	    }

	      
	    if(parseMarkup) {
	      /* Parse suggested MARKUP */
	      list = root.getElementsByTagName("markup");
	      if (list.getLength() == 1) {
	        Element n = (Element)list.item(0);
	        res.markup.text = getElementText(n, "text");

	        list = root.getElementsByTagName("links");
	        if (list.getLength() == 1) {
	          Element link = (Element)list.item(0);

	          NodeList nl = link.getElementsByTagName("link");
	          for (int i = 0; i < nl.getLength(); i++) {
	            Element linkNode = (Element)nl.item(i);
	            Link l = new Markup.Link(
	                getElementText(linkNode, "anchor"),
	                getElementText(linkNode, "confidence"),
	                getElementText(linkNode, "relevance"));
	            res.markup.links.add(l);
	            
	            String entityT = getElementText(linkNode, "entity_type");
	            if(entityT != null)
	            	l.entityType = entityT;
	            
	            NodeList targetList = linkNode.getElementsByTagName("target");
	            for (int j = 0; j < targetList.getLength(); j++) {
	              Element targetNode = (Element)targetList.item(j);
	              l.targets.add(new Markup.Target(
	                  getElementText(targetNode, "url"),
	                  getElementText(targetNode, "type"),
	                  getElementText(targetNode, "title")));
	            }	            
	          }
	        }
	      }
	    }
	    
	    
	    /* Parse CATEGORIES */    	
	    list = root.getElementsByTagName("categories");
	      if (list.getLength() == 1) {
	        Element catlist = (Element)list.item(0);
	        
	        NodeList nl = catlist.getElementsByTagName("category");
	        
	        for(int m = 0; m < nl.getLength(); m++) {
	        	Element n = (Element)nl.item(m);
	        	Category c = new Category(
		        		getElementText(n, "name"),
		        		getElementText(n, "confidence"),
		        		getElementText(n, "categorization"));
	        	
	        res.categories.add(c);
	      }
	   }
	         
	      
	    return res;
	      
	}
	
	
	
  /**
   * Makes the markup request and builds the result
   * 
   * @param inst Zemanta class instance containing all data to make the
   *    preferences request.
   * @param text Text to be processed.
   * @param useFreebase Return freebase GUIDs for links.
   * @return The results. Never <code>null</code>.
   * @deprecated useFreebase is not supported anymore. Use other getResultsMarkup method
   */

  protected static ZemantaResult getResultsMarkup(
      Zemanta inst, 
      String text, 
  	@Deprecated
      boolean useFreebase) {
	  
    ZemantaResult res = new ZemantaResult();
    
    try {
      /* Make the request */

      Document doc = request(
          RequestType.MARKUP, 
          inst.getGateway(),
          inst.getApiKey(), 
          text,
          useFreebase);
      Element root = doc.getDocumentElement();
      
      res = parseXMLToModel(root, false, false, false, true);
      
      /* Catch all exceptions and specify the cause in the result */
    } catch (IOException e) {
      res.isError = true;
      res.errorString = "Input/Output error";
    } catch (SAXException e) {
      res.isError = true;
      res.errorString = "Malformed xml returned";
    } catch (ParserConfigurationException e) {
      res.isError = true;
      res.errorString = "Malformed xml returned";
    }
    
    return res;
  }
 
  
  /**
   * Makes the request and builds the result
   * 
   * @param inst Zemanta class instance containing all data to make the
   *    preferences request.
   * @param text Text to be processed.
   * @param useFreebase Return freebase GUIDs for links.
   * @return The results. Never <code>null</code>.
   * @deprecated useFreebase parameter is not supported anymore. Use other getResults methods
   */
  
  protected static ZemantaResult getResults(
      Zemanta inst, 
      String text, 
    @Deprecated
      boolean useFreebase) {
    ZemantaResult res = new ZemantaResult();
    
    try {
      /* Make the request */
      Document doc = request(
          RequestType.SUGGEST, 
          inst.getGateway(), 
          inst.getApiKey(), 
          text,
          useFreebase);
      
      Element root = doc.getDocumentElement();
      
      res = parseXMLToModel(root, true, true, true, true);
      
    /* Catch all exceptions and specify the cause in the result */
    } catch (IOException e) {
      res.isError = true;
      res.errorString = "Input/Output error";
    } catch (SAXException e) {
      res.isError = true;
      res.errorString = "Malformed xml returned";
    } catch (ParserConfigurationException e) {
      res.isError = true;
      res.errorString = "Malformed xml returned";
    }
    
    return res;
  }


  
  
  /* NEW SIMPLIFIED VERSION*/

  /**
   * Makes the request and builds the result
   * @param u Url to Zemanta api service
   * @param parameters List of web query parameters
   * @return String representation of result ready to be parsed.
   * @throws IOException 
   * @throws IllegalArgumentException 
   */
  protected static String getResults(String u, Map<String, String> parameters) throws IllegalArgumentException, IOException  {
	   
	  return requestString(u, parameters);

  }

  
  
  
/**
 * Makes the request (either suggest or markup) and builds the result. 
 * Default method is suggest and format xml.
 *  
 * @param inst Instance of Zemanta object
 * @param parameters List of query parameters
 * @return {@link ZemantaResult} object, containing all suggestions found.
 */
  protected static ZemantaResult getResults(Zemanta inst, Map<String, String> parameters) {
	  
	  ZemantaResult res = new ZemantaResult();
	  	  
	  try {
		
		  //check for required parameters
		  parameters.put("api_key", inst.getApiKey());
		  
		  //change format to XML, because only xml is parsed into model
		  parameters.put("format", "xml");

		  Document doc =  request(inst.getGateway(), parameters); 	  
		  
		  
		  Element root = doc.getDocumentElement();
		  
		  //parsing flags
		  boolean parseArticles, parseKeywords, parseImages, parseMarkup;
		  
		  //default values for SUGGEST
		  parseArticles = true;
		  parseKeywords = true;
		  parseImages = true;
		  parseMarkup = true;
		  
		  //settings for MARKUP
		  if(((String)parameters.get("method")).equals("zemanta.suggest_markup"))
		  {
			  parseArticles = false;
			  parseKeywords = false;
			  parseImages = false;
		  }
		  
		  //parse result to ZemantaResult
		  res = parseXMLToModel(root, parseArticles, parseKeywords, parseImages, parseMarkup);
		  
		  return res;
		  
		  
	  } catch (IOException e) {
		    res.isError = true;
		    res.errorString = "Input/Output error";
		    e.printStackTrace();
		  } catch (SAXException e) {
		    res.isError = true;
		    res.errorString = "Malformed xml returned";
		  } catch (ParserConfigurationException e) {
		    res.isError = true;
		    res.errorString = "Malformed xml returned";
		  } catch (Exception e) {
				e.printStackTrace();
	}
	  
	  return res;
  }
}
