package com.stringexample;

import java.util.Scanner;

public class CustomStringReverse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  string");
		String input = sc.nextLine();

		int num = input.length();
		String rev = "";

		for (int i = num - 1; i >= 0; i--) {

			char temp = input.charAt(i);
			rev = rev + temp;

		}
		System.out.println("The reverse string is :" + rev);

	}

}
