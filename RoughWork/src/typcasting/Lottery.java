package typcasting;

public class Lottery {
	public Vehicle luckyDraw(int num) {
		if (num == 1) {
			Truck t = new Truck();
			return t;
		} else if (num == 2) {
			return new Car();

		} else {
			return new Bike();
		}
	}

	public static void main(String[] args) {
		Lottery l = new Lottery();
		Vehicle v = l.luckyDraw(1);
		System.out.println(v);

		if (v instanceof Truck t) {
			System.out.println(t.isLoaded);
			t.unLoad();

		} else if (v instanceof Car c) {
			System.out.println(c.isAutomatic);
			c.cruiseControl();
		} else if (v instanceof Bike b) {

			System.out.println(b.isKikkerAvailable);
			b.kick();
		}
	}

}
