package com.telstra.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telstra.assignment.Dto.UserDto;
import com.telstra.assignment.entity.user;
import com.telstra.assignment.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public user saveUser(UserDto userDto) {
		//find highest number from list
		List<Integer> findHighest = userDto.getFindHighest();
		Integer max = findHighest
			      .stream()
			      .mapToInt(v -> v)
			      .max().orElseThrow(NoSuchElementException::new);
		
		//find special characters from string
		String findSpecialCharacters = userDto.getFindSpecialCharacters();

		String str2 = null;
		
		List<Character> s = new ArrayList<>();
		char[] ch = new char[findSpecialCharacters.length()];
		// Copy character by character into array
		for (int i = 0; i < findSpecialCharacters.length(); i++) {
		ch[i] = findSpecialCharacters.charAt(i);
		}
		// Printing content of array
		for (char c : ch) {
		if(!Character.isDigit(c) && !Character.isLetter(c)){
		s.add(c);
		 str2=String.valueOf(c);
		
		}
		}
		
		
	
		
		boolean validNum= true;
		  String validNumber = userDto.getValidNumber();
		  
		  if(isNumeric(validNumber)) { 
			     validNum =true;
			} else {
				 validNum =false;
			}
		 
		  
		
		user mc = new user();
		mc.setFindHighest(max.toString());
		mc.setFindSpecialCharacters(str2);
		mc.setValidNumber(validNum);
		userRepository.save(mc);
		
		return mc;
	}
	
	 public static boolean isNumeric(String validNumber) {
		    if(validNumber == null || validNumber.equals("")) {
		        return false;
		    }
		    
		    try {
		      Integer.parseInt(validNumber);
		        return true;
		    } catch (NumberFormatException e) {
		        System.out.println("Input String cannot be parsed to Integer.");
		    }
		    return false;
		}
	

}
