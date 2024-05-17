package com.vaakruthi.arrays;
//0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
import java.util.Scanner;

public class FibonacciNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number 1:");//0
	int n1 = sc.nextInt();
	System.out.println("Enter number 2:");//1
	int n2 = sc.nextInt();
	System.out.println("Enter number 3:");//0
	int n3 = sc.nextInt();
	System.out.println(n1);
	System.out.println(n2);
	for(int i=3;i<=15;i++)
	{
		n3 = n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
}
}
