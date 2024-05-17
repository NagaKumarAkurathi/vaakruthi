package com.vaakruthi.threads;

public class BookTicket extends Thread{
	Object train,cons;
	public BookTicket(Object train, Object cons) {
		super();
		this.train = train;
		this.cons = cons;
	}
	public void run() {
		//Lock on train
		synchronized (train) {
			System.out.println("Book Ticket Locked on train");
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("BookTicket now waiting to look on compartment..");
			synchronized (cons) {
				System.out.println("BookTicket Locked on compartment..");
			}
		}
	}
}
