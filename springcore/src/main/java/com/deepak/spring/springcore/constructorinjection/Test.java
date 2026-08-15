package com.deepak.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/deepak/spring/springcore/constructorinjection/Config4.xml");
		Employee2 employee = (Employee2) ctx.getBean("employee");
		System.out.println(employee);
	}

}
