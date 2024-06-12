
public class Student {
	// constructor overloading

	String name;
	int rollNm;
	long phoneNum;
	int age;
	String address;

	public Student(String name, int rollNm, long phoneNum) {
		this.name = name;
		this.rollNm = rollNm;
		this.phoneNum = phoneNum;
	}

	public Student(String name, int rollNm, long phoneNum, int age, String address) {
		this.name = name;
		this.rollNm = rollNm;
		this.phoneNum = phoneNum;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNm=" + rollNm + ", phoneNum=" + phoneNum + ", age=" + age + ", address="
				+ address + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student("sahana", 1, 7483480432L);
		Student s2 = new Student("suhana", 12, 7483480433L, 25, "Mysore");
		System.out.println(s1.name);
		System.out.println(s2.age);
		System.out.println(s2);
		s2.address = "Bangalore";
		System.out.println(s1);
		System.out.println(s2);

	}

}
