package com.vaakruthi.anonymous;
class MyThread1 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread");
		}
	}
}
public class NormalClassApproachRunnable {
	public static void main(String[] args) {
		MyThread1 m = new MyThread1();
		Thread t = new Thread(m);
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
		}
	}
}
