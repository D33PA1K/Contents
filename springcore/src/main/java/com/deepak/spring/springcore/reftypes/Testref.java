package com.deepak.spring.springcore.reftypes;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testref {
	public static void main(String []args) {
		
	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/deepak/spring/springcore/reftypes/RefConfig.xml");
	Student student = (Student)ctx.getBean("student");
	System.out.println(student);
}
}
