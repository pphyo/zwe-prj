package com.jdc.se5;

public class BoxingDemo {
	
	public static int data = 200;

	public static void main(String[] args) {
		
		Integer objVar = 10;
		
		int priVar = 50;
		
		objVar = priVar;
		
		priVar = objVar;
		
		System.out.println(objVar);


	}
	
	static int getInt() {
		return 100;
	}

}
