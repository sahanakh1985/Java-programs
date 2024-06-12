package typeCasting;
//converting from lower data type to higher to higher data type

public class Widening {
	public static void main(String[] args) {
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);

	}

}
