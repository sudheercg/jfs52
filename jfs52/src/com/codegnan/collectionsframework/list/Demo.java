package com.codegnan.collectionsframework.list;

import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) {
		
		Integer intArray[] = new Integer[3];
		//intArray[0]="hello";
		intArray[1]=200;
		intArray[2]=300;
		
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(20);
		intList.add(10);
		intList.add(null);
		//intList.add(20);
		//intList.add(true);
		//intList.add(20000.2344);
		
		
		
		for(Integer i : intList) {
			System.out.println(i);
		}
		
		System.out.println(intList.get(0));
		
		
		
		
		
		
		
	}
	

}
