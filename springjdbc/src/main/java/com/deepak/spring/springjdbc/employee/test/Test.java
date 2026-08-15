package com.deepak.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.deepak.spring.springjdbc.employee.dao.EmployeeDao;
import com.deepak.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/deepak/spring/springjdbc/employee/test/Config4.xml");
		EmployeeDao dao=(EmployeeDao)ctx.getBean("employeedao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstname("Priya");
		employee.setLastname("Agarwal");
		int result = dao.create(employee );
//		String query = "insert into employee values(?,?,?)";//placeholder
//		int result = jdbcTemplate.update(query,1,"Deepak","Tara");
		System.out.println("Number of records: "+result);
	}

}
