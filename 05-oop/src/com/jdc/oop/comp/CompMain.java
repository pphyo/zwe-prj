package com.jdc.oop.comp;

public class CompMain {

	public static void main(String[] args) {
		
		Bathroom bt = new Bathroom();
		
//		Shower sh = new Shower();
//		sh.setBrand("USA");
//		sh.setType("Steel");
//		sh.getBrand();
		
		bt.setShower(new Shower("USA", "Steel"));
		
		bt.bath();
		
		System.out.println(bt.getShower().getType());

	}

}
