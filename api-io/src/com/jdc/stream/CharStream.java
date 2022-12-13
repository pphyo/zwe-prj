package com.jdc.stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharStream {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader(new File("countdown.mp4"));
				FileWriter fw = new FileWriter(new File("copy.mp4"))) {
			
			int b;
			
			while((b = fr.read()) != -1) {
				fw.write(b);
			}
			
			System.out.println("Terminate");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
