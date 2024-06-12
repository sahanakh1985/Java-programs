package com.arrayexample;

import java.util.Iterator;

public class ArrayModificationProgram {
	public static void main(String[] args) {
		// using 'for-loop'for the modification in the array
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = arr[i] / 2;

		}
		System.out.println("Printing elements of an array");
		// we are using 'for-each'loop for retrieving the array values
		for (int i : arr) {
			System.out.println(i);

		}
	}
}
