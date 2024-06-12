import java.util.Scanner;

public class RevesePalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		int temp = n;
		int rev = 0;

		while (n > 0) {
			int last = n % 10;

			rev = rev * 10 + last;

			n = n / 10;

		}
		System.out.println("The given number is " + (temp == rev ? "palindrome" : "not a palindrome"));

	}

}
