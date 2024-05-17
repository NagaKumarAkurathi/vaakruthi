package com.vaakruthi.collections;

public class CollectionNotes {
	/*
	 * 
Conversation opened. 2 messages. All messages read.

Skip to content
Using Gmail with screen readers
35 of 52
Re: Updated invitation: java class -6, Date 04-03-2024 @ Mon 4 Mar 2024 7:30am - 6pm (IST) (tulasi.prasad254@gmail.com)
Inbox

Tulasi Prasad
AttachmentsMon, Mar 4, 8:33 AM
Today Class PPT and programmes On Sun, Mar 3, 2024 at 8:28 PM lakshmi vaakruthi <lakshmi@vaakruthi.us> wrote: java class -6, Date 04-03-2024Join with Google Mee

Tulasi Prasad <tulasi.prasad254@gmail.com>
Attachments
Mon, Mar 4, 8:37 AM
to lakshmi, nagachaitanya748, sirisha.dandu25, kandulavenkatesh828, msaibhaskar1, devipalaparthi347, karthiksajja456, me, pujithagadde04, charan74493

added iterators interface

 One attachment
  •  Scanned by Gmail
Arrays cannot grow dynamically.
We cannot store different class objject into the same array.
Adding the object at the end of an array is easy.But inserting and deleting the elements in the midlle of the array is difficult.
After retrieving the elements , if we want to process them, then there are no methods available.

Collections Framework
A collection framework is a class library to handle group of objects.Collection framework is implemented in java.util package.

Colleaction is class.

Interface			Implementation classes

Set<T>				HashSet<T> , LinkedHashSet<T>

List<T>				Stack<T>(LIFO) , LinkedList<T> , ArrayList<T> , Vector<T>

Queue(FIFO)				

Map<K,V>			HashMap<K,V> , HashTable<K,V>



*(elements refer to objects)

Sets 
A set represents a group of elements arranged just like an array.
The set will grow dynamically when the elements are stored into it.
Set will not allow duplicate elements.
If we try to pass the same element that is already available in the set, Then it is not stored into set.

Lists
Lists are like sets.They store a group of elements.But lists allow duplicate values to be stored.

Maps
 Maps store elements in the form of key value pairs.if the key is provided then its corresponding value can be obtained.Keys should be unique values.
 

Retrieving elements from Collections
for-each loop
Iterator inteface
ListIterator interface
Enumerator interface

for(variable:collection-object)
{
}
variable - each element of the collection-object.

Iterator is an Interface that contains methods to retrive the elementts one by one from a collection.
Methods 3
1.boolean hasNext();
2.element next();
3.void remove();

ListInterface is an interface that contains methods to retrive the elements from a collectionobject.
both in forward,backward directions.
Methods 5
1.boolean hasNext();
2.boolean hasPrevious();
3.element next();
4.element previous();
5.void remove();

Enumerator interface is useful to retrive the elements like the iterator.
Methods 2
1.booleans hasMoreElements();
2.element nextElement();


-----------------------------------------------------------
HashSet represents a set of elements(objects).It does not guarantee the order of elements.Also it does not allow the duplicates elements to be stored.

HashSet<T> T represents the genric type parameter which type of elements are being stored.

HashSet<String> hs = new HashSet<>();
Mthods
1.boolean add(obj);
2.boolean remove(obj);
3.void clear();
4.booleans contains()
5.boolean isEmpty();
6.int size();
Programme:
//package
import java.util.*;
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


-----------------------------------------------------------------------------------------
ArrayList 
An ArrayList is like an array. It is not synchronized.more than one thread acts simultaneously on the ArrayList object.that results may be incorrect in some cases.
ArrayList<String> arl = new ArrayList<>();

Methods
1.boolean add(element obj);
2.void add(int position,element obj);
3.element remove(int position);
4.boolean remove(Obect obj);
5.void clear();
6.element set(int position,element obj);
7.boolean contains(Object obj);
8.element get(int position);
9.int indexOf(Object obj);
10.int lastIndexOf(Object obj);
11.int size();
12.Object[] toArray();

programme:
class ArrayListDemo
{
		public static void main(String[] args)
		{
			ArrayList<String> al = new ArrayList<>();
			
			ar.add("Apple");
			ar.add("Mango");
			ar.add("Grapes");
			ar.add("Guava");
			ar.add("Guava");
			
			System.out.println("Contents View : "+ar);
			
			ar.remove(3);
			ar.remove("Apple");
			
			System.out.println("Contents View after remove : "+ar);
			
			int sizeofArrayList = ar.size();
			System.out.println("ArrayList Size : "+ar);
			
			Iterator it = ar.iterator(); 
			while(it.hasNext())
			{				
				System.out.println(it.next());
			}
			
		}

}

-------------------------------------------------------------------------------------------------------
HashMap 
HashMap is a collection that stores elements in the form key and value pairs.if the key is provided then its corresponding value can be obtained.Keys should be unique values

HashMap<K,V> 
HashMap<String,Integer> hm = new HashMap<>();

Methods
1.value put(key,value);
2.value get(Object key);
3.Set<K> keySet();
4.Collection<V> values();
5.value remove(Object key);
6.void clear();
7.boolean isEmpty();
8.int size();

programme :

class HashMapDemo
{
		public static void main(String[] args) throws IOException
		{
			HashMap<String,Long> hm = new HashMap<>();
			
			String name,str;
			Long phno;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true)// infinite loop;
			{
			
				System.out.println("1 Enter Phone entires");
				System.out.println("2 Lookup in the Book");
				System.out.println("3 Display Names in the Book");
				System.out.println("4 Exit");
				
				System.out.print("Your Choice : ");
				int n = Integer.parseInt(br.readLine());
				
				switch(n)
				{
					case 1 : System.out.println("Enter Name: ");
							 name = br.readLine();
							 System.out.println("Enter Phone: ");
							 str = br.readLine();
							 phno = new Long(str);
							 hm.put(name,phno);
							 break;
					
					case 2 : System.out.println("Enter Name:");
							 name = br.readLine();
							 name = name.trim();
							 phno = hm.get(name);
							 System.out.println("Phno : "+phno);
							 break;
					case 3 : Set<String> set = new HashSet<String>();
							 set = hm.keySet();
							 System.out.println(set);
							 break;
					case 4 : return;
							 
				}
				
			
			}
			
		
		}
}
Collections.txt
Displaying Collections.txt.
	 */
}
