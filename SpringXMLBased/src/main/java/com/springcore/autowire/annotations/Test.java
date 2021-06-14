package com.springcore.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public final static String XML_PATH = "com/springcore/autowire/annotations/autoconfig.xml";
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(XML_PATH);

		// Both are same 
		//Employee e = (Employee) context.getBean("emp"); 
		Employee e1 = context.getBean("emp", Employee.class);  // no need to type cast in this case
		
		//System.out.println(e);
		System.out.println(e1);
	}

}
