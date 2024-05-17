package com.vaakruthi.strings;

public class StringIntoCharArray {
public static void main(String[] args) {
	String str = "hello";
//	char ch []  = new char[str.length()];
//	for(int i=0;i<=ch.length-1;i++)
//	{
//		ch[i]=str.charAt(i);
//	}
//	for(int i=0;i<=ch.length-1;i++)
//	{
//	    System.out.print(ch[i]);
//	}
	char ch [] = str.toCharArray();
	for(int i=0;i<=ch.length-1;i++)
	{
		System.out.print(ch[i]);
	}
}
}
