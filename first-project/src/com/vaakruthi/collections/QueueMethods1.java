package com.vaakruthi.collections;

import java.util.LinkedList;
import java.util.Queue;
//Default Capacity --> 11
public class QueueMethods1 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(5);
		q.add(15);
		System.out.println(q);
		q.offer(30);
		q.offer(40);
		System.out.println(q);
		
		System.out.println(q.peek());//-->To return the head element in the queue.if queue is empty returns null
		
		System.out.println(q.element());//-->To return the head element in the queue.if queue is empty returns runtime error(NoSuchElementException)
		
		System.out.println(q.poll());//-->Remove the element in head of the queue.if the queue is empty returns null..
		
		System.out.println(q.remove());//-->Remove the element in head of the queue.if the queue is empty returns runtime error(NoSuchElementException)
		
		System.out.println(q);
	}
}
