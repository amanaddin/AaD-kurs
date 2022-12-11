package algorithms;

import java.util.List;

public class BubbelSort <T extends Comparable<? super T>> implements Sorter<T> {

	@SuppressWarnings("unchecked")
	@Override
	public void sort(List<T> list) {
		
		boolean swaped = true;
		T []array  = (T[]) new Comparable[list.size()];
		array = list.toArray(array);
		
		while(swaped) {
			swaped = false;
			for(int i =0; i<array.length-1; i++) {
				if(array[i].compareTo(array[i+1]) > 0) {
					swap(array, i, i+1);
					swaped = true;
				}
			}
		}
		list.clear();
		for(T arr: array) {
			list.add(arr);
		}
		
	}
	public void swap(T [] data, int first, int second) {
		T temp = data[first];
		data[first] = data[second];
		data[second] =  temp;
		
	}
	@Override
	public String toString() {
		return "BubbelSort";
	}

}
