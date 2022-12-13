package com.jdc.oop.inter;

public interface MyInterface {
	
	// (public, abstract) ==> default access
	
	int i = 20; // public static final int i = 20;
	
	void go(); // public abstract void go(); static method, default method, private method
	
	// SE 8
	static void stMethod() {
		
	}
	
	// public instance
	default void defMethod() {
		priMethod();
	}
	
	private void priMethod() {
		
	}

}
