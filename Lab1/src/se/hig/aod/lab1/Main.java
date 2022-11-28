package se.hig.aod.lab1;

public class Main {

	public static void main(String[] args) {
		
		HeapPriorityQueue<Integer> h = new HeapPriorityQueue<>(5);
		h.enqueue(10);
		h.enqueue(20);
		h.enqueue(7);
		h.enqueue(5);
		h.enqueue(3);
		
		System.out.println(h.toString());
	}

}
