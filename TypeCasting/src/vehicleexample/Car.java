package vehicleexample;

public class Car extends Vehicle {
	boolean isAutomatic;

	void cruiseControl() {
		System.out.println("Car is on auto pilot mode");
	}

	@Override
	public String toString() {
		return "Car [isAutomatic=" + isAutomatic + ", color=" + color + ", brand=" + brand + ", price=" + price + "]";
	}

}
