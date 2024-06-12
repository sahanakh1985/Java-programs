
public class Student {
	int slNO;
	String name;
	long phoneNo;
	int age;
	String course;

	public Student(int slNO, String name, long phoneNo) {
		this.slNO = slNO;
		this.name = name;
		this.phoneNo = phoneNo;
	}

	public Student(int slNO, String name, long phoneNo, int age, String course) {
		this.slNO = slNO;
		this.name = name;
		this.phoneNo = phoneNo;
		this.age = age;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [slNO=" + slNO + ", name=" + name + ", phoneNo=" + phoneNo + ", age=" + age + ", course="
				+ course + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Alpha", 9634567892L);
		Student s2 = new Student(1, "Alpha", 9634567892L, 30, "java");
		System.out.println(s1);
		s1.phoneNo = 7483480423L;
		System.out.println(s1.phoneNo);

	}

}
