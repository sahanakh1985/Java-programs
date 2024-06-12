package com.arrayexample.carexample;

import java.util.Arrays;

public class Car {
	String regNo;
	String color;

	public Car(String regNo, String color) {
		this.regNo = regNo;
		this.color = color;

	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", color=" + color + "]";
	}

	public static void main(String[] args) {
		Car c1 = new Car("KA03ER5432", "White");
		Car c2 = new Car("KA03ER5433", "Black");

		// creating a car array
		Car[] cars = { c1, c2 };

		System.out.println(cars.length);
		System.out.println(cars[0].color);// c1 car color
		cars[0].color = "Red";
		System.out.println(cars[0].color);

		System.out.println(cars[1].regNo);// c2 car color

		// using string method to access all the contents of an object
		System.out.println(Arrays.toString(cars));

		// using for-each loop to retrieve the contents
		for (Car car : cars) {
			System.out.println(car);

		}

	}

}