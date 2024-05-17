package com.vaakruthi.threads;

public class ReservedBirthsDemo {
	public static void main(String[] args) {
		ReservedBirths r = new ReservedBirths(1);

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.setName("First Person");
		t2.setName("Second person");

		t1.start();
		t2.start();
	}
}
