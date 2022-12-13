package com.jdc.oop.encap;

public class Student {

	private String name;
	private int age;
	
	public void setAge(int age) {
		if(age > 0)
			this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
}