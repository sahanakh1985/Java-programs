import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();

		int sum = 0;
		while (n > 0) {
			int last = n % 10;
			sum = sum + last;

			n = n / 10;

		}
		System.out.println("The sum of digits in the given number is:" + sum);
	}

}
