
public class DecrementOperators1 {
	public static void main(String[] args) {
		int a = 5;
		int b = --a + --a * a--;
		System.out.println(a);
		System.out.println(b);

		int x = 20;
		int y = ++x * --x;
		System.out.println(x);
		System.out.println(y);

		int i = 2;
		int j = --i + --i * --i;
		System.out.println(i);
		System.out.println(j);

		int e = 7;
		int f = --e + e--;
		int g = --f + f-- - f++ / --f % ++f;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}

}
