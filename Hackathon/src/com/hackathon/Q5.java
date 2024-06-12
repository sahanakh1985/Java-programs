package com.hackathon;

import java.util.Iterator;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		// unique numbers and number of duplicate numbers in an array
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("enter the array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();

		}
		// a new array with size 10
		int[] occured = new int[10];
		// increment the value of occured numbers

		for (int i = 0; i < array.length; i++) {
			occured[array[i]]++;

		}
		for (int j = 0; j < occured.length; j++) {
			if (occured[j] > 1) {
				System.out.println(j + " occurded " + occured[j] + " times");

			} else if (occured[j] == 1) {
				System.out.println(j + " is unique");
			}

		}
	}

}
