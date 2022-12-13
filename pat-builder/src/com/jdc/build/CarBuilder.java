package com.jdc.build;

public class CarBuilder {
	
	private Car car;
	
	public CarBuilder createCar() {
		car = new Car();
		return this;
	}
	
	public CarBuilder addBrand(String brand) {
		car.setBrand(brand);
		return this;
	}
	
	public CarBuilder addModel(String model) {
		car.setModel(model);
		return this;
	}
	
	public CarBuilder addDoor(int door) {
		car.setDoor(door);
		return this;
	}
	
	public CarBuilder addHp(double hp) {
		car.setHp(hp);
		return this;
	}
	
	public Car build() {
		return car;
	}

}