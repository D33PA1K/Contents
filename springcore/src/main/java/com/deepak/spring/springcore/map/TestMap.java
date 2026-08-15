package com.deepak.spring.springcore.map;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {
	public static void main(String []args) {
		
	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/deepak/spring/springcore/map/MapConfig.xml");
	Customer customer = (Customer) ctx.getBean("customer");
	System.out.println(customer.getId());
	System.out.println(customer.getProducts().values());
}
}
