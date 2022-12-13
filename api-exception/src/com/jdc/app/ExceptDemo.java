package com.jdc.app;

import java.util.Scanner;

public class ExceptDemo {

	public static void main(String[] args) {
		
//		System.out.println("Start program...");
		
		
		try(Scanner sc = new Scanner(System.in)) {
			
			new ExceptDemo().makeObj();
			
		} catch(ArithmeticException e) {
			
		} catch(NullPointerException e) {
			
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("no clone.");
		} catch(Exception e) {
			e.printStackTrace();
		}
//		System.out.println("Terminate program...");
		
		try {
			
		} catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException e) {
			
		}

	}
	
	static void methodOne() {
		methodTwo();
	}
	
	static void methodTwo() {
		methodThree();
	}
	
	static void methodThree() {
		methodFour();
	}
	
	static void methodFour() {
		System.out.println(3 / 0);
	}
	
	ExceptDemo makeObj() throws CloneNotSupportedException {
		ExceptDemo obj = (ExceptDemo)clone();
		return obj;
	}

}
