package com.jdc.oop.abrst;

public class Square extends Shape {

	public Square(double width) {
		super(width, width);
	}
	
	@Override
	public void showArea() {
		double area = getWidth() * getWidth();
		
		System.out.println("Square area: " + area);
	}
	
}
