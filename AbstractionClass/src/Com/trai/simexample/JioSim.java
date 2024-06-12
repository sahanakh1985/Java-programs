package Com.trai.simexample;

public class JioSim extends AbstractSim {

	@Override
	void call() {
		System.out.println("Jio calling...");

	}

	@Override
	void sms() {
		System.out.println("Jio-Sending sms...");

	}

	void jioTv() {
		System.out.println("Jio tv screen");
	}

}
