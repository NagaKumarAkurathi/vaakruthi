package com.vaakruthi.arrays;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int [] a= {10,20,15,50};
		int largest=a[0];
		int secondLargest =a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>largest)
			{
				secondLargest=largest;
				largest = a[i];
			}
			else if(a[i]>secondLargest && a[i]!=largest)
			{
				secondLargest = a[i];
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
		//sort the array in descending order
		Arrays.sort(a);
		//access the second largest element
		//secondLargest=a[a.length-2];
		System.out.println("Second Largest array element :"+(a[a.length-2]));
		
	}
}
