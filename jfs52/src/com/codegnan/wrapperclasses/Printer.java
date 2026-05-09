package com.codegnan.wrapperclasses;

//Generic Printer class
public class Printer<T> {
	
	T t;
	
	Printer(T t){
		this.t=t;
	}
	
	public void print() {
		System.out.println(t);
	}
	

}
