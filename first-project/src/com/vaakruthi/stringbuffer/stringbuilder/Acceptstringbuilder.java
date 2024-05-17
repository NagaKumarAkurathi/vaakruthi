package com.vaakruthi.stringbuffer.stringbuilder;

public class Acceptstringbuilder {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("Hello");
	sb.append("world");
	System.out.println(sb.toString());
	sb.insert(5, "6");
	System.out.println(sb.toString());
	sb.replace(5,6,"");
	System.out.println(sb.toString());
	sb.delete(5, 7);
	System.out.println(sb.toString());
	}
}
