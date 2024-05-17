package com.vaakruthi.streams;

import java.io.File;

public class FileInformation {
	public static void main(String[] args) {
		File fObj = new File("myfile.txt");
		System.out.println("Number of Characters present in a File is :"+fObj.length());
		if(fObj.exists()) {
			System.out.println("File name :"+fObj.getName());
			System.out.println("Absolut path :"+fObj.getAbsolutePath());
			System.out.println("Writeable :"+fObj.canWrite());
			System.out.println("Readable :"+fObj.canRead());
			System.out.println("File size in bytes :"+fObj.length());
		}
		else {
			System.err.println("File doesn't exits.");
		}
	}
}
