package tostringexample;

public class Bus {
	String serviceProvider;
	int seatingCapacity;
	String source;
	String destination;
	double ticketCost;

	public Bus(String servicProvider, int seatingCapacity, String source, String destination, double ticketCost) {
		this.serviceProvider = serviceProvider;
		this.seatingCapacity = seatingCapacity;
		this.source = source;
		this.destination = destination;
		this.ticketCost = ticketCost;
	}

	@Override
	public String toString() {
		return "Bus [destination=" + destination + "]";
	}

	public static void main(String[] args) {
		Bus b = new Bus("Orange", 40, "Bangalore", "Mysore", 300);
		System.out.println(b);

	}

}
