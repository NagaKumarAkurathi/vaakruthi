package com.vaakruthi.threads;

public class ThreadRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			System.out.println("Execute inside child method");
		}
	}
	public static void main(String[] args) {
		ThreadRunnable tt = new ThreadRunnable();
		Thread t  = new Thread(tt);
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Executr inside main method....");
		}
	}

}
