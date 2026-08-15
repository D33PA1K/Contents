package com.deepak.spring.springcore.set;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {
	public static void main(String []args) {
		
	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/deepak/spring/springcore/set/SetConfig.xml");
	CarDealer cardealer=(CarDealer )ctx.getBean("cardealer");
	System.out.println(cardealer.getName());
	System.out.println(cardealer.getModels());
	}
	
}
