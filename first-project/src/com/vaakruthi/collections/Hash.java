package com.vaakruthi.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash {
public static void main(String[] args) {
	//Doesn't follow insertion order
	Set<String> hashSet = new HashSet<String>();
	hashSet.add("banana");
	hashSet.add("apple");
	hashSet.add("orange");
	System.out.println("HASH SET VALUES :"+hashSet);
	//Doesn't follow insertion order but sorting order
	Set<String> treeSet = new TreeSet<String>();
	treeSet.add("banana");
	treeSet.add("apple");
	treeSet.add("orange");
	System.out.println("TREE SET VALUES :"+treeSet);
	//LinkedHashSet follows insertion order...
	Set<String> linkedHashSet = new LinkedHashSet<String>();
	linkedHashSet.add("banana");
	linkedHashSet.add("apple");
	linkedHashSet.add("orange");
	System.out.println("LINKED HASH SET VALUES :"+linkedHashSet);
}
}
