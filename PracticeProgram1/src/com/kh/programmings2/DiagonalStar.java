package com.kh.programmings2;

import java.util.Scanner;

public class DiagonalStar {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println(" ");

		}

	}

}
