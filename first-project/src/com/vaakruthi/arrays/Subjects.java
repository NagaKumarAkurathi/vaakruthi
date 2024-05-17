package com.vaakruthi.arrays;

import java.util.Scanner;

public class Subjects {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("How many Subjects :");
	int size = sc.nextInt();
	int a [] = new int[size];
	
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println("Enter marks:");
		a[i] = sc.nextInt();
	}
	int totalMarks = 0;
	for(int i=0;i<=a.length-1;i++)
	{
		totalMarks+=a[i];
	}
	System.out.println("Total Marks :"+totalMarks);
	System.out.println("Percentage is :"+(totalMarks/size));
}
}
