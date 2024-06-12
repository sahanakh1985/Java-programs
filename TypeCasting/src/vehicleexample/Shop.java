package vehicleexample;

public class Shop {
	// sell is an instance method in a class Shop,
	// returns vehicle ,if option is 1=>car,2=>Bike,3=>Truck
	Vehicle sell(int option) {
		if (option == 1) {
			Car c = new Car();
			c.brand = "Hundai";
			c.color = "White";
			c.isAutomatic = false;
			c.price = 1000000;

			return c;
		} else if (option == 2) {
			Bike b = new Bike();
			b.color = "White";
			b.brand = "Bullet";
			b.price = 225000;
			b.isKikkerAvailable = true;
			return b;
		} else {
			Truck t = new Truck();
			t.color = "Red";
			t.brand = "TATA";
			t.price = 1000000;
			t.loadCapacity = 2500;
			return t;

		}

	}

	public static void main(String[] args) {
		Shop s = new Shop();
		// here we are storing a sub class object car in a super class variable v
		// is called up casting
		Vehicle v = s.sell(3); // Vehicle v= new Car(); //up casting
		System.out.println(v.brand);
		System.out.println(v.color);
		System.out.println(v.price);
		v.start();
		v.stop();
		if (v instanceof Car c) {
			// down casting
			System.out.println(c.isAutomatic);
			c.cruiseControl();
		} else if (v instanceof Bike b) {
			System.out.println(b.isKikkerAvailable);
			b.kick();
		} else if (v instanceof Truck t) {
			System.out.println(t.loadCapacity);
			t.dropLoad();

		}

	}

}
