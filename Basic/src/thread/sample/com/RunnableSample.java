package thread.sample.com;

public class RunnableSample implements Runnable {

	@Override
	public void run() {
		System.out.println("task is running");

	}

	public static void main(String[] args) {
		RunnableSample ob = new RunnableSample();
		Thread t1 = new Thread(ob);
		t1.start();
	}

}
