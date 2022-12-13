package com.jdc.app;

public class MyExcept {

	public static void main(String[] args) {
		
		connect(0);

	}
	
	static void connect(int code) {
		
		if(code == 0) {
			throw new NeedToAlert("Network error");
		} else if(code == 1) {
			System.out.println("Connected...");
		}
		
	}

}
