package com.kh.employeedatabase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class Employee {
	private int id;
	private String name;
	private double salary;

}
