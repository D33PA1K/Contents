package com.deepak.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String [] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
		Employee emp  = (Employee)ctx.getBean("emp");
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}
}
