package com.jdc.oop.over;

public class OverMain {

	public static void main(String[] args) {
		
//		Car car = new Car();
//		Train train = null;
		
		Vehicle veh = new Vehicle(); // direct child to machine
		
		Machine mac = new Car(); // Base
		
		// compile time data type
		// runtime real object
		
//		Machine mac = new Vehicle();
//		mac.start();
		
//		veh = mac;

		mac = veh; // (UpCasting // Implicit Casting)
		
		// instanceof
		
		if(mac instanceof Train) {
			Train train = (Train) mac; // (DownCasting // Explicit Casting)
			
			train.move();
		}
		
		System.out.println("Terminated..");
	}

}
