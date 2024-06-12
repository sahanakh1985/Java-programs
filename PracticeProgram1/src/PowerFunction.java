import java.util.Scanner;

public class PowerFunction {
	static int power(int m, int n) {
		int res = 1;

		for (int i = 0; i < n; i++) {
			res = res * m;

		}
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m and n value");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int res = power(m, n);
		System.out.println(res);

	}
}
