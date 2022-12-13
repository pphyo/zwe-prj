package com.jdc.branch;

// return
// break => switch, loop
// continue

public class BranchingStat {

	public static void main(String[] args) {

//		checkString("Hello");
		
		showNumber(10);

	}

	static void checkString(String data) {
		
		if(null == data) {
			return;
		}
		
		System.out.println(data);
		
	}
	
	static void showNumber(int number) {
		
		for(int i = 0; i < number; i++) {
			if(i % 2 == 0)
				continue;
			
			System.out.println(i);
		}

		System.out.println("Program Terminated...");
	}
	
}
