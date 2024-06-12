
public class TokenGenerator {
	Token generateToken() {
		Token t = new Token(52);
		return t;
	}

	public static void main(String[] args) {
		TokenGenerator machine = new TokenGenerator();
		Token tokenchit = machine.generateToken();
		//here machine is a object reference
		System.out.println(tokenchit);
	}

}
