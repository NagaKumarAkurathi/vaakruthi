package com.vaakruthi.collections;

import java.util.TreeSet;
//Default Capacity --> 16
public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		//ts.add(10); tree set doesn't allow duplicates
		ts.add(-50);
		//ts.add(null); tree set doesn't allow null values..
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet(30));
		System.out.println(ts);
		System.out.println(ts.tailSet(30));
		System.out.println(ts.subSet(1, 24));
		System.out.println(ts.higher(20));
		System.out.println(ts.lower(30));
		ts.pollFirst();
		System.out.println(ts);
		ts.pollLast();
		System.out.println(ts);
		System.out.println(ts.descendingSet());
	}
}
