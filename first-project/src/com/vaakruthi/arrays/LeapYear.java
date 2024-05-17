package com.vaakruthi.arrays;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Year :");
	int year = sc.nextInt(); 
	if(year%100 == 0 && year%400 == 0)
	{
		System.out.println("It is a Leap year");
	}
	else if(year%4 == 0 && year%100 != 0) {
		System.out.println("It is a Leap year");
	}
	else {
		System.out.println("Not a leap year");
	}
	}
}
