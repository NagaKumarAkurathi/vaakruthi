package com.vaakruthi.collections;

import java.util.LinkedList;
import java.util.Queue;
//Default Capacity --> 11
public class QueueMethods {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=1;i<=5;i++) {
			q.offer(i);
		}
		System.out.println("Queue Elements :");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
