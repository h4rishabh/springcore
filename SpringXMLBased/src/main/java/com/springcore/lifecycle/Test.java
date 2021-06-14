package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static final String CONFIG_FILE_PATH = "com/springcore/lifecycle/lifecycle-config.xml";

	public static void main(String args[]) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_FILE_PATH);
		
		Samosa s1 = (Samosa) context.getBean("s1");
		
		System.out.println(s1);
		context.registerShutdownHook();
		
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		AnnotationExample example = (AnnotationExample) context.getBean("annotation-example");
		
		System.out.println(example);
	}

}
