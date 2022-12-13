package com.jdc.app.util;

import java.util.Scanner;

public class CommonUtil {
	
	private static Scanner sc = new Scanner(System.in);
	
	private CommonUtil() {
	}
	
	public static boolean isEmpty(String data) {
		return null == data || data.isEmpty() || data.isBlank();
	}
	
	public static void printHeaderFooter(String message) {
		String line = "";
		
		for(int i = 0; i < message.length(); i++)
			line += "*";
		
		System.out.println("**".concat(line).concat("**"));
		System.out.println("* ".concat(message).concat(" *"));
		System.out.println("**".concat(line).concat("**"));
	}
	
	public static<T> void setOrder(T[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + ". " + arr[i]);
		}
	}
	
	public static String getString(String message) {
		System.out.print(message);
		return sc.nextLine();
	}
	
	public static int getInt(String message) {
		return Integer.parseInt(getString(message));
	}
	
	public static Scanner getSc() {
		return sc;
	}
	
}
