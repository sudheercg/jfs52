package com.codegnan.iostreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	
	public static void main(String[] args) {
		
		try(PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"))){
			
			pw.print("Hello ");
			pw.print("Codegnan");
			
			pw.println(100);
			pw.println(43.44);
			pw.println(true);
			
			pw.printf("Course: %s, Duration: %d", "Java",100);
			
			//pw.println
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
