package com.jdc.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {

	public static void main(String[] args) {
		
		try(FileInputStream fi = new FileInputStream(new File("countdown.mp4"));
				FileOutputStream fo = new FileOutputStream(new File("copy.mp4"))) {
			
			int i = 0;
			
			while((i = fi.read()) != -1) {
				fo.write(i);
				System.out.print(i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
