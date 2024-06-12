package com.day10.array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int[][] arr = { { 2, 3 }, { 4, 5 }, { 7, 8 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}
}
