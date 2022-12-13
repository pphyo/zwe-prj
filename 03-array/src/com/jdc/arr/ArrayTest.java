package com.jdc.arr;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] intArr = {10, 6, 3, -10, 22, 7, 8};
		
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < intArr.length; i++) {
			if(intArr[i] > max)
				max = intArr[i];
//			else
//				min = intArr[i];
			
			if(intArr[i] < min)
				min = intArr[i];
		}
		
		System.out.println(max);
		System.out.println(min);

	}

}
