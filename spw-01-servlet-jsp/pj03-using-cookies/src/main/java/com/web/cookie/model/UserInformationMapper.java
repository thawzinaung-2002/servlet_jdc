package com.web.cookie.model;

import java.util.Base64;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.DatatypeFeature;

public class UserInformationMapper {
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	
	public static UserInformation fromJson(String encodeValue) {
		
		if(null != encodeValue && !encodeValue.isBlank()) {
			try {
				var decode = Base64.getDecoder().decode(encodeValue.getBytes());
				var json = new String(decode);
				return mapper.readValue(json, UserInformation.class);
				
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	public static String toJson(UserInformation userInfo) {	
		
		try {
			
			var json =  mapper.writeValueAsString(userInfo);
			return Base64.getEncoder().encodeToString(json.getBytes());
			
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
			
		}
		return null;
	}

}
