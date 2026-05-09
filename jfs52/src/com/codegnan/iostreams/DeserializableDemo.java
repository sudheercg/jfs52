package com.codegnan.iostreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializableDemo {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("employee.ser");
				BufferedInputStream bis =new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis);
				){
			            Employee employee = (Employee) ois.readObject();
			            System.out.println("Employee object has been read from employee.ser");
			            System.out.println(employee);
			               
		         } catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		
	}

}
