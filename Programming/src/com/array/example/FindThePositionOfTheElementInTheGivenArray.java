package com.array.example;

public class FindThePositionOfTheElementInTheGivenArray {
	public static void main(String[] args) {
		int[] arr = { 3, 45, 67, 41, 76, 98, 56, 13 };
		int elementToFind = 41;

		for (int i = 0; i < arr.length; i++) {
			if (elementToFind == arr[i]) {
				System.out.println("Element found at " + (i + 1) + "th position");
				return;
			}

		}
		System.out.println("Element not found");
	}

}
