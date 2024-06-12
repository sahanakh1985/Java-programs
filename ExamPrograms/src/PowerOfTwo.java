import java.util.Scanner;

public class PowerOfTwo {
	static int pow(int m, int n) {
		int res = 1;
		for (int i = 0; i < n; i++) {
			res = res * m;

		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 'm' value");
		int m = sc.nextInt();
		int n = 2;
		int result = pow(m, 2);
		System.out.println("The power of two of " + m +" is :" + result);

	}

}
