package org.practice;

public class Encapsulation {

	
	    public static void main(String[] args) {
	        // Creating an instance of the Car class
	        Car myCar = new Car("Toyota Camry", 2022);

	        // Accessing the state of the car through getter methods
	        System.out.println("Model: " + myCar.getModel());
	        System.out.println("Year: " + myCar.getYear());
	        System.out.println("Fuel Level: " + myCar.getFuelLevel());

	        // Performing actions on the car using public methods
	        myCar.refuel(20.0);
	        myCar.drive(100.0);
	    }
	}

	

