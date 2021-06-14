package com.springcore.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	
	/*
	 * If multiple beans are present in config file then to choose a particular bean
	 * we use
	 * 
	 * @Qualifier annotation
	 * 
	 */
	
	@Autowired
	@Qualifier("address2")
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside only Address cons");
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [ address=" + address + "]";
	}
	
	

}
