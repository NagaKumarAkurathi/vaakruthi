package com.vaakruthi.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 * Arrays Class
 Arrays class provides methods to perform certain operations pn any one dimentional array.All the methods of the Arrays class static.
 
 static void sort(array) : sorts the elements into ascending order.Internally it uses the QucikSort algorithm.
 
 static void sort(array,int start,int end) sorts the elements in the range from start to end within array in ascending order.
 
 static int binarySearch(array,element) searches for an element in the array and returns its position number.if the element is not found in the array it returns a negative value.Internally it uses BinarySearch algorithm.
 
 static boolean equals(array1,array2) : return true if two arrays are equal otherwise false.
 
 static void fill(array,value) : fills the array with specified value.
 */
class ArraysDemo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[5];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print("Enter an integer:");
			arr[i] = Integer.parseInt(br.readLine());	
		}
		//display
		display(arr);
		
		Arrays.sort(arr);
		System.out.print("Sorted Array:");
		
		display(arr);
		System.out.print("Search element?:");
		int element = Integer.parseInt(br.readLine());
		int index = Arrays.binarySearch(arr,element);
		if(index < 0)
		{
			System.out.print("Element Not Found.");
		}
		else
		{
			System.out.print("Element Found at Location."+(index+1));
		}	
	}
	public static void display(int arr[])
	{
		for(int a:arr)
		{
			System.out.println(a);
		}
	}	
}
