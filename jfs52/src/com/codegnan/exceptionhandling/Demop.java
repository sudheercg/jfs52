package com.codegnan.exceptionhandling;

public class Demop {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			int result = 10 / 0;
			int arr[] = new int[3];
			arr[3] = 30;
			System.out.println("2");

		}catch(ArithmeticException e) {
			System.out.println("3");
		}
		finally {
			System.out.println("in finally");
		}
		
		
	}
}
