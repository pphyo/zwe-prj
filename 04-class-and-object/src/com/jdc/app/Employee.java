package com.jdc.app;

public class Employee {

	// access modifier (public, protected, (package), private)
	
//	private String name = "U ";
	private int age = 1;
//	private String address;
	
	// setter (mutator)
	public void setAge(int age) {
		if(age > 0)
			this.age = age;
	}
	
	// getter (accessor)
	public int getAge() {
		return age;
	}
	
//	void work() {
//		
//		// Variable hiding (this)
//		String name = "U Ba";
//		
//		System.out.println(this.name);
//		
//	}
//	
//	void doSomething() {
//		this.work();
//		this.age = 40;
//		this.address = "";
//	}
	
//	public static void main(String[] args) {
//		
//		Employee emp = new Employee();
//		emp.work();
//		
//	}

}
