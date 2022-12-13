package com.jdc.app;

import java.util.Arrays;
import java.util.List;

public class RefObj {
	
	public RefObj(int a) {
		System.out.println(a * 2);
	}
	
	public static void main(String[] args) {
		new RefObj(10).run();
	}
	
	public void run() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list.forEach(RefObj::new);
	}
	
	void instMakeTwice(int a) {
		System.out.println(a * 2);
	}
	
	static void statMakeTwice(int a) {
		System.out.println(a * 2);
	}
}
