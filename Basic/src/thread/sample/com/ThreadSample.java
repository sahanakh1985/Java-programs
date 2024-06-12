package thread.sample.com;

public class ThreadSample extends Thread {
	public void run() { // running
		System.out.println("task start by :" + this.getName());
		System.out.println("task ended by:" + this.getName());

	}// dead or terminated

	public static void main(String[] args) {
		ThreadSample t1 = new ThreadSample(); // new born thread
		t1.start();// runnable
		ThreadSample t2 = new ThreadSample(); // new born thread
		t2.start();// runnable
	}

}
