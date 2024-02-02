package com.prowings.HashMap;

import java.util.ArrayList;
import java.util.Collections;

public class SecondHighestMarkedStudent {

	public static void main(String[] args) {

		Student s1 = new Student(90, "AAA", 10);
		Student s2 = new Student(60, "DDD", 40);
		Student s3 = new Student(80, "BBB", 20);
		Student s4 = new Student(50, "EEE", 50);
		Student s5 = new Student(70, "CCC", 30);

		ArrayList<Student> l = new ArrayList<>();

		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		
		Collections.sort(l, new Student());

//		System.out.println(l);
		
		System.out.println("The second highest marked student is : " +"\n"+ l.get(1));
		
		


	}

}
