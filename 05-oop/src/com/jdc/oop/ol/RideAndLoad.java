package com.jdc.oop.ol;

public class RideAndLoad {

	public static void main(String[] args) {
		
		A a = new B();
		
		// override decides in runtime
		// overload decides in compile-time
		RideAndLoad ride = new RideAndLoad();
		ride.get(a);

	}
	
	public void get(A a) {
		System.out.println("a.run");
	}
	
	public void get(B b) {
		System.out.println("b.run");
	}

}

class A {
	public void run() {
		System.out.println("A version");
	}
}

class B extends A {
	@Override
	public void run() {
		System.out.println("B version");
	}
}