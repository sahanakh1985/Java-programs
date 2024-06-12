package com.hackathon;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		// remove given character from a given string
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();

		System.out.println("enter the character");
		String c = sc.nextLine();

		if (str.contains(c)) {
			String newStr = str.replace(c, "");
			System.out.println(newStr);

		} else {
			System.out.println(c + " is not found in the given string");
		}

	}

}
