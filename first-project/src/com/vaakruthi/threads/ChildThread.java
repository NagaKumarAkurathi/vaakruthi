package com.vaakruthi.threads;
/*
 * Thread :Thread is a path given for execution purpose to jvm by threadshcedular
 */
public class ChildThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Execute inside childthread");
		}
		super.run();
	}
	public static void main(String[] args) {
		ChildThread c = new ChildThread();
		c.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Execute inside main thread..");
		}
	}
}
