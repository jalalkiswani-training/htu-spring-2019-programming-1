package edu.htu.programming.lesson8;

public class Car {
	// instance variables: attributes
	String brand;
	int year;

	// methods: actions
	public void move() {
		System.out.println("Car " + brand + " of year " + year + " is moving...");
	}

	public void stop() {
		System.out.println("Car "+brand+" of year "+year+" is stopping...");
	}

}
