package com.vaakruthi.streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadToFile {
	public static void main(String[] args) {
		try {
			File f = new File("myfile.txt");
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("An error Occured ");
			//e.printStackTrace();
			//e.getMessage();
			//e.toString();
			//System.out.println(e);
		}
	}
}
