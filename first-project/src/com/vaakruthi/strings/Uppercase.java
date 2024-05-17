package com.vaakruthi.strings;

public class Uppercase {
	public static void main(String[] args) {
		String s1="hello";
		String s2="";
		//String s3=s1.toUpperCase();
		//System.out.println(s3);
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c = s1.charAt(i);
			if(c>='a' && c<='z') {
				c=(char) (c-32);
			}
			s2+=c;
		}
		System.out.println(s2);
		
	}
}
