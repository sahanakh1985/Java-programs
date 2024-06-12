package com.arrayexample.objectarray;

public class Student {

	int slNm;
	String name;
	int age;

	public Student(int slNm, String name, int age) {
		this.slNm = slNm;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [slNm=" + slNm + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "sahana", 25);
		Student s2 = new Student(2, "siri", 15);
		Student s3 = new Student(3, "ammu", 5);

		Student[] students = { s1, s2, s3 };

		for (Student student : students) {
			System.out.println(student);

		}

	}

}
