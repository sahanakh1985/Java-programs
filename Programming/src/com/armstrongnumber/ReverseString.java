package com.armstrongnumber;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter the input");
		String input = new Scanner(System.in).nextLine();

		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		String rev = sb.toString();

		System.out.println(rev);

	}

}
