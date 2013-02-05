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
 * Class representing suggested image
 * 
 * @author Matej Usaj
 */
public class Image extends Item {
  /** URL of large version of the image */
  public String url_l;
  
  /** Width of large image (available since August 12. 2008) */
  public int url_l_w;
  
  /** Height of large image (available since August 12. 2008) */
  public int url_l_h;
  
  /** URL of medium version of the image */
  public String url_m;
  
  /** Width of medium image (available since August 12. 2008) */
  public int url_m_w;

  /** Height of medium image (available since August 12. 2008) */
  public int url_m_h;

  /** URL of small version of the image */
  public String url_s;
  
  /** Width of small image (available since August 12. 2008) */
  public int url_s_w;
  
  /** Height of small image (available since August 12. 2008) */
  public int url_s_h;

  /** URL of page that has more information about the image */
  public String imageSource;
  
  /** 
   * Height of large image. Use specific sizes instead. This variable
   * will be completely removed after September 2008.
   * 
   * @deprecated Will be removed in Sept. 2008
   */
  public String height;
  
  /** 
   * Width of large image. Use specific sizes instead. This variable
   * will be completely removed after September 2008
   * 
   * @deprecated Will be removed in Sept. 2008
   */
  public String width;
  
  /** License of image (HTML blob) */
  public String license;
  
  /** Description of image (text) */
  public String description;
  
  /** Attribution of image (HTML blob) */
  public String attribution;

  /**
   * New constructor filling the acquired data.
   * 
   * @param url_l URL of large version of the image
   * @param url_l_w Width of large image
   * @param url_l_h Height of large image
   * @param url_m URL of medium version of the image
   * @param url_m_w Width of medium image
   * @param url_m_h Height of medium image
   * @param url_s URL of small version of the image
   * @param url_s_w Width of small image
   * @param url_s_h Height of small image
   * @param imageSource URL of page that has more information about the image
   * @param license License of image (HTML blob)
   * @param description Description of image (text)
   * @param attribution Attribution of image (HTML blob)
   * @param confidence Confidence of the article
   */
  public Image(
      String url_l,
      String url_l_w,
      String url_l_h,
      String url_m,
      String url_m_w,
      String url_m_h,
      String url_s,
      String url_s_w,
      String url_s_h,
      String imageSource,
      String license, 
      String description,
      String attribution, 
      String confidence)
  {
    this.url_l = url_l;
    this.url_l_w = parseIntOrZero(url_l_w);
    this.url_l_h = parseIntOrZero(url_l_h);
    this.url_m = url_m;
    this.url_m_w = parseIntOrZero(url_m_w);
    this.url_m_h = parseIntOrZero(url_m_h);
    this.url_s = url_s;
    this.url_s_w = parseIntOrZero(url_s_w);
    this.url_s_h = parseIntOrZero(url_s_h);
    this.imageSource = imageSource;
    this.height = url_l_h;
    this.width = url_l_w;
    this.license = license;
    this.description = description;
    this.attribution = attribution;
    this.confidence = parseFloatOrZero(confidence);
  }

  /**
   * Default constructor filling the acquired data.
   * 
   * @param url_l URL of large version of the image
   * @param url_m URL of medium version of the image
   * @param url_s URL of small version of the image
   * @param imageSource URL of page that has more information about the image
   * @param height Height of large image
   * @param width Width of large image
   * @param license License of image (HTML blob)
   * @param description Description of image (text)
   * @param attribution Attribution of image (HTML blob)
   * @param confidence Confidence of the article
   * 
   * @deprecated Use new constructor instead
   */
  public Image(
      String url_l, 
      String url_m, 
      String url_s, 
      String imageSource,
      String height, 
      String width, 
      String license, 
      String description,
      String attribution, 
      String confidence)
  {
    this(
        url_l, width, height,
        url_m, "0", "0",
        url_s, "0", "0",
        imageSource,
        license,
        description,
        attribution,
        confidence);
  }

  @Override
  public String toString() {
    return new StringBuilder()
        .append("Image:\n")
        .append("  url_l=").append(url_l).append("\n")
        .append("  url_l_w=").append(url_l_w).append("\n")
        .append("  url_l_h=").append(url_l_h).append("\n")
        .append("  url_m=").append(url_m).append("\n")
        .append("  url_m_w=").append(url_m_w).append("\n")
        .append("  url_m_h=").append(url_m_h).append("\n")
        .append("  url_s=").append(url_s).append("\n")
        .append("  url_s_w=").append(url_s_w).append("\n")
        .append("  url_s_h=").append(url_s_h).append("\n")
        .append("  height=").append(height).append("\n")
        .append("  width=").append(width).append("\n")
        .append("  image_source=").append(imageSource).append("\n")
        .append("  license=").append(license).append("\n")
        .append("  description=").append(description).append("\n")
        .append("  attribution=").append(attribution).append("\n")
        .append("  confidence=").append(confidence).toString();
  }
}
