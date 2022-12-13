package com.jdc.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class ObjectStream {

	private List<Item> list = Arrays.asList(
									new Item("Beer", 2000),
									new Item("Sea Weed", 800),
									new Item("Burn", 900),
									new Item("Burger", 2000)
									);

	
	public static void main(String[] args) {
		ObjectStream obj = new ObjectStream();
		
		obj.writeList();
		obj.readList();
	}
	
	@SuppressWarnings("unchecked")
	void readList() {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("items.ser"))) {
			
			List<Item> items = (List<Item>)in.readObject();
			
			System.out.println(items);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void writeList() {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("items.ser"))) {
			out.writeObject(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
