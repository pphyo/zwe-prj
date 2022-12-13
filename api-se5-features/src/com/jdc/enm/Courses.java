package com.jdc.enm;

public enum Courses {
	
	JavaSE("Java Standard Edition", 200_000),
	JavaEE("Java Enterprise Edition", 400_000),
	Spring("Spring Framework", 400_000),
	Angular("Angular Framework", 400_000);
	
	private String name;
	private int fee;
	
	private Courses(String name, int fee) {
		this.name = name;
		this.fee = fee;
	}
	
	public String getName() {
		return name;
	}
	
	public int getFee() {
		return fee;
	}

}
