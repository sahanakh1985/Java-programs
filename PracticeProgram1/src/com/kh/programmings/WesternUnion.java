package com.kh.programmings;

import java.util.Scanner;

public class WesternUnion {
	public static double convertDollarToINR(int dollar, double rate) {
		return dollar * rate;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dollar and rate");
		int dollar = sc.nextInt();
		double rate = sc.nextDouble();

		double rupees = convertDollarToINR(dollar, rate);
		System.out.println(rupees);

	}

}
