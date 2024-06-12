package vehicleexample;

public class ShowRoom {
	Car sellCar() {
		Car c = new Car();
		c.color = "Black";
		c.brand = "Mercedes";
		c.price = 5000000;
		c.isAutomatic = true;

		return c;

	}

	public static void main(String[] args) {
		ShowRoom s = new ShowRoom();
		Car myCar = s.sellCar();
		System.out.println(myCar);

	}

}
