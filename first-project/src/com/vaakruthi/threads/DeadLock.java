package com.vaakruthi.threads;
/*
 * Thread DeadLock:
 * when a thread locked an object is waiting for another object to be released by another thread
 * and other thread is also waiting for the first thread to release the first object,both the threads
 * will continue waiting forever this is called Thread Deadlock
 */
public class DeadLock {
	public static void main(String[] args) {
		Object train = new Object();
		Object cons = new Object();
		
		
		BookTicket b = new BookTicket(train, cons);
		CancelTicket c = new CancelTicket(train, cons);
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
	}
}
