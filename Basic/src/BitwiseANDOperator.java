
public class BitwiseANDOperator {
	public static void main(String[] args) {

		int a = 5;
		int b = 7;
		if (++a >= 8 & ++b <= 8) {
			System.out.println("hello");
		} else {
			System.out.println("world");
		}
		System.out.println(a);// a=6
		System.out.println(b);// b=7
		//in bitwise , all the conditions are executed 
		// but in logical operators , not all the conditions executed
	}

}
