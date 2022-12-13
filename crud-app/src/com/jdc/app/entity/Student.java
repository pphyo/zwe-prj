package com.jdc.app.entity;

public class Student {

	private static int INCREMENT = 1;
	private int id;
	private String name;
	private Gender gender;
	private int age;
	private Grade grade;
	private String phone;

	public Student() {
		id = INCREMENT;
		INCREMENT++;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public enum Gender {
		Male, Female, Other
	}

	public enum Grade {
		KG, G1, G2, G3, G4, G5, G6, G7, G8, G9, G10
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", grade=" + grade
				+ ", phone=" + phone + "]";
	}

}
