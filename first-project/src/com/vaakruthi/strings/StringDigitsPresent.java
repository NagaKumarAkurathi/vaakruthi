package com.vaakruthi.strings;

public class StringDigitsPresent {
	public static void main(String[] args) {
		String s ="123hi45";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				sum+=(s.charAt(i)-'0');
			}
		}
		System.out.println(sum);
	}
}
