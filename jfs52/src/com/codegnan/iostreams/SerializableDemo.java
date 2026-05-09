package com.codegnan.iostreams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) {
		// Create a Employee object
		Employee employee = new Employee(100, "Raj", 25,"Secret");
		System.out.println("Before Serialization:");
		System.out.println(employee);

		try (FileOutputStream fos = new FileOutputStream("employee.ser");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(bos);) {

			oos.writeObject(employee);
			System.out.println("Employee Object serialized successfully");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
