package com.codegnan.collectionsframework.set;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<String> fruitSet = new HashSet<>();
		
		fruitSet.add("Apple");//adds an element in the set.
		fruitSet.add("Banana");
		fruitSet.add("Cherry");
		fruitSet.add(null);
		fruitSet.add("Apple");
		
		System.out.println(fruitSet);
		
		for(String fruit: fruitSet) {
			System.out.println(fruit);
		}
		
		fruitSet.remove("Banana");//removes an element from the set
		System.out.println(fruitSet);
		
		fruitSet.clear();//clears all the set.
		
		fruitSet.isEmpty(); //if set is empty it returns true, else false
		
		
		
	}

}
