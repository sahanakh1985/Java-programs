package carexample;

public class Car {
	void start() {
		System.out.println("turn the key to start");
	}

	public static void main(String[] args) {
		SedanCar s = new SedanCar();
		SuperCar sc = new SuperCar();

		s.start();
		sc.start();

	}

}
