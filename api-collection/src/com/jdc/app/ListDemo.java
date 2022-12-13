package com.jdc.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
	
		// add, update, remove, retrieve
		
		List<Integer> arrList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		Collections.addAll(arrList, 3, 6, 4, 9, 7, 5, 2, 1);
		linkedList.addAll(arrList);
		
		arrList.add(7);
		arrList.add(2, 22);
//		arrList.add(null);
		
		for(int i : arrList) {
			System.out.println(i);
		}
		
		System.out.println(arrList.set(2, 11));
		
		System.out.println(arrList);
		System.out.println(linkedList);
		
		List<String> strList = List.of("z", "y", "a", "w", "h", "o", "c");//Arrays.asList("z", "y", "a", "w", "h", "o", "c");
		
//		strList.add("p");
//		strList.remove("y");
//		Collections.sort(strList);
		strList.set(2, "b");
		System.out.println(strList);

	}

}
