package simpledigitcheck;

import java.util.Scanner;

public class DigitCheck {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();

		if (n >= 10 && n <= 99) {
			System.out.println(n + " " + "is a two digit number");

		} else {
			System.out.println(n +" "+ "is not a two digit number");

		}
	}

}
