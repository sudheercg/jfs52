package com.codegnan.collectionsframework.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<>();

		// add elements at the rear
		deque.addLast(1);
		deque.addLast(2);
		deque.addLast(3);

		System.out.println("Deque elements: " + deque);

		System.out.println("Removed element: " + deque.removeFirst());

		deque.addFirst(99);
		deque.addLast(88);
		
		System.out.println("Deque elements: " + deque);
		
		System.out.println("First element: "+deque.peekFirst());
		System.out.println("Last element: "+deque.peekLast());

	}
}
