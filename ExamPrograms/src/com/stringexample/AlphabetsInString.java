package com.stringexample;

import java.util.Scanner;

public class AlphabetsInString {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		String input = new Scanner(System.in).nextLine();

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		if (alphabet.equals(input)) {
			System.out.println("The given string contains all the letters of the alphabet");
		} else {
			System.out.println("The given string  not contains all the letters of the alphabet");
		}

	}

}
