package com.vaakruthi.collections;

import java.util.HashSet;
import java.util.Set;

public class FindDup2 {

	public static void main(String[] args) {
		Set<String> uniques = new HashSet<String>();
		uniques.add("Kumar");
		uniques.add("Naga");
		uniques.add("Kumar");
		Set<String> dups = new HashSet<String>();
		dups.add("Naga");
		dups.add("Kumar");
		dups.add("Naga");
		for(String a :args)
		{
			if(!uniques.add(a)) {
				dups.add(a);
			}
		}
		uniques.removeAll(dups);
		System.out.println("Uniques words :"+uniques);
		System.out.println("Duplicates Words :"+dups);
	}
}
