package com.stringbuilderexample;

import java.util.Scanner;

public class ReverseStringBuilder {
	public static void main(String[] args) {
		System.out.println("Enter the string name");
		String name = new Scanner(System.in).nextLine();

		StringBuilder sb = new StringBuilder(name);
		sb.reverse();
		String reverseString = sb.toString();
		System.out.println(reverseString);

		System.out.println(new StringBuilder(name).reverse());

	}

}
