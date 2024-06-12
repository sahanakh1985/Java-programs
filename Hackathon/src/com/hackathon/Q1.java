package com.hackathon;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a");
		boolean a = sc.nextBoolean();

		System.out.println("enter the value of b");
		boolean b = sc.nextBoolean();

		System.out.println("enter the value of c");
		boolean c = sc.nextBoolean();

		if ((a && b) || (a && c) || (b && c)) {
			System.out.println("2 values are true");

		} else {
			System.out.println("2 values are false");

		}
	}

}
