package com.codegnan.java8enhancements.predefinedfi;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<String, String> isFirstCharEqual =

				(str1, str2) -> {
					char char1 = str1.charAt(0);
					char char2 = str2.charAt(0);
					return char1 == char2;

				};

		String str1 = "Apple";
		String str2 = "Apricot";
		String str3 = "Banana";

		System.out.println(isFirstCharEqual.test(str1, str3));

	}

}
