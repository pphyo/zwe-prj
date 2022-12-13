package com.jdc.app;

public class Student {

	static int count;
	String name;
	int age;
	String address;

	// Constructor -> Special Method
	// Identity with class name
	// no method return type
	// ()
	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("instance block");
	}

	Student() {
		System.out.println("Default Constructor");
	}

	public Student(String name) {
		System.out.println("1 arg constructor");
	}

	static void countUp() {
		count++;
	}

	void ageUp() {
		age++;
	}
	
	void study() {
		System.out.println("Student studys");
	}

}
