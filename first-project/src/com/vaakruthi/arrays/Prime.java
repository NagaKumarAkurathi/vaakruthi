package com.vaakruthi.arrays;

public class Prime {
public static void main(String[] args) {
	int p=4;
	int count=0;
	for(int i=1;i<=p;i++)
	{
		if(p%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println("It is a Prime number");
	}
	else {
		System.out.println("It is a not a prime number");
	}
}
}
