package simpledigitcheck;

import java.util.Scanner;

public class PowerFunction {
	static int pow(int m, int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * m;

		}
		return res;

	}

	public static void main(String[] args) {
		System.out.println("Enter the value of m and n");
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int res = PowerFunction.pow(m, n);
		System.out.println(res);

	}

}
