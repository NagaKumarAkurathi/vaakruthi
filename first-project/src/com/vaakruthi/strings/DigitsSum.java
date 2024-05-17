package com.vaakruthi.strings;

import java.util.Scanner;

public class DigitsSum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String :");
	String s = sc.nextLine();
	int sum=0;
//	for(int i=0;i<=s.length()-1;i++)
//	{
//		if(s.charAt(i)>='0' && s.charAt(i)<='9')
//		{
//			sum+=s.charAt(i)-'0';
//		}
//	}
	for(int i=0;i<=s.length()-1;i++)
	{
		if(Character.isDigit(s.charAt(i))) {
			sum+=Character.getNumericValue(s.charAt(i));
		}
	}
	System.out.println(sum);
}
}
