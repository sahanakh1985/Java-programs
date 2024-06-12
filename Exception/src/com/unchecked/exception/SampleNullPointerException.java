package com.unchecked.exception;

public class SampleNullPointerException {
	static void print(String name) {
		if (name != null)
			System.out.println(name.toUpperCase());
	}

	public static void main(String[] args) {
		print(null);

	}

}
