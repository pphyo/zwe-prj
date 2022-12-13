package com.jdc.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterableDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "Aung", "Zaw", "Ko", "Mg", "Kyaw", "Ni");

//		for(String str : list) {
//			if(str.startsWith("A")) // Error
//				list.remove(str);
//		}
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.startsWith("K"))
				itr.remove();
		}
		
		System.out.println(list);
	}

}
