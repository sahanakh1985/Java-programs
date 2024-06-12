
public class User {
	String name;
	String email;
	String password;

	User(String email, String password) {
		this.email = email;
		this.password = password;

	}

	User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;

	}

	public static void main(String[] args) {
		User u1 = new User("sahanakh10@gmail.com", "Alpha@1223");
		User u2 = new User("Sahana", "sahanakh10@gmail.com", "Alpha@1223");

		System.out.println(u1.email);
		System.out.println(u1.password);
		System.out.println(u1.name);
		System.out.println(u2.password);
		System.out.println(u2.name);
		System.out.println(u2.email);
		System.out.println(u1);
		System.out.println(u2);

	}

}
