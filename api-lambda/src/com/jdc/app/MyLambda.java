package com.jdc.app;

public class MyLambda {
	
	public static void main(String[] args) {
		
		//() -> {}
		Writable wri = str -> System.out.println(str);
		
		wri.write("Mg Mg");
		
		Calculable cal = (a, b) -> a + b;
		
		System.out.println(cal.add(10, 20));
				
		int i = 2;
		
		Calculable sub = new Calculable() {
			@Override
			public int add(int a, int b) {
				return a > b ? (a - b) * i : (b - a) * i;
			}
		};
		
		System.out.println(sub.add(10, 20));
		
	}

}

@FunctionalInterface
interface Writable {
	void write(String str);
}

@FunctionalInterface
interface Calculable {
	int add(int num1, int num2);
}