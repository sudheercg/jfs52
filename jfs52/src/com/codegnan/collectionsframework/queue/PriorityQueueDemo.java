package com.codegnan.collectionsframework.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	
	
	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(30);
		pq.offer(10);//highest priority
		pq.offer(15);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		
		
		
	}

}
