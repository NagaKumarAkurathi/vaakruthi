package com.vaakruthi.threads;

public class CancelTicket extends Thread {
	Object train,cons;
	
	public CancelTicket(Object train, Object cons) {
		super();
		this.train = train;
		this.cons = cons;
	}

	public void run() {
		synchronized (cons) {
			System.out.println("CancelTicket Locked on compartment");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Cancel Ticket now waiting to look on train");
			synchronized (train) {
				System.out.println("CancelTicket Locked on train");
			}
		}
	}
/*	public void run() {
		synchronized (train) {
			System.out.println("CancelTicket Locked on compartment");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Cancel Ticket now waiting to look on train");
			synchronized (cons) {
				System.out.println("CancelTicket Locked on train");
			}
		}
	} */
}
