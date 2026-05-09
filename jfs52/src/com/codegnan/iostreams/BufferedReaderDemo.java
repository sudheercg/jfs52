package com.codegnan.iostreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		
		try(BufferedReader reader = 
				new BufferedReader(new FileReader("output.txt"))){
	    String line; 
	    
		while((line=reader.readLine())!=null)	{
			System.out.println(line);
		}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
