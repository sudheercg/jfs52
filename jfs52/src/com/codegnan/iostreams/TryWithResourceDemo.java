package com.codegnan.iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceDemo {

	public static void main(String[] args) {

		// to read the text from the file
		try (FileReader reader = new FileReader("fileWriter.txt")) {

			// System.out.println((char)reader.read());

			System.out.println("Reading the file content");
			int character;
			while ((character = reader.read()) != -1) {

				System.out.print((char) character);
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
