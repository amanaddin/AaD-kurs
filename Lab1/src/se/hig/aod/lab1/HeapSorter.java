package se.hig.aod.lab1;

import java.util.ArrayList;
import java.util.List;

public class HeapSorter {
	
	public static <T extends Comparable<? super T>> List<T> sort(List<T> inputList) { 
		int index = inputList.size();
		HeapPriorityQueue<T> h = new HeapPriorityQueue<>(index);
		for(T list: inputList) {
			h.enqueue(list);
		}
		List <T>sortedList = new ArrayList<>();
		while(!h.isEmpty()) {
			sortedList.add(h.dequeue());
		}
			return sortedList; 
		}
	
	
	public static void main(String[] args) {
		HeapSorter h = new HeapSorter();
		List<Integer> l = new ArrayList<>();
		l.add(60);
		l.add(1);
		l.add(5);
		l.add(21);
		System.out.print("unsorted Lista: ");
		for(int b: l) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("sorted List: "+ HeapSorter.sort(l));
	}
}
