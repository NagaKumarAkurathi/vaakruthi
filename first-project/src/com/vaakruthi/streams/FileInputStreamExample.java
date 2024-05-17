package com.vaakruthi.streams;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * FileInputStream
  It is useful to read the data from a file in the form of sequence of bytes.
 */
public class FileInputStreamExample {
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin = new FileInputStream("myfile.txt");
		
		System.out.println("File Contents:");
		
		int ch;
		
		while((ch = fin.read()) != -1)
		{
			System.out.println((char)ch);
		}
		fin.close();
	}

}

