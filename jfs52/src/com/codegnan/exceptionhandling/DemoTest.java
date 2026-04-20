package com.codegnan.exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;

public class DemoTest {
	
	public static void main(String[] args) {
		
		FileWriter writer = null;
		try {
			writer = new FileWriter("output.txt");
			writer.write("hello");
			int result =20/0; 		
			System.out.println("In try block");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				System.out.println("finally block");
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Program completed");
		
		
		
	}

}
