
public class BitwiseOROperator1 {
	public static void main(String[] args) {
		int a = 7;
		int b = 9;
		if (++a <= 8 | ++b >= 11) {
			System.out.println("hello");
		} else {
			System.out.println("world");
		}
		System.out.println(a);
		System.out.println(b);

	}

}
