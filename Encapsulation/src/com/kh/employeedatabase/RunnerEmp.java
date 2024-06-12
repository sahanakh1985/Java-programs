package com.kh.employeedatabase;

public class RunnerEmp {
	public static void main(String[] args) {
		Employee e=new Employee(10,"Sahana",50000);
		System.out.println(e);
		e.setId(20);
		e.setName("Manyatha");
		e.setSalary(100000);
		e.getId();
		System.out.println(e);
		
	}

}
