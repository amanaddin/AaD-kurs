package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbelSort <T extends Comparable<? super T>> implements Sorter<T> {

	@Override
	public void sort(List<T> list) {
		
		boolean swaped = true;
		
		while(swaped) {
			swaped = false;
			for(int i =0; i<list.size()-1; i++) {
				if(list.get(i).compareTo(list.get(i+1)) > 0) {
					swap(list, i, i+1);
					swaped = true;
				}
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
		return "BubbelSort";
	}
	
	public static void main(String[] args) {
		BubbelSort<Integer> i = new BubbelSort<Integer>();
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
