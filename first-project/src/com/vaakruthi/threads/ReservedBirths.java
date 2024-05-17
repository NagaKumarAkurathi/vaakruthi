package com.vaakruthi.threads;

public class ReservedBirths implements Runnable {
	int avalible = 1;
	int wanted;

	public ReservedBirths(int wanted) {
		this.wanted = wanted;
	}

	public void run() {
		synchronized (this) {
			System.out.println("Avalible berths are :" + avalible);
			if (avalible >= wanted) {
				String s = Thread.currentThread().getName();
				System.out.println(wanted + " Berths reserved for " + s);
				try {
					Thread.sleep(1000);
					avalible -= wanted;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Sorry no berths are avaliable..");
			}
		}
	}
}
