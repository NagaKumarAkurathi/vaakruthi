package com.vaakruthi.arrays;

public class ArraysNotes {
	/*
	 * 
Conversation opened. 1 read message.

Skip to content
Using Gmail with screen readers
44 of 52
Class 3
Inbox

Tulasi Prasad <tulasi.prasad254@gmail.com>
Attachments
Wed, Feb 28, 9:07 AM
to charan74493, devi, kandulavenkatesh828, Karthik, lakshmi, m, chaitanya, me, Pujitha, sirisha.dandu25

Notes
 2 Attachments
  •  Scanned by Gmail
Arrays
---
int rol1;
int rol2;
.
.
.
.
.
An array represents a group of elements of same data type.It can store a group of elements.
We can store group if int vlaues or a group of float vlaues or group of strings in the array.
But we cannot store some int values and some float values in the array.
Single Dimensional Arrays
Multi Dimensional Arrays

Single Dimensional Arrays
 int marks[] = {50,60,55,67,70};
  
  marks[0] = 50
  marks[1] = 60
  marks[2] = 55
  marks[3] = 67
  marks[4] = 70
  
int marks[] = new int[5];

for(int i=0;i<5;i++)
{
	marks[i] = Integer.parseInt(br.readLine());
}

total = total  + marks[i];
eg:
class arraytotalDynamic
{
		public static void main(String[] args)
		{
			int marks[] = {50,70,60,80,90};
			int total =0;
			for(int i=0;i<5;i++)
			{
				total = total + marks[i];
			}
			System.out.println("Total Sum :"+total);
		}

}

How many subjects? 5
Enter Marks : 50
Enter Marks : 60
Enter Marks : 70
Enter Marks : 80
Enter Marks : 90
Total Marks =?
Percentage = ?

arrayname.length
-------------------------------------------------
Two Dimentional Arrays
int marks[][] ={{50,70,60,80,90},
				{50,60,55,67,70},
				{50,60,90,67,70}};
				
				
				50 70 60 80 90
				50 60 55 67 70
				50 60 90 67 70
i=0,0
marks[n][k] = 50
marks[0][1] = 70
..

for(int i=0;i<n;i++)
{
	for(int j=0;j<k;j++)
	{
		marks[i][j] = Integer.parseInt(br.readLine());
	}
}
------------------------------------------------------------------------------------------------

Exceptions
Arrays.txt
Displaying Arrays.txt.
	 */
}
