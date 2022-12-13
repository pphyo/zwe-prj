package com.jdc.oop.abrst;

public class Rectangle extends Shape {
	
	public Rectangle(double width, double height) {
		super(width, height);
	}

	@Override
	public void showArea() {
		double area = getWidth() * getHeight();
		
		System.out.println("Rectangle area: " + area);
	}
	
}
