package multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		System.out.println("Enter the value of N");
		int n = new Scanner(System.in).nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));

		}
	}

}
