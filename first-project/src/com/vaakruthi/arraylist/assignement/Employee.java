package com.vaakruthi.arraylist.assignement;

import java.util.ArrayList;

public class Employee {
	int id;
	String name;
	String address;
	String phone;
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
}
