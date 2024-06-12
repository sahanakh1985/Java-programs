package com.string.example;

public class CustomStringPalindrome {

	public static void main(String[] args) {
		String input = "MALAYALAM";

		int num = input.length();
		String rev = "";

		for (int i = num - 1; i >= 0; i--) {
			char temp = input.charAt(i);
			rev = rev + temp;

		}
		System.out.println(input.equals(rev) ? "palindrome" : "not a palindrome");

	}

}
