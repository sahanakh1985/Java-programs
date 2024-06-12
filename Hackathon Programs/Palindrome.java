package com.string.example;

public class Palindrome {
	public static void main(String[] args) {
		String input = "MALAYALAM";

		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		String reverse = sb.toString();
		System.out.println(input + " is " + (input.equals(reverse) ? "Palindrome" : "Not a Palindrome"));

	}

}
