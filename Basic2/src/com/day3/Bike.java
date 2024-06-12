package com.day3;

public class Bike {

	String brand = "pulsar";

	public static void main(String[] args) {
		Bike b = new Bike();
		System.out.println(b.brand);

		Car.start(); // static method call
		Car c = new Car();
		c.stop(); // instance method call
	}

}
