package com.vaakruthi.comparablee;

public class Movie implements Comparable<Movie>{
	private double rating;
	private String name;
	private int year;
	
	public Movie(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	
	public double getRating() {
		return rating;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return this.year - m.year;
	}

}
