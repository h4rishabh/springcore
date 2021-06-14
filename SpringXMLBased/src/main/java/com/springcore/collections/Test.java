package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private final static String CONFIG_FILE_PATH = "com/springcore/collections/collections-config.xml";

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_FILE_PATH);
		Emp emp1 = (Emp)context.getBean("emp1");
		System.out.println("Name: " +emp1.getName());
		System.out.println("Phones: " +emp1.getPhones());
		System.out.println("Address: " +emp1.getAddresses());
		System.out.println("Courses: " +emp1.getCourses());	
	}
}
