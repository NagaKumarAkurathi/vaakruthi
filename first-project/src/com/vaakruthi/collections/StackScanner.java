package com.vaakruthi.collections;

import java.util.Scanner;
import java.util.Stack;

public class StackScanner {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Stack<Integer> s = new Stack<Integer>();
	   boolean run=true;
	   int pos;
	   while(run) {
	    System.out.println("STACK OPERATIONS");
		System.out.println("1. Push an element");
		System.out.println("2. Pop an element");
		System.out.println("3. Search an element");
		System.out.println("4. Stack elements.");
		System.out.println("5. Exit");
		System.out.println("Enter your choice..");
		int ch=sc.nextInt();
		if(ch == 1) {
			System.out.println("Enter Element:");
			int ele=sc.nextInt();
			s.push(ele);
		}
		else if(ch == 2)
		{
			if(!s.isEmpty())
			{
				System.out.println("Popped element :"+s.pop());
			}
			else {
				System.out.println("Stack is empty..");
			}
		}
		else if(ch == 3) {
			System.out.println("Which element:");
			int ele=sc.nextInt();
			pos=s.search(ele);
			if(pos == -1)
			{
				System.out.println("Element not found..");
			}
			else {
				System.out.println("Element found in postion :"+pos);
			}
		}
		else if(ch == 4) {
			System.out.println("Stack Content..."+s);
		}
		else {
		System.out.println("Exit Program..");
		run=false;
		}
	}
	}
	}
