package com.codegnan.strings;

public class MutableStringDemo {
	
	public static void main(String[] args) {
		
		
		//StringBuilder
		StringBuffer sb = new StringBuffer("Codegnan");
		System.out.println(sb);
		
		//concat
		//append()
		
		sb.append(" Hyderabad");
		
		System.out.println(sb);
		
		String s ="Codegnan";
		s.concat(" Hyderabad");
		System.out.println(s);
	}

}
