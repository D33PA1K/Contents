package com.spring.springcoreadvance.injectinginterfaces;

import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOimpl implements OrderDAO{

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside the DAO");
	}
	
}
