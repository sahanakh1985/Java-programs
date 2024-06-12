
public class LogicalANDOperator1 {
	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		// we are using logical AND Operator (&&)
		if (++x >= 6 && ++y <= 8) {
			System.out.println("Hello");
		} else {
			System.out.println("World");
		}
		System.out.println(x);   //x=6
		System.out.println(y);    //y=8
		
		//now we are using bitwise AND Operator(&)
		if (++x >= 6 & ++y <= 8) {
		System.out.println("Hello");
		} else {
			System.out.println("World");
		}
		System.out.println(x);                                                  
		System.out.println(y);
		//here x=7,y=9 because both are pre-increment operators  
	}

}
