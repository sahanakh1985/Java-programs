import java.util.Iterator;
import java.util.Scanner;

public class StarX {
	public static void main(String[] args) {
		System.out.println("Enter the n value");
		int n = new Scanner(System.in).nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		
	}

}
