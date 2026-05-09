package com.codegnan.exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	
	public static void main(String[] args) {
		
	
		
		
		
		try {
			FileWriter writer = new FileWriter("jfs52.txt");
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Please check whether the file is present of not");
		}
	}

}
