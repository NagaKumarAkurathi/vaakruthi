package com.vaakruthi.objectcasting;
class A{
	public void m1()
	{
		System.out.println("Method 1.....");
	}
}
class B extends A{
	public void m2()
	{
		System.out.println("Method 2.....");
	}
}
public class UpcastingAndDowncasting {
	public static void main(String[] args) {
		A a1 = (A)new B();//upcasting
		a1.m1();
		
		B b1 = (B)a1;//downcasting
		b1.m1();
		b1.m2();
	}
}
