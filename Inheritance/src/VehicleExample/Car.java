package VehicleExample;

public class Car extends Vehicle {
	boolean isAutomatic;

	void cruiseControl() {
		System.out.println("cruise control is working");
	}

	@Override
	public String toString() {
		return "Car [isAutomatic=" + isAutomatic + ", color=" + color + ", brand=" + brand + ", price=" + price + "]";
	}

}
