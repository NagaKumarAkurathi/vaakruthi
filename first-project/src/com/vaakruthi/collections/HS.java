package com.vaakruthi.collections;

import java.util.HashSet;
import java.util.Iterator;
/*
 * Default Capacity --> 16
 * Load Factor --> 0.75
 */
class HS
{
	public static void main(String[] args)
	{
		 HashSet<String> hs = new HashSet<>();
		 hs.add("India");
		 hs.add("United States");
		 hs.add("Japan");
		 hs.add("China");
		 hs.add("China");
		 
		 System.out.println("Elements View Hash Set : "+hs);
		 
		 Iterator it = hs.iterator();
		 while(it.hasNext())
		 {
			String s = (String)it.next();
			System.out.println(s);
		 }
		
		hs.remove("China");
		if(hs.contains("India"))
		 System.out.println("Found the value");
		 
		 hs.clear();
		 
		 if(hs.isEmpty())
		    System.out.println("No values Set is Empty");
		 else
			System.out.println("Has values Set");
			
		int hashSetSize = hs.size();
		System.out.println("HashSet size : "+hashSetSize);
	}

}
