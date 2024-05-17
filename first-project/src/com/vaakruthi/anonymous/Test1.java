package com.vaakruthi.anonymous;

public class Test1 {//Anonymous inner class approach
	public static void main(String[] args) {
		Thread t = new Thread(){
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("Child Thread");
				}
			}
		};
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
		}
	}
}
