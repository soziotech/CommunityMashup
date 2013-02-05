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
 * Helper class for sorting purposes.
 * 
 * @author Matej Usaj
 */
public abstract class Item implements Comparable<Item> {
  /** Confidence on 0.0 to 1.0 scale */
  public float confidence;
  
  /**
   * Parses a string for an integer and returns zero if the string doesn't 
   * represent one.
   * 
   * @param num String to parse.
   * @return Integer value of string.
   */
  public int parseIntOrZero(String num) {
    try {
      return Integer.parseInt(num);
    } catch (NumberFormatException e) {
      return 0;
    }
  }

  /**
   * Parses a string for a float and returns zero if the string doesn't 
   * represent one.
   * 
   * @param num String to parse.
   * @return Float value of string.
   */
  public float parseFloatOrZero(String num) {
    try {
      return Float.parseFloat(num);
    } catch (NumberFormatException e) {
      return .0f;
    }
  }

  @Override
  public int compareTo(Item o) {
    float delta = confidence - o.confidence;
    return delta == 0f ? 0 : (delta > 0f ? 1 : -1);
  }
}
