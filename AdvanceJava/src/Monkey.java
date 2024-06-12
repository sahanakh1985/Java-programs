
public class Monkey {
	// example for non primitive data type,including Monkey,Banana,Chocolate,Cake
	// are some examples of non primitive data type

	void eat(Banana banana) {
		System.out.println("eating banana");
		System.out.println("banana is " + banana.color + " color");
	}

	void eat(Chocolate c) {
		System.out.println("eating chocolate");
		System.out.println("chocolate is " + c.brand);
	}

	void eat(Cake cake) {
		System.out.println("eating cake");
		System.out.println(" Cake is " + cake.type);
	}

	public static void main(String[] args) {
		// creating a object for Monkey class ,m
		Monkey m = new Monkey();

		// creating a object for Banana class ,b
		Banana b = new Banana();

		// creating a object for Chocolate class ,c
		Chocolate c = new Chocolate();

		// creating a object for cake class ,cake
		Cake cake = new Cake();

		// Invoking the monkey class eat method with Banana object
		m.eat(new Banana()); // new Monkey.eat(new Banana();

		m.eat(new Chocolate());

		m.eat(cake);
	}
}
