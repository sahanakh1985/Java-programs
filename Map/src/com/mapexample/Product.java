package com.mapexample;

import java.util.HashMap;

public class Product {

	String productName;
	String productDescription;
	double price;

	public Product(String productName, String productDescription, double price) {
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productDescription=" + productDescription + ", price=" + price
				+ "]";
	}

	public static void main(String[] args) {
		HashMap<Integer, Product> productMap = new HashMap<>();
		Product p1 = new Product("tv", "alpha", 2345.0);
		Product p2 = new Product("Mixer", "Beta", 5500.0);
		Product p3 = new Product("WashingMachine", "Super", 35600.0);
		Product p4 = new Product("Refrigerator", "King", 34000.0);
		Product p5 = new Product("Stove", "LPG", 9000.0);
		productMap.put(1, p1);
		productMap.put(2, p2);
		productMap.put(3, p3);
		productMap.put(4, p4);
		productMap.put(5, p5);

		System.out.println(productMap);

		productMap.forEach((k, v) -> {
			System.out.println(k + " " + v);

		});

	}
}
