package com.deepak.spring.springcore.constructorinjection;

public class Employee2 {
	private int id;
	private Address address;

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public Employee2(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

}
