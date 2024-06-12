import java.util.Scanner;

public class StarX {
	// program to print letter 'X'
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the N value");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1 || i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}

	}
}
