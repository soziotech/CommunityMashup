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
 * Class representing suggested keyword
 * 
 * @author Matej Usaj
 */
public class Keyword extends Item {
  /** Keyword (can contain spaces, but not commas) */
  public String name;
  public String schema;
  /**
   * Default constructor filling the acquired data.
   * 
   * @param name Keyword (can contain spaces, but not commas)
   * @param confidence Confidence of the article
   */
  public Keyword(String name, String confidence) {
    this.name = name;
    this.confidence = Float.parseFloat(confidence);
    schema = "";
  }
  
  public Keyword(String name, String confidence, String schema) {
	  this(name, confidence);
	  this.schema = schema;
  }

  @Override
  public String toString() {
    return new StringBuilder()
        .append("Keyword:\n")
        .append("  name=").append(name).append("\n")
        .append("  confidence=").append(confidence).toString();
  }
}
