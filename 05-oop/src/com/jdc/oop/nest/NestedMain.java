package com.jdc.oop.nest;

public class NestedMain {

	public static void main(String[] args) {
		
		// static nested class
		Reloader.NestedStatic st = new Reloader.NestedStatic();
		st.run();
		
		Reloader reloader = new Reloader();
		
		Reloader.NestedInner in = reloader.new NestedInner();
		in.run();

	}

}
