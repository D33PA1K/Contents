package com.deepak.spring.springcore.lc.xmlconfig;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void init() {
		System.out.println("Init is here");
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	public void destory() {
		System.out.println("destory is here");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After init");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After destory");
		
	}
}
