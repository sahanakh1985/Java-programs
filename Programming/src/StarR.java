import java.util.Scanner;

public class StarR {
	public static void main(String[] args) {

		System.out.println("Enter the value of n");
		int n = new Scanner(System.in).nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (j == n / 2 || (i == 0 && j >= n / 2) || (j == n - 1 && j >= n / 2) || (i == n / 2 && j >= n / 2)) {
					// || (i == j && i >= n / 2)) {
					System.out.print(" * ");
				} else {
					System.out.print(" ");
				}
				System.out.println();

			}
		}

	}
}
