package com.prowings.HashMap;

import java.util.*;

public class SecondHighestSalariedEmployee {

	public static void main(String[] args) {

		Employee e1 = new Employee(10, "Ram", 30000, "Pune");
		Employee e2 = new Employee(20, "Sham", 20000, "Mumbai");
		Employee e3 = new Employee(30, "Gaurav", 50000, "Nagpur");
		Employee e4 = new Employee(40, "Madan", 70000, "Bhandara");

		List<Employee> l = new ArrayList<Employee>();

		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);

		Employee result = findSecondHighestSalariedEmployee(l);

		System.out.println("Second Highest Salaried Employee:");
		
		System.out.println("ID: " + result.getId());
		System.out.println("Name: " + result.getName());
		System.out.println("Salary: " + result.getSalary());
		System.out.println("Address: " + result.getAddress());

	}

	public static Employee findSecondHighestSalariedEmployee(List<Employee> l) {

		Map<Double, Employee> m = new TreeMap<>(Collections.reverseOrder());

		for (Employee emp : l) {

			m.put(emp.getSalary(), emp);
		}

		// System.out.println(m);

		Iterator<Map.Entry<Double, Employee>> iterator = m.entrySet().iterator();
		iterator.next();

		if (iterator.hasNext()) {

			return iterator.next().getValue();

		} else
			throw new IllegalStateException("Could not find second highest salaried employee");

	}

}
