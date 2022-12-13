package com.jdc.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferStream {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File("copy.txt")))) {
			
			String i;
			
			while((i = br.readLine()) != null) {
				bw.write(i + "\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
