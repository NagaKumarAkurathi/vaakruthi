package com.vaakruthi.strings;

public class ReverseString {
public static void main(String[] args) {
	String str = "Hello";
	String rev = "";
//	for(int i=str.length()-1;i>=0 ;i--)
//	{
//		System.out.print(str.charAt(i));
//	}
	for(int i=str.length()-1;i>=0;i--)
	{
		rev+=str.charAt(i);
	}
	System.out.println(rev);
}
}
