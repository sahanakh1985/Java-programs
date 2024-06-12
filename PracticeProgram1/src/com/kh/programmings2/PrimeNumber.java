package com.kh.programmings2;

public class PrimeNumber {
	static boolean checkPrime(int num) {
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
			else
				return true;

		}
		return false;

	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + " is  " + (checkPrime(i) ? " a prime number" : "not a prime number"));

		}
	}

}
