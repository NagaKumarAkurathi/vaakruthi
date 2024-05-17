package com.vaakruthi.threads;

public class SingleThread implements Runnable {

	@Override
	public void run() {
		task1();
		task2();
		task3();
		
	}
	void task1() {
		System.out.println("Task 1");
	}
	void task2() {
		System.out.println("Task 2");
	}
	void task3() {
		System.out.println("Task 3");
	}
}
