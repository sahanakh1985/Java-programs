import java.util.Scanner;

public class StarP {
	// program to print letter 'P'
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N value");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n / 2 || (i == 0 && j >= n / 2) || (i == n / 2 && j >= n / 2) || (j == n - 1 && i <= n / 2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}

	}

}
