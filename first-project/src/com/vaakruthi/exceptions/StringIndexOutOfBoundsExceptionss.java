package com.vaakruthi.exceptions;

import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionss {
public static void main(String[] args) {
//	String str = "hai";
//	System.out.println(str.charAt(2));
//	System.out.println(str.charAt(4));
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	String s = sc.next();
	System.out.println("Enter the index from 0 to "+(s.length()-1));
	int i = sc.nextInt();
	char fetchedChar;
	while(true)
	{
		try {
			fetchedChar = s.charAt(i);
			System.out.println(fetchedChar);
			break;
		}
		catch(StringIndexOutOfBoundsException si)
		{
			System.out.println("Re-Enter the index from 0 to "+(s.length()-1));
			i=sc.nextInt();
		}
	}
	
}
}
