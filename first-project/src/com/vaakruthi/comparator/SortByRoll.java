package com.vaakruthi.comparator;

import java.util.Comparator;

public class SortByRoll implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.rollNo - s2.rollNo;
	}

}
