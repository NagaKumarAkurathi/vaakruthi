package com.vaakruthi.strings;

import java.util.Scanner;

public class VowelsPresentInAString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String :");
	String s = sc.nextLine();
	for(int i=0;i<=s.length()-1;i++)
	{
		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
		{
			System.out.println(s.charAt(i));
		}
	}
	
}
}
