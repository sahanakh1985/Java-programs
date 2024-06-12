
public class Phone {
	void unlock(String password) {
		System.out.println(" Phone is unlocked with password : " + password);
	}

	void unlock(int pin) {
		System.out.println(" Phone is unlocked with pin : " + pin);
	}

	public static void main(String[] args) {
		Phone p = new Phone();
		p.unlock(" MDS@1234");
		p.unlock(9876);
	}

}
