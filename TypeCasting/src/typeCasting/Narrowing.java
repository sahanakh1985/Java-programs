package typeCasting;

//converting from higher primitive datatype to lower primitive datatype
//at the tim of casting there will be a type mismatch error
//we will have explicitly cast to the lower datatype
public class Narrowing {
	public static void main(String[] args) {
		long l = 130; // 130
		int i = (int) l; // 130

		short s = (short) i; // 130
		byte b = (byte) s; // -126

		System.out.println(l + " " + i + " " + s + " " + b);
	}

}
