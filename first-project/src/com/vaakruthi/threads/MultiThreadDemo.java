package com.vaakruthi.threads;

public class MultiThreadDemo {
	public static void main(String[] args) {
		MultiThread m1 = new MultiThread("cut the ticket"); 
		MultiThread m2 = new MultiThread("book the ticket"); 	
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		
		t1.start();
		t2.start();
	}
}
