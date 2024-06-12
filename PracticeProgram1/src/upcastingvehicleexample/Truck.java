package upcastingvehicleexample;

public class Truck extends Vehicle {

	int loadCapacity;

	void dropload() {
		System.out.println("Load is dropped from the truck");
	}

	@Override
	public String toString() {
		return "Truck [loadCapacity=" + loadCapacity + "]";
	}

}
