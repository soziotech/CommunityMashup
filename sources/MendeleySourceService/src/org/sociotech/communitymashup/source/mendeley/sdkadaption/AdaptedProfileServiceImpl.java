/*******************************************************************************
 * Copyright (c) 2013 Peter Lachenmaier - Cooperation Systems Center Munich (CSCM).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Peter Lachenmaier - Design and initial implementation
 ******************************************************************************/
package org.sociotech.communitymashup.source.mendeley.sdkadaption;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.sociotech.communitymashup.source.mendeley.sdkadaption.AdaptedProfile.Section;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.mendeley.oapi.common.PagedList;
import com.mendeley.oapi.schema.Contact;
import com.mendeley.oapi.schema.User;
import com.mendeley.oapi.services.constant.MendeleyApiUrls;
import com.mendeley.oapi.services.constant.MendeleyApiUrls.MendeleyApiUrlBuilder;
import com.mendeley.oapi.services.constant.ParameterNames;
import com.mendeley.oapi.services.impl.ProfileServiceImpl;
import com.mendeley.oapi.services.oauth.MendeleyAccessToken;
import com.mendeley.oapi.services.oauth.MendeleyApiConsumer;

public class AdaptedProfileServiceImpl extends ProfileServiceImpl {

	public AdaptedProfileServiceImpl(MendeleyApiConsumer apiConsumer,
			MendeleyAccessToken accessToken) {
		super(apiConsumer, accessToken);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.impl.BaseMendeleyPublicService#getGsonBuilder()
	 */
	@Override
	protected GsonBuilder getGsonBuilder() {
		
		GsonBuilder builder = super.getGsonBuilder();
		builder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
			@Override
			public Date deserialize(JsonElement arg0,
					java.lang.reflect.Type arg1, JsonDeserializationContext arg2)
					throws JsonParseException {
				DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date date = null;
				try {
					String value = arg0.getAsString();
					date = (Date)formatter.parse(value);
				} catch (ParseException e) {
					return null;
				}

				return date;
			}
		});
		
		return builder;
	}
	
	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.impl.BaseMendeleyPublicService#unmarshall(java.lang.Class, com.google.gson.JsonElement)
	 */
	@Override
	protected <T> T unmarshall(Class<T> type, JsonElement response) {
		System.out.println("Unmarshalling " + response);
		
		return super.unmarshall(type, response);
	}
	
	protected <T> T unmarshall(TypeToken<T> typeToken, JsonElement response) {
		System.out.println("Unmarshalling token " + response);
		return super.unmarshall(typeToken, response);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.impl.BaseMendeleyPublicService#unmarshallList(java.lang.Class, com.google.gson.JsonElement)
	 */
	@Override
	protected <T> List<T> unmarshallList(Class<T> clazz, JsonElement response) {
		System.out.println("Unmarshalling list " + response);
		return super.unmarshallList(clazz, response);
	}

	/* (non-Javadoc)
	 * @see com.mendeley.oapi.services.impl.BaseMendeleyPublicService#unmarshallList(java.lang.Class, com.google.gson.JsonElement, java.lang.String)
	 */
	@Override
	protected <T> PagedList<T> unmarshallList(Class<T> clazz,
			JsonElement response, String listName) {
		System.out.println("Unmarshalling list with name " + listName + " from " + response);
		
		return super.unmarshallList(clazz, response, listName);
	}

	public AdaptedProfile getAdaptedProfile(String userId) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_PROFILE_URL);
        String                apiUrl  = builder.withField(ParameterNames.ID, userId).buildUrl();
        JsonElement json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(AdaptedProfile.class, json);
	}
	
	public AdaptedProfile getAdaptedProfile(String userId, Section section) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_PROFILE_URL);
        String                apiUrl  = builder.withField(ParameterNames.ID, userId).withParameterEnum(ParameterNames.SECTION, section).buildUrl();
        JsonElement json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(AdaptedProfile.class, json);
	}

	public User getUser(String userId) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_PROFILE_URL);
        String                apiUrl  = builder.withField(ParameterNames.ID, userId).withParameterEnum(ParameterNames.SECTION, Section.MAIN).buildUrl();
        JsonElement json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(User.class, json);
	}
	
	public Contact getContact(String userId) {
		MendeleyApiUrlBuilder builder = createMendeleyApiUrlBuilder(MendeleyApiUrls.ProfileApiUrls.GET_PROFILE_URL);
        String                apiUrl  = builder.withField(ParameterNames.ID, userId).withParameterEnum(ParameterNames.SECTION, Section.CONTACT).buildUrl();
        JsonElement json = unmarshall(callApiGet(apiUrl));
        
        return unmarshall(Contact.class, json);
	}
}
