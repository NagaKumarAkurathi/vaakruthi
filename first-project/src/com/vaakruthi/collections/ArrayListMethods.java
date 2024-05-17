package com.vaakruthi.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Default Capacity --> 10
public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> arrayObject = new ArrayList();
		arrayObject.add(10);
		arrayObject.add(20);
		arrayObject.add(40);
		arrayObject.add(50);
		arrayObject.add(60);
		System.out.println(arrayObject);
		//void add(int index,E element);
		arrayObject.add(2, 30);
		System.out.println(arrayObject);
		//boolean contains(Object element)
		if(arrayObject.contains(20))
		{
			//E remove(int index);
			System.out.println(arrayObject.remove(2));
		}
		//boolean remove(Object element);
		System.out.println(arrayObject.remove(arrayObject));
		//boolean addAll(int index,Collection<? extends E> c);
		arrayObject.addAll(3, arrayObject);
		System.out.println(arrayObject);
		//E set(int index,Integer element);
		System.out.println(arrayObject.set(2, 30));
		//Object clone();
		System.out.println(arrayObject.clone());
		//void ensureCapacity(int minCapacity);
	    arrayObject.ensureCapacity(4);
	    System.out.println(arrayObject);
	    System.out.println(arrayObject.equals(20));
	    //Object [] toArray();
	    Object [] o = arrayObject.toArray();
	    System.out.println(o);
	    for(Object o1: o)
	    {
	    	System.out.print(o1+" ");
	    }
	    //int lastIndexOf(Object element);
	    System.out.println(arrayObject.isEmpty());
	    //void forEach(Consumer< ? super E> action);
	   // arrayObject.forEach(null);
	   // System.out.println(arrayObject);
	   // System.out.println(arrayObject);
	    
	    //equals(Object o): boolean
		arrayObject.equals(20);
		System.out.println(arrayObject);
		//get(int index):Integer
		System.out.println(arrayObject.get(4));
		//hashCode():int 
		System.out.println(arrayObject.hashCode());
		//getClass():Class<?>:Object
		System.out.println(arrayObject.getClass());
		//iterator:iterator<Integer>
		System.out.println(arrayObject.iterator());
		//lastIndexOf(Object o):int
		System.out.println(arrayObject.lastIndexOf(arrayObject));
		//listIterator(int index):ListIterator<Integer>
		System.out.println(arrayObject.listIterator(1));
		//listIterator():ListIterator<Integer>
		System.out.println(arrayObject.listIterator());
		//notify():void
		//arrayObject.notify();
		//notifyAll():void
		//arrayObject.notifyAll();
		//remove(int index):Integer
		System.out.println(arrayObject.remove(3));
		System.out.println(arrayObject);
		//clear():void
		arrayObject.clear();
		System.out.println(arrayObject);
	}
}
