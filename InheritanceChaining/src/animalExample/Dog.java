package animalExample;

public class Dog extends Animal {
//public Dog(){
	// super();
//}
	void bark() {
		System.out.println("Dog barks");
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + ", breed=" + breed + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d);
		System.out.println(d.color);// null
		System.out.println(d.breed);// null
		d.color = "black";
		System.out.println(d.color);
		d.eat();
		d.bark();

	}
}
