package com.jdc.app;

import java.io.File;

public class DriveSpace {

	public static void main(String[] args) {
		
		File file = new File("copy.txt");
		
		int free = convert(file.getFreeSpace());
		int total = convert(file.getTotalSpace());
		
		System.out.println(free);
		System.out.println(total);
		System.out.println(total - free);

	}
	
	private static int convert(long data) {
		return (int)(data / 1024 / 1024 / 1024);
	}

	static void convert() {}
	
}
