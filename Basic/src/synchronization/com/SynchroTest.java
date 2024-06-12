package synchronization.com;

class CountTest {
	public static int count = 0;

	public static synchronized void addVal(String name) {
		System.out.println(name + " counting : " + (++count) * 10);
	}
}

class One extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			CountTest.addVal(this.getName());

		}
	}
}

class Two extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			CountTest.addVal(this.getName());

		}
	}
}

public class SynchroTest {
	public static void main(String[] args) {
		One ob = new One();
		Two ob1 = new Two();
		ob.start();
		ob1.start();

	}

}
