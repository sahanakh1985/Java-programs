package Com.trai.simexample;

public class AirtelSim extends AbstractSim {

	@Override
	void call() {
		System.out.println("Airtel - calling...");

	}

	@Override
	void sms() {
		System.out.println("Airtel- sending sms...");

	}

}
