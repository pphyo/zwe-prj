package com.jdc.app;

// static members(vars, methods) belong to Class
// instance members belong to Object

public class ObjLife {

	public static void main(String[] args) {
		
//		Student.count = 4;
//		Student.go();
		
//		Student stu1 = new Student("Thida");
//		stu1.name = "Thida";
//		
//		Student stu2 = new Student();
//		stu2.name = "Mg Mg";
//		
//		stu1.ageUp();
//		stu2.ageUp();
//		
//		Student.countUp();
//		Student.countUp();
//		
//		System.out.println(stu1.name);
//		System.out.println(stu2.name);
//		
//		System.out.println("Age: " + stu1.age);
//		System.out.println("Age: " + stu2.age);
//		
//		System.out.println("Count: " + Student.count);
//		System.out.println("Count: " + Student.count);
		
//		new Student();
//		
//		new Student();
		
		Employee emp = new Employee();
		emp.setAge(-10);
		
		System.out.println(emp.getAge());

	}
	
	void inst() {
		stat();
	}
	
	static void stat() {
		
	}

}
