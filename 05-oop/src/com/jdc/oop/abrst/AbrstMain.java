package com.jdc.oop.abrst;

public class AbrstMain {

	public static void main(String[] args) {
		
		Shape rect = new Rectangle(20, 10);
		
		rect.showArea();
		
		Shape sqr = new Square(15);
		
		sqr.showArea();
		
		Shape tria = new Shape(10, 10) {
			@Override
			public void showArea() {
				System.out.println("Traingle are: " + (getWidth() * getHeight()) / 2);				
			}
		};
		
		tria.showArea();
		
		Shape circle = new Circle(4);
		circle.showArea();

	}

}
