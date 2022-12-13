package com.jdc.oop.nest;

public class Reloader {
	
	
	
	static class NestedStatic {
		public void run() {
			System.out.println("static run()");
		}
	}
	
	class NestedInner {
		public void run() {
			System.out.println("inner run()");
		}
	}
	
}
