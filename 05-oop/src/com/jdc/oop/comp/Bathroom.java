package com.jdc.oop.comp;

public class Bathroom {
	
	private Shower shower; // new Shower()
	
	public void setShower(Shower shower) {
		this.shower = shower;
	}
	
	public Shower getShower() {
		return shower;
	}
	
	public void bath() {
		shower.takeshower();
	}
	
}
