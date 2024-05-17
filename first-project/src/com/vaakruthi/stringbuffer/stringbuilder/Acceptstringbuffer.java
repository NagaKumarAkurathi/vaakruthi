package com.vaakruthi.stringbuffer.stringbuilder;

public class Acceptstringbuffer {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer("Hello");
	sb.append("World");
	System.out.println(sb.toString());
	System.out.println(sb.insert(5, 'H'));
	System.out.println(sb.replace(5, 6, "W"));
	//System.out.println(sb.reverse());
	System.out.println(sb.delete(4,7));
	
	
}
}
