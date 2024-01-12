package org.practice;

public class Abstraction {

	
		 public static void main(String[] args) {
		     // Creating objects of concrete classes
		     Circle circle = new Circle(5.0);
		     Rectangle rectangle = new Rectangle(4.0, 6.0);

		     // Using abstraction to treat both objects as shapes
		     Shape shape1 = circle;
		     Shape shape2 = rectangle;

		     // Calling common method for all shapes
		     shape1.displayInfo();
		     shape2.displayInfo();

		     // Calling abstract method to calculate area (polymorphism)
		     System.out.println("Area of the circle: " + shape1.calculateArea());
		     System.out.println("Area of the rectangle: " + shape2.calculateArea());

		     // Accessing additional methods specific to each subclass
		     ((Circle) shape1).displayCircleInfo();
		     ((Rectangle) shape2).displayRectangleInfo();
		 }
		}


	

