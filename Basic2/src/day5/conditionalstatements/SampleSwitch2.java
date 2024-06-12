
package day5.conditionalstatements;

import java.util.Scanner;

public class SampleSwitch2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();

		System.out.println("enter the operators -> '+' or '-' or '*' or '/' or '%'");
		char opt = sc.next().charAt(0);

		switch (opt) {
		case '+':

			System.out.println("Addition :" + (num1 + num2));
			break;

		case '-':

			System.out.println("Subtraction:" + (num1 - num2));
			break;

		case '*':

			System.out.println("Multiplication :" + (num1 * num2));
			break;

		case '/':

			System.out.println("Division :" + (num1 / num2));
			break;

		case '%':

			System.out.println("Modulus :" + (num1 % num2));
			break;

		default:
			System.out.println("Enter a valid input");
		}

	}
}
