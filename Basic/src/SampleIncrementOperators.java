
public class SampleIncrementOperators {
	public static void main(String[] args) {
		int x = 25;
		int y = x++;// post increment
		System.out.println(x);
		System.out.println(x++);
		System.out.println(y);

		int a = 25;
		int b = ++a;// pre increment
		System.out.println(a);
		System.out.println(++a);
		System.out.println(b);

		int m = 3;
		int n = m++ * m++;
		System.out.println(m);
		System.out.println(++m);
		System.out.println(n);

		int i = 3;
		int j = ++i + i++ + ++i;
		System.out.println(i);
		System.out.println(j);

	}

}
