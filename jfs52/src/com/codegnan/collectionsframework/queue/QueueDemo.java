package com.codegnan.collectionsframework.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		
		
		//FIFO
		Queue<Integer> queue = new LinkedList();
		
		//queue.add(100);
		queue.offer(100);//head
		//queue.add(200);
		queue.offer(200);
		queue.offer(300);//tail
		
		System.out.println("Before Poll: "+queue);

		//poll(): Remove element from the queu. 
		System.out.println("Polled: "+queue.poll());
		
		
		System.out.println("After Poll: "+queue);
		
		System.out.println("Peek: "+ queue.peek());
		
		System.out.println("Queue Size: "+ queue.size());
		
		System.out.println("Is Empty? : "+ queue.isEmpty());
		
		
		
	}

}
