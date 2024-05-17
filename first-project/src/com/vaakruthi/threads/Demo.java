package com.vaakruthi.threads;

public class Demo {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		Thread t  = new Thread(m);
		t.start();
	}
}
 