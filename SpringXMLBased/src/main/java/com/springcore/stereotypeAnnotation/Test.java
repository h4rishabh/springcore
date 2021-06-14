package com.springcore.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotypeAnnotation/stereo-config.xml");
		
		Student s1 = con.getBean("student",Student.class);
		System.out.println(s1);
	}

}
