
public class IncrementOperators1 {
	public static void main(String[] args) {
		int a = 6;
		int b = a++ * a++ * ++a;
		System.out.println(a);
		System.out.println(b);

		int x = 10;
		int y = ++x + x++ + ++x + x++;
		System.out.println(x);
		System.out.println(y);

		int m = 5;
		int n = m++ * ++m + ++m - m++;
		System.out.println(m);
		System.out.println(n);
	}

}
