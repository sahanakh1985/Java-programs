package simpledigitcheck;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();
		int count = 0;
		while (n > 0) {
			count++;
			n /= 10; // n=n/10;
		}
		System.out.println("The total digit in the number is =" + count);
	}

}
