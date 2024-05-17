package com.vaakruthi.collections;
/*
 * Map 
Map is an interface in collection.
Maps store elements in the form of key and value pairs.
If the key is provided then it's corresponding value can be obtained.
The keys should have unique values.
Only one null value is allowed in Key.

Map<K,V>

HashMap Class.
It satisfies all the point's of the Map interface.
HashMap is not synchronized.
HashMap<K,V> 
K represents Key
V represents Value.

HashMap<String,Integer> hm = new HashMap<String,Integer>();

Defalut capacity of HashMap will be 16 and load factor as 0.75

HashMap Methods.
value put(key,value) -> This method stores key value pair into the HashMap.
value get(Object key) -> This method returns the corresponding value when key is given.if the key does not have a value associated with it, then it returns null.
Set<K> keySet() -> This method when applied on a HashMap  converts into Set where only keys will be stored.
Collection<V> values() -> This method when applied on HashMap object returns all the values of the HashMap into the Collection object.
value remove(Object key)->This method removes all the key-value pair from the map.
void clear() -> This method removes all the key-value pairs from the map.
boolean isEmpty() -> This method returns true if there are no key-value pairs int the HashMap.
int size() -> This method returns the number of key-value pairs in the HashMap.

 */
import java.util.HashMap;
/*
 * Default Capacity is -> 16
 * Load factor is -> 0.75
 */
public class HashMapMethods {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(101, "Naga");
		hm.put(102, "Kumar");
		hm.put(103, "Sai");
		hm.put(104, "kumar");
		System.out.println("The HashMap keys and values is :"+hm);
		System.out.println("Key in the set form :"+hm.keySet());
		System.out.println("The values in the collection form :"+hm.values());
		System.out.println("The containsKey() is :"+hm.containsKey(101));
		System.out.println("The containsValue() is:"+hm.containsValue("Naga"));
		System.out.println("The remove() is: "+hm.remove(104));
		System.out.println("The HashMap keys and values is :"+hm);
		System.out.println("The repalce(Object key,Object value) is :"+hm.replace(103, "Phani"));
		System.out.println("After repalcing HashMap values and keys is :"+hm);
		System.out.println("The size of the HashMap is :"+hm.size());
		System.out.println("The getKey() in HashMap is :"+hm.get(101));
		System.out.println("The entrySet() in HashMap is :"+hm.entrySet());
		hm.putAll(hm);
		System.out.println("After using putAll(Object o) is :"+hm);
	}
}
