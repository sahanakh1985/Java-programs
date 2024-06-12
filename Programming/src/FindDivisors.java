import java.util.Scanner;

public class FindDivisors {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num = new Scanner(System.in).nextInt();

		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println("The divisors are=" + i);
			}

		}
	}

}
