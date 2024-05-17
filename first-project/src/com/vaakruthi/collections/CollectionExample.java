package com.vaakruthi.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {

	public static void main(String[] args) {
		Collection<String> collect = new ArrayList<>();
		collect.add("Java");
		collect.add("Python");
		
		collect.add("Html");
		collect.add("Java");
		
		System.out.println("Collecion :"+collect);
		System.out.println("Size :"+collect.size());
		System.out.println
		("Contains :"+collect.contains("Python"));
	}
}
