
package simpledigitcheck;

import java.util.Scanner;

public class SumOfDivisibleDigits {
	// sum of given number ex:45-> 9

	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();
		int res = 0;

		while (n != 0) {
			int last = n % 10;

			res = res + last; 
			n = n / 10;// res/=10;
		}
		System.out.println("The result is = " + res);

	}
}