package com.jdc.app;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncInterTest {

	public static void main(String[] args) {
		
		Consumer<String> con = System.out::println; // a -> System.out.println(a);
		con.accept("This is a consumer interface sample");
		
		Function<Integer, String> func = i -> String.valueOf(i);
		System.out.println(func.apply(20));
		
		Supplier<String> sup = () -> "Hello spplier";
		System.out.println(sup.get());
		
		Predicate<Integer> pred = i -> i > 10;
		System.out.println(pred.test(20));
		
		BiConsumer<String, String> biCon = (a, b) -> System.out.println(a + b);
		biCon.accept("Hello ", "Bi Consumer");
		
		BiFunction<String, Integer, String> biFunc = (s, i) -> s + i; 
		System.out.println(biFunc.apply("20", 10));
		
	}

}