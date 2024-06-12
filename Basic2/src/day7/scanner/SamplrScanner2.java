package day7.scanner;

import java.util.Scanner;

public class SamplrScanner2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the first number");
		int num1 = sc.nextInt();

		System.out.println("enter the second number");
		int num2 = sc.nextInt();

		System.out.println("Addition :" + (num1 + num2));
		System.out.println("Subtraction :" + (num1 - num2));
		System.out.println("Multiplication :" + (num1 * num2));
		System.out.println("Division :" + (num1 / num2));
	}

}
