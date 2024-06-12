package typcasting;

public abstract class Vehicle {
	String color;
	String brand;
	double price;
	
	void start() {
		System.out.println("Vehicle starts");
	}
	void stop() {
		System.out.println("Vehicle stops");
		
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
