package com.jdc.oop;

public class Person {

	private String name;
	private int age;
	private String gender;
	private double salary;
	
	public Person() {
		super();
		System.out.println("no arg const");
	}
	
	public Person(String name) {
		this();
		this.name = name;
		System.out.println("1 arg const");
	}
	
	public Person(String name, int age) {
		this(name);
		this.age = age;
		System.out.println("2 args const");
	}
	
	public Person(String name, int age, String gender) {
		this(name, age);
		this.gender = gender;
		System.out.println("3 args const");
	}
	
	public Person(String name, int age, String gender, double salary) {
		this(name, age, gender);
		this.salary = salary;
		System.out.println("4 args const");
	}
	
	static void hello() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public double getSalary() {
		return salary;
	}
}
