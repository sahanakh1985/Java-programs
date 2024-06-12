package com.string.example;

import java.util.Scanner;

public class NumberOfCharactersInWord {
	public static int charCount(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;

			}

		}
		return count;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String input = sc.nextLine();

		System.out.println("enter the character");
		char letter = sc.next().charAt(0);

		int count = charCount(input, letter);
		System.out.println("occurance of " + letter + " in a sentence :" + count);

	}

}
