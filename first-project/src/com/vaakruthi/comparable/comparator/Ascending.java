package com.vaakruthi.comparable.comparator;

import java.util.Comparator;

public class Ascending implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		return i1.compareTo(i2);
	}

}
