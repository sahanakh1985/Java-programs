package com.hackathon;

import java.util.Scanner;

public class Q18 {

	// Display duplicate characters in String
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter ur string \n");
		String input = sc.nextLine();
		int[] occured = new int[128];
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ')
				occured[input.charAt(i)]++;
		}
		for (int j = 0; j < occured.length; j++) {
			if (occured[j] > 1) {
				System.out.println((char) (j) + " is duplicate");
			}
		}
	}
}
