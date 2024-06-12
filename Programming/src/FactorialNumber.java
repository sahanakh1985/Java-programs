import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n = new Scanner(System.in).nextInt();
		int res = 1;

		for (int i = n; i >= 2; i--) {
			res *= i;

		}
		System.out.println(n + " factorial is " + res);

	}

}
