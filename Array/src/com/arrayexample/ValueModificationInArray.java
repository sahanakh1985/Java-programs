package com.arrayexample;

public class ValueModificationInArray {
	public static void main(String[] args) {
		// modifying the elements in the array
		// the given value is divided by 2 and stored in the same array
		// using for-loop
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / 2;
			System.out.println(arr[i]);

		}
		// by using for-each loop,Printing elements of array
		System.out.println("Printing elements of an array");
		for (int i : arr) {
			System.out.print(i + " ");

		}

	}

}
