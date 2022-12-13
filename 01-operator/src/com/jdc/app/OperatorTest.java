package com.jdc.app;

public class OperatorTest {

	public static void main(String[] args) {
		
		int i = 10; // i++ post, ++i pre
		
		i = i + 40;
		
		System.out.println(getInt());
		
		System.out.println(i + 4);

	}
	
	public static int getInt() {
		return 0;
	}

}
