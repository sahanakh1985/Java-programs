package upcastingvehicleexample;

import java.security.DomainCombiner;

public class Shop {
	Vehicle sell(int option) {
		if (option == 1) {
			Car c = new Car();
			c.color = "Red";
			c.brand = "BMW";
			c.price = 3000000;
			c.isAutomatic = true;

			return c;

		} else if (option == 2) {
			Bike b = new Bike();
			b.color = "Black";
			b.brand = "Yamaha";
			b.price = 100000;
			b.isKickerAvailable = true;

			return b;

		} else {
			return new Truck();
		}

	}

	public static void main(String[] args) {
		Shop s = new Shop();
		Vehicle v = s.sell(2);
		System.out.println(v);// upcasting
		System.out.println(v.color);
		System.out.println(v.brand);
		System.out.println(v.price);
		v.start();
		v.stop();

		if (v instanceof Car c) {
			System.out.println(c.isAutomatic);
			c.cruiseControl();
		} else if (v instanceof Bike b) {
			System.out.println(b.isKickerAvailable);
			b.kick();
		} else if (v instanceof Truck t) {
			System.out.println(t.loadCapacity);
			t.dropload();

		}

	}

}
