package com.codegnan.wrapperclasses;

public class DemoPrinter {
	
	public static void main(String[] args) {
		/*
		IntegerPrinter i = new IntegerPrinter(10);
		i.print();
		
		StringPrinter s = new StringPrinter("Hello");
		s.print();
		
		DoublePrinter d = new DoublePrinter(30000.34);
		d.print();
		
		*/
		
		//Generic type
		Printer<String> p = new Printer<>("Hello");
		p.print();
		
		Printer<Integer> intPrinter = new Printer<>(2345);
		
		Printer<Double>  doublePrinter = new Printer<>(20000.23);
		
	
		
	}

}
