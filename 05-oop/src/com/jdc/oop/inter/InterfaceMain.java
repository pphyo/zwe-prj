package com.jdc.oop.inter;

public class InterfaceMain {

	// anonymous class
	// its implementation class
	// lambda
	
	public static void main(String[] args) {
		
		Writable pen = new Pencil();
		pen.write();
		
	}

}

interface A {} interface B {}

interface SuperInter {
	static void supSta() {
		
	}
	
	default void supDef() {
		
	}
}

interface SubInter extends SuperInter, A, B {
	static void subSta() {
		// in interface static method does not inheritance
		SuperInter.supSta();
	}
	
	@Override
	default void supDef() {
		SuperInter.super.supDef();
	}
}