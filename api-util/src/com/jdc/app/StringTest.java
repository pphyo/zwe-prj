package com.jdc.app;

import java.time.LocalDate;

public class StringTest {
	
	public static void main(String[] args) {
		
//		StringBuilder str = new StringBuilder();
//		
//		str.append("Hi"); // (16 + 1) * 2 -> (34 + 1) * 2
//		str.append("Mg Mg");
//		str.append("Ko Ko");
//		
//		System.out.println(str);
		
		LocalDate now = LocalDate.of(2022, 3, 18);
		
		System.out.println(now.getYear());
		
		System.out.println('\u27BC' + 0);
		
	}

}
