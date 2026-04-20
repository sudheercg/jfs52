package com.codegnan.exceptionhandling;

public class Demo04 {

	public static void main(String[] args) {

		//nested try blocks 
		//outer try
		try {
			int[] arr = { 10, 20, 30 };
			System.out.println(arr[3]);
			//inner try block
			try {
				int a = 10;
				int b = 0;
				int result = a / b;
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println("code from  outer tryblock");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program ends");

	}

}
