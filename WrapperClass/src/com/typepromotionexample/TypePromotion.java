package com.typepromotionexample;

public class TypePromotion {
	static void print(double d) {
		System.out.println("Double method " + d);

	}

	static void print(long l) {
		System.out.println("long method " + l);

	}

	public static void main(String[] args) {
		int i = 25;
		print(i);
	}

}
