package upcasting_downcasting;

public class Shop {

	Vehicle sell(int option) {
		if (option == 1) {
			Car c = new Car();
			c.brand = "Kia";
			c.price = 2000000;
			return c;
		} else if (option == 2) {
			Bike b = new Bike();
			return b;

		} else {
			Truck t = new Truck();
			return t;
		}

	}

	public static void main(String[] args) {
		Shop s = new Shop();

		Vehicle v = s.sell(1);// Vehicle v=new Car();
		System.out.println(v.brand);
		System.out.println(v.price);
		v.start();
		v.stop();

		Car c = (Car) v; // down casting
		System.out.println(c.isAutomatic);
		c.cruiseControl();

	}

}
