package com.object.arrayexample;

import java.util.Arrays;

public class Student {
	int slNO;
	String name;
	int age;

	public Student(int slNO, String name, int age) {
		this.slNO = slNO;
		this.name = name;
		this.age = age;

	}

	@Override
	public String toString() {
		return "Student [slNO=" + slNO + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Sahana", 25);
		Student s2 = new Student(2, "Manya", 24);
		Student s3 = new Student(3, "Dhanya", 26);

		Student[] students = { s1, s2, s3 };

		System.out.println(students.length);
		System.out.println(students);
		System.out.println(students[0]);
		students[0].age = 14;
		System.out.println(students[0]);

		System.out.println(Arrays.toString(students));

		// retrieving array elements using for-each loop
		for (Student student : students) {
			System.out.println(student);
			System.out.println(student.age + 2);

		}

	}

}
