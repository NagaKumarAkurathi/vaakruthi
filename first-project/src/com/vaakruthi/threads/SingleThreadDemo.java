package com.vaakruthi.threads;

public class SingleThreadDemo {
	public static void main(String[] args) {
		SingleThread s = new SingleThread();
		Thread t  = new Thread(s);
		t.start();
	}
	
	
}
