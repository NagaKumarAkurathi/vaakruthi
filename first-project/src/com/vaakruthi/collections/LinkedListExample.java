package com.vaakruthi.collections;

import java.util.LinkedList;
import java.util.List;
/*
LinkedList Class

					
				   -------------------
				   |	|	   |	|
				   |link|data  |link|
				   ------------------- .....
				   
				   A linked list contains a group of elements in the form of nodes.
				   Each Node will have three fields 
				   1.link filed it contains previous node address.
				   2. data which contains the value.
				   3.link filed it contains next node address.
				   
			Linked list is very convenient easy to store data.Inserting the elements into the linked list and removing the elements from the linked list is done quickly and takes same amount of time.
			
			LinkedList<String> ll = new LinkedList<String>();
			
			Mehtods:
			
			boolean add(element obj);
			void add(int position,element obj);
			void addFirst(element obj);
			void addLast(element obj);
			element removeFirst();
			element removeLast();
			element remove(int position);
			boolean remove(element obj);
			void clear();
			element get(int position);
			element getFirst();
			element getLast();
			element set(int position, element obj);
			int size();
			int indexOf(object obj);
			int lastIndexOf(object obj);
			object[] toArray();
			element poll();			
LinkedList.txt
Displaying LinkedList.txt.
 */
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
}
public class LinkedListExample {
	public static void main(String[] args) {
		List<Book> l = new LinkedList<Book>();
		 Book b1=new Book(101," Let us C"," Yashwant Kanetkar","BPB",8);  
		 Book b2=new Book(102," Data Communications & Networking"," Forouzan","Mc Graw Hill",4);  
		 Book b3=new Book(103," Operating System","Galvin"," Wiley",6); 
		 l.add(b1);
		 l.add(b2);
		 l.add(b3);
		 for(Book b :l) {
			 System.out.println(b.id+""+b.name+""+b.author+""+b.publisher+""+b.quantity);
		 }
	}
}
