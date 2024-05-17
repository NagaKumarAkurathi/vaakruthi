package com.vaakruthi.collections;

public class Employee {
	int id;
	String name;
	public Employee(int i,String n) {
		id = i;
		name = n;
	}
	void display()
	{
		System.out.println("Display method..."+id+"\t"+name);
	}
}
