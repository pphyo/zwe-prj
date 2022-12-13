package com.jdc.oop.ol;

// is in same class
// must same method name
// should same return type
// must different parameter list (Datatype)

public class OverLoadMain {

	public static void main(String[] args) {
		
		add((byte)10);
		
		add(1000.9f);

	}
	
	static void add(byte b) {
		System.out.println("byte");
	}
	
	static void add(short s) {
		System.out.println("short");
	}
	
	static void add(int i) {
		System.out.println("int");
	}
	
	static void add(long l) {
		System.out.println("long");
		add(30);
	}
	
	static void add(float f) {
		System.out.println("float");
	}
	
	static void add(double d) {
		System.out.println("double");
	}
	
	static void add(int a, int b) {}
	
	static void add(int a, double b) {}
	
	static void add(double a, int b) {}

}
