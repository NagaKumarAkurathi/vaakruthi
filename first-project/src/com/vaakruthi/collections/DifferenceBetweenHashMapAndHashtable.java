package com.vaakruthi.collections;

public class DifferenceBetweenHashMapAndHashtable {
/*
 * Difference between HashMap and HashTable?
HashMap objec is not synchronized by default | HashTable object is synchronized by default.
In case of a single thread, using the HashMap is faster than Hashtable | In case of multiple threads, using the Hashtable is advisable wit a single thread, Hashtable become slow.
HashMap - Iterator in the HashMap is fail-fast.this means Iterator will produce exception if concurrent updates are made to the HashMap.
Enumeration for the Hashtable is not fail-fast.This means even if concurrent updation are done to Hashtable.There will not ve any incorrect results produced by the enumeration.

Can you nake HashMap synchronized?
Yes, we can make HashMap object synchronized synchronizedMap() method.
e.g: Collections.synchronizedMap(new HashMap());
 */
}
