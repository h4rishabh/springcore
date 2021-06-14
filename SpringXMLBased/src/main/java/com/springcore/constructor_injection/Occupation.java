package com.springcore.constructor_injection;

public class Occupation {

	String occupation;

	public Occupation(String occupation) {
		super();
		this.occupation = occupation;
	}


	@Override
	public String toString() {
		return this.occupation;
	}
}
