package com.codegnan.collectionsframework.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {
	
	public static void main(String[] args) {
		
		List<String> fruitList = Arrays.asList("Banana","Apple","Kiwi","Grapes");
		
		System.out.println();
		System.out.println("Before Sorting");
		System.out.println();
		for(String fruit:fruitList) {
			System.out.println(fruit);
		}
		
		//sort the list
		Collections.sort(fruitList);
		
		System.out.println();
		System.out.println("After Sorting");
		for(String fruit:fruitList) {
			System.out.println(fruit);
		}
		
	}

}
