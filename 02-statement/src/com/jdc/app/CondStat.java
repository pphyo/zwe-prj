package com.jdc.app;

public class CondStat {

	public static void main(String[] args) {
		
		int i = 11;
		
//		if(i < 10) {
//			
//			System.out.println("I is less than ten.");
//			
//		} else {
//			
//			System.out.println("I is greater than ten.");
//			
//		}
		
//		System.out.println("Program Terminated");
		
		if(i < 10) {
			System.out.println("I is less than ten.");
		} else if(i > 10) {
			System.out.println("I is greater than ten.");
		} else {
			System.out.println("I is equal to ten.");
		}
			
		System.out.println('a' + 0);
		
		switch (i) {
			case 1:
			case 2:
			case 3:
				System.out.println("Small number");
				break;
			case 7:
			case 8:
			case 10:
				System.out.println("Large number");
				break;
			default:
				System.out.println("Wrong Number");
				break;
		}
		
	}

}
