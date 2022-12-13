package com.jdc.oop.over;

public class Vehicle extends Machine {

	public int i = 50;
	
	public void move() {
		System.out.println("Vehicle moving...");
	}
	
	// needs to override
	// must instance method
	// must inheritance
	
	// must same return type
	// must same method name
	// must same parameter list
	// instance method only
	
	// non override rules
	// 1. private method
	// 2. final method
	// 3. static method
	// access modifier doesn't narrow from super class's method access modifier
	
	@Override
	public void start() {
		System.out.println("Vehicle started... " + i);
	}
	
}
