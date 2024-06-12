package com.hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// reverse of the words string , input=java code , output = code java

		System.out.println("enter the string");
		String str = new Scanner(System.in).nextLine();

		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");

		}

	}
}
