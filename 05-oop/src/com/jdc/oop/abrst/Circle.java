package com.jdc.oop.abrst;

public class Circle extends Shape {

	public Circle(int radius) {
		super(radius, 0);
	}
	
	@Override
	public void showArea() {
		double area = Math.PI * getWidth() * getWidth();
		
		double round = Math.round(area * 1000.0) / 1000.0;
		
		System.out.println("Circle area: " + round);
	}
	
}
