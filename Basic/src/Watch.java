
public class Watch {
	String color = "black";
	String brand = "fossil";
	double price = 24995;

	void switchOn() {
		System.out.println("switch on the watch");
	}

	void switchOff() {
		System.out.println("switch off the watch");
	}

	public static void main(String[] args) {
		Watch w1 = new Watch();
		Watch w2 = new Watch();
		Watch w3 = new Watch();
		System.out.println(w1.color);// black
		System.out.println(w2.brand);// fossil
		System.out.println(w3.price);// 24995
		w3.price = 20000;
		System.out.println(w3.price);// 20000
		System.out.println(w1.price);
		w1.switchOn();// switch on the watch
		w2.switchOff();// switch off the watch
		w2.switchOn();

		// whenever we print the object reference,

		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);

	}

}
