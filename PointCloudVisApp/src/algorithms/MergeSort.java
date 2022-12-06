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

	private void merge(List<T> leftList, List<T> rightList, List<T> list) {
		int leftIndex = 0;
		int rightIndex = 0;
		int index = 0;
		while (leftIndex < leftList.size() && rightIndex < rightList.size()) {
			if (leftList.get(leftIndex).compareTo(rightList.get(rightIndex)) < 0) {
				list.set(index++, leftList.get(leftIndex++));
			} else {
				list.set(index++, rightList.get(rightIndex++));
			}
		}
		while (leftIndex < leftList.size()) {
			list.set(index++, leftList.get(leftIndex++));
		}
		while (rightIndex < rightList.size()) {
			list.set(index++, rightList.get(rightIndex++));
		}

	}
	@Override
	public String toString() {
		return "MergeSort";
	}
}
