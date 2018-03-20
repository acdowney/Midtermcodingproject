package com.cisc181.core;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cisc181.eNums.eTitle;

public class PersonException extends Exception{
	private Person person;
	private ArrayList phoneNumbers = new ArrayList();

	public PersonException(Person person){
		super();
		this.person = person;
	}
	
	
	
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}



