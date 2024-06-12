package VehicleExample;

public class RunnerVehicleExample {
	public static void main(String[] args) {

		Truck t = new Truck();
		System.out.println(t);

		t.color = "Red";
		t.brand = "Mahindra";
		t.loadCapacity = 3000;
		t.price = 200000;
		System.out.println("After assigning the values");
		System.out.println(t);
		t.start();
		t.stop();
		t.dropLoad();

		System.out.println("________________________________________________");

		Car c = new Car();

		c.color = "White";

		System.out.println(c);
		c.brand = "Kia";
		c.price = 2000000;
		System.out.println("After assigning the values");
		System.out.println(c);
		c.start();
		c.stop();
		c.cruiseControl();

		System.out.println("________________________________________________");

		Bike b = new Bike();

		System.out.println(b);
		b.color = "Blue";
		b.brand = "Splender";
		b.price = 100000;
		System.out.println("After assigning the values");
		System.out.println(b);
		b.start();
		b.stop();
		b.kick();

	}
}