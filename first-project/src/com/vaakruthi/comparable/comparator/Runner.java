package com.vaakruthi.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<Laptop> l = new ArrayList<Laptop>();
		l.add(new Laptop("Dell", 16, 800));
		l.add(new Laptop("Apple", 8, 1200));
		l.add(new Laptop("Acer", 12, 700));
		
		Comparator<Laptop> com = new Comparator<Laptop>() {
			
			@Override
			public int compare(Laptop l1, Laptop l2) {
				// TODO Auto-generated method stub
				if(l1.getPrice()>l2.getPrice()) {
					return 1;
				}
				else {
				return -1;
				}
			}
		};
		
		Collections.sort(l,com);
		
		for(Laptop l1 : l) {
			System.out.println(l1);
		}
	}
}
