package com.vaakruthi.oops;
/**
 * Method OverLoading:same method signature and different list of aruguments
 */
public class CompileTimePolymorphism {
	public static void main(String[] args) {
		Addition.sum(10, 20);
		Addition.sum(10, 1.0);
		Addition.sum(1.0, 2);
		Addition.mul(2, 2);
	}
}
class Addition{
	public static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void sum(int a,double b)
	{
		System.out.println(a+b);
	}
	public static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void sum(double a,int b)
	{
		System.out.println(a+b);
	}
}
