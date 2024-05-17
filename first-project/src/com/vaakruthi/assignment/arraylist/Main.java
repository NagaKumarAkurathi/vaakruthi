package com.vaakruthi.assignment.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * print with duplicates
 * print only duplicates and with index
 * use the Employee object
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> emp = new ArrayList<>();
		
		System.out.println("Enter employee details (ID and Name and Salary), enter -1 to finish:");
		while (true) {
            System.out.print("Enter employee ID: ");
            int id = sc.nextInt();
            if (id == -1) {
                break;
            }

            System.out.print("Enter employee name: ");
            String name = sc.next();
            
            System.out.print("Enter employee salary: ");
            double salary = sc.nextDouble();
            
            
            emp.add(new Employee(id, name,salary));
           
        }
		System.out.println("Duplicate employees:");
        for(int i=0;i<emp.size();i++)
        {
        	for(int j=i+1;j<emp.size();j++)
        	{
        		if((emp.get(i).id == emp.get(j).id) && (emp.get(i).name.equals (emp.get(j).name)) && (emp.get(i).salary == emp.get(j).salary)) {
        			System.out.println("Duplicates at index "+i+" and "+j+" : "+emp.get(i));
        		}
        	}
        }
	}
}
