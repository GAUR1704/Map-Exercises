package com.prowings.HashMap;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private String address;

	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary, String address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getAddress() {
		return address;
	}

}
