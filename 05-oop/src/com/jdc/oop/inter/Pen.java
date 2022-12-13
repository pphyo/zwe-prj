package com.jdc.oop.inter;

// contract

// Pen is a Object
// Pen is a Writable
// Pen is a MyInterface

public class Pen implements Writable, MyInterface {

	@Override
	public void write() {
		System.out.println("Pen writes.");
	}

	@Override
	public void go() {

		
	}

}
