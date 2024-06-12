package typcasting;

public class Car extends Vehicle {
	String color = "Black";
	String brand = "BMW";
	double price = 6000000;
	boolean isAutomatic;

	void cruiseControl() {
		System.out.println("");

	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", brand=" + brand + ", price=" + price + ", isAutomatic=" + isAutomatic + "]";
	}

}
