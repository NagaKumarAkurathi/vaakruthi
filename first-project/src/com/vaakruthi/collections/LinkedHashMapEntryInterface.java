package com.vaakruthi.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapEntryInterface {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("1 - Room", 23400);
		lh.put("2 - Room", 30010);
		lh.put("3 - Room", 34010);
		lh.put("4 - Room", 54510);
		lh.put("5 - Room", 34710);
		lh.put("6 - Room", 33210);
		lh.put("7 - Room", 54210);
		
		 Set<Map.Entry<String,Integer>> set = lh.entrySet();
		 for(Map.Entry<String, Integer> it :set) {
			 System.out.println("Before change of value = " +  
                     it.getKey() + "   " +  it.getValue()); 
			 
			 double getRandom = Math.random() * 100000; 
	         int getRoundoff = (int) Math.round(getRandom); 
	         
	         it.setValue(getRoundoff);
	         
	         System.out.println("After change of value = " +  
                     it.getKey() + "   " + it.getValue()); 
		 }
	}
}
