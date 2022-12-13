package com.jdc.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "Zaw", "Ko", "Mg", "Ni", "Aung");
		
		System.out.println("Before sort: " + list);
		
		Collections.sort(list);
	
		System.out.println("After sort: " + list);
		
		Student s1 = new Student("Zaw Zaw", 20);
		Student s2 = new Student("Bo Bo", 15);
		Student s3 = new Student("Kyaw Kyaw", 12);
		Student s4 = new Student("Bo Bo", 13);
		
		List<Student> stuList = new ArrayList<>();
		Collections.addAll(stuList, s1, s2, s3, s4);
		Collections.sort(stuList);
		
		System.out.println(stuList);
		
		Comparator<Student> com = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		};
		
		Collections.sort(stuList, com);
		
		System.out.println(stuList);
	}

}
