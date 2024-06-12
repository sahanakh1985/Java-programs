package Com.trai.simexample;

public abstract class AbstractSim {
	abstract void call();

	abstract void sms();

	void sos() {
		System.out.println("Emergency calling 112");
	}

}
