package com.jdc.app;

public class MathTest {

	public static void main(String[] args) {
		
		double d = 345.5278;
		
		var round = Math.round(d * 100) / 100.0;
		
		System.out.println(round);

	}

}
