package com.vaakruthi.collections;

import java.util.PriorityQueue;

public class PriorityQueueMethod {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<>();
		p.add(30);
		p.add(50);
		p.add(20);
		p.add(5);
		p.add(10);
		p.add(100);
		p.add(31);
		System.out.println(p.peek());
	}
}
