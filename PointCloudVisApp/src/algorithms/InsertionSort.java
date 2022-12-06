package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class InsertionSort <T extends Comparable<? super T>> implements Sorter<T>{

	@SuppressWarnings("unchecked")
	@Override
	public void sort(List<T> list) {
		T [] array  = (T[]) new Comparable[list.size()];
		array = list.toArray(array);
		insertionSortWorker(array, 0, list.size());
		 list.clear();
			for(T arr: array) {
				list.add(arr);
			}
	}
	private void insertionSortWorker (T []data, int low, int high) { 
		
	    for (int i = low + 1; i < high; i++) { 
	        for (int k = i; k >= low + 1; k--) { 
				  if (data[k].compareTo(data[k-1]) < 0) 
					  swap (data, k, k -1);  
	        } 
	    }
	} 
	
	public void swap(T []data, int first, int second) {
		T temp = data[first];
		data[first] = data[second];
		data[second] = temp;
		
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
