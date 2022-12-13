package com.jdc.app;

public class Bucket<T> {

	private T data;
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + data.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
	
	public static void main(String[] args) {
		Bucket<String> buc = new Bucket<>();
		buc.setData("Mg Mg");
		buc.inspect(20);
	}
	
}

class A {}

class B extends A {}

class C extends B {}

class D extends C {}