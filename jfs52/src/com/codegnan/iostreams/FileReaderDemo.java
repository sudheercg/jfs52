package com.codegnan.iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		//  to read the text from the file
		FileReader reader = null;
		try {
			 reader= new FileReader("fileWriter.txt");
			System.out.println("Reading the file content");
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		

		
	}

}
