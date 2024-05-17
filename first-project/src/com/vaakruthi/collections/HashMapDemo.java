package com.vaakruthi.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/*
 * Default Capacity is -> 16
 * Load factor is -> 0.75
 */
public class HashMapDemo {
	public static void main(String[] args) throws IOException {
		HashMap<String, Long> hm = new HashMap<String, Long>();
		String name,str;
		Long phno;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("1. Enter Phone entries ");
			System.out.println("2. Look up in the book ");
			System.out.println("3. Display names in the book ");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice :");
			int choice = Integer.parseInt(br.readLine());
			switch(choice) {
			case 1:System.out.println("Enter Name: ");
				   name = br.readLine();
				   System.out.println("Enter Phone number:");
				   str = br.readLine();
				   phno = new Long(str);
				   hm.put(name, phno);//store name and phone number in to the HashMap
				   break;
			case 2:System.out.println("Enter the name :");
				   name = br.readLine();
				   name = name.trim();
				   phno = hm.get(name);//pass name and get phno
				   System.out.println("Phno :"+phno);
				   break;
			case 3:Set<String> set = new HashSet<>();
				   set = hm.keySet();
				   System.out.println(set);
				   break;
			case 4:return;
			}
		}
	}
}
