package com.deepak.spring.springcore.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test3 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/deepak/spring/springcore/innerbeans/Config3.xml");
		Employee2 employee = (Employee2)ctx.getBean("employee");
		System.out.println(employee); 
	}

}
