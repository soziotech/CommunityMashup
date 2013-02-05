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
package com.zemanta.api.suggest;

import java.util.ArrayList;

/**
 * Class representing suggested markup
 * 
 * @author Matej Usaj
 */
public class Markup {
  /** HTML formatted text with links */
  public String text;
  
  /** List of links */
  public ArrayList<Link> links;
  
  /**
   * Default constructor. Initializes all required data structures.
   */
  public Markup() {
    links = new ArrayList<Link>();
  }
  
  /**
   * Class representing suggested markup link
   * 
   * @author Matej Usaj
   */
  public static class Link extends Item {
    /** The word in original text that should be anchored. */
    public String anchor;
    
    /** Relevance of the entity to the input text as a whole. */
    public float relevance;
    
    /** List of links targets */
    public ArrayList<Target> targets;
   
    public String entityType;
    
    /** 
     * <a href="http://www.freebase.com/view/guid/9202a8c04000641f800000000544e143#id2608921">Freebase GUID</a> 
     * (given when input parameter freebase = 1 and data is available) 
     * @deprecated <code>freebaseGuid</code> is no longer supported. Use <code>return_rdf_links="1"</code> as a parameter to SUGGEST request instead.
     */
    public String freebaseGuid;
    
    
   public Link(String anchor, String confidence, String relevance) {
	
	   this.anchor = anchor;
	   this.confidence = Float.parseFloat(confidence);
	   this.relevance = Float.parseFloat(relevance);
	   targets = new ArrayList<Target>();
	   entityType =  "";
   }
    
    
    /**
     * Constructor filling the acquired data.
     * 
     * @param anchor The word in original text that should be anchored
     * @param confidence Confidence of the article
     * @param freebaseGuid Freebase GUID
     * 
     * @deprecated Freebase GUID is no longer supported. Use new constructor instead.
     *
     */
   /* public Link(String anchor, String confidence, String freebaseGuid) {
      this.anchor = anchor;
      this.confidence = Float.parseFloat(confidence);
      this.freebaseGuid = freebaseGuid;
      targets = new ArrayList<Target>();
    }*/

    /**
     * Default constructor filling the acquired data.
     * 
     * @param anchor The word in original text that should be anchored
     * @param confidence Confidence of the article
     * 
     * @deprecated Use new constructor instead
     */
    public Link(String anchor, String confidence) {
      this(anchor, confidence, null);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder()
          .append("  Link:\n")
          .append("    anchor=").append(anchor).append("\n")
          .append("    confidence=").append(confidence).append("\n")
          .append("    entity_type=").append(entityType).append("\n");
          //.append("    freebase_guid=").append(freebaseGuid).append("\n");
      for (Target t : targets) {
        sb.append(t.toString()).append("\n");
      }
      
      return sb.toString();
    }
  }
  
  /**
   * Class representing target of the markup link
   * 
   * @author Matej Usaj
   */
  public static class Target {
    /** URL of the linked term */
    public String url;
    
    /** Type of resource it is pointing to. One of {@link TargetType} enum. */
    public TargetType type;
    
    /** Title of targeted resource */
    public String title;
    
    /**
     * Default constructor filling the acquired data.
     * 
     * @param url URL of the linked term
     * @param type Type of resource it is pointing to. One of 
     *    {@link TargetType} enum.
     * @param title Title of targeted resource
     */
    public Target(String url, String type, String title) {
      this.url = url;
      this.type = TargetType.getTargetEnum(type);
      this.title = title;
    }

    @Override
    public String toString() {
      return new StringBuilder()
          .append("    Target:\n")
          .append("      url=").append(url).append("\n")
          .append("      title=").append(title).append("\n")
          .append("      type=").append(type.name).toString();
    }
  }
  
  /**
   * Enumeration representing type of the target the link points to.
   * 
   * @author Matej Usaj
   */
  public enum TargetType {
    /** Target links to <a href="http://www.wikipedia.org">wikipedia</a> */
    WIKIPEDIA("wikipedia"),
    /** Target links to <a href="http://www.amazon.com">amazon</a> */
    AMAZON("amazon"),
    /** 
     * Target links to <a href="http://www.imdb.com">IMDB</a> (International
     * Movie DataBase 
     */
    IMDB("imdb"),
    /** Target links to <a href="http://www.youtube.com">youtube</a> */
    YOUTUBE("youtube"),
    /** Target links to resources homepage */
    HOMEPAGE("homepage"),
    /** Target links to resources geolocation */
    GEOLOCATION("geolocation"),
    /** Target links to a users blog (since 12. aug 08) */
    BLOG("blog"),
    /** 
     * Target links to <a href="http://www.techcrunch.com/">techcrunch</a> 
     * (since 12. aug 08) 
     */
    TECHCRUNCH("techcrunch"),
    /** Target is unknown */
    UNKNOWN("unknown");
    
    private String name;
    TargetType(String name) {
      this.name = name;
    }
    
    /** Get proper enum based on its name value */
    public static TargetType getTargetEnum(String name) {
      for (TargetType t : values()) {
        if (t.name.equals(name)) {
          return t;
        }
      }
      
      /* 
       * Requested target type does not exist. This shouldn't happen or this
       * API implementation is deprecated 
       */
      return UNKNOWN;
    }
  }

  @Override
  public String toString() {
    StringBuilder sb =  new StringBuilder()
        .append("Markup:\n")
        .append("  text=").append(text).append("\n");
    for (Link l : links) {
        sb.append(l).append("\n");
    }
        
    return sb.toString();
  }
}
