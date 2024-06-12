package com.hackathon;

import java.util.Scanner;

public class Q23 {
	public static void main(String[] args) {
		String input;
		int num;
		// differenciate the input as string, int and boolean
		System.out.println("enter your string");
		input = new Scanner(System.in).nextLine();

		try {

			num = Integer.parseInt(input);
			System.out.println(num+ " is "+"integer");
			return;
		} catch (NumberFormatException e) {
		}
		try {
			if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
				System.out.println(input +" is a"+"boolean");
				return;
			} else {
				System.out.println( input +" is a"+"String");
				return;
			}
		} catch (NumberFormatException e) {
		}
	}

}
