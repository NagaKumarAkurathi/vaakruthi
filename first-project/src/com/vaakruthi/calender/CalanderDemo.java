package com.vaakruthi.calender;

import java.util.Calendar;
/*
 * Calendar 
It helps in knowing the system date and time.
It helps in storing a date and time value so that it can be transported to some other applications.

Clandar c1=  Calendar.getInstance();

int get(int field)
  Calendar.DATE
  Calendar.MONTH
  Calendar.YEAR
  Calendar.HOUR
  Calendar.MINUTE
  Calendar.SECOND
  Calendar.AM_PM
  
void set(int feild,int value)

String toString()
boolean equals(Object obj)
 */
public class CalanderDemo {
	public static void main(String[] args)
	{
		Calendar c1 = Calendar.getInstance();
		System.out.println("Current Date:");
		int dd = c1.get(Calendar.DATE);
		int mm = c1.get(Calendar.MONTH);
		++mm;
		int yy = c1.get(Calendar.YEAR);
		System.out.println(dd+"-"+mm+"-"+yy);
		
		int am = c1.get(Calendar.AM);
		
		int pm = c1.get(Calendar.PM);
		
		int hour = c1.get(Calendar.HOUR);
		int minute = c1.get(Calendar.MINUTE);
		int am_pm = c1.get(Calendar.AM_PM);
		String ampm;
		if(am_pm == 0) {
			ampm = "AM";
		}else {
			ampm = "PM";
		}
		System.out.println("Current Time is : "+hour+":"+minute+" "+ampm);
		
	}
}
