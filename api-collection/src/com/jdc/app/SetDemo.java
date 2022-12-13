package com.jdc.app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		
//		Set<Integer> set = Set.of(1, 7, 44, 4, 5,6 );//Collections.unmodifiableSet(hashSet);
//		
//		Collections.sort(set);
		
		for(int i = 10; i > 0; i--) {
			hashSet.add(i);
			treeSet.add(i);
			linkedHashSet.add(i);
		}
		
		hashSet.add(null);
//		treeSet.add(null);
		linkedHashSet.add(null);
		
		System.out.println(hashSet.isEmpty());
		
		System.out.println(hashSet);
		System.out.println(treeSet);
		System.out.println(linkedHashSet);
		
	}

}
