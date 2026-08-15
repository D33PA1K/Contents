package com.deepak.spring.springcore.innerbeans;

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

	public String getStreet() {
		return street;
	}

	public String getName() {
		return name;
	}

	public Address(int no, String street, String name) {
		super();
		this.no = no;
		this.street = street;
		this.name = name;
	}
}
