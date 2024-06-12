package com.stringexample;

public class ReverseString {

	public static void main(String[] args) {

		String name = "Sahana";
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));

		}
		System.out.println();
		System.out.println(name);

	}

}
