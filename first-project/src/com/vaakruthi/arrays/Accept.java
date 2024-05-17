package com.vaakruthi.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Accept {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Name,Age,Salary:");
	String str = br.readLine();
	StringTokenizer st = new StringTokenizer(str,",");
	String name = st.nextToken();
	String age = st.nextToken();
	String salary = st.nextToken();
	name = name.trim();
	age = age.trim();
	salary = salary.trim();
	int ageInt = Integer.parseInt(age);
	float salaryFloat = Float.parseFloat(salary);
	
	System.out.println("Name :"+name);
	System.out.println("Age :"+age);
	System.out.println("Salary:"+salaryFloat);
}
}
