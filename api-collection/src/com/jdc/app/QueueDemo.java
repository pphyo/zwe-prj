package com.jdc.app;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			que.offer(i);
		}
		
//		que.add(null);
		
//		while(!que.isEmpty()) {
//			System.out.println(que.poll());
//			Thread.sleep(1000);
//		}

		for(int i = 0; i < que.size(); i++)
			System.out.println(que.peek());
		
	}

}
