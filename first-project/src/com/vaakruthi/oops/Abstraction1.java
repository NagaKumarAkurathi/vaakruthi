package com.vaakruthi.oops;

public class Abstraction1 {
	public static void main(String[] args) {
		Helper h = new Helper();
		Demo1 d = h.getObject();
		d.test();
	}
}
abstract class Demo1{
	abstract public void test();
}
class Sample1 extends Demo1{
	public void test() {
		System.out.println("Test completed....");
	}
}
class Helper{
	public Demo1 getObject() {
		Demo1 d = (Demo1)new Sample1();
		return d;
	}
}
