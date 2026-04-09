package com.codegnan.oop.abstraction;

public class MultipleIfaceImplDemo implements Printer,ScannerIFace {

	
	public void print() {
		System.out.println("Printing");
	}
	
	public void scan() {
		System.out.println("Scanning");
	}

	public void create() {
		System.out.println("creating");
	}
}
