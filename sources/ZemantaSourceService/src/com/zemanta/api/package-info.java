/**
 * Provides the classes necessary to send a request to Zemanta API service and
 * the classes representing the result obtained.
 * <br/> 
 * For example:
 * 
 *  <pre>
 *  
 *  //...
 *  //apiKey, gateway and parameters are passed as an argument
 *  //...
 *  
 *  Zemanta zem = new Zemanta(apiKey, gateway);
 *  ZemantaResult result = zem.suggest("I love London and New York too.");
 *  
 *  </pre>
 *  
 *  <p>An alternative is to call methods from {@link com.zemanta.api.Request} or {@link com.zemanta.api.Suggest} class directly.
 *  <br/>
 *  For example:
 *  <pre>
 *  //...
 *  //apiKey, gateway and parameters are passed as an argument
 *  //... 
 *  Zemanta zem = new Zemanta(apiKey, gateway);

 *  //sending request using Suggest
 *  ZemantaResult result = Suggest.getResults(zem, parameters); 
 *  
 *  //sending request from class Request
 *  ZemantaResult result2 = Request.request(gateway, parameters); 
 *
 * 	</pre>
 * @see <a href="http://developer.zemanta.com/docs/" target="_blank">Zemanta documentation for developers</a>

 */

package com.zemanta.api;