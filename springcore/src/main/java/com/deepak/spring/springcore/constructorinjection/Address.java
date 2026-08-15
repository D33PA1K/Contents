package com.deepak.spring.springcore.constructorinjection;

public class Address {
	private int no;
	private String street;
	private String name;
	public int getNo() {
		return no;
	}
	@Override
	public String toString() {
		return "Address [no=" + no + ", street=" + street + ", name=" + name + "]";
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
