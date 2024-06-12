package upcasting_downcasting;

public class Truck extends Vehicle {
	int loadCapacity;

	void dropLoad() {
		System.out.println("Drop the load from truck");
	}

	@Override
	public String toString() {
		return "Truck [color=" + color + ", brand=" + brand + ", price=" + price + ", loadCapacity=" + loadCapacity
				+ "]";
	}

}
