package com.web.cookie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.web.cookie.model.UserInformation;
import com.web.cookie.model.UserInformationMapper;

public class UserInformationMapperTest {

	@Test
	void writeJson() {
		var object = new UserInformation("Thaw Zin Aung", "09779580179", "tza@gmail.com");
		var result = UserInformationMapper.toJson(object);
		System.out.println(result);
		var parse = UserInformationMapper.fromJson(result);
		assertEquals(object, parse);
	}
	
}
