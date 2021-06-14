package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static final String CONFIG_FILE_PATH = "com/springcore/ref/reference-type-config.xml";
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_FILE_PATH);
		ClassA obj = (ClassA) context.getBean("aref");
		System.out.println(obj.getX());
		System.out.println(obj.getOb().getY());
		
		System.out.println(obj);
	}
}
