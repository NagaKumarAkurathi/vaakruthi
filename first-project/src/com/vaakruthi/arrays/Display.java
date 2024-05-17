package com.vaakruthi.arrays;

import java.util.Scanner;

public class Display {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employee id :");
	int id = sc.nextInt();
	System.out.println("Enter employee M/F :");
	char male = sc.next().charAt(0);
	System.out.println("Enter Employee name");
	String name = sc.next();
	
	System.out.println("Employee Id:"+id);
	System.out.println("Employee M/F:"+male);
	System.out.println("Employee Name:"+name);
	
}
}
