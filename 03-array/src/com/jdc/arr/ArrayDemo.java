package com.jdc.arr;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] intArr = new int[5];
		
		intArr[0] = 10;
		intArr[4] = 50;
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

//		System.out.println(Arrays.toString(intArr));
		
	}

}
