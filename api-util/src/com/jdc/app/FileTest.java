package com.jdc.app;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		
		File parent = new File("C:\\tmp\\app");
		
		File file = new File(parent, "..\\bin\\test.txt");
		
		File f = new File("demo.txt");
		
		try {
//			if(!file.exists())
//				file.createNewFile();			
			
			System.out.println(file.exists());
			System.out.println(file.getCanonicalPath());
			System.out.println();
//			file.deleteOnExit();
			
			System.out.println(f.getAbsolutePath());
			
			f.renameTo(new File("copy.txt"));
			
			System.out.println();
			
			showFiles(new File("D:"));
			
			System.out.println("Terminate");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	static void showFiles(File file) {
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			
			for(File f : files) {
				System.out.println(f.getName());
			}
		}
	}

}
