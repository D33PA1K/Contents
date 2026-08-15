package com.deepak.spring.springcoreadvanced.autowiring;

public class Employee2 {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public Employee2(Address address) {
		super();
		this.address = address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee2 [address=" + address + "]";
	}
}
