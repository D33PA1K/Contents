package com.deepak.spring.springcore.lc.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testinit {
	public static void main(String []args) {
	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/deepak/spring/springcore/lc/xmlconfig/Config1.xml");
	Patient patient = (Patient) ctx.getBean("patient");
	System.out.println(patient);
	ctx.registerShutdownHook();
	}
	
}
