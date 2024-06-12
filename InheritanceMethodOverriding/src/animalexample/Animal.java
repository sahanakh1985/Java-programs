package animalexample;

public class Animal {
	void eat() {
		System.out.println("Animal eats with mouth directly");
	}

	public static void main(String[] args) {

		Dog d = new Dog();
		Monkey m = new Monkey();

		d.eat();
		m.eat();
		
	

	}
}
