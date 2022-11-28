package se.hig.aod.lab1;

public class Main {

	public static void main(String[] args) {
		Integer[] INT_FIXTURE = {21, 2, 3, 1, 99, 100};
		HeapPriorityQueue<Integer> h = new HeapPriorityQueue<>(6);

		/*
		 * for (int testData : INT_FIXTURE) { h.enqueue(testData); }
		 */
		
		h.enqueue(12);
		h.enqueue(11);
		h.enqueue(1);
		h.enqueue(20);
		h.enqueue(3);
		h.enqueue(200);
		System.out.println(h.toString());
		System.out.println(h.dequeue());
		System.out.println(h.dequeue());
	}
	
}
