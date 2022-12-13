package com.jdc.oop.comp;

public class Shower {

	private String brand;
	private String type;

	public Shower() {
		
	}
	
	public Shower(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public void takeshower() {
		System.out.println("Shower taking...");
	}

}
