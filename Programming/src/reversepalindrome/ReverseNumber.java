package reversepalindrome;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n = new Scanner(System.in).nextInt();

		int temp = n;
		int rev = 0;
		while (n > 0) {
			int lastNo = n % 10;
			rev = rev * 10 + lastNo;
			n = n / 10;
		}
		System.out.println((temp == rev) ? "Palindrome" : "Not Palindrome");
		System.out.println(temp);
		System.out.println(rev);
	}

}
