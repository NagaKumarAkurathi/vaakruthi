package com.vaakruthi.anonymous;
class MyThread extends Thread{//Normal class Approach
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child thread");
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread..");
		}
	}
}
