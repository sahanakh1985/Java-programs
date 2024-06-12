package com.starPattern;

import java.util.Scanner;

public class StarPatternM {
	public static void main(String[] args) {
		System.out.println("Enter the 'n' number");
		int n = new Scanner(System.in).nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || (i == j && i <= n / 2) || (i + j == n - 1 && j >= n / 2) || j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();

		}

	}
}
