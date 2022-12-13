package com.jdc.se5;

public class VarArgsDemo {
	
	// called variable argument
	// only used in method parameter
	// 0 or more
	// varargs used in method parameter only once
	// varargs must be last list of method parameter
	
	public static void main(String[] args) {
		showItem();
		showItem("");
		showItem("", "");
		showItem("", "", "");
		
		getArray(new int[10]);
		
		showVar(10.9);
		
		
	}
	
	static void showItem(String... arg) {
		System.out.println(arg[0]);
	}
	
	static void getArray(int[] arr) {}
	
	static void showVar(double d, int... arr) {
		
	}

}
