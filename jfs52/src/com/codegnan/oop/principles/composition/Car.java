package com.codegnan.oop.principles.composition;

public class Car {
	
	String carName;
	Engine engine;
	
	
	//composition
	public Car(String carName){
		this.carName =carName;
		engine= new Engine("Petrol Engine");
	}
	
	public void displayCar() {
		System.out.println("Car Name: "+carName);
		System.out.println("Engine Details: "+ engine.engineType);
	}

}
