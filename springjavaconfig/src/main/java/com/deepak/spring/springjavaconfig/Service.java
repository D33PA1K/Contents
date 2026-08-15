package com.deepak.spring.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	@Autowired
	Dao dao;
	
	public void init() {
		System.out.println("init()");
	}
	public void destory() {
		System.out.println("destory()");
	}
	public void save() {
		dao.create();
	}
}
