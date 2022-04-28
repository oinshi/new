package com.telstra.assignment.entity;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "user")
public class user {
	private String findSpecialCharacters;
	private String findHighest;
	private boolean validNumber;

}
