package com.jdc.app;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamCreation {
	
	public static void main(String[] args) {
		
		int[] intArr = {20, -3, 59, 11, 2, 32, 55, 70, 6};
		
		IntStream stream = Arrays.stream(intArr);
		
		long count = stream.filter(i -> i <= 50).peek(System.out::println)
			  .sorted().peek(System.out::println).skip(1).limit(5).count();
		
		System.out.println(count);
	}

}
