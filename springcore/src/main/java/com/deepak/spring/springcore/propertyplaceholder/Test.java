package com.deepak.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/deepak/spring/springcore/propertyplaceholder/Config4.xml");
		MyDAO mydao =(MyDAO)ctx.getBean("mydao");
		System.out.println(mydao);
	}

}
