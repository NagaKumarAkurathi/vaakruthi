package com.vaakruthi.enumuration;
enum Days{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}
public class DisplayEnum {
	public static void main(String[] args) {
		//using values() method retrive all enum costants into all days [] array
		Days[] values = Days.values();
		for (Days days : values) {
			System.out.println(days);
		}
	}
}
