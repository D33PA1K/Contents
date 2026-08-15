package com.spring.springcoreadvance.injectinginterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcoreadvance/injectinginterfaces/Config4.xml");
		OrderBO bo =(OrderBO)ctx.getBean("bo");
		bo.placeOrder();
	}

}
