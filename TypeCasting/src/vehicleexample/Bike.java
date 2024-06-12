package vehicleexample;

public class Bike extends Vehicle {
	boolean isKikkerAvailable;

	void kick() {
		System.out.println("kick start");
	}

	@Override
	public String toString() {
		return "Bike [color=" + color + ", brand=" + brand + ", price=" + price + ", saKikkerAvailable="
				+ isKikkerAvailable + "]";
	}

}
