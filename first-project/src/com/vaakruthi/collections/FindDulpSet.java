package com.vaakruthi.collections;

import java.util.HashSet;
import java.util.Set;

public class FindDulpSet {
public static void main(String[] args) {
	Set<String> s = new HashSet<String>();
	s.add("Naga");
	s.add("Kumar");
	s.add("Naga");
	for(String a :args)
	{
		s.add(a);
	}
	System.out.println(s.size()+" distinct words   :"+s);
}
}	
