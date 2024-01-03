package org.practice;

public class Car {
    // Private variables (attributes) to store the state of the car
    private String model;
    private int year;
    private double fuelLevel;

    // Constructor to initialize the car's state
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.fuelLevel = 0.0; // Initializing fuel level to zero
    }

    // Getter method to access the model of the car (read-only)
    public String getModel() {
        return model;
    }

    // Getter method to access the year of the car (read-only)
    public int getYear() {
        return year;
    }

    // Getter method to access the fuel level of the car (read-only)
    public double getFuelLevel() {
        return fuelLevel;
    }

    // Method to simulate refueling the car
    public void refuel(double amount) {
        if (amount > 0) {
            fuelLevel += amount;
            System.out.println("Car refueled. New fuel level: " + fuelLevel);
        } else {
            System.out.println("Invalid fuel amount for refueling.");
        }
    }

    // Method to simulate driving the car
    public void drive(double distance) {
        double fuelConsumed = distance / 20.0; // Assuming 20 miles per gallon
        if (fuelConsumed <= fuelLevel) {
            fuelLevel -= fuelConsumed;
            System.out.println("Car driven for " + distance + " miles. Remaining fuel: " + fuelLevel);
        } else {
            System.out.println("Not enough fuel to drive that distance.");
        }
    }
}


