package com.telstra.assignment.test.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.telstra.assignment.Dto.UserDto;
import com.telstra.assignment.entity.user;
import com.telstra.assignment.service.UserService;

@SpringBootTest
@AutoConfigureMockMvc
public class TelstraTestController {
	
	@Mock
	UserService userService;
	
	@Test
	public void addUser() throws Exception{
		//List<UserDto> userInt = new ArrayList<>();
		UserDto userDto = new UserDto();
		userDto.setFindSpecialCharacters("&*^%^");
		userDto.setValidNumber("25");
		MockHttpServletRequest request = new MockHttpServletRequest();
		
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		user  responseEntity =userService.saveUser(userDto);
		
	}

}
