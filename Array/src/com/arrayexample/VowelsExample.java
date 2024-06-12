package com.arrayexample;

import java.util.Arrays;

public class VowelsExample {
	public static void main(String[] args) {
//dynamic array initialization
		char[] vowels = { 'A', 'E', 'I', 'O', 'U' };
		System.out.println(vowels[2]);
		System.out.println(vowels.length);// 5

		String[] colors = new String[5];
		colors[0] = "Red";
		colors[1] = "Green";
		colors[2] = "Pink";
		colors[3] = "blue";
		colors[4] = "Black";

		System.out.println(colors[2]);// Pink
		System.out.println(colors.length);// 5

		System.out.println(Arrays.toString(vowels));// A,E,I,O,U

	}

}
