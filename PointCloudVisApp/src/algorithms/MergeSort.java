package algorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T extends Comparable<? super T>> implements Sorter<T> {

	@Override
	public void sort(List<T> list) {
		int length = list.size();
		if (length < 2) {
			return;
		}

		List<T> leftList = new ArrayList<>(list.subList(0, length / 2));
		List<T> rightList = new ArrayList<>(list.subList(length / 2, length));
		sort(leftList);
		sort(rightList);
		merge(leftList, rightList, list);

	}

	@SuppressWarnings("unchecked")
	private void merge(List<T> leftList, List<T> rightList, List<T> list) {
		T[] array = (T[]) new Comparable[list.size()];
		T[] leftArray = (T[]) new Comparable[leftList.size()];
		T[] rightArray = (T[]) new Comparable[rightList.size()];
		leftArray = leftList.toArray(leftArray);
		rightArray = rightList.toArray(rightArray);
		array = list.toArray(array);
		int leftIndex = 0;
		int rightIndex = 0;
		int index = 0;

		while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
			if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) < 0) {
				array[index++] = leftArray[leftIndex++];
			} else {
				array[index++] = rightArray[rightIndex++];
			}
		}
		while (leftIndex < leftArray.length) {
			array[index++] = leftArray[leftIndex++];
		}
		while (rightIndex < rightArray.length) {
			array[index++] = rightArray[rightIndex++];
		}
		list.clear();
		for (T arr : array) {
			list.add(arr);
		}

	}

	@Override
	public String toString() {
		return "MergeSort";
	}

}
