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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.zemanta.api.suggest.Article;
import com.zemanta.api.suggest.Image;
import com.zemanta.api.suggest.Keyword;
import com.zemanta.api.suggest.Markup;
import com.zemanta.api.suggest.Markup.Link;
import com.zemanta.api.suggest.Category;

/**
 * Class representing results from suggestion engine.
 * 
 * @author Matej Usaj
 */
public class ZemantaResult {
	

  /** An error occurred while fetching results */
  public boolean isError;
  
  /** String representation of the error */
  public String errorString;
  
  /** The status of request */
  public String status;
  
  /** Unique request id that can be used with calls that require it */
  public String rid;
  
  /** Signature to use (HTML blob) */
  public String signature;
  
  /** A list of articles. Never <code>null</code> */
  public ArrayList<Article> articles;
  
  /** A list of images. Never <code>null</code> */
  public ArrayList<Image> images;

  /** A list of keywords. Never <code>null</code> */
  public ArrayList<Keyword> keywords;
  
  /** Suggested markup. Never <code>null</code> */
  public Markup markup;
  
  /** Suggested categories. */
  public ArrayList<Category> categories;
  
  /**
   * Default constructor. Initializes all required data structures.
   */
  public ZemantaResult() {
    articles = new ArrayList<Article>();
    images = new ArrayList<Image>();
    keywords = new ArrayList<Keyword>();
    markup = new Markup();
    categories = new ArrayList<Category>();

  }
  

  /**
   * Gets a copy of suggested articles, sorted by confidence.
   * 
   * @param asc Sorts confidence in ascending order.
   * @return Sorted copy of the list
   */
  public ArrayList<Article> getConfidenceSortedArticles(final boolean asc) {
    ArrayList<Article> res = new ArrayList<Article>(articles);
    Collections.sort(res, new Comparator<Article>() {
      @Override
      public int compare(Article o1, Article o2) {
        return asc ? o2.compareTo(o1) : o1.compareTo(o2);
      }
    });
    
    return res;
  }

  /**
   * Gets a copy of suggested images, sorted by confidence.
   * 
   * @param asc Sorts confidence in ascending order.
   * @return Sorted copy of the list
   */
  public ArrayList<Image> getConfidenceSortedImages(final boolean asc) {
    ArrayList<Image> res = new ArrayList<Image>(images);
    Collections.sort(res, new Comparator<Image>() {
      @Override
      public int compare(Image o1, Image o2) {
        return asc ? o2.compareTo(o1) : o1.compareTo(o2);
      }
    });
    
    return res;
  }

  /**
   * Gets a copy of suggested keywords, sorted by confidence.
   * 
   * @param asc Sorts confidence in ascending order.
   * @return Sorted copy of the list
   */
  public ArrayList<Keyword> getConfidenceSortedKeywords(final boolean asc) {
    ArrayList<Keyword> res = new ArrayList<Keyword>(keywords);
    Collections.sort(res, new Comparator<Keyword>() {
      @Override
      public int compare(Keyword o1, Keyword o2) {
        return asc ? o2.compareTo(o1) : o1.compareTo(o2);
      }
    });
    
    return res;
  }

  /**
   * Gets a copy of suggested markup links, sorted by confidence.
   * 
   * @param asc Sorts confidence in ascending order.
   * @return Sorted copy of the list
   */
  public Markup getConfidenceSortedMarkup(final boolean asc) {
    Markup res = new Markup();
    res.links = new ArrayList<Link>(markup.links);
    res.text = markup.text;
    Collections.sort(res.links, new Comparator<Link>() {
      @Override
      public int compare(Link o1, Link o2) {
        return asc ? o2.compareTo(o1) : o1.compareTo(o2);
      }
    });
    
    return res;
  }
  
    
  @Override
  public String toString() {
	  
  
	StringBuilder sb = new StringBuilder();
	
	sb.append("Articles:\n");
	for (Article a : articles) {
	  sb.append(a).append("\n");
	}
	sb.append("\n");
	
	sb.append("Images:\n");
	for (Image i : images) {
	  sb.append(i).append("\n");
	}
	sb.append("\n");
	
	sb.append("Keywords:\n");
	for (Keyword k : keywords) {
	  sb.append(k).append("\n");
	}
	sb.append("\n");
	
	sb.append("Categories:\n");
	for (Category c : categories) {
	  sb.append(c).append("\n");
	}
	sb.append("\n");
	
	
	sb.append("Markup:\n");
	sb.append(markup);
	
	return sb.toString();

  }

}
