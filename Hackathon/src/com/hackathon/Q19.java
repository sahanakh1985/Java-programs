package com.hackathon;

import java.util.Scanner;

//Occurance of each character
public class Q19 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(" enter ur input \n");
		String inputString = input.nextLine();
		int[] occured = new int[128];
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) != ' ')
				occured[inputString.charAt(i)]++;
		}
		for (int j = 0; j < occured.length; j++) {
			if (occured[j] != 0) {
				System.out.println((char) (j) + " occured " + occured[j] + " times");
			}
		}
	}
}
