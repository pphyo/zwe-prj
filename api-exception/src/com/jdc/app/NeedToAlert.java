package com.jdc.app;

public class NeedToAlert extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NeedToAlert(String message) {
		super(message);
	}
	
}
