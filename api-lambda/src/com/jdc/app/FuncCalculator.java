package com.jdc.app;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FuncCalculator {

	public static void main(String[] args) {
		
		Function<Operator, BiFunction<Integer, Integer, Integer>> func = ope -> calculate(ope);
		
		BiFunction<Integer, Integer, Integer> bi = func.apply(Operator.SUB);
		
		Integer result = bi.apply(10, 12);
		
		System.out.println("Result: " + result);
		
		System.out.println(getInt(getInt(40)));
		
	}
	
	static int getInt(int num) {
		return 100 - num;
	}
		
	static BiFunction<Integer, Integer, Integer> calculate(Operator ope) {
		
		BiFunction<Integer, Integer, Integer> biFunc = null;
		
		switch(ope) {
			case ADD:
				biFunc = (a, b) -> a + b;
				break;
			case SUB:
				biFunc = (a, b) -> a - b;
				break;
			case MUL:
				biFunc = (a, b) -> a * b;
				break;
			case DIV:
				biFunc = (a, b) -> a / b;
			case MOD:
				biFunc = (a, b) -> a % b;
		}
		
		return biFunc;
	}
	
	enum Operator {
		ADD, SUB, MUL, DIV, MOD
	}
	
}
