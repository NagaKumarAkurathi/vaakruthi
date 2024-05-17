package com.vaakruthi.oops;
/**
 * 1.Create interface or abstract class
 * 2.implementation class
 * 3.create helper class
 */
public class Abstraction {
	public static void main(String[] args) {
		 Sample s1 = Demo.getObject();
		 s1.test();
	}
}
interface Sample{
	void test();
}
class Run implements Sample{
	public void test() {
		System.out.println("Test Method Running.....");
	}
}
class Demo{
	public static Sample getObject() {
		Sample s = (Sample)new Run();
		return s;
	}
}
