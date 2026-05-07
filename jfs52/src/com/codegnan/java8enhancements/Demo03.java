package com.codegnan.java8enhancements;

import com.codegnan.java8enhancements.methodreferences.MessageService;
import com.codegnan.java8enhancements.methodreferences.MyPrinter;

public class Demo03 {
	
	public static void main(String[] args) {
	
		MessageService service = new MessageService(); 
		
		MyPrinter mp = service::display;
		
		mp.print("Codegnan");
		
		
		MyPrinter mp1 = MessageService::displayStatic;
		mp1.print("Hello Codegnan!");
		
	}

}
