package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class InsertionSort <T extends Comparable<? super T>> implements Sorter<T>{

	@Override
	public void sort(List<T> list) {
		insertionSortWorker(list, 0, list.size());
	}
	private void insertionSortWorker (List<T> data, int low, int high) { 
	    for (int i = low + 1; i < high; i++) { 
	        for (int k = i; k >= low + 1; k--) { 
				  if (data.get(k).compareTo(data.get(k-1)) < 0) 
					  swap (data, k, k -1);  
	        } 
	    }  
	} 
	
	public void swap(List<T> data, int first, int second) {
		T temp = data.get(first);
		data.set(first, data.get(second));
		data.set(second, temp);
		
	}
	@Override
	public String toString() {
		return "InsertionSort";
	}
	
	public static void main(String[] args) {
		InsertionSort<Integer> i = new InsertionSort<Integer>();
		List<Integer> r = new ArrayList<>();
		Random rand = new Random();
		
		for(int b =0; b < 20; b++) {
			int s = rand.nextInt(20);
			r.add(s);
		}
		for (int s: r) {
			System.out.print(s+ " ");
		}
		
		i.sort(r);
		System.out.println();
		
		for (int s: r) {
			System.out.print(s+ " ");
		}

	}

}
