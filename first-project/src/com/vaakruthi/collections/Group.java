package com.vaakruthi.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Group {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Employee [] arr = new Employee[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter ID:");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter NAME:");
			String name = br.readLine();
			arr[i] = new Employee(id, name);
		}
		System.out.println("The Employee Data is:");
		for(int i=0;i<5;i++)
		{
			arr[i].display();
		}
	}
}
