package com.jdc.single;

public class Person {

	private static Person INSTANCE;
	
	// limit to constructor
	private Person() {
		
	}
	
	public static Person getInstance() {
		if(null == INSTANCE)
			INSTANCE = new Person();
		return INSTANCE;
	}
	
}
