package com.springcore.constructor_injection;

import java.util.List;

public class Person {
		
	private int personId;
	private String name;
	private Occupation occupation;
	private List<Friend> friends;
	
	public Person(int personId, String name, Occupation occupation, List<Friend> friends) {
		this.personId = personId;
		this.name = name;
		this.occupation = occupation;
		this.friends = friends;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId + " { "+ this.occupation.occupation+" } Friends "+friends;
	}
}
