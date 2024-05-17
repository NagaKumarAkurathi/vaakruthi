package com.vaakruthi.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;
/*
 * Hashtable
Hashtable is similar to HashMap which can store elements in the form of key-value pair.
But Hashtable is synchronized assuring proper results even if multuple threads act on it simultaneously.

Hashtable Class Methods
value put(key,value)
value get(Object key)
Set<K> keySet()
Collection<V> values()
value remove(Object key)
void clear()
boolean isEmpty()
int size()
Enumeration keys()

 */
class HashtableDemo
{
	public static void main(String[] args) throws IOException
	{
		Hashtable<String,Integer> ht = new Hashtable<>();
		ht.put("Ajay",50);
		ht.put("Sachin",100);
		ht.put("Gavaskar",77);
		ht.put("Kapil",44);
		ht.put("Dhoni",88);
		
		System.out.println("The players names:");
		Enumeration e = ht.keys();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter players name:");
		String name = br.readLine();
		name = name.trim();
		
		Integer score = ht.get(name);
		
		if(score != null)
		{
			//convert score from Integer Object to int value
			int sc = score.intValue();
			System.out.println(name+" Scored:"+sc);
		}
		else
		{
			System.out.println("Player Not Found.");
		}
		System.out.println(ht.entrySet());
		System.out.println(ht.hashCode());
	}
}
