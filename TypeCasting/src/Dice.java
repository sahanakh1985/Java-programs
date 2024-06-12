import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		Random r = new Random();
		int x = r.nextInt(10) + 1;// here we get a number from 1 to 10 randomly
		System.out.println(x);

	}

}
