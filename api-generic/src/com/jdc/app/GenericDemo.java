package com.jdc.app;

public class GenericDemo {

	public static void main(String[] args) {
		
//		Object[] objArr = new Object[5];
//		objArr[0] = "Mg Mg";
//		objArr[1] = new Bucket();
//		objArr[2] = 20;
//		
//		for(Object obj : objArr) {
//			String s = (String)obj;
//			System.out.println(s);
//		}
		
		Bucket<? super Integer> buc = new Bucket<>();
		buc.setData(100);
		
		System.out.println(buc.getData());
		
		Pair<String, String> p1 = new OrderPair<String, String>("Myanmar", "Naypyidaw");
		Pair<String, String> p2 = new OrderPair<String, String>("Myanmar", "Naypyidaw");
		
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());
		
		System.out.println(compare(p1, p2));
		
	}
	
	static <T, S> boolean compare(Pair<T, S> p1, Pair<T, S> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
	
}
