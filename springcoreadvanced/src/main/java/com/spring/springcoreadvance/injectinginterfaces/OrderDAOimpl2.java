package com.spring.springcoreadvance.injectinginterfaces;

import org.springframework.stereotype.Component;

@Component("dao2")
public class OrderDAOimpl2 implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("Inside the DAO2");
	}
	
}
