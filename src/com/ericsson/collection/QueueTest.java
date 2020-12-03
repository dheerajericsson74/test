package com.ericsson.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueTest {

	public static void main(String[] args) {
	
		Deque<String> d = new ArrayDeque<>();

		d.push("One");
		d.push("Two");
		d.push("Three");
		d.push("Four");
		
		System.out.println(d);
		
		System.out.println("isEmpty -> "+d.isEmpty());
		
		System.out.println("peek() -> "+d.peek());
		System.out.println("@First -> "+d.getFirst());
		System.out.println("atLast - -> "+d.getLast());
		System.out.println("poll -> "+d.poll());
		System.out.println(d);
		d.push("Four");
		System.out.println("INIT again --> "+d);
		System.out.println("remove last -> "+d.removeLast());
		System.out.println(d);
		
		d.addLast("One");
		System.out.println("INIT again --> "+d);
		System.out.println("offer  -> "+d.offer("NEW"));
		System.out.println(d);
	}

}
