package com.vaakruthi.anonymous;
public class AnonymousInnerClassApproachRunnable {
	public static void main(String[] args) {
//		Runnable r = new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i=1;i<=5;i++) {
//					System.out.println("Child Thread");
//				}
//				
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
//		for(int i=1;i<=5;i++) {
//			System.out.println("Main Thread");
//		}
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println("Child thread");
					System.out.println("HELLO");
				}
				
			}
		}).start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
		}
	}
}
