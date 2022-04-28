package com.telstra.assignment.Dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDto {
	
	private String findSpecialCharacters;
	private List<Integer> findHighest;
	private  String validNumber;
	
}
