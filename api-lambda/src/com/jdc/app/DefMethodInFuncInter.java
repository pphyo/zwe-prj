package com.jdc.app;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DefMethodInFuncInter {

	public static void main(String[] args) {
		
		Consumer<String> con = s -> System.out.println(s);
		
		Consumer<String> after = i -> System.out.println(i.concat(" after"));
		
		con.andThen(after).andThen(i -> System.out.println(i.substring(9))).accept("Original Consumer");

		System.out.println();
		
		Function<Integer, Integer> twice = i -> i * 2;
		Function<Integer, Integer> doub = i -> i * i;
		
		Integer result = twice.compose(doub).andThen(twice).apply(4);
		
		System.out.println(result);
		
		Predicate<Integer> isEven = i -> i % 2 == 0;
		Predicate<Integer> isGreaterThan = i -> i > 100;
		
		System.out.println(isEven.or(isGreaterThan).test(51));
		
	}

}
