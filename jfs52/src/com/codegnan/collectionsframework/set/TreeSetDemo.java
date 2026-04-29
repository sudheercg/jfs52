package com.codegnan.collectionsframework.set;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<String> fruitSet = new TreeSet<>();
		
		fruitSet.add("Mango");//adds an element in the set.
		fruitSet.add("Apple");
		fruitSet.add("Kiwi");
		//fruitSet.add(null);
		fruitSet.add("Banana");
		
		//contains()
		
		System.out.println("Is Mango present? : "+ fruitSet.contains("Mango"));
		
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
