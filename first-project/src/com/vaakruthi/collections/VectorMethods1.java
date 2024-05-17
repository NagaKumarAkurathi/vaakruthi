package com.vaakruthi.collections;

import java.util.Vector;

public class VectorMethods1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(22);
		System.out.println(v);
		
		//add(int index,Integer element):void
		v.add(2, 50);
		System.out.println(v);
		
		//addAll(Collection<? extends Integer> c) :boolean
		System.out.println(v.addAll(v));
		
		//addAll(int index,Collection<? extends Integer> c):boolean
		//System.out.println(v.addAll(2, v));
		
		//addElement(Integer obj):void
		v.addElement(1);
		System.out.println(v);
		
		//capacity():int
		System.out.println(v.capacity());
		
		//clone():Object
		System.out.println(v.clone());
		
		//contains(Object o):boolean
		System.out.println(v.contains(20));
		
		//containsAll(Collection<?> c):boolean
		System.out.println(v.containsAll(v));
		
		//set(int index,Integer element):Integer
		System.out.println(v.set(1, 10));
		
		System.out.println("New Vector Elements are :"+v);
		
		//elementAt(int index):Integer
		System.out.println(v.elementAt(0));
		
		//elements():Enumeration<Integer>
		System.out.println(v.elements());
		
		//firstElement():Integer
		System.out.println(v.firstElement());
		
		//hashCode():int
		System.out.println(v.hashCode());
		
		//get(int index):Integer
		System.out.println(v.get(3));
		
		System.out.println(v.indexOf(v));
	
	}
}
