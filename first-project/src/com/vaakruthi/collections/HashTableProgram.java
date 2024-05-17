package com.vaakruthi.collections;

import java.util.Hashtable;
/*
 * Default Capacity is -> 11
 * Load factor is -> 0.75
 * store the elements in bucket or output order is: from top to bottem & from right side to left side 
 */
public class HashTableProgram {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(new Test(5), "A");
		h.put(new Test(2), "B");
		h.put(new Test(6), "C");
		h.put(new Test(15), "D");
		h.put(new Test(15), "E");
		h.put(new Test(23), "F");
		//h.put("Naga", null);//NullPointerException
		System.out.println(h);
	}
}
class Test{
	int i;
	Test(int i){
		this.i = i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+"";
	}
}
