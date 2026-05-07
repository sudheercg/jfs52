package com.codegnan.iostreams;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) {
		//File(String name)
		File file = new File("javanotes.txt"); 
		
		File dir = new File("mynotes");
		
		
		try {
			//to create a directory
			dir.mkdir();
			
			//to create a file
			file.createNewFile();
			
			//exists()  to check whether the file exists or not,
			// returns boolean true if file exists else false
			System.out.println(file.exists());

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
