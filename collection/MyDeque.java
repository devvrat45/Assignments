package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyDeque {

	public static  void main(String[] args) {
		Deque<Integer>  deque = new ArrayDeque<Integer>();
		deque.add(10);
		deque.add(20);
		deque.add(40);
		deque.add(30);
		deque.addFirst(99);
		System.out.println(deque.peek());
		deque.pop();
		System.out.println(deque.peek());
		deque.addLast(45);
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		if(deque.isEmpty()) {
			System.out.println("EMPTY");
		}
		else {
			System.out.println("NOT EMPTY");
		}
		
		for (Integer d: deque ) {
			System.out.println(d);
		}
		
		
	}
}
