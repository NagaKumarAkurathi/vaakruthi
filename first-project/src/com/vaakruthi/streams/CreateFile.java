package com.vaakruthi.streams;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws FileNotFoundException,IOException {
		DataInputStream dfs = new DataInputStream(System.in);
		
		FileOutputStream fos = new FileOutputStream("myfile.txt");
		
		System.out.println("Enter text(@ at the end):");
		
		char ch;
		while((ch =(char) dfs.read()) != '@') {
			fos.write(ch);
		}
		fos.close();
	}
}
