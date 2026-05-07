package com.codegnan.iostreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		/*
		 * //FileWriter(File f) File file = new File("filewriter2.txt"); FileWriter
		 * writer1 = new FileWriter(file);
		 */
		//FileWriter(String filename)
		FileWriter writer = new FileWriter("filewriter.txt");
		writer.write("India is great");
		writer.write("\n");//new line character
		writer.write("India is a big country");
		writer.write("\n");//new line character
        char[] charArray = {'a','b','c','d','e'};
        
		writer.write(charArray); 
		writer.write("\n");//new line character
		char myChar ='A';
        writer.write(myChar);
        
	
		writer.flush();
				
		
		
		
	}
	

}
