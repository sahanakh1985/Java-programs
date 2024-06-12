package com.hackathon;

import java.util.Scanner;

public class Q12 {
	// check palindrome for both numbers and string

	public static void main(String[] args) {
		System.out.println("enter the input");
		String input = new Scanner(System.in).nextLine();

		int i = 0;
		int j = input.length() - 1;

		while (i <= j) {
			if (input.charAt(i) == input.charAt(j)) {
				i++;
				j--;

			} else {
				break;

			}
		}
		System.out.println((i > j) ? "palindrome" : "not a palindrome");
		System.out.println(i);
		System.out.println(j);

	}

}
