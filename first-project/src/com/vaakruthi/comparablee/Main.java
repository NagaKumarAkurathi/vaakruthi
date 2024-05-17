package com.vaakruthi.comparablee;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Movie> a = new ArrayList<Movie>();
		a.add(new Movie(8.3,"Force Awakens",2015));
		a.add(new Movie(8.7,"Star Wars", 1977));
        a.add(new Movie(8.8,"Empire Strikes Back", 1980));
        a.add(new Movie(8.4,"Return of the Jedi", 1983));
        
        Collections.sort(a);

        System.out.println("Movies after sorting : ");
        for (Movie movie: a)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
	}
}
