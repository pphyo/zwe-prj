package com.jdc.build;

public class BuilderMain {

	// bypass from constructor limit
	
	public static void main(String[] args) {
		
		CarBuilder cb = new CarBuilder();
		
		Car car = cb.createCar()
					.addHp(9.0)
					.addBrand("Honda")
					.build();
		
		System.out.println(car.getBrand());

	}

}
