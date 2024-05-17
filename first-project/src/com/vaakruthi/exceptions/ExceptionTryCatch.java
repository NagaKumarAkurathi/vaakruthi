package com.vaakruthi.exceptions;

import java.util.Scanner;

public class ExceptionTryCatch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number 1:");
	int n1 = sc.nextInt();
	System.out.println("Enter number 2:");
	int n2 = sc.nextInt();
	int result;
	while(true) {
	try {
		result = n1/n2;
		System.out.println(result);
		break;
		
	} catch (ArithmeticException e) {
		System.out.println(e);
		System.out.println("Re-enter number 1:");
		n1=sc.nextInt();
		System.out.println("Re-enter number 2:");
		n2=sc.nextInt();
		System.out.println("Please pass the data while running this program");	
	}
	}
}
}
