package com.deepak.spring.springcore.ambi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/deepak/spring/springcore/ambi/Config4.xml");
		Addition addition = (Addition) ctx.getBean("addition");
//		System.out.println(addition);
	}

}
