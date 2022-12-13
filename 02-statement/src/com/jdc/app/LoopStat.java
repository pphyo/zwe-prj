package com.jdc.app;

import java.util.Scanner;

public class LoopStat {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		doWhileLoop();

		sc.close();
	}
	
	static void doWhileLoop() {

		int code = getInt();
		
		do {
			System.out.println(code);
			
			code = getInt();
		} while(code != 0);
		
	}
	
	static void whileLoop() {
		
		int code = getInt();
		
		while(code != 0) {
			System.out.println(code);
			
			code = getInt();
		}
		
	}
	
	static void forLoop() {
		for(int i = 0; i < 9; i++) {
			
			System.out.println(i + ". A Ran Han");

		}
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	static int getInt() {
		System.out.println("Enter 0 for stop: ");
		return sc.nextInt();
	}

}
