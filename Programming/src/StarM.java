import java.util.Scanner;

public class StarM {
	// program to print letter 'M'
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the N value");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || (i == j && i <= n / 2) || (i + j == n - 1 && j >= n / 2) || j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
