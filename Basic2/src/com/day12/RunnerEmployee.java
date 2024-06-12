package com.day12;

class Employee {
	double salary = 50000;

	void salary() {
		System.out.println("The salary of an employee is :" + salary);
	}

}

class FullTimeEmployee extends Employee {
	double hike = 0.50;

	void incrementSalary() {
		salary = salary + (salary * hike);
		System.out.println("The salary of full time employee after hike is :" + salary);
	}
}

class PartTimeEmployee extends Employee {
	double hike = 0.25;

	void incrementSalary() {
		salary = salary + (salary * hike);
		System.out.println("The salary of part time employ after hike is :" + salary);
	}
}

public class RunnerEmployee {
	public static void main(String[] args) {
		FullTimeEmployee ftEmp = new FullTimeEmployee();
		PartTimeEmployee ptEmp = new PartTimeEmployee();
		System.out.println("Salary of full time employee before increment:" + ftEmp.salary);
		System.out.println("Salary of part time employee before hike:" + ptEmp.salary);
		ftEmp.salary();
		ptEmp.salary();

	}
}
