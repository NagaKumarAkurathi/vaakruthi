package com.vaakruthi.stringtokenizer;

import java.util.StringTokenizer;
/*
 * StringTokenizer
This class is useful to break the string into pieces, called tokens.These tokens are then stored 
in the StringTokenizer object from where they can be retrived.

StringTokenizer st = new StringTokenizer(str,"delimeter");

int countTokens()
boolean hasMoreTokens()
String nextToken()
 */
public class StringTokenizerDemo {
	public static void main(String[] args) {
		String str = "He is a gentle man";
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.println("The tokens are ");
		while(st.hasMoreTokens())
		{
			String one = st.nextToken();
			System.out.println(one);
		}
	}
}
