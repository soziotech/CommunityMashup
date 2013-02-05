/**
 * Provides the classes representing parts of results obtained from sending a request
 * to Zemanta API service.
 * 
 * <p>Classes are part of the <code>ZemantaResult</code> class, returned from 
 * <code>Zemanta.suggest(...)</code> methods, when requested format is XML.
 * <br/>
 *  For example:
 *  <pre>
 *  
 *  //pass API key and gateway to the constructor
 *  
 *  Zemanta zem = new Zemanta(apiKey, gateway);
 *  ZemantaResult result = zem.suggest("I love Berlin and New York too");
 *  <br/>
 *  <br/>
 *  //get parts of the suggested result
 *  Markup m = result.markup;
 *  ArrayList&lt;Article&gt; a = result.articles;
 *  ArrayList&lt;Keyword&gt; k = result.keywords;
 *  
 *  </pre>
 *
 *
 * @see <a href="http://developer.zemanta.com/docs/suggest" target="_blank"> Zemanta's Documentation of method zemanta.suggest</a> 
 * 
 */
package com.zemanta.api.suggest;