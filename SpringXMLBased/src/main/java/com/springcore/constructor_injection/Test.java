package com.springcore.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static final String CONFIG_FILE_PATH = "com/springcore/constructor_injection/ci-config.xml";

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_FILE_PATH);
		/*
		 * Person person = (Person) context.getBean("person");
		 * 
		 * System.out.println(person);
		 */
		Addition res = (Addition) context.getBean("add");
		res.doSum(); 
	}

}
