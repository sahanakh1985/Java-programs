import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		// using if-else
		if (n % 2 == 0) {
			System.out.println(n + " " + "is even");

		} else {
			System.out.println(n + " " + "is odd");

		}
		System.out.println("-----------------------");
		// using ternary operator
		System.out.println((n % 2 == 0) ? n + " is even" : n + "is odd");

		System.out.println("_______________________________");
		// by using string array
		String[] out = { "even", "odd" };
		System.out.println(n + "  " + "is" + " " + out[n % 2]);

	}
}
