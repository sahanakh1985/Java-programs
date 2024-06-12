package thread.sample.com;

public class ThreadJoin extends Thread {
	public void run() {
		System.out.println("task starts by:" + this.getName());
		try {
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println();
		}
		System.out.println("task ended by:" + this.getName());
	}

	public static void main(String[] args) {
		ThreadJoin tj = new ThreadJoin();
		tj.start();
		try {
			tj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("program ends");
	}
}
