package com.day3;

public class Car {

	String color = "Black"; // instance
	static String brand = "Benz"; // static
	double price = 1000000.0; // instance

	static void start() {
		System.out.println("car starts");
	}

	void stop() {
		System.out.println("car stops");
	}

	public static void main(String[] args) {
		boolean isAutomatic = true; // local

		Car c = new Car(); // syntax of an object creation

		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(brand);
		System.out.println(isAutomatic);

		c.stop();

		Car.start();

	}

}
