package com.deepak.spring.springcoreadvanced.autowiring;

public class Address {
	private int no;
	private String street;
	private String name;
	public int getNo() {
		return no;
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
	@Override
	public String toString() {
		return "Address [no=" + no + ", street=" + street + ", name=" + name + "]";
	}


}
