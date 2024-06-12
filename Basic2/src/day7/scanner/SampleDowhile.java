package day7.scanner;

import java.util.Scanner;

public class SampleDowhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter two numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			System.out.println(num1 + num2);
			System.out.println("do you want two more numbers");
		} while (sc.nextBoolean());
		System.out.println("end of the program");

	}

}
