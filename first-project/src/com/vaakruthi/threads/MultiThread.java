package com.vaakruthi.threads;

public class MultiThread implements Runnable{
	String s;
	
	public MultiThread(String s) {
		super();
		this.s = s;
	}
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(s+" "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
