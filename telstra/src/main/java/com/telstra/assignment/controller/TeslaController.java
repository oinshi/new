package com.telstra.assignment.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telstra.assignment.Dto.ResponseDto;
import com.telstra.assignment.Dto.UserDto;
import com.telstra.assignment.constant.Constant;
import com.telstra.assignment.entity.user;
import com.telstra.assignment.service.UserService;

@RestController
public class TeslaController {
	
	@Autowired
	private UserService userService;
	

	@PostMapping("save-data")
	public ResponseEntity<?> addUser(@RequestBody UserDto userDto) {
		ResponseDto response = new ResponseDto();
		try {
		
			user usr = userService.saveUser(userDto);
			
			response.setMessage("User added successfully");
			response.setStatus(Constant.SUCCESS);
			response.setResponse(usr);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			response.setMessage("Failed to update user details");
			response.setStatus(Constant.ERROR);
			response.setError(e);
		}
		
		return ResponseEntity.ok(response);
		
	}
	
}
