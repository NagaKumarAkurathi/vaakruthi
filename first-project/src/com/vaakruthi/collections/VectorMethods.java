package com.vaakruthi.collections;
/*
 * Vector

  A vector also stores elements similar to ArrayList, but vector is synchronized.Even if serveral threads act on Vector object simultaneously, the results will be reliable.
   class Vector<E>.
   
    E represents the type of elements stored into the vector.
	
	e.g: Vector<Integer> v = new Vector<Integer>();
	
	Methods:
	
	boolean add(element obj); 
	void add(int position, element obj);
	element remove(int position);
	boolean remove(element obj);
	void clear();
	boolean set(int position,element obj);
	boolean contains(Object obj);
	element get(int position);
	int indexOf(Object obj);
	int lastIndexOf(Object obj);
	int size();
	Object[] toArray();
	int capacity();
 */
import java.util.ListIterator;
import java.util.Vector;
public class VectorMethods {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		int [] x = {20,33,40,10,12,50};
		for(int i=0;i<=x.length-1;i++)
		{
			v.add(x[i]);
		}
		System.out.println("Vector Elements are:");
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("Elements using ListIterator :");
		ListIterator<Integer> l = v.listIterator();
		System.out.println("In Forward Direction :");
		while(l.hasNext()) {
			System.out.println(l.next()+"\t");
		}
		System.out.println("In BackWard Direction:");
		while(l.hasPrevious()) {
			System.out.println(l.previous()+"\t");
		}
	}
}
