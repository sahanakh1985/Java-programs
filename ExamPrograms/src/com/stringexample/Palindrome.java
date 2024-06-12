package com.stringexample;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string input");
		String input = sc.nextLine();

		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		String rev = sb.toString();

		System.out.println(input.equals(rev) ? "Palindrome" : "Not a plindrome");
	}

}
