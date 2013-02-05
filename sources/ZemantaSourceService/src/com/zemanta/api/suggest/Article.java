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

/**
 * Class representing suggested article
 * 
 * @author Matej Usaj
 */
public class Article extends Item {
  /** URL of the article */
  public String url;
  
  /** Title of the article */
  public String title;
  
  /** 
   * Date when article was published. If not available harvested date is used.
   * In ISO 8601 format. 
   */
  public String publishedDatetime;
  
  /** Is the article zemified or not @since August 2008 */
  public boolean zemified;
  
  /**
   * Constructor filling the acquired data.
   * 
   * @param url URL of the article
   * @param title Title of the article
   * @param publishedDatetime Date of the article
   * @param confidence Confidence of the article
   * @param zemified True if article is enriched with Zemanta (zemified).
   */
  public Article(
      String url, 
      String title, 
      String publishedDatetime,
      String confidence,
      String zemified) {
    this.url = url;
    this.title = title;
    this.publishedDatetime = publishedDatetime;
    this.confidence = Float.parseFloat(confidence);
    this.zemified = Boolean.parseBoolean(zemified);
  }

  /**
   * Default constructor filling the acquired data.
   * 
   * @param url URL of the article
   * @param title Title of the article
   * @param publishedDatetime Date of the article
   * @param confidence Confidence of the article
   * 
   * @deprecated Use new constructor instead
   */
  public Article(
      String url, 
      String title, 
      String publishedDatetime,
      String confidence) {
    this(url, title, publishedDatetime, confidence, Boolean.toString(false));
  }
  
  @Override
  public String toString() {
    return new StringBuilder()
        .append("Article:\n")
        .append("  url=").append(url).append("\n")
        .append("  title=").append(title).append("\n")
        .append("  publishedDateTime=").append(publishedDatetime).append("\n")
        .append("  zemified=").append(zemified).append("\n")
        .append("  confidence=").append(confidence).toString();
  }
}
