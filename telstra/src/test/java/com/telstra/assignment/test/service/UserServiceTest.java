package com.telstra.assignment.test.service;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.telstra.assignment.Dto.UserDto;
import com.telstra.assignment.entity.user;
import com.telstra.assignment.repository.UserRepository;
import com.telstra.assignment.service.UserService;

public class UserServiceTest {
	
	@InjectMocks
	UserService service;
	@Mock
	UserRepository userRepository;
	
	@Test
	public void addUser() throws Exception{
		
		user use = new user();
		use.setFindHighest(null);
		use.setFindSpecialCharacters("&*^%");
		use.setValidNumber(true);
		UserDto dto = new UserDto();
		Mockito.when(userRepository.save(use)).thenReturn(null);
		
	}
}
