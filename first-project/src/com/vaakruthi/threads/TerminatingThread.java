package com.vaakruthi.threads;
//Terminating the thread
public class TerminatingThread extends Thread{
	boolean stop = false;
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			if(stop) return;
		}
	}
}
