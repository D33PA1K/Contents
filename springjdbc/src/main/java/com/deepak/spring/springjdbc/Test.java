package com.deepak.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/deepak/spring/springjdbc/Config4.xml");
		JdbcTemplate jdbcTemplate=(JdbcTemplate)ctx.getBean("jdbcTemplate");
		String query = "insert into employee values(?,?,?)";//placeholder
		int result = jdbcTemplate.update(query,1,"Deepak","Tara");
		System.out.println("Number of records: "+result);
	}

}
