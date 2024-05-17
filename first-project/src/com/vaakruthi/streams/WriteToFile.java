package com.vaakruthi.streams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("myfile.txt");
			fw.write("Java is the prominent programming language of the millenium.I will read the data from the file");
			fw.close();
			System.out.println("Succesfully wrote to the file.");
		} catch (IOException e) {
			System.err.println("An Eroor occurred..");
			e.printStackTrace();
		}
	}
}
