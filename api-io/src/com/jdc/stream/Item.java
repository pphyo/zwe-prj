package com.jdc.stream;

import java.io.Serializable;

public class Item implements Serializable {

	private static final long serialVersionUID = 14398939;
	
	private String name;
	private int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}

}
