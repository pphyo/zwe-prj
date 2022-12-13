package com.jdc.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 200);
		map.put("Banana", 100);
		map.put("Orange", 150);
		map.put("Apple", 400);
		map.put("Pineapple", 400);
		
		System.out.println(map.get(""));
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		Set<Entry<String, Integer>> entrySet= map.entrySet();
		
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
