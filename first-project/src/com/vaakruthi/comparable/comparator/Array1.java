package com.vaakruthi.comparable.comparator;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Comparator 
 java.util package offers an interface called Comparator that is useful to impose a total ordering on collection of elements.
 It can be used to sort the elements of array into ascending or decending order.
 
 interface Comparator<T>
 
 class Ascend implements Comparator<Integer>
 
 The Comparator interface contains a method compare() that should be implemented in such a way that the two objects should be compared using the compareTo() methods.
 
 public int compare(Integer i1,Integer i2)
 {
	return i1.compareTo(i2);
 }
 
 Arrays.sort(arr,new Ascend());
 Arrays.sort(arr,new Descend());
 */
public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Elements :");
		int size = sc.nextInt();
		
		Integer arr [] = new Integer[size];
		System.out.println("Enter Elements one by one :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,new Ascending());
		System.out.println("\nSorted in Ascending order:");
		
        display(arr);
		
		Arrays.sort(arr,new Descending());
		System.out.println("\nSorted in Descending order:");
		display(arr);
	}
	static void display(Integer arr[])
	{
		for(Integer i : arr)
		System.out.println(i+"\t");
	}
}
