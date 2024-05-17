package com.vaakruthi.exceptions;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionss {
public static void main(String[] args) {
//	int [] arr = new int[3];
//	arr[0] = 5;
//	arr[1] = 10;
//	arr[2] = 20;
//	arr[3] = 30;
//	System.out.println(arr[3]);
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size ");
	int size = sc.nextInt();
	int [] a = new int[size];
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println("Enter the elements at the "+(i+1)+" memory blocks");
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the index from 0 to " +(size-1)+" to retrive");
	int i = sc.nextInt();
	while(true)
	{
		try {
			System.out.println(a[i]);
			break;
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Re-Enter the index from 0 to " +(size-1)+" to retrive");
			i=sc.nextInt();
		}
	}
}
}
