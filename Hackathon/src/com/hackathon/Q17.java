package com.hackathon;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// total number of upperCase ,lowerCase and integers in a given String
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input = sc.nextLine();
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;

		for (int i = 0; i < input.length(); i++) {

			if (Character.isUpperCase(input.charAt(i))) {
				upperCaseCount++;

			} else if (Character.isLowerCase(input.charAt(i))) {
				lowerCaseCount++;

			} else if (Character.isDigit(input.charAt(i))) {
				digitCount++;

			}

		}
		System.out.println("Upper case count:" + upperCaseCount);
		System.out.println("Lower case count:" + lowerCaseCount);
		System.out.println("Digit count:" + digitCount);
	}
}
