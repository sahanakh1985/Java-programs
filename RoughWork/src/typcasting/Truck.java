package typcasting;

public class Truck extends Vehicle {
	String color="Blue";
	String brand="Mahindra";
	double price=3000000;
	boolean isLoaded;
	
	void unLoad() {
		System.out.println("unload the truck");
	}

	@Override
	public String toString() {
		return "Truck [color=" + color + ", brand=" + brand + ", price=" + price + ", isLoaded=" + isLoaded + "]";
	}
	
}
