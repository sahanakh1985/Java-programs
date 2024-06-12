package com.calculation;

import java.util.Scanner;

public class SimpleInterest {
	static double simpleInterest(int principal, int time, double rateOfInterest) {
		return (principal * time * rateOfInterest) / 100;
	}

	public static void main(String[] args) {
		System.out.println("enter the principal");
		System.out.println("enter the time");
		System.out.println("enter the rate of interest");

		int principal = new Scanner(System.in).nextInt();
		int time = new Scanner(System.in).nextInt();
		double rateOfInterest = new Scanner(System.in).nextDouble();

		double interest = SimpleInterest.simpleInterest(principal, time, rateOfInterest);

		System.out.println(interest);

	}
}
