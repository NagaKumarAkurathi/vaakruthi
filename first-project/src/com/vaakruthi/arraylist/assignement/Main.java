package com.vaakruthi.arraylist.assignement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter array size:");
		//int size = sc.nextInt();
		//int arr [] = new int[size];
		//System.out.println("Enter employee details (ID and Name and Salary), enter -1 to finish:");
		//while (true) {
        //  System.out.print("Enter employee ID: ");
        //    int id = sc.nextInt();
        //    if (id == -1) {
        //       break;            }

        //    System.out.print("Enter employee name: ");
        //    String name = sc.next();
            
        //    System.out.println("Enter employee address: ");
        //    String address = sc.next();
		//}
		//System.out.println("Enter employee details one by one :");
		//for(int i=0;i<=arr.length-1;i++) {
		//	arr[i] = sc.nextInt();
		//}
		    ArrayList<Employee> a = new ArrayList<Employee>();
		    a.add(new Employee(101, "Naga", "Machilipatnam"));
		    a.add(new Employee(102, "Kumar", "Rayavaram"));
		    a.add(new Employee(103, "Sai", "Mangalagiri"));
		    System.out.print("enter the id number of the employee to search :");
            int searchId = sc.nextInt();
    		Employee foundEmployee = display(a, searchId);
    		
    		if(foundEmployee != null) {
    			System.out.println("Employee found :");
    			System.out.println("ID:"+foundEmployee.getId());
    			System.out.println("Name:"+foundEmployee.getName());
    			System.out.println("Address:"+foundEmployee.getAddress());
    		}
    		else {
    			System.err.println("Employee with ID "+searchId+" not found.");
    		}
	}
		
	public static Employee display(ArrayList<Employee> e1 ,int id) {
		for(Employee e : e1) {
			if(e.getId() == id) {
				return e;
			}
		}
		return null;
		}
	}
