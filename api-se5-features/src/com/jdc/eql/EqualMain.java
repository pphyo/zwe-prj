package com.jdc.eql;

public class EqualMain {

	public static void main(String[] args) {
		
		Person p1 = new Person("Mg Mg", 13);
		Person p2 = new Person("Mg Mg", 13);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		String s1 = new String("Mg Mg");
		String s2 = new String("Mg Mg");
		
		System.out.println();
		System.out.println("Equal Ope: " + (s1 == s2));
		System.out.println("Method: " + s1.equals(s2));
		
	}
	
}
