package org.practice;

//Abstract class representing a shape
abstract class Shape {
 // Abstract method to calculate area (to be implemented by subclasses)
 public abstract double calculateArea();

 // Common method for all shapes to display information
 public void displayInfo() {
     System.out.println("This is a shape.");
 }
}

//Concrete subclass representing a circle
class Circle extends Shape {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implementation of the abstract method for calculating the area of a circle
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 // Additional method specific to circles
 public void displayCircleInfo() {
     System.out.println("This is a circle with radius " + radius);
 }
}

//Concrete subclass representing a rectangle
class Rectangle extends Shape {
 private double length;
 private double width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implementation of the abstract method for calculating the area of a rectangle
 @Override
 public double calculateArea() {
     return length * width;
 }

 // Additional method specific to rectangles
 public void displayRectangleInfo() {
     System.out.println("This is a rectangle with length " + length + " and width " + width);
 }
}

