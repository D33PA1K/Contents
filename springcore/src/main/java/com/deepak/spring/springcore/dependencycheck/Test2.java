package com.deepak.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String []args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/deepak/spring/springcore/dependencycheck/Config2.xml"); 
		Prescription prescription = (Prescription) ctx.getBean("prescription");
		System.out.println(prescription);
	}
}
