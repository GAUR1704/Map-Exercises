package com.prowings.HashMap;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	private int mark;
	private String name;
	private int id;

	public Student() {
		super();
	}

	public Student(int mark, String name, int id) {
		super();
		this.mark = mark;
		this.name = name;
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student mark =" + mark + "\n" + "Student Name = " + name + "\n" + "Student Id = " + id;
	}

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.mark == s2.mark)
			return 0;
		else if (s1.mark < s2.mark)
			return 1;
		else
			return -1;
	}

}
